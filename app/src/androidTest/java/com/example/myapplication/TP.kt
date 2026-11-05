package com.example.myapplication

enum class StatutReservation {
    EN_ATTENTE,
    CONFIRME,
    EN_COURS,
    TERMINEE,

}
class  ReservationInvalideException(message: String) : Exception(message){

}
class Reservation (val idReservation: Int, var dureeHeures: Int, var statut: StatutReservation) {
    init {
        if (idReservation <= 0) {
            throw ReservationInvalideException("ID invalide")
        }
        if (dureeHeures <= 0 || dureeHeures > 72) {
            throw ReservationInvalideException("Duree invalide")
        }
    }

}

class GestioneReservation {
    var listRes = ArrayList<Reservation>()
    fun ajouterReservation(reservation: Reservation) {
        listRes.add(reservation)
    }

    fun chercherParId(id: Int): Reservation? {
        var res : Reservation? = null
        for (reservation in listRes) {
            if (reservation.idReservation == id) {
                res =  reservation
            }
        }
        return res
    }

}
