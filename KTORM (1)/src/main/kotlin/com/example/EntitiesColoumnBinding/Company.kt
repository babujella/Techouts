package com.example.EntitiesColoumnBinding

import me.liuwj.ktorm.entity.Entity

interface Company :Entity<Company>{
    val id:Int
    val name:String
    val status:String
}

//Object creation.....
