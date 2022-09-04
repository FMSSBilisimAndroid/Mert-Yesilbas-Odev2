package com.example.patikaloginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.patikaloginsignup.databinding.ActivityLoginBinding
import kotlin.math.log

class LoginActivity : AppCompatActivity() {

    private lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        val username = loginBinding.usernameEdittextLayout.editText?.text.toString()
        val password = loginBinding.usernameEdittextLayout.editText?.text.toString()

        loginBinding.loginButton.setOnClickListener{
            Toast.makeText(this, "Username: " + "$username" + "\n" + "Password: " + "$password", Toast.LENGTH_SHORT).show()
        }

        loginBinding.createNewAccountTextview.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}