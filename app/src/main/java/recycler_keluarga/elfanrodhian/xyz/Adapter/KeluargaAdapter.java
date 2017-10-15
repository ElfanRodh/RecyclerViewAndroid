package recycler_keluarga.elfanrodhian.xyz.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import recycler_keluarga.elfanrodhian.xyz.Model.Keluarga;
import recycler_keluarga.elfanrodhian.xyz.R;

/**
 * Created by Elfan Rodhian on 10/8/2017.
 */

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.MyViewHolder> {
    List<Keluarga> listKeluarga;

    public KeluargaAdapter(List<Keluarga> listKeluarga) {
        this.listKeluarga = listKeluarga;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.keluarga_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Keluarga keluarga = this.listKeluarga.get(position);
        holder.nama.setText(keluarga.getNama());
        holder.status.setText(keluarga.getStatus());
        holder.jk.setText(keluarga.getJk());
        holder.gambar.setImageResource(keluarga.getGambar());
    }

    @Override
    public int getItemCount() {
        return listKeluarga.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nama, jk, status;
        public ImageView gambar;
        public MyViewHolder(View itemView) {
            super(itemView);
            nama = (TextView) itemView.
                    findViewById(R.id.nama);
            status = (TextView) itemView.
                    findViewById(R.id.status);
            jk = (TextView) itemView.
                    findViewById(R.id.jk);
            gambar = (ImageView) itemView.
                    findViewById(R.id.gambar);
        }
    }
}
