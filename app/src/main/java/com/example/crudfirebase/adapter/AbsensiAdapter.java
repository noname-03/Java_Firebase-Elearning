package com.example.crudfirebase.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crudfirebase.R;
import com.example.crudfirebase.model.Absensi;

import java.util.List;

public class AbsensiAdapter  extends RecyclerView.Adapter<AbsensiAdapter.MyViewHolder> {

    private Context context;
    private List<Absensi> list;
    private Dialog dialog;

    public interface Dialog{
        void onClick(int pos);
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    public AbsensiAdapter(Context context, List<Absensi> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_absen, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(list.get(position).getNama());
        holder.matkul.setText(list.get(position).getMatkul());
        holder.pertemuan.setText(list.get(position).getPertemuan());
        holder.nim.setText(list.get(position).getNim());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name, matkul, pertemuan, nim;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nama);
            matkul = itemView.findViewById(R.id.matkul);
            nim = itemView.findViewById(R.id.nim);
            pertemuan = itemView.findViewById(R.id.pertemuan);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (dialog!=null){
                        dialog.onClick(getLayoutPosition());
                    }
                }
            });
        }
    }
}
