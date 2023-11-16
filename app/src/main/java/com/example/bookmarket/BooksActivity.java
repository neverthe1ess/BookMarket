package com.example.bookmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                BookItem1();
            }
        });

        book12obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"머신러닝을 다루는 기술", Toast.LENGTH_SHORT).show();
                BookItem2();
            }
        });

        book13obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"모던 리눅스 관리", Toast.LENGTH_SHORT).show();
                BookItem3();
            }
        });

        book14obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"유니티 교과서", Toast.LENGTH_SHORT).show();
                BookItem4();
            }
        });

        book21obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자바 코딩의 기술", Toast.LENGTH_SHORT).show();
                BookItem1();
            }
        });

        book22obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"머신러닝을 다루는 기술", Toast.LENGTH_SHORT).show();
                BookItem2();
            }
        });

        book23obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"모던 리눅스 관리", Toast.LENGTH_SHORT).show();
                BookItem3();
            }
        });


        book24obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"유니티 교과서", Toast.LENGTH_SHORT).show();
                BookItem4();
            }
        });
    }
    public void BookItem1(){
        Intent intent = new Intent(getApplicationContext(), BookActivity.class);
        intent.putExtra("id", "book11");
        intent.putExtra("name", "자바 코딩의 기술");
        intent.putExtra("price", "22000");
        intent.putExtra("date", "2020-07-30");
        intent.putExtra("writer", "사이먼 하러,리누스 디에츠,요르그 레너드/심지현");
        intent.putExtra("page", "264쪽");
        intent.putExtra("description", "코딩 스킬을 개선하는 " +
                "가장 좋은 방법은 전문가의 코드를 읽는 것이다. " +
                "오픈 소스 코드를 읽으면서 이해하면 좋지만," +
                "너무 방대하고 스스로 맥락을 찾는 게 어려울 수 있다." +
                "그럴 땐 이 책처럼 현장에서 자주 발견되는 문제 유형 70가지와 " +
                "해법을 비교하면서 자신의 코드에서 개선할 점을 찾는 것이 좋다.");
        intent.putExtra("category", "프로그래밍/오픈소스");
        startActivity(intent);
    }
    public void BookItem2(){
        Intent intent = new Intent(getApplicationContext(), BookActivity.class);
        intent.putExtra("id", "book21");
        intent.putExtra("name", "머신러닝를 다루는 기술");
        intent.putExtra("price", "42000");
        intent.putExtra("date", "2022-07-30");
        intent.putExtra("writer", "사이먼 하러,심지현");
        intent.putExtra("page", "364쪽");
        intent.putExtra("description", "코딩 스킬을 개선하는 " +
                "가장 좋은 방법은 전문가의 코드를 읽는 것이다. " +
                "오픈 소스 코드를 읽으면서 이해하면 좋지만," +
                "너무 방대하고 스스로 맥락을 찾는 게 어려울 수 있다." +
                "그럴 땐 이 책처럼 현장에서 자주 발견되는 문제 유형 70가지와 " +
                "해법을 비교하면서 자신의 코드에서 개선할 점을 찾는 것이 좋다.");
        intent.putExtra("category", "프로그래밍/오픈소스");
        startActivity(intent);
    }
    public void BookItem3(){
        Intent intent = new Intent(getApplicationContext(), BookActivity.class);
        intent.putExtra("id", "book31");
        intent.putExtra("name", "모던 리눅스 관리");
        intent.putExtra("price", "72000");
        intent.putExtra("date", "2020-07-30");
        intent.putExtra("writer", "요르그 레너드/심지현");
        intent.putExtra("page", "284쪽");
        intent.putExtra("description", "코딩 스킬을 개선하는 " +
                "가장 좋은 방법은 전문가의 코드를 읽는 것이다. " +
                "오픈 소스 코드를 읽으면서 이해하면 좋지만," +
                "너무 방대하고 스스로 맥락을 찾는 게 어려울 수 있다." +
                "그럴 땐 이 책처럼 현장에서 자주 발견되는 문제 유형 70가지와 " +
                "해법을 비교하면서 자신의 코드에서 개선할 점을 찾는 것이 좋다.");
        intent.putExtra("category", "프로그래밍/오픈소스");
        startActivity(intent);
    }
    public void BookItem4(){
        Intent intent = new Intent(getApplicationContext(), BookActivity.class);
        intent.putExtra("id", "book41");
        intent.putExtra("name", "유니티 교과서");
        intent.putExtra("price", "12000");
        intent.putExtra("date", "2023-07-30");
        intent.putExtra("writer", "리누스 디에츠,요르그 레너드/심지현");
        intent.putExtra("page", "421쪽");
        intent.putExtra("description", "코딩 스킬을 개선하는 " +
                "가장 좋은 방법은 전문가의 코드를 읽는 것이다. " +
                "오픈 소스 코드를 읽으면서 이해하면 좋지만," +
                "너무 방대하고 스스로 맥락을 찾는 게 어려울 수 있다." +
                "그럴 땐 이 책처럼 현장에서 자주 발견되는 문제 유형 70가지와 " +
                "해법을 비교하면서 자신의 코드에서 개선할 점을 찾는 것이 좋다.");
        intent.putExtra("category", "프로그래밍/오픈소스");
        startActivity(intent);
    }
}