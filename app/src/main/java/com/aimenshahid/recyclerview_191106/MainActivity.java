package com.aimenshahid.recyclerview_191106;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter CustomAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Person> studentsList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        studentsList.add(new Person("Ice Cream", R.drawable.icecream));
        studentsList.add(new Person("Shake", R.drawable.shake));
        studentsList.add(new Person("Velvet Cake", R.drawable.cake));
        studentsList.add(new Person("Chocolate", R.drawable.chocolate));
        studentsList.add(new Person("Juice", R.drawable.juice));
        studentsList.add(new Person("Cup Cake", R.drawable.cupcake));

        CustomAdapter = new CustomAdapter(MainActivity.this, studentsList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(CustomAdapter);
    }
}