package com.example.profileactivityapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity_app)

        // Make CRED Garage clickable
        val credGarageLayout = findViewById<LinearLayout>(R.id.cred_garage_layout)
        credGarageLayout.setOnClickListener {
            Toast.makeText(this, "CRED Garage clicked", Toast.LENGTH_SHORT).show()
        }

        // Make Credit Score clickable
        val creditScoreLayout = findViewById<LinearLayout>(R.id.credit_score_layout)
        creditScoreLayout.setOnClickListener {
            Toast.makeText(this, "Credit Score clicked", Toast.LENGTH_SHORT).show()
        }

        // Make Lifetime Cashback clickable
        val lifetimeCashbackLayout = findViewById<LinearLayout>(R.id.lifetime_cashback_layout)
        lifetimeCashbackLayout.setOnClickListener {
            Toast.makeText(this, "Lifetime Cashback clicked", Toast.LENGTH_SHORT).show()
        }

        // Make Bank Balance clickable
        val bankBalanceLayout = findViewById<LinearLayout>(R.id.bank_balance_layout)
        bankBalanceLayout.setOnClickListener {
            Toast.makeText(this, "Bank Balance clicked", Toast.LENGTH_SHORT).show()
        }

        // Make Cashback Balance clickable
        val cashbackBalanceLayout = findViewById<LinearLayout>(R.id.cashback_balance_layout)
        cashbackBalanceLayout.setOnClickListener {
            Toast.makeText(this, "Cashback Balance clicked", Toast.LENGTH_SHORT).show()
        }

        // Make Coins clickable
        val coinsLayout = findViewById<LinearLayout>(R.id.coins_layout)
        coinsLayout.setOnClickListener {
            Toast.makeText(this, "Coins clicked", Toast.LENGTH_SHORT).show()
        }

        // Make Refer and Earn clickable
        val referAndEarnLayout = findViewById<LinearLayout>(R.id.refer_and_earn_layout)
        referAndEarnLayout.setOnClickListener {
            Toast.makeText(this, "Refer and Earn clicked", Toast.LENGTH_SHORT).show()
        }

        // Make All Transactions clickable
        val allTransactionsLayout = findViewById<LinearLayout>(R.id.all_transactions_layout)
        allTransactionsLayout.setOnClickListener {
            Toast.makeText(this, "All Transactions clicked", Toast.LENGTH_SHORT).show()
        }
    }
}