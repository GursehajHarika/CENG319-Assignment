package com.example.n01140732.picassoassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Homepage extends AppCompatActivity {


    public ImageView imager;
    public Button load;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        load = (Button)findViewById(R.id.button);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creatorIMG();
            }
        });

    }

    public void creatorIMG (){
        imager = (ImageView)findViewById(R.id.imageView);

        String URL = "https://www.moma.org/d/assets/W1siZiIsIjIwMTYvMDgvMDQvMW1yOXAxYXRhN18yXzE5MzhfQ0NDUi5qcGciXSxbInAiLCJjb252ZXJ0IiwiLXJlc2l6ZSAyMDAweDIwMDBcdTAwM2UiXV0/2_1938_CCCR.jpg?sha=c75b58704e7f990d";

        Picasso.get().load(URL).into(imager);
    }
}
