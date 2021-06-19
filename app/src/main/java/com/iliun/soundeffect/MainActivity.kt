package com.iliun.soundeffect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.iliun.soundeffect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager2.adapter = ViewPagerAdapter(this)


        MobileAds.initialize(this) {}

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

    }

}
