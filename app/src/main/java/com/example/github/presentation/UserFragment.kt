package com.example.github.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.github.databinding.FragmentUserBinding

class UserFragment : Fragment() {
    private lateinit var viewModel: UserViewModel
    private var _binding: FragmentUserBinding? = null
    private val binding: FragmentUserBinding
        get() = _binding ?: throw RuntimeException("FragmentUser is null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(userName: String): Fragment {
            return UserFragment().apply {
                arguments = Bundle().apply {
                    viewModel.getUser(userName)
                }
            }
        }
    }
}