package com.ritikcoder.project20ofandroiddev_listview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.ritikcoder.project20ofandroiddev_listview1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("Complete App Dev projects")
        taskList.add("Complete market works")
        taskList.add("Work on Resume")
        taskList.add("Improve English Speaking")
        taskList.add("Improve internet Presence")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)

        binding.listView.adapter = adapterForMyListView

        binding.listView.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}