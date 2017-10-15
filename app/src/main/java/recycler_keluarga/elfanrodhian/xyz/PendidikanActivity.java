package recycler_keluarga.elfanrodhian.xyz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import recycler_keluarga.elfanrodhian.xyz.Adapter.PendidikanAdapter;
import recycler_keluarga.elfanrodhian.xyz.Model.Pendidikan;


public class PendidikanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PendidikanAdapter mAdapter;
    private List<Pendidikan> pendidikanList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendidikan);

        recyclerView = (RecyclerView) findViewById(R.id.listPendidikan);

        mAdapter = new PendidikanAdapter(pendidikanList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        preparePendidikanData();
    }

    private void preparePendidikanData() {
        Pendidikan pendidikan = new Pendidikan("TK", "TK Mekar Sari", "Ds. Sumberejo Kec. Trucuk Kab. Bojonegoro", 2002, R.drawable.tk);
        pendidikanList.add(pendidikan);
        pendidikan = new Pendidikan("SD", "SDN Trucuk 2 Bojonegoro", "Ds. Trucuk Kec. Trucuk Kab. Bojonegoro", 2008, R.drawable.sd);
        pendidikanList.add(pendidikan);
        pendidikan = new Pendidikan("SMP", "SMP Negeri 2 Bojonegoro", "Jl. Dr. Wahidin No. 80 Bojonegoro", 2011, R.drawable.smp);
        pendidikanList.add(pendidikan);
        pendidikan = new Pendidikan("SMA / SMK", "SMK Negeri 4 Bojonegoro", "Jl. Ahmad Yani No 50 Bojonegoro", 2014, R.drawable.smk);
        pendidikanList.add(pendidikan);
        pendidikan = new Pendidikan("D2", "AKN Bojonegoro", "Jl. Panglima Polim No. 50 Bojonegoro", 2016, R.drawable.kuliah1);
        pendidikanList.add(pendidikan);

        mAdapter.notifyDataSetChanged();

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {

            @Override
            public void onClick(View view, int position) {
                Pendidikan pendidikan = pendidikanList.get(position);
                Toast.makeText(getApplicationContext(), "Detail " + pendidikan.getNama_sekolah(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), DetailPendidikanActivity.class);
                i.putExtra("jenjang", pendidikan.getJenjang());
                i.putExtra("nama", pendidikan.getNama_sekolah());
                i.putExtra("alamat", pendidikan.getAlamat());
                i.putExtra("tahun", Integer.toString(pendidikan.getTahun()));
                i.putExtra("gambar", pendidikan.getGambar());
                startActivity(i);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
}
