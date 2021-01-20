package com.example.projek_wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class beranda extends AppCompatActivity {

    private int[] mImages = new int[]{
            R.drawable.komodo,
            R.drawable.borobudur,
            R.drawable.bromo,
            R.drawable.lot,
            R.drawable.kotua
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        CarouselView carouselView= findViewById(R.id.slider);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });


    }

}





