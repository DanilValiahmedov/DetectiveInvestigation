package com.valimade.detectiveinvestigation.journal.domain.model

import java.util.UUID

data class Chapter(
    val id: UUID,
    val type: ChapterType,
    val title: String,
    val description: String?,
    val photoPreviewUrl: String?,
    val notes: List<UUID>,
    val isShow: Boolean,
)