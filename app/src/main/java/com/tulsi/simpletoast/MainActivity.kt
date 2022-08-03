package com.tulsi.simpletoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tulsi.toasty.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toasty.showToasty(this,"Welcome")
    }
}