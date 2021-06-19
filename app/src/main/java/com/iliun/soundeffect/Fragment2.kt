package com.iliun.soundeffect

import android.media.SoundPool
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_2, container, false)

        val soundPool = SoundPool.Builder().setMaxStreams(6).build()

        val carracing = view.findViewById<ImageButton>(R.id.carracing)
        val carracingm =  soundPool.load(requireContext(), R.raw.carracing, 1)
        carracing.setOnClickListener{soundPool.play(carracingm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val carstart = view.findViewById<ImageButton>(R.id.carstart)
        val carstartm =  soundPool.load(requireContext(), R.raw.carstart, 1)
        carstart.setOnClickListener{soundPool.play(carstartm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val cat = view.findViewById<ImageButton>(R.id.cat)
        val catm =  soundPool.load(requireContext(), R.raw.cat, 1)
        cat.setOnClickListener{soundPool.play(catm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val cereal = view.findViewById<ImageButton>(R.id.cereal)
        val cerealm =  soundPool.load(requireContext(), R.raw.cereal, 1)
        cereal.setOnClickListener{soundPool.play(cerealm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val chain = view.findViewById<ImageButton>(R.id.chain)
        val chainm =  soundPool.load(requireContext(), R.raw.chain, 1)
        chain.setOnClickListener{soundPool.play(chainm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val cheer = view.findViewById<ImageButton>(R.id.cheer)
        val cheerm =  soundPool.load(requireContext(), R.raw.cheer, 1)
        cheer.setOnClickListener{soundPool.play(cheerm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val chick = view.findViewById<ImageButton>(R.id.chick)
        val chickm =  soundPool.load(requireContext(), R.raw.chick, 1)
        chick.setOnClickListener{soundPool.play(chickm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val chime = view.findViewById<ImageButton>(R.id.chime)
        val chimem =  soundPool.load(requireContext(), R.raw.chime, 1)
        chime.setOnClickListener{soundPool.play(chimem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val cider = view.findViewById<ImageButton>(R.id.cider)
        val ciderm =  soundPool.load(requireContext(), R.raw.cider, 1)
        cider.setOnClickListener{soundPool.play(ciderm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val click = view.findViewById<ImageButton>(R.id.click)
        val clickm =  soundPool.load(requireContext(), R.raw.click, 1)
        click.setOnClickListener{soundPool.play(clickm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val clipper = view.findViewById<ImageButton>(R.id.clipper)
        val clipperm =  soundPool.load(requireContext(), R.raw.clipper, 1)
        clipper.setOnClickListener{soundPool.play(clipperm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val cola = view.findViewById<ImageButton>(R.id.cola)
        val colam =  soundPool.load(requireContext(), R.raw.cola, 1)
        cola.setOnClickListener{soundPool.play(colam, 1.0f, 1.0f, 0, 0, 1.0f)}

        val correct = view.findViewById<ImageButton>(R.id.correct)
        val correctm =  soundPool.load(requireContext(), R.raw.correct, 1)
        correct.setOnClickListener{soundPool.play(correctm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val countdown = view.findViewById<ImageButton>(R.id.countdown)
        val countdownm =  soundPool.load(requireContext(), R.raw.countdown, 1)
        countdown.setOnClickListener{soundPool.play(countdownm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val cricket = view.findViewById<ImageButton>(R.id.cricket)
        val cricketm =  soundPool.load(requireContext(), R.raw.cricket, 1)
        cricket.setOnClickListener{soundPool.play(cricketm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val crow = view.findViewById<ImageButton>(R.id.crow)
        val crowm =  soundPool.load(requireContext(), R.raw.crow, 1)
        crow.setOnClickListener{soundPool.play(crowm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val dart = view.findViewById<ImageButton>(R.id.dart)
        val dartm =  soundPool.load(requireContext(), R.raw.dart, 1)
        dart.setOnClickListener{soundPool.play(dartm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val chicken = view.findViewById<ImageButton>(R.id.chicken)
        val chickenm =  soundPool.load(requireContext(), R.raw.chicken, 1)
        chicken.setOnClickListener{soundPool.play(chickenm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val coin = view.findViewById<ImageButton>(R.id.coin)
        val coinm =  soundPool.load(requireContext(), R.raw.coin, 1)
        coin.setOnClickListener{soundPool.play(coinm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val chickendoll = view.findViewById<ImageButton>(R.id.chickendoll)
        val chickendollm =  soundPool.load(requireContext(), R.raw.chickendoll, 1)
        chickendoll.setOnClickListener{soundPool.play(chickendollm, 1.0f, 1.0f, 0, 0, 1.0f)}


        return view
    }
}