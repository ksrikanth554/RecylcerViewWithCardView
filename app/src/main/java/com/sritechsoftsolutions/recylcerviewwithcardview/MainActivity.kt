package com.sritechsoftsolutions.recylcerviewwithcardview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  var lManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
       var lManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        rview.layoutManager=lManager
        rview.adapter=Myadapter(this@MainActivity)
    }
}
