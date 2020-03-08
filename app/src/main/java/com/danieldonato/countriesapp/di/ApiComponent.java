package com.danieldonato.countriesapp.di;

import com.danieldonato.countriesapp.model.CountriesService;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

}
