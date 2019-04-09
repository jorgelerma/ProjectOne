package com.infos.root.projectone.movies.presentation.presenters

interface MoviesContract {

    interface MovieView{
        fun replaceFragment(genre: Int)
    }

}