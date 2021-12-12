package com.example.sharedbrefronc

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var shared = getSharedPreferences(getString(R.string.shard_name) , Context.MODE_PRIVATE)

        //set values from SharedPreference
        var editor = shared.edit()
        editor.putString(getString(R.string.string_key), "test")
        editor.putInt("id",23)
        editor.commit()


    //retreve the values from SharedPreferences
    var get_key = shared.getInt("id",0)


        var text_view = findViewById<TextView>(R.id.text_view)
        text_view.text =get_key.toString()



















    }

}