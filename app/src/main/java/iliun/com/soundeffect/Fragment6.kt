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

class Fragment6 : Fragment() {
    lateinit var mAdView : AdView
    private val soundPool = SoundPool.Builder().setMaxStreams(1).build()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_6, container, false)

        val animation = AnimationUtils.loadAnimation(requireContext(), R.anim.shake)
        val aniBtn5 = AnimationUtils.loadAnimation(requireContext(),R.anim.shakeroof)
        val aniLoop = AnimationUtils.loadAnimation(requireContext(),R.anim.bounce)
        val aniLongclick = AnimationUtils.loadAnimation(requireContext(),R.anim.zoomin)
        val mhandler = Handler(Looper.getMainLooper())
//        MobileAds.initialize(requireContext()) {}
        val emptym = soundPool.load(requireContext(),R.raw.empty,1)
        val adRequest = AdRequest.Builder().build()
        fun emptysound()  { soundPool.play(emptym, 1.0f, 1.0f, 0, 0, 1.0f) }


        //--------------------------------------------------------------------------
        val axe = view.findViewById<ImageButton>(R.id.axe)
        val axem =  soundPool.load(requireContext(), R.raw.axe, 1)
        axe.setOnClickListener{soundPool.play(axem, 1.0f, 1.0f, 0, 0, 1.0f)}
        axe.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "axe.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.axe) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val boiling = view.findViewById<ImageButton>(R.id.boiling)
        val boilingm =  soundPool.load(requireContext(), R.raw.boiling, 1)
        boiling.setOnClickListener{soundPool.play(boilingm, 1.0f, 1.0f, 0, 0, 1.0f)}
        boiling.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "boiling.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.boiling) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val broom = view.findViewById<ImageButton>(R.id.broom)
        val broomm =  soundPool.load(requireContext(), R.raw.broom, 1)
        broom.setOnClickListener{soundPool.play(broomm, 1.0f, 1.0f, 0, 0, 1.0f)}
        broom.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "broom.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.broom) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val fan = view.findViewById<ImageButton>(R.id.fan)
        val fanm =  soundPool.load(requireContext(), R.raw.fan, 1)
        fan.setOnClickListener{soundPool.play(fanm, 1.0f, 1.0f, 0, 0, 1.0f)}
        fan.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "fan.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.fan) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val hey = view.findViewById<ImageButton>(R.id.hey)
        val heym =  soundPool.load(requireContext(), R.raw.hey, 1)
        hey.setOnClickListener{soundPool.play(heym, 1.0f, 1.0f, 0, 0, 1.0f)}
        hey.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "hey.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.hey) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val kakao = view.findViewById<ImageButton>(R.id.kakao)
        val kakaom =  soundPool.load(requireContext(), R.raw.kakao, 1)
        kakao.setOnClickListener{soundPool.play(kakaom, 1.0f, 1.0f, 0, 0, 1.0f)}
        kakao.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "kakao.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.kakao) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val kiss = view.findViewById<ImageButton>(R.id.kiss)
        val kissm =  soundPool.load(requireContext(), R.raw.kiss, 1)
        kiss.setOnClickListener{soundPool.play(kissm, 1.0f, 1.0f, 0, 0, 1.0f)}
        kiss.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "kiss.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.kiss) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val match = view.findViewById<ImageButton>(R.id.match)
        val matchm =  soundPool.load(requireContext(), R.raw.matche, 1)
        match.setOnClickListener{soundPool.play(matchm, 1.0f, 1.0f, 0, 0, 1.0f)}
        match.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "match.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.matche) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val shit = view.findViewById<ImageButton>(R.id.shit)
        val shitm =  soundPool.load(requireContext(), R.raw.shit, 1)
        shit.setOnClickListener{soundPool.play(shitm, 1.0f, 1.0f, 0, 0, 1.0f)}
        shit.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "shit.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.shit) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val siren = view.findViewById<ImageButton>(R.id.siren)
        val sirenm =  soundPool.load(requireContext(), R.raw.siren, 1)
        siren.setOnClickListener{soundPool.play(sirenm, 0.8f, 0.8f, 0, 0, 1.0f)}
        siren.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "siren.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.siren) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val train = view.findViewById<ImageButton>(R.id.train)
        val trainm =  soundPool.load(requireContext(), R.raw.train, 1)
        train.setOnClickListener{soundPool.play(trainm, 0.9f, 0.9f, 0, 0, 1.0f)}
        train.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "train.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.train) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val typing = view.findViewById<ImageButton>(R.id.typing)
        val typingm =  soundPool.load(requireContext(), R.raw.typing, 1)
        typing.setOnClickListener{soundPool.play(typingm, 1.0f, 1.0f, 0, 0, 1.0f)}
        typing.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "typing.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.typing) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val waves = view.findViewById<ImageButton>(R.id.waves)
        val wavesm =  soundPool.load(requireContext(), R.raw.waves, 1)
        waves.setOnClickListener{soundPool.play(wavesm, 1.0f, 1.0f, 0, 0, 1.0f)}
        waves.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "waves.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.waves) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val whistle = view.findViewById<ImageButton>(R.id.whistle)
        val whistlem =  soundPool.load(requireContext(), R.raw.whistle, 1)
        whistle.setOnClickListener{soundPool.play(whistlem, 0.9f, 0.9f, 0, 0, 1.0f)}
        whistle.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "whistle.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.whistle) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val windows = view.findViewById<ImageButton>(R.id.windows)
        val windowsm =  soundPool.load(requireContext(), R.raw.windows, 1)
        windows.setOnClickListener{soundPool.play(windowsm, 1.0f, 1.0f, 0, 0, 1.0f)}
        windows.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "windows.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.windows) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val witch = view.findViewById<ImageButton>(R.id.witch)
        val witchm =  soundPool.load(requireContext(), R.raw.witch, 1)
        witch.setOnClickListener{soundPool.play(witchm, 1.0f, 1.0f, 0, 0, 1.0f)}
        witch.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "witch.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.witch) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val wolf = view.findViewById<ImageButton>(R.id.wolf)
        val wolfm =  soundPool.load(requireContext(), R.raw.wolf, 1)
        wolf.setOnClickListener{soundPool.play(wolfm, 0.9f, 0.9f, 0, 0, 1.0f)}
        wolf.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "wolf.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.wolf) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val wow = view.findViewById<ImageButton>(R.id.wow)
        val wowm =  soundPool.load(requireContext(), R.raw.wow, 1)
        wow.setOnClickListener{soundPool.play(wowm, 0.9f, 0.9f, 0, 0, 1.0f)}
        wow.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "wow.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.wow) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val zippo = view.findViewById<ImageButton>(R.id.zippo)
        val zippom =  soundPool.load(requireContext(), R.raw.zippo, 1)
        zippo.setOnClickListener{soundPool.play(zippom, 1.0f, 1.0f, 0, 0, 1.0f)}
        zippo.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "zippo.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.zippo) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        val zombie = view.findViewById<ImageButton>(R.id.zombie)
        val zombiem =  soundPool.load(requireContext(), R.raw.zombie, 1)
        zombie.setOnClickListener{soundPool.play(zombiem, 0.8f, 0.8f, 0, 0, 1.0f)}
        zombie.setOnLongClickListener {
            val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_custom_dialog, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("")
            val add: AlertDialog = mBuilder.create(); add.show();
            mDialogView.findViewById<Button>(R.id.btn_noti).setOnClickListener {

                try {
                    val contentResolver = requireContext().contentResolver
                    val audioCollection = MediaStore.Audio.Media.getContentUri(MediaStore.VOLUME_EXTERNAL)
                    val songDetails = ContentValues().apply { put(MediaStore.Audio.Media.DISPLAY_NAME, "zombie.mp3") }
                    val songContentUri = contentResolver.insert(audioCollection, songDetails)!!
                    contentResolver.openFileDescriptor(songContentUri, "w", null)?.use { pfd ->
                        val inputStream = resources.openRawResource(R.raw.zombie) ; val outputStream = FileOutputStream(pfd.fileDescriptor)
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


        axe.applyClickShrink()
        boiling.applyClickShrink()
        broom.applyClickShrink()
        fan.applyClickShrink()
        hey.applyClickShrink()
        kakao.applyClickShrink()
        kiss.applyClickShrink()
        match.applyClickShrink()
        shit.applyClickShrink()
        siren.applyClickShrink()
        train.applyClickShrink()
        typing.applyClickShrink()
        waves.applyClickShrink()
        whistle.applyClickShrink()
        windows.applyClickShrink()
        witch.applyClickShrink()
        wolf.applyClickShrink()
        wow.applyClickShrink()
        zippo.applyClickShrink()
        zombie.applyClickShrink()

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

