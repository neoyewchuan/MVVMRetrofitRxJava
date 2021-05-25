package com.thefatoldman.mvvmretrofitrxjava.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CountryApi {

    @GET("DevTides/countries/master/countriesV2.json")
    Single<List<CountryModel>> getCountries();


}
