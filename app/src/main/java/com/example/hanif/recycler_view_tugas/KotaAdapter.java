package com.example.hanif.recycler_view_tugas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class KotaAdapter extends RecyclerView.Adapter<KotaAdapter.MyHolder> {


    private Context context;
    private List<String> list;
    private View view;


    public KotaAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public KotaAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    context = parent.getContext();
    view = LayoutInflater.from(context).inflate(R.layout.item_kotah, parent, false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KotaAdapter.MyHolder holder, int position) {

        final String kota = list.get(position);
        holder.namaKota.setText(kota);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, kota, Toast.LENGTH_SHORT).show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        TextView namaKota;
        public MyHolder(View itemView) {
            super(itemView);
            namaKota = itemView.findViewById(R.id.nama_kota);
        }
    }
}
