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

import recycler_keluarga.elfanrodhian.xyz.Adapter.KeluargaAdapter;
import recycler_keluarga.elfanrodhian.xyz.Model.Keluarga;

public class KeluargaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter mAdapter;
    private List<Keluarga> keluargaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluarga);

        recyclerView = (RecyclerView) findViewById(R.id.listKeluarga);

        mAdapter = new KeluargaAdapter(keluargaList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareKeluargaData();
    }

    private void prepareKeluargaData() {
        Keluarga keluarga = new Keluarga("MAINARTO", "Ayah", "Bojonegoro, 02 Mei 1972", "Laki-laki", "Pegawai Swasta", R.drawable.bapak);
        keluargaList.add(keluarga);
        keluarga = new Keluarga("SRI REJEKI", "Ibu", "Bojonegoro, 03 Mei 1972", "Perempuan", "PNS", R.drawable.ibuk);
        keluargaList.add(keluarga);
        keluarga = new Keluarga("M. ELFA RODHIAN PUTRA", "Anak ke-1", "Bojonegoro, 24 Maret 1996", "Laki-laki", "Mahasiswa", R.drawable.elfan);
        keluargaList.add(keluarga);
        keluarga = new Keluarga("MUHAMMAD KHAFID", "Anak ke-2", "Bojonegoro, 10 Oktober 2002", "Laki-laki", "Pelajar SMP", R.drawable.khafid);
        keluargaList.add(keluarga);
        keluarga = new Keluarga("DIAH AYU ISTIQOMAH", "Anak ke-3", "Bojonegoro, 13 Agustus 2004", "Perempuan", "Pelajar SMP", R.drawable.diah);
        keluargaList.add(keluarga);
        keluarga = new Keluarga("M. PANJI MAIRE PUTRA", "Anak ke-4", "Bojonegoro, 15 Mei 2008", "Laki-laki", "Pelajar SD", R.drawable.panji);
        keluargaList.add(keluarga);
        keluarga = new Keluarga("FITRIA PANCA AGUSTIN", "Anak ke-5", "Bojonegoro, 02 Agustus 2014", "Perempuan", "Pelajar TK", R.drawable.caca);
        keluargaList.add(keluarga);

        mAdapter.notifyDataSetChanged();

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {

            @Override
            public void onClick(View view, int position) {
                Keluarga keluarga = keluargaList.get(position);
                Toast.makeText(getApplicationContext(), "Detail " + keluarga.getNama(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), DetailKeluargaActivity.class);
                i.putExtra("nama", keluarga.getNama());
                i.putExtra("status", keluarga.getStatus());
                i.putExtra("ttl", keluarga.getTtl());
                i.putExtra("jk", keluarga.getJk());
                i.putExtra("pekerjaan", keluarga.getPekerjaan());
                i.putExtra("gambar", keluarga.getGambar());
                startActivity(i);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
}
