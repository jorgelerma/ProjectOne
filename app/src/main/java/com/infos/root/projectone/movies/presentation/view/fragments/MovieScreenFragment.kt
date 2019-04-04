package com.infos.root.projectone.movies.presentation.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infos.root.projectone.R


class MovieScreenFragment : Fragment() {

    companion object {

        fun newInstance(): MovieScreenFragment {
            return MovieScreenFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_movie_screen, container, false)
    }

}