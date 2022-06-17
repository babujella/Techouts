package com.example.EntitiesColoumnBinding

import me.liuwj.ktorm.entity.Entity
import me.liuwj.ktorm.schema.Table
import me.liuwj.ktorm.schema.varchar

interface ColoumnBinding:Entity<ColoumnBinding> {
    val key:String
    val answer1:String
    val answer2:String
}
object coloumnbindings:Table<ColoumnBinding>("t_config"){
    val key=varchar("key").primaryKey().bindTo { it.key }
    val answer=varchar("answer").bindTo { it.answer1 }.bindTo { it.answer2 }
}
