package com.mostafaelshrief.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    LinearLayout Photos,Gallery;
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Photos=findViewById(R.id.photos);
        Gallery=findViewById(R.id.gallery);
        LayoutInflater inflater= LayoutInflater.from(this);
        for (int i = 0;i<6;i++){
            View view=inflater.inflate(R.layout.category,Photos,false);
            textView=view.findViewById(R.id.name_movie);
            textView.setText("Name movie"+i);
            imageView=view.findViewById(R.id.photo_movie);
            imageView.setImageResource(R.drawable.stars);
            Photos.addView(view);
        }
        for (int i = 0;i<6;i++) {
            View view = inflater.inflate(R.layout.item, Gallery, false);
            textView = view.findViewById(R.id.movie_available);
            textView.setText("Movie available" + i);
            imageView = view.findViewById(R.id.movie);
            imageView.setImageResource(R.drawable.stars);
            Gallery.addView(view);
        }

    }
}