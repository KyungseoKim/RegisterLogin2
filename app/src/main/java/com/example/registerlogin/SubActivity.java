package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class SubActivity extends AppCompatActivity {

    //버튼 선언
    private Button btn_move2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        btn_move2 = findViewById(R.id.btn_move2);
        btn_move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this , CalendarActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
    public void buttonCLick(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.melon.com/"));
        startActivity(i);
    }
}