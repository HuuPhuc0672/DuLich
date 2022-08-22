package com.example.dulich.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dulich.ChiTietActivity;
import com.example.dulich.Mode.DuLich;
import com.example.dulich.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter_DuLich extends RecyclerView.Adapter<Adapter_DuLich.DulichHolder> {

    ArrayList<DuLich> arrayList;
    Context context;
    public  Adapter_DuLich(ArrayList<DuLich> arrayList,Context context){
        this.arrayList=arrayList;
        this.context=context;
    }


    @NonNull
    @Override
    public DulichHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_khu_dl,parent,false);
        return new DulichHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DulichHolder holder, int position) {
        DuLich duLich=arrayList.get(position);
        Picasso.get().load(duLich.getHinhAnhDL()).
                placeholder(R.drawable.ic_launcher_background).
                error(R.drawable.ic_launcher_background).
                into(holder.iViewDulich);
        holder.txtTenKhuDL.setText(duLich.getTenDL());
        holder.carView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickData(duLich);
            }


        });
    }
    private void onClickData(DuLich duLich) {
        Intent intent=new Intent(context,ChiTietActivity.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("object_Dulieu",duLich);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
    @Override
    public int getItemCount() {
        if (arrayList !=null){
            return arrayList.size();
        }
        return 0;
    }

    public  class DulichHolder extends RecyclerView.ViewHolder{
        private ImageView iViewDulich;
        private TextView txtTenKhuDL;
        private CardView carView;




        public DulichHolder(@NonNull View itemView) {
            super(itemView);
            iViewDulich = (ImageView) itemView.findViewById(R.id.iViewDulich);
            txtTenKhuDL = (TextView) itemView.findViewById(R.id.txtTenKhuDL);
            carView = (CardView) itemView.findViewById(R.id.carView);

        }
    }
}
