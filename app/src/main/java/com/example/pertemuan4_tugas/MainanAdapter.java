package com.example.pertemuan4_tugas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainanAdapter extends RecyclerView.Adapter<MainanAdapter.MainanViewHolder>{
    private ArrayList<Mainan> dataList;
    public MainanAdapter(ArrayList<Mainan> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MainanAdapter.MainanViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_mainan, parent, false);
        return new MainanViewHolder(view);
    }
    public void onBindViewHolder(MainanViewHolder holder, int position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.txtTipe.setText(dataList.get(position).getTipe());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtTahun.setText(dataList.get(position).getTahun());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MainanViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTipe, txtNama, txtTahun;
        private ImageView Foto;
        public MainanViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtTipe = (TextView)itemView.findViewById(R.id.txt_tipe);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtTahun = (TextView) itemView.findViewById(R.id.txt_tahun);
        }
    }
}

