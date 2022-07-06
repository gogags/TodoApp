package com.example.todoapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.LayoutTodosBinding

class TodosAdapter : RecyclerView.Adapter<TodosViewHolder>() {
    val todoslist = mutableListOf<Todos>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodosViewHolder {
        return TodosViewHolder(
            LayoutTodosBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: TodosViewHolder, position: Int) {
        val todosItem = todoslist[position]
        holder.item.tvTodos.text = todosItem.todostext

    }

    override fun getItemCount(): Int {
        return todoslist.size
    }

}

class TodosViewHolder(val item: LayoutTodosBinding) : RecyclerView.ViewHolder(item.root)

data class Todos(val todostext: String)