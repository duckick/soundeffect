package iliun.com


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import iliun.com.databinding.ActivityMainBinding
import iliun.com.soundeffect.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager2.adapter = ViewPagerAdapter(this)
//        binding.viewPager2.setCurrentItem(Int.MAX_VALUE/6,false) 무한스크롤. 일단보류

        MobileAds.initialize(this) {}

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val dotsIndicator = binding.dotsIndicator
        val viewPager = binding.viewPager2
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter
        dotsIndicator.setViewPager2(viewPager)

    }
//      2번 눌러 종료. 일단보류
//    private var backPressedTime : Long = 0
//    override fun onBackPressed() {
//
//        //
//        if (System.currentTimeMillis() - backPressedTime < 2000) {
//            finish()
//            return
//        }
//
//        //
//        Toast.makeText(this, "한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show()
//        backPressedTime = System.currentTimeMillis()
//    }


}

