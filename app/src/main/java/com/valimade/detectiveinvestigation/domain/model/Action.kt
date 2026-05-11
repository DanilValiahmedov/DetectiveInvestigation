package com.valimade.detectiveinvestigation.domain.model

import java.util.UUID

data class Action(
    val id: UUID,
    val type: ActionType,
    val title: String,
    val description: String?,
    val photoPreviewUrl: String?,
    val isNew: Boolean,
    val isShow: Boolean,
    val isUsed: Boolean,
    val cost: Int,
    val relatedEvent: List<UUID>,
    val relatedActions: List<UUID>,
    val closingEvent: List<UUID>,
    val closingActions: List<UUID>,
)