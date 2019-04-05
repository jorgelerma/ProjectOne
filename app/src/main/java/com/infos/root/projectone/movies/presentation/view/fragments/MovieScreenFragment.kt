package com.infos.root.projectone.movies.presentation.view.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infos.root.projectone.R
import com.infos.root.projectone.movies.presentation.view.MovieGenreDetailActivity
import kotlinx.android.synthetic.main.fragment_movie_screen.*
import kotlinx.android.synthetic.main.fragment_movie_screen.view.*


class MovieScreenFragment : Fragment(), View.OnClickListener {

    companion object {

        fun newInstance(): MovieScreenFragment {
            return MovieScreenFragment()
        }
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
        when(movieGenre?.id){
            populars_movies.id -> startMovieDetail(resources.getString(R.string.popular_movies))
            top_rated_movies.id -> startMovieDetail(resources.getString(R.string.top_rated_movies))
            upcoming_movies.id -> startMovieDetail(resources.getString(R.string.upcoming_movies))
        }
    }

    private fun startMovieDetail(movieType: String){
        val intent = Intent(this.context, MovieGenreDetailActivity::class.java)
        val bundle = Bundle()
        bundle.putString(resources.getString(R.string.toolbar_title), movieType)
        intent.putExtras(bundle)
        startActivity(intent)
    }

}