package com.example.Querys

import com.example.Dataase.database
import com.example.Querys.ManagerEntity.name
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.liuwj.ktorm.dsl.*
import me.liuwj.ktorm.entity.Entity
import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.int
import me.liuwj.ktorm.schema.varchar

interface Manager:Entity<Manager>{
    val id:Int
    val name:String
    val salary:Int
}

object ManagerEntity:Table<Manager>("manager"){
    val id=int("id").primaryKey().bindTo { it.id }
    val name=varchar("name").bindTo { it.name }
    val salary=int("salary").bindTo { it.salary }
}
fun Application.ManagerMain(){
    routing {
        get("/Inserting") {
            database.batchInsert(ManagerEntity) {
                item {
                    set(it.id, 1)
                    set(it.name, "Babu_Jella")
                    set(it.salary, 20000)
                }
                item {
                    set(it.id, 2)
                    set(it.name, "Pavan")
                    set(it.salary, 21000)
                }
                item {
                    set(it.id, 3)
                    set(it.name, "Lakshman")
                    set(it.salary, 22000)
                }
            }
            call.respondText("Successs")
        }
        val ManagerObj = database.from(ManagerEntity).select().where { ManagerEntity.id eq 1 }.
        map { row -> ManagerEntity.createEntity(row) }
        ManagerObj.forEach { println("$it") }
        println("_____________________________________")
        val managerOBJ= database.from(ManagerEntity).
                select().
                where { ManagerEntity.salary eq 21000 }
        managerOBJ.forEach { println("$it") }

        //WHERE Function.......
        println("_____________________________________")

        for (data in database.from(ManagerEntity).select(ManagerEntity.salary,ManagerEntity.name)
            .where { ManagerEntity.id eq 1 }.map { row -> ManagerEntity.createEntity(row) }){
            println("$data")
        }

        //WhereWITHConditions..........
        println("______________WHERE WITH CONDITIONS_______________________")

        for (datamember in database.from(ManagerEntity).select(ManagerEntity.salary)
            .whereWithConditions {
            if (ManagerEntity.id!= null){
                println("Hii $name Welcome to TECHOUTS!!!!")
            }
            }.map { row -> ManagerEntity.createEntity(row) }){
                println("$datamember")
        }

        //ORDERBY function.............
        println("_______________ORDERBY FUNCTION______________________")

        for (order in database.from(ManagerEntity).select(ManagerEntity.name)
            .orderBy(ManagerEntity.salary.desc()).map { row -> ManagerEntity.createEntity(row) }){
            println("$order")
        }
    }
}



