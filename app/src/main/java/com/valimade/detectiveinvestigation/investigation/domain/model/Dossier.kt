package com.valimade.detectiveinvestigation.investigation.domain.model

import java.util.UUID

data class Dossier(
    val id: UUID,
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

    val relatedEvent: List<UUID> = emptyList(),
    val relatedActions: List<UUID> = emptyList(),
    val relatedDossier: List<UUID> = emptyList(),
    val relatedChapter: List<UUID> = emptyList(),
    val relatedNote: List<UUID> = emptyList(),

    val closingEvent: List<UUID> = emptyList(),
    val closingActions: List<UUID> = emptyList(),
    val closingDossier: List<UUID> = emptyList(),
    val closingChapter: List<UUID> = emptyList(),
)