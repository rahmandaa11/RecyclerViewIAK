package com.example.randa.recyclerviewiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai = (Button) findViewById(R.id.mulai);

    mulai.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, RvActivity.class);
            startActivity(i);
        }
    });
    }
}
