package com.valimade.detectiveinvestigation.investigation.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class DossierNetwork(
    val id: String,
    val title: String,
    val photo: String? = null,
    val age: String? = null,
    val post: String? = null,
    val description: String,
    val alibi: String? = null,
    val specialSigns: String? = null,
    val additionalPhotos: List<String> = emptyList(),
    val isShow: Boolean = false,
    val audio: String? = null,

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