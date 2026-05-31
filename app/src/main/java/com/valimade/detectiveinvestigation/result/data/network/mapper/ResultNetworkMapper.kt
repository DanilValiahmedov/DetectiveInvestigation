package com.valimade.detectiveinvestigation.result.data.network.mapper

import com.valimade.detectiveinvestigation.base.data.network.model.StoryBlockNetwork
import com.valimade.detectiveinvestigation.base.domain.model.StoryBlock
import com.valimade.detectiveinvestigation.result.data.network.model.AnswerNetwork
import com.valimade.detectiveinvestigation.result.data.network.model.QuestionNetwork
import com.valimade.detectiveinvestigation.result.data.network.model.ResultNetwork
import com.valimade.detectiveinvestigation.result.domain.model.Answer
import com.valimade.detectiveinvestigation.result.domain.model.DisclosureStatus
import com.valimade.detectiveinvestigation.result.domain.model.Question
import com.valimade.detectiveinvestigation.result.domain.model.Result
import java.util.UUID

object ResultNetworkMapper {
    fun questionFromNetworkToDomain(question: QuestionNetwork): Question {
        return Question(
            id = UUID.fromString(question.id),
            information = question.information.map { storyBlockFromNetworkToDomain(it) },
            answers = question.answers.map { UUID.fromString(it) },
        )
    }

    fun answerFromNetworkToDomain(answer: AnswerNetwork): Answer {
        return Answer(
            id = UUID.fromString(answer.id),
            information = answer.information.map { storyBlockFromNetworkToDomain(it) },
            isRight = answer.isRight,
        )
    }

    fun resultFromNetworkToDomain(result: ResultNetwork): Result {
        return Result(
            id = UUID.fromString(result.id),
            selectedAnswers = result.selectedAnswers.map { UUID.fromString(it) },
            information = result.information.map { storyBlockFromNetworkToDomain(it) },
            resultAudio = result.resultAudio,
            status = DisclosureStatus.valueOf(result.status),
        )
    }

    private fun storyBlockFromNetworkToDomain(storyBlock: StoryBlockNetwork): StoryBlock {
        return StoryBlock(
            id = UUID.fromString(storyBlock.id),
            text = storyBlock.text,
            title = storyBlock.title,
            photo = storyBlock.photo,
        )
    }
}