package com.valimade.detectiveinvestigation.base.domain.model

import java.util.UUID

data class StoryBlock(
    val id: UUID,
    val text: String,
    val photo: String?,
)