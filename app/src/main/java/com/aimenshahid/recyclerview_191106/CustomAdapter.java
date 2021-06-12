package com.aimenshahid.recyclerview_191106;

import android.annotation.SuppressLint;
import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private List<Person> studentsList;
    int []fooditems;
    Person N;


    public CustomAdapter() {
    }
    public CustomAdapter(Context context, List<Person> studentsList) {
        this.context = context;
        this.studentsList = studentsList;
        this.fooditems=fooditems;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person name = studentsList.get(position);
        holder.student_name.setText(name.getName());
        Person students = studentsList.get(position);
        holder.profile.setImageResource(students.getfooditems());
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentsList.remove(position);
                notifyItemRemoved(position);
                Toast.makeText(context, "Deleted an Item", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentsList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView student_name;
        ImageButton delete;
        ImageView profile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            student_name = itemView.findViewById(R.id.name_Title);
            delete = itemView.findViewById(R.id.delete);
            profile = itemView.findViewById(R.id.profile);

        }

        @Override
        public void onClick(View v) {

        }

    }

}
