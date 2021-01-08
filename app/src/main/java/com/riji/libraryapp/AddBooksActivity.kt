package com.riji.libraryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class AddBooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_books)
    }

    fun submit(view: View) {
        var getName=findViewById<EditText>(R.id.name);
        var getAuthor=findViewById<EditText>(R.id.author);
        var getPublisher=findViewById<EditText>(R.id.publisher);
        var getYear=findViewById<EditText>(R.id.price);
        Toast.makeText(this,getName.text.toString()+"  "+
        getAuthor.text.toString()+"  "+getPublisher.text.toString()+"  "+
        getYear.text.toString(),Toast.LENGTH_LONG).show();
    }
    fun backmenu(view: View) {
        intent= Intent(this,LoginActivity::class.java);
        startActivity(intent);
    }
}