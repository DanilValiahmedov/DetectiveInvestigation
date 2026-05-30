package com.valimade.detectiveinvestigation.base.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class StoryBlockNetwork(
    val id: String,
    val text: String,
    val title: String? = null,
    val photo: String? = null,
)