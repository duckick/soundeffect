package iliun.com


import android.content.Context
import android.os.Bundle
import android.os.CountDownTimer
import android.util.DisplayMetrics
import android.view.KeyEvent
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.ads.*
import com.google.android.gms.ads.formats.UnifiedNativeAd
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import iliun.com.databinding.ActivityMainBinding
import iliun.com.soundeffect.Fragment1
import iliun.com.soundeffect.ViewPagerAdapter
import java.lang.reflect.Array.get

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

    override fun onBackPressed() {
        ActivityCompat.finishAffinity(this)
    }

 }

//    public override fun onPause() {
//        mAdView.pause()
//        super.onPause()
//    }
//
//    public override fun onResume() {
//        super.onResume()
//        mAdView.resume()
//    }
//
//    public override fun onDestroy() {
//        mAdView.destroy()
//        super.onDestroy()
//    }




//    fun countdown() {
//        val countDownTimer:CountDownTimer = object : CountDownTimer(5000,0) {
//            override fun onTick(millisUntilFinished: Long) {
//                Toast.makeText(this,"${millisUntilFinished}초 뒤 실행됩니다",Toast.LENGTH_SHORT).show()
//            }
//            override fun onFinish() {
//            }
//        }
//    }
//

    //      2번 눌러 종료. 일단보류
//    private var backPressedTime : Long = 0
//    override fun onBackPressed() {
//        //
//        if (System.currentTimeMillis() - backPressedTime < 2000) {
//            finish()
//            return
//        }
//        //
//        Toast.makeText(this, "한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show()
//        backPressedTime = System.currentTimeMillis()
//    }
