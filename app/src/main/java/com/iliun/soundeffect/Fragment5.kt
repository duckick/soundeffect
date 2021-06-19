package com.iliun.soundeffect

import android.media.SoundPool
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class Fragment5 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_5, container, false)

        val soundPool = SoundPool.Builder().setMaxStreams(6).build()

        val sissor = view.findViewById<ImageButton>(R.id.sissor)
        val sissorm =  soundPool.load(requireContext(), R.raw.sissor, 1)
        sissor.setOnClickListener{soundPool.play(sissorm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val sneeze = view.findViewById<ImageButton>(R.id.sneeze)
        val sneezem =  soundPool.load(requireContext(), R.raw.sneeze, 1)
        sneeze.setOnClickListener{soundPool.play(sneezem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val sniper = view.findViewById<ImageButton>(R.id.sniper)
        val sniperm =  soundPool.load(requireContext(), R.raw.sniper, 1)
        sniper.setOnClickListener{soundPool.play(sniperm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val stream = view.findViewById<ImageButton>(R.id.stream)
        val streamm =  soundPool.load(requireContext(), R.raw.stream, 1)
        stream.setOnClickListener{soundPool.play(streamm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val sword = view.findViewById<ImageButton>(R.id.sword)
        val swordm =  soundPool.load(requireContext(), R.raw.sword, 1)
        sword.setOnClickListener{soundPool.play(swordm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val tank = view.findViewById<ImageButton>(R.id.tank)
        val tankm =  soundPool.load(requireContext(), R.raw.tank, 1)
        tank.setOnClickListener{soundPool.play(tankm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val tape = view.findViewById<ImageButton>(R.id.tape)
        val tapem =  soundPool.load(requireContext(), R.raw.tape, 1)
        tape.setOnClickListener{soundPool.play(tapem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val tearbook = view.findViewById<ImageButton>(R.id.tearbook)
        val tearbookm =  soundPool.load(requireContext(), R.raw.tearbook, 1)
        tearbook.setOnClickListener{soundPool.play(tearbookm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val telephone = view.findViewById<ImageButton>(R.id.telephone)
        val telephonem =  soundPool.load(requireContext(), R.raw.telephone, 1)
        telephone.setOnClickListener{soundPool.play(telephonem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val thunder = view.findViewById<ImageButton>(R.id.thunder)
        val thunderm =  soundPool.load(requireContext(), R.raw.thunder, 1)
        thunder.setOnClickListener{soundPool.play(thunderm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val tiger = view.findViewById<ImageButton>(R.id.tiger)
        val tigerm =  soundPool.load(requireContext(), R.raw.tiger, 1)
        tiger.setOnClickListener{soundPool.play(tigerm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val toilet = view.findViewById<ImageButton>(R.id.toilet)
        val toiletm =  soundPool.load(requireContext(), R.raw.toilet, 1)
        toilet.setOnClickListener{soundPool.play(toiletm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val tractor = view.findViewById<ImageButton>(R.id.tractor)
        val tractorm =  soundPool.load(requireContext(), R.raw.tractor, 1)
        tractor.setOnClickListener{soundPool.play(tractorm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val trumpet = view.findViewById<ImageButton>(R.id.trumpet)
        val trumpetm =  soundPool.load(requireContext(), R.raw.trumpet, 1)
        trumpet.setOnClickListener{soundPool.play(trumpetm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val tv = view.findViewById<ImageButton>(R.id.tv)
        val tvm =  soundPool.load(requireContext(), R.raw.tv, 1)
        tv.setOnClickListener{soundPool.play(tvm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val twinkle = view.findViewById<ImageButton>(R.id.twinkle)
        val twinklem =  soundPool.load(requireContext(), R.raw.twinkle, 1)
        twinkle.setOnClickListener{soundPool.play(twinklem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val ufo = view.findViewById<ImageButton>(R.id.ufo)
        val ufom =  soundPool.load(requireContext(), R.raw.ufo, 1)
        ufo.setOnClickListener{soundPool.play(ufom, 1.0f, 1.0f, 0, 0, 1.0f)}

        val waterbubble = view.findViewById<ImageButton>(R.id.waterbubble)
        val waterbubblem =  soundPool.load(requireContext(), R.raw.waterbubble, 1)
        waterbubble.setOnClickListener{soundPool.play(waterbubblem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val waterdrink = view.findViewById<ImageButton>(R.id.waterdrink)
        val waterdrinkm =  soundPool.load(requireContext(), R.raw.diving, 1)
        waterdrink.setOnClickListener{soundPool.play(waterdrinkm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val waterdrop = view.findViewById<ImageButton>(R.id.waterdrop)
        val waterdropm =  soundPool.load(requireContext(), R.raw.diving, 1)
        waterdrop.setOnClickListener{soundPool.play(waterdropm, 1.0f, 1.0f, 0, 0, 1.0f)}




        return view
    }
}