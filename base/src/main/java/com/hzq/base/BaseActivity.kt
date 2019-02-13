package com.hzq.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        create(savedInstanceState)
    }

    abstract fun getLayout():Int

    abstract fun create(savedInstanceState: Bundle?)

}
