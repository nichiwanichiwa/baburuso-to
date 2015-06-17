package com.example.nakayamanobuo.baburuso_to;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {
    int x = 0;
    int y = 0;
    String[] name = new String[5];//配列name
    int[] score = new int[5];//配列score


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnadd = (Button) findViewById(R.id.add);
        btnadd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String names;
                int scores;

                EditText namet = (EditText) findViewById(R.id.name);
                names = namet.getText().toString();//stringに変換
                name[x] = names;//配列にいれる。

                EditText scoret = (EditText) findViewById(R.id.score);
                String scoreg = scoret.getText().toString();//stringに変換
                scores = Integer.parseInt(scoreg);//INTに変換
                score[y] = scores;//配列に入れる。

                switch (x) {
                    case 0:
                        TextView a = (TextView) findViewById(R.id.textView3);
                        a.setText("名前は" + name[x] + "点数は" + score[y] + "です。\n");
                        break;
                    case 1:
                        TextView b = (TextView) findViewById(R.id.textView4);
                        b.setText("名前は" + name[x] + "点数は" + score[y] + "です。\n");
                        break;
                    case 2:
                        TextView c = (TextView) findViewById(R.id.textView5);
                        c.setText("名前は" + name[x] + "点数は" + score[y] + "です。\n");
                        break;
                    case 3:
                        TextView d = (TextView) findViewById(R.id.textView6);
                        d.setText("名前は" + name[x] + "点数は" + score[y] + "です。\n");
                        break;
                    case 4:
                        TextView e = (TextView) findViewById(R.id.textView7);
                        e.setText("名前は" + name[x] + "点数は" + score[y] + "です。\n");
                        break;
                    default:
                        break;
                }
                x++;
                y++;
                if (x >= 5) {
                    x = 0;
                    y = 0;
                }

                namet.setText("");
                scoret.setText("");
            }
        });


        final CheckBox chkbox = (CheckBox) findViewById(R.id.nobuoruBox);
        chkbox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (chkbox.isChecked() == true) {
                    int temp;
                    String tempS;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 4; j > i; j--) {
                            if (score[j - 1] >= score[j]) {
                                temp = score[j];
                                score[j] = score[j - 1];
                                score[j - 1] = temp;

                                tempS = name[j];
                                name[j] = name[j - 1];
                                name[j - 1] = tempS;
                            }
                        }
                    }
                }
            }
        });


        final CheckBox chkbox2 = (CheckBox) findViewById(R.id.oriruBox);
        chkbox2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (chkbox2.isChecked() == true) {
                    int temp;
                    String tempS;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 4; j > i; j--) {
                            if (score[j - 1] <= score[j]) {
                                temp = score[j];
                                score[j] = score[j - 1];
                                score[j - 1] = temp;

                                tempS = name[j];
                                name[j] = name[j - 1];
                                name[j - 1] = tempS;
                            }
                        }
                    }
                 }
            }
        });

        Button btnnoboru = (Button) findViewById(R.id.noboru);
        btnnoboru.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                       TextView a = (TextView) findViewById(R.id.textView3);
                       a.setText("名前は" + name[0] + "点数は" + score[0] + "です。\n");
                       TextView b = (TextView) findViewById(R.id.textView4);
                       b.setText("名前は" + name[1] + "点数は" + score[1] + "です。\n");
                       TextView c = (TextView) findViewById(R.id.textView5);
                       c.setText("名前は" + name[2] + "点数は" + score[2] + "です。\n");
                       TextView d = (TextView) findViewById(R.id.textView6);
                       d.setText("名前は" + name[3] + "点数は" + score[3] + "です。\n");
                       TextView e = (TextView) findViewById(R.id.textView7);
                       e.setText("名前は" + name[4] + "点数は" + score[4] + "です。\n");
                        }

        });

    }
}