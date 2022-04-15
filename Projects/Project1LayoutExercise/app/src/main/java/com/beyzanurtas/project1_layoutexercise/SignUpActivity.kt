package com.beyzanurtas.project1_layoutexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.beyzanurtas.project1_layoutexercise.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_sign_up)

        init()
    }
    private fun init(){
        binding.signUpButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent=Intent(this@SignUpActivity,StartActivity::class.java)
        startActivity(intent)
    }
}