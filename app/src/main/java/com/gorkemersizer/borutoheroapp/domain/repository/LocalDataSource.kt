package com.gorkemersizer.borutoheroapp.domain.repository

import com.gorkemersizer.borutoheroapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}