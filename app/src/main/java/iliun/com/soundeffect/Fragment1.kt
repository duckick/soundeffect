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


class Fragment1 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_1, container, false)

        val soundPool = SoundPool.Builder().setMaxStreams(1).build()

        val ambul = view.findViewById<ImageButton>(R.id.ambul)
        val answer = view.findViewById<ImageButton>(R.id.answer)
        val appear = view.findViewById<ImageButton>(R.id.appear)
        val apple = view.findViewById<ImageButton>(R.id.apple)

        val baby = view.findViewById<ImageButton>(R.id.baby)
        val balloon = view.findViewById<ImageButton>(R.id.balloon)
        val baseball = view.findViewById<ImageButton>(R.id.baseball)
        val bee = view.findViewById<ImageButton>(R.id.bee)

        val billiard = view.findViewById<ImageButton>(R.id.billiard)
        val bird = view.findViewById<ImageButton>(R.id.bird)
        val bowling = view.findViewById<ImageButton>(R.id.bowling)
        val brucelee = view.findViewById<ImageButton>(R.id.brucelee)

        val bubble = view.findViewById<ImageButton>(R.id.bubble)
        val bycicle = view.findViewById<ImageButton>(R.id.bycicle)
        val camera = view.findViewById<ImageButton>(R.id.camera)
        val car = view.findViewById<ImageButton>(R.id.car)

        val carbreak = view.findViewById<ImageButton>(R.id.carbreak)
        val cardirection = view.findViewById<ImageButton>(R.id.cardirection)
        val careful = view.findViewById<ImageButton>(R.id.careful)
        val carkey = view.findViewById<ImageButton>(R.id.carkey)




        val ambulm =  soundPool.load(requireContext(), R.raw.ambul, 1)
        val answerm =  soundPool.load(requireContext(), R.raw.answer, 1)
        val appearm =  soundPool.load(requireContext(), R.raw.appear, 1)
        val babym =  soundPool.load(requireContext(), R.raw.baby, 1)

        val balloonm =  soundPool.load(requireContext(), R.raw.balloon, 1)
        val baseballm =  soundPool.load(requireContext(), R.raw.baseball, 1)
        val beem =  soundPool.load(requireContext(), R.raw.bee, 1)
        val billiardsm =  soundPool.load(requireContext(), R.raw.billiards, 1)

        val birdm =  soundPool.load(requireContext(), R.raw.bird, 1)
        val bowlingm =  soundPool.load(requireContext(), R.raw.bowling, 1)
        val bruceleem =  soundPool.load(requireContext(), R.raw.brucelee, 1)
        val bubblem =  soundPool.load(requireContext(), R.raw.bubble, 1)

        val byciclem =  soundPool.load(requireContext(), R.raw.bycicle, 1)
        val cameram =  soundPool.load(requireContext(), R.raw.camera, 1)
        val carm =  soundPool.load(requireContext(), R.raw.car, 1)
        val carbreakm =  soundPool.load(requireContext(), R.raw.carbreak, 1)

        val applem =  soundPool.load(requireContext(), R.raw.apple, 1)
        val cardirectionm =  soundPool.load(requireContext(), R.raw.cardirection, 1)
        val carefulm =  soundPool.load(requireContext(), R.raw.careful, 1)
        val carkeym =  soundPool.load(requireContext(), R.raw.carkey, 1)


        ambul.setOnClickListener{soundPool.play(ambulm, 1.0f, 1.0f, 0, 0, 1.0f) }
        answer.setOnClickListener{soundPool.play(answerm, 1.0f, 1.0f, 0, 0, 1.0f)}
        appear.setOnClickListener{soundPool.play(appearm, 0.7f, 0.7f, 0, 0, 1.0f)}
        apple.setOnClickListener{soundPool.play(applem, 1.0f, 1.0f, 0, 0, 1.0f)}

        baby.setOnClickListener{soundPool.play(babym, 1.0f, 1.0f, 0, 0, 1.0f)}
        balloon.setOnClickListener{soundPool.play(balloonm, 1.2f, 1.2f, 0, 0, 1.0f)}
        baseball.setOnClickListener{soundPool.play(baseballm, 1.0f, 1.0f, 0, 0, 1.0f)}
        bee.setOnClickListener{soundPool.play(beem, 1.2f, 1.0f, 0, 0, 1.0f)}

        billiard.setOnClickListener{soundPool.play(billiardsm, 1.0f, 1.0f, 0, 0, 1.0f)}
        bird.setOnClickListener{soundPool.play(birdm, 1.0f, 1.0f, 0, 0, 1.0f)}
        bowling.setOnClickListener{soundPool.play(bowlingm, 1.0f, 1.0f, 0, 0, 1.0f)}
        brucelee.setOnClickListener{soundPool.play(bruceleem, 0.7f, 0.7f, 0, 0, 1.0f)}

        bubble.setOnClickListener{soundPool.play(bubblem, 1.0f, 1.0f, 0, 0, 1.0f)}
        bycicle.setOnClickListener{soundPool.play(byciclem, 1.0f, 1.0f, 0, 0, 1.0f)}
        camera.setOnClickListener{soundPool.play(cameram, 1.0f, 1.0f, 0, 0, 1.0f)}
        car.setOnClickListener{soundPool.play(carm, 1.0f, 1.0f, 0, 0, 1.0f)}

        carbreak.setOnClickListener{soundPool.play(carbreakm, 1.0f, 1.0f, 0, 0, 1.0f)}
        cardirection.setOnClickListener{soundPool.play(cardirectionm, 1.0f, 1.0f, 0, 0, 1.0f)}
        careful.setOnClickListener{soundPool.play(carefulm, 1.0f, 1.0f, 0, 0, 1.0f)}
        carkey.setOnClickListener{soundPool.play(carkeym, 1.0f, 1.0f, 0, 0, 1.0f)}

        ambul.applyClickShrink()
        answer.applyClickShrink()
        appear.applyClickShrink()
        appear.applyClickShrink()
        baby.applyClickShrink()
        balloon.applyClickShrink()
        baseball.applyClickShrink()
        bee.applyClickShrink()
        billiard.applyClickShrink()
        bird.applyClickShrink()
        bowling.applyClickShrink()
        brucelee.applyClickShrink()
        bubble.applyClickShrink()
        bycicle.applyClickShrink()
        camera.applyClickShrink()
        car.applyClickShrink()
        carbreak.applyClickShrink()
        cardirection.applyClickShrink()
        careful.applyClickShrink()
        carkey.applyClickShrink()

        return view
    }
}

