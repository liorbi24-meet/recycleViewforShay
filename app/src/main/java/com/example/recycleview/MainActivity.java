package com.example.recycleview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter adapter;
    List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        // Add 15 elements
        for (int i = 1; i <= 15; i++) {
            itemList.add(new Item("Title " + i, "Subtitle " + i, R.drawable.ic_launcher_foreground));
        }

        adapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}
