package com.arifhasnat.onelxchangebd.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.arifhasnat.onelxchangebd.R;

/**
 * Created by Arif Hasnat on 3/8/2017.
 */

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.StudentDataHolder>{


    Context context;
    public StudentListAdapter() {
    }

    @Override
    public StudentListAdapter.StudentDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_data_model, parent, false);
        StudentDataHolder nearmeViewHolder = new StudentDataHolder(view);
        return nearmeViewHolder;
    }

    @Override
    public void onBindViewHolder(StudentListAdapter.StudentDataHolder holder, final int position) {


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Actions for Edit , delete and more", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return 86;
    }

    public class StudentDataHolder extends RecyclerView.ViewHolder {

        public StudentDataHolder(View itemView) {
            super(itemView);

        }
    }
}
