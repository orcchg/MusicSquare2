package com.orcchg.musicsquare2.data.repository.remote.endpoint;

import com.orcchg.musicsquare2.data.model.Musician;
import com.orcchg.musicsquare2.data.repository.remote.RetrofitCreator;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

// TODO: Singleton
public class YandexEndpoint {

    private static final String ENDPOINT = "http://download.cdn.yandex.net/";
    private final RestApi restApi;

    public YandexEndpoint() {
        Retrofit retrofit = RetrofitCreator.create(ENDPOINT);
        restApi = retrofit.create(RestApi.class);
    }

    interface RestApi {
        @GET("/mobilization-2016/{path}")
        Observable<List<Musician>> getMusicians(@Path("path") String path);
    }

    public Observable<List<Musician>> getMusicians() {
        return restApi.getMusicians("artists.json");
    }
}
