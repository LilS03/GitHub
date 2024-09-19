package com.example.github.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.github.R
import com.example.github.databinding.FragmentUserListBinding

class UserListFragment : Fragment() {
    private lateinit var viewModel: UserViewModel
    private var _binding: FragmentUserListBinding? = null
    private val binding: FragmentUserListBinding
        get() = _binding ?: throw RuntimeException("FragmentUserList is null")

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_user_list, container, false)
        val toUserDetail: Button = view.findViewById(R.id.button)
        toUserDetail.setOnClickListener {
            val userDetail = UserFragment()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, userDetail)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        _binding = FragmentUserListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.rvUserList
    }
    private fun lunchDetailFragment(userName: String): UserFragment {
        return UserFragment().apply {
            arguments = Bundle().apply {
                viewModel.getUser(userName)
            }
        }
    }

    companion object {
        fun newInstance(): Fragment {
            return UserListFragment().apply {
                arguments = Bundle().apply {
                    viewModel.getUsers()
                }
            }
        }
    }
}