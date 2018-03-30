package com.example.root.aboutus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelSponser> sponsersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        recyclerView = findViewById(R.id.recycler_view);

        sponsersList = new ArrayList<>();

        sponsersList.add(new ModelSponser(R.drawable.godrej, "Godrej", "Gold sponser"));
        sponsersList.add(new ModelSponser(R.drawable.maruti, "Maruti Suzuki", "gold Soponser"));
        sponsersList.add(new ModelSponser(R.drawable.sbi, "SBI","Silver Sponser"));
        sponsersList.add(new ModelSponser(R.drawable.hdfc, "HDFC Bank","Silver Sponser"));
        sponsersList.add(new ModelSponser(R.drawable.intel, "Intel","Silver Sponser"));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rlmanager = linearLayoutManager;
        recyclerView.setLayoutManager(rlmanager);

        FoodAdapter adapter = new FoodAdapter(this, sponsersList);

        recyclerView.setAdapter(adapter);
    }
}
