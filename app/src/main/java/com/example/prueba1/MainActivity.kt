package com.example.prueba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.stripe.android.PaymentConfiguration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun launchPaymentCard(v: View){
        callPayment()
    }
    private fun callPayment(){

        var keyStripePayment = "pk_test_Dt4ZBItXSZT1EzmOd8yCxonL"
        PaymentConfiguration.init(applicationContext, keyStripePayment)

        val intent = Intent(this, CheckoutActivity::class.java)
        startActivity(intent)
    }
}