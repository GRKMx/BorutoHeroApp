package com.gorkemersizer.borutoheroapp.domain.use_cases.get_selected_hero

import com.gorkemersizer.borutoheroapp.data.repository.Repository
import com.gorkemersizer.borutoheroapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}