package com.sosinvitalii.database.congratulations

object NewYearCongratulations {
    fun fetch(language: Language): List<String> {
        return when (language) {
            Language.EN -> english
            Language.IT -> italian
            Language.RU -> russian
            Language.ES -> spanish
            Language.DE -> german
        }
    }

    private val english = listOf(
        "May the New Year bring joy and happiness, fulfill all your dreams and desires! Happy New Year!",
        "May the upcoming year be filled with new opportunities, bright moments, and pleasant surprises! Happy New Year!",
        "I wish the New Year to be the beginning of something new and amazing in your life. May it bring prosperity and success! Happy New Year!",
        "Happiness, health, love, and the fulfillment of your deepest wishes in the New Year! May every day be filled with joy and good fortune! Happy New Year!",
        "May the New Year bring new possibilities, bold decisions, and glorious victories! Happy New Year!",
        "I wish each day of the New Year to be filled with happiness, smiles, and prosperity. May it bring many joyful moments! Happy New Year!",
        "May the New Year bring warmth and light to your home, fulfill your dearest dreams, and fill each day with smiles! Happy New Year!",
        "I wish the coming year to bring magic, happiness, and success in all your endeavors. May it be bright and memorable! Happy New Year!",
        "May the New Year mark the beginning of a new life full of opportunities and achievements. Wishing you a happy and successful year!",
        "Happy New Year! I wish you and your loved ones abundant joy, health, prosperity, and success in all your endeavors!"
    )

    private val italian = listOf(
        "Che il Nuovo Anno porti gioia e felicità, realizzi tutti i tuoi sogni e desideri! Buon anno nuovo!",
        "Che l'anno imminente sia pieno di nuove opportunità, momenti luminosi e piacevoli sorprese! Felice anno nuovo!",
        "Ti auguro che il Nuovo Anno sia l'inizio di qualcosa di nuovo e straordinario nella tua vita. Possa portare prosperità e successo! Buon anno nuovo!",
        "Felicità, salute, amore e il raggiungimento dei tuoi desideri più profondi nel Nuovo Anno! Possa ogni giorno essere pieno di gioia e fortuna! Buon anno nuovo!",
        "Che il Nuovo Anno porti nuove possibilità, decisioni coraggiose e vittorie gloriose! Felice anno nuovo!",
        "Auguro che ogni giorno del Nuovo Anno sia pieno di felicità, sorrisi e prosperità. Possa portare molti momenti gioiosi! Buon anno nuovo!",
        "Che il Nuovo Anno porti calore e luce nella tua casa, realizzi i tuoi sogni più cari e riempia ogni giorno di sorrisi! Buon anno nuovo!",
        "Ti auguro che l'anno in arrivo porti magia, felicità e successo in tutte le tue imprese. Possa essere luminoso e memorabile! Buon anno nuovo!",
        "Che il Nuovo Anno segni l'inizio di una nuova vita piena di opportunità e successi. Ti auguro un anno felice e di successo!",
        "Felice anno nuovo! Ti auguro a te e ai tuoi cari abbondante gioia, salute, prosperità e successo in tutte le tue imprese!"
    )

    private val russian = listOf(
        "Пусть Новый год принесет с собой радость и счастье, исполнит все мечты и желания! Счастливого Нового года!",
        "Пусть наступающий год будет наполнен новыми возможностями, яркими моментами и приятными сюрпризами! С Новым годом!",
        "Желаю, чтобы Новый год был началом чего-то нового и удивительного в твоей жизни. Пусть он принесет процветание и успехи! С Новым годом!",
        "Счастья, здоровья, любви и исполнения самых заветных желаний в Новом году! Пусть каждый день будет наполнен радостью и удачей! С Новым годом!",
        "Пусть Новый год принесет с собой новые возможности, смелые решения и яркие победы! Счастливого Нового года!",
        "Желаю, чтобы каждый день Нового года был полон счастья, улыбок и благополучия. Пусть он принесет много радостных моментов! С Новым годом!",
        "Пускай Новый год принесет тепло и свет в твой дом, сбудутся самые сокровенные мечты и каждый день будет наполнен улыбками! С Новым годом!",
        "Желаю, чтобы наступающий год принес волшебство, счастье и успех во всех начинаниях. Пусть он будет ярким и запоминающимся! С Новым годом!",
        "Пусть Новый год станет началом новой жизни, полной возможностей и достижений. Счастливого и успешного года!",
        "С наступающим Новым годом! Желаю вам и вашим близким много радости, здоровья, благополучия и удачи во всех начинаниях!"
    )

    private val spanish = listOf(
        "¡Que el Año Nuevo traiga alegría y felicidad, cumpla todos tus sueños y deseos! ¡Feliz Año Nuevo!",
        "¡Que el próximo año esté lleno de nuevas oportunidades, momentos brillantes y agradables sorpresas! ¡Feliz Año Nuevo!",
        "Deseo que el Año Nuevo sea el comienzo de algo nuevo y sorprendente en tu vida. ¡Que traiga prosperidad y éxito! ¡Feliz Año Nuevo!",
        "Felicidad, salud, amor y la realización de tus deseos más profundos en el Año Nuevo. ¡Que cada día esté lleno de alegría y buena fortuna! ¡Feliz Año Nuevo!",
        "¡Que el Año Nuevo traiga nuevas posibilidades, decisiones audaces y gloriosas victorias! ¡Feliz Año Nuevo!",
        "Deseo que cada día del Año Nuevo esté lleno de felicidad, sonrisas y prosperidad. ¡Que traiga muchos momentos de alegría! ¡Feliz Año Nuevo!",
        "¡Que el Año Nuevo traiga calidez y luz a tu hogar, cumpla tus sueños más queridos y llene cada día de sonrisas! ¡Feliz Año Nuevo!",
        "Deseo que el próximo año traiga magia, felicidad y éxito en todas tus empresas. ¡Que sea brillante y memorable! ¡Feliz Año Nuevo!",
        "¡Que el Año Nuevo marque el comienzo de una nueva vida llena de oportunidades y logros. ¡Te deseo un año feliz y exitoso!",
        "¡Feliz Año Nuevo! ¡Deseo a ti y a tus seres queridos abundante alegría, salud, prosperidad y éxito en todas tus empresas!"
    )

    private val german = listOf(
        "Möge das neue Jahr Freude und Glück bringen, all deine Träume und Wünsche erfüllen! Frohes Neues Jahr!",
        "Möge das kommende Jahr neue Möglichkeiten, strahlende Momente und angenehme Überraschungen bringen! Frohes Neues Jahr!",
        "Ich wünsche dir, dass das neue Jahr der Beginn von etwas Neuem und Erstaunlichem in deinem Leben ist. Möge es Wohlstand und Erfolg bringen! Frohes Neues Jahr!",
        "Glück, Gesundheit, Liebe und die Erfüllung deiner tiefsten Wünsche im neuen Jahr! Möge jeder Tag voller Freude und Glück sein! Frohes Neues Jahr!",
        "Möge das neue Jahr neue Möglichkeiten, mutige Entscheidungen und glorreiche Siege bringen! Frohes Neues Jahr!",
        "Ich wünsche jedem Tag im neuen Jahr Glück, Lächeln und Wohlstand. Möge es viele freudige Momente bringen! Frohes Neues Jahr!",
        "Möge das neue Jahr Wärme und Licht in dein Zuhause bringen, deine liebsten Träume erfüllen und jeden Tag mit Lächeln füllen! Frohes Neues Jahr!",
        "Ich wünsche dir, dass das kommende Jahr Magie, Glück und Erfolg in all deinen Unternehmungen bringt. Möge es hell und unvergesslich sein! Frohes Neues Jahr!",
        "Möge das neue Jahr den Beginn eines neuen Lebens voller Möglichkeiten und Erfolge markieren. Ich wünsche dir ein glückliches und erfolgreiches Jahr!",
        "Frohes Neues Jahr! Ich wünsche dir und deinen Lieben reichlich Freude, Gesundheit, Wohlstand und Erfolg in all deinen Unternehmungen!"
    )
}