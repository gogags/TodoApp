package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todoapp.adapters.Todos
import com.example.todoapp.adapters.TodosAdapter
import com.example.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val todosAdapter = TodosAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rcView.adapter = todosAdapter
        todosAdapter.todoslist.addAll(
            listOf(Todos("homework"),
            Todos("play")))

        todosAdapter.notifyDataSetChanged()

        binding.button.setOnClickListener {

            //   აქ ჯობდა რომ adapterში გაგეკეთებინა addItem მეთოდი და შიგ ყოფილიყო notifyDataSetChanged()
            //      ს ნაცვლად notifyItemInserted

            todosAdapter.todoslist.addAll(listOf(Todos("${binding.edTodo.text}")))
            todosAdapter.notifyDataSetChanged()
        }



    }



}