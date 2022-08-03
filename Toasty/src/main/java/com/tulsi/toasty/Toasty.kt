package com.tulsi.toasty

import android.content.Context
import android.widget.Toast

object Toasty {
    fun showToasty(context:Context,msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}