package com.gorkemersizer.borutoheroapp.domain.use_cases.search_heroes

import androidx.paging.PagingData
import com.gorkemersizer.borutoheroapp.data.repository.Repository
import com.gorkemersizer.borutoheroapp.domain.model.Hero
import java.util.concurrent.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): kotlinx.coroutines.flow.Flow<PagingData<Hero>> {
        return repository.searchHeroes(query = query)
    }
}