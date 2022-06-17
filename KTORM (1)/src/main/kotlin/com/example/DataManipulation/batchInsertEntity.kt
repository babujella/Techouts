package com.example.DataManipulation

import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

object batchInsert:Table<Nothing>("batchinsert"){
        val id=int("id").primaryKey()
    val name=varchar("name")
    val password=varchar("password")
}