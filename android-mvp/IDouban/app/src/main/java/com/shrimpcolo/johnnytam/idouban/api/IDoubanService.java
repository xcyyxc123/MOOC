package com.shrimpcolo.johnnytam.idouban.api;

import com.shrimpcolo.johnnytam.idouban.movie.HotMoviesInfo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Johnny Tam on 2017/4/27.
 */

public interface IDoubanService {
    String BASE_URL = "https://api.douban.com/v2/";

    @GET("movie/in_theaters")
    Call<HotMoviesInfo> searchHotMovies();
}