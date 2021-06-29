package iliun.com.soundeffect


import android.media.SoundPool
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.realpacific.clickshrinkeffect.applyClickShrink
import iliun.com.R

class Fragment4 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_4, container, false)

        val soundPool = SoundPool.Builder().setMaxStreams(1).build()

        val gun = view.findViewById<ImageButton>(R.id.gun)
        val gunm =  soundPool.load(requireContext(), R.raw.gun, 1)
        gun.setOnClickListener{soundPool.play(gunm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val heel = view.findViewById<ImageButton>(R.id.heel)
        val heelm =  soundPool.load(requireContext(), R.raw.heel, 1)
        heel.setOnClickListener{soundPool.play(heelm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val horn = view.findViewById<ImageButton>(R.id.horn)
        val hornm =  soundPool.load(requireContext(), R.raw.horn, 1)
        horn.setOnClickListener{soundPool.play(hornm, 0.9f, 0.9f, 0, 0, 1.0f)}

        val killed = view.findViewById<ImageButton>(R.id.killed)
        val killedm =  soundPool.load(requireContext(), R.raw.killed, 1)
        killed.setOnClickListener{soundPool.play(killedm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val laser = view.findViewById<ImageButton>(R.id.laser)
        val laserm =  soundPool.load(requireContext(), R.raw.laser, 1)
        laser.setOnClickListener{soundPool.play(laserm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val laugh = view.findViewById<ImageButton>(R.id.laugh)
        val laughm =  soundPool.load(requireContext(), R.raw.laugh, 1)
        laugh.setOnClickListener{soundPool.play(laughm, 0.9f, 0.9f, 0, 0, 1.0f)}

        val lion = view.findViewById<ImageButton>(R.id.lion)
        val lionm =  soundPool.load(requireContext(), R.raw.lion, 1)
        lion.setOnClickListener{soundPool.play(lionm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val marble = view.findViewById<ImageButton>(R.id.marble)
        val marblem =  soundPool.load(requireContext(), R.raw.marble, 1)
        marble.setOnClickListener{soundPool.play(marblem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val monkey = view.findViewById<ImageButton>(R.id.monkey)
        val monkeym =  soundPool.load(requireContext(), R.raw.monkey, 1)
        monkey.setOnClickListener{soundPool.play(monkeym, 1.0f, 1.0f, 0, 0, 1.0f)}

        val monster = view.findViewById<ImageButton>(R.id.monster)
        val monsterm =  soundPool.load(requireContext(), R.raw.monster, 1)
        monster.setOnClickListener{soundPool.play(monsterm, 0.5f, 0.5f, 0, 0, 1.0f)}

        val mosquito = view.findViewById<ImageButton>(R.id.mosquito)
        val mosquitom =  soundPool.load(requireContext(), R.raw.mosquito, 1)
        mosquito.setOnClickListener{soundPool.play(mosquitom, 1.0f, 1.0f, 0, 0, 1.0f)}

        val nope = view.findViewById<ImageButton>(R.id.nope)
        val nopem =  soundPool.load(requireContext(), R.raw.nope, 1)
        nope.setOnClickListener{soundPool.play(nopem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val oh = view.findViewById<ImageButton>(R.id.oh)
        val ohm =  soundPool.load(requireContext(), R.raw.oh, 1)
        oh.setOnClickListener{soundPool.play(ohm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val punch = view.findViewById<ImageButton>(R.id.punch)
        val punchm =  soundPool.load(requireContext(), R.raw.punch, 1)
        punch.setOnClickListener{soundPool.play(punchm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val question = view.findViewById<ImageButton>(R.id.question)
        val questionm =  soundPool.load(requireContext(), R.raw.question, 1)
        question.setOnClickListener{soundPool.play(questionm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val scream = view.findViewById<ImageButton>(R.id.scream)
        val screamm =  soundPool.load(requireContext(), R.raw.scream, 1)
        scream.setOnClickListener{soundPool.play(screamm, 0.8f, 0.8f, 0, 0, 1.0f)}

        val semitruck = view.findViewById<ImageButton>(R.id.semitruck)
        val semitruckm =  soundPool.load(requireContext(), R.raw.semitruck, 1)
        semitruck.setOnClickListener{soundPool.play(semitruckm, 0.8f, 0.8f, 0, 0, 1.0f)}

        val sighman = view.findViewById<ImageButton>(R.id.sighman)
        val sighmanm =  soundPool.load(requireContext(), R.raw.sighman, 1)
        sighman.setOnClickListener{soundPool.play(sighmanm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val sighwoman = view.findViewById<ImageButton>(R.id.sighwoman)
        val sighwomanm =  soundPool.load(requireContext(), R.raw.sighwoman, 1)
        sighwoman.setOnClickListener{soundPool.play(sighwomanm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val huh = view.findViewById<ImageButton>(R.id.huh)
        val huhm =  soundPool.load(requireContext(), R.raw.huh, 1)
        huh.setOnClickListener{soundPool.play(huhm, 1.0f, 1.0f, 0, 0, 1.0f)}

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
}