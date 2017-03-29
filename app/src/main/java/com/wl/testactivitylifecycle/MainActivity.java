package com.wl.testactivitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("sss","------------A-----------onCreate");
    }
    public void onclick(View v){
        Intent intent=new Intent(this,Bactivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("sss","------------A-----------onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("sss","------------A-----------onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("sss","------------A-----------onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("sss","------------A-----------onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("sss","------------A-----------onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("sss","------------A-----------onRestart");
    }

}
