package com.wl.testactivitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by le on 2017/3/29.
 */

public class Bactivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bactivity);
        Log.e("sss","------------B-----------onCreate");
    }
    public void onclick(View v){
        finish();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("sss","------------B-----------onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("sss","------------B-----------onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("sss","------------B-----------onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("sss","------------B-----------onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("sss","------------B-----------onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("sss","------------B-----------onRestart");
    }
}
