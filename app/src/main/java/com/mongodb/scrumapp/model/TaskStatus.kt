package com.mongodb.scrumapp.model


enum class TaskStatus(val displayName: String) {
    Open("Open"),
    InProgress("In Progress"),
    Complete("Complete"),
}
