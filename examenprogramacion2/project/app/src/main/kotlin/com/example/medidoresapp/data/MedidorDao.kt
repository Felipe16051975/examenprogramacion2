package com.example.medidoresapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MedidorDao {
    @Query("SELECT * FROM medidores ORDER BY fecha DESC")
    fun getAllMedidores(): Flow<List<MedidorEntity>>

    @Insert
    suspend fun insertMedidor(medidor: MedidorEntity)
}