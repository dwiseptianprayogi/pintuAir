package com.example.pintuair.model

class HistoryModel (StatPintu:String, StatPompa:String, TinggiAir:String, KelTanah:String, ArusAir:String, Keterangan:String, CreatedAt:String) {

    var StatPintu = ""
    var StatPompa = ""
    var TinggiAir = ""
    var KelTanah = ""
    var ArusAir = ""
    var Keterangan = ""
    var CreatedAt = ""

    init {
        this.StatPintu = StatPintu
        this.StatPompa = StatPompa
        this.TinggiAir = TinggiAir
        this.KelTanah = KelTanah
        this.ArusAir = ArusAir
        this.Keterangan = Keterangan
        this.CreatedAt = CreatedAt
    }
}