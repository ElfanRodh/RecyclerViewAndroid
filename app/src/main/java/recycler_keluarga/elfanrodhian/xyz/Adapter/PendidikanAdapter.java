package recycler_keluarga.elfanrodhian.xyz.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import recycler_keluarga.elfanrodhian.xyz.Model.Pendidikan;
import recycler_keluarga.elfanrodhian.xyz.R;

/**
 * Created by Elfan Rodhian on 10/9/2017.
 */

public class PendidikanAdapter extends RecyclerView.Adapter<PendidikanAdapter.MyViewHolder> {
    List<Pendidikan> listPendidikan;

    public PendidikanAdapter(List<Pendidikan> listPendidikan) {
        this.listPendidikan = listPendidikan;
    }

    @Override
    public PendidikanAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.pendidikan_item, parent, false);
        return new PendidikanAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pendidikan pendidikan = this.listPendidikan.get(position);
        holder.jenjang.setText(pendidikan.getJenjang());
        holder.nama_sekolah.setText(pendidikan.getNama_sekolah());
        holder.alamat.setText(pendidikan.getAlamat());
        holder.gambar.setImageResource(pendidikan.getGambar());
    }

    @Override
    public int getItemCount() {
        return listPendidikan.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView jenjang, nama_sekolah, alamat;
        public ImageView gambar;

        public MyViewHolder(View itemView) {
            super(itemView);
            jenjang = (TextView) itemView.
                    findViewById(R.id.txtJenjang);
            nama_sekolah = (TextView) itemView.
                    findViewById(R.id.txtNamaSekolah);
            alamat = (TextView) itemView.
                    findViewById(R.id.txtAlamat);
            gambar = (ImageView) itemView.
                    findViewById(R.id.gambar);
        }
    }
}
