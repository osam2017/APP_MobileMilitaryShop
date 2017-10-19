package com.example.administrator.kshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Sub4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button sub4_button1 = (Button) findViewById(R.id.sub4_button1);
        sub4_button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Sub1Activity.class);
                startActivity(intent);
                finish();
            }
        });

        Button sub4_button2 = (Button) findViewById(R.id.sub4_button2);
        sub4_button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Sub2Activity.class);
                startActivity(intent);
                finish();
            }
        });

        Button sub4_button3 = (Button) findViewById(R.id.sub4_button3);
        sub4_button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Sub3Activity.class);
                startActivity(intent);
                finish();
            }
        });

        Button sub4_button5 = (Button) findViewById(R.id.sub4_button5);
        sub4_button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Sub5Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_bt1:
                Toast.makeText(this, "장바구니를 눌렀습니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ShoppingCartActivity.class);
                startActivity(intent);
                break;
            case R.id.action_bt2:
                Intent i = new Intent(Sub4Activity.this, LoginActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(i);
                Toast.makeText(this, "로그아웃이 되었습니다.", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}