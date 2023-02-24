package com.example.tilek_shambetaliev_hw3_5

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.tilek_shambetaliev_hw3_5.databinding.ActivityMainBinding
import com.example.tilek_shambetaliev_hw3_5.databinding.FragmentFirstBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bindingClass.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.conteiner, FirstFragment()).commit()


    }
}
