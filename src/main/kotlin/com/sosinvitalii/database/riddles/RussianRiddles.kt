package com.sosinvitalii.database.riddles
import com.sosinvitalii.feature.riddles.RiddleResponseRemote

/// Загадки на русском языке
object RussianRiddles {
    fun fetch(difficult: Difficult): List<RiddleResponseRemote> {
        return if (difficult == Difficult.HARD) {
            hardRiddles
        } else {
            easyRiddles
        }
    }

    private val easyRiddles = listOf(
        RiddleResponseRemote(
            question = "Что можно увидеть с закрытыми глазами?",
            answer = "Сны"
        ),
        RiddleResponseRemote(
            question = "Что есть всегда, но никогда не насыщается?",
            answer = "Голод"
        ),
        RiddleResponseRemote(
            question = "Кто всегда идет, но никогда не приходит?",
            answer = "Солнце"
        ),
        RiddleResponseRemote(
            question = "Что растет, когда кормишь, но умирает, если поишь?",
            answer = "Растение или цветок"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, даже не касаясь?",
            answer = "Тишину"
        ),
        RiddleResponseRemote(
            question = "В какой комнате никогда нет мебели?",
            answer = "Грибница (комната для выращивания грибов)"
        ),
        RiddleResponseRemote(
            question = "Что всегда идет, но никогда не бежит, и всегда бежит, но никогда не идет?",
            answer = "Часы"
        ),
        RiddleResponseRemote(
            question = "Какое слово становится короче, если добавить к нему букву?",
            answer = "Слово 'короткое'"
        ),
        RiddleResponseRemote(
            question = "Что становится все больше и больше, когда все еще и больше добавляешь?",
            answer = "Яма или котлован."
        ),
        RiddleResponseRemote(
            question = "Кто ходит на четырех ногах утром, на двух ногах днем и на трех ногах вечером?",
            answer = "Человек: ходит на четырех ногах (ползает) в детстве, на двух ногах взрослым и использует трость в старости."
        ),
        RiddleResponseRemote(
            question = "Всегда готово, никогда не съедено. Оно все время в движении, но никогда не двигается. Что это?",
            answer = "Вода"
        ),
        RiddleResponseRemote(
            question = "Оно идет вверх, но никогда не спускается. Что это?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что можно взять в левую руку, но нельзя взять в правую?",
            answer = "Правую руку"
        ),
        RiddleResponseRemote(
            question = "Какое слово можно написать одной буквой?",
            answer = "Слово'О'"
        ),
        RiddleResponseRemote(
            question = "Маленькая девочка бросила мяч. Он вернулся к ней, не ударившись ни об одну поверхность. Как это возможно?",
            answer = "Она бросила мяч вверх"
        ),
        RiddleResponseRemote(
            question = "Что можно разбить, если уронить, но нельзя починить?",
            answer = "Яйцо"
        ),
        RiddleResponseRemote(
            question = "Что можно поделить, но нельзя съесть?",
            answer = "Секрет"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого человека, и оно всегда заканчивается на число 5?",
            answer = "Его возраст"
        ),
        RiddleResponseRemote(
            question = "Висит груша, нельзя скушать. Что это?",
            answer = "Лампока"
        ),
        RiddleResponseRemote(
            question = "Что вы можете держать только одну минуту, несмотря на то, что это ни тяжело, ни горячо?",
            answer = "Дыхание"
        ),
        RiddleResponseRemote(
            question = "Какой растет вверх корнями?",
            answer = "Лотос"
        ),
        RiddleResponseRemote(
            question = "Что будет висеть в воздухе, если не упадет на землю?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "В чем всегда 13 пунктов, но никогда не 14?",
            answer = "В числовом списке буквенного алфавита, где буква 'М' - 13-я буква, но буквы 'Н' уже нет."
        ),
        RiddleResponseRemote(
            question = "Что можно купить, но нельзя есть?",
            answer = "Посуду"
        ),
        RiddleResponseRemote(
            question = "Что умеет говорить, но не умеет слушать?",
            answer = "Телефон"
        ),
        RiddleResponseRemote(
            question = "Сколько лун в небе?",
            answer = "Одна"
        ),
        RiddleResponseRemote(
            question = "Можно ли сломать стекло звуком?",
            answer = "Да, стекло можно сломать сильным звуком, например, ударом из громкоговорителя или взрывом"
        ),
        RiddleResponseRemote(
            question = "Что можно слышать, но никогда не увидеть?",
            answer = "Эхо"
        ),
        RiddleResponseRemote(
            question = "У какого моря нет берегов?",
            answer = "Мертвое море"
        ),
        RiddleResponseRemote(
            question = "Кто может ходить по воде, не прыгая и не плавая?",
            answer = "Тень."
        ),
        RiddleResponseRemote(
            question = "Какой ключ не открывает ни одной двери?",
            answer = "Фальшивый ключ"
        ),
        RiddleResponseRemote(
            question = "Когда вода кипит?",
            answer = "Когда достигает своей температуры кипения.(100)"
        ),
        RiddleResponseRemote(
            question = "Что у человека есть только один, у животного два, а у птицы нет?",
            answer = "Нос"
        ),
        RiddleResponseRemote(
            question = "Что летает без крыльев?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что всегда идет вниз, но никогда не поднимается?",
            answer = "Дождь"
        ),
        RiddleResponseRemote(
            question = "Какое слово становится короче, если убрать из него буквы?",
            answer = "Кратко"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть во тьме, но не в свете?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Что идет вокруг всего мира, но остается в углу?",
            answer = "Марка на почтовой марке"
        ),
        RiddleResponseRemote(
            question = "Какое животное может говорить все языки?",
            answer = "Попугай"
        ),
        RiddleResponseRemote(
            question = "Что улыбается, но не имеет рта?",
            answer = "Фотография"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать с одним прикосновением?",
            answer = "Свет"
        ),
        RiddleResponseRemote(
            question = "Что вырастает вверх корнями?",
            answer = "Зубы"
        ),
        RiddleResponseRemote(
            question = "Что никогда не стоит на месте, но никогда не двигается?",
            answer = "Разговор"
        ),
        RiddleResponseRemote(
            question = "В какой момент каждый человек становится старше своего отца?",
            answer = "В день рождения"
        ),
        RiddleResponseRemote(
            question = "Что можно удержать в левой руке, но нельзя удержать в правой?",
            answer = "Правую руку"
        ),
        RiddleResponseRemote(
            question = "Что больше: количество звезд на небе или количество зерен песка на земле?\n",
            answer = "Количество зерен песка на земле"
        ),
        RiddleResponseRemote(
            question = "Что не имеет начала, конца или середины?",
            answer = "Кольцо"
        ),
        RiddleResponseRemote(
            question = "Что можно слышать, но нельзя сказать?",
            answer = "Молчание"
        ),
        RiddleResponseRemote(
            question = "Что висит в воздухе и не падает?",
            answer = "Вопрос"
        ),
        RiddleResponseRemote(
            question = "Что всегда идет рядом с вами, но никогда не может вас догнать?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Что начинается и заканчивается буквой 'е', но имеет только одну букву?",
            answer = "Буква 'е'"
        ),
        RiddleResponseRemote(
            question = "Какое слово можно прочитать вперед и назад, и оно останется таким же?"
            answer = "Оно"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, если произнести его имя?",
            answer = "Зеркало"
        ),
        RiddleResponseRemote(
            question = "Что не имеет тела, но может ударить вас?",
            answer = "Слово"
        ),
        RiddleResponseRemote(
            question = "Какой ключ нельзя повернуть в замке?",
            answer = "Скрипичный ключ"
        ),
        RiddleResponseRemote(
            question = "Что делает шаги назад, когда на него идут вперед?",
            answer = "Эскалатор"
        ),
        RiddleResponseRemote(
            question = "Что падает, но никогда не разбивается?",
            answer = "Снег"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого, но каждый отдает это другим?",
            answer = "Слово"
        ),
        RiddleResponseRemote(
            question = "Что можно сделать только один раз в жизни?",
            answer = "Родиться"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого, и оно всегда заканчивается на число 5?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что можно снять, но нельзя надеть?",
            answer = "Последствия"
        ),
        RiddleResponseRemote(
            question = "Что летит без крыльев и падает без парашюта?",
            answer = "Снежинка"
        ),
        RiddleResponseRemote(
            question = "Что идет вверх и никогда не опускается?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что растет, когда его кормить, но умирает, когда его поливать?",
            answer = "Свеча"
        ),
        RiddleResponseRemote(
            question = "Что может быть сделано на столе, но нельзя съесть?",
            answer = "Колода карт"
        ),
        RiddleResponseRemote(
            question = "Что увеличивается, когда вы берете от него?",
            answer = "Шов"
        ),
        RiddleResponseRemote(
            question = "Что всегда идет вперед, но никогда не выходит на свет?",
            answer = "Прошлое"
        ),
        RiddleResponseRemote(
            question = "Что имеет глаза, но не видит?",
            answer = "Иголка"
        ),
        RiddleResponseRemote(
            question = "Что можно носить на голове, но никогда не видеть?",
            answer = "Шапка"
        ),
        RiddleResponseRemote(
            question = "Что можно разделить только пополам?",
            answer = "Печенька"
        ),
        RiddleResponseRemote(
            question = "Что начинается с головы и заканчивается хвостом?",
            answer = "Удав"
        ),
        RiddleResponseRemote(
            question = "Что всегда врет, но никогда не говорит неправду?",
            answer = "Счетчик"
        ),
        RiddleResponseRemote(
            question = "Что двигается быстрее — свет или звук?",
            answer = "Звук"
        ),
        RiddleResponseRemote(
            question = "Что становится меньше, когда ты берешь больше?",
            answer = "Шаг"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого, и каждый день становится все меньше и меньше?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что нельзя видеть, но можно слышать, и если его уронить, оно разобьется?",
            answer = "Эхо"
        ),
        RiddleResponseRemote(
            question = "Что может быть в конце и начале каждого пути, и нигде в середине?",
            answer = "Буква 'Е'"
        ),
        RiddleResponseRemote(
            question = "Что рождается в моменте, но живет годами?",
            answer = "Мгновение"
        ),
        RiddleResponseRemote(
            question = "Что всегда приходит, но никогда не приходит домой?",
            answer = "Завтра"
        ),
        RiddleResponseRemote(
            question = "Что становится мокрым, когда вы его вытираете?",
            answer = "Полотенце"
        ),
        RiddleResponseRemote(
            question = "Что можно взять, но нельзя отдать?",
            answer = "Воспоминание"
        ),
        RiddleResponseRemote(
            question = "Что нельзя увидеть, пока оно не исчезнет?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Что всегда летает без крыльев и умирает без звука?",
            answer = "Совесть"
        ),
        RiddleResponseRemote(
            question = "Назови ее по имени и она исчезнет",
            answer = "Тишина"
        ),
        RiddleResponseRemote(
            question = "Что поднимает вас наверх и опускает вниз, но само находится на месте?",
            answer = "Эскалатор"
        ),
        RiddleResponseRemote(
            question = "Что станет лучше, если его потоптать?",
            answer = "Тропинка"
        ),
        RiddleResponseRemote(
            question = "Что не жует, но все пожирает?",
            answer = "Огонь"
        ),
        RiddleResponseRemote(
            question = "Куда я, туда и она",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Неживая, но идет, неподвижная, но ведет",
            answer = "Дорога"
        ),
        RiddleResponseRemote(
            question = "Не машет крылом, но летает; не птица, но птиц обгоняет",
            answer = "Самолет"
        ),
        RiddleResponseRemote(
            question = "Что это такое: четыре цвета имеют, раз в три месяца их меняют?",
            answer = "Времена года"
        ),
        RiddleResponseRemote(
            question = "Я встретил ее случайно. Я пытался ее достать, но она уходила все дальше и дальше. Что это?",
            answer = "Заноза"
        ),
        RiddleResponseRemote(
            question = "Кто в небе родился и в земле схоронился?",
            answer = "Дождь, град"
        ),
        RiddleResponseRemote(
            question = "Бочка с водой весит 50 килограмм, что нужно добавить, чтобы она стала весить 15 килограмм?",
            answer = "Дырку"
        ),
        RiddleResponseRemote(
            question = "Какое слово всегда звучит неверно?",
            answer = "Неверно"
        ),
        RiddleResponseRemote(
            question = "Электропоезд идет по ветру. Куда идет дым?",
            answer = "У электропоезда нет дыма"
        ),
        RiddleResponseRemote(
            question = "Сколько горошин может войти в один стакан?",
            answer = "Нисколько, горошины не ходят"
        ),
        RiddleResponseRemote(
            question = "Что бросают, когда нуждаются в этом, и поднимают, когда в этом нет нужды?",
            answer = "Морской якорь"
        ),
        RiddleResponseRemote(
            question = "Из какой посуды нельзя ничего съесть?",
            answer = "Из пустой"
        ),
        RiddleResponseRemote(
            question = "Чем можно поделиться только один раз?",
            answer = "Секретом"
        ),
        RiddleResponseRemote(
            question = "Что станет больше, если его перевернуть вверх ногами?",
            answer = "Число 9"
        ),
        RiddleResponseRemote(
            question = "Сколько лет в году?",
            answer = "Одно лето"
        ),
        RiddleResponseRemote(
            question = "Какие зубы у человека появляются последними?",
            answer = "Искусственные"
        ),
        RiddleResponseRemote(
            question = "Что получится, если барабан разделить на барабан",
            answer = "Барабанная дробь"
        ),
        RiddleResponseRemote(
            question = "Мальчик рассказывает: 'Вчера был такой ужасный дождь, а мой отец не взял ни зонта, ни шляпы. Когда он появился в дверях, вода лилась с него ручьями, но ни один волос на его голове не промок. Укрыться от дождя в радиусе мили от нашего дома негде - вокруг голая степь'. Почему ни один волос на голове мужчины не промок?",
            answer = "Отец мальчика был абсолютно лысым"
        ),
        RiddleResponseRemote(
            question = "Сколько месяцев в году имеют 28 дней?",
            answer = "Все месяцы"
        ),
        RiddleResponseRemote(
            question = "С какой скоростью должна двигаться собака (в возможных для неё пределах), чтобы не слышать звона сковородки, привязанной к ее хвосту?",
            answer = "С нулевой. Собаке нужно стоять на месте"
        ),
        RiddleResponseRemote(
            question = "Собака была привязана к десятиметровой веревке, а прошла по прямой двести метров. Как ей это удалось?",
            answer = "Её веревка не была ни к чему не привязана"
        ),
        RiddleResponseRemote(
            question = "Как спрыгнуть с десятиметровой лестницы и не ушибиться?",
            answer = "Нужно прыгать с нижней ступени"
        ),
        RiddleResponseRemote(
            question = "Что в огне не горит и в воде не тонет?",
            answer = "Лед"
        ),
        RiddleResponseRemote(
            question = "Кого австралийцы называют морской осой?",
            answer = "Медузу"
        ),
        RiddleResponseRemote(
            question = "Что нужно делать, когда видишь зелёного человечка?",
            answer = "Переходить улицу (это рисунок на зелёном сигнале светофора)"
        ),
        RiddleResponseRemote(
            question = "Москву раньше называли белокаменной. А какой город называли чёрным?",
            answer = "Чернигов"
        ),
        RiddleResponseRemote(
            question = "Жители средневековой Европы иногда привязывали к подошвам деревянные чурки. С какой целью они это делали?",
            answer = "Для защиты от грязи, т.к. канализации не было и помои выливали прямо на улицу"
        ),
        RiddleResponseRemote(
            question = "В каком процессе вода заменила солнце, через 600 лет ее заменил песок, а еще через 1100 лет всех их заменил механизм?",
            answer = "В процессе измерения времени – часах"
        ),
        RiddleResponseRemote(
            question = "В прежние времена амбары строили на отшибе, подальше от жилищ. С какой целью",
            answer = "Чтобы пожар не уничтожил запасы продовольствия"
        ),
        RiddleResponseRemote(
            question = "Можно ли зажечь обычную спичку под водой, чтобы она догорела до конца?",
            answer = "Да, в подводной лодке"
        ),
        RiddleResponseRemote(
            question = "Как правильно говорить: «не вижу белый желток» или «не вижу белого желтка»?",
            answer = "Желток обычно жёлтый"
        ),
        RiddleResponseRemote(
            question = "Назовите пять дней, не называя чисел (1, 2, 3,..) и названий дней (понедельник, вторник, среда…)?",
            answer = "Позавчера, вчера, сегодня, завтра, послезавтра"
        ),
        RiddleResponseRemote(
            question = "Когда черной кошке лучше всего пробраться в дом?",
            answer = "Когда дверь открыта"
        ),
                    RiddleResponseRemote(
                    question = "Шли два отца и два сына, нашли три апельсина. Стали делить — всем по одному досталось. Как это могло быть?",
            answer = "Это были дед, отец и сын"
        ),
        RiddleResponseRemote(
            question = "Маленький, серенький на слона похож. Кто это?",
            answer = "Слонёнок"
        ),
        RiddleResponseRemote(
            question = "Какой рукой лучше размешивать чай?",
            answer = "Той, в которой ложка"
        ),
        RiddleResponseRemote(
            question = "Когда человек бывает в комнате без головы?",
            answer = "Когда высунет её из комнаты (например, в окно)"
        ),
        RiddleResponseRemote(
            question = "На какой вопрос нельзя ответить “да”?",
            answer = "Ты спишь?"
        ),
        RiddleResponseRemote(
            question = "На какой вопрос нельзя ответить “нет”?",
            answer = "Ты жив?"
        ),
        RiddleResponseRemote(
            question = "Чем оканчиваются день и ночь?",
            answer = "Мягким знаком"
        ),
        RiddleResponseRemote(
            question = "Сорока летит, а собака на хвосте сидит. Может ли это быть?",
            answer = "Да, собака сидит на собственном хвосте, рядом сорока летает"
        ),
        RiddleResponseRemote(
            question = "Что надо сделать, чтобы пять парней остались в одном сапоге?",
            answer = "Каждому из них снять по сапогу"
        ),
        RiddleResponseRemote(
            question = "Сколько будет 2+2*2?",
            answer = "Шесть"
        ),
        RiddleResponseRemote(
            question = "Что надо сделать, чтобы пять парней остались в одном сапоге?",
            answer = "Каждому из них снять по сапогу"
        ),
        RiddleResponseRemote(
            question = "В каком месяце болтливая Светочка говорит меньше всего?",
            answer = "В феврале – самом коротком месяце"
        ),
        RiddleResponseRemote(
            question = "Как найти прошлогодний снег?",
            answer = "Выйти на улицу сразу после начала нового года"
        ),
        RiddleResponseRemote(
            question = "У человека — одно, у коровы — два, у ястреба – ни одного. Что это?",
            answer = "Буква ‑О-"
        ),
        RiddleResponseRemote(
            question = "Сидит человек, но вы не можете сесть на его место, даже если он встанет и уйдёт. Где он сидит?",
            answer = "На Ваших коленях"
        ),
        RiddleResponseRemote(
            question = "Каких камней в море нет?",
            answer = "Сухих"
        ),
        RiddleResponseRemote(
            question = "Какой знак нужно поставить между 4‑мя и 5‑ю, чтобы результат оказался больше 4‑х и меньше 5‑ти?",
            answer = "Запятую"
        ),
        RiddleResponseRemote(
            question = "Может ли петух назвать себя птицей?",
            answer = "Нет, т.к. он не умеет говорить"
        ),
        RiddleResponseRemote(
            question = "Какой болезнью на земле никто не болел?",
            answer = "Морской"
        ),
        RiddleResponseRemote(
            question = "Можно ли предсказать счёт любого матча до его начала?",
            answer = "Да, 0 – 0"
        ),
        RiddleResponseRemote(
            question = "Какая цифра уменьшится на треть, если её перевернуть?",
            answer = "Цифра 9"
        ),
        RiddleResponseRemote(
            question = "У квадратного стола отпилили один угол по прямой линии . Сколько теперь углов у стола?",
            answer = "Пять"
        ),
        RiddleResponseRemote(
            question = "Какой узел нельзя развязать?",
            answer = "Железнодорожный"
        ),
        RiddleResponseRemote(
            question = "Что у коровы впереди, а у быка позади?",
            answer = "Буква ‑К-"
        ),
        RiddleResponseRemote(
            question = "Какая река самая страшная?",
            answer = "Тигр"
        ),
        RiddleResponseRemote(
            question = "Что не имеет длины, глубины, ширины, высоты, а можно измерить?",
            answer = "Температуру, время"
        ),
        RiddleResponseRemote(
            question = "Что все люди на земле делают одновременно?",
            answer = "Становятся старше"
        ),
        RiddleResponseRemote(
            question = "Два человека играли в шашки. Каждый сыграл по пять партий и выиграл по пять раз. Это возможно?",
            answer = "Оба человека играли разные партии с другими людьми"
        ),
        RiddleResponseRemote(
            question = "Как может брошенное яйцо пролететь три метра и не разбиться?",
            answer = "Нужно бросить яйцо более, чем на три метра, тогда первые три метра оно пролетит целым"
        ),
        RiddleResponseRemote(
            question = "Мужчина вел большой грузовик. Фары на машине не были зажжены. Луны тоже не было. Женщина стала переходить дорогу перед машиной. Как удалось водителю разглядеть ее?",
            answer = "Был яркий солнечный день"
        ),
        RiddleResponseRemote(
            question = "Где край света?",
            answer = "Там, где кончается тень"
        ),
        RiddleResponseRemote(
            question = "Человек научился у пауков строить подвесные мосты, у кошек перенял диафрагму в фотоаппарате и светоотражающие дорожные знаки. А какое изобретение появилось благодаря змеям?",
            answer = "Шприц"
        ),
        RiddleResponseRemote(
            question = "Что с земли легко поднимешь, но далеко не закинешь?",
            answer = "Тополиный пух"
        ),
        RiddleResponseRemote(
            question = "Каким гребнем голову не расчешешь?",
            answer = "Петушиным"
        ),
        RiddleResponseRemote(
            question = "Вы сидите в самолёте, впереди вас лошадь, сзади автомобиль. Где Вы находитесь?",
            answer = "На карусели"
        ),
        RiddleResponseRemote(
            question = "Какими нотами можно измерить расстояние?",
            answer = "Ми-Ля-Ми"
        ),
        RiddleResponseRemote(
            question = "Что не войдёт в самую большую кастрюлю?",
            answer = "Её крышка"
        ),
        RiddleResponseRemote(
            question = "Русская загадка. Деревянная река, деревянный катерок, а над катером струится деревянный дымок. Что это?",
            answer = "Рубанок"
        ),
        RiddleResponseRemote(
            question = "Один оборот вокруг Земли спутник делает за 1 час 40 минут, а другой за 100 минут. Как такое может быть?",
            answer = "Один час сорок минут равны ста минутам"
        ),
        RiddleResponseRemote(
            question = "В одной руке мальчик нёс один килограмм железа, а в другой столько же пуха. Что было тяжелее нести?",
            answer = "Одинаково"
        ),
        RiddleResponseRemote(
            question = "Какие животные всегда спят с открытыми глазами?",
            answer = "Рыбы"
        ),
        RiddleResponseRemote(
            question = "Какие насекомые одомашнены человеком?",
            answer = "Пчёлы"
        ),
        RiddleResponseRemote(
            question = "ЧПочему дикобраз не может утонуть?",
            answer = "У него иголки полые"
        ),
        RiddleResponseRemote(
            question = "Назовите растение, у которого самые большие плоды?",
            answer = "Тыква"
        ),
        RiddleResponseRemote(
            question = "У ежа 4 г, у собаки – 100 г, у лошади – 500 г, у слона – 4–5 кг, у человека – 1,4 кг. Чего?",
            answer = "Масса головного мозга"
        ),
        RiddleResponseRemote(
            question = "Как известно, все исконно русские женские (полные) имена зканчиваются либо на А, либо на Я: Анна, Мария, Ольга и т.д. Однако есть одно женское имя, которое не оканчивается ни на А, ни на Я. Назовите его.",
            answer = "Любовь"
        ),
        RiddleResponseRemote(
            question = "У человека двенадцать пар рёбер. А у кого рёбер около трёхсот?",
            answer = "У змеи"
        ),
        RiddleResponseRemote(
            question = "В каком месте русские мужики надевали шапки и рукавицы, независимо от времени года?",
            answer = "В бане"
        ),
        RiddleResponseRemote(
            question = "У трёх маляров был брат Иван, а у Ивана братьев не было. Как это могло быть?",
            answer = "У Ивана были три сестры"
        ),
        RiddleResponseRemote(
            question = "Если в 12 часов ночи идет дождь, то можно ли ожидать, что через 72 часа будет солнечная погода?",
            answer = "Нет, так как через 72 часа снова будет полночь"
        ),
        RiddleResponseRemote(
            question = "В парке 8 скамеек. Три покрасили. Сколько скамеек стало в парке?",
            answer = "Восемь"
        ),
        RiddleResponseRemote(
            question = "Термометр показывает плюс 15 градусов. Сколько градусов покажут два таких термометра?",
            answer = "15 градусов"
        ),
        RiddleResponseRemote(
            question = "Батон разрезали на три части. Сколько сделали разрезов?",
            answer = "Два разреза"
        ),
        RiddleResponseRemote(
            question = "Что легче 1 кг ваты или 1 кг железа?",
            answer = "Одинаково"
        ),
        RiddleResponseRemote(
            question = "Грузовик ехал в деревню. По дороге он встретил 4 легковые машины. Сколько машин ехало в деревню?",
            answer = "Одна"
        ),
        RiddleResponseRemote(
            question = "Два раза родится, один раз умирает. Кто это?",
            answer = "Цыплёнок"
        ),
        RiddleResponseRemote(
            question = "Что с пола за хвост не поднимешь?",
            answer = "Клубок"
        ),
        RiddleResponseRemote(
            question = "Почему загадки опасны для головы?",
            answer = "Потому, что люди ломают над ним голову"
        ),
        RiddleResponseRemote(
            question = "Что общее может быть у снега и у кустарника сирени?",
            answer = "Цвет. Цветки сирени бывают и белого цвета"
        ),
        RiddleResponseRemote(
            question = "Что делает сторож, когда у него на голове сидит воробей?",
            answer = "Спит"
        ),
        RiddleResponseRemote(
            question = "Где находятся города без домов, реки без воды и леса без деревьев",
            answer = "На географической карте"
        ),
        RiddleResponseRemote(
            question = "В названии какой стороны света сто одна буква?",
            answer = "Восток"
        ),
        RiddleResponseRemote(
            question = "С грузом идут, без груза останавливаются",
            answer = "Часы с гирями"
        ),
        RiddleResponseRemote(
            question = "У кого усы длиннее ног?",
            answer = "У рака, у таракана"
        ),
        RiddleResponseRemote(
            question = "Что было “завтра”, а будет “вчера”",
            answer = "Сегодня"
        ),
        RiddleResponseRemote(
            question = "Шесть ног, две головы, а хвост один. Что это?",
            answer = "Всадник на лошади"
        ),
        RiddleResponseRemote(
            question = "Какие часы показывают верное время только два раза в сутки?",
            answer = "Которые остановились"
        ),
        RiddleResponseRemote(
            question = "Собрались как-то ребята на пикнике, всего 6 человек. Смотрят, а вместо 6 яблок они взяли 5. Как разделить яблоки поровну между всеми, чтоб никому не было обидно? Ни резать, ни ломать их нельзя",
            answer = "Нужно сварить из яблок компот"
        ),
        RiddleResponseRemote(
            question = "Если Эрика живёт в Вашингтоне, а Тина живёт в Буэнос-Айресе, то где живёт Тай?",
            answer = "В Пекине. Имена людей – часть названий страны, в столице которых каждый из них живёт."
        ),
        RiddleResponseRemote(
            question = "Как можно поместить два литра молока в литровую банку?",
            answer = "Сварить из него сгущёнку"
        ),
        RiddleResponseRemote(
            question = "Как число 66 увеличить в полтора раза, не производя над ним никаких арифметических действий?",
            answer = "Число 66 надо всего лишь перевернуть «вверх ногами». Получится 99, а это и есть 66, увеличенное в полтора раза"
        ),
        RiddleResponseRemote(
            question = "8 + 7 = 13 или 7 + 8 = 13?",
            answer = "8 + 7 = 15 а не 13"
        ),
        RiddleResponseRemote(
            question = "Я был приглашен на вечеринку. Там я увидел человека с очень редкими часами. Откуда я знаю, что эти часы были украдены?",
            answer = "Потому что эти часы были моими"
        ),
        RiddleResponseRemote(
            question = "Карандаш положили на пол и попросили нескольких человек перепрыгнуть через него. Но никто не смог этого сделать. Почему?",
            answer = "Его вплотную положили к стене"
        ),
        RiddleResponseRemote(
            question = "Перед вами электронные часы. Сколько раз в сутки они будут показывать время так, что все ячейки на циферблате (часы, минуты, секунды) будут заполнены одной и той же цифрой?",
            answer = "Три раза: 00.00.00; 11.11.11; 22.22.22"
        ),
        RiddleResponseRemote(
            question = "Составьте вопрос из пяти стоящих подряд букв русского алфавита. Подсказка: возможно это будет не одно слово.",
            answer = "Где ёж?"
        ),
        RiddleResponseRemote(
            question = "Половина от половины числа равна половине. Какое это число?",
            answer = "Это число 2. Половина этого числа равна 1, а половина от половины этого числа (т. е. единицы) равна 0,5, т. е. тоже половине."
        ),
        RiddleResponseRemote(
            question = "Назовите два числа, у которых количество цифр равно количеству букв, составляющих название каждого из этих чисел.",
            answer = "Сто (100) и миллион (1000000)"
        ),
        RiddleResponseRemote(
            question = "Сколько у вас было всего всего прапрадедушек и прапрабабушек?",
            answer = "У каждого человека 2 родителя, 2 бабушки и 2 дедушки, 4 прабабушки и 4 прадедушки, 8 прапрабабушек и 8 прапрадедушек."
        ),
        RiddleResponseRemote(
            question = "Если три дня назад был день, предшествующий понедельнику, то какой день будет послезавтра?",
            answer = "Перед понедельником было воскресенье. Если три дня назад было воскресенье, то сегодня — среда. Если сегодня — среда, значит, послезавтра будет пятница."
        ),
        RiddleResponseRemote(
            question = "Девушка уронила свое кольцо в чашку, в которой был растворимый кофе. Почему кольцо осталось сухим?",
            answer = "В чашку ещё не успели налить воды"
        ),
        RiddleResponseRemote(
            question = "Она красная? – Нет, черная. А почему она белая? Потому что зеленая. Что это?",
            answer = "Черная смородина."
        ),
        RiddleResponseRemote(
            question = "В подъезд одновременно зашли два человека. У одного квартира на 3‑м этаже, у другого – на 9‑м. Во сколько раз первый доедет быстрее 2‑го?",
            answer = "В 4 раза,т.к.1‑му надо преодолеть 2 промежутка между этажами, а 2‑му – 8."
        ),
        RiddleResponseRemote(
            question = "Самолет, пароход, воздушный шар, вертолет. Какое слово здесь лишнее?",
            answer = "Пароход (не летает)"
        ),
        RiddleResponseRemote(
            question = "Из леса Миша принес бабушке для грибного супа 2 белых гриба, 3 подосиновика, 4 мухомора и 5 сыроежек. Сколько грибов пригодится бабушке на суп?",
            answer = "10 грибов, мухомор – несъедобный гриб."
        ),
        RiddleResponseRemote(
            question = "Васе 5 лет. А Ане 9 лет. Какая разница в возрасте будет между ними через три года?",
            answer = "етыре года (разница с возрастом не меняется)."
        ),
        RiddleResponseRemote(
            question = "На подносе лежали 9 булочек. 9 девочек взяли по булочке. Но на подносе осталась одна булочка. Как такое получилось?",
            answer = "Последняя девочка взяла булочку вместе с подносом."
        ),
        RiddleResponseRemote(
            question = "В светильнике было 20 лампочек, 5 из них перегорели. Сколько лампочек осталось?",
            answer = "Двадцать лампочек (15 работающих и 5 перегоревших)."
        ),
        RiddleResponseRemote(
            question = "Из какого полотна нельзя сшить рубашку?",
            answer = "Из железнодорожного."
        ),
        RiddleResponseRemote(
            question = "Сын моего отца, а мне не брат?",
            answer = "Я сам."
        ),
        RiddleResponseRemote(
            question = "Как написать мышеловка пятью буквами?",
            answer = "Кошка"
        ),
        RiddleResponseRemote(
            question = "Перед кем все люди снимают шляпу?",
            answer = "Перед парикмахером"
        ),
        RiddleResponseRemote(
            question = "Когда человек может мчаться со скоростью гоночного автомобиля?",
            answer = "Когда он в нём находится"
        ),
        RiddleResponseRemote(
            question = "Какой малыш рождается с усами?",
            answer = "Например, котёнок."
        ),
        RiddleResponseRemote(
            question = "У  домбры их две, у арфы их пять, у гитары — шесть. А сколько их у пианино?",
            answer = "Семь (октав)"
        ),
        RiddleResponseRemote(
            question = "В корзине три яблока. Как поделить их между тремя детьми так, чтобы одно яблоко осталось в корзине?",
            answer = "Отдать одно вместе с корзиной"
        ),
        RiddleResponseRemote(
            question = "Два раза родится, один раз умирает",
            answer = "Курица"
        ),
        RiddleResponseRemote(
            question = "Висит груша – нельзя скушать. Не лампочка.",
            answer = "Это чужая груша"
        ),
        RiddleResponseRemote(
            question = "В каком городе спрятались мужское имя и сторона света?",
            answer = "Владивосток"
        ),
        RiddleResponseRemote(
            question = "Один французский писатель терпеть не мог Эйфелеву башню, но постоянно на ней обедал. Как он это объяснял?",
            answer = "Это единственное место в городе, откуда ее не видно"
        ),
        RiddleResponseRemote(
            question = "Как называется боязнь прихода Санта-Клауса?",
            answer = "Клаустрофобия"
        ),
        RiddleResponseRemote(
            question = "Когда человек имеет столько глаз, сколько дней в году?",
            answer = "Второго января"
        ),
        RiddleResponseRemote(
            question = "Один фокусник заявил, что может поставить бутылку в центре комнаты и вползти в нее. Как это?",
            answer = "В нее — комнату"
        ),
        RiddleResponseRemote(
            question = "Что нужно положить на пирожок прежде, чем его съесть?",
            answer = "Зубы"
        ),
        RiddleResponseRemote(
            question = "Как поймать тигра в клетку?",
            answer = "Тигра в клетку не бывает, тигр в полоску"
        ),
        RiddleResponseRemote(
            question = "У мальчика Коли мама работает в школе поваром, а папа — на мясокомбинате. Вопрос, какой вес у мальчика Коли?",
            answer = "Избыточный"
        ),
        RiddleResponseRemote(
            question = "Что общего между молоком и ежиком?",
            answer = "Способность сворачиваться"
        ),
        RiddleResponseRemote(
            question = "По чему ходят часто, а ездят редко?",
            answer = "По лестнице"
        ),
        RiddleResponseRemote(
            question = "Где встречается такое, что конь через коня перепрыгивает?",
            answer = "В шахматах"
        ),
        RiddleResponseRemote(
            question = "Какой пробкой нельзя заткнуть ни одну бутылку?",
                    answer = "Дорожной"
        ),
        RiddleResponseRemote(
            question = "Они бывают металлические и жидкие. О чем речь?",
                    answer = "Гвозди"
        ),
        RiddleResponseRemote(
            question = "У кого за носом пятка?",
                    answer = "Обувь"
        ),
        RiddleResponseRemote(
            question = "Что можно взять в левую руку, но нельзя в правую?",
                    answer = "Локоть правой руки"
        ),
        RiddleResponseRemote(
            question = "За столом сидят ковбой, джентльмен и йог. Сколько ног стоит на полу?",
                    answer = "1 нога. Ковбой кладет ноги на стол, джентльмен кладет ногу на ногу, а йог медитирует"
        ),
        RiddleResponseRemote(
            question = "С какой птицы нужно ощипать перья, чтобы получились сразу утро, день, вечер и ночь?",
                    answer = "С утки, сутки"
        ),
        RiddleResponseRemote(
            question = "В каком случае шесть детей, две собаки, четверо взрослых, забравшись под один зонтик, не намокнут?",
                    answer = "В ясную погоду"
        ),
        RiddleResponseRemote(
            question = "Что нельзя съесть на завтрак?",
                    answer = "Обед и ужин"
        ),
        RiddleResponseRemote(
            question = "Сколько букв в алфавите?",
                    answer = "Семь, посчитайте А-Л-Ф-А-В-И-Т "
        ),
        RiddleResponseRemote(
            question = "Что такое черное, когда она чистая, И белая, когда она грязная?",
                    answer = "Школьная доска"
        ),
        RiddleResponseRemote(
            question = "Что состоит из одного слова, Но имеет тысячи писем?",
                    answer = "Почта"
        ),
        RiddleResponseRemote(
            question = "У Машиной мамы 5 дочек: Юля, Аня, Оля, Катя. Как зовут пятую дочку?",
                    answer = "Маша"
        ),
        RiddleResponseRemote(
            question = "Что у цапли спереди, а у зайца сзади?",
                    answer = "Буква Ц"
        ),
        RiddleResponseRemote(
            question = "Два брюшка – четыре ушка",
                    answer = "Подушка"
        ),
        RiddleResponseRemote(
            question = "Из какого крана нельзя помыть руки?",
                    answer = "Из башенного"
        ),
        RiddleResponseRemote(
            question = "Может ли дождь лить два дня подряд?",
                    answer = "Нет, между ними — ночь"
        ),
        RiddleResponseRemote(
            question = "На что больше всего похожа половина апельсина?",
                    answer = "На вторую половину апельсина"
        ),
        RiddleResponseRemote(
            question = "Шел охотник мимо башни с часами. Достал ружье и выстрелил. Куда он попал?",
                    answer = "В полицию"
        ),
        RiddleResponseRemote(
            question = "Сколько овец осталось у Абдуллы?",
                    answer = "14"
        ),
        RiddleResponseRemote(
            question = "Какая гора была самой высокой на Земле до открытия Эвереста?",
                    answer = "Эверест, хотя он и не был открыт"
        ),
        RiddleResponseRemote(
            question = "Где вторник идет раньше, чем понедельник?",
                    answer = "В словаре"
        ),
        RiddleResponseRemote(
            question = "Эскимосы — хорошие охотники, но они никогда не охотятся на пингвинов. Почему?",
                    answer = "Эскимосы живут на Севере, а пингвины — на Юге"
        ),
        RiddleResponseRemote(
            question = "Какую букву нужно спрятать за местоимение, чтобы получилось название животного?",
                    answer = "Букву «ц» за «я» — заяц"
        ),
        RiddleResponseRemote(
            question = "Что можно найти в декабре, Но нельзя найти ни в одном другом месяце?",
                    answer = "Букву Д"
        ),
        RiddleResponseRemote(
            question = "Какое изобретение позволяет смотреть сквозь стены?",
                    answer = "Дверь"
        ),
        RiddleResponseRemote(
            question = "Больше часа, меньше минуты.",
                    answer = "Секунда, стрелка некоторых моделей часов"
        ),
        RiddleResponseRemote(
            question = "Почему стоп-кран в поездах красного цвета, а в самолетах голубого?",
                    answer = "В самолетах нет стоп-крана"
        ),
        RiddleResponseRemote(
            question = "Какой стол не имеет ног?",
                    answer = "Диетический"
        ),
        RiddleResponseRemote(
            question = "Как человеку не спать 8 дней?",
                    answer = "Спать по ночам"
        ),
        RiddleResponseRemote(
            question = "По какому животному ходят люди и проезжают машины?",
                    answer = "Зебра"
        ),
        RiddleResponseRemote(
            question = "В каком слове «нет» употребляется 100 раз?",
                    answer = "Стонет"
        ),
        RiddleResponseRemote(
            question = "По какому пути еще никто никогда не ходил и не ездил?",
                    answer = "Млечный путь"
        ),
        RiddleResponseRemote(
            question = "В каком слове «спрятался» напиток и природное явление?",
                    answer = "Виноград"
        ),
        RiddleResponseRemote(
            question = "У семерых братьев по сестре. Сколько всего сестер?",
                    answer = "Одна"
        ),
        RiddleResponseRemote(
            question = "Полтора судака стоят полтора рубля. Сколько стоят 13 судаков?",
                    answer = "13 рублей"
        ),
        RiddleResponseRemote(
            question = "Маленький и удаленький, на лук похожий. Горький и жжет тоже",
                    answer = "Чеснок"
        ),
        RiddleResponseRemote(
            question = "Аня закрыла глаза. Что может увидеть Аня, не открывая их?",
                    answer = "Сны"
        ),
        RiddleResponseRemote(
            question = "Мама связала своим детям три шарфа и шесть носков. Сколько всего у нее детей",
                    answer = "Трое"
        ),
        RiddleResponseRemote(
            question = "На столе лежали четыре груши, одну из них позже разрезали пополам. Сколько всего груш на столе?",
                    answer = "4"
        ),
        RiddleResponseRemote(
            question = "Тройка лошадей пробежала пять км. Сколько километров пробежала каждая из лошадей?",
                    answer = "По пять км"
        ),
        RiddleResponseRemote(
            question = "У кого нет денег даже для того, чтоб бороду сбрить?",
                    answer = "У козла"
        ),
        RiddleResponseRemote(
            question = "Какая птица состоит из буквы и реки?",
                    answer = "И+волга"
        ),
        RiddleResponseRemote(
            question = "Конь бежит-бежит, но от чего он не убежит?",
                    answer = "От собственного хвоста"
        ),
        RiddleResponseRemote(
            question = "Кто из животных носит каменную рубаху?",
                    answer = "Черепаха"
        ),
        RiddleResponseRemote(
            question = "Сколько кошек можно посадить в пустую коробку",
                    answer = "одну. Потом коробка уже не будет пустой"
        ),
        RiddleResponseRemote(
            question = "Стоит богатый дом и бедный. Они горят. Какой дом будет тушить полиция?",
                    answer = "Полиция пожары не тушит, тушат пожары пожарные"
        ),
        RiddleResponseRemote(
            question = "Вы стоите перед тремя выключателями. За непрозрачной стеной три лампочки в выключенном состоянии. Вам нужно произвести манипуляции с выключателями, зайти в комнату и определить, к какой лампочке относится каждый выключатель.",
                    answer = "Сначала нужно включить два выключателя. Через какое-то время один из них выключить. Зайти в комнату. Одна лампочка будет горячая от включенного выключателя, вторая – тёплая от выключенного, третья – холодная, от нетронутого выключателя"
        ),
        RiddleResponseRemote(
            question = "К реке подходят два человека. У берега лодка, которая может выдержать только одного. Оба человека переправились на противоположный берег. Как?",
                    answer = "Они были на разных берегах"
        ),
        RiddleResponseRemote(
            question = "На столе лежат две монеты, в сумме они дают 3 рубля. Одна из них — не 1 рубль. Какие это монеты?",
                    answer = "1 и 2 рубля"
        ),
        RiddleResponseRemote(
            question = "Что не имеет длины, глубины, ширины, высоты, а можно измерить?",
            answer = "Время, температура"
        ),
        RiddleResponseRemote(
            question = "Одна яхта идет из Ниццы в Сан-Ремо, другая – из Сан-Ремо в Ниццу. Из гаваней они вышли одновременно. Первый час движения яхты шли с одинаковой скоростью (60 км/ч), но потом первая яхта увеличила скорость до 80 км/ч. Какая из яхт будет ближе к Ницце в момент их встречи?",
            answer = "В момент их встречи они будут находиться на одинаковом расстоянии от Ниццы"
        ),
        RiddleResponseRemote(
            question = "Шла женщина в Москву, а навстречу – три мужика. У каждого по мешку, в каждом мешке по кошке. Сколько существ направлялось в Москву?",
            answer = "Только женщина шла в Москву, остальные шли в другую сторону"
        ),
        RiddleResponseRemote(
            question = "На дереве сидело 10 птиц. Пришел охотник и подстрелил одну птицу. Сколько птиц осталось на дереве?",
            answer = "Ни одной – остальные птицы улетели"
        ),
        RiddleResponseRemote(
            question = "Вы участвуете в марафоне и обогнали бегуна, бежавшего вторым. Какую позицию вы теперь занимаете?",
            answer = "Вторую. Если вы ответили, что вы теперь первый – то это неправильно: вы обогнали второго бегуна и заняли его место, так что вы теперь на второй позиции"

        ),
        RiddleResponseRemote(
            question = "Электричка идет с востока на запад, а ветер дует с севера на юг. В какую сторону летит дым из трубы?",
            answer = "Это электричка, а не паровоз!"
        ),
        RiddleResponseRemote(
            question = "На столе лежали три огурца и четыре яблока. Ребенок взял со стола одно яблоко. Сколько фруктов осталось на столе?",
            answer = "3 фрукта, а огурцы – это овощи"
        ),
        RiddleResponseRemote(
            question = "Товар сначала подорожал на 10%, а потом подешевел на 10%. Какова его стоимость сейчас относительно первоначальной?",
            answer = "99%: после подорожания к 100% прибавили 10% — получилось 110%; 10% от 110% = 11%; затем от 110% отнимаем 11% и получаем 99%"
        ),
        RiddleResponseRemote(
            question = "Сколько раз встречается цифра 4 в целых числах от 1 до 50?",
            answer = "5 раз: 4, 14, 24, 34, 40, 41, 42, 43, 44 — дважды, 45, 46. 47, 48, 49"
        ),
        RiddleResponseRemote(
            question = "Вы проехали на машине две трети пути. В начале пути бензобак машины был полон, а сейчас он заполнен на одну четверть. Хватит ли бензина до конца пути (при аналогичном расходе)?",
            answer = "Нет, так как 1/4 < 1/3"
        ),
        RiddleResponseRemote(
            question = "У отца Мэри 5 дочерей: Чача, Чече, Чичи, Чочо. Как зовут пятую дочь?",
            answer = "Мэри"
        ),
        RiddleResponseRemote(
            question = "На границу России и Китая прилетел петух. Сел точно на границу, абсолютно посредине. Снёс яйцо. Оно упало точно поперек: граница делит его посредине. Какой стране принадлежит яйцо?",
            answer = "Петухи не откладывают яйца!"
        ),
        RiddleResponseRemote(
            question = "На руках десять пальцев. Сколько пальцев на десяти руках?",
            answer = "50"
        ),
        RiddleResponseRemote(
            question = "Самолет с английскими туристами летел из Голландии в Испанию. Во Франции он разбился. Где следует похоронить оставшихся в живых (раненых) туристов?",
            answer = "Оставшихся в живых не нужно хоронить!:)"
        ),
        RiddleResponseRemote(
            question = "Вы вели автобус с 42 пассажирами из Бостона в Вашингтон. На каждой из шести остановок из него выходило по 3 человека, а на каждой второй — по четыре. Как звали водителя, когда водитель через 10 часов прибыл в Вашингтон?",
            answer = "Как вас, ведь в начале было сказано, что вы вели автобус"
        ),
        RiddleResponseRemote(
            question = "Что Вы можете найти в минутах, секундах и днях, но не в годах, декадах и веках?",
            answer = "Букву Н"
        ),
        RiddleResponseRemote(
            question = "Сколько раз можно вычесть 3 из 25?",
            answer = "Один раз, так как после первого вычитания число '25' изменится на '22'"
        ),
        RiddleResponseRemote(
            question = "Все бунгало миссис Тейлор отделано в розовом цвете: в нем розовые светильники, розовые стены, розовые ковры и розовый потолок. Какого цвета лестницы в этом бунгало?",
            answer = "В бунгало нет лестниц"
        ),
        RiddleResponseRemote(
            question = "В 12-этажном доме есть лифт. На первом этаже живёт всего 2 человека, от этажа к этажу количество жильцов увеличивается вдвое. Какая кнопка в лифте этого дома нажимается чаще других?",
            answer = "Независимо от распределения жильцов по этажам – кнопка '1'"
        ),
        RiddleResponseRemote(
            question = "Что может в одно и то же время: стоять и ходить, висеть и стоять, ходить и лежать?",
            answer = "Часы"
        ),
        RiddleResponseRemote(
            question = "Что у человека может за несколько секунд увеличиться в диаметре в 7 раз?",
            answer = "Зрачок. При переходе от яркого света к темноте диаметр может измениться от 1.1 до 8 мм;  всё остальное либо почти не увеличивается, либо увеличивается в диаметре не более чем в 2-3 раза"
        ),
        RiddleResponseRemote(
            question = "На озере растут кувшинки. Каждый день их количество увеличивается в два раза. Известно, что кувшинки полностью покроют всю поверхность озера за 48 дней. Сколько дней потребуется кувшинкам, чтобы покрыть половину озера?",
            answer = "47 дней"
        ),
        RiddleResponseRemote(
            question = "Пять машин текстильной фабрики производят пять вещей за пять минут. За сколько минут 100 машин изготовят 100 вещей?",
            answer = "За 5 минут"
        ),
        RiddleResponseRemote(
            question = "Ехали в одном купе Баба-Яга, Змей Горыныч, глупый прапорщик и умный прапорщик. На столе стояла бутылка лимонада. Поезд вошел в тоннель, стало темно. Когда поезд вышел из тоннеля, бутылка была пуста. Кто выпил лимонад?",
            answer = "Лимонад выпил глупый прапорщик, так как остальные существа нереальные и в жизни не встречаются!)"
        ),
        RiddleResponseRemote(
            question = "На одной одесской улице было три портняжные мастерские. Первый портной рекламировал себя так: «Лучшая мастерская в Одессе!» Второй — «Лучшая мастерская в мире!» Третий «переплюнул» их обоих",
            answer = "«Лучшая мастерская на этой улице!»"
        ),
        RiddleResponseRemote(
            question = "Мужчина заходит в магазин, покупает колбасу и просит её нарезать, но не поперек, а вдоль. Продавщица спрашивает: «Вы пожарник?» — «Да». Как она догадалась?",
            answer = "Мужчина был в форме"
        ),
        RiddleResponseRemote(
            question = "Один студент рассказывает другому: «Вчера баскетбольная команда нашего колледжа выиграла встречу по баскетболу со счетом 76:40. При этом ни один баскетболист в этом матче не забросил ни одного мяча»",
            answer = "Играли женские команды"
        ),
        RiddleResponseRemote(
            question = "Два джигита соревновались: чей конь придёт к финишу последним. Однако дело не шло, оба стояли на месте. Тогда они обратились за советом к мудрецу, и после этого оба поскакали во весь опор",
            answer = "Мудрец посоветовал джигитам обменяться конями"
        ),
        RiddleResponseRemote(
            question = "Как положить карандаш в комнате так, чтобы никто не смог перепрыгнуть или перешагнуть его?",
            answer = "Положить карандаш около стены"
        ),
        RiddleResponseRemote(
            question = "Деревянная река, деревянный катерок, а над катером струится деревянный дымок. Что это?",
            answer = "Рубанок"
        ),
        RiddleResponseRemote(
            question = "Что я могу сделать, чего ты никогда в жизни повторить не сможешь?",
            answer = "Проползти у тебя между ног"
        ),
        RiddleResponseRemote(
            question = "Сколько фруктов можно съесть натощак?",
            answer = "Один фрукт, так как следующие будут уже не натощак"
        ),
        RiddleResponseRemote(
            question = "Как можно склонять голову, не опуская ее вниз?",
            answer = "По падежам"
        ),
        RiddleResponseRemote(
            question = "Меняется в течение года, но может быть фиксированной.",
            answer = "Дата"
        ),
        RiddleResponseRemote(
            question = "На корабле два моряка один смотрит на запад, а другой на восток, но они видят друг друга, как это получилось.",
            answer = "Они смотрят друг на друга"
        ),
        RiddleResponseRemote(
            question = "Что разбивается, но никогда не падает? Что падает, но никогда не разбивается.",
            answer = "Сердце и давление"
        ),
        RiddleResponseRemote(
            question = "Бывает легкой и тяжелой, но ничего не весит. Бывает быстрой и медленной, но не ходит, не бегает, не летает. Что же это?",
            answer = "Музыка"
        ),
        RiddleResponseRemote(
            question = "Какая мышца в теле человека самая сильная?",
            answer = "Жевательная и икроножная мышцы"
        ),
        RiddleResponseRemote(
            question = "Чем их больше, тем вес меньше. Что это?",
            answer = "Дырки"
        ),
        RiddleResponseRemote(
            question = "Про что всегда говорят в будущем времени?",
            answer = "Про завтра"
        ),
        RiddleResponseRemote(
            question = "В одной семье у двух сестер было по одному брату у каждой. Сколько всего детей в семье?",
            answer = "Всего 3 ребенка, две сестры и брат"
        ),
        RiddleResponseRemote(
            question = "Река, которая «помещается» во рту? ",
            answer = "Десна"
        ),
        RiddleResponseRemote(
            question = "Летели утки, одна впереди и две позади, одна позади и две впереди, одна между двумя. Сколько их было всего?",
            answer = "Три"
        ),
        RiddleResponseRemote(
            question = "Москва — 100, Ярославль — 1000, Архангельск — 500. О чем речь?",
            answer = "Рубли, изображения на купюрах"
        ),
        RiddleResponseRemote(
            question = "Несла бабка на базар сто яиц, а дно упало, сколько яиц осталось в корзине.",
            answer = "Ни одного ведь дно упало"
        ),
        RiddleResponseRemote(
            question = "На дне моря лежит сундук. В нем все есть, кроме одного. Чего в нем нет?",
            answer = "Пустоты"
        ),
        RiddleResponseRemote(
            question = "К тебе пришли гости, а в холодильнике только бутылка лимонада, пакет с ананасовым соком и бутылка минеральной воды. Что ты откроешь в первую очередь?",
            answer = "Холодильник"
        ),
        RiddleResponseRemote(
            question = "Мужчина зашел в темную комнату, что-то задел, стекло разбилось, и Люси умерла. Что произошло?",
            answer = "Люси была рыбкой"
        ),
        RiddleResponseRemote(
            question = "На попе сидит и в попу глядит. Какова же профессия человека?",
            answer = "Кучер или ямщик"
        ),
        RiddleResponseRemote(
            question = "Все люди хотят, чтобы у них было много этого овоща, но его нигде не купишь. Что это за овощ?",
            answer = "Капуста-деньги"
        ),
        RiddleResponseRemote(
            question = "В семье афроамериканцев в Кении родился ребенок, весь белый, даже зубы были белоснежными. Что здесь не так?",
            answer = "Дети рождаются без зубов"
        ),
        RiddleResponseRemote(
            question = "Летели галки, сели на палки. Сядут по одной — галка лишняя, сядут по две — палка лишняя. Сколько было палок и сколько было галок?",
            answer = "Три палки и четыре галки"
        ),
        RiddleResponseRemote(
            question = "Дело было зимой. Потерял братец Иванушка свою сестрицу Аленушку. Пошел он лесом, полем ее искать, и видит перед ним большая река. Как ему через реку перебраться?",
            answer = "По льду, дело зимой было"
        ),
        RiddleResponseRemote(
            question = "Лера и Катя решили поиграть. Одна девочка играла с куклой, а другая с плюшевым медведем. Лера не играла с куклой. С чем играла каждая девочка?",
            answer = "Лера играла с плюшевым медведем, а Катя с куклой"
        ),
        RiddleResponseRemote(
            question = "Вы уронили в кофе кольцо. Можно его достать, не намочив руки, если у вас ничего нет и кофе нельзя вылить?",
            answer = "Да, если кофе в зернах"
        ),
        RiddleResponseRemote(
            question = "Зашел мужик в бар, подошел к бармену и попросил стакан воды. Вместо этого бармен наставил на него ружье. Мужик сказал «спасибо» и ушел. Почему?",
            answer = "У мужика была сильная икота, а бармен решил ему помочь, напугав его"
        ),
        RiddleResponseRemote(
            question = "На берегу моря был камень. На камне было написано слово из 8 букв. Когда богатые читали это слово, они плакали, бедные радовались, а влюбленные расставались. Что это было за слово?",
            answer = "Временно"
        ),
        RiddleResponseRemote(
            question = "Сколько у меня цветов, если все из них кроме двух — розы, все кроме двух — тюльпаны, и все кроме двух — маргаритки?",
            answer = "Три цветка: роза, тюльпан и маргаритка"
        ),
        RiddleResponseRemote(
            question = "Два друга считали прохожих. Один сидел на месте и считал всех прохожих. А второй ходил взад-вперед и считал тех, кто идет ему навстречу. Кто насчитал больше?",
            answer = "Одинаково. Второй идет в одну сторону считает одних, в другую — других"
        ),
        RiddleResponseRemote(
            question = "Человек выпрыгнул из самолета без парашюта. Он приземлился на твердый грунт, но остался невредимым. Почему?",
            answer = "Самолет стоял на земле"
        ),
        RiddleResponseRemote(
            question = "У директора школы есть брат Николай. Но у Николая нет братьев. Может ли такое быть?",
            answer = "Да. Директор школы может быть женщиной"
        ),
        RiddleResponseRemote(
            question = "В какое время Луна весит больше?",
            answer = "Когда она полная"
        ),
        RiddleResponseRemote(
            question = "Глубиной она не больше высоты стакана, размером не больше охвата человеческих рук, но сколько бы воды в нее ни выливали, она все равно не заполнится.",
            answer = "Раковина"
        ),
        RiddleResponseRemote(
            question = "Кого простой смертный видит каждый день, король — очень редко, а Бог — никогда.",
            answer = "Себе подобных"
        ),
        RiddleResponseRemote(
            question = "Перекресток, светофор. КАМАЗ, повозка и мотоциклист стоят и ждут зеленого света. Загорелся желтый, КАМАЗ поехал. Лошадь испугалась и укусила мотоциклисту ухо. Вроде ДТП, но кто нарушил правила?",
            answer = "Мотоциклист, он был без шлема"
        ),
        RiddleResponseRemote(
            question = "Ползут 3 черепахи. 1-я черепаха говорит — за мной ползут две черепахи. 2-я черепаха говорит — за мной ползет одна черепаха и передо мной ползет одна черепаха. А 3-я черепаха — передо мной ползут две черепахи и за мной ползет одна черепаха. Как такое может быть?",
            answer = "Черепахи ползут кругом"
        ),
        RiddleResponseRemote(
            question = "Сколько земли содержит яма диаметром 3 метра и глубиной 3 метра?",
            answer = "Нисколько, ямы пустые"
        ),
        RiddleResponseRemote(
            question = "Сказочному гному еженощно нужна новая свеча, которой он светит себе в дороге, ходя по городу. Он может сделать 1 новую свечу из 5 свечных огарков. Если у него наберется 25 огарков, то на сколько ночей ему хватит запаса новых свечей?",
            answer = "На 6 ночей. Он сможет сделать 5 новых свеч из 25 огарков, а когда они сгорят, он может сделать шестую из тех 5 огарков, что от них останутся"
        ),
        RiddleResponseRemote(
            question = "Как написать «уточка» в 2 клетках?",
            answer = "В 1-ой — букву «у», во 2-ой — точку"
        ),
        RiddleResponseRemote(
            question = "В каком слове 5 «е» и никаких других гласных?",
            answer = "Переселенец"
        ),
        RiddleResponseRemote(
            question = "Мальчик заплатил за бутылку с пробкой 11 рублей. Бутылка стоит на 10 рублей больше, чем пробка. Сколько стоит пробка?",
            answer = "50 копеек"
        ),
        RiddleResponseRemote(
            question = "Где на Земле дует всегда южный ветер?",
            answer = "На Северном полюсе"
        ),
        RiddleResponseRemote(
            question = "Человек скупал фрукты по 10 рублей за штуку, но продавал их по 5 рубля за штуку. Спустя какое-то время он стал миллионером. Как у него это получилось?",
            answer = "Он был миллиардером"
        ),
        RiddleResponseRemote(
            question = "Какой остров сам себя называет предметом белья?",
            answer = "Ямайка, я — майка"
        ),
        RiddleResponseRemote(
            question = "Какую маленькую лошадку нужно поставить между двумя местоимениями, чтобы получилось название страны?",
            answer = "Пони, Япония"
        ),
        RiddleResponseRemote(
            question = "На столе лежит 100 листов бумаги. За каждые 10 секунд можно посчитать 10 листов. Сколько секунд понадобится, чтобы посчитать 80 листов?",
            answer = "80 секунд"
        ),
        RiddleResponseRemote(
            question = "Союз, число потом предлог — вот и вся загадка. А чтоб ответ найти ты смог, о реках вспомнить надо.",
            answer = "Исток"
        ),
        RiddleResponseRemote(
            question = "Человек полностью здоров, не умер, не инвалид, но выносят его из больницы на руках",
            answer = "Новорожденный"
        ),
        RiddleResponseRemote(
            question = "Банка стоит на столе. Стоит она так, что одна ее половина находится в воздухе, а другая на столе. Что лежит в банке, если через полчаса она упадет? И почему?",
            answer = "Лед. Он растает, и банка упадет"
        ),
        RiddleResponseRemote(
            question = "Можно ли с помощью сети ловить воду?",
            answer = "Можно, если вода замерзла"
        ),
        RiddleResponseRemote(
            question = "Сколько различных цифр надо использовать, чтобы написать число 100?",
            answer = "Две, ноль и один"
        ),
        RiddleResponseRemote(
            question = "В месяце три воскресенья выпали на четные числа. Какой день недели был седьмого числа этого месяца?",
            answer = "Пятница. Воскресенья выпадут на числа: 2, 9, 16, 23, 30"
        ),
        RiddleResponseRemote(
            question = "Разутый, но в сапогах. Ходит по земле, но вниз головой",
            answer = "Гвоздь в сапоге"
        ),
        RiddleResponseRemote(
            question = "Можно ли зажечь спичку под водой?",
            answer = "Можно, если воду налить в какую-то ёмкость, например, в стакан, а спичку держать ниже стакана"
        ),
        RiddleResponseRemote(
            question = "У чего есть шея, но нет головы?",
            answer = "Бутылка"
        ),
        RiddleResponseRemote(
            question = "На какое дерево во время дождя садится ворона?",
            answer = "На мокрое, мокрое"
        ),
        RiddleResponseRemote(
            question = "Кто под проливным дождем даже без зонта не намочит волосы?",
            answer = "Лысый"
        ),
        RiddleResponseRemote(
            question = "Летает без крыльев, плачет без глаз.",
            answer = "Туча"
        ),
        RiddleResponseRemote(
            question = "Из какого слова из семи букв можно убрать одну 'букву', чтобы осталось две буквы? ",
            answer = "Букварь "
        ),
        RiddleResponseRemote(
            question = "На футбольный матч всегда приходил один и тот же человек. До начала игры он угадывал счет. Как он это делал? ",
            answer = "До начала игры счет всегда 0:0 "
        ),
        RiddleResponseRemote(
            question = "На каком языке говорят молча?",
            answer = "Язык жестов"
        ),
        RiddleResponseRemote(
            question = "Семь сестер находятся на даче, где каждая занята каким-то делом. Первая сестра читает книгу, вторая — готовит еду, третья — играет в шахматы, четвертая — разгадывает судоку, пятая — занимается стиркой, шестая — ухаживает за растениями. А чем занимается седьмая сестра? ",
            answer = "Играет в шахматы"
        ),
        RiddleResponseRemote(
            question = "Мистера Марка нашли убитым в своем кабинете. Причиной оказалось пулевое ранение в голову. Детектив Робин, осматривая место убийства, нашел на столе кассетный диктофон. И когда он его включил, то услышал голос мистера Марка. Он говорил: «Говорит Марк. Только что мне позвонил Джонс и сказал, что через десять минут он будет здесь для того, чтобы пристрелить меня. Бежать бесполезно. Я знаю, что эта запись поможет полиции арестовать Джонса. Я слышу его шаги на лестнице. Вот открывается дверь...». Помощник детектива предложил арестовать Джонса по подозрению в убийстве. Но детектив не последовал совету его помощника. Как оказалось, он был прав. Убийцей оказался не Джонс, как это было сказано на пленке. Вопрос: почему у детектива возникли подозрения?",
            answer = "Кассета в диктофоне была пересмотра на начало. Тем более Джонс забрал бы кассету."
        ),
        RiddleResponseRemote(
            question = "В автобусе ехали 20 человек. На первой остановке вышли 2 и вошли 3 человека, на следующей — 1 вышел и 4 вошли, на следующей — 5 вышли и 2 вошли, на следующей — 2 вышли и 1 вошел, на следующей — 9 вышли и никто не вошёл, на следующей — ещё 2 вышли. Вопрос: сколько было остановок?",
            answer = "Ответ на загадку не так важен. Эта загадка с неожиданным вопросом. Пока вы рассказываете загадку, отгадывающий начинает в уме считать кол-во людей в автобусе, а в конце загадки вопросом про кол-во остановок вы поставите его в тупик."
        ),
        RiddleResponseRemote(
            question = "От чего плавает утка?",
            answer = "От берега"
        ),
        RiddleResponseRemote(
            question = "Антилопа, кенгуру, блоха соревновались в прыжках в высоту. Кенгуру прыгнул на 2 метра, антилопа — на 3 метра, а блоха — только на полметра. Кто победил?",
            answer = "Блоха (антилопа прыгнула только втрое выше своего роста, а блоха — в сотни раз выше своего роста)"
        ),
        RiddleResponseRemote(
            question = "Часы отбивают шесть ударов за тридцать секунд. Сколько времени часы будут отбивать двенадцать ударов?",
            answer = "66 секунд. Между 1 и 6 ударом 5 промежутков по 6 секунд, а между 1 и 12 — 11 промежутков по 6 секунд"
        ),
        RiddleResponseRemote(
            question = "Датчане любят говорить: «У нас всё лучше, чем в Швеции: климат, природа, народ, история, и только одно у шведов лучше.» Что?",
            answer = "Соседи"
        ),
        RiddleResponseRemote(
            question = "У входа в музей стоят два человека. Один из них отец сына другого. Как такое возможно?",
            answer = "Когда они муж и жена"
        ),
        RiddleResponseRemote(
            question = "В каком случае верно равенство 18 + 18 = 12?",
            answer = "Когда речь идёт о времени суток"
        ),
        RiddleResponseRemote(
            question = "Собака привязана к 20-метровой цепи. На сколько метров может уйти собака?",
            answer = "На сколько угодно, не сказано же, что второй конец цепи к чему-то привязан"
        ),
        RiddleResponseRemote(
            question = "У вас есть только одна спичка. В тёмной комнате стоят керосиновая лампа, печь и свеча. Что вы зажжёте в первую очередь?",
            answer = "Спичку"
        ),
        RiddleResponseRemote(
            question = "Что исчезает, когда съедаешь бублик?",
            answer = "Чувство голода"
        ),
        RiddleResponseRemote(
            question = "Hа суку сидит ворона. Что надо сделать, чтобы отпилить сук, не потревожив ворону?",
            answer = "Дождаться пока она улетит"
        ),
        RiddleResponseRemote(
            question = "Что общего между деньгами и гробом?",
            answer = "И то, и другое сначала заколачивают, а потом спускают"
        ),
        RiddleResponseRemote(
            question = "Чем отличается публика в цирке от воздушного шарика?",
            answer = "Воздушный шарик сначала надувают, потом пускают, а публику сначала впускают, а потом надувают"
        ),
        RiddleResponseRemote(
            question = "У трёх трактористов есть брат Сергей, а у Сергея братьев нет. Может ли такое быть?",
            answer = "Да, если трактористы женщины, либо речь о разных Сергеях"
        ),
        RiddleResponseRemote(
            question = "Как далеко в лес может забежать заяц?",
            answer = "До середины (дальше он уже выбегает из леса) "
        ),
        RiddleResponseRemote(
            question = "Какие слова изнуряли Винни-Пуха?",
            answer = "Длинные и труднопроизносимые"
        ),
        RiddleResponseRemote(
            question = "В комнате горело 50 свечей, 20 из них задули. Сколько останется?",
            answer = "Останется 20 (задутые свечи не сгорят полностью)"
        ),
        RiddleResponseRemote(
            question = "Какое колесо не крутится при правом развороте?",
            answer = "Запасное"
        ),
        RiddleResponseRemote(
            question = "Куда идёт цыпленок, переходя дорогу?",
            answer = "На другую сторону дороги"
        ),
        RiddleResponseRemote(
            question = "Мальчик упал с 4 ступенек и сломал ногу. Сколько ног сломает мальчик, если упадёт с 40 ступенек?",
            answer = "Одну, так как вторая у него уже сломана"
        ),
        RiddleResponseRemote(
            question = "Из гнезда вылетели три ласточки. Какова вероятность того, что через 15 секунд они будут находиться в одной плоскости?",
            answer = "100% , так как три точки всегда образуют одну плоскость"
        ),
        RiddleResponseRemote(
            question = "На столе лежат линейка, карандаш, циркуль и резинка. На листе бумаги нужно начертить окружность. С чего начать?",
            answer = "Надо достать лист бумаги"
        ),
        RiddleResponseRemote(
            question = "Можно ли из двух химических элементов создать ещё один элемент?",
            answer = "Да, если элемент гальванический"
        ),
        RiddleResponseRemote(
            question = "Во Франции и Германии это означает ноль, в Японии — деньги, в Тунисе — угроза смерти, в Сирии — разрыв отношений. А в США?",
            answer = "ОК (знак, который можно показать пальцами)"
        ),
        RiddleResponseRemote(
            question = "В каком случае 10 взрослых и 10 детей, забравшись под один зонтик, не намокнут?",
            answer = "Когда нет дождя "
        ),
        RiddleResponseRemote(
            question = "Что чем больше ешь, тем больше остаётся?",
            answer = "Орех, скорлупа"
        ),
        RiddleResponseRemote(
            question = "Не было и не будет, а названье было и будет",
            answer = "Птичье молоко"
        ),
        RiddleResponseRemote(
            question = "У трёх шоферов был брат Андрей, а у Андрея братьев не было. Могло ли это быть?",
            answer = "Да, если шофёры были женщинами"
        ),
        RiddleResponseRemote(
            question = "Кто без чего не обойдётся?",
            answer = "Человек без имени"
        ),
        RiddleResponseRemote(
            question = "Какой месяц короче всех?",
            answer = "Май (три буквы)"
        ),
        RiddleResponseRemote(
            question = "Корова — 2, кошка — 3, овца — 2, кукушка — 4, петух — 8, собака — 3, осёл — ?",
            answer = "2 (иа)"
        ),
        RiddleResponseRemote(
            question = "Если бросить в Чёрное море красный камень, то какой он будет?",
            answer = "Мокрый"
        ),
        RiddleResponseRemote(
            question = "Шёл дождь. Ехал автобус. В автобусе все спали и только водитель не спал. Какой номер автобуса и как звали водителя?",
            answer = "Номер автобуса мокрый, водителя звали Толька (только водитель) "
        ),
        RiddleResponseRemote(
            question = "В названии какого города имя одного мальчика и имя ста девочек?",
            answer = "Севастополь"
        ),
        RiddleResponseRemote(
            question = "Когда мужчину называют женским именем?",
            answer = "Когда он спит. Соня"
        ),
        RiddleResponseRemote(
            question = "Сколько яиц можно съесть натощак?",
            answer = "Одно, остальные уже не натощак"
        ),
        RiddleResponseRemote(
            question = "Какой город является частью сбруи лошади?",
            answer = "Узда"
        ),
        RiddleResponseRemote(
            question = "Какую ленту нельзя вплести в косичку?",
            answer = "Пулемётную"
        ),
        RiddleResponseRemote(
            question = "Что у коровы впереди, а у быка позади?",
            answer = "Буква к "
        ),
        RiddleResponseRemote(
            question = "Каким будет гнедой конь, если его искупать?",
            answer = "Мокрым"
        ),
        RiddleResponseRemote(
            question = "Что можно приготовить, но нельзя съесть?",
            answer = "Домашнее задание"
        ),
        RiddleResponseRemote(
            question = "Что два стоит дороже, чем три?",
            answer = "Две педали коробки автомат дороже трёх педалей механики"
        ),
        RiddleResponseRemote(
            question = "Когда козе исполнится семь лет, что будет дальше?",
            answer = "Пойдёт восьмой"
        ),
        RiddleResponseRemote(
            question = "В комнате 4 угла, в каждом углу по одной кошки, напротив каждой кошки по три кошки, на хвосте у каждой кошки по одной кошки. Сколько кошек в комнате?",
            answer = "4 кошки (напротив каждой кошки по три кошки в трёх углах, и каждая кошка сидит на своём хвосте)"
        ),
        RiddleResponseRemote(
            question = "Что сделается с красным шёлковым платком, если его опустить на пять минут на дно Красного моря?",
            answer = "Будет мокрым"
        ),
        RiddleResponseRemote(
            question = "Один глаз, один рог, но не носорог?",
            answer = "Корова из-за угла выглядывает"
        ),
        RiddleResponseRemote(
            question = "Что имеет голову, но не имеет мозгов?",
            answer = "Головка чеснока"
        ),
        RiddleResponseRemote(
            question = "Можно ли тёщу убить ватой?",
            answer = "Да, если в вату завернуть утюг"
        ),
        RiddleResponseRemote(
            question = "Какое слово начинается с трёх букв «г» и заканчивается тремя буквами «я»?",
            answer = "Тригонометрия"
        ),
        RiddleResponseRemote(
            question = "Что за слово, в котором 40 гласных?",
            answer = "Сорока (40 а)"
        ),
        RiddleResponseRemote(
            question = "По чему коровы не летают?",
            answer = "По воздуху"
        ),
        RiddleResponseRemote(
            question = "Что тяжелее: килограмм железа или килограмм пуха?",
            answer = "Они весят одинаково"
        ),
        RiddleResponseRemote(
            question = "Когда курица стоит на одной ноге, она весит 2 кг. Сколько она будет весить, если встанет на две ноги?",
            answer = "2 кг"
        ),
        RiddleResponseRemote(
            question = "Могут ли быть на яблоне яйца?",
            answer = "Могут, если они в птичьем гнезде"
        ),
        RiddleResponseRemote(
            question = "Одно яйцо варится 3 минуты. Сколько минут будут вариться 2 яйца?",
            answer = "3 минуты"
        ),
        RiddleResponseRemote(
            question = "Если пять кошек ловят пять мышей за пять минут, то сколько времени нужно одной кошке, чтобы поймать одну мышку?",
            answer = "5 минут"
        ),
        RiddleResponseRemote(
            question = "Когда мы смотрим на цифру 2, а говорим 10?",
            answer = "Когда смотрим на часы"
        ),
        RiddleResponseRemote(
            question = "Канат растягивается на 0,5 см от нагрузки в 100 кг. На сколько сантиметров растянется канат от нагрузки в 10 тонн?",
            answer = "Канат разорвётся"
        ),
        RiddleResponseRemote(
            question = "Не верблюд, а плюётся. Не калькулятор, а считает. Не радио, а вещает.",
            answer = "Человек"
        ),
        RiddleResponseRemote(
            question = "Скажешь «не приходи!» — всё равно приходит. Скажешь «не уходи!» — всё равно уходит. Что это такое?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что нужно сделать, встретив во сне тигра?",
            answer = "Проснуться"
        ),
        RiddleResponseRemote(
            question = "Какой приток Днепра привлекателен для охотников?",
            answer = "Река Тетерев"
        ),
        RiddleResponseRemote(
            question = "Чем больше по нему топчутся ногами, тем лучше.",
            answer = "Виноград (топчутся ногами по винограду для производства вина)"
        ),
        RiddleResponseRemote(
            question = "Какой год продолжается всего один день?",
            answer = "Новый год"
        ),
        RiddleResponseRemote(
            question = "Сколько минут надо варить крутое яйцо?",
            answer = "Нисколько, оно уже сварено (сварено вкрутую)"
        ),
        RiddleResponseRemote(
            question = "Почему собака лает?",
            answer = "Говорить не умеет"
        ),
        RiddleResponseRemote(
            question = "Что кроме отелей может быть трёхзвёздочным, пятизвёздочным?",
            answer = "Коньяк"
        ),
        RiddleResponseRemote(
            question = "Москва — 6, Ярославль — 9, Архангельск — 11. О чём речь?",
            answer = "Количество букв в словах"
        ),
        RiddleResponseRemote(
            question = "Летели три страуса. Охотник одного убил. Сколько страусов осталось?",
            answer = "Страусы не летают"
        ),
        RiddleResponseRemote(
            question = "Какая земля никогда не состарится?",
            answer = "Новая Земля"
        ),
        RiddleResponseRemote(
            question = "Какой город является излюбленным местом обитания белки?",
            answer = "Бор "
        ),
        RiddleResponseRemote(
            question = "Где вода стоит столбом?",
            answer = "В стакане"
        ),
        RiddleResponseRemote(
            question = "В каком году люди едят больше?",
            answer = "В високосном"
        ),
        RiddleResponseRemote(
            question = "Без чего не испечёшь хлеба?",
            answer = "Без корки"
        ),
        RiddleResponseRemote(
            question = "Какой город находится у лося на голове?",
            answer = "Кривой Рог"
        ),
        RiddleResponseRemote(
            question = "Каким городом можно вышивать?",
            answer = "Бисер"
        ),
        RiddleResponseRemote(
            question = "Можно ли прыгнуть выше девятиэтажки?",
            answer = "Можно, потому что девятиэтажки не могут прыгать"
        ),
        RiddleResponseRemote(
            question = "Из какого американского города можно сшить костюм?",
            answer = "Бостон"
        ),
        RiddleResponseRemote(
            question = "Какая река может укусить?",
            answer = "Медведица "
        ),
        RiddleResponseRemote(
            question = "Какой город может укусить?",
            answer = "Волчиха"
        ),
        RiddleResponseRemote(
            question = "Какая столица европейского государства стоит на мягкой подстилке?",
            answer = "Париж на Сене"
        ),
        RiddleResponseRemote(
            question = "О каком французском городе часто напоминают нам занавески на окнах?",
            answer = "Тюль"
        ),
        RiddleResponseRemote(
            question = "Что стоит посреди Волги? ",
            answer = "Буква л"
        ),
        RiddleResponseRemote(
            question = "Какая река плавает?",
            answer = "Гусь"
        ),
        RiddleResponseRemote(
            question = "В каком городе сушат снопы?",
            answer = "Рига"
        ),
        RiddleResponseRemote(
            question = "Какой город носят на голове?",
            answer = "Панама"
        ),
        RiddleResponseRemote(
            question = "Какой город два раза себя называет?",
            answer = "Яя"
        ),
        RiddleResponseRemote(
            question = "Какой город сделан из теста?",
            answer = "Калач"
        ),
        RiddleResponseRemote(
            question = "Какой остров летает?",
            answer = "Альбатрос"
        ),
        RiddleResponseRemote(
            question = "Какую реку можно «съесть»?",
            answer = "Балык"
        ),
        RiddleResponseRemote(
            question = "Какой город самый холодный",
            answer = "Зима"
        ),
        RiddleResponseRemote(
            question = "Какой город самый большой?",
            answer = "Гигант"
        ),
        RiddleResponseRemote(
            question = "Какие два города имеют названия охотничьих птиц?",
            answer = "Орёл, Сокол"
        ),
        RiddleResponseRemote(
            question = "Какой город применяют для упаковки товара?",
            answer = "Тара"
        ),
        RiddleResponseRemote(
            question = "Какой город живёт в реке?",
            answer = "Нельма"
        ),
        RiddleResponseRemote(
            question = "Какой город можно срезать ножом?",
            answer = "Ветка"
        ),
        RiddleResponseRemote(
            question = "В фамилии какого писателя и названии какой птицы присутствуют одни и те же буквы?",
            answer = "Гоголь"
        ),
        RiddleResponseRemote(
            question = "Как время года можно превратить в игру?",
            answer = "Лето-лото"
        ),
        RiddleResponseRemote(
            question = "Без какой буквы существуют воздушное пирожное?",
            answer = "Без «е» (безе)"
        ),
        RiddleResponseRemote(
            question = "Из какой буквы нужно выкинуть букву «а», чтобы получить название жилища?",
            answer = "Из «б» (изба)"
        ),
        RiddleResponseRemote(
            question = "Я не живу ни в Москве, ни в Минске, ни в Тбилиси, но люблю такие города, как Кустанай, Муром, Бугуруслан. Кто я?",
            answer = "Буква «У»"
        ),
        RiddleResponseRemote(
            question = "Сколько лет вам исполняется в этом году, если вы родились в 91-ом?",
            answer = "1920 лет"
        ),
        RiddleResponseRemote(
            question = "Какой полуостров говорит о своём размере?",
            answer = "Ямал"
        ),
        RiddleResponseRemote(
            question = "Какой вид шлюпки превратится в ноту, если её название прочесть наоборот?",
            answer = "Ял"
        ),
        RiddleResponseRemote(
            question = "Какими нотами можно разделить целое?",
            answer = "До-ля-ми"
        ),
        RiddleResponseRemote(
            question = "В каком пятибуквенном слове пять букв о?",
            answer = "Опять"
        ),
        RiddleResponseRemote(
            question = "Какое слово состоит из трёх одинаковых букв?",
            answer = "Трио"
        ),
        RiddleResponseRemote(
            question = "Кто на все руки мастер?",
            answer = "Перчаточник"
        ),
        RiddleResponseRemote(
            question = "В каких лесах нет дичи?",
            answer = "В строительных"
        ),
        RiddleResponseRemote(
            question = "Как по-другому можно назвать Филю из «Спокойной ночи, малыши»?",
            answer = "Простофиля (просто Филя)"
        ),
        RiddleResponseRemote(
            question = "Когда сутки короче: зимой или летом?",
            answer = "Одинаковы"
        ),
        RiddleResponseRemote(
            question = "Как по-французски сказать «пыль»?",
            answer = "Пудра"
        ),
        RiddleResponseRemote(
            question = "Какие две шоколадки вечно спорят друг с другом?",
            answer = "Сникерс (не тормози) и Твикс (следай паузу)"
        ),
        RiddleResponseRemote(
            question = "По порядку он девятый, а его название с латинского языка переводится как «седьмой». О чём речь?",
            answer = "Сентябрь"
        ),
        RiddleResponseRemote(
            question = "В названии какой конфеты чувствуется холод?",
            answer = "Леденец"
        ),
        RiddleResponseRemote(
            question = "Если в названии одной из планет Солнечной системы переставить буквы, то получится название столицы одной из стран СНГ. Какой?",
            answer = "Венера (Ереван)"
        ),
        RiddleResponseRemote(
            question = "В названии какой планеты спряталась нота?",
            answer = "ЗемЛЯ"
        ),
        RiddleResponseRemote(
            question = "В названии какой звезды спряталась нота?",
            answer = "СИриус, ПоЛЯрная "
        ),
        RiddleResponseRemote(
            question = "Какой молочный продукт приготовить проще всего, если судить по его названию?",
            answer = "Простокваша"
        ),
        RiddleResponseRemote(
            question = "В пути не встретить, а в дороге найти. В океане, в озере, даже в болоте увидишь, а в реке никогда",
            answer = "Буква «О»"
        ),
        RiddleResponseRemote(
            question = "Одно бросил, целую горсть взял. Что это?",
            answer = "Семя"
        ),
        RiddleResponseRemote(
            question = "Как можно снять колесо за одну секунду?",
            answer = "Фотоаппаратом"
        ),
        RiddleResponseRemote(
            question = "Сколько жирафов плавает в Чёрном море?",
            answer = "Жирафы не плавают"
        ),
        RiddleResponseRemote(
            question = "Что не существует, но имеет название?",
            answer = "Ничего"
        ),
        RiddleResponseRemote(
            question = "Какое женское имя можно записать как тридцать «Я»?",
            answer = "Зоя"
        ),





























        )

    )

    private val hardRiddles = listOf(
        RiddleResponseRemote(
            question = "Есть шестизарядный револьвер. В нем 2 пули, обе расположены рядом друг с другом. Ваш оппонент раскручивает барабан, приставляет дуло к виску и нажимает на курок. Выстрела не произошло. Как поступите вы: сразу нажмете на курок или сперва снова раскрутите барабан?",
                      answer = "Выгоднее не вращать барабан. Если провернуть барабан, то шанс на выпадение «боевого» гнезда составит 2 из 6 (33,3%), если же не вращать – 1 из 4 (25%)"
        ),
        RiddleResponseRemote(
            question = "У вас бесконечный запас воды и два ведра — на 5 литров и 3 литра.Как вы отмерите 4 литра?",
            answer = "Набираем 3-х литровое ведро и переливаем всю воду в пятилитровое ведро. Еще раз набираем 3-хлитровое ведро, переливаем в 5л-ведро до краев. В 3 л-ведре остается 1 литр воды. Затем 5 л-ведро выливаем. Из 3 л-ведра переливаем оставшийся 1 литр воды в 5 л-ведро. Набираем 3 л-ведро, переливаем в 5 л-ведро и получается 4 л воды."
        ),
        RiddleResponseRemote(
            question = "Купец купил 138 аршин черного и синего сукна за 540 руб. Спрашивается, сколько аршин он купил и того и другого, если синее стоило 5 руб. за аршин, а черное — 3 руб.?",
            answer = "Если бы купец приобрел сукно одного типа, например синее, то он заплатил бы 138*5 = 690 руб. Получается разница в 150 руб., потому что черное сукно выше в цене на 2 руб. Значит, черного сукна было 150:2 = 75 аршин, а синего было 138-75 = 63 аршина."
        ),
        RiddleResponseRemote(
            question = "Сводный отряд ветеранов готовится пройтись колонной на соответствующем празднике. Построились по двое. Один остался без пары. Нехорошо. Встали по трое. Опять один — сиротинушка. По четыре и по шесть — ясно, что неровно, но ведь опять один остаётся! Тогда по пять. Тот же результат! Наваждение. Уж для самоуспокоения построились по семеро. И вышло абсолютно ровно. Сколько же людей строилось?",
            answer = "301 человек, как минимум."
        ),
        RiddleResponseRemote(
            question = "Если вы умножите меня на любое другое число, ответ всегда останется прежним. Какой я номер?",
            answer = "0"
        ),
        RiddleResponseRemote(
            question = "Что правильно: 18 плюс 19 равно 36 или 18 плюс 19 равно 36?",
            answer = "Оба неверны, потому что 18 + 19 = 37"
        ),
        RiddleResponseRemote(
            question = "Вам даны 3 положительных числа. Использование сложения и умножения с числами даст вам тот же ответ. Какие числа?",
            answer = "1, 2 и 3."
        ),
        RiddleResponseRemote(
            question = "Когда 11 + 3 = 2?",
            answer = "На часах"
        ),
        RiddleResponseRemote(
            question = "Я трехзначное число. Моя вторая цифра в четыре раза больше третьей. Моя первая цифра на три меньше, чем вторая. Кто я?",
            answer = "141"
        ),
        RiddleResponseRemote(
            question = "Если есть три чашки сахара, и вы берете одну, сколько у вас есть?",
            answer = "Одна чашка"
        ),
        RiddleResponseRemote(
            question = "Две курицы могут отложить два яйца за две минуты. Если это максимально возможная скорость, какое общее количество кур нужно, чтобы получить 500 яиц за 500 минут?",
            answer = "Две курицы"
        ),
        RiddleResponseRemote(
            question = "У Рама пятеро сыновей, и у каждого сына есть сестра. Сколько детей у мистера Рама?",
            answer = "Шесть; у каждого сына одна и та же сестра"
        ),
        RiddleResponseRemote(
            question = "Что один учебник по математике говорит другому?",
            answer = "«У меня так много проблем»."
        ),
        RiddleResponseRemote(
            question = "Сложив восемь восьмерок, вы получите 1000. Как это возможно при использовании исключительно сложения?",
            answer = "888 + 88 + 8 + 8 + 8 = 1,000"
        ),
        RiddleResponseRemote(
            question = "Что можно поставить от семи до восьми, чтобы ответ был больше семи, но меньше восьми?",
            answer = "Десятичная точка"
        ),
        RiddleResponseRemote(
            question = "Гонки четверо друзей. Лиза финиширует на четыре часа раньше Тони, а Пит - на восемь часов впереди Макса. Макс нужно было на шесть часов больше, чем Лизе. В каком порядке они пересекают финишную черту?",
            answer = "Пит, Лиза, Тони и Макс"
        ),
        RiddleResponseRemote(
            question = "В турнире по баскетболу участвуют 16 игроков. Сколько игр нужно сыграть, прежде чем будет определен победитель?",
            answer = "Пятнадцать."
        ),
        RiddleResponseRemote(
            question = "Пекарь несет мешок с мукой весом 15 фунтов. Он достает половину муки, но обнаруживает, что мешок весит девять фунтов. Насколько тяжелый пустой мешок?",
            answer = "Три фунта"
        ),
        RiddleResponseRemote(
            question = "У меня есть две монеты на пятнадцать центов. Одна из них не никель, так что это за две монеты?",
            answer = "Десять центов и никель; один из них не никель, а один из них"
        ),
        RiddleResponseRemote(
            question = "Общий возраст отца и сына - 66 лет. Возраст отца - это возраст сына, но с обратными цифрами. Сколько им лет?",
            answer = "Есть три возможных ответа: 51 и 15, 42 и 24 или 60 и 06"
        ),
        RiddleResponseRemote(
            question = "Что особенного в числе 854 917 632?",
            answer = "Это цифры от одного до девяти в алфавитном порядке"
        ),
        RiddleResponseRemote(
            question = "Если вы находитесь на расстоянии восьми футов от двери и с каждым движением продвигаетесь к двери на половину расстояния. Сколько ходов нужно, чтобы добраться до двери?",
            answer = "Это никогда не будет достигнуто, потому что вы всегда будете на полпути"
        ),
        RiddleResponseRemote(
            question = "Тома попросили нарисовать количество табличек на 100 квартирах, что означает, что он должен будет нарисовать числа от 1 до 100. Можете ли вы подсчитать, сколько раз он должен нарисовать цифру восемь?",
            answer = "20 раз (8, 18, 28, 38, 48, 58, 68, 78, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 98)."
        ),
        RiddleResponseRemote(
            question = "Если 9999 = 4, 8888 = 8, 1816 = 3, 1212 = 0, то 1919 =?",
            answer = "1919 = 2. Эта проблема связана с закрытыми областями числа. Например, 9999 имеет четыре закрытых области (вершины девяток); 8888 имеет восемь закрытых областей (вершина восьмерок и вершина восьмерок). Таким образом, 1919 год имеет две закрытые зоны (вершины девятки)"
        ),
        RiddleResponseRemote(
            question = "Мой близнец живет напротив номера моего дома. Разница между номерами наших домов заканчивается двумя. Какими наименьшими возможными числами могут быть номера наших домов?",
            answer = "19 и 91"
        ),
        RiddleResponseRemote(
            question = "Я трехзначное число. Моя цифра десятков на шесть больше, чем моя цифра единиц. Моя цифра сотен на восемь меньше, чем моя цифра десятков. Какой я номер?",
            answer = "193"
        ),
        RiddleResponseRemote(
            question = "При отправке чего-либо Том может поместить в картонную коробку десять маленьких или восемь больших коробок. Всего за одну партию было отправлено 96 коробок, и количество маленьких коробок было меньше, чем больших коробок. Сколько коробок он отправил?",
            answer = "11 коробок"
        ),
        RiddleResponseRemote(
            question = "У смотрителя зоопарка было 100 пар животных. У каждого из первоначальных животных рождаются две пары детенышей, но, к сожалению, 23 животных не выживают. Сколько осталось?",
            answer = "977 животных (100 x 2 = 200; 200 x 4 = 800; 800 + 200 = 1000; 1000 - 23 = 977)"
        ),
        RiddleResponseRemote(
            question = "Определенное число состоит из трех цифр. Сумма трех цифр в 36 раз больше этого числа. Семикратная левая цифра плюс девять равна пятикратной сумме двух других цифр. Восемь раз вторая цифра минус девять равна сумме первой и третьей. Какой номер?",
            answer = "324"
        ),
        RiddleResponseRemote(
            question = "Можете ли вы расположить четыре девятки, чтобы получилось 100",
            answer = "99 + 9 / 9 = 100"
        ),
        RiddleResponseRemote(
            question = "Если вы видите, как электричка движется на восток со скоростью 70 миль в час, но дует западный ветер со скоростью 80 миль в час, в какую сторону будет дуть дым от поезда?",
            answer = "Это электричка, поэтому дыма нет"
        ),
        RiddleResponseRemote(
            question = "Если дни на Марсе равны двум неделям на Земле, сколько времени длится час?",
            answer = "14 земных часов"
        ),
        RiddleResponseRemote(
            question = "Кара уезжает из Нью-Йорка в 8 утра со скоростью 35 миль в час. Нэнси едет в Нью-Йорк со скоростью 50 миль в час. Когда они встретятся, какой из них будет дальше всего от Нью-Йорка?",
            answer = "Когда они встретятся, они будут на таком же расстоянии от Нью-Йорка"
        ),
        RiddleResponseRemote(
            question = "Учитель говорит, что в классе меньше 30 учеников, но больше 20 человек. Детей можно разделить на группы по два, три, четыре, шесть и восемь человек без остатка. Сколько учеников в классе?",
            answer = "24 студента"
        ),
        RiddleResponseRemote(
            question = "Семь братьев родились с разницей в два года. Младшему брату семь лет. Сколько лет старшему брату?",
            answer = "19"
        ),
        RiddleResponseRemote(
            question = "Что такое х? 1 + 4 = 5; 2 + 5 = 12; 3 + 6 = 21; 8 + 11 = х",
            answer = "х = 96; от (a + b) до (a + ab)"
        ),
        RiddleResponseRemote(
            question = "Всего восемь шаров с восемью разными числами: 1, 3, 5, 7, 9, 11, 13, 15. Выберите три шара, равных 30.",
            answer = "Переверните девятку и превратите ее в 6, и тогда три шара будут 6, 11 и 13"
        ),
        RiddleResponseRemote(
            question = "Можете ли вы составить 24 из чисел 3, 3, 8 и 8? Вы можете использовать только операции + - x / (). Вы должны использовать все четыре числа",
            answer = "8 / (3 – 8/3) = 24"
        ),
        RiddleResponseRemote(
            question = "А сколько нужно произвести действий, чтобы посадить жирафа в холодильник?",
            answer = "Четыре: открыть холодильник, достать бегемота, посадить жирафа, закрыть холодильник"
        ),
        RiddleResponseRemote(
            question = "Летели утки: одна впереди и две позади, одна позади и две впереди, одна между двумя и три в ряд. Сколько всего летело уток?",
            answer = "3"
        ),
        RiddleResponseRemote(
            question = "Про что всегда говорят в будущем времени?",
            answer = "Про завтра
        ),
        RiddleResponseRemote(
            question = "Блокнот стоил 60 рублей, книга стоит столько же плюс 1/3 к этой сумме. Вопрос: сколько стоит книга?",
            answer = "90 рублей"
        ),
        RiddleResponseRemote(
            question = "На сколько увеличиться дробь, если ее числитель будет увеличен на знаменатель",
            answer = "Увеличиться в 1 раз"
        ),
        RiddleResponseRemote(
            question = "10 рабочих роют яму за 10 часов, выкапывают 10 метров ямы. Сколько рабочих понадобиться, чтобы выкопать 100 метров за 100 часов",
            answer = "10"
        ),
        RiddleResponseRemote(
            question = "3 птицы ловят за 1 минуту каждая по одной мухе, но за три минуты, у них получается поймать 3 мухи. Сколько нужно птиц, чтобы поймать за 1 час 60 мух.",
            answer = "3 птицы"
        ),
        RiddleResponseRemote(
            question = "Как с помощью пяти двоек записать число 11, используя при этом все имеющиеся в математике знаки математических действий?",
            answer = "(22/2 + 2 - 2)"
        ),
        RiddleResponseRemote(
            question = "Сколько градусов имеют углы равнобедренного треугольника?",
            answer = "90, 45, 45"
        ),
        RiddleResponseRemote(
            question = "Сколько градусов у круга?",
            answer = "Ключ"
        ),
        RiddleResponseRemote(
            question = "Что может пройти через стены и двери, но никогда не может войти?",
            answer = "360"
        ),
        RiddleResponseRemote(
            question = "Сколько градусов имеют углы квадрата?",
            answer = "90"
        ),
        RiddleResponseRemote(
            question = "У Вани есть 4 брата и 2 сестры — Катя и Света. Вопрос: сколько братьев и сестер у Светы?",
            answer = "5 братьев и 1 сестра"
        ),
        RiddleResponseRemote(
            question = "Вадим пошел по грибы, идя по лесу, он находил по одному грибу каждые 50 метров, в итоге к концу прогулки у него в корзинке было 25 грибов. Какое расстояние прошел Вадим.",
            answer = "1250 метров"
        ),
        RiddleResponseRemote(
            question = "Король пригласил для участия в турнире 15 бравых рыцарей, перед началом турнира все они отдали друг другу воинские почести. Сколько приветствий было всего отдано ими друг другу?",
            answer = "105"
        ),
        RiddleResponseRemote(
            question = "Каждый День рождения сын получал от родителей по одной книге, последнюю он получил после окончания института, прибавив ее к пяти уже имеющимся у него. Сколько лет сыну, и какого числа он родился.",
            answer = "24 года, 29 февраля"
        ),
        RiddleResponseRemote(
            question = "К реке подходят два человека. У берега лодка, которая может выдержать только одного. Оба человека переправились на противоположный берег. Как?",
            answer = "Они были на разных берегах"
        ),
        RiddleResponseRemote(
            question = "У кого усы длиннее ног?",
            answer = "У таракана"
        ),
        RiddleResponseRemote(
            question = "Знаменитый фокусник говорит, что может поставить бутылку в центре комнаты и вползти в нее. Как это?",
            answer = "Вползти в комнату может каждый"
        ),
        RiddleResponseRemote(
            question = "Что идет то в гору, то с горы, но остается на месте?",
            answer = "Дорога"
        ),
        RiddleResponseRemote(
            question = "Где встречается такое, что конь через коня перепрыгивает?",
            answer = "В шахматах"
        ),
        RiddleResponseRemote(
            question = "У отца Мэри есть 5 дочерей: Чача, Чичи, Чече, Чочо. Как зовут 5 дочь?",
            answer = "Мэри"
        ),
        RiddleResponseRemote(
            question = " Стоит богатый дом и бедный. Они горят. Какой дом будет тушить полиция?",
            answer = "Полиция не тушит пожары"
        ),
        RiddleResponseRemote(
            question = "Что может быть в пустом кармане?",
            answer = "Дырка"
        ),
        RiddleResponseRemote(
            question = "Что делает охранник, когда у него на берете сидит воробей?",
            answer = "Спит"
        ),
        RiddleResponseRemote(
            question = "У директора школы есть брат Николай. Но у Николая нет братьев. Может ли такое быть?",
            answer = "Да, если директор школы женщина"
        ),
        RiddleResponseRemote(
            question = "У Матвея было 9 конфет. Он отдал брату конфет на одну больше, чем оставил себе. Сколько конфет оставил себе Матвей?",
            answer = "Матвей оставил себе 4 конфеты"
        ),
        RiddleResponseRemote(
            question = "Маша собрала в огороде 4 огурца, 5 помидоров и 1 свеклу. Сколько собрала Маша овощей в огороде?",
            answer = "Маша собрала в огороде 10 овощей"
        ),
        RiddleResponseRemote(
            question = "Миша задумал число. Если от числа отнять 4, то останется столько же. Какое число задумал Миша?",
            answer = "Миша задумал число 8"
        ),
        RiddleResponseRemote(
            question = "На двух ветках поровну сидели сороки. На первой ветке сидело 2 сороки. Сколько сорок сидело на двух ветках?",
            answer = "На двух ветках сидело 4 сороки"
        ),
        RiddleResponseRemote(
            question = "На кусте малины было 9 зеленых ягод, 3 ягоды поспели, и их сорвал Паша. Сколько ягод малины осталось на кусте малины?",
            answer = "Осталось на кусте малины 6 ягод"
        ),
        RiddleResponseRemote(
            question = "Cтроители построили 3 дома. Всего по планам строителей построить 9 домов. Сколько домов осталось построить строителям?",
            answer = "Строителям осталось построить 6 домов"
        ),
        RiddleResponseRemote(
            question = "У Тани было 6 слив. 1 сливу Таня отдала Марине, и у них стало поровну слив. Сколько слив было у Марины вначале??",
            answer = "У Марины вначале было 4 сливы"
        ),
        RiddleResponseRemote(
            question = "На день рождения папа и мама подарили Мише подарки. Мама подарила 3 книжки, а папа подарил 5 солдатиков. Сколько всего подарков у Миши?",
            answer = "У Миши 8 подарков"
        ),
        RiddleResponseRemote(
            question = "Саша старше Вити на 3 года, Саша младше Феди на 2 года. На сколько лет Федя старше Вити?",
            answer = "Федя старше Вити на 5 лет"
        ),
        RiddleResponseRemote(
            question = "Маша старше брата на 3 года. На сколько лет Маша будет старше брата через 5 лет?",
            answer = "Через 5 лет Маша будет старше брата на 3 года"
        ),
        RiddleResponseRemote(
            question = "Антон помогал маме и перевозил сумки на велосипеде. За один раз Антон мог увезти не более трех сумок. Сколько раз надо приехать Антону, чтобы перевезти 8 сумок?",
            answer = "Антону надо приехать 3 раза"
        ),
        RiddleResponseRemote(
            question = "В школьном классе делали уборку 7 девочек и 4 мальчика. Маша, Таня и Антон ушли домой. Сколько девочек осталось в классе?",
            answer = "В классе осталось 5 девочек"
        ),
        RiddleResponseRemote(
            question = "В корзине было 15 яблок, 2 яблока Аня дала Саше. Сколько яблок осталось в корзине?",
            answer = "В корзине осталось 13 яблок"
        ),
        RiddleResponseRemote(
            question = "Имя какой сказочной героини походит от единицы измерения длины?",
            answer = "Имя какой сказочной героини походит от единицы измерения длины?"
        ),
        RiddleResponseRemote(
            question = "Какая геометрическая фигура подрабатывает гимнастическим снарядом в цирке?",
            answer = "Трапеция, ромб, круг, прямоугольник"
        ),
        RiddleResponseRemote(
            question = "Какая цифра всегда катается в электричке?",
            answer = "Три — элекТРИчк"
        ),
        RiddleResponseRemote(
            question = "Назовите музыкальную единицу измерения длины",
            answer = "Ми-ля"
        ),
        RiddleResponseRemote(
            question = " Какие геометрические фигуры есть у каждого во рту?",
            answer = "Углы (рта)"
        ),
        RiddleResponseRemote(
            question = "Какую математическую фигуру носят мужчины на голове?",
            answer = "Цилиндр"
        ),
        RiddleResponseRemote(
            question = "Какую форму имеют пчелиные соты?",
            answer = "Форму правильного шестиугольника"
        ),
        RiddleResponseRemote(
            question = "Составление карты какой страны получило название «большое тригонометрическое исследование»?",
            answer = "Индии (она на карте напоминает треугольник"
        ),
        RiddleResponseRemote(
            question = "Какие геометрические фигуры дружат с солнцем?",
            answer = "Лучи"
        ),
        RiddleResponseRemote(
            question = "Какие две буквы сделают каждое ребро геометрического тела драгоценным?",
            answer = " С и Е: СЕребро."
        ),
        RiddleResponseRemote(
            question = "Какое число можно найти в автомобильном бензобаке?",
            answer = "Октановое"
        ),
        RiddleResponseRemote(
            question = "На какой фигуре основана каждая снежинка?",
            answer = "Любая снежинка – это шестиугольник, или гексагон"
        ),
        RiddleResponseRemote(
            question = "Какие цифры рисуют в небе летчики?",
            answer = "Восьмерки"
        ),
        RiddleResponseRemote(
            question = "Какой европейский город украшает памятник нолю?",
            answer = "Будапешт"
        ),
        RiddleResponseRemote(
            question = "Какие «математические растения» Тебе известны?",
            answer = "Тысячелетник, золототысячник, столетник."
        ),
        RiddleResponseRemote(
            question = "Как называется цифра в классном журнале?",
            answer = "Отметка, балл"
        ),
        RiddleResponseRemote(
            question = "Какие «цифры» можно одеть на себя?",
            answer = "Костюм-двойку, костюм-тройку, костюм-четверку"
        ),
        RiddleResponseRemote(
            question = "Без чего не обойтись барабанщикам, охотникам и математикам?",
            answer = "Без дроби"
        ),
        RiddleResponseRemote(
            question = "Чем отличается один вагон от другого с точки зрения математика?"
            answer = "Номером"
        ),
        RiddleResponseRemote(
            question = "ЧНазовите мужские имена «математического» происхождения",
            answer = "Константин (от латинского слова «constant» — постоянный) и Максим (от латинского «maximus» — самый большой)."
        ),
        RiddleResponseRemote(
            question = "В каком слове помещается целый метр букв «о»? ",
            answer = "В слове «метро»."
        ),
        RiddleResponseRemote(
            question = "Какая страна прячется в математическом выражении а?",
            answer = "Куб А — Куба."
        ),
        RiddleResponseRemote(
            question = "Что есть в каждом слове, растении и уравнении?",
            answer = "Корень"
        ),
        RiddleResponseRemote(
            question = "На вывеске какого предприятия можно прочитать цифру «сто»?",
            answer = "Станция технического обслуживания — СТО"
        ),
        RiddleResponseRemote(
            question = "Какая домашняя птица хорошо знает и постоянно повторяет единицу измерения земли и равную 10 000 квадратных метров?",
            answer = "Гусь"
        ),
        RiddleResponseRemote(
            question = "Итак, можете ли вы установить, по какому принципу выстроена данная последовательность : 8 2 9 0 1 5 7 3 4 6",
            answer = "Все цифры следуют друг за другом в соответствии с алфавитным порядком их названий (восемь, два, девять, ноль и т.д.)."
        ),
        RiddleResponseRemote(
            question = "Как вы думаете, что ваши друзья и знакомые используют чаще чем вы, но это является вашей собственностью?",
            answer = "Ваше имя. Именно друзья и знакомые, при обращении к вам, используют ваше имя, но вы его используете сами гораздо реже."
        ),
        RiddleResponseRemote(
            question = "Если вы это имеете, то имеете полную часть. Если же вы этим с кем-то поделитесь, то оно исчезнет совсем?",
            answer = "Это секрет. Если вы им с кем-то поделитесь, то это уже не будет секретом и он автоматически исчезает сам по себе."
        ),
        RiddleResponseRemote(
            question = "Как спрыгнуть с десятиметровой лестницы и не ушибиться?",
            answer = "Нужно прыгать с нижней ступени"
        ),
        RiddleResponseRemote(
            question = "С виду — клин, а развернешь — блин",
            answer = "Зонт"
        ),
        RiddleResponseRemote(
            question = "У фермера было стадо из восьми овец: три белые, четыре черные, одна коричневая. Сколько овец могут ответить, что в стаде есть хотя бы одна овца такой же масти, как её?",
            answer = "Ни одна, овцы не разговаривают)"
        ),
        RiddleResponseRemote(
            question = "В каком случае число 1322 меньше 622?",
            answer = "Года до нашей эры"
        ),
        RiddleResponseRemote(
            question = "Языка нет, а правду скажет",
            answer = "Зеркало"
        ),
        RiddleResponseRemote(
            question = "Когда человек находится дома без головы?",
            answer = "Когда выглядывает из форточки"
        ),
        RiddleResponseRemote(
            question = "Что больше: сумма всех цифр или их произведение?",
            answer = "Больше сумма, так как произведение равно 0 (один из множителей — это цифра 0)"
        ),
        RiddleResponseRemote(
            question = "Что стоит посреди Земли?",
            answer = "Буква «М»"
        ),
        RiddleResponseRemote(
            question = "Что это такое: синий, большой, с усами и полностью набит зайцами?",
            answer = "Троллейбус"
        ),
        RiddleResponseRemote(
            question = "6636 — 3, 8118 — 4, 2242 — 0, 3316 — ?",
            answer = "На месте знака вопроса должна стоять цифра 1. Для получения правильного ответа нужно посчитать количество кружочков в цифрах слева и написать полученный результат справа"
        ),
        RiddleResponseRemote(
            question = "В игре, которая длится 15 минут, участвуют 36 игроков, из которых 4 — запасные. Запасные поочередно заменяют каждого игрока, так что все играющие проводят на площадке одинаковое время. Какое?",
            answer = "~13,33 минуты: (15 × 32) / 36 = 13,33333"
        ),
        RiddleResponseRemote(
            question = "Напишите десятизначное число так, чтобы: первая цифра означала количество единиц в нем, вторая цифра означала количество двоек, третья цифра означала количество троек, и так далее до десятой цифры, которая означает количество нулей.",
            answer = "Получается число 2100010006"
        ),
        RiddleResponseRemote(
            question = "Какое число должно идти дальше в этом ряду? 1, 8, 70, 627, 5639, …",
            answer = "50 746. Пояснение: 1 × 9 − 1 = 8; 8 × 9 − 2 = 70; 70 × 9 − 3 = 627; 627 × 9 − 4 = 5 639; 5 639 × 9 − 5 = 50 746"
        ),
        RiddleResponseRemote(
            question = "Каков седьмой член последовательности, которая начинается так: 6, −4, 8/3, ..., ..., ..., …?",
            answer = "Всякий раз имеет место умножение на (−2/3), например, 6 × (−2/3) = −4. Нам нужен седьмой член, т. е. 6 × (−2/3)6 ≈ 6 × 0,0878 ≈ 0,5268."
        ),
        RiddleResponseRemote(
            question = "Что должно стоять на месте пропуска? 100, 97, 84, 67, 53, 41, 32, 21, …",
            answer = "9. Решение: из каждого числа вычитается число букв в нем. Поэтому ряд продолжается так: 9, 3, 0, −4, −15, ..."
        ),
        RiddleResponseRemote(
            question = "Кто может бриться 25 раз в день, но иметь бороду?",
            answer = "Парикмахер"
        ),
        RiddleResponseRemote(
            question = "Жена стреляет в мужа, затем держит его под водой в течение пяти минут. Наконец-то она вешает его. Но через пять минут они вместе наслаждаются отличным ужином. Как это может быть?",
            answer = "Жена-фотограф"
        ),
        RiddleResponseRemote(
            question = "Женщина пришла на обследование к врачу, она была сестрой врача. Но врач не являлся братом женщины. Кем он ей приходился?",
            answer = "Сестрой"
        ),
        RiddleResponseRemote(
            question = "Семь сестер находятся на даче, где каждая занята каким-нибудь делом. Первая читает книгу, вторая — готовит еду, третья — играет в шахматы, четвертая — разгадывает судоку, пятая — занимается стиркой, шестая — ухаживает за растениями. А чем занимается седьмая сестра?",
            answer = "Играет в шахматы с третьей сестрой."
        ),
        RiddleResponseRemote(
            question = "Бизнесмен купил лошадь за $10, продал ее за $20. Потом он купил ту же лошадь за $30, а продал за $40. Какова суммарная прибыль бизнесмена от этих двух сделок?",
            answer = "$20"
        ),
        RiddleResponseRemote(
            question = "В пустыне лежит мертвый человек. За плечами мешок, на поясе фляга с водой. На многие километры вокруг нет ни одной живой души. От чего умер человек и что в его мешке?",
            answer = "Он умер от удара о землю, а в мешке — нераскрывшийся парашют."
        ),
        RiddleResponseRemote(
            question = "Дэвид и Фабиан играют в шахматы. У них пять игр, но оба выиграли три. Как это возможно?",
            answer = "Они играют с большим количеством людей, а не только друг с другом"
        ),
        RiddleResponseRemote(
            question = "Вы стоите перед тремя выключателями. За непрозрачной стеной три лампочки в выключенном состоянии. Вам нужно произвести манипуляции с выключателями, зайти в комнату и определить, к какой лампочке относится каждый выключатель.",
            answer = "Сначала нужно включить два выключателя. Через какое-то время один из них выключить. Зайти в комнату. Одна лампочка будет горячая от включенного выключателя, вторая – теплая от выключенного, третья – холодная, от нетронутого выключателя"
        ),
        RiddleResponseRemote(
            question = "Как наполнить бочку ровно на одну половину, не используя измерительных приборов?",
            answer = "Наклонить бочку и лить, пока она в горизонтальном положении не заполнится, чтобы было видно начало дна, и не будет касаться края"
        ),
        RiddleResponseRemote(
            question = "Сказочному гному еженощно нужна новая свеча, которой он светит себе в дороге,ходя по городу. Он может сделать 1 новую свечу из 5 свечных огарков. Если у него наберется 25 огарков, то на сколько ночей ему хватит запаса новых свечей?",
            answer = "На 6 ночей. Он сможет сделать 5 новых свеч из 25 огарков, а когда они сгорят, он может сделать шестую из тех 5 огарков, что от них останутся"
        ),
        RiddleResponseRemote(
            question = "Однажды один коллекционер старинных денег увидел в антикварном магазине монету, на которой стояла дата — 175-й год до нашей эры. Эта римская монета стоила она не очень дорого. Но коллекционер ее не купил. Почему?",
            answer = "Коллекционер понял, что у него в руках подделка, так как мастер, который изготовил монету, не знал, что живет «до нашей эры»"
        ),
        RiddleResponseRemote(
            question = "Хозяйке необходимо испечь 6 пирожков. Как ей справиться за 15 минут, если на сковороде помещается только 4 пирожка, а с каждой стороны пирожок должен печься 5 минут?",
            answer = "1) кладем 4 пирожка; 2) 2 пирожка переворачиваем, 2 снимаем, кладем 2 новых; 3) 2 готовых убираем, 2 переворачиваем и переворачиваем 2 убранных ранее"
        ),
        RiddleResponseRemote(
            question = "Ползут 3 черепахи.1-я черепаха говорит: за мной ползут две черепахи. 2-я черепаха говорит: за мной ползёт одна черепаха и передо мной ползёт одна черепаха. А 3-я черепаха: передо мной ползут две черепахи, и за мной ползёт одна черепаха. Как такое может быть?",
            answer = "Черепахи ползут по кругу"
        ),
        RiddleResponseRemote(
            question = "На ферме было 2 коня, 1 кролик, 1 щенок, 1 кошка, свинья и поросенок, корова и теленок, индюк и гусь. Пришел Хозяин с собакой. Сколько на ферме стало ног?",
            answer = "2"
        ),
        RiddleResponseRemote(
            question = "Где впервые был обнаружен картофель?",
            answer = "В земле"
        ),
        RiddleResponseRemote(
            question = "Василию, Петру, Семену и их женам Наталье, Ирине, Анне вместе 151 год. Каждый муж старше за свою жену на 5 лет. Василий на 1 год старше Ирины. Наталье и Василию вместе 48 лет, Семену и Наталье вместе 52 года. Кто на ком женат, и сколько кому лет? (Возраст должен быть выражен в целых числах).",
            answer = "Василий (26) — Анна (21); Петр (27) — Наталья (22); Семен (30) — Ирина (25)"
        ),
        RiddleResponseRemote(
            question = "Ничего не пишите и не используйте калькулятор. Возьмите 1000. Прибавьте 40. Прибавьте еще тысячу. Прибавьте 30. Еще 1000. Плюс 20. Плюс 1000. И плюс 10. Что получилось?"
            answer = "4100"
        ),
        RiddleResponseRemote(
            question = "Два пятиклассника Петя и Алёнка идут из школы и разговаривают. — Когда послезавтра станет вчера, — сказал один из них, — то сегодня будет так же далеко от воскресенья, как и тот день, который был сегодня, когда позавчера было завтра. В какой день недели они разговаривали?",
            answer = "Воскресенье"
        ),
        RiddleResponseRemote(
            question = "В автобусе ехали 20 человек. На первой остановке вышли 2 и вошли 3 человека, на следующей — 1 вышел и 4 вошли, на следующей — 5 вышли и 2 вошли, на следующей — 2 вышли и 1 вошел, на следующей — 9 вышли и никто не вошёл, на следующей — ещё 2 вышли. Вопрос: сколько было остановок?",
            answer = "6"
        ),
        RiddleResponseRemote(
            question = "На березе росло 90 яблок. Подул сильный ветер, и 10 яблок упало. Сколько осталось?",
            answer = "На березе яблоки не растут"
        ),
        RiddleResponseRemote(
            question = "Паша засунул в бутылку монетку и заткнул бутылку пробкой. Затем он достал монетку, не вынимая пробки и не разбивая бутылки. Догадайтесь, как он это сделал.",
            answer = "Он протолкнул пробку внутрь бутылки"
        ),
        RiddleResponseRemote(
            question = "Вите и Сереже купили по коробке конфет. В каждой коробке лежит 12 конфет. Витя из своей коробки съел несколько штук, а Сережа из своей съел столько, сколько осталось в коробке у Вити. Отгадайте, сколько конфет осталось на двоих у Вити и Сережи.",
            answer = "12 конфет"
        ),
        RiddleResponseRemote(
            question = "Один мальчик любил похвастаться тем, что он задерживает дыхание под водой на 3 минуты. Его друг сказал, что он может провести под водой и 10 минут без специальных приспособлений. Первый мальчик не поверил и предложил ему пари. Второй мальчик согласился и выиграл спор. Объясните, каким образом он победил.",
            answer = "Мальчик заполнил стакан водой, поставил его себе на голову и держал на протяжении 10 минут"
        ),
        RiddleResponseRemote(
            question = "Позавчера Илье было 17 лет. В следующем году ему будет 20 лет. Догадайтесь, как такое возможно.",
            answer = "Если сегодня — 1 января, а День Рождения у Ильи 31 декабря. В этом случае позавчера то есть 30 декабря ему было еще 17 лет, вчера то есть 31 декабря исполнилось 18 лет, в нынешнем году исполнится 19 лет, а в следующем году — 20 лет"
        ),
        RiddleResponseRemote(
            question = "Я есть бездна без воды, горы без земли и небо без воздуха. Что я?",
            answer = "Карта"
        ),
        RiddleResponseRemote(
            question = "Я есть всегда, но никогда не говорю. Меня никто не видит, но все знают, что я здесь. Что я ",
            answer = "Воображение"
        ),
        RiddleResponseRemote(
            question = "Я ползаю по земле в одежде без пуговиц. Кто я?",
            answer = "Червь"
        ),
        RiddleResponseRemote(
            question = "Жила-была в чаще одна девочка-сирота, у нее были только два котенка, два щенка, три попугая, черепаха и хомяк. Решила она сходить живности за кормом. Идет она лесом, полем, лесом, полем. Пришла она к магазину, но кормов там никаких нет. Пошла она обратно домой. И упала девочка в яму. Если она вылезет, умрет папа. Если останется там, умрет мама. Туннель копать нельзя. Что ей делать?",
            answer = "Спокойно выбираться, она сирота"
        ),
        RiddleResponseRemote(
            question = "В один день в одном роддоме родились 2 мальчика. Их родители переехали в один и тот же дом. Жили мальчики на одной и той же лестничной площадке, пошли в одну и ту же школу, в один и тот же класс. Но они никогда не видели друг друга. Как это может быть?",
            answer = "Они родились слепыми"
        ),
        RiddleResponseRemote(
            question = "Если она стоит, ее можно легко сосчитать. А если ее положить, за всю жизнь не сосчитаешь.",
            answer = "Цифра 8 и знак бесконечности"
        ),
        RiddleResponseRemote(
            question = "В одной семье 4 человека и их суммарный возраст – 68 лет, но 4 года назад этот возраст был 53. Сколько лет самому младшему из этой семьи?",
            answer = "3 года"
        ),
        RiddleResponseRemote(
            question = "В каком случае две ноги одной и той же лошади могут пройти 15 км, а две другие 15,5?",
            answer = "Когда лошадь идет по кругу"
        ),
        RiddleResponseRemote(
            question = "Два мальчика играли в темном и грязном подвале. Когда они вышли на свет, лицо у одного из них было грязное, а у другого – чистое. Вдруг мальчик с чистым лицом побежал умываться, а мальчик с грязным лицом продолжал беззаботно играть. Почему?",
            answer = "Они посмотрели друг на друга и подумали, что у них одинаковые лица"
        ),
        RiddleResponseRemote(
            question = "На столе лежали линейка, циркуль, резинка и карандаш. Ученику на листе бумаги было задано начертить окружность, затем прямую линию. С чего он должен начать?",
            answer = "Раздобыть лист бумаги"
        ),
        RiddleResponseRemote(
            question = "Из леса вылетели 3 птицы на одинаковой скорости. Определить время, когда птицы окажутся в одной плоскости?",
            answer = "3 точки находятся всегда в одной плоскости, поэтому мгновенно"
        ),
        RiddleResponseRemote(
            question = "Собаке к хвосту привязали сковородку. С какой скоростью ей надо бежать, чтобы она не слышала грохота сковородки?",
            answer = "Ей надо стоять"
        ),
        RiddleResponseRemote(
            question = "Ползут 3 черепахи.1-я черепаха говорит: за мной ползут две черепахи. 2-я черепаха говорит: за мной ползёт одна черепаха и передо мной ползёт одна черепаха. А 3-я черепаха: передо мной ползут две черепахи, и за мной ползёт одна черепаха",
            answer = "Черепахи ползут по кругу!"
        ),
        RiddleResponseRemote(
            question = "Крылья есть, а не летает. Ног нет, а не догонишь. Кто это?",
            answer = "Рыба"
        ),
        RiddleResponseRemote(
            question = "Кланяется, кланяется. Придёт домой — растянется.",
            answer = "Топор"
        ),
        RiddleResponseRemote(
            question = "Стучит, гремит, вертится, ходит весь свой век, а не человек.",
            answer = "Часы"
        ),
        RiddleResponseRemote(
            question = "Звенит, плюёт, взад-вперёд идёт. Что в зубы возьмёт, на две части разоймёт",
            answer = "Пила"
        ),
        RiddleResponseRemote(
            question = "Меня одну не едят, а без меня мало едят.",
            answer = "Соль"
        ),
        RiddleResponseRemote(
            question = "Что общего найдёшь у дерева и книжки?",
            answer = "Листья"
        ),
        RiddleResponseRemote(
            question = "Брат с сестрою рядом живут, а друг от друга как враги бегут.",
            answer = "День и ночь"
        ),
        RiddleResponseRemote(
            question = "Кручу, бурчу. Знать никого не хочу?",
            answer = "Вьюга"
        ),
        RiddleResponseRemote(
            question = "Мал пузырёк, как звезда огонёк",
            answer = "Лампочка"
        ),
        RiddleResponseRemote(
            question = "Сочная и золотая меж зелени мелькает, а во рту так и тает",
            answer = "Груша"
        ),
        RiddleResponseRemote(
            question = "Кричит горлан через море-океан — получает ответ через целый свет",
            answer = "Радио"
        ),
        RiddleResponseRemote(
            question = "Две головы, шесть ног. А едет на четырёх",
            answer = "Всадник на коне"
        ),
        RiddleResponseRemote(
            question = "У чего нельзя найти ни конца, ни начала?",
            answer = "Круг"
        ),
        RiddleResponseRemote(
            question = "Есть всегда у кораблей и, конечно, у людей.",
            answer = "Нос"
        ),
        RiddleResponseRemote(
            question = "Как написать «сухая трава» с помощью четырех букв?",
            answer = "Сено"
        ),
        RiddleResponseRemote(
            question = "Вся хрипит, чихает Лада: Съела много…",
            answer = "Мороженого"
        ),
        RiddleResponseRemote(
            question = "Что находится между долиной и горой?",
            answer = "Буква И"
        ),
        RiddleResponseRemote(
            question = "За чем во рту язык?",
            answer = "За зубами"
        ),
        RiddleResponseRemote(
            question = "Синим лаком захотела я себе покрасить…",
            answer = "Ногти"
        ),
        RiddleResponseRemote(
            question = "Одно яйцо варится три минуты. Сколько минут будут вариться два яйца?",
            answer = "Также три минуты"
        ),
        RiddleResponseRemote(
            question = "Два мальчика и девочка шли домой под одним зонтом, но никто из них не промок. Почему?",
            answer = "Потому что дождя не было"
        ),
        RiddleResponseRemote(
            question = "Мурлычет, как кошка, но это – не кошка. А, кто же это?",
            answer = "Кот"
        ),
        RiddleResponseRemote(
            question = "Какие местоимения мостовые портят?",
            answer = "я-мы"
        ),
        RiddleResponseRemote(
            question = "Кто ответ нам дать готов: с головой, но без мозгов?",
            answer = "Лук"
        ),
        RiddleResponseRemote(
            question = "Два мальчика шли, копеечку нашли. Сколько денежек найдут, если девочки пойдут?",
            answer = "Ни сколько"
        ),
        RiddleResponseRemote(
            question = "Весь день стоят на улице, прохожим улыбаются. Их служба начинается, когда уже смеркается.",
            answer = "Фонари уличные"
        ),
        RiddleResponseRemote(
            question = "Один брат ест и голодает, а другой – идёт и пропадает",
            answer = "Огонь и дым"
        ),
        RiddleResponseRemote(
            question = "С какой птицы нужно ощипать перья, чтобы получились сразу утро, день, вечер и ночь?",
            answer = "С утки"
        ),
        RiddleResponseRemote(
            question = "Что такое черное, когда она чистая, и белая, когда она грязная?",
            answer = "Школьная доска"
        ),
        RiddleResponseRemote(
            question = "Представьте, что вы плывёте по морю в лодке. Вдруг лодка начинает тонуть, вы оказываетесь в воде, к вам подплывают акулы. Что сделать, чтобы спастись от акул?",
            answer = "Перестань фантазировать на эту тему"
        ),
        RiddleResponseRemote(
            question = "Как правильно? Пять плюс семь будет «одиннадцать» или «адиннадцать»?",
            answer = "12"
        ),
        RiddleResponseRemote(
            question = "В комнате было двенадцать цыплят, три кролика, пять щенят, две кошки, один петух и две курицы. Сюда зашёл хозяин с собакой. Сколько в комнате стало ног?",
            answer = "Только две, остальные лапы"
        ),
        RiddleResponseRemote(
            question = "Могут ли на яблоне быть яйца?",
            answer = "Да, в птичьем гнезде"
        ),
        RiddleResponseRemote(
            question = "Шла женщина в Москву, а навстречу – три мужика. У каждого по мешку, в каждом мешке по кошке. Сколько существ направлялось в Москву?",
            answer = "Одна женщина"
        ),
        RiddleResponseRemote(
            question = "Как 2 литра молока поместить в литровую банку?",
            answer = "Сделать творог"
        ),
        RiddleResponseRemote(
            question = "Без окон и дверей, в нем ничего нет, но он может пролить свет. Что это?",
            answer = "Ящик спичек"
        ),
        RiddleResponseRemote(
            question = "Кто может ходить по воде, но не плавает?",
            answer = "Лед"
        ),
        RiddleResponseRemote(
            question = "У него есть лицо, но он не может говорить. Он наблюдает вас каждый день. Что это?",
            answer = "Зеркало"
        ),
        RiddleResponseRemote(
            question = "Вы входите в старый заброшенный дом с привидениями. В нем нет ни электричества, ни водопровода. Оказавшись внутри, вы видите перед собой три двери. На каждой двери есть номер. За каждой дверью есть один способ умереть. За дверью номер один вы погибнете, потому что там лев и он вас съест. За дверью номер два вы умрете, потому что там зомби и он на вас нападет. За дверью номер три вы умрете на электрическом стуле. У вас нет возможности повернуть назад, поэтому вам нужно обязательно пройти через какую-нибудь дверь. Через какую дверь вы пройдете?",
            answer = "Дверь номер три — в доме нет электричества, значит, электрический стул не сработает"
        ),
        RiddleResponseRemote(
            question = "Два отца и двое их сыновей вместе отправляются на рыбалку. Каждый ловит по одной рыбе и забирает улов домой. Когда они возвращаются домой, у них с собой только три рыбы. Как это возможно?",
            answer = "На рыбалке было всего трое — дедушка, его сын и внук"
        ),
        RiddleResponseRemote(
            question = "Дарья рассказывает своим друзьям историю и просит их угадать, правда это или ложь: «Ночью в доме, в котором совсем не горел свет, сидел мужчина. Не было ни лампы, ни свечи, ни другого источника света. Тем не менее он сидел дома и с удовольствием читал свою книгу». Ее друзья говорят, что такого не может быть и это ложь. Но девушка утверждает, что она говорит правду. История Дарьи правдива, но как это возможно?",
            answer = "В истории девушки мужчина слеп и читает книгу со шрифтом Брайля"
        ),
        RiddleResponseRemote(
            question = "Что человек любит больше, чем жизнь, и ненавидит больше, чем смерть; то, чего хотят удовлетворенные люди; бедные имеют, а богатые нуждаются; скряга тратит, расточитель копит, а все уносят в могилу?",
            answer = "Ничего"
        ),
        RiddleResponseRemote(
            question = "Рассказывает капитан корабля:«Я проплыл океаны вдоль и поперек. Однажды двое моих матросов стояли по разные стороны корабля. Один смотрел на запад, другой на восток. И в то же время они могли ясно видеть друг друга». Не могли бы вы рассказать мне, как это было возможно?",
            answer = "Моряки стояли спиной к бортам корабля так, что смотрели друг на друга."
        ),
        RiddleResponseRemote(
            question = "Врач дает пациенту три таблетки и говорит принимать по одной каждые полчаса. Сколько времени пройдет к тому времени, когда больной примет все три таблетки?",
            answer = "Один час. Одну таблетку он выпьет сразу, вторую — через полчаса и еще через 30 минут примет третью."
        ),
        RiddleResponseRemote(
            question = "Женщина хочет войти в тайный закрытый клуб, но не знает пароля. И тут она видит, как один мужчина подходит к двери, и слышит, как охранник говорит 12, а мужчина говорит 10, и его впускают. Через минуту ко входу подходит другой человек, и секьюрити говорит 6, а мужчина говорит 5, и его тоже впускают. Девушка подумала, что она поняла смысл шифра, и тоже идет к двери, где охранник называет число 10, она говорит 5, и ее не пускают. Что она должна была сказать?",
            answer = "Шесть — код — это количество букв в числе, которое говорит секьюрити."
        ),
        RiddleResponseRemote(
            question = "Однажды ночью женщине звонят из полиции. Ей говорят, что ее мужа убили и она должна как можно скорее явиться на место преступления. Женщина в шоке кладет трубку и едет 20 минут до места преступления. Как только она добирается до этого места, полиция арестовывает ее, и она признается, что застрелила своего супруга. Откуда полиция узнала, что она совершила преступление?",
            answer = "Полиция не сообщила ей, где находится место преступления, но она знала, куда ехать."
        ),
        RiddleResponseRemote(
            question = "Однажды вечером Мария и Александра вместе пошли в бар, чтобы выпить после работы. Они заказали один и тот же алкогольный напиток. Александра выпила гораздо больше, чем Мария: она выпила быстро пять рюмок коньяка со льдом, а Мария выпила только одну, растягивая ее весь вечер. Напитки были отравлены, но умерла только Мария. Почему?",
            answer = "Яд был во льду. Поскольку лед Марии успел растаять, она отравилась"
        ),
        RiddleResponseRemote(
            question = "Жили-были семь гномов, и все они были родными братьями. Все они родились с разницей в два года. Самому младшему гному семь лет. Сколько лет их старшему брату?",
            answer = "19 лет. Если вы думали, что старшему брату 21 год, вы, ошиблись, потому что забыли посчитать семилетнего брата. Ведь он один из них."
        ),
        RiddleResponseRemote(
            question = "Было соревнование, где участники должны были что-то держать. В конце мероприятия победителем стал человек, у которого не было ни рук, ни ног. Что же должны были держать участники?",
            answer = "Дыхание"
        ),
        RiddleResponseRemote(
            question = "Владелец популярного магазина модной одежды придумывает свой собственный уникальный метод ценообразования. Костюм стоит 12 долларов, носки — 10 долларов, кроссовки — 18 долларов, шарф — 8 долларов. Исходя из метода владельца, сколько будут тогда стоить перчатки?",
            answer = "16 долларов. Этот метод установки ценников основан на том, что за каждую букву в названии товара начисляется 2 доллара. В слове «перчатки» восемь букв, соответственно, умножив количество букв на два, получаем 16 долларов"
        ),
        RiddleResponseRemote(
            question = "Убийца приговорен к смертной казни. Ему предстоит выбрать одну из трех комнат. В первой бушует постоянный пожар, во второй — киллеры с заряженными ружьями, а в третьем — львы, которые не ели уже 3 года. Какая комната для него самая безопасная?",
            answer = "Третья комната, потому что эти львы не ели три года, стало быть, они мертвы."
        ),
        RiddleResponseRemote(
            question = "Мужчина был на карнавале и подошел к киоску со странной табличкой: «Определю ваш точный вес без весов». Вот что он услышал от человека, сидевшего в палатке: «Если я напишу ваш точный вес на этом листе бумаги, вы отдадите мне 10000 рублей, но если я не смогу, я заплачу вам эти деньги». Мужчина не видел весов возле будки, поэтому он согласился на пари, подумав, что в любом случае солжет о своем весе, какую бы цифру ни написал странный человек, готовый так легко расстаться с деньгами. Однако в конечном итоге мужчина проиграл спор, отдав деньги. Как странный лоточник выиграл пари?",
            answer = "Он дал мужчине листок бумаги, на котором было написано: «Ваш точный вес»"
        ),
        RiddleResponseRemote(
            question = "Меня зовут Тоби, я живу на ферме с четырьмя другими собаками, моими братьями и сестрами. Их зовут Спот, Сноуи, Брауни и Рекс. Как вы думаете, как зовут пятую собаку?",
            answer = "Тоби"
        ),
        RiddleResponseRemote(
            question = "В одноэтажном доме, который стоит на углу дороги, спальни были желтыми, кухня — оранжевой, гостиная — красной, гараж — синим, прихожая — зеленой, а гостиная — фиолетовой. Какого цвета были лестницы?",
            answer = "Цвета нет, потому что нет лестницы — дом одноэтажный."
        ),
        RiddleResponseRemote(
            question = "Вы стоите перед двумя дверями. Возле каждой двери стоит охранник. Вы знаете следующие вещи: один путь ведет в рай, другой в ад. Вы не знаете, за какой дверью свет, а за какой преисподняя. Вы только знаете, что один из двух охранников всегда говорит правду, а другой всегда лжет. У вас есть право задать только одному стражнику один вопрос, чтобы узнать, какая дверь ведет в рай. Какой один вопрос вы бы задали, чтобы точно узнать, за какой дверью находится рай?",
            answer = "Нужно спросить: «Какая дверь, по словам другого охранника, ведет в райские небеса?»"
        ),
        RiddleResponseRemote(
            question = "Если вы покрасите коричневый дом в белый цвет, он станет белым. Если сигнал светофора меняется с красного на зеленый, значит, горит зеленый. Итак, если бросить белую рубашку в Красное море, какого она станет цвета?",
            answer = "Мокрая рубашка не изменит цвет, потому что Красное море, на самом деле, не красное"
        ),
        RiddleResponseRemote(
            question = "На край стола поставили жестяную банку, плотно закрытую крышкой, так, что 2/3 банки свисало со стола. Через некоторое время банка упала. Что было в банке?",
            answer = "Кусок Льда"
        ),
        RiddleResponseRemote(
            question = "В квартире на Даунинг Стрит произошло убийство. Посреди комнаты там стоял столик на трех ножках. За ним сидело двое мужчин, игравших в шахматы. Рядом присутствовал третий, который просто смотрел за партией. На несколько минут свет неожиданно погас, а когда в комнате опять стало светло, оказалось, что третий мужчина лежит на полу с ножом в горле. Один из присутствующих на допросе заявил, что когда свет выключили, он как раз наклонился, чтобы подложить кусочек картона под одну из ножек стола, чтобы он не качался. Другой подозреваемый ответил, что вообще ничего не слышал, т. к. напряженно обдумывал очередной ход. Кто убийца?",
            answer = "Мужчина, утверждавший, что нагнулся во время убийства врет, т. т.к стол на трех ножках качаться не может. очевидно он и является убийцей"
        ),
        RiddleResponseRemote(
            question = "А и Б сидели на трубе. А уехал за границу, Б чихнул и лёг в больницу. Что осталось на трубе?",
            answer = "Буква Б, а в больницу лёг И"
        ),
        RiddleResponseRemote(
            question = "Что такое диетическое яйцо?",
            answer = "Это яйцо, снесенное курицей, находящейся на диете"
        ),
        RiddleResponseRemote(
            question = "У Ольги Николаевны наконец-то сбылась мечта: она купила себе новый ярко-красный автомобиль. На следующий день, отправившись на работу, Ольга Николаевна, двигаясь по левой стороне дороги, повернула налево на красный свет, не обращая внимания на знак «Поворот запрещен» и в довершение всего она не пристегнулась ремнем безопасности. Все это видел стоящий на перекрестке постовой, но он даже не остановил Ольгу Николаевну, чтобы хотя бы проверить ее водительское удостоверение. Почему?",
            answer = "Потому что она отправилась на работу пешком"
        ),
        RiddleResponseRemote(
            question = "Hа суку сидит ворона. Что надо сделать, чтобы отпилить сук, не потревожив ворону?",
            answer = "Дождаться, пока она улетит"
        ),
        RiddleResponseRemote(
            question = "В семье негров в Конго родился ребенок: весь белый, даже зубы были белоснежными. Что здесь не так?",
            answer = "Дети рождаются без зубов"
        ),
        RiddleResponseRemote(
            question = "Дано слово из четырех букв, но еще оно может быть записано тремя буквами. Обычно можно записать шестью буквами, а затем пятью буквами. Отродясь содержало восемь букв, а изредка состоит из семи букв",
            answer = "«Дано», «оно», «обычно», «затем», «отродясь», «изредка»"
        ),
        RiddleResponseRemote(
            question = "Шел охотник мимо башни с часами. Достал ружье и выстрелил. Куда он попал?",
            answer = "В милицию"
        ),
        RiddleResponseRemote(
            question = "Какой рукой нужно размешивать чай?",
            answer = "Чай нужно размешивать ложкой, а не рукой"
        ),
        RiddleResponseRemote(
            question = "Что делает сторож, когда у него на голове сидит воробей?",
            answer = "Спит"
        ),
        RiddleResponseRemote(
            question = "Гуси шли на водопой гуськом (один вслед за другим). Один гусь посмотрел вперёд – перед ним 17 голов. Посмотрел назад – за ним 42 лапы. Сколько гусей шло на водопой?",
            answer = "39: 17 впереди, 21 позади плюс тот гусь, который головой вертел"
        ),
        RiddleResponseRemote(
            question = "Опытные игроки Коля и Серёжа резались в шахматы, однако в пяти сыгранных партиях каждый из них продул ровно по пять раз. Как так вышло?",
            answer = "Коля и Серёжа играли с третьим лицом. Другой вариант – 5 раз сыграли вничью"
        ),
        RiddleResponseRemote(
            question = "Не лёд, а тает, не лодка, а уплывает.",
            answer = "Зарплата"
        ),
        RiddleResponseRemote(
            question = "Сколько программистов нужно, чтобы закрутить лампочку?",
            answer = "Один"
        ),
        RiddleResponseRemote(
            question = "Эти три телезвезды давно на экране. Одного зовут Степан, второго – Филипп. Как зовут третьего?",
            answer = "Хрюша"
        ),
        RiddleResponseRemote(
            question = "Какая разница между попом и Волгой?",
            answer = "Поп – батюшка, а Волга – матушка"
        ),
        RiddleResponseRemote(
            question = "По чему Ленин ходил в ботинках, а Сталин в сапогах?",
            answer = "По земле"
        ),
        RiddleResponseRemote(
            question = "Детей у него может и не быть, но он все равно папа. Как такое возможно?",
            answer = "Это папа римский"
        ),
        RiddleResponseRemote(
            question = "Чем отличается женское общежитие от мужского?",
            answer = "В женском общежитии посуду моют после еды, а в мужском – перед"
        ),
        RiddleResponseRemote(
            question = "Что нужно сделать, если вы сели в машину, а ноги до педалей не достают?",
            answer = "Пересесть на водительское кресло"
        ),
        RiddleResponseRemote(
            question = "Серёжки для простаков?",
            answer = "Лапша"
        ),
        RiddleResponseRemote(
            question = "Какое самое длинное слово на русском языке",
            answer = "Слово о полку Игореве"
        ),
        RiddleResponseRemote(
            question = "У Валерия Ободзинского она очень длинная, у Михаила Круга – короткая, а Ани Лорак ею вообще не пользуется. О чем идет речь?",
            answer = "О фамилии"
        ),
        RiddleResponseRemote(
            question = "Под чем обычно лежит заяц?",
            answer = "Под своими ушами"
        ),
        RiddleResponseRemote(
            question = "Где вода стоит столбом?",
            answer = "В стакане"
        ),
        RiddleResponseRemote(
            question = "За чем во рту язык?",
            answer = "За зубами"
        ),
        RiddleResponseRemote(
            question = "Какой ключ не может ни отомкнуть, ни бить?",
            answer = "Нотный"
        ),
        RiddleResponseRemote(
            question = "Они бывают металлические и жидкие. О чем речь?",
            answer = "Гвозди"
        ),
        RiddleResponseRemote(
            question = "Это даётся человеку три раза в жизни. Первые два — бесплатно, а за третий придётся платить. Что это?",
            answer = "Зубы"
        ),
        RiddleResponseRemote(
            question = "Чего нет в женской сумочке?",
            answer = "Порядка"
        ),
        RiddleResponseRemote(
            question = "В каком месяце болтливая Светочка говорит меньше всего?",
            answer = "Феврале, самом коротком месяце года"
        ),
        RiddleResponseRemote(
            question = "Чем лошадь отличается от иголки?",
            answer = "На иголку сначала сядешь, потом подпрыгнешь, чтобы сесть на лошадь — сначала подпрыгнешь, затем сядешь."
        ),
        RiddleResponseRemote(
            question = "Самая надежная часть в отечественном автомобиле?",
            answer = "Импортная магнитола."
        ),
        RiddleResponseRemote(
            question = "Что такое — на потолке сидит, лампочку грызет?",
            answer = "Потолочный лампогрыз"
        ),
        RiddleResponseRemote(
            question = "Что общего между студентами и ящерицами?",
            answer = "Умение вовремя отбрасывать «хвосты.»"
        ),
        RiddleResponseRemote(
            question = "Сколько горошин может войти в один стакан?",
            answer = "Нисколько, горошины не ходят."
        ),
        RiddleResponseRemote(
            question = "Что жена делает с обедом, если тот мужу не понравился?",
            answer = "Оставляет на ужин»"
        ),
        RiddleResponseRemote(
            question = "Почему роботы никогда не боятся?",
            answer = "Потому что у них стальные нервы"
        ),
        RiddleResponseRemote(
            question = "Что нельзя сделать в космосе даже при большем старании?",
            answer = "Повеситься"
        ),
        RiddleResponseRemote(
            question = "Кто носит самую большую в мире кепку?",
            answer = "Тот, кто имеет самую большую в мире голову"
        ),
        RiddleResponseRemote(
            question = "Воробей может съесть горсточку зерна, а лошадь не может. Почему?",
            answer = "Воробей слишком маленький, чтобы съесть лошадь"
        ),
        RiddleResponseRemote(
            question = "Что это такое: синий, большой, с усами и полностью набит зайцами?",
            answer = "Троллейбус"
        ),
        RiddleResponseRemote(
            question = "Без головы я кажусь выше. Что я?",
            answer = "Подушка"
        ),
        RiddleResponseRemote(
            question = "Это удивительно изобретение позволяет любому человеку видеть сквозь стены. Что это?",
            answer = "Окно"
        ),
        RiddleResponseRemote(
            question = "Что тяжелее 2 килограмма цемента или ваты?",
            answer = "Одинаково, так как мы берем по 2 кг"
        ),
        RiddleResponseRemote(
            question = "Полосатые мячи, с которыми в футбол не поиграешь — разобьются сразу.",
            answer = "Арбузы"
        ),
        RiddleResponseRemote(
            question = "Горбатый, но не страшный, детям нравится. Что за зверь?",
            answer = "Верблюд"
        ),
        RiddleResponseRemote(
            question = "Вся спина иголками истыкана, но не ежик.",
            answer = "Наперсток"
        ),
        RiddleResponseRemote(
            question = "Как лесенка, только вверх не поднимает никого и лежит в поле",
            answer = "Рельсы"
        ),
        RiddleResponseRemote(
            question = "Два братца одинаковых на нос садятся ",
            answer = "Очки"
        ),
        RiddleResponseRemote(
            question = "У меня острые клыки, но я не зверь. Не кусаюсь, но если неправильно меня использовать могу ранить.",
            answer = "Степлер"
        ),
        RiddleResponseRemote(
            question = "Зачем вампир посещал занятия по изобразительному искусству?",
            answer = "Он хотел научиться рисовать кровью"
        ),
        RiddleResponseRemote(
            question = "Две девочки с одним зонтиком пришли в школу. Никто не промок. Почему?",
            answer = "Потому что не шел дождь"
        ),
        RiddleResponseRemote(
            question = "Чему большому, желтому, с колесами радуются все мамы по утрам?",
            answer = "Школьному автобусу!"
        ),
        RiddleResponseRemote(
            question = "Когда домашнее задание не нужно делать дома?",
            answer = "Когда оно выполнено в школе"
        ),
        RiddleResponseRemote(
            question = "Большая часть меня скрыта под водой.",
            answer = "Айсберг"
        ),
        RiddleResponseRemote(
            question = "Вы поднимаете его вверх, чтобы показать другим людям, что у вас все хорошо.",
            answer = "Большой палец"
        ),
        RiddleResponseRemote(
            question = "Что невозможно положить в кастрюлю?",
            answer = "Крышку от нее, она всегда немного больше"
        ),
        RiddleResponseRemote(
            question = "У меня есть глазки, но я ничего ими не вижу. Что я?",
            answer = "Картошка"
    ),
        RiddleResponseRemote(
    question = "Она является сестрой вашего дяди, но не является вашей тетей. Кто она вам?",
    answer = "Мама"
    ),
    RiddleResponseRemote(
    question = "Я могу есть бесконечно и никогда не буду сыт. Что я?",
    answer = "Огонь"
    ),
    RiddleResponseRemote(
    question = "У меня нет ни рук, ни ног, но пробраться в дом зимой могу.",
    answer = "Холод, мороз"
    ),
        RiddleResponseRemote(
            question = "Хожу за тобой по горам и лесам, откликаюсь, если позовешь, но первым разговор не начинаю.",
            answer = "Эхо"
        ),
        RiddleResponseRemote(
            question = "Не знаем горя и печали, но плачем.",
            answer = "Облака"
        ),
        RiddleResponseRemote(
            question = "Не река и не суша, ногами меня не перейдешь, на лодке не переплывешь.",
            answer = "Болото"
        ),
        RiddleResponseRemote(
            question = "Сегодня это завтра, а завтра будет вчера.",
            answer = "Сегодняшний день"
        ),
        RiddleResponseRemote(
            question = "Зверь, который все лето гуляет и отдыхает, а зимой спит.",
            answer = "Медведь"
        ),
        RiddleResponseRemote(
            question = "Весь лес на себе носит.",
            answer = "Ежик"
        ),
        RiddleResponseRemote(
            question = "Дерево на голове носит.",
            answer = "Олень"
        ),
        RiddleResponseRemote(
            question = "Может отправиться в путешествие, не покидая собственного дома.",
            answer = "Улитка"
        ),
        RiddleResponseRemote(
            question = "Без топоров и пилы, стоят дом в лесу у сосны?",
            answer = "Муравьи"
        ),
        RiddleResponseRemote(
            question = "Не молоток, а по дереву ступит.",
            answer = "Дятел"
        ),
        RiddleResponseRemote(
            question = "Если одного меня в землю бросить, можно целую горсть потом собрать.",
            answer = "Семя"
        ),
        RiddleResponseRemote(
            question = "Мы не море, но волнуемся на ветру.",
            answer = "Колосья"
        ),
        RiddleResponseRemote(
            question = "Золотое решето с черными домиками в поле растет, к солнышку всегда тянется.",
            answer = "Подсолнух"
        ),
        RiddleResponseRemote(
            question = "Всю жизнь ходим, а уйти никуда не можем.",
            answer = "Стрелки часов"
        ),
        RiddleResponseRemote(
            question = "Два брата-близнеца, которые никогда не могут увидеть друг друга",
            answer = "Глаза"
        ),
        RiddleResponseRemote(
            question = "Без него невозможно было бы ничего сказать.",
            answer = "Язык"
        ),
        RiddleResponseRemote(
            question = "Носить их легко, даже если они длинные, а посчитать невозможно.",
            answer = "Волосы"
        ),
        RiddleResponseRemote(
            question = "Никогда не могут обогнать друг друга, всю жизнь ходят рядом.",
            answer = "Ноги"
        ),
        RiddleResponseRemote(
            question = "Всегда смотрят друг на друга, а сойтись не могут.",
            answer = "Пол и потолок"
        ),
        RiddleResponseRemote(
            question = "Ходит да ходит, но в дом никогда не заходит.",
            answer = "Входная дверь"
        ),
        RiddleResponseRemote(
            question = "Хвост во дворе, а голова в доме. Что это?",
            answer = "Ключ в замке"
        ),
        RiddleResponseRemote(
            question = "Нет ручек и ножек, но поднимается, если укрыть простынкой.",
            answer = "Дрожжевое тесто"
        ),
        RiddleResponseRemote(
            question = "Крылья есть, но не птица. Летит, но крыльями не машет.",
            answer = "Самолет"
        ),
        RiddleResponseRemote(
            question = "На земле этой болезнью нельзя болеть.",
            answer = "Морская болезнь"
        ),
        RiddleResponseRemote(
            question = "Сколько бутербродов человек может съесть натощак?",
            answer = "Один. Второй уже будет не натощак"
        ),
        RiddleResponseRemote(
            question = "На какой вопрос ни один человек никогда не ответит «Да»?",
            answer = "Ты спишь?"
        ),
        RiddleResponseRemote(
            question = "Как можно отпилить ветку, на которой сидит птица, не спугнув ее?",
            answer = "Дождаться пока она сама улетит"
        ),
        RiddleResponseRemote(
            question = "Что у нас под ногами, когда мы идем по дороге?",
            answer = "Подошва"
        ),
        RiddleResponseRemote(
            question = "На что больше всего похожа половина груши?",
            answer = "На свою вторую половину"
        ),
        RiddleResponseRemote(
            question = "Самый короткий месяц?",
            answer = "Май"
        ),
        RiddleResponseRemote(
            question = "Как далеко человек может зайти в лес?",
            answer = "До середины. Дальше он будет из него выходить"
        ),
        RiddleResponseRemote(
            question = "Стоит над водой, трясет головой.",
            answer = "Камыш"
        ),
        RiddleResponseRemote(
            question = "Ног нет, крыльев нет, но не догонишь.",
            answer = "Рыба"
        ),
        RiddleResponseRemote(
            question = "Растет вниз головой.",
            answer = "Сосулька"
        ),
        RiddleResponseRemote(
            question = "Вокруг вьется, а поймать невозможно.",
            answer = "Ветер"
        ),
        RiddleResponseRemote(
            question = "Всю жизнь ходят, но не уходят.",
            answer = "Стрелки часов"
        ),
        RiddleResponseRemote(
            question = "Всегда рядом, но догнать или обогнать ее невозможно.",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Край виден, но дойти до него невозможно.",
            answer = "Горизонт"
        ),
        RiddleResponseRemote(
            question = "Сестра и брат, которые никогда не встречаются. Один из них всегда прячется, когда другой приходит.",
            answer = "Луна и солнце"
        ),
        RiddleResponseRemote(
            question = "Дыра, в которую можно удочку опустить.",
            answer = "Прорубь"
        ),
        RiddleResponseRemote(
            question = "Один мой знакомый может начисто сбривать бороду десяток раз в день. И все равно он ходит с бородой. Как это возможно?",
            answer = "Он брадобрей."
        ),
        RiddleResponseRemote(
            question = "Однажды за завтраком девушка уронила свое кольцо в чашку, полную кофе. Почему кольцо осталось сухим?",
            answer = "Кофе в зернах, молотый или растворимый"
        ),
        RiddleResponseRemote(
            question = "В каком случае, смотря на цифру 2, мы говорим «десять»",
            answer = "Когда мы смотрим на часы, которые показывают десять минут какого-либо часа"
        ),
        RiddleResponseRemote(
            question = "Вы стоите перед двумя одинаковыми дверьми, одна из которых ведет к смерти, другая — к счастью. Двери охраняют два одинаковых стражника, один из которых все время говорит правду, а другой все время лжет. Но вы не знаете — кто есть кто. Вы можете задать только один вопрос любому из стражников. Какой вопрос нужно задать, чтобы не ошибиться с выбором двери?",
            answer = "Одно из решений: «Если я попрошу указать мне на дверь к счастью, на какую дверь покажет другой стражник?» И после этого нужно выбрать другую дверь."
        ),
        RiddleResponseRemote(
            question = "В одной комнате — три лампочки. В другой — три выключателя. Нужно определить, какой выключатель от какой лампочки. Заходить в комнату с лампочками можно только один раз.",
            answer = "Нужно включить сначала одну лампочку и подождать, затем совсем ненадолго включить вторую, а потом обе выключить. Первая будет самая горячая, вторая — теплая, а третья — холодная."
        ),
        RiddleResponseRemote(
            question = "С борта парохода был спущен стальной трап. Нижние 4 ступеньки трапа погружены в воду. Каждая ступенька имеет толщину в 5 см; расстояние между двумя соседними ступень ками составляет 30 см. Начался прилив, при котором уровень воды стал поднимается со скоростью 40 см в час. Как Вы считаете, сколько ступенек окажется под водой через 2 часа?",
            answer = "Через два часа под водой будут те же 4 ступеньки, потому что во время прилива лестница поднимается вместе с пароходом."
        ),
        RiddleResponseRemote(
            question = "Три курицы за три дня несут три яйца. Сколько яиц снесут 12 таких же курей за 12 дней?",
            answer = "Одна курица несет одно яйцо за три дня. За 12 дней одна курица снесет четыре яйца, следовательно, 12 курей за 12 дней снесут 12×4=48 яиц."
        ),
        RiddleResponseRemote(
            question = "Петя и Миша играли на грязном и темном чердаке дома. Потом они спустились вниз. У Пети всё лицо было грязным, а лицо Миши чудом осталось чистым. Несмотря на это, только Миша отправился умываться. Почему?",
            answer = "Миша увидел, что у Пети грязное лицо и подумал, что у него также лицо грязное, Петя, увидев чистое лицо Миши, подумал что с его лицом также все в порядке."
        ),
        RiddleResponseRemote(
            question = "Сколько всего страниц смог прогрызть книжный червь, если в первом томе 700 страниц, во втором – 640, а в третьем – 670?",
            answer = "Необходимо четко представлять, как стоят тома книг. Книги стоят так, что 1-я страница тома I примыкает к 640-й странице тома II, а последняя страница 3-го тома находится рядом с первой страницей 2-го тома. Таким образом, если червь проделал ход от 1-й страницы тома I до последней страницы тома III, то он смог прогрызть всего лишь 640 страниц среднего тома да еще 4 обложки переплета, но не более."
        ),
        RiddleResponseRemote(
            question = "Ты у друга взял 100 рублей, пошел в магазин и потерял их. По дороге встретил знакомую, взял у нее 50 рублей, купил 2 шоколадки по 10 рублей. У тебя осталось 30 рублей, ты отдал их другу и остался должен 70 рублей, а знакомой 50. Итого 120 рублей. Плюс у тебя еще 2 шоколадки, итого 140 рублей. Где еще 10 рублей?",
            answer = "30 рублей ты уже отдал за долг, поэтому, должен другу 70 руб. и знакомой 50 руб., т.е. в сумме 120. Потрачено было 120 руб. (100 потерял и 20 на шоколадки), таким образом ничто никуда не теряется, 120 рублей взял в долг и 120 рублей потратил."
        ),
        RiddleResponseRemote(
            question = "Даша мечтала о шоколадке, но ей на покупку не хватало 10 рублей. Алёша тоже мечтал о шоколадке, но ему не доставало всего 1 рубля. Ребята решили купить хотя бы одну шоколадку на двоих, но им все равно не хватило 1 рубля. Какова стоимость шоколадки?",
            answer = "Стоимость - 10 рублей. У Даши нет денег вообще."
        ),
        RiddleResponseRemote(
            question = "Стоит тюрьма, рядом больница. Вокруг них рельсы, а на рельсах движется кругом с большой скоростью поезд. Одному мальчику надо попасть к деду в тюрьму, а одной девочке к бабушке в больницу. Как им это сделать, если поезд не останавливается?",
            answer = "Мальчику надо бросить девочку под поезд, тогда он попадет в тюрьму, а девочка в больницу."
        ),
        RiddleResponseRemote(
            question = "Какое русское слово можно записать справа налево, развернуть вверх ногами, отразить зеркально, и оно всё равно останется неизменным и не потеряет своего смысла?",
            answer = "Оно"
        ),
        RiddleResponseRemote(
            question = "Он большой шалун и комик, у него на крыше домик. Хвастунишка и зазнайка, а зовут его ...",
            answer = "Карлсон"
        ),
        RiddleResponseRemote(
            question = "Утром рано я встаю, молочком всех напою, травку я жую за речкой,а зовусь я как?",
            answer = "Корова"
        ),
        RiddleResponseRemote(
            question = "Жил в бутылке сотни лет, наконец, увидел свет, бородою он оброс, этот добрый..",
            answer = "Дед Мороз"
        ),
        RiddleResponseRemote(
            question = "На уроках будешь спать — за ответ получишь ",
            answer = "не пять, а два"
        ),
        RiddleResponseRemote(
            question = "Фрукты, закуски, напитки, вино — Столик накрыт для обеда в...",
            answer = "не в кино, а в ресторане"
        ),
        RiddleResponseRemote(
            question = "Что имеет голову, но не имеет мозгов?",
            answer = "Сыр, лук, чеснок "
        ),
        RiddleResponseRemote(
            question = "Что в России на первом месте, а во Франции на втором?",
            answer = "Буква «Р» "
        ),
        RiddleResponseRemote(
            question = "Сидит в темнице, красная девица, а коса на улице.",
            answer = "Морковь"
        ),
        RiddleResponseRemote(
            question = "Кто зимой холодной ходит злой, голодный?",
            answer = "Волк"
        ),
        RiddleResponseRemote(
            question = "Не лает, не кусает, а в дом не пускает",
            answer = "Замок"
        ),
        RiddleResponseRemote(
            question = "Сидит дед, в шубу одет, кто его раздевает, тот слёзы проливает.",
            answer = "Лук"
        ),
        RiddleResponseRemote(
            question = "Белые поросятки прилегли на грядке.",
            answer = "Кабачки"
        ),
        RiddleResponseRemote(
            question = "И сияет, и блестит, никому оно не льстит.",
            answer = "Зеркало"
        ),
        RiddleResponseRemote(
            question = "В доску спрячется бедняжка — чуть видна его фуражка",
            answer = "Гвоздь"
        ),
        RiddleResponseRemote(
            question = "Зимой и летом одним цветом.",
            answer = "Ёлка"
        ),
        RiddleResponseRemote(
            question = "Сперва блеск, за блеском — треск!",
            answer = "Гроза"
        ),
        RiddleResponseRemote(
            question = "Рыжая плутовка, хитрая да ловкая, в сарай попала, кур пересчитала.",
            answer = "Лиса"
        ),
        RiddleResponseRemote(
            question = "По лужку он важно бродит, из воды сухим выходит, носит красные ботинки, дарит мягкие перинки.",
            answer = "Гусь"
        ),
        RiddleResponseRemote(
            question = "К нам приехали с бахчи полосатые мячи.",
            answer = "Арбуз"
        ),
        RiddleResponseRemote(
            question = "Белые горошки на зелёной ножке.",
            answer = "Ландыш"
        ),
        RiddleResponseRemote(
            question = "Зубы в пасти в три ряда. Это целая беда. Этот хищник знаменит, тем, что он — морской бандит.",
            answer = "Акула"
        ),
        RiddleResponseRemote(
            question = "Мы — лесные жители, мудрые строители. Из иголок всей артелью строим дом себе под елью.",
            answer = "Муравьи"
        ),
        RiddleResponseRemote(
            question = "По реке плывет бревно. Ох, и злющее оно!",
            answer = "Крокодил"
        ),
        RiddleResponseRemote(
            question = "Заворчал живой замок, лег у двери поперек. Две медали на груди. Лучше в дом не заходи!",
            answer = "Собака"
        ),
        RiddleResponseRemote(
            question = "Всех я вовремя бужу, хоть часов не завожу.",
            answer = "Петух"
        ),
        RiddleResponseRemote(
            question = "Все время стучит, деревья долбит. Но их не калечит, а только лечит.",
            answer = "Дятел"
        ),
        RiddleResponseRemote(
            question = "Сам пустой, голос густой, дробь отбивает, шагать и петь помогает.",
            answer = "Барабан"
        ),
        RiddleResponseRemote(
            question = "Упадет — поскачет, ударишь — не плачет.",
            answer = "Мяч"
        ),
        RiddleResponseRemote(
            question = "Ах, не трогайте меня: обожгу и без огня!",
            answer = "Крапива"
        ),
        RiddleResponseRemote(
            question = "Этот конь не ест овса, вместо ног — два колеса. Сядь верхом и мчись на нём, только лучше правь рулём.",
            answer = "Велосипед"
        ),
        RiddleResponseRemote(
            question = "То назад, то вперед, ходит, бродит пароход. Остановишь — горе! Продырявит море!",
            answer = "Утюг"
        ),
        RiddleResponseRemote(
            question = "Полюбуйся, посмотри — полюс северный внутри! Там сверкает снег и лед, там сама зима живет.",
            answer = "Холодильник"
        ),
        RiddleResponseRemote(
            question = "В нашем доме под окошком есть горячая гармошка: не поет и не играет — она дом обогревает.",
            answer = "Батарея отопления"
        ),
        RiddleResponseRemote(
            question = "Я в любое время года и в любую непогоду очень быстро в час любой провезу вас под землей.",
            answer = "Метро"
        ),
        RiddleResponseRemote(
            question = "Начинает он копать, заменяет сто лопат.",
            answer = "Экскаватор"
        ),
        RiddleResponseRemote(
            question = "Грянул гром, веселый гром, засверкало все кругом! Рвутся в небо неустанно разноцветные фонтаны.",
            answer = "Фейерверк"
        ),
        RiddleResponseRemote(
            question = "Конь стальной, хвост льняной",
            answer = "Иголка с ниткой"
        ),
        RiddleResponseRemote(
            question = "Без огня горит, без крыльев летит, без ног бежит.",
            answer = "Солнце, тучи, река"
        ),
        RiddleResponseRemote(
            question = "Без рук, без топорёнка построена избенка.",
            answer = "Гнездо"
        ),
        RiddleResponseRemote(
            question = "Сам алый, сахарный, кафтан зеленый, бархатный.",
            answer = "Арбуз"
        ),
        RiddleResponseRemote(
            question = "В сенокос — горька, а в мороз — сладка. Что за ягодка?",
            answer = "Калина"
        ),
        RiddleResponseRemote(
            question = "Синий мундир, белая подкладка, в середине — сладко.",
            answer = "Слива"
        ),
        RiddleResponseRemote(
            question = "Накормишь — живёт, напоишь — умрёт.",
            answer = "Огонь"
        ),
        RiddleResponseRemote(
            question = "Чем больше взяли, тем больше стала.",
            answer = "Яма"
        ),
        RiddleResponseRemote(
            question = "Чего в гору не выкатить, в решете не унести и в руках не удержать?",
            answer = "Вода"
        ),
        RiddleResponseRemote(
            question = "Один говорит, двое глядят, двое слушают.",
            answer = "Язык, глаза, уши"
        ),
        RiddleResponseRemote(
            question = "Бусы красные висят, из кустов на нас глядят, очень любят бусы эти — дети, птицы и медведи.",
            answer = "Малина"
        ),
        RiddleResponseRemote(
            question = "Ни зверь, ни птица, носок как спица. Летит — пищит, сядет — молчит.",
            answer = "Комар"
        ),
        RiddleResponseRemote(
            question = "Вот иголки и булавки выползают из-под лавки. На меня они глядят, молока они хотят.",
            answer = "Ёж"
        ),
        RiddleResponseRemote(
            question = "Косоглазый, маленький, в серой шубке старенькой.",
            answer = "Заяц"
        ),
        RiddleResponseRemote(
            question = "Рыжая, с пушистым хвостом, живет в лесу под кустом.",
            answer = "Лиса"
        ),
        RiddleResponseRemote(
            question = "Маленький рост, длинный хвост, серая шубка, острые зубки.",
            answer = "Мышь"
        ),
        RiddleResponseRemote(
            question = "Ночью не спит, мышей сторожит.",
            answer = "Кошка"
        ),
        RiddleResponseRemote(
            question = "Не барашек и не кот, носит шубу целый год. Шуба серая — для лета, для зимы — другого цвета.",
            answer = "Заяц"
        ),
        RiddleResponseRemote(
            question = "Бел, а не сахар, нет ног, а идет.",
            answer = "Снег"
        ),
        RiddleResponseRemote(
            question = "Не пекарь, а печёт-румянит.",
            answer = "Солнце"
        ),
        RiddleResponseRemote(
            question = "Через море-океан плывёт чудо-великан, прячет ус во рту, растянулся на версту.",
            answer = "Кит"
        ),
        RiddleResponseRemote(
            question = "Целый день летает, всем надоедает, ночь настаёт, тогда перестаёт.",
            answer = "Муха"
        ),
        RiddleResponseRemote(
            question = "Голубой аэропланчик сел на белый одуванчик.",
            answer = "Стрекоза"
        ),
        RiddleResponseRemote(
            question = "Узнать его нам просто, узнать его легко: высокого он роста и видит далеко.",
            answer = "Жираф"
        ),
        RiddleResponseRemote(
            question = "В зоопарке, верь, не верь, проживает чудо-зверь. У него рука — во лбу, так похожа на трубу!",
            answer = "Слон"
        ),
        RiddleResponseRemote(
            question = "Я горбатый, но нравлюсь ребятам.",
            answer = "Верблюд"
        ),
        RiddleResponseRemote(
            question = "Кто на ветке шишки грыз и бросал объедки вниз?",
            answer = "Белка"
        ),
        RiddleResponseRemote(
            question = "Сер, да не волк, длинноух, да не заяц, с копытами, да не лошадь.",
            answer = "Осёл"
        ),
        RiddleResponseRemote(
            question = "Маленький мальчишка в сером армячишке по дворам шныряет, крохи подбирает.",
            answer = "Воробей"
        ),
        RiddleResponseRemote(
            question = "Спереди — шильце, сзади — вильце, сверху — черное суконце, снизу — белое полотенце.",
            answer = "Ласточка"
        ),
        RiddleResponseRemote(
            question = "Я — услужливый пузан. Всех охотно угощаю. То молчу, как истукан, а то песни распеваю.",
            answer = "Самовар"
        ),
        RiddleResponseRemote(
            question = "Лежит свинка, иголками истыкана спинка.",
            answer = "Наперсток"
        ),
        RiddleResponseRemote(
            question = "Два близнеца, два братца, на нос верхом садятся.",
            answer = "Очки"
        ),
        RiddleResponseRemote(
            question = "Две плетенки, две сестренки, из овечьей пряжи тонкой, как гулять — так надевать, чтоб не мерзли пять да пять.",
            answer = "Варежки"
        ),
        RiddleResponseRemote(
            question = "Живет в нем вся Вселенная, а вещь обыкновенная.",
            answer = "Телевизор"
        ),
        RiddleResponseRemote(
            question = "Без ног и без крыльев оно, но так летит, что не догонишь его.",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Двенадцать братьев друг за другом бродят, друг друга не обходят.",
            answer = "Месяцы"
        ),
        RiddleResponseRemote(
            question = "Два конца, два кольца, посредине гвоздик.",
            answer = "Ножницы"
        ),
        RiddleResponseRemote(
            question = "Течет-течет — не вытечет, бежит-бежит — не выбежит.",
            answer = "Река"
        ),
        RiddleResponseRemote(
            question = "Пустые отдыхаем, а полные шагаем.",
            answer = "Сапоги"
        ),
        RiddleResponseRemote(
            question = "Бежит, гудит. В два глаза глядит, а только красный засияет — как вкопанный станет.",
            answer = "Автомобиль"
        ),
        RiddleResponseRemote(
            question = "Один брат ест и голодает, а второй – идет и пропадает.",
            answer = "Огонь и дым"
        ),
        RiddleResponseRemote(
            question = "Лежит на спине – никому не нужна. Прислони к стене – пригодится она.",
            answer = "Лестница"
        ),
        RiddleResponseRemote(
            question = "Одной рукой всех встречает, другой — провожает.",
            answer = "Дверная ручка"
        ),
        RiddleResponseRemote(
            question = "Висит груша — нельзя скушать.",
            answer = "Лампочка"
        ),
        RiddleResponseRemote(
            question = "Кьется речка — мы лежим. Лед на речке — мы бежим.",
            answer = "Коньки"
        ),
        RiddleResponseRemote(
            question = "Он идет, волну сечет, из трубы зерно течет.",
            answer = "Комбайн"
        ),
        RiddleResponseRemote(
            question = "Пять ступенек — лесенка, на ступеньках — песенка.",
            answer = "Ноты"
        ),
        RiddleResponseRemote(
            question = "В голубенькой рубашке бежит по дну овражка.",
            answer = "Ручеек"
        ),
        RiddleResponseRemote(
            question = "Над цветком порхает, пляшет, веерком узорным машет.",
            answer = "Бабочка"
        ),
        RiddleResponseRemote(
            question = "Восемь ног, как восемь рук, вышивают шелком круг",
            answer = "Паук"
        ),
        RiddleResponseRemote(
            question = "Бьют меня палками, мнут меня скалками, жгут меня огнем, режут меня ножом; а за то меня так губят, что все меня любят.",
            answer = "Хлеб"
        ),
        RiddleResponseRemote(
            question = "Прозрачен, как стекло, а не вставишь в окно.",
            answer = "Лёд"
        ),
        RiddleResponseRemote(
            question = "Пушистая вата плывет куда-то. Чем вата ниже, тем дождик ближе.",
            answer = "Облака"
        ),
        RiddleResponseRemote(
            question = "Известно, что среди девяти монет есть одна фальшивая, у которой вес меньше, чем у остальных монет. Как с помощью чашечных весов за два взвешивания определить фальшивую монету?",
            answer = "1-е взвешивание: 3 и 3 монеты. Фальшивая монета в той кучке, которая меньше весит. Если они равны, то фальшивка находится в третьей кучке. 2-е взвешивание: Из кучки с наименьшим весом сравниваются любые 2 монеты. Если они равны, то фальшивка –  оставшаяся монета"
        ),
        RiddleResponseRemote(
            question = "Лодка качается на воде. С неё по борту выкинута лестница. До прилива вода накрывала только нижнюю ступеньку. Через сколько времени вода накроет 3-ю снизу ступеньку, если во время прилива вода прибывает на 20 см в час, а расстояние между ступеньками 30 см?",
            answer = "Никогда, так как лодка поднимается вместе с водой"
        ),
        RiddleResponseRemote(
            question = "Как разделить пять яблок между пятью девочками так, чтобы каждая получила по яблоку и при этом одно из яблок осталось в корзинке?",
            answer = "Отдать одной девочке яблоко вместе с корзинкой"
        ),
        RiddleResponseRemote(
            question = "Шла женщина в Москву, а навстречу – три мужика. У каждого по мешку, в каждом мешке по кошке. Сколько существ направлялось в Москву?",
            answer = "Только женщина шла в Москву, остальные шли в другую сторону"
        ),
        RiddleResponseRemote(
            question = "На дереве сидело 10 птиц. Пришел охотник и подстрелил одну птицу. Сколько птиц осталось на дереве?",
            answer = "Ни одной – остальные птицы улетели"
        ),
        RiddleResponseRemote(
            question = "Вы участвуете в марафоне и обогнали бегуна, бежавшего вторым. Какую позицию вы теперь занимаете?",
            answer = "Вторую. Если вы ответили, что вы теперь первый – то это неправильно: вы обогнали второго бегуна и заняли его место, так что вы теперь на второй позиции"
        ),
        RiddleResponseRemote(
            question = "Один глухонемой человек зашёл в магазин канцтоваров, чтобы купить точилку для карандашей. Он воткнул себе палец в левое ухо и кулаком другой руки сделал вращательное движение около своего правого уха. Продавец сразу понял, о чём его просят. Потом в тот же магазин вошел слепой человек. Как он объяснил продавцу, что хочет купить ножницы?",
            answer = "Просто сказал, он ведь слепой, но не немой"
        ),
        RiddleResponseRemote(
            question = "На границу России и Китая прилетел петух. Сел точно на границу, абсолютно посредине. Снёс яйцо. Оно упало точно поперек: граница делит его посредине. Какой стране принадлежит яйцо?",
            answer = "Петухи не откладывают яйца!"
        ),
        RiddleResponseRemote(
            question = "Вы вели автобус с 42 пассажирами из Бостона в Вашингтон. На каждой из шести остановок из него выходило по 3 человека, а на каждой второй — по четыре. Как звали водителя, когда водитель через 10 часов прибыл в Вашингтон?",
            answer = "Как вас, ведь в начале было сказано, что вы вели автобус"
        ),
        RiddleResponseRemote(
            question = "В старинном замке, где располагалась тюрьма, были 4 круглых башни, в которых сидели в заточении узники. Один из узников решился на побег. И вот в один прекрасный день он спрятался в углу, а когда вошел охранник, он оглушил его ударом по голове, а сам убежал, переодевшись в другую одежду. Могло ли такое быть?",
            answer = "Нет, так как башни были круглые и углов там не было"
        ),
        RiddleResponseRemote(
            question = "В 12-этажном доме есть лифт. На первом этаже живёт всего 2 человека, от этажа к этажу количество жильцов увеличивается вдвое. Какая кнопка в лифте этого дома нажимается чаще других?"
            answer = "Независимо от распределения жильцов по этажам – кнопка «1»"
        ),
        RiddleResponseRemote(
            question = "Что у человека может за несколько секунд увеличиться в диаметре в 7 раз?",
            answer = "Зрачок. При переходе от яркого света к темноте диаметр может измениться от 1.1 до 8 мм;  всё остальное либо почти не увеличивается, либо увеличивается в диаметре не более чем в 2-3 раза"
        ),
        RiddleResponseRemote(
            question = "В подъезд одновременно зашли 2 человека. У одного квартира на 3-м этаже, у другого — на 9-м. Во сколько раз первый человек доедет быстрее второго? Примечание: они одновременно нажали кнопки в 2 лифтах, движущихся с одинаковой скоростью.",
            answer = "В 3 раза. Правильный ответ: в 4 раза. Лифты обычно ездят с 1-го этажа. Первый проедет 3-1=2 этажа, а второй 9-1=8 этажей, т.е. в 4 раза больше"
        ),
        RiddleResponseRemote(
            question = "Два джигита соревновались: чей конь придёт к финишу последним. Однако дело не шло, оба стояли на месте. Тогда они обратились за советом к мудрецу, и после этого оба поскакали во весь опор. Что им посоветовали?",
            answer = "Мудрец посоветовал джигитам обменяться коням"
        ),
        RiddleResponseRemote(
            question = "Без рук, без ног, а рисовать умеет.",
            answer = "Мороз"
        ),
        RiddleResponseRemote(
            question = "Какие три числа при сложении и умножении дают один результат?",
            answer = "( 1 + 2 + 3 = 6, 1 * 2 * 3 = 6)"
        ),
        RiddleResponseRemote(
            question = "В парке 8 скамеек. Три покрасили. Сколько скамеек стало в парке?",
            answer = "8"
        ),
        RiddleResponseRemote(
            question = "Какой знак нужно поставить между 6 и 7, чтобы результат оказался меньше 7 и больше 6?",
            answer = "Запятую"
        ),
        RiddleResponseRemote(
            question = "Домашнее животное, на ы начинается",
            answer = "Ыщо один таракан"
        ),
        RiddleResponseRemote(
            question = "У трех трактористов есть брат Сергей, а у Сергея братьев нет. Может ли такое быть?",
            answer = "Да, если трактористы - женщины"
        ),
        RiddleResponseRemote(
            question = "Если пять кошек ловят пять мышей за пять минут, то сколько времени нужно одной кошке, чтобы поймать одну мышку?",
            answer = "Пять"
        ),
        RiddleResponseRemote(
            question = "Кто под проливным дождём не намочит волосы?",
            answer = "Лысый"
        ),
        RiddleResponseRemote(
            question = "Может ли мужчина жениться на сестре своей вдовы?",
            answer = "Нет, так как мужчина мертв"
        ),
        RiddleResponseRemote(
            question = "Обычно в месяце 30 или 31 день. В каком месяце 28 дней?",
            answer = "Во всех"
        ),
        RiddleResponseRemote(
            question = "Кто быстрее плавает: утёнок или цыплёнок?",
            answer = "Цыплёнок не умеет плавать"
        ),
        RiddleResponseRemote(
            question = "Когда 2 и 2 бывают больше четырёх?",
            answer = "Когда 22"
        ),
        RiddleResponseRemote(
            question = "Боевое оружие домохозяйки. Символ тепла и уюта.",
            answer = "Скалка"
        ),
        RiddleResponseRemote(
            question = "Почему человек оглядывается назад?",
            answer = "Потому, что на затылке у него нет глаз"
        ),
        RiddleResponseRemote(
            question = "Под чем обычно лежит заяц?",
            answer = "Под своими ушами"
        ),
        RiddleResponseRemote(
            question = "Ушла старая и седая. Пришла зеленая и молодая.",
            answer = "Зима и весна"
        ),
        RiddleResponseRemote(
            question = "Ночь. Идет дождь. Едет автобус. Все спят, только водитель не спит. Какой автобус? Как зовут водителя? Какое колесо в автобусе не крутится?",
            answer = "Автобус мокрый . Водителя зовут Толька. Не крутится запасное колесо"
        ),
        RiddleResponseRemote(
            question = "Шла баба за тестом, упала мягким местом. Чем ты думаешь?",
            answer = "Головой"
        ),
        RiddleResponseRemote(
            question = "Почему у козы грустный взгляд?",
            answer = "Потому, что у нее муж – козел"
        ),
        RiddleResponseRemote(
            question = "У отца три дочери, и у каждой дочери есть по одному брату. Сколько всего детей у этого отца?",
            answer = "Четверо"
        ),
        RiddleResponseRemote(
            question = "Что станет мокрым после высушивания?",
            answer = "Полотенце"
        ),
        RiddleResponseRemote(
            question = "Люди всей земли это делают все одновременно. Что именно?",
            answer = "Старятся"
        ),
        RiddleResponseRemote(
            question = "Один человек никогда не покупал куриные яйца, не выращивал их и не воровал, но каждое утро съедал два яйца. Как же так получалось?",
            answer = "Он употреблял не куриные яйца"
        ),
        RiddleResponseRemote(
            question = "Что случилось после 8 –го марта 2014 года?",
            answer = "Наступило 9 – е марта"
        ),
        RiddleResponseRemote(
            question = "У Тани было 6 слив. 1 сливу Таня отдала Марине, и у них стало поровну слив. Сколько слив было у Марины вначале?",
            answer = "У Марины вначале было 4 сливы."
        ),
        RiddleResponseRemote(
            question = "Какой автомобиль украшает эмблема из четырех колец?",
            answer = "Ауди"
        ),
        RiddleResponseRemote(
            question = "Разделить 10 апельсинов поровну между 12-ю учениками, при условии, что резать каждый апельсин можно не более чем на 3 равные части?",
            answer = "6 апельсинов режем пополам, а каждый из остальных - на 3 равные части, после чего даем каждому ученику по половине и одной трети апельсина."
        ),
        RiddleResponseRemote(
            question = "На дереве сидело 6 воробьев. Охотник, выстрелив, попал в двух из них. Сколько воробьев осталось на дереве?",
            answer = "Не осталось, - все остальные улетели."
        ),
        RiddleResponseRemote(
            question = "Полторы курицы за полтора дня снесут полтора яйца. Сколько яиц снесут 3 курицы за 4 дня?",
            answer = "8"
        ),
        RiddleResponseRemote(
            question = "Щука весит столько, сколько весит килограмм и полщуки. Какой вес щуки?",
            answer = "2 кг"
        ),
        RiddleResponseRemote(
            question = "Два автомобиля ехали по шоссе и проехали 120 км. Сколько километров проехал каждый автомобиль?",
            answer = " 120 км."
        ),
        RiddleResponseRemote(
            question = "Швея имеет кусок сукна 18 м и каждый день отрезает по 3 м. На какой день она отрежет последний раз?",
            answer = "На пятый"
        ),
        RiddleResponseRemote(
            question = "Летела группа уток. Одна впереди, две позади, одна сзади и две спереди, одна между двумя и три в ряд. Сколько летело уток?",
            answer = "Летели одна за другой три утки"
        ),
        RiddleResponseRemote(
            question = "Конь перевозит 10 кг угля, а пони — 10 кг ваты. У кого груз тяжелее?",
            answer = "Груз одинаковый — 10 кг."
        ),
        RiddleResponseRemote(
            question = "Какое колесо в автомобиле не крутится, когда он едет?",
            answer = "Запасно"
        ),
        RiddleResponseRemote(
            question = "На небе одна, у бабы две, а у девки нет.",
            answer = "Буква «б»"
        ),
        RiddleResponseRemote(
            question = "От чего у утки ноги красные?",
            answer = "От колен"
        ),
        RiddleResponseRemote(
            question = "Сорок пят и сорок пят — это сколько?",
            answer = "Восемьдесят пят"
        ),
        RiddleResponseRemote(
            question = "Что достает зубами затылок?",
            answer = "Расческа"
        ),
        RiddleResponseRemote(
            question = "Какой остров говорит, что он одежда?",
            answer = " Ямайка"
        ),
        RiddleResponseRemote(
            question = "Что тепле одного кожуха?",
            answer = "Два кожуха"
        ),
        RiddleResponseRemote(
            question = "Когда дурак умный.",
            answer = "Когда молчит"
        ),
        RiddleResponseRemote(
            question = "Что сначала надо сделать, когда ложишься спать?",
            answer = "Сесть"
        ),
        RiddleResponseRemote(
            question = "В мельнице было восемь мешков, на каждом мешке сидело по две мыши, пришел мельник с котом, сколько теперь стало ног?",
            answer = "Две ноги мельника"
        ),
        RiddleResponseRemote(
            question = "Кто показывает каждому его лицо, потому что не имеет собственного?",
            answer = "Зеркало"
        ),
        RiddleResponseRemote(
            question = "Блокнот стоил 60 рублей, книга стоит столько же плюс 1/3 к этой сумме. Вопрос: сколько стоит книга?",
            answer = "90 рублей"
        ),
        RiddleResponseRemote(
            question = "На сколько увеличиться дробь, если ее числитель будет увеличен на знаменатель",
            answer = "Увеличиться в 1 раз"
        ),
        RiddleResponseRemote(
            question = "10 рабочих роют яму за 10 часов, выкапывают 10 метров ямы. Сколько рабочих понадобиться, чтобы выкопать 100 метров за 100 часов.",
            answer = "10"
        ),
        RiddleResponseRemote(
            question = "3 птицы ловят за 1 минуту каждая по одной мухе, но за три минуты, у них получается поймать 3 мухи. Сколько нужно птиц, чтобы поймать за 1 час 60 мух.",
            answer = "3 птицы"
        ),
        RiddleResponseRemote(
            question = "Как с помощью пяти двоек записать число 11, используя при этом все имеющиеся в математике знаки математических действий?",
            answer = "22/2 + 2 - 2"
        ),
        RiddleResponseRemote(
            question = "Сколько градусов имеют углы равнобедренного треугольника?",
            answer = "90, 45, 45"
        ),
        RiddleResponseRemote(
            question = "Вадим пошел по грибы, идя по лесу, он находил по одному грибу каждые 50 метров, в итоге к концу прогулки у него в корзинке было 25 грибов. Какое расстояние прошел Вадим.",
            answer = "1250 метров"
        ),
        RiddleResponseRemote(
            question = "Король пригласил для участия в турнире 15 бравых рыцарей, перед началом турнира все они отдали друг другу воинские почести. Сколько приветствий было всего отдано ими друг другу?.",
            answer = "105"
        ),
        RiddleResponseRemote(
            question = "Каждый День рождения сын получал от родителей по одной книге, последнюю он получил после окончания института, прибавив ее к пяти уже имеющимся у него. Сколько лет сыну, и какого числа он родился.",
            answer = "24 года, 29 февралят"
        ),
        RiddleResponseRemote(
            question = "К реке подходят два человека. У берега лодка, которая может выдержать только одного. Оба человека переправились на противоположный берег. Как?",
            answer = "Они были на разных берегах."
        ),
        RiddleResponseRemote(
            question = "У кого усы длиннее ног?",
            answer = "У таракана"
        ),
        RiddleResponseRemote(
            question = "Знаменитый фокусник говорит, что может поставить бутылку в центре комнаты и вползти в нее. Как это?",
            answer = "Вползти в комнату может каждый."
        ),
        RiddleResponseRemote(
            question = "Какое число получится, если перемножить все цифры на цифровой клавиатуре телефона?",
            answer = "Ноль, потому что любое число, умноженное на 0, всегда будет равно нулю."
        ),
        RiddleResponseRemote(
            question = "Утка получила 9 долларов, паук — 36 долларов, пчела — 27 долларов. Основываясь на этой информации, сколько денег дадут кошке?",
            answer = "18 долларов (4,50 доллара за лапу)."
        ),
        RiddleResponseRemote(
            question = "Когда Джошу было 8 лет, его брат был вдвое моложе его. Теперь, когда Джошу 14 лет, сколько лет его брату?",
            answer = "Его брату 10 лет. Половина от 8 равна 4, поэтому брат Джоша на 4 года младше. Когда Джошу 14, его брат все еще на 4 года моложе, так что ему 10."
        ),
        RiddleResponseRemote(
            question = "Когда отцу был 31, мне 8. Сейчас он в два раза старше меня. Сколько мне лет?",
            answer = "Разница в возрасте 23 года, поэтому сыну должно быть 23 года, если отец был в два раза старше."
        ),
























    )
}