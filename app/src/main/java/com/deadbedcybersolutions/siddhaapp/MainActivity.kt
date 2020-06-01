package com.deadbedcybersolutions.siddhaapp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Topics =arrayOf<String>("அந்திமாலையில்","அலைகள்","வேகமாக ","Zinc","Bronce","Iron","Copper","SomeThing","Zinc","Bronce","Iron","Copper","SomeThing","Zinc","Bronce","Iron","Copper","SomeThing","Zinc","Bronce")

        val adapter = ArrayAdapter(this, android.R.layout.simple_selectable_list_item,android.R.id.text1, Topics)
        listview.adapter = adapter



        listview.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (position == 0)
            {
               val i=Intent(this,Iron::class.java)
                startActivity(i)
            }
            if (position == 1)
            {
                val i=Intent(this,Copper::class.java)
                startActivity(i)
            }
            if (position == 2)
            {
                val i=Intent(this,Something::class.java)
                startActivity(i)
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item?.itemId)
        {
            R.id.aboutus -> {
                val i= Intent(this,Aboutus::class.java)
                startActivity(i)
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
