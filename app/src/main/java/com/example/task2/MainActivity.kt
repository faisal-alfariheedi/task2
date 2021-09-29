package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var cl: ConstraintLayout
    private lateinit var input: EditText
    private lateinit var add: Button
    private lateinit var mess: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cl = findViewById(R.id.mscreen)
        mess = ArrayList()

        rvMain.adapter = RVAdapter(this, mess)
        rvMain.layoutManager = LinearLayoutManager(this)

        input = findViewById(R.id.input)
        add = findViewById(R.id.add)

        add.setOnClickListener { add() }

    }
    private fun add(){
        if(input.text.toString().isNotEmpty()){
            mess.add(input.text.toString())
            input.text.clear()
            input.clearFocus()
        }
        rvMain.adapter?.notifyDataSetChanged()
        rvMain.scrollToPosition(mess.size-1)
    }


}