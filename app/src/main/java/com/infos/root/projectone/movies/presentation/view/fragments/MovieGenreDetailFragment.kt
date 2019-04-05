package com.infos.root.projectone.movies.presentation.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infos.root.projectone.R
import com.infos.root.projectone.movies.presentation.adapters.MovieGenreDetailsAdapter

class MovieGenreDetailFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    private var myDataset: ArrayList<String> = arrayListOf("John", "Tom")

    companion object {
        fun newInstance(): MovieGenreDetailFragment {
            return MovieGenreDetailFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewManager = LinearLayoutManager(container?.context)
        loadsInfo()
        viewAdapter = MovieGenreDetailsAdapter(myDataset)
        val view = inflater.inflate(R.layout.fragment_movie_genre_detail, container, false)

        recyclerView = view.findViewById<RecyclerView>(R.id.movie_genre_details_rv).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
        return view
    }

    private fun loadsInfo(){
        myDataset.add("Avengers")
        myDataset.add("I know what you did")
    }



}