package com.example.pokemonfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView=findViewById(R.id.botones)
        val navHostFragment= supportFragmentManager.findFragmentById(R.id.menusito) as NavHostFragment
        navController = navHostFragment.navController
        navView.setupWithNavController(navController)
    }
}