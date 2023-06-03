package com.sosinvitalii.database.riddles

import com.sosinvitalii.feature.riddles.RiddleResponseRemote

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
            question = "Без окон, без дверей, полна комната людей. Что это?",
            answer = "Арбуз"
        ),
        RiddleResponseRemote(
            question = "На ногах сидит, сам он на ногах не стоит. Что это?",
            answer = "Ботинок"
        ),
        RiddleResponseRemote(
            question = "Маленький домик, в нем одна дверца и окон нет. Что это?",
            answer = "Яйцо"
        ),
        RiddleResponseRemote(
            question = "Стоит домик, в нем два окна, в каждом окне по четыре стекла. Что это?",
            answer = "Автобус"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть с закрытыми глазами?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Бежит, но не двигается с места. Что это?",
            answer = "Холодильник"
        ),
        RiddleResponseRemote(
            question = "Что умеет ходить, но никуда не ходит?",
            answer = "Часы"
        ),
        RiddleResponseRemote(
            question = "Стоит столб, на столбе ведро, в ведре гвоздь, на гвозде шелк. Что это?",
            answer = "Клубника на ветке"
        ),
        RiddleResponseRemote(
            question = "Что больше, чем слон и ничего не весит?",
            answer = "Тень слона"
        ),
        RiddleResponseRemote(
            question = "У нее есть крышка, но это не котелок. Ее можно открыть, но это не дверь. Что это?",
            answer = "Книга"
        ),
        RiddleResponseRemote(
            question = "У кого хвостик на переднем плане?",
            answer = "У монеты"
        ),
        RiddleResponseRemote(
            question = "Что вы увидите дважды в 'Момент', один раз в 'Минуту', но ни разу в 'Тысячелетие'?",
            answer = "Буква 'М'"
        ),
        RiddleResponseRemote(
            question = "Кто сидит на стуле и не сидит, бежит и не уходит?",
            answer = "Река"
        ),
        RiddleResponseRemote(
            question = "Что может взойти на гору со льдом, а спуститься без него?",
            answer = "Чайник"
        ),
        RiddleResponseRemote(
            question = "Маленькая девочка бросила мяч. Он вернулся к ней, не ударившись ни об одну поверхность. Как это возможно?",
            answer = "Она бросила мяч вверх"
        ),
        RiddleResponseRemote(
            question = "Начинается на 'П' и заканчивается на 'А', полно сока, но не яблоко. Что это?",
            answer = "Помидора"
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
            question = "Будет ли считаться коробкой, если в ней нет крышки?",
            answer = "Да, коробка не обязательно должна иметь крышку"
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
            question = "Что принадлежит вам, но другие им пользуются больше, чем вы?",
            answer = "Ваше имя"
        ),
        RiddleResponseRemote(
            question = "Что всегда движется вперед, но никогда не движется назад?",
            answer = "Время"
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
            question = "Какой предмет умеет прыгать, петь и танцевать?",
            answer = "Музыкальная шкатулка"
        ),
        RiddleResponseRemote(
            question = "Если бросить его – он останется целым, если положить – разобьется. Что это?",
            answer = "Пузырек"
        ),
        RiddleResponseRemote(
            question = "Что бежит, но не ходит, шипит, но не кусает?",
            answer = "Чайник"
        ),
        RiddleResponseRemote(
            question = "Какой вопрос невозможно задать, услышав ответ 'да'?",
            answer = "Ты спишь?"
        ),
        RiddleResponseRemote(
            question = "Без кого никто не может прожить и дня?",
            answer = "Сердца"
        ),
        RiddleResponseRemote(
            question = "Что вы можете увидеть одним глазом, но не двумя?",
            answer = "Боковой обзор"
        ),
        RiddleResponseRemote(
            question = "Я могу быть сломан без касания. Что это?",
            answer = "Обещание"
        ),
        RiddleResponseRemote(
            question = "Что сначала идет и следует за вами, когда вы встаете, а потом идет перед вами, когда вы идете?",
            answer = "Тени"
        ),
        RiddleResponseRemote(
            question = "Что бежит весь день и никогда не устает?",
            answer = "Вода в реке"
        ),
        RiddleResponseRemote(
            question = "Если два часа одинаковые, какой будет вес часов?",
            answer = "Одинаковый"
        ),
        RiddleResponseRemote(
            question = "Что такое, когда его делаешь, ты видишь его, но другие не видят?",
            answer = "Мечту"
        ),
        RiddleResponseRemote(
            question = "Что может быть полным и пустым одновременно?",
            answer = "Яйцо"
        ),
        RiddleResponseRemote(
            question = "Что всегда впереди у тебя, но ты его не видишь?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Какой остров передвигается?",
            answer = "Трафарет"
        ),
        RiddleResponseRemote(
            question = "Что проходит через города и поля, но не движется?",
            answer = "Дорога"
        ),
        RiddleResponseRemote(
            question = "Что принадлежит вам, но другие его используют больше вас?",
            answer = "Ваше имя"
        ),
        RiddleResponseRemote(
            question = "Что вырастает вверх корнями?",
            answer = "Зубы"
        ),
        RiddleResponseRemote(
            question = "Какой вещи не хватает вечером, но она есть утром?",
            answer = "Света"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, но нельзя сломать головой?",
            answer = "Загадку"
        ),
        RiddleResponseRemote(
            question = "Что такое, идет на четырех ногах утром, на двух ногах днем и на трех ногах вечером?",
            answer = "Человек"
        ),
        RiddleResponseRemote(
            question = "Без окон, без дверей, полна комната людей. Что это?",
            answer = "Арбуз"
        ),
        RiddleResponseRemote(
            question = "Кто его создает, тот его не нуждается. Тот, кто покупает, не использует. Тот, кто использует, не знает, что использует. Что это?",
            answer = "Гробница"
        ),
        RiddleResponseRemote(
            question = "У нее есть крышка, но это не котелок. Ее можно открыть, но это не дверь. Что это?",
            answer = "Книга"
        ),
        RiddleResponseRemote(
            question = "Что висит в воздухе и не падает?",
            answer = "Вопрос"
        ),
        RiddleResponseRemote(
            question = "Висит груша, нельзя скушать. Что это?",
            answer = "Лампочка"
        ),
        RiddleResponseRemote(
            question = "Что можно сделать только один раз?",
            answer = "Дышать"
        ),
        RiddleResponseRemote(
            question = "Что делает один шаг, становится все меньше и меньше?",
            answer = "Лестница"
        ),
        RiddleResponseRemote(
            question = "Кто его делает, тот его не нуждается. Кто его покупает, тот не знает, что делает. Кто его использует, тот не знает, что использует. Что это?",
            answer = "Гроб"
        ),
        RiddleResponseRemote(
            question = "Что может быть полным и пустым одновременно?",
            answer = "Яйцо"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого человека, и оно всегда заканчивается на число 5?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что может взойти на гору со льдом, но спуститься без него?",
            answer = "Чайник"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть дважды в 'Момент', один раз в 'Минуту', но ни разу в 'Тысячелетие'?",
            answer = "Буква 'М'"
        ),
        RiddleResponseRemote(
            question = "Кто утром ходит на четырех ногах, днем на двух, а вечером на трех?",
            answer = "Человек"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, но нельзя сломать головой?",
            answer = "Загадку"
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
            question = "Что всегда идет вверх, но никогда не спускается?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что висит в воздухе и никогда не падает?",
            answer = "Вопрос"
        ),
        RiddleResponseRemote(
            question = "Что вам принадлежит, но другие люди используют его чаще вас?",
            answer = "Ваше имя"
        ),
        RiddleResponseRemote(
            question = "Что можно взять в руку, но нельзя потрогать?",
            answer = "Фотография"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать своим голосом?",
            answer = "Тишина"
        ),
        RiddleResponseRemote(
            question = "Что упадет на землю, но не причинит вреда?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Что можно услышать, но нельзя увидеть?",
            answer = "Эхо"
        ),
        RiddleResponseRemote(
            question = "Что у людей есть только двое, а у птиц только одно?",
            answer = "Имя"
        ),
        RiddleResponseRemote(
            question = "Что можно разбить, но не упасть?",
            answer = "Рекорд"
        ),
        RiddleResponseRemote(
            question = "Что начинается с головы и заканчивается хвостом?",
            answer = "Удав"
        ),
        RiddleResponseRemote(
            question = "Что всегда приходит, но никогда не приходит вовремя?",
            answer = "Завтра"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть с закрытыми глазами?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Что двигается, не имеет ног, и всегда находится на том же месте?",
            answer = "Часы"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого, и каждый день становится все меньше и меньше?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что делают когда на них нажимают?",
            answer = "Ручки"
        ),
        RiddleResponseRemote(
            question = "Что нельзя ни взять, ни подержать, но всегда можно удержать?",
            answer = "Дыхание"
        ),
        RiddleResponseRemote(
            question = "Что бывает дважды в неделю, а один раз в год, но никогда не бывает дважды в день?",
            answer = "Буква 'е'"
        ),
        RiddleResponseRemote(
            question = "Что может быть полным, но не иметь веса?",
            answer = "Воздух"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть с закрытыми глазами?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Что бегает, но никогда не устает?",
            answer = "Вода"
        ),
        RiddleResponseRemote(
            question = "Что улетает, но никогда не улетит?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что вставляют в замок, но не открывают дверь?",
            answer = "Ключ"
        ),
        RiddleResponseRemote(
            question = "Что каждый человек имеет, но никто не может потерять?",
            answer = "Голос"
        ),
        RiddleResponseRemote(
            question = "Что всегда бежит, но никогда не ходит?",
            answer = "Вода в реке"
        ),
        RiddleResponseRemote(
            question = "Что нельзя увидеть, но всегда есть?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Что нельзя скачать с Интернета?",
            answer = "Воздух"
        ),
        RiddleResponseRemote(
            question = "Что начинается с 'у' и заканчивается на 'у', но имеет тысячу букв?",
            answer = "Упаковка"
        ),
        RiddleResponseRemote(
            question = "Что можно взять, но нельзя отдать?",
            answer = "Совет"
        ),
        RiddleResponseRemote(
            question = "Что бывает один раз в минуту, дважды в миг, но никогда в тысячелетии?",
            answer = "Буква 'м'"
        ),
        RiddleResponseRemote(
            question = "Что у всех есть, но у каждого свое?",
            answer = "Имя"
        ),
        RiddleResponseRemote(
            question = "Что становится меньше, когда ты об этом говоришь?",
            answer = "Тайна"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого, но нельзя увидеть?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать голосом?",
            answer = "Тишина"
        ),
        RiddleResponseRemote(
            question = "Что упадет на землю, но не причинит вреда?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Что можно услышать, но нельзя увидеть?",
            answer = "Эхо"
        ),
        RiddleResponseRemote(
            question = "Что у людей есть только двое, а у птиц только одно?",
            answer = "Имя"
        ),
        RiddleResponseRemote(
            question = "Что можно разбить, но не упасть?",
            answer = "Рекорд"
        ),
        RiddleResponseRemote(
            question = "Что начинается с головы и заканчивается хвостом?",
            answer = "Удав"
        ),
        RiddleResponseRemote(
            question = "Что всегда приходит, но никогда не приходит вовремя?",
            answer = "Завтра"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть с закрытыми глазами?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Что двигается, не имеет ног, и всегда находится на том же месте?",
            answer = "Часы"
        ),
        RiddleResponseRemote(
            question = "Что у каждого, и каждый день становится все меньше и меньше?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что вставляют в замок, но не открывают дверь?",
            answer = "Ключ"
        ),
        RiddleResponseRemote(
            question = "Что каждый человек имеет, но никто не может потерять?",
            answer = "Голос"
        ),
        RiddleResponseRemote(
            question = "Что всегда бежит, но никогда не ходит?",
            answer = "Вода в реке"
        ),
        RiddleResponseRemote(
            question = "Что нельзя увидеть, но всегда есть?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Что нельзя скачать с Интернета?",
            answer = "Воздух"
        ),
        RiddleResponseRemote(
            question = "Что начинается с 'у' и заканчивается на 'у', но имеет тысячу букв?",
            answer = "Упаковка"
        ),
        RiddleResponseRemote(
            question = "Что можно взять, но нельзя отдать?",
            answer = "Совет"
        ),
        RiddleResponseRemote(
            question = "Что бывает один раз в минуту, дважды в миг, но никогда в тысячелетии?",
            answer = "Буква 'м'"
        ),
        RiddleResponseRemote(
            question = "Что у всех есть, но у каждого свое?",
            answer = "Имя"
        ),
        RiddleResponseRemote(
            question = "Что становится меньше, когда ты об этом говоришь?",
            answer = "Тайна"
        ),
        RiddleResponseRemote(
            question = "Что каждый день растет, но никогда не станет взрослым?",
            answer = "Волосы"
        ),
        RiddleResponseRemote(
            question = "Что не имеет веса, но можно положить в мешок?",
            answer = "Воздух"
        ),
        RiddleResponseRemote(
            question = "Что падает, но никогда не разбивается?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Что несется вперед, но никогда не двигается?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что можно взять в руку, но нельзя сжать?",
            answer = "Фотография"
        ),
        RiddleResponseRemote(
            question = "Что идет по воде, но не тонет?",
            answer = "Лед"
        ),
        RiddleResponseRemote(
            question = "Что у каждого есть, но никто не видит?",
            answer = "Имя"
        )
    )

    private val hardRiddles = listOf(
        RiddleResponseRemote(
            question = "Я расту, но не становлюсь старше. Что я?",
            answer = "Дерево"
        ),
        RiddleResponseRemote(
            question = "Что такое: маленькое, зеленое, треугольное, перевернешь - красное квадратное?",
            answer = "Арбуз"
        ),
        RiddleResponseRemote(
            question = "Если вы прыгнете с самолета, что вам нужно, чтобы выжить?",
            answer = "Самолет должен быть на земле, когда вы прыгаете"
        ),
        RiddleResponseRemote(
            question = "Если бы у рыб были карманы, что бы они в них носили?",
            answer = "Маленькие ручные зонтики"
        ),
        RiddleResponseRemote(
            question = "Какие люди в году не едят пару месяцев?",
            answer = "Все. Январь и Февраль, ведь, эти месяцы проходят только один раз в году"
        ),
        RiddleResponseRemote(
            question = "Можно ли бросить сумку через Москву-реку?",
            answer = "Можно, если у вас есть достаточно сильное плечо и небольшая сумка"
        ),
        RiddleResponseRemote(
            question = "Что такое: круглое, оранжевое, в него входит много людей, но выходят только двое?",
            answer = "Баскетбольный мяч"
        ),
        RiddleResponseRemote(
            question = "Какую шляпу нельзя надеть на голову?",
            answer = "Пирожное"
        ),
        RiddleResponseRemote(
            question = "Что такое: никуда не уходит, но всегда в дороге?",
            answer = "Дорога"
        ),
        RiddleResponseRemote(
            question = "Что можно взять, но нельзя удержать?",
            answer = "Дыхание"
        ),
        RiddleResponseRemote(
            question = "Что такое: больше, чем бог, злее, чем дьявол, бедные имеют это, богатые этого нуждаются, и если ты это съешь, ты умрешь?",
            answer = "Ничто"
        ),
        RiddleResponseRemote(
            question = "Братья и сестры у меня нет, но тот человек является сыном отца моего отца. Кто это?",
            answer = "Это я"
        ),
        RiddleResponseRemote(
            question = "Какой вагон движется быстрее, первый или последний, когда поезд выходит из туннеля?",
            answer = "Оба вагона движутся с одинаковой скоростью"
        ),
        RiddleResponseRemote(
            question = "Есть два ребенка: одному 4 года, а другому 5 лет. Однако они оба родились в этом же году. Как такое возможно?",
            answer = "Они являются близнецами, родившимися в разные стороны года (декабрь и январь)"
        ),
        RiddleResponseRemote(
            question = "У человека 20 яблок, и он хочет пересечь реку, которая запрещает перевозку яблок. Человек может вынести только одно яблоко за раз, и у него нет никакого сосуда или мешка. Как ему перевезти все яблоки через реку?",
            answer = "Он мог бы съесть яблоки перед переходом, а затем перевезти семена"
        ),
        RiddleResponseRemote(
            question = "Меня можно видеть только один раз в минуту, два раза в момент и ни разу в тысячелетии. Что я?",
            answer = "Буква 'м'"
        ),
        RiddleResponseRemote(
            question = "Что может быть сломлено, но никогда не может быть держано?",
            answer = "Обещание"
        ),
        RiddleResponseRemote(
            question = "Какие три числа, ни одно из которых не равно нулю, дают сумму 20, и если вы умножите их все вместе, вы получите 210?",
            answer = "7, 7 и 6"
        ),
        RiddleResponseRemote(
            question = "Я нахожусь перед вами, но вы не можете меня видеть. Что я?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Какой вопрос нельзя ответить «да»?",
            answer = "Ты спишь?"
        ),
        RiddleResponseRemote(
            question = "Я умираю, когда я пью, и оживаю, когда я ем. Что я?",
            answer = "Огонь"
        ),
        RiddleResponseRemote(
            question = "Как можно бросить сырое яйцо на бетонный пол, чтобы оно не разбилось?",
            answer = "Любым способом. Сырое яйцо не сможет разбить бетонный пол"
        ),
        RiddleResponseRemote(
            question = "Какое слово становится короче, когда вы добавляете две буквы к нему?",
            answer = "Короткое"
        ),
        RiddleResponseRemote(
            question = "Что вы можете держать в правой руке, но не в левой?",
            answer = "Вашу левую руку"
        ),
        RiddleResponseRemote(
            question = "Что принадлежит вам, но другие люди его используют больше, чем вы?",
            answer = "Ваше имя"
        ),
        RiddleResponseRemote(
            question = "Если два часа назад время было позади на два часа, какое время будет через четыре часа?",
            answer = "Время будет на два часа впереди от текущего"
        ),
        RiddleResponseRemote(
            question = "Женщина родила двоих детей в одно и то же время, но они не близнецы. Как это может быть?",
            answer = "Они были тройняшками"
        ),
        RiddleResponseRemote(
            question = "В комнате 10 людей, и каждый человек видит других 8. Как это возможно?",
            answer = "Они все находятся перед зеркалом"
        ),
        RiddleResponseRemote(
            question = "В чем разница между букой и ведром?",
            answer = "Буква 'р'"
        ),
        RiddleResponseRemote(
            question = "Что такое: есть голова, есть хвост, но нет тела?",
            answer = "Монета"
        ),
        RiddleResponseRemote(
            question = "Кто говорит, не говоря ничего?",
            answer = "Мим"
        ),
        RiddleResponseRemote(
            question = "Какая река протекает в столовой?",
            answer = "Река Сахара (сахар)"
        ),
        RiddleResponseRemote(
            question = "Что увеличивается каждый день, но остается всегда того же размера?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "У меня много глаз, но я не вижу. Что я?",
            answer = "Кубик"
        ),
        RiddleResponseRemote(
            question = "Какой путь быстрее: от А до Б или от Б до А?",
            answer = "Путь от А до Б и от Б до А - один и тот же путь, поэтому они равны"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть с закрытыми глазами?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Я есть у каждого, кто меня носит, но я никогда не моюсь. Что я?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Какое слово становится длиннее, когда вы удаляете одну букву из него?",
            answer = "Длинное"
        ),
        RiddleResponseRemote(
            question = "Я не живой, но я расту, у меня нет легких, но я требую воздух. Что я?",
            answer = "Огонь"
        ),
        RiddleResponseRemote(
            question = "Что может быть легким, как перо, но даже самый сильный человек не может его подержать долго?",
            answer = "Дыхание"
        ),
        RiddleResponseRemote(
            question = "Я иду по всему миру, но всегда остаюсь в углу. Что я?",
            answer = "Марка"
        ),
        RiddleResponseRemote(
            question = "Если у вас есть меня, вы хотите поделиться мной. Если вы поделитесь мной, вы меня не имеете. Что я?",
            answer = "Секрет"
        ),
        RiddleResponseRemote(
            question = "Я пролетаю по всему городу, но никогда не взлетаю. Что я?",
            answer = "Улица"
        ),
        RiddleResponseRemote(
            question = "В каком слове «с» стоит на месте «к»?",
            answer = "Слово"
        ),
        RiddleResponseRemote(
            question = "Можно ли дважды встать на одну и ту же реку?",
            answer = "Нет, потому что вода в реке все время меняется"
        ),
        RiddleResponseRemote(
            question = "Что бегает весь день, а остается на месте?",
            answer = "Часы"
        ),
        RiddleResponseRemote(
            question = "Что всегда возвращается, но никогда не уходит?",
            answer = "Эхо"
        ),
        RiddleResponseRemote(
            question = "Что выходит из дома, затем возвращается домой, а затем исчезает, только если его дверь закрыта?",
            answer = "Ключ"
        ),
        RiddleResponseRemote(
            question = "Что может пройти через стены и двери, но никогда не может войти?",
            answer = "Свет"
        ),
        RiddleResponseRemote(
            question = "Я всегда перед вами, но вы никогда не видите меня. День за днем я здесь, но я часто забываюсь. Что я?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть одним глазом, но не двумя?",
            answer = "Боковое зрение одного глаза"
        ),
        RiddleResponseRemote(
            question = "Что происходит дважды в моменте, один раз в минуту и ни разу в тысячу лет?",
            answer = "Буква 'м'"
        ),
        RiddleResponseRemote(
            question = "Больше, чем Бог, хуже, чем Дьявол. Бедные люди имеют его. Богатые люди этого не хотят. Если вы его съедите, вы умрете. Что это?",
            answer = "Ничто"
        ),
        RiddleResponseRemote(
            question = "Что бегает, но не ходит, имеет рот, но не кушает, имеет голову, но не мыслит, имеет кровать, но не спит?",
            answer = "Река"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, даже если оно никогда не бросается и не ударяется?",
            answer = "Молчание"
        ),
        RiddleResponseRemote(
            question = "Что увеличивается каждый раз, когда вы его берете?",
            answer = "Яма"
        ),
        RiddleResponseRemote(
            question = "У меня нет веса, я могу быть виден, и если вы меня поместите в бочку, я сделаю ее легче. Что я?",
            answer = "Дыра"
        ),
        RiddleResponseRemote(
            question = "Какую вещь люди всегда берут с собой, но никогда не используют?",
            answer = "Ваши пальцы на ногах"
        ),
        RiddleResponseRemote(
            question = "Что может быть взято перед вами, чтобы сделать вас видимыми?",
            answer = "Ваше фото"
        ),
        RiddleResponseRemote(
            question = "Что у всех есть, но никогда не меняется?",
            answer = "Прошлое"
        ),
        RiddleResponseRemote(
            question = "У меня нет перьев, чтобы летать. У меня нет легких, чтобы дышать. У меня нет жизни, но я расту. Что я?",
            answer = "Огонь"
        ),
        RiddleResponseRemote(
            question = "Вы входите в комнату, где есть кролик с морковкой, свинья с яблоком и курица с зерном. Сколько животных вы увидели в комнате?",
            answer = "Три животных: кролик, свинья и курица"
        ),
        RiddleResponseRemote(
            question = "Что может пройти через стекло, не разбив его?",
            answer = "Свет"
        ),
        RiddleResponseRemote(
            question = "Я есть у каждого, у меня нет веса, но если меня потерять, то человек может умереть. Что я?",
            answer = "Дыхание"
        ),
        RiddleResponseRemote(
            question = "У меня есть сотни рук, но не могу держать вещи. Что я?",
            answer = "Дерево"
        ),
        RiddleResponseRemote(
            question = "Что всегда поднимается и никогда не опускается?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Я всегда там, где ничего нет. Если там что-то есть, то меня уже нет. Что я?",
            answer = "Пустота"
        ),
        RiddleResponseRemote(
            question = "Я становлюсь больше, когда меня едят, но умираю, когда пью. Что я?",
            answer = "Огонь"
        ),
        RiddleResponseRemote(
            question = "У меня есть ключи, но нет замков. Я есть у компьютеров, но не у дверей. Что я?",
            answer = "Клавиатура"
        ),
        RiddleResponseRemote(
            question = "Когда вы добавляете две к нему, двенадцать становится десятью. Как так?",
            answer = "Когда вы добавляете две к двенадцати, вы получаете 14. Но если вы считаете по системе счисления по основанию 12, то 14 будет записано как 10"
        ),
        RiddleResponseRemote(
            question = "Я имею глаза, но не вижу. Что я?",
            answer = "Игла"
        ),
        RiddleResponseRemote(
            question = "Что делает каждый человек дважды в своей жизни, но никогда не делает трижды?",
            answer = "Дышит"
        ),
        RiddleResponseRemote(
            question = "Маленькая девочка смотрит на картину. Ее мама спрашивает: 'Что ты видишь?' Девочка отвечает: 'Я вижу отца и его маму, но отца нет у его мамы.' Как это возможно?",
            answer = "Это портрет девочки, на котором изображены ее отец и его мама"
        ),
        RiddleResponseRemote(
            question = "У меня есть руки, но не могу поднять что-либо. Что я?",
            answer = "Часы"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, даже если это не сломается?",
            answer = "Тишина"
        ),
        RiddleResponseRemote(
            question = "Кто меня делает, тот меня не использует. Тот, кто меня использует, не знает, что он меня делает. Что это?",
            answer = "Гробница"
        ),
        RiddleResponseRemote(
            question = "У меня много ключей, но ни одного замка. Что я?",
            answer = "Фортепиано"
        ),
        RiddleResponseRemote(
            question = "Что делаете, стоя на одной ноге, и что делаете, стоя на двух ногах, но никогда не делаете, стоя на трех ногах?",
            answer = "Подумайте"
        ),
        RiddleResponseRemote(
            question = "Кто я, если я не я, и где я, если я не здесь?",
            answer = "Загадка"
        ),
        RiddleResponseRemote(
            question = "Я умею говорить, но не имею рта. Я имею почти всю информацию, но никогда не знаю все. Что я?",
            answer = "Словарь"
        ),
        RiddleResponseRemote(
            question = "У меня есть горло, но не могу глотать. У меня есть нос, но не могу нюхать. Что я?",
            answer = "Бутылка"
        ),
        RiddleResponseRemote(
            question = "Что всегда идет, но никогда не идет в гору?",
            answer = "Вода"
        ),
        RiddleResponseRemote(
            question = "Как можно разделить комнату пополам, с помощью одной стены?",
            answer = "Сделать две половинки"
        ),
        RiddleResponseRemote(
            question = "У меня много ключей, но никаких замков. Что я?",
            answer = "Фортепиано"
        ),
        RiddleResponseRemote(
            question = "Что имеет глаза, но не видит?",
            answer = "Игла"
        ),
        RiddleResponseRemote(
            question = "Что может бежать, но не может ходить?",
            answer = "Метро"
        ),
        RiddleResponseRemote(
            question = "Что может летать без крыльев?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Я полна дыр, но могу держать воду. Что я?",
            answer = "Сито"
        ),
        RiddleResponseRemote(
            question = "Что может быть сломано, если оно никогда не падает?",
            answer = "Обещание"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть дважды в неделю, однажды в году и никогда в одном дне?",
            answer = "Буква 'е'"
        ),
        RiddleResponseRemote(
            question = "Что у человека две, у животного одна, а у птицы нет?",
            answer = "Буква 'о'"
        ),
        RiddleResponseRemote(
            question = "Что может путешествовать по всему миру, не двигаясь с места?",
            answer = "Марка на почтовой открытке"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть в минуту, но не в секунду, и только раз в год, но никогда в неделю?",
            answer = "Буква 'm' (эм)"
        ),
        RiddleResponseRemote(
            question = "Что может быть большим, маленьким, толстым и тонким одновременно?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "У меня есть ключ, но нет замка. У меня есть много букв, но нет слова. Что я?",
            answer = "Клавиатура"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, падая, но невозможно сломать, принимая?",
            answer = "Обещание"
        ),
        RiddleResponseRemote(
            question = "Что можно получить, не делая, и потерять, не теряя?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Можно ли пить чашку кофе на пустой желудок?",
            answer = "Да, можно. После того, как вы выпьете кофе, чашка будет уже не пустой"
        ),
        RiddleResponseRemote(
            question = "Что всегда идет, но никогда не шагает?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что имеет глаза, но не может видеть?",
            answer = "Игла"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, но нельзя потрогать?",
            answer = "Обещание"
        ),
        RiddleResponseRemote(
            question = "Что имеет глаза, но не может видеть?",
            answer = "Игла"
        ),
        RiddleResponseRemote(
            question = "Что у человека есть только одно, у коровы два, а у птицы нет?",
            answer = "Буква 'о'"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, падая, но невозможно сломать, принимая?",
            answer = "Обещание"
        ),
        RiddleResponseRemote(
            question = "Что всегда идет, но никогда не шагает?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Какое слово становится короче, когда вы добавляете две буквы к нему?",
            answer = "Короткое"
        ),
        RiddleResponseRemote(
            question = "Что можно взять, но нельзя подержать?",
            answer = "Фотография"
        ),
        RiddleResponseRemote(
            question = "Что идет по дороге и плачет?",
            answer = "Машина (из-за выхлопных газов)"
        ),
        RiddleResponseRemote(
            question = "Что вставляется в себя, чтобы получить ответ?",
            answer = "Ключ"
        ),
        RiddleResponseRemote(
            question = "Что у каждого человека есть, но никто не может увидеть?",
            answer = "Мозг"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать только попыткой исправить его?",
            answer = "Молчание"
        ),
        RiddleResponseRemote(
            question = "Что можно положить в карман, но не взять в кармане?",
            answer = "Дырка"
        ),
        RiddleResponseRemote(
            question = "Что идет вверх, когда дождь идет вниз?",
            answer = "Зонтик"
        ),
        RiddleResponseRemote(
            question = "Что увеличивается, когда вы делите его?",
            answer = "Деление"
        ),
        RiddleResponseRemote(
            question = "Что идет вверх, но никогда не спускается?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что может летать без крыльев?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что имеет глаза, но не видит?",
            answer = "Игла"
        ),
        RiddleResponseRemote(
            question = "Что может быть большим, маленьким, толстым и тонким одновременно?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, падая, но невозможно сломать, поднимая?",
            answer = "Обещание"
        ),
        RiddleResponseRemote(
            question = "Что всегда уходит, но никогда не уходит?",
            answer = "Вчерашний день"
        ),
        RiddleResponseRemote(
            question = "У меня есть горло, но не могу глотать. У меня есть нос, но не могу нюхать. Что я?",
            answer = "Бутылка"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, падая с высоты, но невозможно сломать, бросая вниз?",
            answer = "Обещание"
        ),
        RiddleResponseRemote(
            question = "Что можно взять, но нельзя подержать?",
            answer = "Фотография"
        ),
        RiddleResponseRemote(
            question = "Что всегда возвращается, но никогда не уходит?",
            answer = "Эхо"
        ),
        RiddleResponseRemote(
            question = "Что легко сломать, но сложно починить?",
            answer = "Яйцо"
        ),
        RiddleResponseRemote(
            question = "Что бывает дважды в неделе, но никогда не в месяце?",
            answer = "Буква 'е'"
        ),
        RiddleResponseRemote(
            question = "Что нельзя увидеть, но можно услышать?",
            answer = "Тишина"
        ),
        RiddleResponseRemote(
            question = "Что имеет ключ, но не отпирает двери?",
            answer = "Пианино"
        ),
        RiddleResponseRemote(
            question = "Что можно взять, но нельзя вернуть?",
            answer = "Глубокий вдох"
        ),
        RiddleResponseRemote(
            question = "Что у каждого человека есть, но никто не видит?",
            answer = "Душа"
        ),
        RiddleResponseRemote(
            question = "Что не имеет начала, конца или середины?",
            answer = "Кольцо"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать только словом?",
            answer = "Молчание"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого человека, но каждый управляет им только один раз?",
            answer = "Жизнь"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть с закрытыми глазами?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Что можно найти в конце радуги?",
            answer = "Буква 'г'"
        ),
        RiddleResponseRemote(
            question = "Что всегда рядом, но никогда не приходит?",
            answer = "Завтра"
        ),
        RiddleResponseRemote(
            question = "Что летит без крыльев?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что умеет ходить вверх головой?",
            answer = "Утюг"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать, но нельзя починить?",
            answer = "Зеркало"
        ),
        RiddleResponseRemote(
            question = "Что будет больше с каждым использованием?",
            answer = "Разум"
        ),
        RiddleResponseRemote(
            question = "Что летает без крыльев и падает без торможения?",
            answer = "Время"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать одним прикосновением?",
            answer = "Сердце"
        ),
        RiddleResponseRemote(
            question = "Что всегда рядом с нами, но мы его не видим?",
            answer = "Воздух"
        ),
        RiddleResponseRemote(
            question = "Что есть у всех людей, но каждый человек его не знает?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Что можно сделать только один раз в жизни?",
            answer = "Родиться"
        ),
        RiddleResponseRemote(
            question = "Что может быть только настоящим, но никогда не происходит?",
            answer = "Момент"
        ),
        RiddleResponseRemote(
            question = "Что идет вверх и никогда не опускается?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что видит вас, но не может отвечать на вопросы?",
            answer = "Зеркало"
        ),
        RiddleResponseRemote(
            question = "Что можно взять, но нельзя вернуть?",
            answer = "Глубокий вдох"
        ),
        RiddleResponseRemote(
            question = "Что у каждого есть, но каждый не может увидеть?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Что может быть маленьким, как баклажан, но весить тонну?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Что идет вверх и никогда не спускается?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что может бежать, но не может ходить?",
            answer = "Носилки"
        ),
        RiddleResponseRemote(
            question = "Что есть у каждого, но каждый не может видеть?",
            answer = "Будущее"
        ),
        RiddleResponseRemote(
            question = "Что всегда возвращается, но никогда не остается?",
            answer = "Ответ"
        ),
        RiddleResponseRemote(
            question = "Что может полететь без крыльев?",
            answer = "Слух"
        ),
        RiddleResponseRemote(
            question = "Что всегда следует за вами, но никогда не догоняет вас?",
            answer = "Тень"
        ),
        RiddleResponseRemote(
            question = "Что начинается и заканчивается одной и той же буквой, но имеет тысячи букв?",
            answer = "Почта"
        ),
        RiddleResponseRemote(
            question = "Что всегда уходит, но никогда не уходит?",
            answer = "Вчерашний день"
        ),
        RiddleResponseRemote(
            question = "Что может быть больше, когда оно сломано?",
            answer = "Сердце"
        ),
        RiddleResponseRemote(
            question = "Что может быть невидимым, но всегда присутствует?",
            answer = "Воздух"
        ),
        RiddleResponseRemote(
            question = "Что у каждого человека есть, но каждый человек не замечает?",
            answer = "Нос"
        ),
        RiddleResponseRemote(
            question = "Что идет вверх и никогда не опускается?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что бежит, но никогда не ходит, о чем говорят, но никогда не говорит?",
            answer = "Вода"
        ),
        RiddleResponseRemote(
            question = "Что можно сломать одним словом?",
            answer = "Сердце"
        ),
        RiddleResponseRemote(
            question = "Что падает, но никогда не разбивается?",
            answer = "Ночь"
        ),
        RiddleResponseRemote(
            question = "Что можно увидеть с закрытыми глазами?",
            answer = "Сон"
        ),
        RiddleResponseRemote(
            question = "Что никогда не начинается и никогда не заканчивается?",
            answer = "Кольцо"
        ),
        RiddleResponseRemote(
            question = "Что всегда идет вверх, но никогда не спускается?",
            answer = "Возраст"
        ),
        RiddleResponseRemote(
            question = "Что у каждого есть, и у каждого есть только одно?",
            answer = "Имя"
        )
    )
}