package com.example.xpense

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CategoryDetailsActivity : AppCompatActivity() {

    private lateinit var etDate: EditText
    private lateinit var etReason: EditText
    private lateinit var etAmount: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_details)

        etDate = findViewById(R.id.etDate)
        etReason = findViewById(R.id.etReason)
        etAmount = findViewById(R.id.etAmount)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val homeButton = findViewById<Button>(R.id.homeButton)

        btnSave.setOnClickListener {
            saveExpense()
        }

        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun saveExpense() {
        val date = etDate.text.toString().trim()
        val reason = etReason.text.toString().trim()
        val amount = etAmount.text.toString().trim()

        when {
            date.isEmpty() -> showToast(R.string.error_date_required)
            reason.isEmpty() -> showToast(R.string.error_reason_required)
            amount.isEmpty() -> showToast(R.string.error_amount_required)
            else -> {
                showToast(getString(R.string.expense_saved, date, reason, amount))
                // Here you would typically save this data to a database or send it elsewhere
            }
        }
    }

    private fun showToast(messageId: Int) {
        Toast.makeText(this, messageId, Toast.LENGTH_SHORT).show()
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
