package com.infos.root.projectone.movies.presentation.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.infos.root.projectone.R
import com.infos.root.projectone.movies.presentation.view.fragments.MovieScreenFragment


class MoviesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.movies_fragment, MovieScreenFragment.newInstance(), "rageComicList")
                .commit()
        }
    }
}
