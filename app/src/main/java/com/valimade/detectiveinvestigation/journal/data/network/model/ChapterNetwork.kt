package com.valimade.detectiveinvestigation.journal.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class ChapterNetwork(
    val id: String,
    val type: String,
    val title: String,
    val description: String? = null,
    val photoPreviewUrl: String? = null,
    val notes: List<String> = emptyList(),
    val isShow: Boolean = false,
)