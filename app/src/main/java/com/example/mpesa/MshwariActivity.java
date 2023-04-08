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

public class MshwariActivity extends AppCompatActivity {

    ListView listview;
    Button view;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listview = (ListView) findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Send to M-Shwari");
        list.add("Withdraw from M-Shwari");
        list.add("Lock Savings Account");
        list.add("Loan @ 9% for 30 days");
        list.add("Check Balance");
        list.add("Mini Statement");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch(i){

                    case 0:
                        Toast.makeText(MshwariActivity.this,"Safaricom+ has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(MshwariActivity.this,Page2Activity.class);
                        startActivity(intent);

                        break;

                    case 1:
                        Toast.makeText(MshwariActivity.this,"M-PESA has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(MshwariActivity.this,Page2Activity.class);
                        startActivity(intent);

                        break;

                    case 2:
                        Toast.makeText(MshwariActivity.this,"Safaricom+ has been clicked",Toast.LENGTH_LONG).show();

                        break;

                    case 3:
                        Toast.makeText(MshwariActivity.this,"Safaricom+ has been clicked",Toast.LENGTH_LONG).show();

                        break;

                    case 4:
                        Toast.makeText(MshwariActivity.this,"Safaricom+ has been clicked",Toast.LENGTH_LONG).show();

                        break;

                    case 5:
                        Toast.makeText(MshwariActivity.this,"Safaricom+ has been clicked",Toast.LENGTH_LONG).show();

                        break;

                }

            }
        });


    }



}