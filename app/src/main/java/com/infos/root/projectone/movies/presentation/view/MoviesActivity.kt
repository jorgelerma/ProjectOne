package com.infos.root.projectone.movies.presentation.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.infos.root.projectone.R
import com.infos.root.projectone.movies.presentation.presenters.MoviesContract
import com.infos.root.projectone.movies.presentation.view.fragments.MovieScreenFragment
import com.infos.root.projectone.movies.presentation.view.fragments.PopularMoviesFragment
import com.infos.root.projectone.movies.presentation.view.fragments.TopRatedMoviesFragment
import com.infos.root.projectone.movies.presentation.view.fragments.UpcomingMoviesFragment
import kotlinx.android.synthetic.main.activity_movies.*
import kotlinx.android.synthetic.main.fragment_movie_screen.*


class MoviesActivity : AppCompatActivity(), MoviesContract.MovieView {

    val fragmentManager = supportFragmentManager
    val movieScreenFragment = MovieScreenFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        movieScreenFragment.setMovieActivity(this)
        fragmentManager
                .beginTransaction()
                .add(R.id.movies_fragment, movieScreenFragment,
                    resources.getString(R.string.fragment_main_id))
                .commit()
    }

    override fun replaceFragment(genre: Int) {

        val fragmentTransaction = fragmentManager.beginTransaction()

        when(genre){
            populars_movies.id -> {
                main_toolbar.text = resources.getString(R.string.popular_movies)
                fragmentTransaction
                    .replace(R.id.movies_fragment, PopularMoviesFragment.newInstance())
            }
            top_rated_movies.id -> {
                main_toolbar.text = resources.getString(R.string.top_rated_movies)
                fragmentTransaction
                    .replace(R.id.movies_fragment, TopRatedMoviesFragment.newInstance())
            }
            upcoming_movies.id -> {
                main_toolbar.text = resources.getString(R.string.upcoming_movies)
                fragmentTransaction
                    .replace(R.id.movies_fragment, UpcomingMoviesFragment.newInstance())
            }
        }
        fragmentTransaction.commit()
    }

    override fun onBackPressed() {

        if(!movieScreenFragment.isVisible){
            main_toolbar.text = resources.getString(R.string.movies_title)
            fragmentManager
                .beginTransaction()
                .add(R.id.movies_fragment, movieScreenFragment,
                    resources.getString(R.string.fragment_main_id))
                .commit()
        }else{
            super.onBackPressed()
        }
    }
}
