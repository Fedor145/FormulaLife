package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    TextView textView2;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        textView = (TextView) findViewById(R.id.textView1); //тренировки
        textView2 = (TextView) findViewById(R.id.textView2); //питание
        button = (Button) findViewById(R.id.sovet);
        button.setOnClickListener(this);

        Intent intent = getIntent();
        String ves = intent.getStringExtra("ves");
        String rost = intent.getStringExtra("rost");
        String year = intent.getStringExtra("year");
        String grud = intent.getStringExtra("grud");
        String pol1= intent.getStringExtra("pol1");
        String pol2= intent.getStringExtra("pol2");
        String zal= intent.getStringExtra("zal");
        String dom= intent.getStringExtra("dom");
        double v =Integer.parseInt(ves);
        double r =Integer.parseInt(rost);
        double y =Integer.parseInt(year);
        double g =Integer.parseInt(grud);
        double a;
        double b;
        double ygle;
        double bel;
        double gir;
        double ygle2;
        double bel2;
        double gir2;
        double ygle3;
        double bel3;
        double gir3;
        Toast toast;

        a =((10*v) + (6.25*r)-(5*y) + 5)*1.55;
        b =((10*v) + (6.25*r)-(5*y)-161)*1.55;
        ygle =v/5;
        bel =v/2;
        gir =v;
        ygle2 =v/6;
        bel2 =v/3;
        gir2 =v;
        ygle3 =v/4;
        bel3 =v/2;
        gir3 =v;

        if(pol2!=null && pol2.equals("pol2")){

            if(dom!=null && dom.equals("dom")) {                                                       //тренировки дома(мужчины)

                if (r - (v + g) >= 30) {                              //эктоморф(худой )

                    if(y<=15){
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    }else
                        if(y>15 && y<=18){

                            textView.setText(R.string.ectomorfD);
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        }else
                            if(y>18 && y<=30){
                                textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                                textView.setText(R.string.ectomorfD);
                            }else
                                if(y>30 && y<=40){
                                    textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                                    textView.setText(R.string.ectomorfD);
                                }else
                                    if(y>40 && y<=50){
                                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                                        textView.setText(R.string.ectomorfD);
                                    }else
                                        if(y>50){
                                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                                            textView.setText(R.string.ectomorfD);
                                        }

                }
                else
                    if (r - (v + g) < 30 && r - (v + g) >= 25) {    //эктоморф и мезоморф(средняя худоба)

                        if(y<=15){
                            textView.setText(R.string.maly);
                            textView2.setText(R.string.malyE);
                        }else
                        if(y>15 && y<18){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.ectomorfD);
                        }else
                        if(y>=18 && y<=30){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.ectomorfD);
                        }else
                        if(y>30 && y<=40){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.ectomorfD);
                        }else
                        if(y>40 && y<=50){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.ectomorfD);
                        }else
                        if(y>50){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.ectomorfD);
                        }
                    }
                    else
                    if (r - (v + g) < 25 && r - (v + g) >= 20) {                //мезоморф(нормальное)

                        if(y<15){
                            textView.setText(R.string.maly);
                            textView2.setText(R.string.malyE);
                        }else
                        if(y>15 && y<18){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }else
                        if(y>=18 && y<=30){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }else
                        if(y>30 && y<=40){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }else
                        if(y>40 && y<=50){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }else
                        if(y>50){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }

                    }
                    else
                    if (r - (v + g) < 20 && r - (v + g) >= 15) {              //мезоморф и эндоморф(нормально но уже больше масса)

                        if(y<15){
                            textView.setText(R.string.maly);
                            textView2.setText(R.string.malyE);
                        }else
                        if(y>=15 && y<18){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }else
                        if(y>=18 && y<=30){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }else
                        if(y>30 && y<=40){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }else
                        if(y>40 && y<=50){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }else
                        if(y>50){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                            textView.setText(R.string.mezomorfD);
                        }

                    }
                    else
                    if (r - (v + g) < 15) {                          //эндоморф(толстый)
                        if(y<15){
                            textView.setText(R.string.maly);
                            textView2.setText(R.string.malyE);
                        }else
                        if(y>15 && y<18){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                            textView.setText(R.string.endomorfD);
                        }else
                        if(y>=18 && y<=30){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                            textView.setText(R.string.endomorfD);
                        }else
                        if(y>30 && y<=40){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                            textView.setText(R.string.endomorfD);
                        }else
                        if(y>40 && y<=50){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                            textView.setText(R.string.endomorfD);
                        }else
                        if(y>50){
                            textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                            textView.setText(R.string.endomorfD);
                        }

                    }

            }
                    else if (zal != null && zal.equals("zal")) {                                         //тренировки в зале
                if (r - (v + g) >= 30) {                                          //эктоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);

                    } else if (y >=15 && y < 18) {
                             textView.setText(R.string.ectomorf2);
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                    } else if (y >=18 && y <= 30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    }
                } else if (r - (v + g) < 30 && r - (v + g) >= 25) {              //эктоморф и мезоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y > 15 && y <=18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.ectomorf3);

                    }
                } else if (r - (v + g) < 25 && r - (v + g) >= 20) {                   //мезоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y > 15 && y <18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    }
                } else
                    if (r - (v + g) < 20 && r - (v + g) >= 15) {                 //мезоморф и эндоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    } else if (y > 18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.mezomorf);

                    }

                } else if (r - (v + g) < 15) {                             //эндоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y <18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.endomorf);

                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.endomorf);

                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.endomorf);

                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.endomorf);

                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.endomorf);

                    }
                }
            }

        }
                                                                                                            //женский
        if(pol1!=null && pol1.equals("pol1")){
            if(dom!=null && dom.equals("dom")){                              //Девушки дома
                if (r - (v + g) >= 30) {                                     //эктоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView.setText(R.string.devushki);
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");

                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    }
                } else if (r - (v + g) < 30 && r - (v + g) >= 25) {          //эктоморф и мезоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devushki);
                    }
                } else if (r - (v + g) < 25 && r - (v + g) >= 20) {                   //мезоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    }
                } else if (r - (v + g) < 20 && r - (v + g) >= 15) {                  //мезоморф и эндоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devushki);
                    }

                } else if (r - (v + g) < 15) {                             //эндоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devushki);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devushki);
                    }
                }
            }

            else
            if(zal!=null && zal.equals("zal")){                     //Девушки зал
                if (r - (v + g) >= 30) {                              //эктоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);

                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    }
                } else if (r - (v + g) < 30 && r - (v + g) >= 25) {               //эктоморф и мезоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle*10+"гр\n"+"Белков:"+bel*10+"гр\n"+"Жиров:"+gir*10+"гр");
                        textView.setText(R.string.devuskizal);
                    }
                } else if (r - (v + g) < 25 && r - (v + g) >= 20) {                   //мезоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);

                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);
                    }
                } else if (r - (v + g) < 20 && r - (v + g) >= 15) {                  //мезоморф и эндоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);

                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle2*10+"гр\n"+"Белков:"+bel2*10+"гр\n"+"Жиров:"+gir2*10+"гр");
                        textView.setText(R.string.devuskizal);
                    }

                } else if (r - (v + g) < 15) {                             //эндоморф
                    if (y < 15) {
                        textView.setText(R.string.maly);
                        textView2.setText(R.string.malyE);
                    } else if (y >=15 && y < 18) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y >=18 && y <=30) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 30 && y <=40) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 40 && y <=50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devuskizal);
                    } else if (y > 50) {
                        textView2.setText("Данное колличество калорий вам нужно употреблять за день:"+a+"\n"+"Углеводов: "+ygle3*10+"гр\n"+"Белков:"+bel3*10+"гр\n"+"Жиров:"+gir3*10+"гр");
                        textView.setText(R.string.devuskizal);
                    }
                }
            }
        }
            }

    public void onClick(View view) {


        Intent intent = new Intent(this, MainActivitysovet.class);

        startActivity(intent);
    }

}








