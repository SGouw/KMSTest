package com.example.kmstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openDialog();
            }
        });

    }

    public void openDialog(){
        ExampleDialog edia = new ExampleDialog();
        edia.show(getSupportFragmentManager(), "example dialog");
    }


}
