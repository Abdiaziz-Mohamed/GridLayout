package com.gridlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_users.setOnClickListener{

            val intent = Intent(this,UsersActivity::class.java);
            startActivity(intent)
        }

        card_add_users.setOnClickListener{

            val intent = Intent(this,ActivityaddUsersActivity::class.java);
            startActivity(intent)
        }

        card_add_report.setOnClickListener{

            val intent = Intent(this,ReportActivity::class.java);
            startActivity(intent)
        }

        card_settings.setOnClickListener{

            val intent = Intent(this,SettingsActivity::class.java);
            startActivity(intent)
        }
    }
}