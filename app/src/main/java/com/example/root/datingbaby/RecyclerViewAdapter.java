package com.example.root.datingbaby;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<member> mData;

    public RecyclerViewAdapter(Context mContext, List<member> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        View view;
        LayoutInflater mInflater =LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.members,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        viewHolder.username.setText(mData.get(i).getUsername());
        viewHolder.profile_pic.setImageResource(mData.get(i).getProfile_pic());
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView username;
        ImageView profile_pic;

        public MyViewHolder(View itemView){
            super(itemView);

            username = (TextView) itemView.findViewById(R.id.username);
            profile_pic =(ImageView) itemView.findViewById(R.id.profile_pic);

        }
    }

}
