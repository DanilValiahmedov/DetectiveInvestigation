package com.valimade.detectiveinvestigation.result.data.network.model

import com.valimade.detectiveinvestigation.base.data.network.model.StoryBlockNetwork
import kotlinx.serialization.Serializable

@Serializable
data class QuestionNetwork(
    val id: String,
    val information: List<StoryBlockNetwork>,
    val answers: List<String>,
)