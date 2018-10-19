package com.pierfrancescosoffritti.youtubeplayer.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.pierfrancescosoffritti.youtubeplayer.utils.Utils;

public class NetworkReceiver extends BroadcastReceiver {

    public interface NetworkListener {
        void onNetworkAvailable();
        void onNetworkUnavailable();
    }

    private NetworkListener networkListener;

    public NetworkReceiver(NetworkListener networkListener) {
        this.networkListener = networkListener;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if(Utils.isOnline(context))
            networkListener.onNetworkAvailable();
        else
            networkListener.onNetworkUnavailable();
    }
}
