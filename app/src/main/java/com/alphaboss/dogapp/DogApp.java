package com.alphaboss.dogapp;

import android.app.Application;
import android.util.Log;

import com.alphaboss.dogapp.net.DogRestClient;
import com.alphaboss.dogapp.net.DogSocketClient;
import com.alphaboss.dogapp.service.DogManager;

public class DogApp extends Application {
    public static final String TAG = DogApp.class.getSimpleName();
    private DogManager mDogManager;
    private DogRestClient mDogRestClient;
    private DogSocketClient mDogSocketClient;

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate");
        super.onCreate();
        mDogManager = new DogManager(this);
        mDogRestClient = new DogRestClient(this);
        mDogSocketClient = new DogSocketClient(this);
        mDogManager.setDogRestClient(mDogRestClient);
        mDogManager.setDogSocketClient(mDogSocketClient);
    }

    public DogManager getDogManager() {
        return mDogManager;
    }

    @Override
    public void onTerminate() {
        Log.d(TAG, "onTerminate");
        super.onTerminate();
    }
}
