package com.arifhasnat.onelxchangebd.activities;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.arifhasnat.onelxchangebd.R;
import com.arifhasnat.onelxchangebd.adapters.StudentListAdapter;
import com.arifhasnat.onelxchangebd.adapters.SummaryAdapter;
import com.arifhasnat.onelxchangebd.model.StudentDataModel;
import com.arifhasnat.onelxchangebd.model.SummaryModel;

import java.util.ArrayList;

public class SummaryActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private SummaryAdapter summaryAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<SummaryModel> summaryArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.WHITE);
        }

        ImageView cancel = findViewById(R.id.close);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_summery);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<SummaryModel> summaryModels = new ArrayList<>();
        summaryModels.add(new SummaryModel("Participent","86"));
        summaryModels.add(new SummaryModel("Invited","86"));
        summaryModels.add(new SummaryModel("RSVP-Yes","50"));
        summaryModels.add(new SummaryModel("RSVP-Pending","34"));
        summaryModels.add(new SummaryModel("RSV-No","2"));
        summaryModels.add(new SummaryModel("Reminder(Email)","0"));
        summaryModels.add(new SummaryModel("Attendent","0"));
        summaryModels.add(new SummaryModel("Feeback Sent","0"));
        summaryModels.add(new SummaryModel("Feedback Received","0"));


        summaryAdapter = new SummaryAdapter(summaryModels);
        recyclerView.setAdapter(summaryAdapter);





    }

}
