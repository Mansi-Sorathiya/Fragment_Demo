package com.example.fragment.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment.R;

public class recycle_Adapter extends RecyclerView.Adapter<recycle_Adapter.Holder> {
    Fragment_Two fragment_two;
    String[] name;
    int[] imagearr;
    String[] name1;
    int[] imagearr1;

    public recycle_Adapter(Fragment_Two fragment_two, String[] name, int[] imagearr, String[] name1, int[] imagearr1) {
        this.fragment_two = fragment_two;
        this.name = name;
        this.imagearr = imagearr;
        this.name1 = name1;
        this.imagearr1 = imagearr1;
    }

    @NonNull
    @Override
    public recycle_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(fragment_two.getContext()).inflate(R.layout.frag_two_item,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recycle_Adapter.Holder holder, int position) {
        holder.textView.setText(name[position]);
        holder.imageView.setImageResource(imagearr[position]);
        holder.textView1.setText(name1[position]);
        holder.imageView1.setImageResource(imagearr1[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView textView,textView1;
        ImageView imageView,imageView1;
        public Holder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txtname);
            imageView=itemView.findViewById(R.id.imageview);
            textView1=itemView.findViewById(R.id.txtname1);
            imageView1=itemView.findViewById(R.id.imageview1);
        }
    }
}
