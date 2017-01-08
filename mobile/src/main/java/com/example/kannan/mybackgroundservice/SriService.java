package com.example.kannan.mybackgroundservice;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by kannan on 1/9/2017.
 */

public class SriService extends IntentService {
    public SriService() {
        super("My_worker_thread");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        Toast.makeText(this,"Start Service............",Toast.LENGTH_LONG).show();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {

        Toast.makeText(this,"Stop Service.....",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(Intent intent) {


        synchronized (this) {
            int count = 0;

            while (count < 10) {

                try {
                    wait(5000);
                    count++;
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        }

    }
}
