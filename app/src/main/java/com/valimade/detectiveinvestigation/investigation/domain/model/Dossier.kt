package com.valimade.detectiveinvestigation.investigation.domain.model

import java.util.UUID

data class Dossier(
    val id: UUID,
    val title: String,
    val photo: String?,
    val age: String?,
    val post: String?,
    val description: String,
    val alibi: String?,
    val specialSigns: String?,
    val additionalPhotos: List<String>,
    val isShow: Boolean,
    val audio: String?,
    val relatedEvent: List<UUID>,
    val relatedActions: List<UUID>,
    val relatedChapter: List<UUID>,
    val relatedNote: List<UUID>,
    val closingEvent: List<UUID>,
    val closingActions: List<UUID>,
)