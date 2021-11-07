package com.quangdm.alldocument.screen.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.*
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.quangdm.alldocument.base.BaseFragment


import com.quangdm.alldocument.R


class SplashFragment : BaseFragment(), View.OnClickListener {

    @BindView(R.id.tvTest)
    lateinit var tvTest: TextView

    lateinit var unbinder: Unbinder

    companion object {
        private const val DURATION_TO_OPEN_MAIN_FRAGMENT = 1000L
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        unbinder = ButterKnife.bind(this, view)
//        showDialogLoading()
        moveToMainFragment()
        return view
    }

    override fun initUI() {

    }

    override fun initControl() {

    }

    override fun setOnClickForViews() {
        tvTest.setOnClickListener(this)
    }

    override fun changeTheColorOfTheStatusBar() {
//        val window: Window = requireActivity()!!.window
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//        window.statusBarColor = ContextCompat.getColor(requireActivity()!!, R.color.main)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.tvTest -> {

            }
        }
    }

    private fun moveToMainFragment() {
        Handler(Looper.getMainLooper()).postDelayed({
            val action = SplashFragmentDirections.actionHomeFragmentToMainFragment()
            findNavController().navigate(action)
        }, DURATION_TO_OPEN_MAIN_FRAGMENT)
    }
}