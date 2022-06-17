package com.example.EntitiesColoumnBinding

import com.example.Dataase.database
import com.example.Entities.OldEmployees
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.liuwj.ktorm.dsl.*

fun Application.Browsing() {
    routing {
        get("/browsingcompany") {
            database.batchInsert(companies) {
                item {
                    set(it.id, 1)
                    set(it.name, "Techouts")
                    set(it.status, "Rich")
                }
                item {
                    set(it.id, 2)
                    set(it.name, "TCS")
                    set(it.status, "Rich")
                }
                item {
                    set(it.id, 3)
                    set(it.name, "WIPRO")
                    set(it.status, "Rich")
                }
            }
            call.respondText("Successs")
        }
        get("browsingemployee") {
            database.batchInsert(employees) {
                item {
                    set(it.id, 16)
                    set(it.name, "Babu")
                    set(it.role, "Devoloper")
                    set(it.companyid,1)
                }
                item {
                    set(it.id, 62)
                    set(it.name, "Pavan")
                    set(it.role, "Devoloper")
                    set(it.companyid,2)
                }
                item {
                    set(it.id, 63)
                    set(it.name, "Mani")
                    set(it.role, "Devoloper")
                    set(it.companyid,3)
                }
            }
            call.respondText("Successs")
        }
        get("ColoumnBinding") {
            database.insert(coloumnbindings) {
                set(it.key, "1839")
                set(it.answer, "Hello")
            }
            call.respondText("Successs")
        }


       for (data in database.from(employees)
           .select()
           .map {row -> employees.createEntity(row)}){
            println("${data}")
        }

        //Coloumn binding type ---->Reference Binding:

        val emm= database.from(employees)
            .joinReferencesAndSelect()
            .orderBy(employees.id.asc())
            .map { row -> employees.createEntity(row) }
        emm.forEach { println("$it") }

        println("helloo")

        val cb= database.from(coloumnbindings).select().
        map { row -> coloumnbindings.createEntity(row) }
        cb.forEach { println("$it") }

        println("-------------->>>>____>>>>>____________>>>>")

    }
}