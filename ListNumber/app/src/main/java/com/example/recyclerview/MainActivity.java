package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvNumber;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNumber = findViewById(R.id.recycle_Number);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));

        final List<String> data1 = new ArrayList<>();
        for (int i = 0; i < 100 ;i++){
            data1.add(""+i);
        }
        final NumberAdapter adapter = new NumberAdapter();
        adapter.data = data1;
        rvNumber.setAdapter(adapter);

        findViewById(R.id.addNew).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1.add("new new");
                adapter.notifyDataSetChanged();
            }
        });
    }
}
