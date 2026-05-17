package com.valimade.detectiveinvestigation.journal.domain.model

import java.util.UUID

data class Note(
    val id: UUID,
    val type: NoteType,
    val titleType: String?,
    val title: String,
    val description: String?,
    val photoPreviewUrl: String?,
    val isShow: Boolean,
)