package com.example.bookmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.Toast;

public class BooksActivity extends AppCompatActivity {

    TableLayout upperObj, lowerObj; // 1번 레이아웃 2번 레이아웃
    ImageView leftObj, rightObj;

    ImageView book11obj, book12obj, book13obj, book14obj, book21obj, book22obj,book23obj, book24obj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        upperObj = (TableLayout) findViewById(R.id.layout1);
        lowerObj = (TableLayout) findViewById(R.id.layout2);
        leftObj = (ImageView) findViewById(R.id.lftBtn);
        rightObj = (ImageView) findViewById(R.id.rightBtn);

        book11obj =(ImageView) findViewById(R.id.img11);
        book12obj =(ImageView) findViewById(R.id.img12);
        book13obj =(ImageView) findViewById(R.id.img13);
        book14obj =(ImageView) findViewById(R.id.img14);

        book21obj =(ImageView) findViewById(R.id.img21);
        book22obj =(ImageView) findViewById(R.id.img22);
        book23obj =(ImageView) findViewById(R.id.img23);
        book24obj =(ImageView) findViewById(R.id.img24);


        leftObj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {      //1번 레이아웃 보이기
                lowerObj.setVisibility(View.INVISIBLE);
                upperObj.setVisibility(View.VISIBLE);
            }
        });
        rightObj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upperObj.setVisibility(View.INVISIBLE);
                lowerObj.setVisibility(View.VISIBLE);
            }
        });

        book11obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자바 코딩의 기술", Toast.LENGTH_SHORT).show();
            }
        });

        book12obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"머신러닝을 다루는 기술", Toast.LENGTH_SHORT).show();
            }
        });

        book13obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"모던 리눅스 관리", Toast.LENGTH_SHORT).show();
            }
        });

        book14obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"유니티 교과서", Toast.LENGTH_SHORT).show();
            }
        });

        book21obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자바 코딩의 기술", Toast.LENGTH_SHORT).show();
            }
        });

        book22obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"머신러닝을 다루는 기술", Toast.LENGTH_SHORT).show();
            }
        });

        book23obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"모던 리눅스 관리", Toast.LENGTH_SHORT).show();
            }
        });


        book24obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"유니티 교과서", Toast.LENGTH_SHORT).show();
            }
        });

    }
}