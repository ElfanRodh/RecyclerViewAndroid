package recycler_keluarga.elfanrodhian.xyz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPendidikanActivity extends AppCompatActivity {
    private TextView jenjang;
    private TextView nama;
    private TextView alamat;
    private TextView tahun;
    private TextView detail;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pendidikan);

        jenjang = (TextView) findViewById(R.id.etJenjang);
        nama = (TextView) findViewById(R.id.etNama);
        alamat = (TextView) findViewById(R.id.etAlamat);
        tahun = (TextView) findViewById(R.id.etTahun);
        detail = (TextView) findViewById(R.id.txtDetail);
        gambar = (ImageView) findViewById(R.id.gambar);

        Intent i = getIntent();
        String Jenjang = i.getStringExtra("jenjang");
        String Nama = i.getStringExtra("nama");
        String Alamat = i.getStringExtra("alamat");
        String Tahun = i.getStringExtra("tahun");
        String Detail = i.getStringExtra("nama");
        int Gambar = i.getExtras().getInt("gambar");

        jenjang.setText(Jenjang);
        nama.setText(Nama);
        alamat.setText(Alamat);
        tahun.setText(Tahun);
        detail.setText(Detail);
        gambar.setImageResource(Gambar);
    }
}
