package com.valimade.detectiveinvestigation.result.domain.model

import com.valimade.detectiveinvestigation.base.domain.model.StoryBlock
import java.util.UUID

data class Answer(
    val id: UUID,
    val information: List<StoryBlock>,
    val isSelected: Boolean = false,
    val isRight: Boolean = false,
)