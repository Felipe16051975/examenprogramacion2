package com.example.medidoresapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "medidores")
data class MedidorEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val tipo: TipoMedidor,
    val valor: Double,
    val fecha: Date
)

enum class TipoMedidor {
    AGUA, LUZ, GAS
}