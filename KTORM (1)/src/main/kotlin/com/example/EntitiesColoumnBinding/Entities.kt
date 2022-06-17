package com.example.EntitiesColoumnBinding

import com.example.Dataase.database
import me.liuwj.ktorm.dsl.from
import me.liuwj.ktorm.dsl.map
import me.liuwj.ktorm.dsl.select
import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

object companies:Table<Company>("company"){
    val id=int("id").primaryKey().bindTo { it.id }
    val name=varchar("name").bindTo { it.name }
    val status=varchar("status").bindTo { it.status }
}

object employees:Table<Employee>("emp"){
    val id=int("id").primaryKey().bindTo { it.id }
    val name=varchar("name").bindTo { it.name }
    val role=varchar("role").bindTo { it.role }
    val companyid=int("companyid").references(companies){it.company}
}
