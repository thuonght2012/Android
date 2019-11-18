package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimals = findViewById(R.id.listAnimals);
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));

        final ArrayList<Student> studentList = new ArrayList<Student>(10);

        Student std1 = new Student("Lam", 8);
        Student std2 = new Student("Linh", 8);
        Student std3 = new Student("Lanh", 8);

        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        final RecyclerAdapter adapter = new RecyclerAdapter();
        adapter.studentList = studentList;
        rvAnimals.setAdapter(adapter);

        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name, score;
                name = findViewById(R.id.name);
                score = findViewById(R.id.score);
                Student student = new Student(name.getText().toString(), Integer.parseInt(score.getText().toString()));
                studentList.add(student);
                name.setText("");
                score.setText("");
                adapter.notifyDataSetChanged();
            }
        });
    }
}
