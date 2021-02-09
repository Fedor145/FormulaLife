package com.example.myapplication3;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityFerst extends AppCompatActivity implements View.OnClickListener {

    private EditText searchField;
    private EditText searchField2;
    private EditText searchField3;
    private EditText searchField4;
    Button searchButton;
    private TextView result;
    private CheckBox pol1;
    private CheckBox pol2;
    private CheckBox zal;
    private CheckBox dom;
    Toast toast;
    String a;
    String b;
    String c;
    String d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ferst);
        searchButton = findViewById(R.id.b_knopka);
        searchButton.setOnClickListener(this);


        searchField = findViewById(R.id.et_vvod1); //вес
        searchField2 = findViewById(R.id.et_vvod2); //рост
        searchField3 = findViewById(R.id.et_vvod3);  //возраст
        searchField4 = findViewById(R.id.et_vvod4); //обхват груди
        pol1 = findViewById(R.id.pol1); //Женщина
        pol2 = findViewById(R.id.pol2); // Мужчина
        zal = findViewById(R.id.zal);
        dom = findViewById(R.id.dom);

        zal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(zal.isChecked()){
                    c= "zal";
                }
            }
        });
        dom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dom.isChecked()){
                    d= "dom";
                }
            }
        });
        pol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pol1.isChecked()) {
                    a = "pol1";
                }
            }

        });
        pol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pol2.isChecked()) {
                    b = "pol2";

                }
            }




        });
    }
    @Override
    public void onClick(View view) {
        if (pol2.isChecked() && pol1.isChecked() || zal.isChecked() && dom.isChecked()) {

            toast = Toast.makeText(getApplicationContext(),
                    "Ошибка!Выберите только один режим тренировок и один пол.", Toast.LENGTH_LONG);
            toast.show();
        }
        else {

            Intent intent = new Intent(this, ActivityTwo.class);
            intent.putExtra("ves", searchField.getText().toString());
            intent.putExtra("rost", searchField2.getText().toString());
            intent.putExtra("year", searchField3.getText().toString());
            intent.putExtra("grud", searchField4.getText().toString());
            intent.putExtra("pol1", a);
            intent.putExtra("pol2", b);
            intent.putExtra("zal", c);
            intent.putExtra("dom", d);
            startActivity(intent);
        }
    }


}






