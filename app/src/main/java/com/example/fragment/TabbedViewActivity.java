package com.example.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.fragment.databinding.ActivityTabbedViewBinding;
import com.example.fragment.ui.main.Fragment_One;
import com.example.fragment.ui.main.PagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class TabbedViewActivity extends AppCompatActivity {

    private ActivityTabbedViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTabbedViewBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(adapter);
        TabLayout tabs = binding.tabs;

        FloatingActionButton fab = binding.fab;
        //FragmentOne one;
        adapter.addFragment(new Fragment_One(),"One");
        adapter.addFragment(new com.example.fragment.ui.main.Fragment_Two(),"Two");
        adapter.addFragment(new com.example.fragment.ui.main.Fragment_Three(),"Three");
        tabs.setupWithViewPager(viewPager);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}