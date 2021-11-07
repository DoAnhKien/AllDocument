package com.quangdm.alldocument.base

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import android.R
import android.view.Window

import androidx.core.content.ContextCompat

import android.view.WindowManager


abstract class BaseFragment : Fragment() {


    val dialog: LoadingDialogFragment by lazy {
        LoadingDialogFragment()
    }

    val fManager: FragmentManager by lazy {
        requireActivity().supportFragmentManager
    }

    fun backToPrevious() {
        this.findNavController().popBackStack()
    }

    fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
    }

    fun showDialogLoading() {
        dialog.show(fManager, "")
    }

    fun hideDialogLoading() {
        try {
            dialog.dismiss()
        } catch (e: Exception) {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initUI()
        initControl()
        setOnClickForViews()
        changeTheColorOfTheStatusBar()
        super.onViewCreated(view, savedInstanceState)
    }

    protected abstract fun initUI()
    protected abstract fun initControl()
    protected abstract fun setOnClickForViews()
    protected abstract fun changeTheColorOfTheStatusBar()
}