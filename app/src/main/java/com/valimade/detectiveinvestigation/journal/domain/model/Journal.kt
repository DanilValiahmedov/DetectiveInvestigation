package com.valimade.detectiveinvestigation.journal.domain.model

import java.util.UUID

data class Journal(
    val id: UUID,
    val defendants: List<UUID>,
    val common: UUID
)