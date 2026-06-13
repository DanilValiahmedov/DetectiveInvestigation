package com.valimade.detectiveinvestigation.base.domain.model

import java.util.UUID

data class PointsSpent(
    val id: UUID,
    val maxPoints: Int,
    val style: Style,
)