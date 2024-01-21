package com.example.to_do

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  todoList= mutableListOf(
            Todo("Done Leetcode problems",false),
            Todo("Followed android dev",false),
            Todo("chai peeli ",false)

        )
       val adapter=TodoAdaptor(todoList)
       rvTodos.adapter= adapter
        rvTodos.layoutManager=LinearLayoutManager(this)

        btnAddTodo.setOnClickListner{
            val tittle=etTodo.text.toString()
            val todo=Todo(title,false)
            todoList.add(Todo)
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}