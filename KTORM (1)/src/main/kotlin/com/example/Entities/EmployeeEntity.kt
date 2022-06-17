package com.example.Entities

import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

object EmployeeEntity :Table<Nothing>("employee"){
    val id=int("id").primaryKey()
    val employeename=varchar("employeename")
    val employeerole=varchar("employeerole")
}