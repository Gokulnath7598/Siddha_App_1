package com.deadbedcybersolutions.siddhaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class Something : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_something)
        val Topics =arrayOf<String>("Gold","Silver","Platinum")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,android.R.id.text1, Topics)
        listview.adapter = adapter

        listview.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (position == 0)
            {
                val i= Intent(this,Gold::class.java)
                startActivity(i)
            }
        })
    }
}
