package com.infos.root.projectone.movies.presentation.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.infos.root.projectone.R

class MovieGenreDetailsAdapter(private val moviesDataset: ArrayList<String>) :
    RecyclerView.Adapter<MovieGenreDetailsAdapter.MyViewHolder>() {

    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MovieGenreDetailsAdapter.MyViewHolder {

        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_genre_detail_item, parent, false) as TextView
        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = moviesDataset[position]
    }

    override fun getItemCount() = moviesDataset.size
}