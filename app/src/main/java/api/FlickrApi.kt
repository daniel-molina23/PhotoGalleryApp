package api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=3b79b32c91d6f52f5078480fb935b97d" +
                "&format=json"+
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos() : Call<FlickrResponse>

    @GET //causes retrofit to override the base url completely
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}