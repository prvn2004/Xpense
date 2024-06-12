package com.example.xpense

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExpensesListActivity : AppCompatActivity() {

    private lateinit var expensesRecyclerView: RecyclerView
    private lateinit var expensesAdapter: ExpensesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expenses_list)

        expensesRecyclerView = findViewById(R.id.expensesRecyclerView)
        expensesRecyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data - replace with actual data from your database
        val expenses = listOf(
            Expense("2024-06-01", 50.0, "Groceries"),
            Expense("2024-06-02", 20.0, "Transport")
        )

        expensesAdapter = ExpensesAdapter(expenses)
        expensesRecyclerView.adapter = expensesAdapter
    }
}
