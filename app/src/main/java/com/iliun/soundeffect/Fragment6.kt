package com.iliun.soundeffect

import android.media.SoundPool
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class Fragment6 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_6, container, false)
        val soundPool = SoundPool.Builder().setMaxStreams(6).build()

        val axe = view.findViewById<ImageButton>(R.id.axe)
        val axem =  soundPool.load(requireContext(), R.raw.axe, 1)
        axe.setOnClickListener{soundPool.play(axem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val boiling = view.findViewById<ImageButton>(R.id.boiling)
        val boilingm =  soundPool.load(requireContext(), R.raw.boiling, 1)
        boiling.setOnClickListener{soundPool.play(boilingm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val broom = view.findViewById<ImageButton>(R.id.broom)
        val broomm =  soundPool.load(requireContext(), R.raw.broom, 1)
        broom.setOnClickListener{soundPool.play(broomm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val fan = view.findViewById<ImageButton>(R.id.fan)
        val fanm =  soundPool.load(requireContext(), R.raw.fan, 1)
        fan.setOnClickListener{soundPool.play(fanm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val hey = view.findViewById<ImageButton>(R.id.hey)
        val heym =  soundPool.load(requireContext(), R.raw.hey, 1)
        hey.setOnClickListener{soundPool.play(heym, 1.0f, 1.0f, 0, 0, 1.0f)}

        val kakao = view.findViewById<ImageButton>(R.id.kakao)
        val kakaom =  soundPool.load(requireContext(), R.raw.kakao, 1)
        kakao.setOnClickListener{soundPool.play(kakaom, 1.0f, 1.0f, 0, 0, 1.0f)}

        val kiss = view.findViewById<ImageButton>(R.id.kiss)
        val kissm =  soundPool.load(requireContext(), R.raw.kiss, 1)
        kiss.setOnClickListener{soundPool.play(kissm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val match = view.findViewById<ImageButton>(R.id.match)
        val matchm =  soundPool.load(requireContext(), R.raw.matche, 1)
        match.setOnClickListener{soundPool.play(matchm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val shit = view.findViewById<ImageButton>(R.id.shit)
        val shitm =  soundPool.load(requireContext(), R.raw.shit, 1)
        shit.setOnClickListener{soundPool.play(shitm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val siren = view.findViewById<ImageButton>(R.id.siren)
        val sirenm =  soundPool.load(requireContext(), R.raw.siren, 1)
        siren.setOnClickListener{soundPool.play(sirenm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val train = view.findViewById<ImageButton>(R.id.train)
        val trainm =  soundPool.load(requireContext(), R.raw.train, 1)
        train.setOnClickListener{soundPool.play(trainm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val typing = view.findViewById<ImageButton>(R.id.typing)
        val typingm =  soundPool.load(requireContext(), R.raw.typing, 1)
        typing.setOnClickListener{soundPool.play(typingm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val waves = view.findViewById<ImageButton>(R.id.waves)
        val wavesm =  soundPool.load(requireContext(), R.raw.waves, 1)
        waves.setOnClickListener{soundPool.play(wavesm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val whistle = view.findViewById<ImageButton>(R.id.whistle)
        val whistlem =  soundPool.load(requireContext(), R.raw.whistle, 1)
        whistle.setOnClickListener{soundPool.play(whistlem, 1.0f, 1.0f, 0, 0, 1.0f)}

        val windows = view.findViewById<ImageButton>(R.id.windows)
        val windowsm =  soundPool.load(requireContext(), R.raw.windows, 1)
        windows.setOnClickListener{soundPool.play(windowsm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val witch = view.findViewById<ImageButton>(R.id.witch)
        val witchm =  soundPool.load(requireContext(), R.raw.witch, 1)
        witch.setOnClickListener{soundPool.play(witchm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val wolf = view.findViewById<ImageButton>(R.id.wolf)
        val wolfm =  soundPool.load(requireContext(), R.raw.wolf, 1)
        wolf.setOnClickListener{soundPool.play(wolfm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val wow = view.findViewById<ImageButton>(R.id.wow)
        val wowm =  soundPool.load(requireContext(), R.raw.wow, 1)
        wow.setOnClickListener{soundPool.play(wowm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val zippo = view.findViewById<ImageButton>(R.id.zippo)
        val zippom =  soundPool.load(requireContext(), R.raw.zippo, 1)
        zippo.setOnClickListener{soundPool.play(zippom, 1.0f, 1.0f, 0, 0, 1.0f)}

        val zombie = view.findViewById<ImageButton>(R.id.zombie)
        val zombiem =  soundPool.load(requireContext(), R.raw.zombie, 1)
        zombie.setOnClickListener{soundPool.play(zombiem, 1.0f, 1.0f, 0, 0, 1.0f)}

        return view
    }
}