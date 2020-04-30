package com.khibar.mobdev.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khibar.mobdev.R
import com.khibar.mobdev.storage.SharedPrefManager
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
            val intenlog = Intent(this, LoginActivity::class.java)
            startActivity(intenlog)
        }
    }

}
