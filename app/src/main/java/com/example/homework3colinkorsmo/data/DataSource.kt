package com.example.homework3colinkorsmo.data

import com.example.homework3colinkorsmo.R
import com.example.homework3colinkorsmo.model.Reminders

object DataSource {
    val reminders = listOf(
        Reminders(R.string.day1, R.drawable.medication, R.string.reminder1),
        Reminders(R.string.day2, R.drawable.exercise, R.string.reminder2),
        Reminders(R.string.day3, R.drawable.study, R.string.reminder3),
        Reminders(R.string.day4, R.drawable.meditate, R.string.reminder4),
        Reminders(R.string.day5, R.drawable.work, R.string.reminder5),
        Reminders(R.string.day6, R.drawable.sleep, R.string.reminder6),
        Reminders(R.string.day7, R.drawable.friends, R.string.reminder7),
        Reminders(R.string.day8, R.drawable.party, R.string.reminder1),
    )
}