package com.infos.root.projectone.movies.presentation.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.infos.root.projectone.R
import com.infos.root.projectone.movies.presentation.view.fragments.MovieGenreDetailFragment
import kotlinx.android.synthetic.main.activity_movie_genre_detail.*

class MovieGenreDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_genre_detail)

        val bundle = intent.extras
        val toolbarTitle = bundle?.getString(resources.getString(R.string.toolbar_title))

        toolbar_genre_title.text = toolbarTitle
            supportFragmentManager
                .beginTransaction()
                .add(R.id.movies_genre_detail_fragment, MovieGenreDetailFragment.newInstance(), this.javaClass.simpleName)
                .commit()
    }
}