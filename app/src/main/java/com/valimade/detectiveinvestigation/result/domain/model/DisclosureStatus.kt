package com.valimade.detectiveinvestigation.result.domain.model

enum class DisclosureStatus(val title: String) {
    SOLVED("Дело раскрыто"),
    ALMOST_SOLVED("Дело почти раскрыто"),
    INCOMPLETE("Расследование неполное"),
    FAILED("Дело провалено"),
}