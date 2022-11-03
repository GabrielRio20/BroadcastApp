package com.example.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.sql.CallableStatement;

public class CustomReceiver extends BroadcastReceiver {
    private final static String ACTION_CUSTOM_BROADCAST = "action-custom-broadcast";

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        if(intentAction != null){
            String toastMessage = "unknown";
            switch (intentAction){
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "power connected";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "power disconnected";
                    break;
                case ACTION_CUSTOM_BROADCAST:
                    toastMessage = "Yeay!";
                    break;
            }
            Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}
