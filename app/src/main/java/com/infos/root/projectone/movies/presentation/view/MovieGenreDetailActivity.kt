package com.infos.root.projectone.movies.presentation.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.infos.root.projectone.R
import com.infos.root.projectone.movies.presentation.view.fragments.MovieGenreDetailFragment

class MovieGenreDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_genre_detail)

        Log.e(this.javaClass.simpleName, "  Movie Genre Detail Activity started:  ")
            supportFragmentManager
                .beginTransaction()
                .add(R.id.movies_genre_detail_fragment, MovieGenreDetailFragment.newInstance(), "genreDetail")
                .commit()

    }
}