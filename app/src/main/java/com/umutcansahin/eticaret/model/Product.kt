package com.umutcansahin.eticaret.model

data class Product(
    val id : String,
    val name : String,
    val price : String,
    val url :String){
    var count = 0
}
/* internetten gelecek verilerdeki isimler ile buradaki isimler aynı olması isi kolaylastırır program
   bizim adımıza internetten gelen veriler ile buradaki degiskenleri eslestirir fakat burada farklı bir
   isim kullanmak zorunda kalırsak -----> degiskenlerin üzerine '@SerializedName' eklememiz gerekir bu eslesmeyi
   yapacaktır*/
