package com.gorkemersizer.borutoheroapp.domain.use_cases.save_onboarding

import com.gorkemersizer.borutoheroapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean){
        repository.saveOnBoardingState(completed = completed)
    }
}