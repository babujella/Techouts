package com.example.com.org.database

import org.ktorm.database.Database

val database = Database.connect(
    url = "jdbc:mysql://localhost:3306/graphqlserver",
    driver = "com.mysql.jdbc.Driver",
    user = "root",
    password = "techouts"
)