package com.example.Entities

import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

sealed class Employees(tableName:String):Table<Nothing>(tableName){
    val id=int("id").primaryKey()
    val name=varchar("name")
    val surname=varchar("surname")
    val salary=int("salary")
}
object OldEmployees:Employees("oldemployees")

object  NewEmployees:Employees("newemployee")