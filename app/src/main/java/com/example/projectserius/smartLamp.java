package com.example.oioioibaka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.projectserius.R;

public class MainActivity extends AppCompatActivity {


    private ImageView imageview;
    private Button button;
    private boolean swith = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview = findViewById(R.id.imageView1);
        button = findViewById(R.id.my_button);

        button.setOnClickListener(new.view.onclicklistener() {
            @Override
            public void {

                if (switch == false){
                    imageview.setImageResource(R.drawable.on);
                    button.setText("OFF");
                    swith = true;

                } else {
                    imageview.setImageResource(R.drawable.off);
                    button.setText("On");
                    swith = false;
                }
            }


        });
    }
}