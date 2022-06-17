package com.example.DataManipulation

import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.varchar

object  insertAndGenerateKeyEntity:Table<Nothing>("insertandgeneratekey"){
        val name=varchar("name")
        val password=varchar("password")
}