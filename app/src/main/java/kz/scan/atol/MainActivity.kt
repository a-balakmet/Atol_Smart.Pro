package kz.scan.atol

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), BroadcastInterface {


    private lateinit var textView: TextView
    private val receiver = AtolBroadcastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(receiver, IntentFilter("DATA_SCAN"))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }

    override fun sendString(result: String?) {
        textView.text = result
    }


}