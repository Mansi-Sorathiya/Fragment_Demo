package com.example.fragment.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fragment.R;

public class Fragment_One extends Fragment {

    ListView listView;
    String[] data={"Ami","babita","Chirag","Dev","Fena","Gaurav","Hemant","Isha","Jinal","Keval"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_one,container,false);
        listView=view.findViewById(R.id.listview);
        Log.d("TTT", "onCreateView: Find id="+view.findViewById(R.id.listview).getId());
        list_Adapter adapter =new list_Adapter(Fragment_One.this,data);
        listView.setAdapter(adapter);
        return view;
    }
}