package com.valimade.detectiveinvestigation.result.domain.model

import com.valimade.detectiveinvestigation.base.domain.model.BaseModel
import java.util.UUID

data class Question(
    val id: UUID,
    val information: List<BaseModel>,
    val answers: List<UUID>
)