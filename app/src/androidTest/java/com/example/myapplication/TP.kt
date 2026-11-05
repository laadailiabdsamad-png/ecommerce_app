package com.example.myapplication

enum class StatutReservation {
    EN_ATTENTE,
    CONFIRME,
    EN_COURS,
    TERMINEE,

}
class  ReservationInvalideException(message: String) : Exception(message){

}
class Reservation (val idReservation: Int, var dureeHeures: Int, var statut: StatutReservation){
    init {
        if (idReservation => 0){

        }
    }
}
