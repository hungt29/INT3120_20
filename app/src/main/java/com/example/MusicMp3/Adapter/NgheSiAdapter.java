package com.example.MusicMp3.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.MusicMp3.Activity.DanhsachbaihatActivity;
import com.example.MusicMp3.Model.NgheSiModel;
import com.example.MusicMp3.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NgheSiAdapter extends RecyclerView.Adapter<NgheSiAdapter.ViewHolder> {
    Context context;
    ArrayList<NgheSiModel> mangnghesi;
    View view;

    public NgheSiAdapter(Context context, ArrayList<NgheSiModel> mangnghesi) {
        this.context = context;
        this.mangnghesi = mangnghesi;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.dong_nghesi,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        NgheSiModel ngheSi = mangnghesi.get(position);
        holder.txttennghesi.setText(ngheSi.getTenNgheSi());
        Picasso.get(/*context*/).load(ngheSi.getHinhNgheSi()).into(holder.imgnghesi);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DanhsachbaihatActivity.class);
                intent.putExtra("intentnghesi", mangnghesi.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mangnghesi != null ? mangnghesi.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        de.hdodenhof.circleimageview.CircleImageView imgnghesi;
        TextView txttennghesi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgnghesi = itemView.findViewById(R.id.imageviewnghesi);
            txttennghesi = itemView.findViewById(R.id.textviewnghesi);
        }
    }
}
