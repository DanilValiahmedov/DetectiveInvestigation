package com.valimade.detectiveinvestigation.result.domain.model

import com.valimade.detectiveinvestigation.base.domain.model.StoryBlock
import java.util.UUID

data class Question(
    val id: UUID,
    val information: List<StoryBlock>,
    val answers: List<UUID>,
)