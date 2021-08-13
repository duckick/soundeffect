package iliun.com.soundeffect

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.media.SoundPool
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.*
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.*
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdOptions
import com.realpacific.clickshrinkeffect.applyClickShrink
import iliun.com.MainActivity
import iliun.com.R

class Fragment2 : Fragment() {
    lateinit var mAdView : AdView
    private val soundPool = SoundPool.Builder().setMaxStreams(1).build()
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_2, container, false)

        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.shake)
        val aniBtn5 = AnimationUtils.loadAnimation(requireContext(),R.anim.shakeroof)
        val aniLoop = AnimationUtils.loadAnimation(requireContext(),R.anim.bounce)
        val aniLongclick = AnimationUtils.loadAnimation(requireContext(),R.anim.zoomin)
        val emptym = soundPool.load(requireContext(),R.raw.empty,1)
        fun emptysound()  { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f) }
        val mhandler = Handler(Looper.getMainLooper())
//        MobileAds.initialize(requireContext()) {}
        val adRequest = AdRequest.Builder().build()


        //---------------------------------------------------------------------------------
        val carracing = view.findViewById<ImageButton>(R.id.carracing)
                val carracingm = soundPool.load(requireContext(), R.raw.carracing, 1)
                carracing.setOnClickListener { soundPool.play(carracingm, 1.0f, 1.0f, 0, 0, 1.0f) }

                carracing.setOnLongClickListener {
                    val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                    val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
                    val add:AlertDialog =  mBuilder.create()
                    add.show(); it.startAnimation(aniLongclick);
                    mAdView = mDialogView.findViewById(R.id.dialog_adView)
                    mAdView.loadAd(adRequest)
                    mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                        soundPool.play(carracingm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
                    mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                        emptysound(); mhandler.postDelayed({soundPool.play(carracingm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
                    mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                        mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
                true
            }


            val carstart = view.findViewById<ImageButton>(R.id.carstart)
            val carstartm = soundPool.load(requireContext(), R.raw.carstart, 1)
            carstart.setOnClickListener { soundPool.play(carstartm, 1.0f, 1.0f, 0, 0, 1.0f) }

        carstart.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)
            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(carstartm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(carstartm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }


        val cat = view.findViewById<ImageButton>(R.id.cat)
            val catm = soundPool.load(requireContext(), R.raw.cat, 1)
            cat.setOnClickListener { soundPool.play(catm, 0.7f, 0.7f, 0, 0, 1.0f) }

        cat.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(catm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(catm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }


            val cereal = view.findViewById<ImageButton>(R.id.cereal)
            val cerealm = soundPool.load(requireContext(), R.raw.cereal, 1)
            cereal.setOnClickListener { soundPool.play(cerealm, 1.0f, 1.0f, 0, 0, 1.0f) }

        cereal.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(cerealm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(cerealm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val chain = view.findViewById<ImageButton>(R.id.chain)
            val chainm = soundPool.load(requireContext(), R.raw.chain, 1)
            chain.setOnClickListener { soundPool.play(chainm, 1.0f, 1.0f, 0, 0, 1.0f) }

        chain.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(chainm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(chainm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val cheer = view.findViewById<ImageButton>(R.id.cheer)
            val cheerm = soundPool.load(requireContext(), R.raw.cheer, 1)
            cheer.setOnClickListener { soundPool.play(cheerm, 0.9f, 0.9f, 0, 0, 1.0f) }

        cheer.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(cheerm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(cheerm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val chick = view.findViewById<ImageButton>(R.id.chick)
            val chickm = soundPool.load(requireContext(), R.raw.chick, 1)
            chick.setOnClickListener { soundPool.play(chickm, 1.0f, 1.0f, 0, 0, 1.0f) }

        chick.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(chickm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(chickm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val chime = view.findViewById<ImageButton>(R.id.chime)
            val chimem = soundPool.load(requireContext(), R.raw.chime, 1)
            chime.setOnClickListener { soundPool.play(chimem, 1.0f, 1.0f, 0, 0, 1.0f) }

        chime.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(chimem, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(chimem, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val cider = view.findViewById<ImageButton>(R.id.cider)
            val ciderm = soundPool.load(requireContext(), R.raw.cider, 1)
            cider.setOnClickListener { soundPool.play(ciderm, 1.0f, 1.0f, 0, 0, 1.0f) }

        cider.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(ciderm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(ciderm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val click = view.findViewById<ImageButton>(R.id.click)
            val clickm = soundPool.load(requireContext(), R.raw.click, 1)
            click.setOnClickListener { soundPool.play(clickm, 1.0f, 1.0f, 0, 0, 1.0f) }

        click.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(clickm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(clickm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val clipper = view.findViewById<ImageButton>(R.id.clipper)
            val clipperm = soundPool.load(requireContext(), R.raw.clipper, 1)
            clipper.setOnClickListener { soundPool.play(clipperm, 1.0f, 1.0f, 0, 0, 1.0f) }

        clipper.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(clipperm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(clickm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val cola = view.findViewById<ImageButton>(R.id.cola)
            val colam = soundPool.load(requireContext(), R.raw.cola, 1)
            cola.setOnClickListener { soundPool.play(colam, 1.0f, 1.0f, 0, 0, 1.0f) }
        cola.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(colam, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(colam, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val correct = view.findViewById<ImageButton>(R.id.correct)
            val correctm = soundPool.load(requireContext(), R.raw.correct, 1)
            correct.setOnClickListener { soundPool.play(correctm, 1.0f, 1.0f, 0, 0, 1.0f) }
        correct.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(correctm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(correctm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val countdown = view.findViewById<ImageButton>(R.id.countdown)
            val countdownm = soundPool.load(requireContext(), R.raw.countdown, 1)
            countdown.setOnClickListener { soundPool.play(countdownm, 1.0f, 1.0f, 0, 0, 1.0f) }
        countdown.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(countdownm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(countdownm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val cricket = view.findViewById<ImageButton>(R.id.cricket)
            val cricketm = soundPool.load(requireContext(), R.raw.cricket, 1)
            cricket.setOnClickListener { soundPool.play(cricketm, 1.0f, 1.0f, 0, 0, 1.0f) }
        cricket.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(cricketm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(cricketm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val crow = view.findViewById<ImageButton>(R.id.crow)
            val crowm = soundPool.load(requireContext(), R.raw.crow, 1)
            crow.setOnClickListener { soundPool.play(crowm, 1.0f, 1.0f, 0, 0, 1.0f) }
        crow.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(crowm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(crowm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val dart = view.findViewById<ImageButton>(R.id.dart)
            val dartm = soundPool.load(requireContext(), R.raw.dart, 1)
            dart.setOnClickListener { soundPool.play(dartm, 1.0f, 1.0f, 0, 0, 1.0f) }
        dart.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(dartm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(dartm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val chicken = view.findViewById<ImageButton>(R.id.chicken)
            val chickenm = soundPool.load(requireContext(), R.raw.chicken, 1)
            chicken.setOnClickListener { soundPool.play(chickenm, 0.8f, 0.8f, 0, 0, 1.0f) }
        chicken.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(chickenm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(chickenm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val coin = view.findViewById<ImageButton>(R.id.coin)
            val coinm = soundPool.load(requireContext(), R.raw.coin, 1)
            coin.setOnClickListener { soundPool.play(coinm, 1.0f, 1.0f, 0, 0, 1.0f) }
        coin.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(coinm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(coinm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
            true
        }

            val chickendoll = view.findViewById<ImageButton>(R.id.chickendoll)
            val chickendollm = soundPool.load(requireContext(), R.raw.chickendoll, 1)
            chickendoll.setOnClickListener { soundPool.play(chickendollm, 1.0f, 1.0f, 0, 0, 1.0f) }
        chickendoll.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
            val add:AlertDialog =  mBuilder.create()
            add.show(); it.startAnimation(aniLongclick);
            mAdView = mDialogView.findViewById(R.id.dialog_adView)

            mAdView.loadAd(adRequest)
            mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
                soundPool.play(chickendollm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
            mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
                emptysound(); mhandler.postDelayed({soundPool.play(chickendollm, 1.0f, 1.0f, 0, 0, 1.0f) },5000) ;it.startAnimation(aniBtn5) }
            mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
                mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound();  emptysound()}
            true
        }

            carracing.applyClickShrink()
            carstart.applyClickShrink()
            cat.applyClickShrink()
            cereal.applyClickShrink()
            chain.applyClickShrink()
            cheer.applyClickShrink()
            chick.applyClickShrink()
            chicken.applyClickShrink()
            chickendoll.applyClickShrink()
            chime.applyClickShrink()
            cider.applyClickShrink()
            click.applyClickShrink()
            clipper.applyClickShrink()
            coin.applyClickShrink()
            cola.applyClickShrink()
            correct.applyClickShrink()
            countdown.applyClickShrink()
            cricket.applyClickShrink()
            crow.applyClickShrink()
            dart.applyClickShrink()

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



//abstract class DoubleClickListener : View.OnClickListener {
//        var lastClickTime: Long = 0
//        override fun onClick(v: View?) {
//            val clickTime = System.currentTimeMillis()
//            if (clickTime - lastClickTime < DOUBLE_CLICK_TIME_DELTA) {
//                onDoubleClick(v)
//            }
//            lastClickTime = clickTime
//        }
//        abstract fun onDoubleClick(v: View?)
//        companion object {
//            private const val DOUBLE_CLICK_TIME_DELTA: Long = 300 //milliseconds
//
//        }
//    }


