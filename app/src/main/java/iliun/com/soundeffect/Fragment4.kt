package iliun.com.soundeffect


import android.app.AlertDialog
import android.media.SoundPool
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.realpacific.clickshrinkeffect.applyClickShrink
import iliun.com.R

class Fragment4 : Fragment() {
    lateinit var mAdView : AdView
    private val soundPool = SoundPool.Builder().setMaxStreams(1).build()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_4, container, false)

        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.shake)
        val aniBtn5 = AnimationUtils.loadAnimation(requireContext(),R.anim.shakeroof)
        val aniLoop = AnimationUtils.loadAnimation(requireContext(),R.anim.bounce)
        val aniLongclick = AnimationUtils.loadAnimation(requireContext(),R.anim.zoomin)
        val mhandler = Handler(Looper.getMainLooper())
//        MobileAds.initialize(requireContext()) {}
        val emptym = soundPool.load(requireContext(),R.raw.empty,1)
        val adRequest = AdRequest.Builder().build()
        fun emptysound()  { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f) }

//--------------------------------------------------------------------------------

        val gun = view.findViewById<ImageButton>(R.id.gun)
        val gunm =  soundPool.load(requireContext(), R.raw.gun, 1)
        gun.setOnClickListener{soundPool.play(gunm, 1.0f, 1.0f, 0, 0, 1.0f)}
        gun.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(gunm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(gunm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }


        val heel = view.findViewById<ImageButton>(R.id.heel)
        val heelm =  soundPool.load(requireContext(), R.raw.heel, 1)
        heel.setOnClickListener{soundPool.play(heelm, 1.0f, 1.0f, 0, 0, 1.0f)}
        heel.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(heelm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(heelm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val horn = view.findViewById<ImageButton>(R.id.horn)
        val hornm =  soundPool.load(requireContext(), R.raw.horn, 1)
        horn.setOnClickListener{soundPool.play(hornm, 0.9f, 0.9f, 0, 0, 1.0f)}
        horn.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(hornm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(hornm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val killed = view.findViewById<ImageButton>(R.id.killed)
        val killedm =  soundPool.load(requireContext(), R.raw.killed, 1)
        killed.setOnClickListener{soundPool.play(killedm, 1.0f, 1.0f, 0, 0, 1.0f)}
        killed.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(killedm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(killedm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val laser = view.findViewById<ImageButton>(R.id.laser)
        val laserm =  soundPool.load(requireContext(), R.raw.laser, 1)
        laser.setOnClickListener{soundPool.play(laserm, 1.0f, 1.0f, 0, 0, 1.0f)}
        laser.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(laserm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(laserm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val laugh = view.findViewById<ImageButton>(R.id.laugh)
        val laughm =  soundPool.load(requireContext(), R.raw.laugh, 1)
        laugh.setOnClickListener{soundPool.play(laughm, 0.9f, 0.9f, 0, 0, 1.0f)}
        laugh.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(laughm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(laughm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val lion = view.findViewById<ImageButton>(R.id.lion)
        val lionm =  soundPool.load(requireContext(), R.raw.lion, 1)
        lion.setOnClickListener{soundPool.play(lionm, 1.0f, 1.0f, 0, 0, 1.0f)}
        lion.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(lionm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(lionm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val marble = view.findViewById<ImageButton>(R.id.marble)
        val marblem =  soundPool.load(requireContext(), R.raw.marble, 1)
        marble.setOnClickListener{soundPool.play(marblem, 1.0f, 1.0f, 0, 0, 1.0f)}
        marble.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(marblem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(marblem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val monkey = view.findViewById<ImageButton>(R.id.monkey)
        val monkeym =  soundPool.load(requireContext(), R.raw.monkey, 1)
        monkey.setOnClickListener{soundPool.play(monkeym, 1.0f, 1.0f, 0, 0, 1.0f)}
        monkey.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(monkeym, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(monkeym, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val monster = view.findViewById<ImageButton>(R.id.monster)
        val monsterm =  soundPool.load(requireContext(), R.raw.monster, 1)
        monster.setOnClickListener{soundPool.play(monsterm, 0.5f, 0.5f, 0, 0, 1.0f)}
        monster.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(monsterm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(monsterm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val mosquito = view.findViewById<ImageButton>(R.id.mosquito)
        val mosquitom =  soundPool.load(requireContext(), R.raw.mosquito, 1)
        mosquito.setOnClickListener{soundPool.play(mosquitom, 1.0f, 1.0f, 0, 0, 1.0f)}
        mosquito.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(mosquitom, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(mosquitom, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val nope = view.findViewById<ImageButton>(R.id.nope)
        val nopem =  soundPool.load(requireContext(), R.raw.nope, 1)
        nope.setOnClickListener{soundPool.play(nopem, 1.0f, 1.0f, 0, 0, 1.0f)}
        nope.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(nopem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(nopem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val oh = view.findViewById<ImageButton>(R.id.oh)
        val ohm =  soundPool.load(requireContext(), R.raw.oh, 1)
        oh.setOnClickListener{soundPool.play(ohm, 1.0f, 1.0f, 0, 0, 1.0f)}
        oh.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(ohm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(ohm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val punch = view.findViewById<ImageButton>(R.id.punch)
        val punchm =  soundPool.load(requireContext(), R.raw.punch, 1)
        punch.setOnClickListener{soundPool.play(punchm, 1.0f, 1.0f, 0, 0, 1.0f)}
        punch.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(punchm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(punchm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val question = view.findViewById<ImageButton>(R.id.question)
        val questionm =  soundPool.load(requireContext(), R.raw.question, 1)
        question.setOnClickListener{soundPool.play(questionm, 1.0f, 1.0f, 0, 0, 1.0f)}
        question.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(questionm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(questionm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val scream = view.findViewById<ImageButton>(R.id.scream)
        val screamm =  soundPool.load(requireContext(), R.raw.scream, 1)
        scream.setOnClickListener{soundPool.play(screamm, 0.8f, 0.8f, 0, 0, 1.0f)}
        scream.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(screamm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(screamm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val semitruck = view.findViewById<ImageButton>(R.id.semitruck)
        val semitruckm =  soundPool.load(requireContext(), R.raw.semitruck, 1)
        semitruck.setOnClickListener{soundPool.play(semitruckm, 0.8f, 0.8f, 0, 0, 1.0f)}
        semitruck.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(semitruckm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(semitruckm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val sighman = view.findViewById<ImageButton>(R.id.sighman)
        val sighmanm =  soundPool.load(requireContext(), R.raw.sighman, 1)
        sighman.setOnClickListener{soundPool.play(sighmanm, 1.0f, 1.0f, 0, 0, 1.0f)}
        sighman.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(sighmanm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(sighmanm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val sighwoman = view.findViewById<ImageButton>(R.id.sighwoman)
        val sighwomanm =  soundPool.load(requireContext(), R.raw.sighwoman, 1)
        sighwoman.setOnClickListener{soundPool.play(sighwomanm, 1.0f, 1.0f, 0, 0, 1.0f)}
        sighwoman.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(sighwomanm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(sighwomanm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val huh = view.findViewById<ImageButton>(R.id.huh)
        val huhm =  soundPool.load(requireContext(), R.raw.huh, 1)
        huh.setOnClickListener{soundPool.play(huhm, 1.0f, 1.0f, 0, 0, 1.0f)}
        huh.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(huhm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(huhm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }


        gun.applyClickShrink()
        heel.applyClickShrink()
        horn.applyClickShrink()
        huh.applyClickShrink()
        killed.applyClickShrink()
        laser.applyClickShrink()
        laugh.applyClickShrink()
        lion.applyClickShrink()
        marble.applyClickShrink()
        monkey.applyClickShrink()
        monster.applyClickShrink()
        mosquito.applyClickShrink()
        nope.applyClickShrink()
        oh.applyClickShrink()
        punch.applyClickShrink()
        question.applyClickShrink()
        scream.applyClickShrink()
        semitruck.applyClickShrink()
        sighman.applyClickShrink()
        sighwoman.applyClickShrink()

        return view
    }
    override fun onPause() {
        super.onPause()
        soundPool.autoPause()
    }

    override fun onResume() {
        super.onResume()
        soundPool.autoResume()
    }
}
