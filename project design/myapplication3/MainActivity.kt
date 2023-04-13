package com.example.myapplication3

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.databinding.ActivityLoginscreenBinding
import com.example.myapplication3.databinding.ActivityMainBinding
import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var toolbar: androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var sharedPreferences = getSharedPreferences("tasmin", MODE_PRIVATE)




        toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

        val drawerLayout = findViewById<View>(R.id.drawer) as DuoDrawerLayout
        val drawerToggle = DuoDrawerToggle(
            this, drawerLayout, toolbar,
            nl.psdcompany.psd.duonavigationdrawer.R.string.navigation_drawer_open,
            nl.psdcompany.psd.duonavigationdrawer.R.string.navigation_drawer_close
        )

        drawerLayout.setDrawerListener(drawerToggle)
        drawerToggle.syncState()

        binding.l6.setOnClickListener {

            sharedPreferences.edit().clear().commit()
            startActivity(Intent(applicationContext,loginscreen::class.java))
        }

    }

    override fun onBackPressed() {
        var a = AlertDialog.Builder(this)
        a.setTitle("Are you sure you want to exit ?")
        a.setPositiveButton("YES",{dialog : DialogInterface, i:Int ->
            finishAffinity()
        })
        a.setNegativeButton("NO",{dialog :DialogInterface,i :Int ->
            dialog.cancel()
        })
        a.show()
    }
}

