package com.infos.root.projectone.movies.presentation.view.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
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
        val view = inflater?.inflate(R.layout.fragment_movie_screen, container, false)
        view.populars_movies.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        when(v?.id){
            populars_movies.id -> startMovieDetail()
            top_rated_movies.id -> Log.e(this.javaClass.simpleName, " Top rated movies")
            upcoming_movies.id -> Log.e(this.javaClass.simpleName, " Upcoming movies")
        }
    }

    fun startMovieDetail(){

//        childFragmentManager
//            .beginTransaction()
//            .add(R.id.movies_genre_detail_fragment, MovieGenreDetailFragment(), "genreDetail")
//            .commit()
        Log.e(this.javaClass.simpleName, "start genre detail act")
        val intent = Intent(this.context, MovieGenreDetailActivity::class.java)
        startActivity(intent)
    }

}