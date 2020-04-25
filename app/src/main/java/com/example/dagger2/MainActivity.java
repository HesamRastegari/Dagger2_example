package com.example.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2.car.Car;
import com.example.dagger2.dagger.ActivityComponent;
import com.example.dagger2.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActiviyComponentFactory().create(150,1400);

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
