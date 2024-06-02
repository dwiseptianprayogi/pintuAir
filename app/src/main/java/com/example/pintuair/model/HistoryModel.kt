package com.example.pintuair.model

class HistoryModel (StatPintu:String, TinggiAir:String, KelTanah:String, ArusAir:String, CreatedAt:String) {

    var StatPintu = ""
    var TinggiAir = ""
    var KelTanah = ""
    var ArusAir = ""
    var CreatedAt = ""

    init {
        this.StatPintu = StatPintu
        this.TinggiAir = TinggiAir
        this.KelTanah = KelTanah
        this.ArusAir = ArusAir
        this.CreatedAt = CreatedAt
    }
}