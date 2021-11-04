package com.quangdm.alldocument.screen.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.Unbinder
import com.quangdm.alldocument.R
import com.quangdm.alldocument.base.BaseFragment

class SearchFragment : BaseFragment(),View.OnClickListener {

    lateinit var unbinder: Unbinder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        unbinder = ButterKnife.bind(this, view)
//        showDialogLoading()
        return view
    }

    override fun initUI() {

    }

    override fun initControl() {

    }

    override fun setOnClickForViews() {

    }

    override fun onClick(p0: View?) {
        when(p0?.id){

        }
    }
}