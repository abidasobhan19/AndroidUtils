package com.forbitbd.androidutils.api;




import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiClient {

    @GET
    Call<ResponseBody> getImage(@Url String url);
    //Suppliers
}
