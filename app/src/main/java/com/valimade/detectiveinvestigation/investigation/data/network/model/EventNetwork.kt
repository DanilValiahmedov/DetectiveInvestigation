package com.valimade.detectiveinvestigation.investigation.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class EventNetwork(
    val id: String,
    val type: String,
    val title: String,
    val caption: String? = null,
    val description: String? = null,
    val photoPreviewUrl: String? = null,
    val photo: String? = null,
    val audio: String? = null,
    val video: String? = null,
    val isShow: Boolean = false,

    val relatedEvent: List<String> = emptyList(),
    val relatedActions: List<String> = emptyList(),
    val relatedDossier: List<String> = emptyList(),
    val relatedChapter: List<String> = emptyList(),
    val relatedNote: List<String> = emptyList(),

    val closingEvent: List<String> = emptyList(),
    val closingActions: List<String> = emptyList(),
    val closingDossier: List<String> = emptyList(),
    val closingChapter: List<String> = emptyList(),
)