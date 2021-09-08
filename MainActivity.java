package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity<view> extends AppCompatActivity
{
    EditText eText;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button2);
        eText = findViewById(R.id.Name);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateBIRTHDAYCARD();
            }
        });
    }

     private void CreateBIRTHDAYCARD() {
         String name = eText.getText().toString();
         Toast msg = Toast.makeText(getBaseContext(),name,Toast.LENGTH_LONG);
         msg.show();

         Intent intent = new Intent(this, Birthdaygreet.class);
         intent.putExtra(intent.EXTRA_TEXT,name);
         startActivity(intent);
    }
}