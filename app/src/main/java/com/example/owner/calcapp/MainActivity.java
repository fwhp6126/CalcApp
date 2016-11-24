package com.example.owner.calcapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

          }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText1= (EditText) findViewById(R.id.editText1);
        EditText editText2= (EditText) findViewById(R.id.editText2);
        intent.putExtra("VALUE1", editText1.toString());

        intent.putExtra("VALUE2", editText2.toString());

        startActivity(intent);
    }
   }


