package com.example.xpense

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the content view to your XML layout
        setupButtons() // Setup button click listeners
    }

    private fun setupButtons() {
        findViewById<Button>(R.id.btnHousing).setOnClickListener {
            openCategoryDetail("Housing")
        }
        findViewById<Button>(R.id.btnUtilities).setOnClickListener {
            openCategoryDetail("Utilities")
        }
        findViewById<Button>(R.id.btnTransportation).setOnClickListener {
            openCategoryDetail("Transportation")
        }
        findViewById<Button>(R.id.btnGroceries).setOnClickListener {
            openCategoryDetail("Groceries")
        }
        findViewById<Button>(R.id.btnInsurance).setOnClickListener {
            openCategoryDetail("Insurance")
        }
        findViewById<Button>(R.id.btnHealthcare).setOnClickListener {
            openCategoryDetail("Healthcare")
        }
        findViewById<Button>(R.id.btnDiscretionaryExpenses).setOnClickListener {
            openCategoryDetail("Discretionary Expenses")
        }
        findViewById<Button>(R.id.btnTravel).setOnClickListener {
            openCategoryDetail("Travel")
        }
        findViewById<Button>(R.id.btnEducation).setOnClickListener {
            openCategoryDetail("Education")
        }
        findViewById<Button>(R.id.btnSubscriptions).setOnClickListener {
            openCategoryDetail("Subscriptions")
        }
        findViewById<Button>(R.id.btnSavingsInvestments).setOnClickListener {
            openCategoryDetail("Savings & Investments")
        }
        findViewById<Button>(R.id.btnMiscellaneous).setOnClickListener {
            openCategoryDetail("Miscellaneous")
        }
    }

    private fun openCategoryDetail(categoryName: String) {
        val intent = Intent(this, CategoryDetailsActivity::class.java).apply {
            putExtra("category", categoryName)
        }
        startActivity(intent)
    }
}

