package com.valimade.detectiveinvestigation.base.data.network.mapper

import com.valimade.detectiveinvestigation.base.data.network.model.GameModelNetwork
import com.valimade.detectiveinvestigation.base.data.network.model.PointsSpentNetwork
import com.valimade.detectiveinvestigation.base.data.network.model.StoryBlockNetwork
import com.valimade.detectiveinvestigation.base.domain.model.GameModel
import com.valimade.detectiveinvestigation.base.domain.model.PointsSpent
import com.valimade.detectiveinvestigation.base.domain.model.StoryBlock
import com.valimade.detectiveinvestigation.base.domain.model.Style
import com.valimade.detectiveinvestigation.base.domain.model.VariantGame
import java.util.UUID

object GameModelNetworkMapper {
    fun gameModelFromNetworkToDomain(gameModel: GameModelNetwork, variantGame: VariantGame): GameModel {
        return GameModel(
            id = UUID.fromString(gameModel.id),
            variantGame = variantGame,
            prehistory = gameModel.prehistory.map { storyBlockFromNetworkToDomain(it) },
            prehistoryAudio = gameModel.prehistoryAudio,
            maxPoints = gameModel.maxPoints,
            actions = gameModel.actions.map { UUID.fromString(it) },
            events = gameModel.events.map { UUID.fromString(it) },
            dossiers = gameModel.dossiers.map { UUID.fromString(it) },
            pointsSpent = gameModel.pointsSpent.map { pointsSpentFromNetworkToDomain(it) },
            journal = UUID.fromString(gameModel.journal),
            checkQuestions = gameModel.checkQuestions.map { UUID.fromString(it) },
            answers = gameModel.answers.map { UUID.fromString(it) },
            results = gameModel.results.map { UUID.fromString(it) },
            solution = gameModel.solution.map { storyBlockFromNetworkToDomain(it) },
            solutionAudio = gameModel.solutionAudio,
        )
    }

    private fun pointsSpentFromNetworkToDomain(pointsSpent: PointsSpentNetwork): PointsSpent {
        return PointsSpent(
            maxPoints = pointsSpent.maxPoints,
            style = Style.valueOf(pointsSpent.style),
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