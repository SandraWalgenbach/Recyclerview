package com.example.recyclerview.Data

import com.example.recyclerview.R

class Datasource {

    fun loadData(): List<Ware>{
        return listOf(
            Ware(R.string.name1),
            Ware(R.string.name2),
            Ware(R.string.name3),
            Ware(R.string.name4),
            Ware(R.string.name5),
            Ware(R.string.name6)
        )
    }
}