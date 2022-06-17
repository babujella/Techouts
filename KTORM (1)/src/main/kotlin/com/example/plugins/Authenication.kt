package com.example.plugins

import com.example.Dataase.database
import com.example.Entities.EmployeeEntity
import com.example.Entities.OldEmployees
import com.example.tableoject
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.liuwj.ktorm.dsl.*

fun Application.Authenication() {
    val db = database
    routing {
       get("/Insert") {
            db.insert(EmployeeEntity) {
                set(it.id, 1839)
                set(it.employeename, "Babu_Jella")
                set(it.employeerole, "Devoloper")
            }
            db.insert(EmployeeEntity) {
                set(it.employeename, "Yashwanth")
                set(it.employeerole, "Testing")
            }
            call.respondText("Successfll")
        }
        get("retriving") {
            db.insert(OldEmployees) {
                set(it.id, 1841)
                set(it.name, "Pavan")
                set(it.surname, "Ananthoju")
                set(it.salary, 35000)
            }
            call.respondText("Old Employees Details are Inserted")
        }
        ////
        for (data in database.from(EmployeeEntity).select()) {
            println("${data[EmployeeEntity.employeerole]} : ${data[EmployeeEntity.employeename]}")
        }
        println("----------------------------------------------------")
        for (DataOfOldEmployee in database.from(OldEmployees).select()) {
            println("${DataOfOldEmployee[OldEmployees.name]} : ${DataOfOldEmployee[OldEmployees.surname]} = ${DataOfOldEmployee[OldEmployees.salary]}")
        }
        println("----------------------------------------------------")
        for (dataEmployee in database.from(OldEmployees).select().where {
            OldEmployees.salary eq 20000
        }) {
            println("${dataEmployee[OldEmployees.name]}.${dataEmployee[OldEmployees.surname]}")
        }
        println("----------------------------------------------------")
        println(" The query obtains all employees’ names, sorting them by their salaries descending:")
        for (DataOfOldEmployee in database.from(OldEmployees).select().orderBy(OldEmployees.salary.desc())) {
            println("${DataOfOldEmployee[OldEmployees.name]} = ${DataOfOldEmployee[OldEmployees.salary]}")
        }
        println("----------------------------------------------------")
        for (DataOfOldEmployees in database.from(OldEmployees).crossJoin(EmployeeEntity).select()) {
            println("${DataOfOldEmployees[OldEmployees.name]}, ${DataOfOldEmployees[EmployeeEntity.employeerole]}")
        }
        println("----------------------------------------------------")
      /* val employ = database.from(OldEmployees).select().orderBy(OldEmployees.salary.asc()).
        map { row -> OldEmployees.createEntity(row)}
            employ.forEach{
                println("$it")*/
            }
        println("----------------------------------------------------")
        for (datA in database.from(tableoject).select(tableoject.name,tableoject.surname).
                where { tableoject.id eq 1839 }.map { tableoject.createEntity(it) }){
            println("${datA}")
        }
        println("----------------------------------------------------")
        for (datA in database.from(tableoject).select(tableoject.id,tableoject.name,tableoject.surname,tableoject.salary).orderBy(tableoject.salary.desc())){
            println("$datA")
        }
        println("----------------------------------------------------")
        for (dataa in database.from(tableoject).select().orderBy(tableoject.salary.desc()).map {
            row -> tableoject.createEntity(row)
        }){
            println("$dataa")
        }

    }


