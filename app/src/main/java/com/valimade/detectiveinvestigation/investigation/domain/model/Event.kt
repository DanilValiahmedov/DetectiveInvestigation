package com.valimade.detectiveinvestigation.investigation.domain.model

import java.util.UUID

data class Event(
    val id: UUID,
    val type: EventType,
    val title: String,
    val caption: String?,
    val description: String?,
    val photoPreviewUrl: String?,
    val photo: String?,
    val audio: String?,
    val video: String?,
    val isNew: Boolean,
    val isShow: Boolean,
    val relatedEvent: List<UUID>,
    val relatedActions: List<UUID>,
    val relatedDossier: List<UUID>,
    val relatedChapter: List<UUID>,
    val relatedNote: List<UUID>,
    val closingEvent: List<UUID>,
    val closingActions: List<UUID>,
)