package com.sosinvitalii.database.congratulations

object BirthdayCongratulations {
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
        "May your life be full of amazing moments, wonderful people, and bright events! Happy Birthday!",
        "May every day of your life be filled with joy and happiness, and may your eyes sparkle with pleasure! Happy Birthday!",
        "I wish for every new day to be better than the previous one, and every coming year to be happier than the previous one! May all your dreams come true! Happy Birthday!",
        "May every day of your life be a wonderful gift, full of amazing discoveries and joyful moments! Happy Birthday!",
        "I wish you immense happiness, well-being, love, health, prosperity, and everything else you could wish for. Happy Birthday!",
        "Today is your special day, so let it be filled with smiles, happiness, and everything you love. Happy Birthday!",
        "May your day be as bright and special as you are. Happy Birthday!",
        "Today is your day! I wish you a festive mood, warmth, love, and smiles from your loved ones. Happy Birthday!",
        "May your day be filled with love, joy, and smiles! Happy Birthday!",
        "Happy Birthday! I wish you happiness, health, and all the best in the world. You deserve it!"
    )

    private val italian = listOf(
        "Che la tua vita sia piena di momenti sorprendenti, persone meravigliose ed eventi luminosi! Buon compleanno!",
        "Che ogni giorno della tua vita sia colmo di gioia e felicità, e che i tuoi occhi brillino di piacere! Buon compleanno!",
        "Ti auguro che ogni nuovo giorno sia migliore del precedente e che ogni anno successivo sia più felice del precedente! Che tutti i tuoi sogni si avverino! Buon compleanno!",
        "Che ogni giorno della tua vita sia un meraviglioso regalo, pieno di incredibili scoperte e momenti gioiosi! Buon compleanno!",
        "Ti auguro una felicità immensa, prosperità, amore, salute, ricchezza e tutto ciò che si possa desiderare. Buon compleanno!",
        "Oggi è il tuo giorno speciale, quindi che sia pieno di sorrisi, felicità e tutto ciò che ami. Buon compleanno!",
        "Che il tuo giorno sia luminoso e speciale come te. Auguri di buon compleanno!",
        "Oggi è il tuo giorno! Ti auguro un umore festoso, calore, amore e sorrisi dalle persone care. Buon compleanno!",
        "Che il tuo giorno sia pieno di amore, gioia e sorrisi! Buon compleanno!",
        "Buon compleanno! Ti auguro felicità, salute e tutto il meglio del mondo. Te lo meriti!"
    )

    private val russian = listOf(
        "Пусть твоя жизнь будет полна удивительных моментов, замечательных людей и ярких событий! С днем рождения!",
        "Пусть каждый день твоей жизни будет наполнен радостью и счастьем, а глаза сияют от удовольствия! С днем рождения!",
        "Желаю тебе, чтобы каждый новый день был лучше предыдущего, а каждый следующий год – счастливее предыдущего! Пусть все мечты сбываются! С днем рождения!",
        "Пусть каждый день твоей жизни будет прекрасным подарком, полным удивительных открытий и радостных моментов! С днем рождения!",
        "Желаю тебе огромного счастья, благополучия, любви, здоровья, достатка и всего, что только можно пожелать. С днем рождения!",
        "Сегодня твой особенный день, поэтому пусть он будет заполнен улыбками, счастьем и всем тем, что ты любишь. С днем рождения!",
        "Пусть твой день будет таким же ярким и специальным, как ты. Поздравляю тебя с днем рождения!",
        "Сегодня твой день! Желаю тебе праздничного настроения, тепла, любви и улыбок близких людей. С днем рождения!",
        "Пусть твой день будет наполнен любовью, радостью и улыбками! С днем рождения!",
        "С днем рождения! Желаю тебе счастья, здоровья и всего наилучшего в этом мире. Ты это заслуживаешь!"
    )

    private val spanish = listOf(
        "¡Que tu vida esté llena de momentos sorprendentes, personas maravillosas y eventos brillantes! ¡Feliz cumpleaños!",
        "¡Que cada día de tu vida esté lleno de alegría y felicidad, y que tus ojos brillen de placer! ¡Feliz cumpleaños!",
        "Deseo que cada nuevo día sea mejor que el anterior y que cada año siguiente sea más feliz que el anterior. ¡Que todos tus sueños se hagan realidad! ¡Feliz cumpleaños!",
        "¡Que cada día de tu vida sea un regalo maravilloso, lleno de descubrimientos increíbles y momentos felices! ¡Feliz cumpleaños!",
        "Te deseo una felicidad inmensa, bienestar, amor, salud, prosperidad y todo lo que puedas desear. ¡Feliz cumpleaños!",
        "Hoy es tu día especial, así que que esté lleno de sonrisas, felicidad y todo lo que amas. ¡Feliz cumpleaños!",
        "Que tu día sea tan brillante y especial como tú. ¡Feliz cumpleaños!",
        "¡Hoy es tu día! Te deseo un estado de ánimo festivo, calidez, amor y sonrisas de tus seres queridos. ¡Feliz cumpleaños!",
        "Que tu día esté lleno de amor, alegría y sonrisas. ¡Feliz cumpleaños!",
        "¡Feliz cumpleaños! Te deseo felicidad, salud y todo lo mejor en el mundo. ¡Te lo mereces!"
    )

    private val german = listOf(
        "Möge dein Leben voller erstaunlicher Momente, wunderbarer Menschen und strahlender Ereignisse sein! Alles Gute zum Geburtstag!",
        "Mögen all deine Tage mit Freude und Glück erfüllt sein und deine Augen vor Vergnügen leuchten! Alles Gute zum Geburtstag!",
        "Ich wünsche dir, dass jeder neue Tag besser ist als der vorherige und jedes kommende Jahr glücklicher als das vorherige! Mögen sich all deine Träume erfüllen! Alles Gute zum Geburtstag!",
        "Mögen all deine Tage ein wundervolles Geschenk sein, voller erstaunlicher Entdeckungen und freudiger Momente! Alles Gute zum Geburtstag!",
        "Ich wünsche dir unermessliches Glück, Wohlstand, Liebe, Gesundheit, Wohlstand und alles andere, was du dir wünschen kannst. Alles Gute zum Geburtstag!",
        "Heute ist dein besonderer Tag, also lass ihn voller Lächeln, Glück und allem sein, was du liebst. Alles Gute zum Geburtstag!",
        "Möge dein Tag genauso hell und besonders sein wie du. Herzlichen Glückwunsch zum Geburtstag!",
        "Heute ist dein Tag! Ich wünsche dir eine festliche Stimmung, Wärme, Liebe und Lächeln von den Menschen, die dir nahestehen. Alles Gute zum Geburtstag!",
        "Möge dein Tag voller Liebe, Freude und Lächeln sein! Alles Gute zum Geburtstag!",
        "Herzlichen Glückwunsch zum Geburtstag! Ich wünsche dir Glück, Gesundheit und alles Gute in der Welt. Du hast es verdient!"
    )
}