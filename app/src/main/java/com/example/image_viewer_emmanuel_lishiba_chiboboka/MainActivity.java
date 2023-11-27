package com.example.image_viewer_emmanuel_lishiba_chiboboka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    int currentImage = 0;
    int [] fruits = {R.drawable.apples, R.drawable.berries,R.drawable.peaches
            ,R.drawable.tangerines,R.drawable.strawberrys};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rightClick (View view) {

            if (currentImage == 4) {
                imageView = findViewById(R.id.imageViews);
                currentImage = currentImage;
                imageView.setImageResource(fruits[currentImage]);
            }
            else {
                imageView = findViewById(R.id.imageViews);
                currentImage++;
                imageView.setImageResource(fruits[currentImage]);
            }
    }
    public void leftClick (View view) {

        if (currentImage == 0) {
            imageView = findViewById(R.id.imageViews);
            currentImage = currentImage;
            imageView.setImageResource(fruits[currentImage]);
        }
        else {
            imageView = findViewById(R.id.imageViews);
            currentImage--;
            imageView.setImageResource(fruits[currentImage]);
        }
    }
}