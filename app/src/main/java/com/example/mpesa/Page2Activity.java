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

public class Page2Activity extends AppCompatActivity {

    ListView listview;
    Button view;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listview = (ListView) findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Send Money");
        list.add("Withdraw Cash");
        list.add("Buy Airtime");
        list.add("Loans and Savings");
        list.add("Lipa na Mpesa");
        list.add("My Account");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch(i){

                    case 0:
                        Toast.makeText(Page2Activity.this,"Send Money has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(Page2Activity.this,SendActivity.class);
                        startActivity(intent);

                        break;

                    case 1:
                        Toast.makeText(Page2Activity.this,"Withdraw Cash has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(Page2Activity.this,WithdrawActivity.class);
                        startActivity(intent);

                        break;
                    case 2:
                        Toast.makeText(Page2Activity.this,"Buy Airtime has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(Page2Activity.this,BuyActivity.class);
                        startActivity(intent);

                        break;

                    case 3:
                        Toast.makeText(Page2Activity.this,"Loans and Savings has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(Page2Activity.this,LoansActivity.class);
                        startActivity(intent);

                        break;

                    case 4:
                        Toast.makeText(Page2Activity.this,"Lipa na Mpesa has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(Page2Activity.this,LipaActivity.class);
                        startActivity(intent);

                        break;

                    case 5:
                        Toast.makeText(Page2Activity.this,"My Account has been clicked",Toast.LENGTH_LONG).show();

                        intent = new Intent(Page2Activity.this,MyAccountActivity.class);
                        startActivity(intent);

                        break;
                }

            }
        });


    }



}