package com.example.n01140732.picassoassignment;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class Homepage extends AppCompatActivity {

    //intialization of the button.
    public ImageView imager;
    public Button load;
    private static int SPLASH_TIME_OUT = 2500 ;
    public Button stoargeload;
    public TextView seting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        //Setting up all the views to uses
        seting=(TextView)findViewById(R.id.textView);
        load = (Button)findViewById(R.id.button);
        stoargeload = (Button)findViewById(R.id.button2);


        //Created a Delay to change the title and bring author's name on top.
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){
                setTitle("By Gursehaj Harika ");
            }
        },SPLASH_TIME_OUT);


        //Setting up the button toact when clicked on.
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creatorIMG();//Fuction called to load the Image from the internet.
                seting.setText("Picasso Loading Image from the Internet Test");
            }
        });


        stoargeload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loading();
                seting.setText("Picasso Loading Image from Storage From the Device ");
            }
        });


    }


    //Function to impliment
    public void creatorIMG (){
        imager = (ImageView)findViewById(R.id.imageView);
        String URL = "https://www.moma.org/d/assets/W1siZiIsIjIwMTYvMDgvMDQvMW1yOXAxYXRhN18yXzE5MzhfQ0NDUi5qcGciXSxbInAiLCJjb252ZXJ0IiwiLXJlc2l6ZSAyMDAweDIwMDBcdTAwM2UiXV0/2_1938_CCCR.jpg?sha=c75b58704e7f990d";
        Picasso.get().load(URL).into(imager);

    }

    //Functoin used to call a image from storage
    public void loading(){

        Picasso.get().load(R.mipmap.ic_load).into(imager);

    }


}
