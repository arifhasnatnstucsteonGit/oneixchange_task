package com.arifhasnat.onelxchangebd.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arifhasnat.onelxchangebd.R;
import com.arifhasnat.onelxchangebd.model.SummaryModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Arif Hasnat on 3/8/2017.
 */

public class SummaryAdapter extends RecyclerView.Adapter<SummaryAdapter.StudentDataHolder>{


    ArrayList<SummaryModel> summaryModels;

    public SummaryAdapter(ArrayList<SummaryModel> summaryModels) {
        this.summaryModels = summaryModels;
    }

    @Override
    public SummaryAdapter.StudentDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.summary_adapter, parent, false);
        StudentDataHolder nearmeViewHolder = new StudentDataHolder(view);
        return nearmeViewHolder;
    }

    @Override
    public void onBindViewHolder(SummaryAdapter.StudentDataHolder holder, final int position) {

        holder.name.setText(summaryModels.get(position).name.toString());
        holder.title.setText(summaryModels.get(position).title.toString());



    }

    @Override
    public int getItemCount() {
        return summaryModels.size();
    }

    public class StudentDataHolder extends RecyclerView.ViewHolder {

        TextView name,title;

        public StudentDataHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            title = itemView.findViewById(R.id.title);


        }
    }
}
