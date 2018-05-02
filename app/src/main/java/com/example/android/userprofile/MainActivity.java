package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml code for circular image - https://github.com/hdodenhof/CircleImageView
        //dependency added in build.gradle and xml code
        ImageView profilePicture = (ImageView) findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.claudia);

        //find text views
        TextView name = findViewById(R.id.name);
        TextView degree = findViewById(R.id.degree);
        TextView birthday = findViewById(R.id.birthday);
        TextView country = findViewById(R.id.country);

        //set text only displays at runtime
        name.setText("Claudia");
        degree.setText("Android Basics Nano Degree");
        birthday.setText("December 6th");
        country.setText("USA");

    }
}
