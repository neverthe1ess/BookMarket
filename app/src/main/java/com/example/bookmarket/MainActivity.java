package com.example.bookmarket;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBookClick(View view){
        Toast.makeText(getApplicationContext(),"도서목록 클릭",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), BooksActivity.class);
        startActivity(intent);
    }
    public void onVideoClick(View view){
        Toast.makeText(getApplicationContext(),"동영상강좌 클릭",Toast.LENGTH_LONG).show();
    }

    public void onCustomerClick(View view){
        Toast.makeText(getApplicationContext(),"고객센터 클릭",Toast.LENGTH_LONG).show();
    }

    public void onMyPageClick(View view){
        Toast.makeText(getApplicationContext(),"마이페이지 클릭",Toast.LENGTH_LONG).show();
    }
    public void onImageClick(View view){
        ImageView menuObj  = (ImageView) findViewById(R.id.imageView);
        if (i %2 == 0) menuObj.setImageResource(R.drawable.cover02);
        else menuObj.setImageResource(R.drawable.cover01);
        i++;
    }
}