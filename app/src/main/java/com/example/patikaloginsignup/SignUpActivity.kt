package com.example.patikaloginsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.patikaloginsignup.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var signUpBinding: ActivitySignUpBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signUpBinding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up)

        val email = signUpBinding.enterEmailEdittextLayout.editText?.text.toString()
        val username = signUpBinding.createUsernameEdittextLayout.editText?.text.toString()
        val password = signUpBinding.createPasswordEdittextLayout.editText?.text.toString()

        signUpBinding.signUpButton.setOnClickListener {
            Toast.makeText(this, "Başarıyla Kayıt Oldunuz!" + "\n" + "E-mail: " + "$email" + "\n" + "Username: " + "$username" + "\n" + "Password: " + "$password", Toast.LENGTH_LONG).show()
        }
    }
}