package com.valimade.detectiveinvestigation.journal.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class JournalNetwork(
    val id: String,
    val defendants: List<String>,
    val common: String
)