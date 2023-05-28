package com.sosinvitalii.database.congratulations

object WeddingCongratulations {
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
        "May your marriage be a strong union of love, understanding, and happiness! Congratulations on your long-awaited wedding day!",
        "I wish that every day of your married life is filled with joy, mutual support, and tenderness! Congratulations on your union!",
        "May your hearts always beat in unison, and may your days be filled with love and happiness! Best wishes on your wedding day!",
        "Congratulations on the most wonderful day of your life! May your marriage be long, happy, and filled with only the most beautiful moments!",
        "I wish you infinite love, mutual respect, and happiness on this beautiful journey you have chosen together. Congratulations on your union!",
        "May your marriage be like a fairytale, where every day is filled with magic and happiness! Congratulations on this significant and romantic milestone in your life!",
        "Wishing you all the best on this special day! May your marriage be filled with joy, comfort, and harmony. Congratulations on your wedding!",
        "Congratulations on the beginning of a new chapter in your life! Wishing you beautiful moments, tenderness, and unforgettable memories together. Happy wedding!",
        "May your family happiness be unshakable, and may your days be filled with love and happy smiles! Congratulations on your wedding day!",
        "Happy wedding! I wish you many years of a happy and harmonious life, filled with love, understanding, and joyful moments!"
    )

    private val italian = listOf(
        "Che il vostro matrimonio sia una solida unione d'amore, comprensione e felicità! Congratulazioni per il vostro tanto atteso giorno di nozze!",
        "Auguro che ogni giorno della vostra vita matrimoniale sia pieno di gioia, sostegno reciproco e tenerezza! Congratulazioni per il vostro matrimonio!",
        "Che i vostri cuori batano sempre all'unisono e che i vostri giorni siano pieni di amore e felicità! I migliori auguri per il vostro giorno di nozze!",
        "Congratulazioni per il giorno più meraviglioso della vostra vita! Che il vostro matrimonio sia lungo, felice e pieno solo dei momenti più belli!",
        "Vi auguro un amore infinito, rispetto reciproco e felicità in questo bellissimo cammino che avete scelto insieme. Congratulazioni per il vostro matrimonio!",
        "Che il vostro matrimonio sia come una fiaba, in cui ogni giorno sia pieno di magia e felicità! Congratulazioni per questo traguardo significativo e romantico nella vostra vita!",
        "I migliori auguri in questo giorno speciale! Che il vostro matrimonio sia pieno di gioia, conforto e armonia. Congratulazioni per il vostro matrimonio!",
        "Congratulazioni per l'inizio di un nuovo capitolo nella vostra vita! Vi auguro momenti splendidi, tenerezza e ricordi indimenticabili insieme. Felice matrimonio!",
        "Che la vostra felicità familiare sia salda e che i vostri giorni siano pieni di amore e sorrisi felici! Congratulazioni per il vostro giorno di nozze!",
        "Felice matrimonio! Vi auguro tanti anni di una vita felice e armoniosa, piena di amore, comprensione e momenti gioiosi!"
    )

    private val russian = listOf(
        "Пусть ваш брак будет крепким союзом любви, взаимопонимания и счастья! Поздравляю с долгожданным свадебным днем!",
        "Желаю вам, чтобы каждый день вашей совместной жизни был наполнен радостью, взаимной поддержкой и нежностью! Поздравляю с бракосочетанием!",
        "Пусть ваши сердца всегда бьются в едином ритме, а ваши дни наполнены любовью и счастьем! С наилучшими пожеланиями в день вашей свадьбы!",
        "Поздравляю с самым замечательным днем в вашей жизни! Пусть ваш брак будет долгим, счастливым и наполненным только самыми прекрасными моментами!",
        "Желаю вам бесконечной любви, взаимного уважения и счастья на этом прекрасном пути, который вы выбрали вместе. Поздравляю с бракосочетанием!",
        "Пусть ваш брак будет как сказка, в которой каждый день будет наполнен волшебством и счастьем! Поздравляю с важным и романтичным событием в вашей жизни!",
        "С наилучшими пожеланиями в этот особый день! Пусть ваш брак будет полон радости, уюта и гармонии. Поздравляю с свадьбой!",
        "Поздравляю с началом новой главы в вашей жизни! Желаю вам прекрасных мгновений, нежности и незабываемых моментов вместе. Счастливой свадьбы!",
        "Пусть ваше семейное счастье будет непоколебимым, а ваши дни будут наполнены любовью и счастливыми улыбками! Поздравляю с днем свадьбы!",
        "Счастливой свадьбы! Желаю вам долгих лет счастливой и согласованной жизни, полной любви, взаимопонимания и счастливых мгновений!"
    )

    private val spanish = listOf(
        "¡Que su matrimonio sea una sólida unión de amor, comprensión y felicidad! ¡Felicitaciones en su esperado día de bodas!",
        "Deseo que cada día de su vida matrimonial esté lleno de alegría, apoyo mutuo y ternura. ¡Felicitaciones en su unión!",
        "¡Que sus corazones siempre latan al unísono y que sus días estén llenos de amor y felicidad! ¡Mis mejores deseos en su día de bodas!",
        "¡Felicitaciones en el día más maravilloso de sus vidas! ¡Que su matrimonio sea largo, feliz y lleno solo de los momentos más hermosos!",
        "Les deseo un amor infinito, respeto mutuo y felicidad en este hermoso camino que han elegido juntos. ¡Felicitaciones en su unión!",
        "¡Que su matrimonio sea como un cuento de hadas, donde cada día esté lleno de magia y felicidad! ¡Felicitaciones en este hito significativo y romántico en su vida!",
        "¡Mis mejores deseos en este día especial! ¡Que su matrimonio esté lleno de alegría, confort y armonía! ¡Felicitaciones en su boda!",
        "¡Felicitaciones por el comienzo de un nuevo capítulo en su vida! Les deseo momentos hermosos, ternura e inolvidables recuerdos juntos. ¡Feliz matrimonio!",
        "¡Que su felicidad familiar sea inquebrantable y que sus días estén llenos de amor y sonrisas felices! ¡Felicitaciones en su día de bodas!",
        "¡Feliz matrimonio! ¡Les deseo muchos años de una vida feliz y armoniosa, llena de amor, comprensión y momentos alegres!"
    )

    private val german = listOf(
        "Möge eure Ehe eine starke Verbindung aus Liebe, Verständnis und Glück sein! Herzlichen Glückwunsch zu eurem lang ersehnten Hochzeitstag!",
        "Ich wünsche euch, dass jeder Tag eures gemeinsamen Lebens voller Freude, gegenseitiger Unterstützung und Zärtlichkeit ist! Herzlichen Glückwunsch zu eurer Vermählung!",
        "Mögen eure Herzen immer im gleichen Rhythmus schlagen und eure Tage voller Liebe und Glück sein! Die besten Wünsche zu eurem Hochzeitstag!",
        "Herzlichen Glückwunsch zu dem schönsten Tag eures Lebens! Möge eure Ehe lang, glücklich und nur von den schönsten Momenten erfüllt sein!",
        "Ich wünsche euch unendliche Liebe, gegenseitigen Respekt und Glück auf diesem wundervollen gemeinsamen Weg, den ihr gewählt habt. Herzlichen Glückwunsch zu eurer Eheschließung!",
        "Möge eure Ehe wie ein Märchen sein, in dem jeder Tag voller Magie und Glück ist! Herzlichen Glückwunsch zu diesem bedeutsamen und romantischen Meilenstein in eurem Leben!",
        "Die besten Wünsche an diesem besonderen Tag! Möge eure Ehe voller Freude, Geborgenheit und Harmonie sein. Herzlichen Glückwunsch zu eurer Hochzeit!",
        "Herzlichen Glückwunsch zum Beginn eines neuen Kapitels in eurem Leben! Ich wünsche euch wunderschöne Momente, Zärtlichkeit und unvergessliche Erinnerungen zusammen. Alles Gute zur Hochzeit!",
        "Möge euer familiäres Glück unerschütterlich sein und mögen eure Tage voller Liebe und glücklicher Lächeln sein! Herzlichen Glückwunsch zu eurem Hochzeitstag!",
        "Alles Gute zur Hochzeit! Ich wünsche euch viele Jahre eines glücklichen und harmonischen Lebens, erfüllt von Liebe, Verständnis und fröhlichen Momenten!"
    )
}