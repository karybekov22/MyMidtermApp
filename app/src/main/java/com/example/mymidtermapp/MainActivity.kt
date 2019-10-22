package com.example.mymidtermapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymidtermapp.R
import com.example.mymidtermapp.adapters.EmailAdapter
import com.example.mymidtermapp.models.Email

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fakeEmails = generateFakeEmails()
        setUpEmailRecyclerView(fakeEmails)
    }

    btnStartAnotherActivity.setOnClickListener {
        val intent = Intent(this, AnotherActivity::class.java)
        // start your next activity
        startActivity(intent)
    }

    private fun setUpEmailRecyclerView(emails: List<Email>) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val emailRecyclerView = findViewById<RecyclerView>(R.id.email_recycler_view)
        val recyclerAdapter = EmailAdapter(emails, this)
        emailRecyclerView.layoutManager = layoutManager
        emailRecyclerView.adapter = recyclerAdapter
    }

    private fun generateFakeEmails(): List<Email> {
        val names = listOf(
            "Ronaldo",// 1
            "Aguero",// 2
            "Bale",// 3
            "Griezmann",// 4
            "Higuain",// 5
            "Ronaldinho",// 6
            "Neymar",// 7
            "Salah",// 8
            "Messi",// 9
            "Lewandowski"// 10
            )
        val descriptions = listOf(
                "He plays for the Italian club Juventus and the Portuguese national team.",// 1
                "He plays for the Italian club Juventus and the Portuguese national team.",// 2
                "He plays for the Italian club Juventus and the Portuguese national team.",// 3
                "He plays for the Italian club Juventus and the Portuguese national team.",// 4
                "He plays for the Italian club Juventus and the Portuguese national team.",// 5
                "He plays for the Italian club Juventus and the Portuguese national team.",// 6
                "He plays for the Italian club Juventus and the Portuguese national team.",// 7
                "He plays for the Italian club Juventus and the Portuguese national team.",// 8
                "He plays for the Italian club Juventus and the Portuguese national team.",// 9
                "He plays for the Italian club Juventus and the Portuguese national team."// 10
        )
        val ages = listOf(
            "AGE: 34",// 1
            "AGE: 31",// 2
            "AGE: 30",// 3
            "AGE: 28",// 4
            "AGE: 31",// 5
            "AGE: 39",// 6
            "AGE: 27",// 7
            "AGE: 27",// 8
            "AGE: 32",// 9
            "AGE: 31"// 10
            )
//        val images = listOf(
//            R.drawable.ronaldo, // 1
//            R.drawable.aguero, // 2
//            R.drawable.bale, // 3
//            R.drawable.griezmann, // 4
//            R.drawable.higuain, // 5
//            R.drawable.ronaldinho, // 6
//            R.drawable.neymar, // 7
//            R.drawable.salah, // 8
//            R.drawable.messi, // 9
//            R.drawable.lewandowski) // 10

        val emailList = mutableListOf<Email>()
        for (i in 0..8) {
            emailList.add(
                Email(names[i], descriptions[i], ages[i] //images[i]
                )
            )
        }
        return emailList
    }
}
