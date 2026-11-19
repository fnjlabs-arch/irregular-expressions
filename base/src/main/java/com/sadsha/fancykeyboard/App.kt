package com.sadsha.fancykeyboard

import android.app.Application
import com.sadsha.fancykeyboard.styles.AvailableStyles

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        /* Initialize text styles */
        AvailableStyles.init(applicationContext)
    }
}
