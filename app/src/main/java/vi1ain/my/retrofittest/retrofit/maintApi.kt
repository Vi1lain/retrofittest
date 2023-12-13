package vi1ain.my.retrofittest.retrofit

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

sealed interface maintApi {
    @GET("products/{id}") //базовая ссылка
   suspend fun getProductByID(@Path("id")id:Int):Product

   @POST ("auth/login")
   suspend fun auth(@Body authRequest: AuthRequest)
}