package com.example.Entities

import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

object StudentEntity :Table<Nothing>("student"){
    val studentid=int("studentid").primaryKey()
    val studentname=varchar("studentname")
    val studentclass=varchar("studentclass")
}