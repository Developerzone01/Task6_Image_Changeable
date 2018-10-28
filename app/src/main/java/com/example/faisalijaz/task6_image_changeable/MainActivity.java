package com.example.faisalijaz.task6_image_changeable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img_view ;
    Button btn1 ;
    int current_image ;
    int[] images = {R.drawable.android1,R.drawable.android2,R.drawable.android3,R.drawable.android4,R.drawable.android5,
            R.drawable.android6,R.drawable.android7,R.drawable.android8,R.drawable.android9,R.drawable.android10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1) ;
        img_view =findViewById(R.id.img1) ;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image++ ;
                current_image= current_image % images.length ;
                img_view.setImageResource(images[current_image]);
            }
        });
    }
}
