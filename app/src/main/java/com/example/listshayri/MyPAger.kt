package com.example.listshayri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class MyPAger(var mainActivity3: MainActivity3, var tt: Array<String>?) : PagerAdapter() {
    override fun getCount(): Int {

        return tt!!.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view == `object`
    }

    // ctrl + o
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {


            container.removeView(`object` as View)
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {


        var setshayri: TextView
        var vv = LayoutInflater.from(mainActivity3).inflate(R.layout.xyz, container, false)
        setshayri = vv.findViewById(R.id.setshayri)


        setshayri.setText(tt!![position])
        container.addView(vv)

        return  vv

    }


}
