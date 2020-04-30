package com.khibar.mobdev.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khibar.mobdev.R
import com.khibar.mobdev.storage.SharedPrefManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnDasbord.setOnClickListener {
            val intendas = Intent(this, MainActivity::class.java)
            startActivity(intendas)
        }

        btnLogout.setOnClickListener {
            SharedPrefManager.getInstance(applicationContext).clear()

            val intent = Intent(applicationContext, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        cvAlamat.setOnClickListener {
            val intenlok = Intent(this, MapsActivity::class.java)
            startActivity(intenlok)
        }
    }
}
