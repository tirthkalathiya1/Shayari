package com.example.listshayri

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast




class MyBaseadapter2(var mainActivity2: MainActivity2, var blank: Array<String>) : BaseAdapter() {
    override fun getCount(): Int {

        return blank.size
    }

    override fun getItem(p0: Int): Any {

        return p0
    }

    override fun getItemId(p0: Int): Long {

        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var tx:TextView
        var copy : ImageView
        var share:ImageView
        var whatsapp:ImageView
        var view= LayoutInflater.from(mainActivity2).inflate(R.layout.abc2,p2,false)
        tx = view.findViewById(R.id.tx1)
        copy = view.findViewById(R.id.copy)
        share = view.findViewById(R.id.share)
        whatsapp = view.findViewById(R.id.whatsapp)
        tx.setText(blank[p0])

//        copy.setBackgroundResource(arrr[p0])

        copy.setOnClickListener {

            val clipboardManager = mainActivity2.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("text", blank[p0])
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(mainActivity2, "Text copied to clipboard", Toast.LENGTH_LONG).show()

        }
        share.setOnClickListener {

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            mainActivity2.startActivity(shareIntent)
        }
        whatsapp.setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND)

            intent.type = "text/plain"
            intent.setPackage("com.whatsapp")
            intent.putExtra(Intent.EXTRA_TEXT, blank[p0])
            mainActivity2.startActivity(intent)

        }


        return view

    }

}
