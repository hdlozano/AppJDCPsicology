package com.example.jdcpsicologyb.data.model

import java.util.*

class Appointment(
    val date: Date,
    val student: Student,
    val service: MentalHealthService,
    val psychologist: Psychologist?
) {
    var id: Int = 0 // Identificador de la cita

    // Función para obtener la fecha de la cita en formato de texto
    fun getDateText(): String {
        val calendar = Calendar.getInstance()
        calendar.time = date
        val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
        val month = calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault())
        val year = calendar.get(Calendar.YEAR)
        return "$dayOfMonth $month $year"
    }
}
