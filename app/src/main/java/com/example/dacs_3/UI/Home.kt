package com.example.dacs_3.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.dacs_3.Adapter.HomeADT
import com.example.dacs_3.Data.Menu
import com.example.dacs_3.R
import com.google.android.material.navigation.NavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myDataset = Menu().loadmenu()
        val recyclerView = findViewById<RecyclerView>(R.id.rv_trangchu)
        recyclerView.adapter = HomeADT(this, myDataset)
        recyclerView.setHasFixedSize(true)


    }
}

