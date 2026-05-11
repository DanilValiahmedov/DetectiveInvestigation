package com.valimade.detectiveinvestigation.result.domain.model

import com.valimade.detectiveinvestigation.base.domain.model.BaseModel
import java.util.UUID

data class Result(
    val id: UUID,
    val selectedAnswers: List<UUID>,
    val information: List<BaseModel>,
    val status: DisclosureStatus,
)