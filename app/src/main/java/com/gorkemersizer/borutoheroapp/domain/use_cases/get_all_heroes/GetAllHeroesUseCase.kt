package com.gorkemersizer.borutoheroapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.gorkemersizer.borutoheroapp.data.repository.Repository
import com.gorkemersizer.borutoheroapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }
}