package com.example.to_do
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TodoAdaptor (
    var todos:List<Todo>
)  : RecyclerView.Adapter<TodoAdaptor.TodoViewHolder>(){

    inner  class TodoViewHolder(itemView:View):RecyclerView.Viewholder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
       holder.itemView.apply{
           val tvTittle =findViewById<TextView>(R.id.tvTittle)
           tvTittle.text=todos[position].tittle
       }
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
          val  view=LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}