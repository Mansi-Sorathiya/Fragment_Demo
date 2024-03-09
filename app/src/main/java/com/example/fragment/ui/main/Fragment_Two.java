package com.example.fragment.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment.R;

public class Fragment_Two extends Fragment {

    RecyclerView recyclerView;
    String[] name={"Hardik Pandya ", "SuryakumarYadav", "Ishan Kishan", "Shubman Gill", "Deepak Hooda",
            "Sanju Samson","Yuzi Chahal", "Arshdeep Singh", "Harshal Patel", "Shreyas Iyer"};

    int imagearr[] = {R.drawable.img_2, R.drawable.img_3, R.drawable.img_4, R.drawable.img_5, R.drawable.img_6,
            R.drawable.img_7, R.drawable.img_8, R.drawable.img_9, R.drawable.img_10, R.drawable.img_11};

    String name1[] = {"David Warner", "Aaron Finch", "Glenn Maxwell", "Marcus Stoinis", "Steven Smith", "Usman Khawaja",
            "Adam Zampa", "Alex Carey", "Matthew Wade", "Mitchell Marsh"};
    int imagearr1[] = {R.drawable.img_20, R.drawable.img_21, R.drawable.img_22, R.drawable.img_23, R.drawable.img_24,
            R.drawable.img_25, R.drawable.img_26, R.drawable.img_27, R.drawable.img_28, R.drawable.img_29};



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.fragment_two,container,false);
        recyclerView=view.findViewById(R.id.recyclerview);
        recycle_Adapter adapter=new recycle_Adapter(Fragment_Two.this,name,imagearr,name1,imagearr1);
        LinearLayoutManager manager=new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        return  view;
    }
}