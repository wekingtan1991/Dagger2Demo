package com.wekingtan.dagger2testing;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    Person providesPerson(){
        System.out.println("a person created from MainModule");
        return new Person();
    }
}
