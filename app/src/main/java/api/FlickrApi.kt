package api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface FlickrApi {

    @GET("services/rest?method=flickr.interestingness.getList")
    fun fetchPhotos() : Call<FlickrResponse>

    @GET //causes retrofit to override the base url completely
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>

    //append a query parameter named "text"
    @GET("services/rest?method=flickr.photos.search")
    fun searchPhotos(@Query("text") query: String): Call<FlickrResponse>
}