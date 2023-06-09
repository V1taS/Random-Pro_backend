package com.sosinvitalii.database.names

/// Имена на русском языке
object RussianNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Александр",
        "Дмитрий",
        "Михаил",
        "Сергей",
        "Иван",
        "Андрей",
        "Николай",
        "Павел",
        "Алексей",
        "Владимир",
        "Анатолий",
        "Антон",
        "Аркадий",
        "Арсений",
        "Артем",
        "Борис",
        "Вадим",
        "Валентин",
        "Валерий",
        "Василий",
        "Виктор",
        "Виталий",
        "Владислав",
        "Вячеслав",
        "Геннадий",
        "Георгий",
        "Григорий",
        "Даниил",
        "Денис",
        "Евгений",
        "Егор",
        "Игорь",
        "Илья",
        "Кирилл",
        "Константин",
        "Лев",
        "Леонид",
        "Максим",
        "Матвей",
        "Никита",
        "Олег",
        "Петр",
        "Роман",
        "Станислав",
        "Тимофей",
        "Федор",
        "Юрий",
        "Ярослав",
        "Абрам",
        "Аваз",
        "Аввакум",
        "Адам",
        "Адис",
        "Адриан",
        "Азамат",
        "Азарий",
        "Азат",
        "Айдар",
        "Айнур",
        "Айрат",
        "Акакий",
        "Аким",
        "Алан",
        "Али",
        "Алихан",
        "Алмаз",
        "Альберт",
        "Альфред",
        "Амин",
        "Амир",
        "Андрэ",
        "Аполлинарий",
        "Армен",
        "Арнольд",
        "Арон",
        "Арсен",
        "Артемий,",
        "Артур",
        "Архип",
        "Аскольд",
        "Афанасий",
        "Ахмет",
        "Ашот",
        "Бенедикт",
        "Богдан",
        "Боголюб",
        "Бореслав",
        "Бруно",
        "Булат",
        "Вальтер",
        "Вилен",
        "Вилли",
        "Владлен",
        "Влас",
        "Всеволод",
        "Гавриил",
        "Гарри",
        "Гаяс,",
        "Генри",
        "Генрих",
        "Геральд",
        "Герасим",
        "Герман",
        "Глеб",
        "Гоар",
        "Гордей",
        "Гордон",
        "Гурий",
        "Густав",
        "Давид",
        "Дамир",
        "Данислав",
        "Джеймс",
        "Джордан",
        "Джорж",
        "Динар",
        "Добрыня",
        "Дональд",
        "Елизар",
        "Елисей",
        "Емельян",
        "Ермолай",
        "Ерофей",
        "Ефим",
        "Ефрем",
        "Жан",
        "Закир",
        "Замир",
        "Заур",
        "Захар",
        "Ибрагим",
        "Игнат",
        "Игнатий",
        "Измаил",
        "Илларион",
        "Ильшат",
        "Ильяс",
        "Инокентий",
        "Иоанн",
        "Иоаким",
        "Ион",
        "Иосиф",
        "Ипполит",
        "Ираклий",
        "Исаак",
        "Исидор",
        "Искандер",
        "Ислам",
        "Исмаил",
        "Камиль",
        "Карен",
        "Карим",
        "Карл",
        "Ким",
        "Кир",
        "Клавдий",
        "Клаус",
        "Клим",
        "Корней",
        "Кузьма",
        "Лавр",
        "Лаврентий",
        "Лазарь",
        "Леван",
        "Левон",
        "Леон",
        "Леонард",
        "Леонтий",
        "Леопольд",
        "Лука",
        "Лукьян",
        "Любомир",
        "Людвиг",
        "Люсьен",
        "Люций",
        "Май",
        "Майкл",
        "Макар",
        "Макарий",
        "Максимильян",
        "Максуд",
        "Мансур",
        "Марат",
        "Мариан",
        "Марк",
        "Марсель",
        "Мартин",
        "Махмуд",
        "Мефодий",
        "Милан",
        "Мирон",
        "Мирослав",
        "Митрофан",
        "Моисей",
        "Мстислав",
        "Мурат",
        "Мухаммед",
        "Назар",
        "Назарий",
        "Наиль",
        "Натан",
        "Нестор",
        "Никифор",
        "Никола",
        "Никон",
        "Нильс",
        "Нисон",
        "Онисим",
        "Остап",
        "Панкрат",
        "Парамон",
        "Платон",
        "Потап",
        "Прокофий",
        "Прохор",
        "Равиль",
        "Радий",
        "Радик",
        "Радомир",
        "Радослав",
        "Разиль",
        "Райан",
        "Раймонд",
        "Раис",
        "Рамазан",
        "Рамиз",
        "Рамиль",
        "Рафаэль",
        "Рафик",
        "Рашид",
        "Ринат",
        "Рихард",
        "Ричард",
        "Роберт",
        "Родион",
        "Ролан",
        "Ростислав",
        "Руслан",
        "Рустан",
        "Рушан",
        "Рэй",
        "Савва",
        "Савелий",
        "Самсон",
        "Самуил",
        "Святослав",
        "Севастьян",
        "Семен",
        "Серафим",
        "Сидор",
        "Сократ",
        "Соломон",
        "Спартак",
        "Спиридон",
        "Стакрат",
        "Степан",
        "Стефан",
        "Стивен",
        "Султан",
        "Тагир",
        "Тайлер",
        "Талик",
        "Тамаз",
        "Тамерлан",
        "Тарас",
        "Теодор",
        "Терентий",
        "Тигран",
        "Тимур",
        "Тихон",
        "Томас",
        "Трифон",
        "Трофим",
        "Умар",
        "Устин",
        "Фадей",
        "Фанис",
        "Фарид",
        "Фархад",
        "Федот",
        "Феликс",
        "Феодосий",
        "Фердинанд",
        "Филимон",
        "Филипп,",
        "Фома",
        "Фред",
        "Фридрих",
        "Хабиб",
        "Харитон",
        "Христиан",
        "Христос",
        "Христофор",
        "Цезарь",
        "Чарльз",
        "Чеслав",
        "Чингиз",
        "Шамиль",
        "Шарль",
        "Эдвард",
        "Эдгар",
        "Эдмунд",
        "Эдуард",
        "Эльдар",
        "Эмиль",
        "Эмин",
        "Эммануил",
        "Эраст",
        "Эрик",
        "Эрнест",
        "Юлиан",
        "Юлий",
        "Яков",
        "Ян",
        "Артём",
        "Фёдор",
        "Семён",
        "Яким",
        "Филипп",
        "Осип",
        "Артемий",
        "Ильдар",
        "Зиновий",
        "Юстин",
        "Ренат",
        "Вильгельм",
        "Рустам",
        "Бронислав",
        "Агафон",
        "Викторин",
        "Руслон",
        "Рубен",
        "Валерьян",
        "Зигмунд",
        "Мирко",
        "Рафаил",
        "Януарий",
        "Оскар",
        "Ростом",
        "Яромир",
        "Всеслав",
        "Аристарх",
        "Ждан",
        "Зенон",
        "Йосиф",
        "Кондрат",
        "Лукиан",
        "Маркел",
        "Наум",
        "Орест",
        "Пантелеймон",
        "Ренар",
        "Симон",
        "Тадеуш",
        "Фрол",
        "Харлампий",
        "Юхим",
        "Егорий",
        "Жорж",
        "Зенофонт",
        "Кассиан",
        "Ламар",
        "Орфей",
        "Павлин",
        "Разумник",
        "Саватий",
        "Твердислав",
        "Ульян",
        "Филофей",
        "Хасан",
        "Юст",
        "Ясон",
        "Викентий",
        "Гамлет",
        "Демид",
        "Жигер",
        "Лаймон",
        "Магомед",
        "Никитин",
        "Олесь",
        "Панкратий",
        "Ренато",
        "Теймураз",
        "Урбан",
        "Янис",
        "Артас",
        "Велор",
        "Даниэль",
        "Жорес",
        "Заурбек",
        "Иннокентий",
        "Порфирий",
        "Хаким",
        "Якуб",
        "Артемон",
        "Борислав",
        "Гайдар",
        "Джамал",
        "Жозеф",
        "Захария",
        "Романтик",
        "Саид",
        "Франц",
        "Эмир",
        "Жерар",
        "Евграф",
        "Аристид",
        "Базиль",
        "Вадимир",
        "Гриша",
        "Никитос",
        "Октавиан",
        "Савватий",
        "Фортунат",
        "Харламп",
        "Элиодор",
        "Юстас",
        "Ясоник",
        "Вениамин",
        "Галактион",
        "Демьян",
        "Изот",
        "Капитон",
        "Никанор",
        "Олимпий",
        "Паисий",
        "Фаддей",
        "Эмельян",
        "Юстиниан",
        "Антип",
        "Бажен",
        "Варлаам",
        "Зенонид",
        "Бертран",
        "Демидор",
        "Жизель",
        "Зосима",
        "Кирсан",
        "Леонидас",
        "Осипирон",
        "Радислав",
        "Самсоний",
        "Тихомир",
        "Ульрих",
        "Флорентий",
        "Ханс",
        "Элиозар",
        "Юрийл",
        "Яшар",
        "Благовест",
        "Венедикт",
        "Гаспар",
        "Донат",
        "Клавдиан",
        "Люциан",
        "Никандров",
        "Оливер",
        "Руфин",
        "Тихоний",
        "Устим",
        "Фортун",
        "Харалампий",
        "Эльмар",
        "Африкан",
        "Велизар",
        "Зосим",
        "Бертольд",
        "Гаврило",
        "Доброслав",
        "Жан-Поль",
        "Златан",
        "Конрад",
        "Лукас",
        "Миронид",
        "Назариус",
        "Пахом",
        "Самуэль",
        "Франциск",
        "Харпократ",
        "Эмилиан",
        "Виссарион",
        "Гаспарий",
        "Дорофей",
        "Зоран",
        "Иосифат",
        "Кристоф",
        "Люциано",
        "Нектарий",
        "Осман",
        "Пауль",
        "Святополк",
        "Устиний",
        "Францель",
        "Харуки",
        "Эмилий",
        "Юстиньян",
        "Яшма",
        "Афиноген",
        "Витомир",
        "Аристей",
        "Валериан",
        "Железко",
        "Зорий",
        "Измарагд"
    )

    private val femaleNames = listOf(
        "Александра",
        "Екатерина",
        "Анна",
        "Мария",
        "Ольга",
        "Татьяна",
        "Наталья",
        "Юлия",
        "Ирина",
        "Елена",
        "Виктория",
        "Светлана",
        "Марина",
        "Надежда",
        "Людмила",
        "Анастасия",
        "Инна",
        "Лариса",
        "Галина",
        "Оксана",
        "Евгения",
        "Алина",
        "Нина",
        "Дарья",
        "Маргарита",
        "Кристина",
        "Алиса",
        "Любовь",
        "Валентина",
        "Зинаида",
        "София",
        "Анжелика",
        "Наталия",
        "Эльвира",
        "Инесса",
        "Ида",
        "Софья",
        "Вера",
        "Ангелина",
        "Яна",
        "Ксения",
        "Аделина",
        "Ева",
        "Лилия",
        "Милана",
        "Василиса",
        "Валерия",
        "Лидия",
        "Майя",
        "Гульнара",
        "Лиана",
        "Регина",
        "Лилиана",
        "Мирослава",
        "Милена",
        "Эвелина",
        "Амелия",
        "Камилла",
        "Диана",
        "Мадина",
        "Лина",
        "Руслана",
        "Гузель",
        "Сабина",
        "Альбина",
        "Эмилия",
        "Рената",
        "Арина",
        "Вероника",
        "Илона",
        "Юлиана",
        "Милада",
        "Тамара",
        "Изабелла",
        "Алия",
        "Габриэлла",
        "Раиса",
        "Антонина",
        "Зарина",
        "Альфия",
        "Адель",
        "Анжела",
        "Ася",
        "Аэлита",
        "Белла",
        "Борислава",
        "Варвара",
        "Василина",
        "Влада",
        "Владислава",
        "Дана",
        "Дина",
        "Евангелина",
        "Елизавета",
        "Есения",
        "Жанна",
        "Злата",
        "Инга",
        "Карина",
        "Каролина",
        "Кира",
        "Клавдия",
        "Лада",
        "Лана",
        "Лейла",
        "Леся",
        "Лия",
        "Луиза",
        "Малика",
        "Марианна",
        "Марьяна",
        "Мила",
        "Милица",
        "Мира",
        "Назира",
        "Нелли",
        "Ника",
        "Нонна",
        "Олеся",
        "Полина",
        "Римма",
        "Руфина",
        "Сара",
        "Станислава",
        "Стелла",
        "Таисия",
        "Ульяна",
        "Фаина",
        "Христина",
        "Чеслава",
        "Эдита",
        "Элеонора",
        "Элина",
        "Эльза",
        "Эмма",
        "Ярослава",
        "Агата",
        "Агафья",
        "Ада",
        "Аида",
        "Алевтина",
        "Алла",
        "Амина",
        "Амира",
        "Анабель",
        "Анисия",
        "Анфиса",
        "Ариадна",
        "Ариана",
        "Артемида",
        "Берта",
        "Ванесса",
        "Васса",
        "Венера",
        "Весна",
        "Веста",
        "Вика",
        "Виргиния",
        "Владлена",
        "Всеслава",
        "Вячеслава",
        "Габриела",
        "Гаянэ",
        "Гелла",
        "Глафира",
        "Глория",
        "Грета",
        "Гульшат",
        "Дайна",
        "Даниела",
        "Джамиля",
        "Джемма",
        "Джулия",
        "Доминика",
        "Евдокия",
        "Зара",
        "Зарема",
        "Земфира",
        "Зоя",
        "Зульфия",
        "Иветта",
        "Изольда",
        "Илиана",
        "Ильзира",
        "Иоанна",
        "Иоланта",
        "Ираида",
        "Ирма",
        "Ия",
        "Капитолина",
        "Клара",
        "Лайма",
        "Лара",
        "Лаура",
        "Лукерья",
        "Лукреция",
        "Любава",
        "Люсия",
        "Люция",
        "Люцияна",
        "Макария",
        "Малена",
        "Матрена",
        "Медея",
        "Мелания",
        "Мелисса",
        "Мия",
        "Николь",
        "Нора",
        "Нурия",
        "Пелагея",
        "Прасковья",
        "Рада",
        "Рамзия",
        "Роза",
        "Розалия",
        "Роксана",
        "Рузана",
        "Рузиля",
        "Сабрина",
        "Саманта",
        "Селена",
        "Серафима",
        "Сильвия",
        "Симона",
        "Снежана",
        "Софи",
        "Сусанна",
        "Тамила",
        "Тереза",
        "Тина",
        "Фаиза",
        "Фатима",
        "Федора",
        "Фелиция",
        "Флора",
        "Флоренция",
        "Франческа",
        "Фрида",
        "Шакира",
        "Шарлотта",
        "Юна",
        "Янина",
        "Ясмина",
        "Ясна",
        "Августа",
        "Агнесса",
        "Агния",
        "Аделаида",
        "Аза",
        "Азалия",
        "Айгуль",
        "Айлин",
        "Айнагуль",
        "Айнур",
        "Айсель",
        "Аксинья",
        "Алена",
        "Алима",
        "Альберта",
        "Анаит",
        "Анисья",
        "Анита",
        "Ариэль",
        "Асия",
        "Ассоль",
        "Астра",
        "Афанасия",
        "Божена",
        "Ванда",
        "Габриелла",
        "Гаяна",
        "Даниэла",
        "Дарина",
        "Магдалина",
        "Марта",
        "Мэри",
        "Наиля",
        "Фаустинa",
        "Федосия",
        "Августина",
        "Авдотья",
        "Аврора",
        "Агапа",
        "Агафия",
        "Аглая",
        "Агнеса",
        "Аграфена",
        "Аделия",
        "Алекса",
        "Александрия",
        "Алёна",
        "Алеся",
        "Амалия",
        "Анатолия",
        "Ангелика",
        "Анджела",
        "Анелина",
        "Анетта",
        "Анжелина",
        "Антония",
        "Аня",
        "Аполлинария",
        "Арианна",
        "Барбара",
        "Беатриса",
        "Бела",
        "Богдана",
        "Виолетта",
        "Виталина",
        "Галя",
        "Дария",
        "Добрава",
        "Ира",
        "Катерина",
        "Катя",
        "Клариса",
        "Лика",
        "Лиля",
        "Лола",
        "Лолита",
        "Любомила",
        "Люся",
        "Максима",
        "Марлена",
        "Марфа",
        "Марьям",
        "Матильда",
        "Милослава",
        "Паулина",
        "Рая",
        "Риана",
        "Рита",
        "Саша",
        "Соня",
        "Элла",
        "Айша",
        "Аллах",
        "Альма",
        "Ангел",
        "Антонида",
        "Арьяна",
        "Багира",
        "Виола",
        "Далия",
        "Диночка",
        "Лена",
        "Манежа",
        "Мирра",
        "Михаил",
        "Назифа",
        "Олимпиада",
        "Офелия",
        "Райхана",
        "Рузалия",
        "Рэмисса",
        "Саида",
        "Самира",
        "Севара",
        "Урсула",
        "Фаузия",
        "Хава",
        "Хадия",
        "Ханна",
        "Харита",
        "Хасна",
        "Хелена",
        "Хильда",
        "Цветана",
        "Цветомира",
        "Чара",
        "Чулпан",
        "Шахноза",
        "Шерин",
        "Ширин",
        "Элис",
        "Эльмира",
        "Эльфира",
        "Эрика",
        "Эсмеральда",
        "Юнона",
        "Юстина",
        "Ядвига",
        "Аиша",
        "Бажена",
        "Беата",
        "Бронислава",
        "Велимира",
        "Вета",
        "Вилена",
        "Вита",
        "Власта",
        "Вольга",
        "Гайяна",
        "Генриетта",
        "Георгина",
        "Гера",
        "Гертруда",
        "Грация",
        "Гулия",
        "Гюзель",
        "Дженифер",
        "Джессика",
        "Джульетта",
        "Динара",
        "Дорофея",
        "Ефросиния",
        "Жаклин",
        "Жанетта",
        "Жозефина",
        "Жюли",
        "Забава",
        "Залина",
        "Замира",
        "Леокадия",
        "Мансура",
        "Мишель",
        "Наргиза",
        "Патриция",
        "Рема",
        "Рузалина",
        "Слава",
        "Фарида",
        "Илария",
        "Индира",
        "Исидора",
        "Касандра",
        "Элиза",
        "Леонора",
        "Стефания",
        "Эванора",
        "Амаранта",
        "Марисоль",
        "Викторинa",
        "Роксолана",
        "Октавия",
        "Стефанида",
        "Эвангелия",
        "Джулиана",
        "Савелина",
        "Нинель",
        "Валентинка",
        "Жасмин",
        "Ирэн",
        "Каролинэ",
        "Наташа",
        "Роксанда",
        "Гала",
        "Оксанда",
        "Ксантя",
        "Валериана",
        "Эмелина",
        "Ясмилия",
        "Лиора",
        "Эммануэлла",
        "Златалия",
        "Летиция",
        "Майяра",
        "Викторияна",
        "Рония",
        "Элена",
        "Ярина",
        "Оксения",
        "Стефанияна",
        "Миланда",
        "Элеонория",
        "Алсу",
        "Валерианка",
        "Женевьева",
        "Эмилиана",
        "Ирида",
        "Аннабель",
        "Каролинетта",
        "Лидиана",
        "Майярина",
        "Юлианна",
        "Никита",
        "Артемидалия",
        "Рокселана",
        "Эльзара",
        "Мелора",
        "Антонелла",
        "Оксандра",
        "Ксенияна",
        "Валеринка",
        "Эмбер",
        "Ясминия",
        "Сильвана",
        "Лионелла",
        "Алинда",
        "Нерис",
        "Эммауэль",
        "Заря",
        "Луизия",
        "Майяна",
        "Виолика",
        "Евелана",
        "Империя",
        "Розалина",
        "Элеонориса",
        "Ясминель",
        "Валерьяна",
        "Октябрина",
        "Миранда",
        "Элисон",
        "Ариэлла",
        "Аниса",
        "Амелияна",
        "Дженна",
        "Лилиса",
        "Сабриэль",
        "Никитарада",
        "Валерияна",
        "Жасмина",
        "Эммалина",
        "Ириса",
        "Аннелиса",
        "Лиллианна",
        "Юлиса",
        "Никольдина",
        "Артемиса",
        "Роксолия",
        "Эльзарина",
        "Гармония",
        "Мелория",
        "Анфелия",
        "Оксанель",
        "Ксениянара",
        "Валеринда",
        "Эмилианна",
        "Ярославия",
        "Синтия",
        "Линдия",
        "Алиана",
        "Николина"
    )
}