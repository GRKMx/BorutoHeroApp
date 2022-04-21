package com.gorkemersizer.borutoheroapp.domain.repository

import androidx.paging.PagingData
import com.gorkemersizer.borutoheroapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHeroes(query: String): Flow<PagingData<Hero>>
}