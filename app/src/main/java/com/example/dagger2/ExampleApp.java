package com.example.dagger2;

import android.app.Application;

import com.example.dagger2.dagger.ActivityComponent;
import com.example.dagger2.dagger.AppComponent;
import com.example.dagger2.dagger.DaggerAppComponent;
import com.example.dagger2.dagger.DriverModule;

public class ExampleApp extends Application {

    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("Hans"));
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
