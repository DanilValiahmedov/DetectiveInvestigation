package com.valimade.detectiveinvestigation.investigation.domain.model

import java.util.UUID

data class Event(
    val id: UUID,
    val type: EventType,
    val title: String,
    val caption: String? = null,
    val description: String? = null,
    val photoPreviewUrl: String? = null,
    val photo: String? = null,
    val audio: String? = null,
    val video: String? = null,
    val isNew: Boolean = true,
    val isShow: Boolean = false,

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