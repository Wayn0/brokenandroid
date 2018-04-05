package za.co.instacom.bokenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switch_screen1, switch_screen2;
        switch_screen1 = findViewById(R.id.button1);
        switch_screen2 = findViewById(R.id.button2);


        switch_screen1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent second = new Intent();
                second.setClassName("za.co.kbois.vac", "za.co.instacom.bokenapp.ThirdActivity");
                startActivity(second);
            }
        });

        switch_screen2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent second = new Intent();
                second.setClassName("za.co.kbois.vac", "za.co.instacom.bokenapp.SecondActivity");
                startActivity(second);
            }
        });
    }
}
