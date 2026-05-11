package com.valimade.detectiveinvestigation.base.domain.model

import java.util.UUID

data class BaseModel(
    val id: UUID,
    val text: String,
    val photo: String?,
)