package com.valimade.detectiveinvestigation.result.data.network.model

import com.valimade.detectiveinvestigation.base.data.network.model.StoryBlockNetwork
import kotlinx.serialization.Serializable

@Serializable
data class AnswerNetwork(
    val id: String,
    val information: List<StoryBlockNetwork>,
    val isSelected: Boolean = false,
    val isRight: Boolean = false,
)