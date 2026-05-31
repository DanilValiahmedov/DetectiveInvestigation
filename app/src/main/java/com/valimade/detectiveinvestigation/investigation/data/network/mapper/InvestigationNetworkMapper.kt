package com.valimade.detectiveinvestigation.investigation.data.network.mapper

import com.valimade.detectiveinvestigation.investigation.data.network.model.ActionNetwork
import com.valimade.detectiveinvestigation.investigation.data.network.model.DossierNetwork
import com.valimade.detectiveinvestigation.investigation.data.network.model.EventNetwork
import com.valimade.detectiveinvestigation.investigation.domain.model.Action
import com.valimade.detectiveinvestigation.investigation.domain.model.ActionType
import com.valimade.detectiveinvestigation.investigation.domain.model.Dossier
import com.valimade.detectiveinvestigation.investigation.domain.model.Event
import com.valimade.detectiveinvestigation.investigation.domain.model.EventType
import java.util.UUID

object InvestigationNetworkMapper {
    fun actionFromNetworkToDomain(action: ActionNetwork): Action {
        return Action(
            id = UUID.fromString(action.id),
            type = ActionType.valueOf(action.type),
            title = action.title,
            description = action.description,
            photoPreviewUrl = action.photoPreviewUrl,
            isShow = action.isShow,
            cost = action.cost,
            relatedEvent = action.relatedEvent.map { UUID.fromString(it) },
            relatedActions = action.relatedActions.map { UUID.fromString(it) },
            relatedDossier = action.relatedDossier.map { UUID.fromString(it) },
            relatedChapter = action.relatedChapter.map { UUID.fromString(it) },
            relatedNote = action.relatedNote.map { UUID.fromString(it) },
            closingEvent = action.closingEvent.map { UUID.fromString(it) },
            closingActions = action.closingActions.map { UUID.fromString(it) },
            closingDossier = action.closingDossier.map { UUID.fromString(it) },
            closingChapter = action.closingChapter.map { UUID.fromString(it) },
        )
    }

    fun eventFromNetworkToDomain(event: EventNetwork): Event {
        return Event(
            id = UUID.fromString(event.id),
            type = EventType.valueOf(event.type),
            title = event.title,
            description = event.description,
            photoPreviewUrl = event.photoPreviewUrl,
            photo = event.photo,
            audio = event.audio,
            video = event.video,
            isShow = event.isShow,
            relatedEvent = event.relatedEvent.map { UUID.fromString(it) },
            relatedActions = event.relatedActions.map { UUID.fromString(it) },
            relatedDossier = event.relatedDossier.map { UUID.fromString(it) },
            relatedChapter = event.relatedChapter.map { UUID.fromString(it) },
            relatedNote = event.relatedNote.map { UUID.fromString(it) },
            closingEvent = event.closingEvent.map { UUID.fromString(it) },
            closingActions = event.closingActions.map { UUID.fromString(it) },
            closingDossier = event.closingDossier.map { UUID.fromString(it) },
            closingChapter = event.closingChapter.map { UUID.fromString(it) },
        )
    }

    fun dossierFromNetworkToDomain(dossier: DossierNetwork): Dossier {
        return Dossier(
            id = UUID.fromString(dossier.id),
            title = dossier.title,
            photo = dossier.photo,
            age = dossier.age,
            post = dossier.post,
            description = dossier.description,
            alibi = dossier.alibi,
            specialSigns = dossier.specialSigns,
            additionalPhotos = dossier.additionalPhotos,
            isShow = dossier.isShow,
            audio = dossier.audio,
            relatedEvent = dossier.relatedEvent.map { UUID.fromString(it) },
            relatedActions = dossier.relatedActions.map { UUID.fromString(it) },
            relatedDossier = dossier.relatedDossier.map { UUID.fromString(it) },
            relatedChapter = dossier.relatedChapter.map { UUID.fromString(it) },
            relatedNote = dossier.relatedNote.map { UUID.fromString(it) },
            closingEvent = dossier.closingEvent.map { UUID.fromString(it) },
            closingActions = dossier.closingActions.map { UUID.fromString(it) },
            closingDossier = dossier.closingDossier.map { UUID.fromString(it) },
            closingChapter = dossier.closingChapter.map { UUID.fromString(it) },
        )
    }
}
