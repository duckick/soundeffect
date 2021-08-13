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

class Fragment3 : Fragment() {
    lateinit var mAdView : AdView
    private val soundPool = SoundPool.Builder().setMaxStreams(1).build()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_3, container, false)

        val aniBtn5 = AnimationUtils.loadAnimation(requireContext(),R.anim.shakeroof)
        val aniLoop = AnimationUtils.loadAnimation(requireContext(),R.anim.bounce)
        val aniLongclick = AnimationUtils.loadAnimation(requireContext(),R.anim.zoomin)
        val mhandler = Handler(Looper.getMainLooper())
//        MobileAds.initialize(requireContext()) {}
        val emptym = soundPool.load(requireContext(),R.raw.empty,1)
        val adRequest = AdRequest.Builder().build()
        fun emptysound()  { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f) }

//--------------------------------------------------------------------------
        val diving = view.findViewById<ImageButton>(R.id.diving)
        val divingm =  soundPool.load(requireContext(), R.raw.diving, 1)
        diving.setOnClickListener{soundPool.play(divingm, 1.0f, 1.0f, 0, 0, 1.0f)}
        diving.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            mAdView.loadAd(adRequest)

            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(divingm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                 emptysound(); mhandler.postDelayed({soundPool.play(divingm, 1.0f, 1.0f, 0, 0, 1.0f) },5000); it.startAnimation(aniLoop)}
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { emptysound(); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val dog = view.findViewById<ImageButton>(R.id.dog)
        val dogm =  soundPool.load(requireContext(), R.raw.dog, 1)
        dog.setOnClickListener{soundPool.play(dogm, 1.0f, 1.0f, 0, 0, 1.0f)}
        dog.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(dogm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(dogm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val doorbell = view.findViewById<ImageButton>(R.id.doorbell)
        val doorbellm =  soundPool.load(requireContext(), R.raw.doorbell, 1)
        doorbell.setOnClickListener{soundPool.play(doorbellm, 1.0f, 1.0f, 0, 0, 1.0f)}
        doorbell.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(doorbellm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(doorbellm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val drill = view.findViewById<ImageButton>(R.id.drill)
        val drillm =  soundPool.load(requireContext(), R.raw.drill, 1)
        drill.setOnClickListener{soundPool.play(drillm, 0.7f, 0.7f, 0, 0, 1.0f)}
        drill.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(drillm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(drillm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }


        val drum = view.findViewById<ImageButton>(R.id.drum)
        val drumm =  soundPool.load(requireContext(), R.raw.drum, 1)
        drum.setOnClickListener{soundPool.play(drumm, 1.0f, 1.0f, 0, 0, 1.0f)}
        drum.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(drumm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(drumm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val drumset = view.findViewById<ImageButton>(R.id.drumset)
        val drumsetm =  soundPool.load(requireContext(), R.raw.drumset, 1)
        drumset.setOnClickListener{soundPool.play(drumsetm, 1.0f, 1.0f, 0, 0, 1.0f)}
        drumset.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(drumsetm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(drumsetm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val duck = view.findViewById<ImageButton>(R.id.duck)
        val duckm =  soundPool.load(requireContext(), R.raw.duck, 1)
        duck.setOnClickListener{soundPool.play(duckm, 0.9f, 0.9f, 0, 0, 1.0f)}
        duck.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(duckm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(duckm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val eggfried = view.findViewById<ImageButton>(R.id.eggfried)
        val eggfriedm=  soundPool.load(requireContext(), R.raw.eggfried, 1)
        eggfried.setOnClickListener{soundPool.play(eggfriedm, 1.0f, 1.0f, 0, 0, 1.0f)}
        eggfried.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(eggfriedm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(eggfriedm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val elephant = view.findViewById<ImageButton>(R.id.elephant)
        val elephantm =  soundPool.load(requireContext(), R.raw.elephant, 1)
        elephant.setOnClickListener{soundPool.play(elephantm, 1.0f, 1.0f, 0, 0, 1.0f)}
        elephant.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(elephantm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(elephantm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val evil = view.findViewById<ImageButton>(R.id.evil)
        val evilm =  soundPool.load(requireContext(), R.raw.evil, 1)
        evil.setOnClickListener{soundPool.play(evilm, 1.0f, 1.0f, 0, 0, 1.0f)}
        evil.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(evilm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(evilm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val explosion = view.findViewById<ImageButton>(R.id.explosion)
        val explosionm =  soundPool.load(requireContext(), R.raw.explosion, 1)
        explosion.setOnClickListener{soundPool.play(explosionm, 1.0f, 1.0f, 0, 0, 1.0f)}
        explosion.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(explosionm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(explosionm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val fallingman = view.findViewById<ImageButton>(R.id.fallingman)
        val fallingmanm =  soundPool.load(requireContext(), R.raw.fallingman, 1)
        fallingman.setOnClickListener{soundPool.play(fallingmanm, 1.0f, 1.0f, 0, 0, 1.0f)}
        fallingman.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(fallingmanm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(fallingmanm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val fanfare = view.findViewById<ImageButton>(R.id.fanfare)
        val fanfarem =  soundPool.load(requireContext(), R.raw.fanfare, 1)
        fanfare.setOnClickListener{soundPool.play(fanfarem, 0.8f, 0.8f, 0, 0, 1.0f)}
        fanfare.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(fanfarem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(fanfarem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val fart = view.findViewById<ImageButton>(R.id.fart)
        val fartm =  soundPool.load(requireContext(), R.raw.fart, 1)
        fart.setOnClickListener{soundPool.play(fartm, 1.0f, 1.0f, 0, 0, 1.0f)}
        fart.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(fartm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(fartm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val fireworks = view.findViewById<ImageButton>(R.id.fireworks)
        val fireworksm =  soundPool.load(requireContext(), R.raw.firework, 1)
        fireworks.setOnClickListener{soundPool.play(fireworksm, 1.0f, 1.0f, 0, 0, 1.0f)}
        fireworks.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(fireworksm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(fireworksm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val fryingpan = view.findViewById<ImageButton>(R.id.fryingpan)
        val fryingpanm =  soundPool.load(requireContext(), R.raw.frypan, 1)
        fryingpan.setOnClickListener{soundPool.play(fryingpanm, 1.0f, 1.0f, 0, 0, 1.0f)}
        fryingpan.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(fryingpanm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(fryingpanm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val galaga = view.findViewById<ImageButton>(R.id.galaga)
        val galagam =  soundPool.load(requireContext(), R.raw.galaga, 1)
        galaga.setOnClickListener{soundPool.play(galagam, 1.0f, 1.0f, 0, 0, 1.0f)}
        galaga.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(galagam, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(galagam, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val ghost = view.findViewById<ImageButton>(R.id.ghost)
        val ghostm =  soundPool.load(requireContext(), R.raw.ghost, 1)
        ghost.setOnClickListener{soundPool.play(ghostm, 1.0f, 1.0f, 0, 0, 1.0f)}
        ghost.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(ghostm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(ghostm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val glass = view.findViewById<ImageButton>(R.id.glass)
        val glassm =  soundPool.load(requireContext(), R.raw.glass, 1)
        glass.setOnClickListener{soundPool.play(glassm, 1.0f, 1.0f, 0, 0, 1.0f)}
        glass.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(glassm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(glassm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val go = view.findViewById<ImageButton>(R.id.go)
        val gom =  soundPool.load(requireContext(), R.raw.go, 1)
        go.setOnClickListener{soundPool.play(gom, 0.9f, 0.9f, 0, 0, 1.0f)}
        go.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(gom, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(gom, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound(); }
            true
        }

        diving.applyClickShrink()
        dog.applyClickShrink()
        doorbell.applyClickShrink()
        drill.applyClickShrink()
        drum.applyClickShrink()
        drumset.applyClickShrink()
        duck.applyClickShrink()
        eggfried.applyClickShrink()
        elephant.applyClickShrink()
        evil.applyClickShrink()
        explosion.applyClickShrink()
        fallingman.applyClickShrink()
        fanfare.applyClickShrink()
        fart.applyClickShrink()
        fireworks.applyClickShrink()
        fryingpan.applyClickShrink()
        galaga.applyClickShrink()
        ghost.applyClickShrink()
        glass.applyClickShrink()
        go.applyClickShrink()


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
