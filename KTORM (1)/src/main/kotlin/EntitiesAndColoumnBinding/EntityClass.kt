package com.example

import me.liuwj.ktorm.database.Database
import me.liuwj.ktorm.dsl.QueryRowSet
import me.liuwj.ktorm.entity.sequenceOf
import me.liuwj.ktorm.schema.BaseTable
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

data class EntityClass(val id: Int, val name:String,val surname: String, val salary: Int)

object tableoject: BaseTable<EntityClass>("oldemployees") {
    val id = int("id").primaryKey()
    val name = varchar("name")
    val surname = varchar("surname")
    val salary = int("salary")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = EntityClass(
        id = row[id] ?: 0,
        name=row[name].toString(),
        surname=row[surname].toString(),
        salary = row[salary] ?: 0
    )
}
//Create an EntitySequence from the specific table.
val Database.EntityClass get() = this.sequenceOf(tableoject)
