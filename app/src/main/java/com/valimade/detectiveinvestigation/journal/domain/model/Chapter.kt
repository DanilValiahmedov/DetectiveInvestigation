package com.valimade.detectiveinvestigation.journal.domain.model

import java.util.UUID

data class Chapter(
    val id: UUID,
    val type: ChapterType,
    val title: String,
    val description: String? = null,
    val photoPreviewUrl: String? = null,
    val notes: List<UUID> = emptyList(),
    val isShow: Boolean = false,
)