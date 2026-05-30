package com.valimade.detectiveinvestigation.investigation.domain.model

import java.util.UUID

data class Action(
    val id: UUID,
    val type: ActionType,
    val title: String,
    val description: String? = null,
    val photoPreviewUrl: String? = null,
    val isNew: Boolean = true,
    val isHide: Boolean = false,
    val isShow: Boolean = false,
    val isUsed: Boolean = false,
    val cost: Int = 1,

    val relatedEvent: List<UUID> = emptyList(),
    val relatedActions: List<UUID> = emptyList(),
    val relatedDossier: List<UUID> = emptyList(),
    val relatedChapter: List<UUID> = emptyList(),
    val relatedNote: List<UUID> = emptyList(),

    val closingEvent: List<UUID> = emptyList(),
    val closingActions: List<UUID> = emptyList(),
    val closingDossier: List<UUID> = emptyList(),
    val closingChapter: List<UUID> = emptyList(),
)