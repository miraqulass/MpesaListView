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

public class MyAccountActivity extends AppCompatActivity {

    ListView listview;
    Button view;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listview = (ListView) findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Mini Statement");
        list.add("Check Balance");
        list.add("Change M-PESA PIN");
        list.add("Change Language");
        list.add("Update Customer Menu");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch(i){

                    case 0:
                        Toast.makeText(MyAccountActivity.this,"Mini Statement has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(MyAccountActivity.this,MiniActivity.class);
                        startActivity(intent);

                        break;

                    case 1:
                        Toast.makeText(MyAccountActivity.this,"Check Balance has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(MyAccountActivity.this,CheckActivity.class);
                        startActivity(intent);

                        break;
                    case 2:
                        Toast.makeText(MyAccountActivity.this,"Change M-PESA PIN has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(MyAccountActivity.this,ChangePinActivity.class);
                        startActivity(intent);

                        break;

                    case 3:
                        Toast.makeText(MyAccountActivity.this,"Change Language has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(MyAccountActivity.this,ChangeLangActivity.class);
                        startActivity(intent);

                        break;

                    case 4:
                        Toast.makeText(MyAccountActivity.this,"Update Customer Menu has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(MyAccountActivity.this,UpdateActivity.class);
                        startActivity(intent);

                        break;

                }

            }
        });


    }



}