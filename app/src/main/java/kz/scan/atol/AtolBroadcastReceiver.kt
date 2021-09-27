package kz.scan.atol

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AtolBroadcastReceiver: BroadcastReceiver() {


    override fun onReceive(p0: Context, p1: Intent) {
        val bcInterface = p0 as BroadcastInterface
        val barcode = p1.getStringExtra("com.hht.emdk.datawedge.data_string")
        bcInterface.sendString(result = barcode)
    }
}