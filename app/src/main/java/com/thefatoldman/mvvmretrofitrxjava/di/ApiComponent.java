package com.thefatoldman.mvvmretrofitrxjava.di;

import com.thefatoldman.mvvmretrofitrxjava.model.CountriesService;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

}
