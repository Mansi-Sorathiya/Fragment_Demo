package com.example.fragment.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.fragment.R;

public class list_Adapter extends BaseAdapter {
    Fragment_One fragment_one;
    String[] data;

    public list_Adapter(Fragment_One fragment_one, String[] data) {
        this.fragment_one = fragment_one;
        this.data = data;
    }



    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1= LayoutInflater.from(fragment_one.getContext()).inflate(R.layout.frag_one_item,viewGroup,false);
        TextView textView=view1.findViewById(R.id.txt1);
        textView.setText(data[i]);
        return view1;
    }
}
