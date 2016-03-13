package com.example.user.homeworkhorizontalgallery;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(R.mipmap.image);
        arr.add(R.mipmap.image1);
        arr.add(R.mipmap.image2);
        arr.add(R.mipmap.image3);
        arr.add(R.mipmap.image4);
        arr.add(R.mipmap.image5);
        arr.add(R.mipmap.image);
        arr.add(R.mipmap.image1);
        arr.add(R.mipmap.image2);
        arr.add(R.mipmap.image3);
        arr.add(R.mipmap.image4);
        arr.add(R.mipmap.image5);
        arr.add(R.mipmap.image);
        arr.add(R.mipmap.image1);
        arr.add(R.mipmap.image2);
        arr.add(R.mipmap.image3);
        arr.add(R.mipmap.image4);
        arr.add(R.mipmap.image5);
        for (int i = 0; i < 15; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
            imageView.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), arr.get(i)));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            layout.addView(imageView);
        }
    }
}
