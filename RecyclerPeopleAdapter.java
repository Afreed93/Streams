package com.example.streams;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerPeopleAdapter extends RecyclerView.Adapter<RecyclerPeopleAdapter.ViewHolder> {


    private List<PeopleModel> contactList;

    public RecyclerPeopleAdapter(List<PeopleModel>contactList)
    {
        this.contactList=contactList;
    }


    @NonNull
    @Override
    public RecyclerPeopleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.peopledesign,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerPeopleAdapter.ViewHolder holder, int position) {
        int pic=contactList.get(position).getImageview1();
        String textview1=contactList.get(position).getTextview1();
        String textview2=contactList.get(position).getTextview2();
        String line=contactList.get(position).getDivider();

        holder.setData(pic,textview1,textview2,line);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView1,textView2,textView3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.img1);
            textView1=itemView.findViewById(R.id.txt1);
            textView2=itemView.findViewById(R.id.txt2);
            textView3=itemView.findViewById(R.id.divider);
        }

        public void setData(int pic, String textview1, String textview2, String line) {
            imageView.setImageResource(pic);
            textView1.setText(textview1);
            textView2.setText(textview2);
            textView3.setText(line);
        }
    }
}
