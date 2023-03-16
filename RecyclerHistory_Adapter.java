package com.example.streams;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerHistory_Adapter extends RecyclerView.Adapter<RecyclerHistory_Adapter.viewHolder> {

    private List<item_Model> userList;

    public RecyclerHistory_Adapter(List<item_Model>userList){
        this.userList=userList;
    }


    @NonNull
    @Override
    public RecyclerHistory_Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
       return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHistory_Adapter.viewHolder holder, int position) {
        int photo=userList.get(position).getImageview1();
        String name=userList.get(position).getTextview1();
        String time=userList.get(position).getTextview2();
        String message=userList.get(position).getTextview3();
        String line=userList.get(position).getDivider();

        holder.setData(photo,name,time,message,line);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView1,textView2,textView3,textView4;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView1);
            textView1=itemView.findViewById(R.id.textView);
            textView2=itemView.findViewById(R.id.textview2);
            textView3=itemView.findViewById(R.id.textView3);
            textView4=itemView.findViewById(R.id.textView4);
        }

        public void setData(int photo, String name, String time, String message, String line) {

            imageView.setImageResource(photo);
            textView1.setText(name);
            textView2.setText(time);
            textView3.setText(message);
            textView4.setText(line);

        }
    }
}
