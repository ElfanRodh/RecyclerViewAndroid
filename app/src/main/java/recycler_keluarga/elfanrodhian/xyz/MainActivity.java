package recycler_keluarga.elfanrodhian.xyz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnPendidikan, btnKeluarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Quiz Pemrogaman Mobile", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Politeknik Negeri Malang", Toast.LENGTH_LONG).show();

        btnPendidikan = (Button) findViewById(R.id.btnPendidikan);
        btnPendidikan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PendidikanActivity.class);
                Toast.makeText(getApplicationContext(), "RIWAYAT PENDIDIKAN ELFAN", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        btnKeluarga = (Button) findViewById(R.id.btnKeluarga);
        btnKeluarga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), KeluargaActivity.class);
                Toast.makeText(getApplicationContext(), "KELUARGA ELFAN", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
