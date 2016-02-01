package com.telefuns.sample.calc;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class NativeServiceHandler extends Service {
    private static final String TAG = "NativeServiceHandler";
    private final Binder serviceBinder = new Binder();

    @Override
    public IBinder onBind(Intent intent)
    {
        Log.i(TAG, "onBind");
        return serviceBinder;
    }

    @Override
    public boolean onUnbind(Intent intent)
    {
        Log.i(TAG, "onUnbind");
        return false;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.i(TAG, "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Log.i(TAG, "onStartCommand " + start(42));
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy()
    {
        Log.i(TAG, "onDestroy " + stop(42));
        super.onDestroy();

    }

    static
    {
        Log.i(TAG, "System.loadLibrary(\"calcUtil\");");
        System.loadLibrary("calcUtil");
    }

    public static native int start(long aValue);
    public static native int stop(long aValue);
}