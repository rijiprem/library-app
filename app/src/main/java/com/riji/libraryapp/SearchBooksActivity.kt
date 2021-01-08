package com.riji.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class SearchBooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_books)
    }

    fun searchbook(view: View) {
        var getBookName=findViewById<EditText>(R.id.bname);
        Toast.makeText(this,getBookName.text.toString(),Toast.LENGTH_LONG).show();
    }
    fun backmenu(view: View) {
        intent= Intent(this,LoginActivity::class.java);
        startActivity(intent);
    }
}