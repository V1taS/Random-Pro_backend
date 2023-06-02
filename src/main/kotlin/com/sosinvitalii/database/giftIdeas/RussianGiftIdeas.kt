package com.sosinvitalii.database.giftIdeas

import com.sosinvitalii.database.giftIdeas.Gender

object RussianGiftIdeas {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleGiftIdeas
        } else {
            femaleGiftIdeas
        }
    }

    private val maleGiftIdeas = listOf(
        "Швейцарские наручные часы",
        "Кожаный кошелёк",
        "Набор для барбекю",
        "Электронная книга",
        "Кофемашина",
        "Абонемент в спортзал или на игры в гольф",
        "Подписка на журнал или стриминговую платформу",
        "Стильная ручка и блокнот",
        "Набор качественного пива или вина",
        "Портативная акустическая система",
        "Набор для бритья",
        "Ретро видеоигры",
        "Профессиональный набор инструментов",
        "Сумка-мессенджер или рюкзак",
        "Умный домашний ассистент",
        "Увлажнитель воздуха",
        "Набор для суши",
        "Компактный бинокль",
        "Дрон для съемки видео",
        "Учебник или курс для изучения нового языка или навыка",
        "Настольная игра",
        "Футболка с логотипом любимой спортивной команды",
        "Браслет для фитнеса",
        "Компактный палатка для кемпинга",
        "Солнцезащитные очки",
        "Набор для приготовления пиццы",
        "Беспроводные наушники",
        "Опыт вождения спортивного автомобиля",
        "Бутылка винтажного вина или дорогого виски",
        "Книги или аудиокниги любимого автора",
        "Оригинальный нож для выживания",
        "3D пазл или конструктор",
        "Мягкий халат и тапочки",
        "Камера GoPro для экстремальных видов спорта",
        "Карта мира для путешественника",
        "Подарочный сертификат в любимый ресторан",
        "Набор для сборки модели корабля",
        "Портативный зарядный блок",
        "Термокружка",
        "Очки виртуальной реальности",
        "Стильный галстук или галстук-бабочка",
        "Сертификат на дегустацию вина",
        "Путеводитель по стране или городу, куда он хочет поехать",
        "Картина или постер с изображением любимой группы, фильма или героя",
        "Книга рецептов для любителей готовить",
        "Коврик для йоги или фитнеса",
        "Рыболовные принадлежности",
        "Настольная лампа для чтения",
        "Внешний жесткий диск или SSD",
        "Проектор для домашнего кинотеатра",
        "Умные часы",
        "Кожаный браслет",
        "Виниловые диски любимого исполнителя",
        "Рюмки для виски",
        "Записная книжка Moleskine",
        "Набор для выращивания домашних растений",
        "Микрофон для караоке",
        "Сумка для ноутбука",
        "Гриль для открытого огня",
        "Сет для крафтинга или DIY-проектов",
        "Подарочный сертификат на профессиональный массаж",
        "Набор для чистки обуви",
        "Качественный шампур для шашлыка",
        "Подписка на онлайн-мастер-классы по его хобби",
        "Сет коллекционных монет или марок",
        "Тематический календарь",
        "Сертификат на прыжок с парашютом",
        "Билеты на концерт или спортивное мероприятие",
        "Столешница для настольного тенниса",
        "Комфортные кроссовки или ботинки",
        "Подарочный набор гурмана (например, сыры, колбасы, шоколад)",
        "Профессиональная камера или объектив",
        "Умный браслет или фитнес-трекер",
        "Набор для покера",
        "Уроки гольфа или тенниса",
        "Станок для виниловых пластинок",
        "Подарочный сертификат на квест в реальности",
        "Смартфон последней модели",
        "Эксклюзивная кофейная подписка",
        "Подписка на онлайн-платформу для изучения иностранных языков",
        "Стильный брелок для ключей",
        "Подставка под горячее с индивидуальной гравировкой",
        "Термос для еды",
        "Модель радиоуправляемого автомобиля или вертолёта",
        "Памятный футбол или баскетбольный мяч",
        "Электрическая зубная щетка",
        "Мини-холодильник для напитков",
        "Уроки сомелье",
        "Билеты на тематический фестиваль",
        "Зарядная станция для электронных устройств",
        "Швейцарский армейский нож",
        "Подарочный набор эфирных масел для расслабления",
        "Набор для рисования или живописи",
        "Бутылка личного настоя виски или рома",
        "Подписка на годовой курс йоги или медитации",
        "Экшн-камера для экстремальных видов спорта",
        "Электронный браслет для следования за здоровым образом жизни",
        "Компактный массажёр",
        "Стильный кожаный ремень",
        "Домашний кинотеатр с проектором и акустической системой",
        "Заказной портрет или карикатура",
        "Винтажный стильный зонтик",
        "Уроки плавания или сертификат на погружение с аквалангом",
        "Ретро печатная машинка",
        "Компактная эспрессо-машина",
        "Художественная книга по интересующей его тематике",
        "Подарочный набор специй и соусов",
        "Ручная кофемолка",
        "Шашки или шахматы из дерева",
        "Подарочный набор для ухода за бородой",
        "Набор для виноделия",
        "Компактный переносной проектор для смартфона",
        "Набор для тайского бокса или другого боевого искусства",
        "Дорогой стильный зажигалка",
        "Станок для изготовления пива",
        "Светильник для книги",
        "Настольная игра с элементами стратегии",
        "Подарочный набор рыбака",
        "Шкатулка для часов или украшений",
        "Мини-бильярд на рабочий стол",
        "Вкусные гастрономические подарки (орехи, шоколад, деликатесы)",
        "Специализированная экипировка для велосипедистов",
        "Подписка на аудиокниги",
        "Бутылка хорошего грузинского вина",
        "Набор для глазурования бисквитов",
        "Сувенирный футболка или майка с уникальным дизайном",
        "Стильная головная убор (шапка, кепка, панама)",
        "Подарочный бокс с вином и сырами",
        "Настенная карта для отметки посещённых стран",
        "Набор для чистки фотоаппарата",
        "Книга по истории искусства или дизайна",
        "Бутылка дорогого коньяка или рома",
        "Учебник по изучению иностранных языков",
        "Набор уникальных бокалов для вина",
        "Настольная игра 'Диксит' или 'Кодовые имена'",
        "Подарочный набор хорошего кофе",
        "Компактный набор для рисования",
        "Подарочный сертификат на участие в кулинарной школе",
        "Фотокнига с местами его детства",
        "Профессиональные наушники",
        "Стильный чехол для смартфона или ноутбука",
        "Мини-барбекю для пикника",
        "Подарочный набор из горячих соусов",
        "Шапка-ушанка для зимних приключений",
        "Электронный ридер для чтения книг",
        "Подписка на любимый спортивный канал",
        "Эргономичная подставка для ноутбука",
        "Очки для плавания",
        "Памятная медаль или кубок по его интересам",
        "Подарочный набор брендированных гольф-мышек",
        "Браслет Fitbit или другой трекер активности",
        "Компактный блендер для приготовления смузи",
        "Настольная игра 'Каркассон' или 'Доминион'",
        "Подписка на музыкальный стриминг-сервис",
        "Компактный набор инструментов для ремонта велосипеда",
        "Подставка для вина",
        "Дорогой шелковый платок или шарф",
        "Подарочный набор для ухода за кожей",
        "Тренажер для укрепления мышц рук",
        "Атлас мира для любителей географии",
        "Браслет для отслеживания сна",
        "Настенные часы с интересным дизайном",
        "Ручка с индивидуальной гравировкой",
        "Профессиональный массажёр для спины или ног",
        "Подарочный набор косметики для бритья",
        "Толстовка или свитер с символикой любимой спортивной команды",
        "Проектор звездного неба для создания романтической атмосферы",
        "Коврик для мыши с подогревом",
        "Билеты на футбольный матч или баскетбольную игру",
        "Книги по философии или психологии",
        "Настольная игра 'Настоящий футбол'",
        "Беспроводная зарядка для смартфона",
        "Стальной термос для сохранения температуры напитков",
        "Подарочный набор для изготовления собственного пива",
        "Велосипедный компьютер для отслеживания скорости и пройденного расстояния",
        "Набор для ухода за обувью",
        "Подписка на журнал по его интересам",
        "Электрический бритвенный станок",
        "Планшет для рисования",
        "Набор для приготовления суши",
        "Электрическая зубная щётка с функцией отбеливания",
        "Станция для зарядки устройств",
        "Подарочный набор спортивного питания",
        "Акустическая гитара или другой музыкальный инструмент",
        "Набор для коктейлей и барного оборудования",
        "Устройство для очистки и освежения воздуха",
        "Подарочный набор элитных чаев",
        "Футбольный мяч с автографом известного игрока",
        "Набор косметики и аксессуаров для ухода за бородой",
        "Книга с автографом любимого автора",
        "Гироскутер или электрический самокат",
        "Набор аксессуаров для кемпинга и пикника",
        "Блокнот с персонализированной обложкой",
        "Электронная кассетная плеер",
        "Подарочный набор массажных масел и лосьонов",
        "Набор для изготовления собственного шоколада",
        "Спортивный рюкзак или сумка для тренировок",
        "Подставка для наушников",
        "Умные перчатки для зимнего использования с технологией сенсорного экрана",
        "Интерактивный робот или дрон",
        "Набор для домашнего кинотеатра (проектор, экран, акустическая система)",
        "Стильный портфель или сумка для работы",
        "Подарочный набор качественных кистей и красок для художественного творчества",
        "Станция для зарядки солнечных устройств",
        "Набор для гольфа с персонализацией",
        "Смартфон с улучшенной камерой и функциями фотосъемки",
        "Подарочный набор ретро-игр или видеоигр",
        "Комплект для игры в боулинг",
        "Скейтборд или лонгборд",
        "Подарочный набор экзотических специй и приправ",
        "Сет для пикника или барбекю в удобной сумке",
        "Набор для создания собственных парфюмерных композиций",
        "Устройство для поддержания свежести и длительного хранения вина",
        "Сертификат на сеанс аэротрубы или катание на вейкборде",
        "Настольный футбол или бильярд",
        "Умные наручные часы с функцией отслеживания физической активности",
        "Подарочный набор редких и экзотических чаев",
        "Набор инструментов для барбершопа",
        "Набор для приготовления домашнего пива с авторскими рецептами",
        "Пазл в необычной форме или с большим количеством элементов",
        "Умные очки с функцией дополненной реальности",
        "Настольный календарь с фотографиями и важными датами",
        "Набор для создания своего микроогорода или мини-сада",
        "Сертификат на сеанс массажа или спа-процедуры",
        "Набор профессиональных кистей для макияжа",
        "Интерактивная игровая консоль",
        "Подарочный набор дорогих и редких виски",
        "Электрическая зубная нить или ирригатор",
        "Набор для вязания или вышивки",
        "Гамак для отдыха на природе",
        "Подарочный набор для изготовления своего пива",
        "Стильный кожаный портмоне",
        "Набор для карвинга по овощам и фруктам",
        "Сушилка для ботинок или перчаток",
        "Набор премиум-кофе с молинкой",
        "Ретро-фотоаппарат с пленкой",
        "Подарочный набор для баристы",
        "Комплект для игры в крокет",
        "Станок для бритья с зеркалом",
        "Деревянная настольная игра 'Корки' или 'Мельница'",
        "Подарочный набор элитных сигар",
        "Комплект для виноделия с возможностью создания собственного вина",
        "Складной велосипед для удобной транспортировки",
        "Набор для создания собственных мыл и ароматических свечей",
        "Подписка на кулинарный журнал или рецептурную базу данных",
        "Устройство для фотопечати на мобильном телефоне",
        "Сет для игры в пинг-понг",
        "Подарочный набор фирменных косметических средств",
        "Рюкзак с интегрированной солнечной панелью для зарядки устройств",
        "Набор профессиональных карандашей и акварельных красок для художников",
        "Игровая клавиатура и мышь для геймера",
        "Станция для подзарядки электронных устройств на столе",
        "Антистрессовый набор с игрушками и гаджетами",
        "Книга с интерактивными элементами или 3D-иллюстрациями",
        "Барбекю-гриль для использования на открытом воздухе",
        "Гироскопическая гирлянда с подсветкой для создания атмосферы",
        "Подарочный набор мягких полотенец и халата",
        "Массажное кресло для домашнего использования",
        "Набор для создания собственных духов или ароматической парфюмерии",
        "Музыкальная колонка с встроенным освещением и подсветкой",
        "Подарочный набор экзотических специй и соусов для готовки азиатской кухни",
        "Мини-проектор для просмотра фильмов и видео на большом экране",
        "Подарочный сертификат на парные сеансы и спа-процедуры",
        "Набор для фотографирования и съемки в стиле пинап",
        "Электронная бюрократическая игра для развития стратегического мышления",
        "Комплект аксессуаров для путешествий (подушка, маска для сна, набор для ухода за кожей)",
        "Подписка на онлайн-курсы или мастер-классы по фотографии или видеосъемке",
        "Дорожный набор инструментов для автомобиля",
        "Интерактивный игрушечный робот",
        "Подарочный набор для создания собственной косметики",
        "Комплект для создания своего мини-огорода или вертикального сада",
        "Беспроводная Bluetooth-колонка с встроенной подсветкой",
        "Набор для ухода за бородой и усами",
        "Настольный фонтан для релаксации и создания атмосферы",
        "Подарочный набор высококачественных столовых приборов",
        "Умный шлем для велосипедистов или мотоциклистов",
        "Комплект для самостоятельного создания ювелирных изделий",
        "Интерактивный набор для изучения робототехники и программирования",
        "Набор для создания собственных духов или ароматической парфюмерии",
        "Настольный фонтан для релаксации и создания атмосферы",
        "Комплект для домашнего копчения пищи",
        "Подарочный набор для создания собственных коктейлей",
        "Умный замок для двери",
        "Набор профессиональных кистей и красок для художников",
        "Комплект для съемки и монтажа видео",
        "Подарочный набор элитного чая",


        "Устройство для аэрогриля или мультиварки",
        "Настольная лампа со встроенным зарядным устройством для устройств",
        "Подарочный набор для изготовления собственных сувениров",
        "Компактная станция для зарядки электромобиля",
        "Набор инструментов для самостоятельного ремонта и строительства",
        "Интерактивный детский конструктор",
        "Подарочный набор дорогих и редких чайных листьев",
        "Робот-пылесос для автоматической уборки",
        "Набор для домашнего шоколадного фондю",
        "Комплект для создания собственных природных косметических средств",
        "Настольная игра в стиле стимпанк",
        "Подарочный набор премиум-гриль инструментов",
        "Устройство для отслеживания активности и сна",
        "Интерактивная электронная доска для рисования и заметок",
        "Подарочный набор элитных коньяков",
        "Комплект для создания собственной парфюмерии с персонализацией аромата",
        "Набор для создания своего собственного мебельного проекта",
        "Умный робот-помощник для дома",
        "Подарочный набор элитных чаяных смесей",
        "Комплект для пивоварения с возможностью создания собственного сорта пива",
        "Настольная игра в стиле фэнтези или научной фантастики",
        "Подарочный набор для создания своего собственного ароматического массажного масла",
        "Компактный фитнес-тренажер для домашней тренировки",
        "Набор профессиональных кулинарных ножей",
        "Подарочный набор дорогих редких спиртных напитков",
        "Устройство для создания электронной музыки и композиций",
        "Интерактивная настольная игра в стиле киберпанка",
        "Подарочный набор для создания собственных мороженых",
        "Комплект для создания собственных кожаных изделий",
        "Устройство для съемки и трансляции видеоблогов",
        "Подарочный набор экзотических специй и приправ для гастрономических экспериментов",
        "Комплект для создания собственной галереи или выставки искусства",
        "Интерактивный робот-собака или робот-кошка",
        "Набор профессиональных карандашей и маркеров для иллюстраций и комиксов"
    )

    private val femaleGiftIdeas = listOf(
        "Украшения",
        "Духи",
        "Книги по её интересам",
        "Сертификат в SPA",
        "Уникальный чай или кофе",
        "Технический гаджет, такой как новый телефон или наушники",
        "Винтажный винил",
        "Подписка на мастер-классы по её хобби",
        "Подарочная корзина с гурманскими продуктами",
        "Набор для рисования или другого её хобби",
        "Билеты на концерт её любимого исполнителя",
        "Путешествие в город, в котором она всегда хотела побывать",
        "Изысканное вино",
        "Набор косметики высокого качества",
        "Журнальная подписка на год",
        "Романтический ужин в ресторане",
        "Подписка на онлайн-курсы (языковые, кулинарные, художественные и др.)",
        "Удобный плед для домашнего уюта",
        "Подарочный сертификат в её любимый магазин",
        "Уроки верховой езды",
        "Шелковый халат",
        "Уроки йоги или фитнес-клуба",
        "Подарочный сертификат на профессиональную фотосессию",
        "Путешествие на воздушном шаре",
        "Элегантные сумки или кошельки",
        "Экзотические растения для дома",
        "Организация сюрпризной вечеринки",
        "Сертификат на посещение винодельни или пивоварни",
        "Элитные шоколады или десерты",
        "Настольные игры на основе ее интересов",
        "Оригинальный дизайнерский аксессуар для дома",
        "Кулинарный класс по приготовлению ее любимого блюда",
        "Подписка на аудиокниги или сервис стриминга фильмов и сериалов",
        "Набор для выращивания своих собственных трав или специй",
        "Путешествие на яхте или круизе",
        "Подарочный сертификат на классы танцев",
        "Эксклюзивная бутылка ее любимого алкогольного напитка",
        "Набор для ухода за кожей",
        "Художественные принадлежности высокого качества",
        "Роскошное платье или блузка",
        "Концертный билет на выступление её любимой группы или исполнителя",
        "Кулинарная книга с рецептами из разных стран мира",
        "Качественная кофеварка или чайник",
        "Массажное кресло для расслабления",
        "Подписка на фитнес-клуб или студию йоги",
        "Приглашение на мастер-класс по готовке с известным шеф-поваром",
        "Билет на модное шоу или выставку искусства",
        "Набор для создания своего собственного парфюма",
        "Подарочный сертификат на классы по медитации или массажу",
        "Опыт вождения спортивного автомобиля на треке",
        "Билеты на театральное представление",
        "Набор для виноделия дома",
        "Профессиональный фотоаппарат",
        "Роскошный комплект постельного белья",
        "Набор сыров из разных стран мира",
        "Декоративные свечи ручной работы",
        "Участие в воркшопе по цветоводству или флористике",
        "Набор для пикника с качественным оборудованием",
        "Подписка на годовой доступ к музыкальному стриминговому сервису",
        "Книги от её любимых авторов в красивом издании",
        "Профессиональный урок сомелье",
        "Шелковое белье",
        "Набор для письма пером и чернилами",
        "Подписка на журнал по её интересам",
        "Роскошная косметическая сумка",
        "Опыт наслаждения горячими источниками",
        "Подарочный сертификат в книжный магазин",
        "Мастер-класс по приготовлению суши",
        "Стильные обложки для паспорта и документов",
        "Уроки пения или музыкального инструмента",
        "Набор для создания своей собственной мини-библиотеки",
        "Столовые приборы высокого качества",
        "Сертификат на скалолазание или прыжки с парашютом",
        "Ароматерапевтический набор с эфирными маслами",
        "Стильные зонты или плащи",
        "Билеты на спортивное мероприятие",
        "Уроки кулинарии с профессиональным поваром",
        "Стильные чехлы для её техники",
        "Шикарная ночная рубашка или пижама",
        "Подарочный сертификат в парикмахерскую или салон красоты",
        "Билеты на горячий источник или термальные бани",
        "Живописный полет на вертолете",
        "Опыт сафари или поход в зоопарк",
        "Мастер-класс по изготовлению шоколада",
        "Билеты на гастрономический тур",
        "Набор для барбекю высокого качества",
        "Эксклюзивный набор для ванной и релаксации",
        "Шикарные ботинки или кеды",
        "Подарочный сертификат на уроки живописи или скульптуры",
        "Набор для изучения астрономии с телескопом",
        "Набор для бисероплетения или вышивки",
        "Подарочный сертификат на уроки пилатеса",
        "Стильные гаджеты для кухни",
        "Профессиональный набор для ухода за волосами",
        "Экскурсия на фабрику вина или пивоварню",
        "Билеты на представление сиркового искусства",
        "Набор для гончарного дела",
        "Подписка на ежемесячную доставку цветов",
        "Экскурсия на чайную или кофейную плантацию",
        "Подарочный сертификат в бутик высокой моды",
        "Подарочный сертификат на курс лекций по её интересам",
        "Ретро виниловый проигрыватель",
        "Красиво оформленный фотоальбом с вашими общими фотографиями",
        "Уроки по изучению нового языка",
        "Подарочный сертификат в классный ресторан",
        "Билеты на воздушный шар",
        "Велосипед или электроскутер",
        "Художественные материалы, если она любит рисовать",
        "Подписка на виртуальные тренировки по йоге или фитнесу",
        "Качественная камера для влогов, если она любит снимать видео",
        "Подписка на доставку органических продуктов",
        "Эксклюзивный набор посуды для приготовления кофе",
        "Экскурсия на лошадиную ферму с верховой ездой",
        "Украшение с её зодиакальным знаком",
        "Подарочный сертификат в шикарный отель для выходных",
        "Роскошные предметы домашнего декора",
        "Билеты на музыкальный фестиваль",
        "Ретро пишущая машинка, если она любит писать",
        "Набор для домашнего пивоварения",
        "Билеты на поездку на катере или яхте",
        "Книги или книжные серии от её любимых авторов",
        "Курс винонаведения или дегустации вин",
        "Опыт кулинарного мастер-класса по приготовлению экзотических блюд",
        "Живописное путешествие на живописный остров",
        "Стильная и функциональная фитнес-одежда",
        "Билеты на семинар или лекцию по её области интересов",
        "Личная тренировка с профессиональным тренером",
        "Комплект умной домашней техники",
        "Комфортное и стильное рабочее кресло для домашнего офиса",
        "Подарочный сертификат в локальную библиотеку или книжный магазин",
        "Подписка на онлайн-классы по рисованию или рукоделию",
        "Набор экзотических специй и соусов со всего мира",
        "Стильный ковер для йоги",
        "Сертификат на уроки танцев",
        "Роскошный комплект белья",
        "Билеты на благотворительный ужин или мероприятие",
        "Набор для барбекю или пикника на природе",
        "Подписка на сервис стриминга подкастов",
        "Набор для ухода за ногами или руками",
        "Подарочный сертификат на воздушное путешествие на горячем воздушном шаре",
        "Опыт прогулки на каноэ или каяке",
        "Подписка на онлайн-уроки рисования или живописи",
        "Билеты на экскурсию на винодельню",
        "Профессиональные кулинарные инструменты для любимых блюд",
        "Экзотический массаж или спа-процедуры",
        "Подписка на онлайн-курс иностранного языка",
        "Подарочный набор из роскошного чая",
        "Билеты на концерт филармонии или оперу",
        "Мастер-класс по изготовлению ювелирных украшений",
        "Подарочный сертификат на обучение вождению мотоцикла",
        "Книга от любимого автора в кожаном переплете",
        "Уроки по написанию сценариев или креативного письма",
        "Подарочный сертификат на процедуры по уходу за кожей в салоне",
        "Билеты на балет или театральное представление",
        "Профессиональный набор для макияжа",
        "Подписка на ежемесячную доставку свежих цветов",
        "Уроки фотографии или курс по обработке фотографий",
        "Поход в приключенческий парк",
        "Сертификат на мастер-класс по декору интерьера",
        "Набор изысканных вин или шампанского",
        "Путешествие на воздушном шаре",
        "Уроки керамики или гончарного дела",
        "Профессиональная экипировка для дайвинга или снорклинга",
        "Уроки игры на музыкальном инструменте",
        "Красивое платье или другой элемент гардероба",
        "Набор книг для чтения во время путешествий",
        "Подарочный сертификат на уроки йоги или пилатеса",
        "Мастер-класс по плетению корзин",
        "Билеты на концерт симфонического оркестра",
        "Стильные аксессуары для волос",
        "Ваучер на уроки танцев",
        "Набор для поклонников из любимого фильма или сериала",
        "Уроки игры на гитаре или другом музыкальном инструменте",
        "Подписка на музыкальный стриминговый сервис",
        "Стильные чехлы для её гаджетов",
        "Уроки каллиграфии",
        "Ретро игры или настольные игры",
        "Набор для суши",
        "Стильная посуда для приготовления кофе",
        "Экскурсия на ферму сыров",
        "Эксклюзивные концертные билеты",
        "Подарочный сертификат на уроки голфа",
        "Набор для приготовления домашних коктейлей",
        "Билеты на известное спортивное мероприятие",
        "Уроки акварели или другой формы искусства",
        "Статуэтка или искусство из её любимой эпохи",
        "Набор изысканных сыров и вин",
        "Мастер-класс по приготовлению пиццы",
        "Стильные кроссовки для тренировок",
        "Прогулка на яхте",
        "Уроки игры на барабанах",
        "Подписка на гастрономический журнал",
        "Набор кистей и красок для художников",
        "Экскурсия по галерее или музею с гидом",
        "Комфортные и стильные городские рюкзаки",
        "Подписка на журнал моды или культуры",
        "Экскурсия на кондитерскую фабрику",
        "Билеты на зоопарк или аквапарк",
        "Уроки фехтования или другого необычного вида спорта",
        "Сертификат на косметические процедуры или массаж",
        "Подарочный сертификат на скалолазание",
        "Экскурсия на местную пасеку",
        "Билеты на концерт известного исполнителя",
        "Ретро набор для писем с восковыми печатями",
        "Уроки по изучению нового иностранного языка",
        "Подписка на сервис для изучения медитации",
        "Вкусные деликатесы с местных ферм",
        "Уроки актерского мастерства или импровизации",
        "Роскошный комплект постельного белья",
        "Билеты на арт-фестиваль или выставку",
        "Подписка на виртуальные классы по йоге",
        "Качественная камера для влогов",
        "Подписка на курсы по фитнесу или здоровому питанию",
        "Опыт езды на гоночной машине на треке",
        "Стационарный велотренажер для занятий дома",
        "Роскошные предметы домашнего декора",
        "Экскурсия по историческому месту или музею",
        "Подписка на сервис аудиокниг",
        "Уроки пения или вокала",
        "Сертификат на профессиональные уроки макияжа",
        "Кулинарный мастер-класс по приготовлению экзотических десертов",
        "Билеты на спортивный матч её любимой команды",
        "Индивидуальные уроки игры на пианино",
        "Эксклюзивная эссенция для ванной",
        "Комплект стильной эко-посуды",
        "Подписка на онлайн-уроки сомелье",
        "Набор для создания домашних ароматических свечей",
        "Билеты на горячие источники или термы",
        "Подарочный сертификат на уроки серфинга",
        "Стильная сумка для ноутбука",
        "Подарочный набор премиального шоколада",
        "Подписка на сервис для создания персонализированных плейлистов",
        "Уроки по созданию анимации или дизайна",
        "Сертификат на массаж шейки и зоны воротниковой зоны",
        "Мастер-класс по лепке из глины",
        "Прогулка на паруснике",
        "Уроки декоративной росписи",
        "Подписка на журнал по психологии или саморазвитию",
        "Подписка на курсы по садоводству",
        "Роскошная подвеска с её инициалами",
        "Карта мира для отметки посещенных мест",
        "Подарочный сертификат на уроки графического дизайна",
        "Билеты на съемки её любимого телешоу",
        "Роскошный кимоно для дома",
        "Комплект качественной фототехники для начинающих",
        "Экскурсия на фабрику по изготовлению шоколада",
        "Уроки моделирования одежды",
        "Подарочный сертификат на обучение плетению из бисера",
        "Подписка на сервис дистанционного обучения",
        "Опыт прохождения квеста в реальности",
        "Набор качественного сырья для домашнего пивоварения",
        "Уроки по созданию музыки на компьютере",
        "Сертификат на курс по изучению философии или истории",
        "Мастер-класс по вязанию",
        "Билеты на модное шоу",
        "Подписка на классы по кулинарии здорового питания",
        "Подарочный набор её любимых косметических продуктов",
        "Уроки аквагрима",
        "Набор для творчества с использованием переработанных материалов",
        "Роскошный набор для ванной или спа",
        "Подписка на онлайн-курсы по фотографии или видеомонтажу",
        "Билеты на экскурсию по винодельне с дегустацией",
        "Уроки по созданию украшений из полимерной глины",
        "Подарочный сертификат на мастер-класс по танцам на пилоне",
        "Роскошная косметичка с персонализацией",
        "Экскурсия на лошадиную ферму с верховой ездой",
        "Комплект для баристы с качественным кофе и аксессуарами",
        "Подписка на сервис для онлайн-медитаций и релаксации",
        "Мастер-класс по созданию керамической посуды",
        "Билеты на экскурсию по старинному замку или дворцу",
        "Уроки по созданию квиллинга или бумажного искусства",
        "Подарочный сертификат на профессиональную фотосессию",
        "Роскошные кашемировые перчатки или шарф",
        "Набор для создания собственных природных косметических средств",
        "Сертификат на уроки йоги на пляже или в природном парке",
        "Подписка на сервис для онлайн-изучения истории и культуры",
        "Уроки акробатики или гимнастики",
        "Роскошная наборная кукла в винтажном стиле",
        "Экскурсия на фабрику по производству шоколадных конфет",
        "Подарочный сертификат на романтическую поездку на яхте",
        "Комплект для создания своих собственных парфюмов",
        "Билеты на мюзикл или музыкальную постановку",
        "Уроки по изучению иностранного языка в стране его происхождения",
        "Подарочный сертификат на экскурсию на велосипеде",
        "Эксклюзивная коллекция книг от ее любимого автора",
        "Уроки по созданию гипсовых скульптур",
        "Подписка на онлайн-курсы по фотографии природы",
        "Роскошный набор для релаксации и ароматерапии",
        "Мастер-класс по изготовлению своих собственных свечей",
        "Билеты на концерт оперного театра",
        "Подарочный сертификат на уроки стрельбы из лука",
        "Роскошный комплект постельного белья из египетского хлопка",
        "Уроки скалолазания на искусственном скалодроме",
        "Подписка на сервис для онлайн-покупок модных товаров",
        "Набор для создания собственных суши",
        "Экскурсия на фабрику по изготовлению хрусталя",
        "Комплект для бадминтона или другой активной игры",
        "Подарочный сертификат на занятия тайским боксом",
        "Уроки по созданию макраме или ткачеству",
        "Роскошная коллекция чайных листьев со всего мира",
        "Подписка на сервис для онлайн-курсов по психологии и саморазвитию",
        "Билеты на музыкальный фестиваль или open-air",
        "Уроки граффити или стрит-арта",
        "Подарочный сертификат на уроки верховой езды",
        "Экскурсия на кофейную плантацию или фабрику по обжарке кофе",
        "Качественные наушники или портативная акустическая система",
        "Мастер-класс по созданию авторских украшений",
        "Подписка на сервис для онлайн-тренировок и фитнеса",
        "Роскошный комплект для спа-процедур и ухода за телом",
        "Билеты на кинофестиваль или премьеру фильма",
        "Подарочный сертификат на уроки паркура или акробатики",
        "Уникальный предмет винтажного декора для дома",
        "Экскурсия на место съемок любимого фильма или сериала",
        "Комплект для приготовления домашнего крафтового пива",
        "Уроки по созданию кукол из полимерной глины",
        "Подарочный сертификат на массаж лица или SPA-процедуры",
        "Роскошная коллекция косметики или парфюмерии",
        "Набор для фотобудоки или фото-шоу",
        "Уроки по созданию кожаных изделий",
        "Подарочный сертификат на консультацию стилиста или персонального шопера",
        "Подписка на сервис для онлайн-курсов по кулинарии и выпечке",
        "Билеты на спектакль или комедийное шоу",
        "Уроки по созданию своего блога или видеоблога",
        "Подарочный сертификат на уроки ароматерапии",
        "Экскурсия на органическую ферму с возможностью участия в работе",
        "Качественный портфель или сумка для работы",
        "Мастер-класс по созданию фотоальбома или скрапбукинга",
        "Подписка на сервис для онлайн-покупок органических продуктов",
        "Роскошный комплект постельного белья из египетского хлопка",
        "Билеты на цирковое представление или шоу",
        "Подарочный сертификат на уроки сальсы или других танцев",
        "Уроки по созданию украшений из драгоценных камней",
        "Экскурсия на фабрику по изготовлению парфюмерии",
        "Комплект для занятий йогой или пилатесом",
        "Подарочный сертификат на посещение термальных источников или спа-салона",
        "Роскошный набор чайных кружек и чашек",
        "Уроки по созданию керамической посуды",
        "Подписка на сервис для онлайн-покупок стильной одежды и аксессуаров",
        "Мастер-класс по созданию кукол из ткани",
        "Подарочный сертификат на сеанс массажа в спа-центре"
    )
}
