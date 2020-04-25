package com.example.dagger2.dagger;

import com.example.dagger2.car.DieselEngine;
import com.example.dagger2.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsepower(){
        return horsePower;
    }
    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }


}
