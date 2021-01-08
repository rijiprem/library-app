package com.riji.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterNowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_now)
    }

    fun register(view: View) {
        var getName=findViewById<EditText>(R.id.name);
        var getMobileNumber=findViewById<EditText>(R.id.mobile);
        var getEmail=findViewById<EditText>(R.id.email);
        var getUserName=findViewById<EditText>(R.id.uname);
        var getPassword=findViewById<EditText>(R.id.pass);
        var getConfirmPassword=findViewById<EditText>(R.id.cpass);
        Toast.makeText(this,getName.text.toString()+"  "+
        getMobileNumber.text.toString()+"  "+getEmail.text.toString()+"  "+
        getUserName.text.toString()+"  "+getPassword.text.toString()+"  "+
        getConfirmPassword.text.toString(),Toast.LENGTH_LONG).show();
    }


    fun backlogin(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}