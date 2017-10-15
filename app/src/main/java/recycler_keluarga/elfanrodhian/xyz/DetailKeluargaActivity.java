package recycler_keluarga.elfanrodhian.xyz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailKeluargaActivity extends AppCompatActivity {
    private TextView detail;
    private TextView nama;
    private TextView status;
    private TextView ttl;
    private TextView jk;
    private TextView pekerjaan;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_keluarga);
        detail = (TextView) findViewById(R.id.txtDetail);
        nama = (TextView) findViewById(R.id.etNama);
        status = (TextView) findViewById(R.id.etStatus);
        ttl = (TextView) findViewById(R.id.etTtl);
        jk = (TextView) findViewById(R.id.etJk);
        pekerjaan = (TextView) findViewById(R.id.etPekerjaan);
        gambar = (ImageView) findViewById(R.id.gambar);

        Intent i = getIntent();
        String Detail = i.getStringExtra("nama");
        String Nama = i.getStringExtra("nama");
        String Status = i.getStringExtra("status");
        String Ttl = i.getStringExtra("ttl");
        String Jk = i.getStringExtra("jk");
        String Pekerjaan = i.getStringExtra("pekerjaan");
        int Gambar = i.getExtras().getInt("gambar");

        detail.setText(Detail);
        nama.setText(Nama);
        status.setText(Status);
        ttl.setText(Ttl);
        jk.setText(Jk);
        pekerjaan.setText(Pekerjaan);
        gambar.setImageResource(Gambar);
    }
}
