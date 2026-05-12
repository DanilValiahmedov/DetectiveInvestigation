package com.valimade.detectiveinvestigation.base.domain.model

import com.valimade.detectiveinvestigation.base.domain.model.Style

data class PointsSpent(
    val maxPoints: Int,
    val style: Style,
)