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
import iliun.com.R.*

class Fragment5 : Fragment() {
    lateinit var mAdView : AdView
    private val soundPool = SoundPool.Builder().setMaxStreams(1).build()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(layout.fragment_5, container, false)

        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.shake)
        val aniBtn5 = AnimationUtils.loadAnimation(requireContext(),R.anim.shakeroof)
        val aniLoop = AnimationUtils.loadAnimation(requireContext(),R.anim.bounce)
        val aniLongclick = AnimationUtils.loadAnimation(requireContext(),R.anim.zoomin)
        val mhandler = Handler(Looper.getMainLooper())
//        MobileAds.initialize(requireContext()) {}
        val emptym = soundPool.load(requireContext(),R.raw.empty,1)
        val adRequest = AdRequest.Builder().build()
        fun emptysound()  { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f) }
        
        
        //=====----------------------------------------------------------

        val sissor = view.findViewById<ImageButton>(R.id.sissor)
        val sissorm =  soundPool.load(requireContext(), raw.sissor, 1)
        sissor.setOnClickListener{soundPool.play(sissorm, 1.0f, 1.0f, 0, 0, 1.0f)}
        sissor.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(sissorm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(sissorm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val sneeze = view.findViewById<ImageButton>(R.id.sneeze)
        val sneezem =  soundPool.load(requireContext(), raw.sneeze, 1)
        sneeze.setOnClickListener{soundPool.play(sneezem, 1.0f, 1.0f, 0, 0, 1.0f)}
        sneeze.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(sneezem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(sneezem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val sniper = view.findViewById<ImageButton>(R.id.sniper)
        val sniperm =  soundPool.load(requireContext(), raw.sniper, 1)
        sniper.setOnClickListener{soundPool.play(sniperm, 1.0f, 1.0f, 0, 0, 1.0f)}
        sniper.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(sniperm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(sniperm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true

        }



        val stream = view.findViewById<ImageButton>(R.id.stream)
        val streamm =  soundPool.load(requireContext(), raw.stream, 1)
        stream.setOnClickListener{soundPool.play(streamm, 1.0f, 1.0f, 0, 0, 1.0f)}
        stream.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(streamm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(streamm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val sword = view.findViewById<ImageButton>(R.id.sword)
        val swordm =  soundPool.load(requireContext(), raw.sword, 1)
        sword.setOnClickListener{soundPool.play(swordm, 1.0f, 1.0f, 0, 0, 1.0f)}
        sword.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(swordm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(swordm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val tank = view.findViewById<ImageButton>(R.id.tank)
        val tankm =  soundPool.load(requireContext(), raw.tank, 1)
        tank.setOnClickListener{soundPool.play(tankm, 1.0f, 1.0f, 0, 0, 1.0f)}
        tank.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(tankm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(tankm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }





        val tape = view.findViewById<ImageButton>(R.id.tape)
        val tapem =  soundPool.load(requireContext(), raw.tape, 1)
        tape.setOnClickListener{soundPool.play(tapem, 1.0f, 1.0f, 0, 0, 1.0f)}
        tape.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(tapem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(tapem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val tearbook = view.findViewById<ImageButton>(R.id.tearbook)
        val tearbookm =  soundPool.load(requireContext(), raw.tearbook, 1)
        tearbook.setOnClickListener{soundPool.play(tearbookm, 1.0f, 1.0f, 0, 0, 1.0f)}
        tearbook.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(tearbookm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(tearbookm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val telephone = view.findViewById<ImageButton>(R.id.telephone)
        val telephonem =  soundPool.load(requireContext(), raw.telephone, 1)
        telephone.setOnClickListener{soundPool.play(telephonem, 1.0f, 1.0f, 0, 0, 1.0f)}
        telephone.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(telephonem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(telephonem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val thunder = view.findViewById<ImageButton>(R.id.thunder)
        val thunderm =  soundPool.load(requireContext(), raw.thunder, 1)
        thunder.setOnClickListener{soundPool.play(thunderm, 1.0f, 1.0f, 0, 0, 1.0f)}
        thunder.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(thunderm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(thunderm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val tiger = view.findViewById<ImageButton>(R.id.tiger)
        val tigerm =  soundPool.load(requireContext(), raw.tiger, 1)
        tiger.setOnClickListener{soundPool.play(tigerm, 1.0f, 1.0f, 0, 0, 1.0f)}
        tiger.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(tigerm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(tigerm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val toilet = view.findViewById<ImageButton>(R.id.toilet)
        val toiletm =  soundPool.load(requireContext(), raw.toilet, 1)
        toilet.setOnClickListener{soundPool.play(toiletm, 1.0f, 1.0f, 0, 0, 1.0f)}
        toilet.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(toiletm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(toiletm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val tractor = view.findViewById<ImageButton>(R.id.tractor)
        val tractorm =  soundPool.load(requireContext(), raw.tractor, 1)
        tractor.setOnClickListener{soundPool.play(tractorm, 1.0f, 1.0f, 0, 0, 1.0f)}
        tractor.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(tractorm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(tractorm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val trumpet = view.findViewById<ImageButton>(R.id.trumpet)
        val trumpetm =  soundPool.load(requireContext(), raw.trumpet, 1)
        trumpet.setOnClickListener{soundPool.play(trumpetm, 0.8f, 0.8f, 0, 0, 1.0f)}
        trumpet.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(trumpetm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(trumpetm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val tv = view.findViewById<ImageButton>(R.id.tv)
        val tvm =  soundPool.load(requireContext(), raw.tv, 1)
        tv.setOnClickListener{soundPool.play(tvm, 1.0f, 1.0f, 0, 0, 1.0f)}
        tv.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(tvm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(tvm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val twinkle = view.findViewById<ImageButton>(R.id.twinkle)
        val twinklem =  soundPool.load(requireContext(), raw.twinkle, 1)
        twinkle.setOnClickListener{soundPool.play(twinklem, 1.0f, 1.0f, 0, 0, 1.0f)}
        twinkle.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(twinklem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(twinklem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val ufo = view.findViewById<ImageButton>(R.id.ufo)
        val ufom =  soundPool.load(requireContext(), raw.ufo, 1)
        ufo.setOnClickListener{soundPool.play(ufom, 1.0f, 1.0f, 0, 0, 1.0f)}
        ufo.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(ufom, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(ufom, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val waterbubble = view.findViewById<ImageButton>(R.id.waterbubble)
        val waterbubblem =  soundPool.load(requireContext(), raw.waterbubble, 1)
        waterbubble.setOnClickListener{soundPool.play(waterbubblem, 1.0f, 1.0f, 0, 0, 1.0f)}
        waterbubble.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(waterbubblem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(waterbubblem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val waterdrink = view.findViewById<ImageButton>(R.id.waterdrink)
        val waterdrinkm =  soundPool.load(requireContext(), raw.waterdrink, 1)
        waterdrink.setOnClickListener{soundPool.play(waterdrinkm, 1.0f, 1.0f, 0, 0, 1.0f)}
        waterdrink.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(waterdrinkm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(waterdrinkm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        val waterdrop = view.findViewById<ImageButton>(R.id.waterdrop)
        val waterdropm =  soundPool.load(requireContext(), raw.diving, 1)
        waterdrop.setOnClickListener{soundPool.play(waterdropm, 1.0f, 1.0f, 0, 0, 1.0f)}
        waterdrop.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add: AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(waterdropm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(waterdropm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }



        sissor.applyClickShrink()
        sneeze.applyClickShrink()
        sniper.applyClickShrink()
        stream.applyClickShrink()
        sword.applyClickShrink()
        tank.applyClickShrink()
        tape.applyClickShrink()
        tearbook.applyClickShrink()
        telephone.applyClickShrink()
        thunder.applyClickShrink()
        tiger.applyClickShrink()
        toilet.applyClickShrink()
        tractor.applyClickShrink()
        trumpet.applyClickShrink()
        tv.applyClickShrink()
        twinkle.applyClickShrink()
        ufo.applyClickShrink()
        waterbubble.applyClickShrink()
        waterdrink.applyClickShrink()
        waterdrop.applyClickShrink()

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
