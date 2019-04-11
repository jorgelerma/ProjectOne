package com.infos.root.projectone.movies.presentation.view.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infos.root.projectone.R
import com.infos.root.projectone.movies.presentation.presenters.MoviesContract
import kotlinx.android.synthetic.main.fragment_movie_screen.view.*


class MovieScreenFragment : Fragment(), View.OnClickListener {

    private lateinit var movieAct: MoviesContract.MovieView

    companion object {

        fun newInstance(): MovieScreenFragment {
            return MovieScreenFragment()
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        this.movieAct = context as MoviesContract.MovieView
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