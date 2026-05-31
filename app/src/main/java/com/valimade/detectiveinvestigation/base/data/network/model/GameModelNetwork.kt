package com.valimade.detectiveinvestigation.base.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class GameModelNetwork(
    val id: String,

    val prehistory: List<StoryBlockNetwork>,
    val prehistoryAudio: String? = null,

    val maxPoints: Int,
    val actions: List<String>,
    val events: List<String>,
    val dossiers: List<String>,
    val pointsSpent: List<PointsSpentNetwork>,

    val journal: String,

    val checkQuestions: List<String>,
    val answers: List<String>,
    val results: List<String>,
    val solution: List<StoryBlockNetwork>,
    val solutionAudio: String? = null,
)