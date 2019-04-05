package com.infos.root.projectone.movies.presentation.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infos.root.projectone.R
import kotlinx.android.synthetic.main.fragment_movie_screen.view.*

class MovieGenreDetailFragment : Fragment() {

    companion object {

        fun newInstance(): MovieGenreDetailFragment {
            return MovieGenreDetailFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_movie_genre_detail, container, false)
        return view
    }



}