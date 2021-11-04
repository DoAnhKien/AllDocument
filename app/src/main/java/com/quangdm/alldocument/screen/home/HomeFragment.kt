package com.quangdm.alldocument.screen.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.quangdm.alldocument.R
import com.quangdm.alldocument.base.BaseFragment

class HomeFragment : BaseFragment(), View.OnClickListener {

    @BindView(R.id.tvTest)
    lateinit var tvTest: TextView

    lateinit var unbinder: Unbinder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        unbinder = ButterKnife.bind(this, view)
//        showDialogLoading()
        return view
    }

    override fun initUI() {

    }

    override fun initControl() {

    }

    override fun setOnClickForViews() {
        tvTest.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.tvTest -> {
                moveToSearchFragment()
            }
        }
    }

    private fun moveToSearchFragment() {
        val action = HomeFragmentDirections.actionHomeFragmentToSearchFragment()
        findNavController().navigate(action)
    }
}