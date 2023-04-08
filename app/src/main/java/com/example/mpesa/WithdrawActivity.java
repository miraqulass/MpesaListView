package com.example.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class WithdrawActivity extends AppCompatActivity {
    ListView listview;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);

        listview = (ListView) findViewById(R.id.withdraw);

        List<String> list = new ArrayList<>();
        list.add("From Agent");
        list.add("From ATM");
        ArrayAdapter adapter = new ArrayAdapter(WithdrawActivity.this, android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch(i){

                    case 0:
                        Toast.makeText(WithdrawActivity.this,"From Agent has been clicked",Toast.LENGTH_LONG).show();

                        break;

                    case 1:
                        Toast.makeText(WithdrawActivity.this,"From ATM has been clicked",Toast.LENGTH_LONG).show();
                        break;
                }

            }
        });
    }
}