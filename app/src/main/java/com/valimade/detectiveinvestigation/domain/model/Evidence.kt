package com.valimade.detectiveinvestigation.domain.model

import java.util.UUID

data class Evidence(
    val id: UUID,
    val type: EvidenceType,
    val title: String, //Имя или название улики
    val post: String?, //Должность подозреваемого или краткое представление улики
    val description: String,
    val photoPreviewUrl: String,
    val isNew: Boolean,
    val isOpen: Boolean, //Открыта ли улика
    val contentUrl: String,
    val relatedEvidence: List<RelatedEvidence>,
)
