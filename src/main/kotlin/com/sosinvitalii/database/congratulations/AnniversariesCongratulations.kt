package com.sosinvitalii.database.congratulations

object AnniversariesCongratulations {
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
        "Congratulations on your jubilee! May this day be filled with joy, happiness, and a festive atmosphere! Wishing you good health, love, and the fulfillment of all your dreams!",
        "Happy jubilee! May every day be filled with joy, achievements, and satisfaction with life! May success accompany you in everything you do!",
        "Congratulations on this wonderful jubilee! Wishing you strong health, happiness, inspiration, and new bright experiences! May your life be filled with joy and prosperity!",
        "Happy jubilee! May this jubilee mark a new beginning filled with new opportunities and achievements! Wishing you happiness, luck, and success in all your endeavors!",
        "Congratulations on this significant jubilee! May every moment of your life be filled with joy, laughter, and well-being! May the years bring only the brightest and unforgettable moments!",
        "Happy jubilee! Wishing you that this jubilee becomes a new page in your life, filled with happiness, satisfaction, and love! May every day bring only joy and the fulfillment of dreams!",
        "Congratulations on this beautiful jubilee! Wishing you robust health, longevity, and a feeling of complete happiness! May there always be room for joy and love in your life!",
        "Happy jubilee! May this day become a new beginning filled with vibrant events, impressions, and happy moments! Wishing you success, prosperity, and the fulfillment of all your desires!",
        "Congratulations on your jubilee! Wishing you to maintain a bright life energy, joy, and optimism for many years ahead! May your entire journey be crowned with success and well-being!"
    )

    private val italian = listOf(
        "Congratulazioni per il tuo giubileo! Che questo giorno sia pieno di gioia, felicità e un'atmosfera festosa! Ti auguro buona salute, amore e il raggiungimento di tutti i tuoi sogni!",
        "Buon giubileo! Che ogni giorno sia pieno di gioia, successi e soddisfazione nella vita! Che il successo ti accompagni in tutto ciò che fai!",
        "Congratulazioni per questo meraviglioso giubileo! Ti auguro una salute robusta, felicità, ispirazione e nuove esperienze luminose! Che la tua vita sia piena di gioia e prosperità!",
        "Buon giubileo! Che questo giubileo segni un nuovo inizio pieno di nuove opportunità e successi! Ti auguro felicità, fortuna e successo in tutti i tuoi sforzi!",
        "Congratulazioni per questo significativo giubileo! Che ogni momento della tua vita sia pieno di gioia, risate e benessere! Che gli anni portino solo momenti più luminosi e indimenticabili!",
        "Buon giubileo! Ti auguro che questo giubileo diventi una nuova pagina nella tua vita, piena di felicità, soddisfazione e amore! Che ogni giorno porti solo gioia e il raggiungimento dei sogni!",
        "Congratulazioni per questo bellissimo giubileo! Ti auguro una robusta salute, longevità e la sensazione di completa felicità! Che ci sia sempre spazio per la gioia e l'amore nella tua vita!",
        "Buon giubileo! Che questo giorno diventi un nuovo inizio pieno di eventi vibranti, impressioni e momenti felici! Ti auguro successo, prosperità e il raggiungimento di tutti i tuoi desideri!",
        "Congratulazioni per il tuo giubileo! Ti auguro di mantenere una brillante energia vitale, gioia e ottimismo per molti anni a venire! Che tutto il tuo percorso sia coronato da successo e benessere!"
    )

    private val russian = listOf(
        "Поздравляю с юбилеем! Пусть этот день будет наполнен радостью, счастьем и праздничным настроением! Желаю здоровья, любви и исполнения всех мечтаний!",
        "С юбилеем! Желаю, чтобы каждый день был наполнен радостью, достижениями и удовлетворением от жизни! Пусть успех сопутствует во всем, что вы делаете!",
        "Поздравляю с замечательным юбилеем! Желаю вам крепкого здоровья, счастья, вдохновения и новых ярких впечатлений! Пусть ваша жизнь будет полна радости и благополучия!",
        "С юбилеем! Пусть этот юбилей станет новым началом, наполненным новыми возможностями и достижениями! Желаю счастья, удачи и благополучия во всех делах!",
        "Поздравляю с знаменательным юбилеем! Желаю, чтобы каждый момент вашей жизни был наполнен радостью, смехом и благополучием! Пусть годы приносят только самые яркие и незабываемые моменты!",
        "С юбилеем! Желаю, чтобы этот юбилей стал новой страницей в вашей жизни, полной счастья, удовлетворения и любви! Пусть каждый день приносит только радость и исполнение мечтаний!",
        "Поздравляю с прекрасным юбилеем! Желаю крепкого здоровья, долголетия и ощущения полного счастья! Пусть в вашей жизни всегда будет место для радости и любви!",
        "С юбилеем! Пусть этот день станет новым началом, наполненным яркими событиями, впечатлениями и счастливыми моментами! Желаю успехов, процветания и сбывания всех желаний!",
        "Поздравляю с юбилеем! Желаю вам сохранить яркую жизненную энергию, радость и оптимизм на долгие годы вперед! Пусть весь ваш путь будет увенчан успехом и благополучием!"
    )

    private val spanish = listOf(
        "¡Felicitaciones por tu jubileo! ¡Que este día esté lleno de alegría, felicidad y un ambiente festivo! Te deseo buena salud, amor y el cumplimiento de todos tus sueños!",
        "¡Feliz jubileo! ¡Que cada día esté lleno de alegría, logros y satisfacción con la vida! ¡Que el éxito te acompañe en todo lo que hagas!",
        "¡Felicitaciones por este maravilloso jubileo! ¡Te deseo una salud fuerte, felicidad, inspiración y nuevas experiencias brillantes! ¡Que tu vida esté llena de alegría y prosperidad!",
        "¡Feliz jubileo! ¡Que este jubileo marque un nuevo comienzo lleno de nuevas oportunidades y logros! ¡Te deseo felicidad, suerte y éxito en todos tus emprendimientos!",
        "¡Felicitaciones por este jubileo significativo! ¡Que cada momento de tu vida esté lleno de alegría, risas y bienestar! ¡Que los años solo traigan los momentos más brillantes e inolvidables!",
        "¡Feliz jubileo! ¡Deseo que este jubileo se convierta en una nueva página en tu vida, llena de felicidad, satisfacción y amor! ¡Que cada día traiga solo alegría y el cumplimiento de los sueños!",
        "¡Felicitaciones por este hermoso jubileo! ¡Te deseo salud sólida, longevidad y la sensación de una felicidad completa! ¡Que siempre haya espacio para la alegría y el amor en tu vida!",
        "¡Feliz jubileo! ¡Que este día se convierta en un nuevo comienzo lleno de eventos vibrantes, impresiones y momentos felices! ¡Te deseo éxito, prosperidad y el cumplimiento de todos tus deseos!",
        "¡Felicitaciones por tu jubileo! ¡Te deseo mantener una brillante energía vital, alegría y optimismo durante muchos años por venir! ¡Que todo tu camino esté coronado de éxito y bienestar!"
    )

    private val german = listOf(
        "Herzlichen Glückwunsch zu deinem Jubiläum! Möge dieser Tag voller Freude, Glück und festlicher Stimmung sein! Ich wünsche dir gute Gesundheit, Liebe und die Erfüllung all deiner Träume!",
        "Alles Gute zum Jubiläum! Mögen jeden Tag Freude, Erfolge und Zufriedenheit dein Leben erfüllen! Möge dir der Erfolg in allem, was du tust, stets begleiten!",
        "Herzlichen Glückwunsch zu diesem wunderbaren Jubiläum! Ich wünsche dir stabile Gesundheit, Glück, Inspiration und neue strahlende Erfahrungen! Möge dein Leben von Freude und Wohlstand erfüllt sein!",
        "Alles Gute zum Jubiläum! Möge dieses Jubiläum einen neuen Anfang markieren, der voller neuer Möglichkeiten und Errungenschaften ist! Ich wünsche dir Glück, Erfolg und Wohlergehen in all deinen Vorhaben!",
        "Herzlichen Glückwunsch zu diesem bedeutenden Jubiläum! Mögen alle Momente deines Lebens von Freude, Gelächter und Wohlbefinden erfüllt sein! Mögen die Jahre nur die hellsten und unvergesslichsten Momente bringen!",
        "Alles Gute zum Jubiläum! Ich wünsche dir, dass dieses Jubiläum eine neue Seite in deinem Leben wird, die voller Glück, Zufriedenheit und Liebe ist! Möge jeder Tag nur Freude und die Erfüllung von Träumen bringen!",
        "Herzlichen Glückwunsch zu diesem wunderschönen Jubiläum! Ich wünsche dir stabile Gesundheit, Langlebigkeit und das Gefühl vollkommener Glückseligkeit! Möge immer Raum für Freude und Liebe in deinem Leben sein!",
        "Alles Gute zum Jubiläum! Möge dieser Tag zu einem neuen Anfang werden, der von lebendigen Ereignissen, Eindrücken und glücklichen Momenten erfüllt ist! Ich wünsche dir Erfolg, Wohlstand und die Erfüllung all deiner Wünsche!",
        "Herzlichen Glückwunsch zu deinem Jubiläum! Ich wünsche dir, dass du deine strahlende Lebensenergie, Freude und Optimismus für viele kommende Jahre bewahrst! Möge deine gesamte Reise von Erfolg und Wohlbefinden gekrönt sein!"
    )
}