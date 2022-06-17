package com.example.DataManipulation

import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

object InsertEntity:Table<Nothing>("insertdata"){
    val id=int("id").primaryKey()
    val name=varchar("name")
    val password=varchar("password")
}