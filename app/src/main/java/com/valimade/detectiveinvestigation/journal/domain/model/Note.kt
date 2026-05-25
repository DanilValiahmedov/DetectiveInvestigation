package com.valimade.detectiveinvestigation.journal.domain.model

import java.util.UUID

data class Note(
    val id: UUID,
    val type: NoteType,
    val titleType: String? = null,
    val title: String,
    val description: String? = null,
    val photoPreviewUrl: String? = null,
    val isShow: Boolean = false,
)