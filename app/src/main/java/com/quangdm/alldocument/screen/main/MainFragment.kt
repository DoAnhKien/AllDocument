package com.quangdm.alldocument.screen.main

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import butterknife.ButterKnife
import butterknife.Unbinder
import com.quangdm.alldocument.R
import com.quangdm.alldocument.base.BaseFragment
import com.google.android.gms.ads.initialization.InitializationStatus

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener

import com.google.android.gms.ads.MobileAds


class MainFragment : BaseFragment(), View.OnClickListener {
    lateinit var unbinder: Unbinder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        unbinder = ButterKnife.bind(this, view)
//        showDialogLoading()
        initAds()
        return view
    }

    override fun initUI() {

    }

    override fun initControl() {

    }

    override fun setOnClickForViews() {

    }

    private fun initAds() {
        MobileAds.initialize(requireContext(), {

        })
    }

    override fun changeTheColorOfTheStatusBar() {
        val window: Window = requireActivity()!!.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor =
            ContextCompat.getColor(requireActivity()!!, R.color.color_status_bar)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {

        }
    }
}