package com.example.dailybreakingnews.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.dailybreakingnews.MainActivity
import com.example.dailybreakingnews.R

class SearchNewsFragment: Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as MainActivity).viewModel
    }
}