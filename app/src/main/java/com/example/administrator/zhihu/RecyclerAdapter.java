package com.example.administrator.zhihu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecViewHolder> {
    private List<Data> datas = new ArrayList<>();
    private Context mContext;

    public RecyclerAdapter(List<Data> datas, Context context) {
        this.datas = datas;
        mContext = context;
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, viewGroup, false);
        final RecViewHolder recViewHolder = new RecViewHolder(view);
        recViewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = recViewHolder.getAdapterPosition();
                Data data = datas.get(position);
                Intent intent = new Intent(mContext, WebActivity.class);
                intent.putExtra("id", "https://news-at.zhihu.com/api/4/news/" + data.getId());
                intent.putExtra("title", data.getTitle());
                intent.putExtra("image", data.getImageUrl());
                mContext.startActivity(intent);
            }
        });
        return recViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder recViewHolder, final int i) {

        recViewHolder.title.setText(datas.get(i).getTitle());
        Glide.with(mContext).load(datas.get(i).getImageUrl()).into(recViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class RecViewHolder extends ViewHolder {
        View view;
        ImageView imageView;
        TextView title;

        public RecViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textView);
        }
    }
}
