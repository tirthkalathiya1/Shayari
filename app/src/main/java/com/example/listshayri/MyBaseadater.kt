package com.example.listshayri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyBaseadater(var mainActivity: MainActivity,var shayri: Array<String>)  : BaseAdapter() {
    override fun getCount(): Int {

        return shayri.size
    }

    override fun getItem(p0: Int): Any {

        return  p0
    }

    override fun getItemId(p0: Int): Long {

        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var txt : TextView

        var view = LayoutInflater.from(mainActivity).inflate(R.layout.abc,p2,false)
         txt = view.findViewById(R.id.txt)

        txt.setText(shayri[p0])

        return view

    }

}
