package com.example.market.mypage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.market.R
import com.example.market.databinding.FragmentMypageBinding

class MyPageFragment: Fragment(R.layout.fragment_mypage) {

    private var binding: FragmentMypageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentMypageBinding = FragmentMypageBinding.bind(view)
        binding = fragmentMypageBinding
    }
}