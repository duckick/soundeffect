package com.iliun.soundeffect
import android.media.SoundPool
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class Fragment3 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_3, container, false)

        val soundPool = SoundPool.Builder().setMaxStreams(6).build()

        val diving = view.findViewById<ImageButton>(R.id.diving)
        val divingm =  soundPool.load(requireContext(), R.raw.diving, 1)
        diving.setOnClickListener{soundPool.play(divingm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val dog = view.findViewById<ImageButton>(R.id.dog)
        val dogm =  soundPool.load(requireContext(), R.raw.dog, 1)
        dog.setOnClickListener{soundPool.play(dogm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val doorbell = view.findViewById<ImageButton>(R.id.doorbell)
        val doorbellm =  soundPool.load(requireContext(), R.raw.doorbell, 1)
        doorbell.setOnClickListener{soundPool.play(doorbellm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val drill = view.findViewById<ImageButton>(R.id.drill)
        val drillm =  soundPool.load(requireContext(), R.raw.drill, 1)
        drill.setOnClickListener{soundPool.play(drillm, 0.8f, 0.8f, 0, 0, 1.0f)}

        val drum = view.findViewById<ImageButton>(R.id.drum)
        val drumm =  soundPool.load(requireContext(), R.raw.drum, 1)
        drum.setOnClickListener{soundPool.play(drumm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val drumset = view.findViewById<ImageButton>(R.id.drumset)
        val drumsetm =  soundPool.load(requireContext(), R.raw.drumset, 1)
        drumset.setOnClickListener{soundPool.play(drumsetm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val duck = view.findViewById<ImageButton>(R.id.duck)
        val duckm =  soundPool.load(requireContext(), R.raw.duck, 1)
        duck.setOnClickListener{soundPool.play(duckm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val eggfried = view.findViewById<ImageButton>(R.id.eggfried)
        val eggfriedm=  soundPool.load(requireContext(), R.raw.eggfried, 1)
        eggfried.setOnClickListener{soundPool.play(eggfriedm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val elephant = view.findViewById<ImageButton>(R.id.elephant)
        val elephantm =  soundPool.load(requireContext(), R.raw.elephant, 1)
        elephant.setOnClickListener{soundPool.play(elephantm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val evil = view.findViewById<ImageButton>(R.id.evil)
        val evilm =  soundPool.load(requireContext(), R.raw.evil, 1)
        evil.setOnClickListener{soundPool.play(evilm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val explosion = view.findViewById<ImageButton>(R.id.explosion)
        val explosionm =  soundPool.load(requireContext(), R.raw.explosion, 1)
        explosion.setOnClickListener{soundPool.play(explosionm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val fallingman = view.findViewById<ImageButton>(R.id.fallingman)
        val fallingmanm =  soundPool.load(requireContext(), R.raw.fallingman, 1)
        fallingman.setOnClickListener{soundPool.play(fallingmanm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val fanfare = view.findViewById<ImageButton>(R.id.fanfare)
        val fanfarem =  soundPool.load(requireContext(), R.raw.fanfare, 1)
        fanfare.setOnClickListener{soundPool.play(fanfarem, 0.9f, 0.9f, 0, 0, 1.0f)}

        val fart = view.findViewById<ImageButton>(R.id.fart)
        val fartm =  soundPool.load(requireContext(), R.raw.fart, 1)
        fart.setOnClickListener{soundPool.play(fartm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val fireworks = view.findViewById<ImageButton>(R.id.fireworks)
        val fireworksm =  soundPool.load(requireContext(), R.raw.firework, 1)
        fireworks.setOnClickListener{soundPool.play(fireworksm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val fryingpan = view.findViewById<ImageButton>(R.id.fryingpan)
        val fryingpanm =  soundPool.load(requireContext(), R.raw.frypan, 1)
        fryingpan.setOnClickListener{soundPool.play(fryingpanm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val galaga = view.findViewById<ImageButton>(R.id.galaga)
        val galagam =  soundPool.load(requireContext(), R.raw.galaga, 1)
        galaga.setOnClickListener{soundPool.play(galagam, 1.0f, 1.0f, 0, 0, 1.0f)}

        val ghost = view.findViewById<ImageButton>(R.id.ghost)
        val ghostm =  soundPool.load(requireContext(), R.raw.ghost, 1)
        ghost.setOnClickListener{soundPool.play(ghostm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val glass = view.findViewById<ImageButton>(R.id.glass)
        val glassm =  soundPool.load(requireContext(), R.raw.glass, 1)
        glass.setOnClickListener{soundPool.play(glassm, 1.0f, 1.0f, 0, 0, 1.0f)}

        val go = view.findViewById<ImageButton>(R.id.go)
        val gom =  soundPool.load(requireContext(), R.raw.go, 1)
        go.setOnClickListener{soundPool.play(gom, 1.0f, 1.0f, 0, 0, 1.0f)}



        return view
    }
}