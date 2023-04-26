package com.example.jdcpsicologyb.data.model

class MentalHealthService(
    val name: String,
    val description: String,
    val email: String,
    val phoneNumber: String
) {
    var id: Int = 0 // Identificador del servicio de salud mental
    var appointments: MutableList<Appointment> = mutableListOf() // Lista de citas del servicio de salud mental

    // Función para agregar una cita al servicio de salud mental
    fun addAppointment(appointment: Appointment) {
        appointments.add(appointment)
    }

    // Función para eliminar una cita del servicio de salud mental
    fun removeAppointment(appointment: Appointment) {
        appointments.remove(appointment)
    }

    // Función para obtener la lista de citas del servicio de salud mental
    fun getAppointments(): List<Appointment> {
        return appointments
    }
}
