package com.valimade.detectiveinvestigation.result.data.network.model

import com.valimade.detectiveinvestigation.base.data.network.model.StoryBlockNetwork

data class ResultNetwork(
    val id: String,
    val selectedAnswers: List<String>,
    val information: List<StoryBlockNetwork>,
    val resultAudio: String? = null,
    val status: String,
)