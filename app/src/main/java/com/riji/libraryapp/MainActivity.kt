package com.riji.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginbutton(view: View) {
        var getUserName=findViewById<EditText>(R.id.ulname);
        var getPassword=findViewById<EditText>(R.id.pass);
        var u=getUserName.text.toString();
        var p=getPassword.text.toString();
        if(u.equals("Admin") and p.equals("1234")){
            intent= Intent(this,LoginActivity::class.java);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"invalid user",Toast.LENGTH_LONG).show();
        }
    }

    fun register(view: View) {
        intent= Intent(this,RegisterNowActivity::class.java);
        startActivity(intent);
    }
}