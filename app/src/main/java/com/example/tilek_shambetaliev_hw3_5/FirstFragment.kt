package com.example.tilek_shambetaliev_hw3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.tilek_shambetaliev_hw3_5.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding
    var num = 0
    private var btn = -1
    val KEY_OF_RESULT = "REZULTAT"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvNumber.text = num.toString()
        binding.btnNumber.setOnClickListener {

            if (num < 10 && binding.btnNumber.text.equals("+1")) {
                num++
                binding.tvNumber.text = num.toString()
            } else if (num > 0 && binding.btnNumber.text.equals("-1")) {
                binding.btnNumber.text = btn.toString()
                num--
                binding.tvNumber.text = num.toString()
            } else if (num == 0 && binding.btnNumber.text.equals("-1")) {
                val bundle = Bundle()
                bundle.putString("REZULTAT", num.toString())
                val secondFragment = SecondFragment()
                secondFragment.arguments = bundle
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.conteiner, secondFragment).addToBackStack(null).commit()
            }
            when(num){
                10 -> binding.btnNumber.text = ("-1")
            }
        }
    }
}

