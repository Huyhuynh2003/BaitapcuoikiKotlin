package com.example.dacs_3.Data

import com.example.dacs_3.Model.Option
import com.example.dacs_3.R

class Menu {
    fun loadmenu(): List<Option>{
        return listOf<Option>(
            Option(R.string.tt, R.drawable.bgmu),
            Option(R.string.ha,R.drawable.bg_2),
            Option(R.string.vd, R.drawable.bg1),
        )
    }
}
