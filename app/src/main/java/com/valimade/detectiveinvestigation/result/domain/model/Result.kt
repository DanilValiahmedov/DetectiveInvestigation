package com.valimade.detectiveinvestigation.result.domain.model

import com.valimade.detectiveinvestigation.base.domain.model.StoryBlock
import java.util.UUID

data class Result(
    val id: UUID,
    val selectedAnswers: List<UUID>,
    val information: List<StoryBlock>,
    val resultAudio: String?,
    val status: DisclosureStatus,
)