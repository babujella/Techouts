package com.example.EntitiesColoumnBinding

import me.liuwj.ktorm.entity.Entity

interface Employee:Entity<Employee>{
    val id:Int
    val name:String
    val role:String
    val company:Company
}