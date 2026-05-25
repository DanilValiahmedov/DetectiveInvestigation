package com.valimade.detectiveinvestigation.example

import com.valimade.detectiveinvestigation.base.domain.model.GameModel
import com.valimade.detectiveinvestigation.base.domain.model.PointsSpent
import com.valimade.detectiveinvestigation.base.domain.model.StoryBlock
import com.valimade.detectiveinvestigation.base.domain.model.Style
import com.valimade.detectiveinvestigation.base.domain.model.VariantGame
import com.valimade.detectiveinvestigation.investigation.domain.model.Action
import com.valimade.detectiveinvestigation.investigation.domain.model.ActionType
import com.valimade.detectiveinvestigation.investigation.domain.model.Dossier
import java.util.UUID

//Пример настолки: "Игра окончена"
object GameOver {
    val prehistory = listOf(
        StoryBlock(
            id = UUID.fromString("ccad6d2a-edc7-4276-a273-3f182132c876"),
            text = "Студия \"Iron Quill Interactive\" завершает разработку третьей части исторической серии военных игр. " +
                    "Проект представляет собой масштабную реконструкцию Русско-японской войны с акцентом на ключевые сражения и стратегические операции.",
            title = null,
            photo = null,
        ),
        StoryBlock(
            id = UUID.fromString("b36c7f20-e7c6-44a3-811b-8ecc1c378b9e"),
            text = "Серия известна своими реалистичными кампаниями и вниманием к историческим деталям. " +
                    "Первая игра, \"Ember of Moscow (1812)\", получила признание за реконструкцию Отечественной войны. " +
                    "Вторая часть, \"Black Sea Directive (1853)\", закрепила успех студии благодаря тактической глубине и сложным сценариям осад.",
            title = null,
            photo = null,
        ),
        StoryBlock(
            id = UUID.fromString("15ef605b-3f27-46e5-b27d-b453cd0bcec8"),
            text = "Новая игра, \"Ashes of Port Arthur (1904)\", должна стать самой амбициозной работой студии. " +
                    "Игроку предстояло пережить ключевые события войны, включая морские сражения, осаду крепостей и стратегические кампании на Дальнем Востоке.",
            title = null,
            photo = null,
        ),
        StoryBlock(
            id = UUID.fromString("b50b8a13-4f10-4aa2-83b2-a4c3bee6759e"),
            text = "Однако финальный релиз оказался провальным. Игроки столкнулись с критическими багами, а отдельные уровни стали предметом массовой критики из-за своей сложности и технической нестабильности. " +
                    "Особенно много обсуждений вызвал уровень под кодовым названием «Битва за Порт-Артур». Сообщество  называлл его непроходимым и сломанным.",
            title = null,
            photo = null,
        ),

        StoryBlock(
            id = UUID.fromString("a4d72ffc-b7c1-4dcc-90ce-3589a32172dc"),
            text = "На следующий день после релиза игры один из ключевых разработчиков был найден мёртвым у здания офиса. Он выпал из окна своего кабинета на верхнем этаже. " +
                    "Официальная версия — самоубийство. По предварительным данным, смерть наступила в результате падения с высоты. " +
                    "Однако обстоятельства происшествия вызывают вопросы у следствия. Не все детали совпадают с типичной картиной суицида.",
            title = null,
            photo = null,
        ),
        StoryBlock(
            id = UUID.fromString("a37d1e66-1bc8-4914-b299-c83a707f84b7"),
            text = "Вам поручено разобраться: это было самоубийство или убийство. Удачи!",
            title = null,
            photo = null,
        )
    )

    val pointsSpent = listOf(
        PointsSpent(0, Style.CLEAN),
        PointsSpent(0, Style.DETAILED),
        PointsSpent(0, Style.FULL),
    )

    val dossier = listOf(
        Dossier(
            id = UUID.fromString("15e4c933-7cd1-4ed0-b504-edc33079a023"),
            title = "Александр Воронцов",
            age = "34 года",
            post = "Старший разработчик",
            description = "Один из ведущих разработчиков студии. Руководил созданием нескольких ключевых игровых уровней, включая уровень «Битва за Порт-Артур», подвергшийся резкой критике после релиза. Коллеги характеризуют как спокойного и замкнутого человека, склонного брать ответственность на себя. В последние месяцы часто задерживался в офисе допоздна.",
            specialSigns = "На момент смерти при себе находился служебный телефон и пропуск сотрудника.",
            isShow = true,
        ),
        Dossier(
            id = UUID.fromString("bda9c768-a691-4c78-b5d0-f14c82af2b94"),
            title = "Игорь Мельников",
            age = "41 год",
            post = "Руководитель отдела разработки",
            description = "Руководил производством проекта последние два года. По словам сотрудников, требовал соблюдения жестких сроков разработки и регулярно вводил переработки перед релизом. Отрицает наличие конфликтов с погибшим. Утверждает, что Александр тяжело переживал провал игры.",
            alibi = "Во время гибели находился на совещании с инвесторами.",
        ),
        Dossier(
            id = UUID.fromString("f8d467fa-295c-4c43-9027-b9d9b4b44521"),
            title = "Кирилл Жданов",
            age = "25 лет",
            post = "Младший разработчик",
            description = "Работал в команде погибшего менее года. Участвовал в разработке уровня «Битва за Порт-Артур». Утверждает, что считал погибшего своим учителем. По информации сотрудников, опасался попасть под сокращение после провала проекта.",
            alibi = "После окончания смены покинул офис и играл дома в онлайн-игру с друзьями.",
        ),
        Dossier(
            id = UUID.fromString("ec13e49f-c0cf-4249-956f-a851aaabf47d"),
            title = "Олег Савельев",
            age = "39 лет",
            post = "Старший менеджер службы безопасности",
            description = "Отвечает за внутреннюю безопасность компании и контроль утечек информации. Ранее проходил военную службу. По словам коллег, отличается жестким стилем общения и подозрительным отношением к сотрудникам.",
            alibi = "В момент происшествия находился в комнате охраны.",
            specialSigns = "Заметная хромота и частичный шум в ушах после контузии.",
        ),
        Dossier(
            id = UUID.fromString("66c657e9-35b3-4b01-993a-cbdfab7f402e"),
            title = "Максим «Атаман» Серов",
            age = "28 лет",
            post = "Руководитель клуба исторической реконструкции",
            description = "Активный пользователь игровых форумов. После релиза игры неоднократно публиковал агрессивные сообщения в адрес разработчиков. Подозревается в создании граффити возле офиса компании с надписью «Смерть разрабам», и прочими хулиганскими действиями.",
            alibi = "Проводил вечер в своем клубе.",
            specialSigns = "Носит черную толстовку с символикой игры.",
        ),
        Dossier(
            id = UUID.fromString("fa389eb0-243e-421d-98f0-f1012b3f35fc"),
            title = "Дмитрий Лавров",
            age = "37 лет",
            post = "Журналист региональной газеты",
            description = "Специализируется на расследованиях в сфере IT и цифровой безопасности. По данным переписки погибшего, поддерживал с ним контакт незадолго до смерти. Отказывается раскрывать детали общения и утверждает, что действовал в интересах источника.",
            alibi = "В ночь гибели находился в редакции.",
            specialSigns = "Постоянно носит блокнот и набор маркеров.",
        ),
        Dossier(
            id = UUID.fromString("f04c1195-7686-46cd-ac00-bc288665b47b"),
            title = "Анна Белова",
            age = "29 лет",
            post = "Специалист отдела тестирования",
            description = "Сотрудница отдела тестирования проекта. По словам коллег, незадолго до релиза находилась на больничном из-за переутомления. В расследовании появляется спустя несколько дней после гибели разработчика. Характеризуется как спокойный и неконфликтный человек.",
            alibi = "Утверждает, что в день гибели находилась дома из-за плохого самочувствия.",
        )
    )

    val gameModel = GameModel(
        id = UUID.fromString("967d6dcb-d3f3-4cf1-8fe6-fa7c60b754af"),
        variantGame = VariantGame.PRO,

        prehistory = prehistory,
        prehistoryAudio = null,
        isOpen = false,

        percentageCompletion = 0,
        maxPoints = 0,
        actions = emptyList(),
        events = emptyList(),
        dossier = dossier.map { it.id },
        pointsSpent = pointsSpent,

        journal = UUID.randomUUID(),

        checkQuestions = emptyList(),
        answers = emptyList(),
        results = emptyList(),
        solution = emptyList(),
        solutionAudio = null,
    )

}
