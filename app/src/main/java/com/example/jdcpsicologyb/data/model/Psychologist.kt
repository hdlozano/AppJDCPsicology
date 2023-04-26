package com.example.jdcpsicologyb.data.model

class Psychologist(
    val name: String,
    val email: String,
    val phoneNumber: String,
    val licenseNumber: String,
    val specialties: String
) {
    var id: Int = 0 // Identificador del psicólogo
    var appointments: MutableList<Appointment> = mutableListOf() // Lista de citas del psicólogo

    // Función para agregar una cita al psicólogo
    fun addAppointment(appointment: Appointment) {
        appointments.add(appointment)
    }

    // Función para eliminar una cita del psicólogo
    fun removeAppointment(appointment: Appointment) {
        appointments.remove(appointment)
    }

    // Función para obtener la lista de citas del psicólogo
    fun getAppointments(): List<Appointment> {
        return appointments
    }
}
