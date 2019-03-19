package com.sritechsoftsolutions.recylcerviewwithcardview

import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.indiview.view.*
import java.io.File

class Myadapter(var mainActivity: MainActivity) : RecyclerView.Adapter<MyHolder>() {

    var files:Array<File>?=null
    init {
        readFiles()

 }

    fun readFiles()
    {
        var path:String="/storage/emulated/0/WhatsApp/Media/WhatsApp Images"
        var f:File= File(path)
      files =f.listFiles()

    }
    override fun onCreateViewHolder(p: ViewGroup, p1: Int): MyHolder {

        var lInflater=LayoutInflater.from(mainActivity)
        var view=lInflater.inflate(R.layout.indiview,p,false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return files!!.size

    }

    override fun onBindViewHolder(holder: MyHolder, p1: Int) {


        var fnew=files!![p1]
        holder.imgView?.setImageURI(Uri.fromFile(fnew))
        holder.filename?.setText(fnew.name)


        }

    }
