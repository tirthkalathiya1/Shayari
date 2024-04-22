package com.example.listshayri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdLoader
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions

class MainActivity3 : AppCompatActivity() {

    lateinit var pager:ViewPager
//    lateinit var backword:ImageView
//    lateinit var forword:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        pager=findViewById(R.id.pager)
//        backword=findViewById(R.id.backword)
//        forword=findViewById(R.id.forword)


        MobileAds.initialize(this)
        val adLoader = AdLoader.Builder(this, "ca-app-pub-3940256099942544/2247696110")
            .forNativeAd(object : NativeAd.OnNativeAdLoadedListener {


                override fun onNativeAdLoaded(nativeAd: NativeAd) {
                    val styles =
                        NativeTemplateStyle.Builder().build()
                    val template = findViewById<TemplateView>(R.id.my_template)
                    template.setStyles(styles)
                    template.setNativeAd(nativeAd)
                }
            })
            .build()

        adLoader.loadAd(AdRequest.Builder().build())




        var  tt =intent.getStringArrayExtra("array")

        var pos=intent.getIntExtra("pos",0)



        var mhypager = MyPAger(this,tt)

        pager.adapter = mhypager


        pager.setCurrentItem(pos)



////        var weee=intent.getStringArrayExtra("array")
//
//
//        Log.e("==", "onCreate: ${tt!![pos]}")
//        txt1.setText(tt!![pos])
//
//        backword.setOnClickListener {
//
//            if(pos>0)
//            {
//                pos--;
//                txt1.text  = tt!![pos].toString()
//            }
//            else {
//
//                Toast.makeText(this,"NO MORE SHAYRI",Toast.LENGTH_LONG).show()
//            }
//
//        }
//        forword.setOnClickListener {
//
//            if(pos<3){
//                pos++;
//                txt1.text =tt!![pos].toString()
//            }
//            else {
//                Toast.makeText(this, "No Shayari", Toast.LENGTH_LONG).show()
//            }
//
//       }

    }
}