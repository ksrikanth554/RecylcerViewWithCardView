package com.sritechsoftsolutions.recylcerviewwithcardview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.indiview.view.*



class MyHolder(view: View) : RecyclerView.ViewHolder(view) {
    var imgView:ImageView ?= null
    var filename:TextView?=null
    init {
        imgView=view.imgView
        filename=view.txtfname



    }

}