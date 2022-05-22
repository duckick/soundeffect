package iliun.com.soundeffect


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import iliun.com.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    lateinit var mAdView: AdView

    private var mInterstitialAd: InterstitialAd? = null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1500L)
        installSplashScreen()

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        MobileAds.initialize(this)
        MobileAds.setAppMuted(true)
        var adRequest = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-9826145572344148/5621190900", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                mInterstitialAd = interstitialAd
            }
        })



        binding.btnAnimal.setOnClickListener {

            intent = Intent(this,AnimalActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnTool.setOnClickListener {
            intent = Intent(this,ToolActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnHoror.setOnClickListener {
            intent = Intent(this,HororActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnSf.setOnClickListener {
            intent = Intent(this,SfActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }



        binding.btnTranspor.setOnClickListener {
            intent = Intent(this,TransporActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnWeapon.setOnClickListener {
            intent = Intent(this,WeaponActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnRhythm.setOnClickListener {
            intent = Intent(this,RhythmActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnBell.setOnClickListener {
            intent = Intent(this,BellActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnKitchen.setOnClickListener {
            intent = Intent(this,KitchenActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnHuman.setOnClickListener {
            intent = Intent(this,HumanActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnOffice.setOnClickListener {
            intent = Intent(this,OfficeActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnBird.setOnClickListener {
            intent = Intent(this,BirdActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnInstrument.setOnClickListener {
            intent = Intent(this,InstrumentActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnComic.setOnClickListener {
            intent = Intent(this,ComicActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }




        binding.btnNature.setOnClickListener {
            intent = Intent(this,NatureActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }

        binding.btnJoke.setOnClickListener {
            intent = Intent(this,EtcActivity::class.java)
            startActivity(intent)
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
        }





    }

    override fun onBackPressed() {
        finish()
    }
}

