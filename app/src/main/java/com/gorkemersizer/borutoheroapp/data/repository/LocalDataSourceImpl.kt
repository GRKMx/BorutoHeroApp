package com.gorkemersizer.borutoheroapp.data.repository

import com.gorkemersizer.borutoheroapp.data.local.BorutoDatabase
import com.gorkemersizer.borutoheroapp.domain.model.Hero
import com.gorkemersizer.borutoheroapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase): LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}