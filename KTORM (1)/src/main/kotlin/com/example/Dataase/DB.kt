package com.example.Dataase

import me.liuwj.ktorm.database.Database

val database = Database.connect(
    url = "jdbc:mysql://localhost:3306/ktorm",
    driver = "com.mysql.cj.jdbc.Driver",
    user = "root",
    password = "techouts"
)

