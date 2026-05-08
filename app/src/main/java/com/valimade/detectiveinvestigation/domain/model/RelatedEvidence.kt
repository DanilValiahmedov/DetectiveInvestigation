package com.valimade.detectiveinvestigation.domain.model

import java.util.UUID

data class RelatedEvidence(
    val id: UUID,
    val title: String,
    val photoPreviewUrl: String,
    val type: EvidenceType,
)