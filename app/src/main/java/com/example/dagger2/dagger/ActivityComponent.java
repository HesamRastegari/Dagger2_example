package com.example.dagger2.dagger;


import com.example.dagger2.MainActivity;
import com.example.dagger2.car.Car;
import com.example.dagger2.car.DieselEngine;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

//    @Subcomponent.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(@BindsInstance @Named("horse power")int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
////        Builder appComponent (AppComponent component);
//
//        ActivityComponent build();
//    }

    @Subcomponent.Factory
    interface Factory {

        ActivityComponent create(@BindsInstance @Named("horse power")int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity );
    }
}
