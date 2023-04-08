package com.example.mpesa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class LoansActivity extends AppCompatActivity {

    ListView listview;
    Button view;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listview = (ListView) findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("M-Shwari");
        list.add("KCB M-PESA");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch(i){

                    case 0:
                        Toast.makeText(LoansActivity.this,"M-Shwari has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(LoansActivity.this,MshwariActivity.class);
                        startActivity(intent);

                        break;

                    case 1:
                        Toast.makeText(LoansActivity.this,"KCB M-PESA has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(LoansActivity.this,KcbActivity.class);
                        startActivity(intent);

                        break;

                }

            }
        });


    }



}