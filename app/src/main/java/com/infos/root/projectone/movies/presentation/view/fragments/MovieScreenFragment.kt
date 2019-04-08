package com.infos.root.projectone.movies.presentation.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infos.root.projectone.R
import com.infos.root.projectone.movies.presentation.presenters.MoviesPresenter
import kotlinx.android.synthetic.main.fragment_movie_screen.view.*


class MovieScreenFragment : Fragment(), View.OnClickListener {

    lateinit var movieAct: MoviesPresenter

    companion object {

        fun newInstance(): MovieScreenFragment {
            return MovieScreenFragment()
        }
    }

    fun setMovieActivity(movieAct: MoviesPresenter) {
        this.movieAct = movieAct
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movie_screen, container, false)
        view.populars_movies.setOnClickListener(this)
        view.top_rated_movies.setOnClickListener(this)
        view.upcoming_movies.setOnClickListener(this)
        return view
    }

    override fun onClick(movieGenre: View?) {
        movieAct.replaceFragment(movieGenre!!.id)
    }
}