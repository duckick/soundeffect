package iliun.com.soundeffect

import android.Manifest.permission.READ_CONTACTS
import android.Manifest.permission.WRITE_EXTERNAL_STORAGE
import android.app.AlertDialog
import android.content.ContentValues
import android.media.SoundPool
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.permissionx.guolindev.PermissionX
import com.realpacific.clickshrinkeffect.applyClickShrink
import iliun.com.R
import java.io.FileOutputStream
import java.util.jar.Manifest


class Fragment1 : Fragment() {

    private val soundPool = SoundPool.Builder().setMaxStreams(1).build()
    val WRITE_REQUEST_CODE: Int = 43

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val view: View = inflater.inflate(R.layout.fragment_1, container, false)

        val emptym = soundPool.load(requireContext(),R.raw.empty,1)
        val adRequest = AdRequest.Builder().build()
        val aniBtn5 = AnimationUtils.loadAnimation(requireContext(),R.anim.shakeroof)
        val aniLoop = AnimationUtils.loadAnimation(requireContext(),R.anim.bounce)
        val aniLongclick = AnimationUtils.loadAnimation(requireContext(),R.anim.zoomin)
        fun emptysound()  { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f) }

//        ------------------------------------------------------------------

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

        ambul.setOnLongClickListener {

//            PermissionX.init(activity).permissions(WRITE_EXTERNAL_STORAGE).request { allGranted, grantedList, deniedList ->
//                    if (allGranted) {
//                        Toast.makeText(requireContext() , "All permissions are granted", Toast.LENGTH_LONG).show()
//                    } else {
//                        Toast.makeText(requireContext() , "These permissions are denied: $deniedList", Toast.LENGTH_LONG).show()
//                    }
//                }

            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "ambul.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.ambul) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                        while (true) { val data = inputStream.read()
                            if (data == -1) { break }
                            outputStream.write(data)
                        }
                        inputStream.close(); outputStream.close()
                        Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                    }
                } catch (e: Exception) {
                    Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                }
              }
                true
            }




            answer.setOnClickListener { soundPool.play(answerm, 1.0f, 1.0f, 0, 0, 1.0f) }
            answer.setOnLongClickListener {

                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "answer.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.answer) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }
                true
            }


            appear.setOnClickListener { soundPool.play(appearm, 0.7f, 0.7f, 0, 0, 1.0f) }
            appear.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "appear.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.appear) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            apple.setOnClickListener { soundPool.play(applem, 1.0f, 1.0f, 0, 0, 1.0f) }
            apple.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "apple.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.apple) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }



            baby.setOnClickListener { soundPool.play(babym, 1.0f, 1.0f, 0, 0, 1.0f) }
            baby.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "baby.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.baby) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            balloon.setOnClickListener { soundPool.play(balloonm, 1.2f, 1.2f, 0, 0, 1.0f) }
            balloon.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "balloon.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.balloon) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            baseball.setOnClickListener { soundPool.play(baseballm, 1.0f, 1.0f, 0, 0, 1.0f) }
            baseball.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "baseball.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.baseball) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            bee.setOnClickListener { soundPool.play(beem, 1.2f, 1.0f, 0, 0, 1.0f) }
            bee.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "bee.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.bee) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }



            billiard.setOnClickListener { soundPool.play(billiardsm, 1.0f, 1.0f, 0, 0, 1.0f) }
            billiard.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "billiards.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.billiards) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            bird.setOnClickListener { soundPool.play(birdm, 1.0f, 1.0f, 0, 0, 1.0f) }
            bird.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "bird.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.bird) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            bowling.setOnClickListener { soundPool.play(bowlingm, 1.0f, 1.0f, 0, 0, 1.0f) }
            bowling.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "bowling.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.bowling) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            brucelee.setOnClickListener { soundPool.play(bruceleem, 0.7f, 0.7f, 0, 0, 1.0f) }
            brucelee.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "brucelee.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.brucelee) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }



            bubble.setOnClickListener { soundPool.play(bubblem, 1.0f, 1.0f, 0, 0, 1.0f) }
            bubble.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "bubble.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.bubble) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            bycicle.setOnClickListener { soundPool.play(byciclem, 1.0f, 1.0f, 0, 0, 1.0f) }
            bycicle.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "bycicle.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.bycicle) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            camera.setOnClickListener { soundPool.play(cameram, 1.0f, 1.0f, 0, 0, 1.0f) }
            camera.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "camera.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.camera) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            car.setOnClickListener { soundPool.play(carm, 1.0f, 1.0f, 0, 0, 1.0f) }
            car.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "car.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.car) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }



            carbreak.setOnClickListener { soundPool.play(carbreakm, 1.0f, 1.0f, 0, 0, 1.0f) }
            carbreak.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "carbreak.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.carbreak) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            cardirection.setOnClickListener {
                soundPool.play(cardirectionm, 1.0f, 1.0f, 0, 0, 1.0f) }
            cardirection.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "cardirection.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.cardirection) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            careful.setOnClickListener { soundPool.play(carefulm, 1.0f, 1.0f, 0, 0, 1.0f) }
            careful.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "careful.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.careful) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }


            carkey.setOnClickListener { soundPool.play(carkeym, 1.0f, 1.0f, 0, 0, 1.0f) }
            carkey.setOnLongClickListener {
                val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
                val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
                val add: AlertDialog = mBuilder.create(); add.show();
                mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                    try {
                        val contentResolver = requireContext().contentResolver
                        val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                        val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "carkey.mp3") }
                        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                            val inputStream = resources.openRawResource(R.raw.carkey) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                            while (true) { val data = inputStream.read()
                                if (data == -1) { break }
                                outputStream.write(data)
                            }
                            inputStream.close(); outputStream.close()
                            Toast.makeText(requireContext(),R.string.korean_success,Toast.LENGTH_LONG).show()
                        }
                    } catch (e: Exception) {
                        Toast.makeText(requireContext(),R.string.korean_fail,Toast.LENGTH_SHORT).show()
                    }
                }

                true
            }



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


    override fun onPause() {
        super.onPause()
        soundPool.autoPause()
    }




    override fun onResume() {
        super.onResume()
        soundPool.autoResume()
    }

}


//     @RequiresApi(Build.VERSION_CODES.Q)
//     private fun downAudio(str:String) {
//        val contentResolver = requireContext().contentResolver
//        val audioCollection = MediaStore.Audio.Media
//            .getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)
//        val songDetails = ContentValues().apply {
//            put(MediaStore.Audio.Media.DISPLAY_NAME, "${str}.mp3")
//            put(MediaStore.Audio.Media.IS_PENDING, 1)
//        }
//        val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
//        contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
//            val inputStream = resources.openRawResource(R.raw."$str")
//            val outputStream = FileOutputStream(pfd.fileDescriptor)
//            while (true) {
//                val data = inputStream.read()
//                if (data == -1) {
//                    break
//                }
//                outputStream.write(data)
//            }
//            inputStream.close()
//            outputStream.close()
//        }
//        songDetails.clear()
//        songDetails.put(MediaStore.Audio.Media.IS_PENDING, 0)
//        contentResolver.update(songContentUri, songDetails, null, null)
//     }
//}
  //-----------------Sample----------------
//ambul.setOnClickListener{soundPool.play(ambulm, 1.0f, 1.0f, 0, 0, 1.0f) }
//
//ambul.setOnLongClickListener {
//    val mhandler = Handler(Looper.getMainLooper())
//    val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
//    val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("").setCancelable(false)
//    val add: AlertDialog =  mBuilder.create()
//    add.show(); it.startAnimation(aniLongclick);
//    mAdView = mDialogView.findViewById(R.id.dialog_adView); mAdView.loadAd(adRequest)
//
//    mDialogView.findViewById<Button>(R.id.btn_loop).setOnClickListener {
//        soundPool.play(ambulm, 1.0f, 1.0f, 0, -1, 1.0f); it.startAnimation(aniLoop) }
//    mDialogView.findViewById<Button>(R.id.btn_5).setOnClickListener {
//
//        emptysound(); mhandler.postDelayed(soundPool.play(ambulm, 1.0f, 1.0f, 0, 0, 1.0f) ,5000) ;it.startAnimation(aniBtn5)
//    }
//    mDialogView.findViewById<Button>(R.id.btn_stop).setOnClickListener { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f); add.dismiss()
//        mhandler.removeCallbacksAndMessages(null);aniLoop.cancel();  emptysound()}
//    true
//}
