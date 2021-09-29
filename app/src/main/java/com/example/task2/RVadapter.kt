package com.example.task2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv.view.*

class RVAdapter(private val context: Context, private val messages: ArrayList<String>):
    RecyclerView.Adapter<RVAdapter.MessageViewHolder>() {
    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(context).inflate(R.layout.rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]

        holder.itemView.apply {
            mes.text = message
        }
    }

    override fun getItemCount() = messages.size
}