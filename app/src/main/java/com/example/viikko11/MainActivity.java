package com.example.viikko11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Storage storage;
    private RecyclerView recyclerView;
    private ItemListAdapter adapter;
    private RecyclerView.ViewHolder holder;
    private ImageView ivSortAlphabet, ivSortRecent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storage = Storage.getInstance();
        recyclerView = findViewById(R.id.rvItemList);
        ivSortAlphabet = findViewById(R.id.ivSortAlphabet);
        ivSortRecent = findViewById(R.id.ivSortRecent);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemListAdapter(getApplicationContext(), storage.getItems());
        recyclerView.setAdapter(adapter);
    }




    public void addItem(View view)  {
        storage.addItem(new Item(""));
        adapter.notifyItemInserted(storage.getItems().size());
        /*
        holder.itemDetails.setVisibility(View.GONE);
        holder.editDetails.setVisibility(View.VISIBLE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            holder.editDetails.setFocusedByDefault(true);
        }

         */

        //RecyclerView.ViewHolder holder = recyclerView.getChildViewHolder(view);

        //holder.itemDetails.setVisibility(View.GONE);
        //holder.editDetails.setVisibility(View.VISIBLE);

        //recyclerView.notify();

    }

    /*@Override
    protected void onResume() {
        super.onResume();
        adapter.notifyItemInserted(storage.getItems().size());
    }*/



    public void sortAlphabet(View view) {
        storage.sortAlphabet();
        adapter.notifyDataSetChanged();
    }

    public void sortRecent(View view)   {
        storage.sortRecent();
        adapter.notifyDataSetChanged();
    }
}