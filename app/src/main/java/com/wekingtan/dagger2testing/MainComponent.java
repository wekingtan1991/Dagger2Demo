package com.wekingtan.dagger2testing;

import dagger.Component;

@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
