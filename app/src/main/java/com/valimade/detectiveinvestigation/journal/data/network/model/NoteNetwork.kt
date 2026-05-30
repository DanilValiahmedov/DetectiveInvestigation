package com.valimade.detectiveinvestigation.journal.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NoteNetwork(
    val id: String,
    val type: String? = null,
    val titleType: String? = null,
    val title: String,
    val description: String? = null,
    val photoPreviewUrl: String? = null,
    val isShow: Boolean = false,
)