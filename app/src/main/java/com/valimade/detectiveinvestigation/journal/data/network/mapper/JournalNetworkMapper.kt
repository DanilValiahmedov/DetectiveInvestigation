package com.valimade.detectiveinvestigation.journal.data.network.mapper

import com.valimade.detectiveinvestigation.journal.data.network.model.ChapterNetwork
import com.valimade.detectiveinvestigation.journal.data.network.model.JournalNetwork
import com.valimade.detectiveinvestigation.journal.data.network.model.NoteNetwork
import com.valimade.detectiveinvestigation.journal.domain.model.Chapter
import com.valimade.detectiveinvestigation.journal.domain.model.ChapterType
import com.valimade.detectiveinvestigation.journal.domain.model.Journal
import com.valimade.detectiveinvestigation.journal.domain.model.Note
import com.valimade.detectiveinvestigation.journal.domain.model.NoteType
import java.util.UUID

object JournalNetworkMapper {
    fun journalFromNetworkToDomain(journal: JournalNetwork): Journal {
        return Journal(
            id = UUID.fromString(journal.id),
            defendants = journal.defendants.map { UUID.fromString(it) },
            common = UUID.fromString(journal.common),
        )
    }

    fun chapterFromNetworkToDomain(chapter: ChapterNetwork): Chapter {
        return Chapter(
            id = UUID.fromString(chapter.id),
            type = ChapterType.valueOf(chapter.type),
            title = chapter.title,
            description = chapter.description,
            photoPreviewUrl = chapter.photoPreviewUrl,
            notes = chapter.notes.map { UUID.fromString(it) },
            isShow = chapter.isShow,
        )
    }

    fun noteFromNetworkToDomain(note: NoteNetwork): Note {
        return Note(
            id = UUID.fromString(note.id),
            type = note.type?.let { NoteType.valueOf(note.type) },
            titleType = note.titleType,
            title = note.title,
            description = note.description,
            photoPreviewUrl = note.photoPreviewUrl,
            isShow = note.isShow,
        )
    }
}