package com.example.listshayri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class MainActivity : AppCompatActivity() {

    lateinit var list: ListView
    var shayri= arrayOf("Morning shayari",
        "Night shayari",
        "Funny shayari",
        "Birthday shayari",
        "Friend shayari",
        "Attitude shayari",
        "Romantic shayari",
        "New year shayari",
        "kite shayari",
        "Sad shayari",
        "Yad shayari",
        "Navaratri shayari",
        "Diwali shayari",
        "God shayari",
        "Other shayari",
        "Motivational shayari")


    lateinit var mAdView : AdView

    private var mInterstitialAd: InterstitialAd? = null
    private final val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list=findViewById(R.id.list)

//        var adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,shayri)

        mAdView = findViewById(R.id.adview)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        var adapter = MyBaseadater(this,shayri)

        list.adapter= adapter




        var adRequestt = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequestt, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d(TAG, adError.toString())
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                Log.d(TAG, "Ad was loaded.")
                mInterstitialAd = interstitialAd
            }
        })

        list.setOnItemClickListener { adapterView, view, i, l ->

            var s=Intent(this@MainActivity,MainActivity2::class.java).putExtra("value",shayri[i]).putExtra("pos",i)
            startActivity(s)


            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.")
            }




        }

    }
}