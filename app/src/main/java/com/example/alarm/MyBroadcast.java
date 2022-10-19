package com.example.alarm;

import android.content.BroadcastReceiver;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        Integer numeroGerado = intent.getIntExtra("numeroGerado", 0);
        Toast.makeText(context, "Numero gerado: " + numeroGerado, android.widget.Toast.LENGTH_SHORT).show();
        Log.i("MyBroadcastGerado", "Numero gerado: " + numeroGerado);
    }
}
