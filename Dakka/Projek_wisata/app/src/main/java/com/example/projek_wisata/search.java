package com.example.projek_wisata;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class search extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        RecyclerView postsRecyclerView = findViewById(R.id.postsRecyclerView);
        postsRecyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        List<postitem> postitems = new ArrayList<>();
        postitems.add(new postitem(R.drawable.image1));
        postitems.add(new postitem(R.drawable.image2));
        postitems.add(new postitem(R.drawable.image3));
        postitems.add(new postitem(R.drawable.image4));
        postitems.add(new postitem(R.drawable.image5));
        postitems.add(new postitem(R.drawable.image6));
        postitems.add(new postitem(R.drawable.image7));
        postitems.add(new postitem(R.drawable.image8));
        postitems.add(new postitem(R.drawable.image9));
        postitems.add(new postitem(R.drawable.image10));


        postsRecyclerView.setAdapter(new postsadapter(postitems));
    }
}
