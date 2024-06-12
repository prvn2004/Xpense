package com.example.xpense

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpensesAdapter(private val expenses: List<Expense>) :
    RecyclerView.Adapter<ExpensesAdapter.ExpenseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_expense, parent, false)
        return ExpenseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        val expense = expenses[position]
        holder.dateTextView.text = expense.date
        holder.amountTextView.text = expense.amount.toString()
        holder.reasonTextView.text = expense.reason
    }

    override fun getItemCount(): Int = expenses.size

    class ExpenseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dateTextView: TextView = view.findViewById(R.id.dateTextView)
        val amountTextView: TextView = view.findViewById(R.id.amountTextView)
        val reasonTextView: TextView = view.findViewById(R.id.reasonTextView)
    }
}
