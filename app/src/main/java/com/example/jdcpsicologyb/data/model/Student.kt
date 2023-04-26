package com.example.jdcpsicologyb.data.model

class Student(
    val name: String,
    val age: Int,
    val gender: String,
    val career: String,
    var email: String,
    var phoneNumber: String
) {
    var id: Int = 0 // Identificador del estudiante
    var appointments: MutableList<Appointment> = mutableListOf() // Lista de citas del estudiante

    // Función para agregar una cita al estudiante
    fun addCourse(appointment: Appointment) {
        appointments.add(appointment)
    }

    // Función para eliminar una cita del estudiante
    fun removeCourse(appointment: Appointment) {
        appointments.remove(appointment)
    }

    // Función para actualizar el correo electrónico del estudiante
    fun updateEmail(newEmail: String) {
        email = newEmail
    }
    fun updatePhoneNumber(newPhoneNumber: String) {
        phoneNumber = newPhoneNumber
    }
}
