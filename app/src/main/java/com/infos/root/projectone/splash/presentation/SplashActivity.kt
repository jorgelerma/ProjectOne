package com.infos.root.projectone.splash.presentation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.infos.root.projectone.movies.presentation.view.MoviesActivity
import com.infos.root.projectone.R

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        val intent = Intent(this, MainActivity::class.java)
        val intent = Intent(this, MoviesActivity::class.java)

        Handler().postDelayed({
            startActivity(intent)
            Log.e(this.localClassName, " @ splash")
            finish()
        }, 2000)
    }
}
