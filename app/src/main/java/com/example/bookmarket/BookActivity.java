package com.example.bookmarket;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BookActivity extends AppCompatActivity {
    ImageView imgObj;

    TextView bookIDObj, bookNameObj, bookPriceObj, bookDateObj, bookWriterObj ,bookPageObj ,bookDescObj, bookCatObj;



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        imgObj = findViewById(R.id.resImg);
        bookIDObj = findViewById(R.id.resID);
        bookNameObj = findViewById(R.id.resBook);
        bookPriceObj = findViewById(R.id.resPrice);
        bookDateObj = findViewById(R.id.resDate);
        bookWriterObj = findViewById(R.id.resWriter);
        bookPageObj = findViewById(R.id.resPage);
        bookDescObj = findViewById(R.id.resDesc);
        bookCatObj = findViewById(R.id.resCat);

        Intent intent1 = getIntent();
        bookIDObj.setText(intent1.getStringExtra("id"));
        bookNameObj.setText(intent1.getStringExtra("name"));
        bookPriceObj.setText(intent1.getStringExtra("price"));
        bookDateObj.setText(intent1.getStringExtra("date"));
        bookWriterObj.setText(intent1.getStringExtra("writer"));
        bookPageObj.setText(intent1.getStringExtra("page"));
        bookDescObj.setText(intent1.getStringExtra("description"));
        bookCatObj.setText(intent1.getStringExtra("category"));

        switch (intent1.getStringExtra("id")){
            case "book11":
                imgObj.setImageResource(R.drawable.book11);
                break;
            case "book21":
                imgObj.setImageResource(R.drawable.book21);
                break;
            case "book31":
                imgObj.setImageResource(R.drawable.book31);
                break;
            case "book41":
                imgObj.setImageResource(R.drawable.book41);
                break;
        }
    }
}
