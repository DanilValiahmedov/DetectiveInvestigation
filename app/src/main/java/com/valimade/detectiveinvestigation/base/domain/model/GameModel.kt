package com.valimade.detectiveinvestigation.base.domain.model

import java.util.UUID

data class GameModel(
    val id: UUID,
    val variantGame: VariantGame,

    val prehistory: List<StoryBlock>,
    val prehistoryAudio: String?,
    val isOpen: Boolean,

    val percentageCompletion: Int,
    val maxPoints: Int,
    val actions: List<UUID>,
    val events: List<UUID>,
    val pointsSpent: List<PointsSpent>,

    val checkQuestions: List<UUID>,
    val answers: List<UUID>,
    val results: List<UUID>,
    val solution: List<StoryBlock>,
    val solutionAudio: String?,
)