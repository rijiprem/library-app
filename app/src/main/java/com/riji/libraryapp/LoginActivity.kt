package com.riji.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun add(view: View) {
        intent= Intent(this,AddBooksActivity::class.java)
        startActivity(intent);
    }
    fun search(view: View) {
        intent= Intent(this,SearchBooksActivity::class.java);
        startActivity(intent);
    }

    fun backlogin(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}