package com.valimade.detectiveinvestigation.result.domain.model

import com.valimade.detectiveinvestigation.base.domain.model.BaseModel
import java.util.UUID

data class Answer(
    val id: UUID,
    val information: List<BaseModel>,
    val answers: List<UUID>,
    val isSelected: Boolean,
    val isRight: Boolean,
)