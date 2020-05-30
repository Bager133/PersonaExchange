package com.example.personaexchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jsoup.Jsoup
import org.w3c.dom.Document


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun currency_exchange(){
        val url = "https://finance.ua/ua/currency"
        val document = Jsoup.connect(url).get()
        document.select(".b-market-table_currency-order")

    }
}
