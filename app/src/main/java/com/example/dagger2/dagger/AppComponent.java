package com.example.dagger2.dagger;

import com.example.dagger2.car.Driver;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

//    Driver getDriver();

    ActivityComponent.Factory getActiviyComponentFactory();


    @Component.Factory
    interface Factory{
        AppComponent create(DriverModule driverModule);
    }
}
