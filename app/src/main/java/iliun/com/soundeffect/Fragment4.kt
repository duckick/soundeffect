package iliun.com.soundeffect


import android.app.AlertDialog
import android.content.ContentValues
import android.media.SoundPool
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.realpacific.clickshrinkeffect.applyClickShrink
import iliun.com.R
import java.io.FileOutputStream

class Fragment4 : Fragment() {
    lateinit var mAdView : AdView
    private val soundPool = SoundPool.Builder().setMaxStreams(1).build()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_4, container, false)

        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.shake)
        val aniBtn5 = AnimationUtils.loadAnimation(requireContext(),R.anim.shakeroof)
        val aniLoop = AnimationUtils.loadAnimation(requireContext(),R.anim.bounce)
        val aniLongclick = AnimationUtils.loadAnimation(requireContext(),R.anim.zoomin)
        val mhandler = Handler(Looper.getMainLooper())
//        MobileAds.initialize(requireContext()) {}
        val emptym = soundPool.load(requireContext(),R.raw.empty,1)
        val adRequest = AdRequest.Builder().build()
        fun emptysound()  { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f) }

//--------------------------------------------------------------------------------

        val gun = view.findViewById<ImageButton>(R.id.gun)
        val gunm =  soundPool.load(requireContext(), R.raw.gun, 1)
        gun.setOnClickListener{soundPool.play(gunm, 1.0f, 1.0f, 0, 0, 1.0f)}
        gun.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "chickendoll.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.chickendoll) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
                        while (true) { val data = inputStream.read()
                            if (data == -1) { break }
                            outputStream.write(data)
                        }
                        inputStream.close(); outputStream.close()
                        Toast.makeText(requireContext(),R.string.korean_success, Toast.LENGTH_LONG).show()
                    }
                } catch (e: Exception) {
                    Toast.makeText(requireContext(),R.string.korean_fail, Toast.LENGTH_SHORT).show()
                }
            }

            true
        }


        val heel = view.findViewById<ImageButton>(R.id.heel)
        val heelm =  soundPool.load(requireContext(), R.raw.heel, 1)
        heel.setOnClickListener{soundPool.play(heelm, 1.0f, 1.0f, 0, 0, 1.0f)}
        heel.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "heel.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.heel) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val horn = view.findViewById<ImageButton>(R.id.horn)
        val hornm =  soundPool.load(requireContext(), R.raw.horn, 1)
        horn.setOnClickListener{soundPool.play(hornm, 0.9f, 0.9f, 0, 0, 1.0f)}
        horn.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "horn.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.horn) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val killed = view.findViewById<ImageButton>(R.id.killed)
        val killedm =  soundPool.load(requireContext(), R.raw.killed, 1)
        killed.setOnClickListener{soundPool.play(killedm, 1.0f, 1.0f, 0, 0, 1.0f)}
        killed.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "killed.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.killed) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val laser = view.findViewById<ImageButton>(R.id.laser)
        val laserm =  soundPool.load(requireContext(), R.raw.laser, 1)
        laser.setOnClickListener{soundPool.play(laserm, 1.0f, 1.0f, 0, 0, 1.0f)}
        laser.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "laser.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.laser) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val laugh = view.findViewById<ImageButton>(R.id.laugh)
        val laughm =  soundPool.load(requireContext(), R.raw.laugh, 1)
        laugh.setOnClickListener{soundPool.play(laughm, 0.9f, 0.9f, 0, 0, 1.0f)}
        laugh.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "laugh.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.laugh) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val lion = view.findViewById<ImageButton>(R.id.lion)
        val lionm =  soundPool.load(requireContext(), R.raw.lion, 1)
        lion.setOnClickListener{soundPool.play(lionm, 1.0f, 1.0f, 0, 0, 1.0f)}
        lion.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "lion.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.lion) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val marble = view.findViewById<ImageButton>(R.id.marble)
        val marblem =  soundPool.load(requireContext(), R.raw.marble, 1)
        marble.setOnClickListener{soundPool.play(marblem, 1.0f, 1.0f, 0, 0, 1.0f)}
        marble.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "marble.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.marble) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val monkey = view.findViewById<ImageButton>(R.id.monkey)
        val monkeym =  soundPool.load(requireContext(), R.raw.monkey, 1)
        monkey.setOnClickListener{soundPool.play(monkeym, 1.0f, 1.0f, 0, 0, 1.0f)}
        monkey.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "monkey.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.monkey) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val monster = view.findViewById<ImageButton>(R.id.monster)
        val monsterm =  soundPool.load(requireContext(), R.raw.monster, 1)
        monster.setOnClickListener{soundPool.play(monsterm, 0.5f, 0.5f, 0, 0, 1.0f)}
        monster.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "monster.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.monster) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val mosquito = view.findViewById<ImageButton>(R.id.mosquito)
        val mosquitom =  soundPool.load(requireContext(), R.raw.mosquito, 1)
        mosquito.setOnClickListener{soundPool.play(mosquitom, 1.0f, 1.0f, 0, 0, 1.0f)}
        mosquito.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "mosquito.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.mosquito) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val nope = view.findViewById<ImageButton>(R.id.nope)
        val nopem =  soundPool.load(requireContext(), R.raw.nope, 1)
        nope.setOnClickListener{soundPool.play(nopem, 1.0f, 1.0f, 0, 0, 1.0f)}
        nope.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "nope.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.nope) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val oh = view.findViewById<ImageButton>(R.id.oh)
        val ohm =  soundPool.load(requireContext(), R.raw.oh, 1)
        oh.setOnClickListener{soundPool.play(ohm, 1.0f, 1.0f, 0, 0, 1.0f)}
        oh.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "oh.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.oh) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val punch = view.findViewById<ImageButton>(R.id.punch)
        val punchm =  soundPool.load(requireContext(), R.raw.punch, 1)
        punch.setOnClickListener{soundPool.play(punchm, 1.0f, 1.0f, 0, 0, 1.0f)}
        punch.setOnLongClickListener {            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "punch.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.punch) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val question = view.findViewById<ImageButton>(R.id.question)
        val questionm =  soundPool.load(requireContext(), R.raw.question, 1)
        question.setOnClickListener{soundPool.play(questionm, 1.0f, 1.0f, 0, 0, 1.0f)}
        question.setOnLongClickListener {            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "question.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.question) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val scream = view.findViewById<ImageButton>(R.id.scream)
        val screamm =  soundPool.load(requireContext(), R.raw.scream, 1)
        scream.setOnClickListener{soundPool.play(screamm, 0.8f, 0.8f, 0, 0, 1.0f)}
        scream.setOnLongClickListener {            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "scream.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.scream) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val semitruck = view.findViewById<ImageButton>(R.id.semitruck)
        val semitruckm =  soundPool.load(requireContext(), R.raw.semitruck, 1)
        semitruck.setOnClickListener{soundPool.play(semitruckm, 0.8f, 0.8f, 0, 0, 1.0f)}
        semitruck.setOnLongClickListener {            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "semitruck.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.semitruck) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val sighman = view.findViewById<ImageButton>(R.id.sighman)
        val sighmanm =  soundPool.load(requireContext(), R.raw.sighman, 1)
        sighman.setOnClickListener{soundPool.play(sighmanm, 1.0f, 1.0f, 0, 0, 1.0f)}
        sighman.setOnLongClickListener {            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "sighman.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.sighman) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val sighwoman = view.findViewById<ImageButton>(R.id.sighwoman)
        val sighwomanm =  soundPool.load(requireContext(), R.raw.sighwoman, 1)
        sighwoman.setOnClickListener{soundPool.play(sighwomanm, 1.0f, 1.0f, 0, 0, 1.0f)}
        sighwoman.setOnLongClickListener {            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "sighwoman.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.sighwoman) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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



        val huh = view.findViewById<ImageButton>(R.id.huh)
        val huhm =  soundPool.load(requireContext(), R.raw.huh, 1)
        huh.setOnClickListener{soundPool.play(huhm, 1.0f, 1.0f, 0, 0, 1.0f)}
        huh.setOnLongClickListener {            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "huh.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.huh) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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
    override fun onPause() {
        super.onPause()
        soundPool.autoPause()
    }

    override fun onResume() {
        super.onResume()
        soundPool.autoResume()
    }
}
