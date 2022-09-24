package com.example.mc_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class MC_Test2_2ndPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc_test22nd_page);

//        ImageView imageView = (ImageView) findViewById(R.id.image_view2);
//
//        Bitmap imageToDisplay = (Bitmap) this.getIntent().getExtras("my_image");

            Bundle extras = getIntent().getExtras();
            byte[] byteArray = extras.getByteArray("picture");

            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            ImageView image = (ImageView) findViewById(R.id.image_view2);

            image.setImageBitmap(bmp);

    }
}