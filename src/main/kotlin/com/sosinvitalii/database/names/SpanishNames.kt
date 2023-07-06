package com.sosinvitalii.database.names

/// Имена на испанском языке
object SpanishNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Alejandro",
        "Adrián",
        "Alonso",
        "Andrés",
        "Antonio",
        "Arturo",
        "Ángel",
        "Augusto",
        "Aurelio",
        "Benjamín",
        "Bernardo",
        "Bruno",
        "Carlos",
        "César",
        "Cristian",
        "Daniel",
        "David",
        "Diego",
        "Edgardo",
        "Eduardo",
        "Emiliano",
        "Enrique",
        "Ernesto",
        "Esteban",
        "Eugenio",
        "Fabián",
        "Felipe",
        "Fernando",
        "Francisco",
        "Gabriel",
        "Germán",
        "Gerardo",
        "Gonzalo",
        "Gregorio",
        "Guillermo",
        "Gustavo",
        "Héctor",
        "Hernán",
        "Horacio",
        "Hugo",
        "Ignacio",
        "Ismael",
        "Iván",
        "Jaime",
        "Javier",
        "Jesús",
        "Joaquín",
        "Jorge",
        "José",
        "Juan",
        "Julio",
        "Leonardo",
        "Lorenzo",
        "Lucas",
        "Luis",
        "Manuel",
        "Marcos",
        "Mario",
        "Martín",
        "Mauricio",
        "Maximiliano",
        "Miguel",
        "Néstor",
        "Nicolás",
        "Octavio",
        "Omar",
        "Orlando",
        "Pablo",
        "Patricio",
        "Pedro",
        "Rafael",
        "Ramón",
        "Raúl",
        "Renato",
        "Ricardo",
        "Roberto",
        "Rodrigo",
        "Salvador",
        "Samuel",
        "Santiago",
        "Sebastián",
        "Sergio",
        "Simón",
        "Tomás",
        "Valentín",
        "Víctor",
        "Xavier",
        "Yago",
        "Abel",
        "Adán",
        "Adolfo",
        "Alfonso",
        "Alfredo",
        "Alvaro",
        "Amado",
        "Amador",
        "Amando",
        "Anselmo",
        "Armando",
        "Baltasar",
        "Basilio",
        "Beltrán",
        "Braulio",
        "Celestino",
        "Cipriano",
        "Cirilo",
        "Clemente",
        "Cornelio",
        "Cosme",
        "Damián",
        "Dámaso",
        "Darío",
        "Demetrio",
        "Domingo",
        "Eleuterio",
        "Elías",
        "Eliseo",
        "Elmo",
        "Eloy",
        "Emilio",
        "Eulalio",
        "Ezequiel",
        "Fausto",
        "Fermín",
        "Filiberto",
        "Florencio",
        "Fortunato",
        "Fructuoso",
        "Fulgencio",
        "Gaspar",
        "Gaudencio",
        "Genaro",
        "Gilberto",
        "Godofredo",
        "Gumersindo",
        "Heriberto",
        "Hilario",
        "Hipólito",
        "Honorio",
        "Humberto",
        "Inocencio",
        "Isidoro",
        "Jacinto",
        "JerПродолжение списка:",
        "Jerónimo",
        "Jonás",
        "Jovino",
        "Juanito",
        "Justino",
        "Lamberto",
        "Lázaro",
        "Leandro",
        "Leocadio",
        "León",
        "Leoncio",
        "Leopoldo",
        "Liborio",
        "Lisandro",
        "Lope",
        "Luciano",
        "Lucio",
        "Lupo",
        "Macario",
        "Mariano",
        "Marino",
        "Martirio",
        "Mateo",
        "Maximiano",
        "Maximino",
        "Melchor",
        "Melitón",
        "Narciso",
        "Nemesio",
        "Nepomuceno",
        "Nereo",
        "Nicanor",
        "Norberto",
        "Octaviano",
        "Olegario",
        "Onofre",
        "Osvaldo",
        "Pánfilo",
        "Pascual",
        "Pastor",
        "Pelayo",
        "Perfecto",
        "Plácido",
        "Porfirio",
        "Primitivo",
        "Próspero",
        "Rafaelo",
        "Ramiro",
        "Regino",
        "Reinaldo",
        "Remigio",
        "Rómulo",
        "Rosendo",
        "Rufino",
        "Ruperto",
        "Sabino",
        "Serafín",
        "Severiano",
        "Silvestre",
        "Silvio",
        "Sixto",
        "Teodoro",
        "Tito",
        "Tobías",
        "Urbano",
        "Valdemar",
        "Valentino",
        "Venancio",
        "Vidal",
        "Vitaliano",
        "Zacarías",
        "Zenón",
        "Abdiel",
        "Abilio",
        "Abrahán",
        "Acacio",
        "Adiel",
        "Adrià",
        "Adriel",
        "Aitor",
        "Alban",
        "Alcides",
        "Aldair",
        "Aldo",
        "Alejo",
        "Alexei",
        "Amancio",
        "Amaro",
        "Ander",
        "Andino",
        "Andrino",
        "Aníbal",
        "Antero",
        "Antonino",
        "Aquiles",
        "Aragón",
        "Arcadio",
        "Aridio",
        "Ariel",
        "Aristides",
        "Arsenio",
        "Asdrúbal",
        "Atanasio",
        "Aureliano",
        "Axcel",
        "Axel",
        "Baldomero",
        "Balduino",
        "Bautista",
        "Benicio",
        "Benito",
        "Bernabé",
        "Blas",
        "Bolívar",
        "Bonifacio",
        "Brais",
        "Breno",
        "Brian",
        "Brígido",
        "Bruto",
        "Cándido",
        "Cañuto",
        "Carmelo",
        "Casimiro",
        "Casiano",
        "Casildo",
        "Casto",
        "Catalino",
        "Celerino",
        "Celio",
        "Celso",
        "Cenobio",
        "Celedonio",
        "Celino",
        "Cirino",
        "Ciro",
        "Cleofás",
        "Cleto",
        "Clímaco",
        "Clodomiro",
        "Clodoveo",
        "Clotario",
        "Conrado",
        "Constantino",
        "Coriolano",
        "Cosimo",
        "Crisanto",
        "Cristóbal",
        "Críspulo",
        "Cucufato",
        "Cuniberto",
        "Dacio",
        "Damiano",
        "Danilo",
        "Dardo",
        "Dávalos",
        "Dávila",
        "Delmio",
        "Desiderio",
        "Dionisio",
        "Diosdado",
        "Dobromir",
        "Donato",
        "Dorian",
        "Doroteo",
        "Edelmiro",
        "Edgar",
        "Edmundo",
        "Efraín",
        "Egisto",
        "Egidio",
        "Eladio",
        "Eligio",
        "Elpidio",
        "Elvio",
        "Eneko",
        "Ercilio",
        "Eric",
        "Ermenegildo",
        "Esdras",
        "Esequiel",
        "Estéfano",
        "Estefano",
        "Eulogio",
        "Eusebio",
        "Eustaquio",
        "Evaristo",
        "Everardo",
        "Ezequías",
        "Fadrique",
        "Faramundo",
        "Faustino",
        "Fernándo",
        "Filomeno",
        "Flavio",
        "Florián",
        "Fruela",
        "Galo",
        "Gastón",
        "Gerónimo",
        "Gisberto",
        "Graciano",
        "Gualterio",
        "Gurutz",
        "Heliodoro",
        "Heraclio",
        "Hermenegildo",
        "Herminio",
        "Hermes",
        "Hernando",
        "Higinio",
        "Himerio",
        "Honorato",
        "Iker",
        "Ildefonso",
        "Iluminado",
        "Isaías",
        "Isidro",
        "Jacobo",
        "Jairo",
        "Jalil",
        "Januario",
        "Jeremías",
        "Jimeno",
        "Jonatán",
        "Jonay",
        "Jordi",
        "Josué",
        "Judas",
        "Julian",
        "Julián",
        "Koldo",
        "Ladislao",
        "Lander",
        "Leonel",
        "Leonidas",
        "Licerio",
        "Lino",
        "Lisardo",
        "Lisimaco",
        "Lothar",
        "Lourenzo",
        "Lucano",
        "Luís",
        "Magno",
        "Maicol",
        "Malco",
        "Manolo",
        "Manrique",
        "Manfredo",
        "Marcelino",
        "Marcelo",
        "Marcial",
        "Marlon",
        "Matías",
        "Max",
        "Melquisedec",
        "Micael",
        "Moisés",
        "Nabor",
        "Naldo",
        "Napoleón",
        "Nilo",
        "Odón",
        "Oliverio",
        "Olmo",
        "Onésimo",
        "Orestes",
        "Óscar",
        "Otelo",
        "Otilio",
        "Ovidio",
        "Pacifico",
        "Paco",
        "Paladio",
        "Pancracio",
        "Pancho",
        "Paulino",
        "Pelagio",
        "Pericles",
        "Primo",
        "Prudencio",
        "Régulo",
        "Rodolfo",
        "Rubén",
        "Salomón",
        "Samir",
        "Sansón",
        "Santos",
        "Saúl",
        "Segismundo",
        "Severino",
        "Sócrates",
        "Solano",
        "Sotero",
        "Telesforo",
        "Terencio",
        "Tiberio",
        "Tiburcio",
        "Timoteo",
        "Toribio",
        "Tristán",
        "Tulio",
        "Ubaldo",
        "Uberto",
        "Ulises",
        "Valeriano",
        "Valerio",
        "Venceslao",
        "Venusto",
        "Víctor Hugo",
        "Virgilio",
        "Vladimir",
        "Walter",
        "Wenceslao",
        "Wilfredo",
        "William",
        "Wilson",
        "Xabier",
        "Xander",
        "Xénaro",
        "Ximeno",
        "Yahir",
        "Yandel",
        "Yeray",
        "Yonatan",
        "Zadoc",
        "Zahiro",
        "Zaqueo",
        "Zebulón",
        "Zigor",
        "Zuriel",
        "Zósimo",
        "arón",
        "Abelardo",
        "Abundio",
        "Acelino",
        "Acrisio",
        "Adonis",
        "Adriano",
        "Agapito",
        "Aitoro",
        "Alarico",
        "Albano",
        "Alcibíades",
        "Aldemaro",
        "Alderete",
        "Alex",
        "Alipio",
        "Almerindo",
        "Almérico",
        "Alpino",
        "Álvaro",
        "Amadeo",
        "Ambrosio",
        "Américo",
        "Amílcar",
        "Amos",
        "Anacleto",
        "Anastasio",
        "Anaxágoras",
        "Antimo",
        "Antolín",
        "Anuar",
        "Aquilino",
        "Aramis",
        "Arnaldo",
        "Artemio",
        "Artidoro",
        "Asaf",
        "Ascensión",
        "Asencio",
        "Asimiro",
        "Asís",
        "Ataúlfo",
        "Atilio",
        "Aurel",
        "Avilio",
        "Axelio",
        "Azael",
        "Azuceno",
        "Bardo",
        "Bartolomé",
        "Belisario",
        "Benigno",
        "Biaggio",
        "Blasco",
        "Cai",
        "Calixto",
        "Camilo",
        "Carles",
        "Cástulo",
        "Cayetano",
        "Ceolfrido",
        "Ceón",
        "Chindo",
        "Claudio",
    )

    private val femaleNames = listOf(
        "Adela",
        "Adriana",
        "Agustina",
        "Alba",
        "Alejandra",
        "Alicia",
        "Almudena",
        "Amalia",
        "Amanda",
        "Anaís",
        "Andrea",
        "Ángela",
        "Antonella",
        "Araceli",
        "Ariadna",
        "Aurora",
        "Beatriz",
        "Belén",
        "Benita",
        "Bernarda",
        "Blanca",
        "Brenda",
        "Bruna",
        "Camila",
        "Carla",
        "Carmen",
        "Carolina",
        "Cecilia",
        "Celeste",
        "Clara",
        "Claudia",
        "Constanza",
        "Cristina",
        "Daniela",
        "Débora",
        "Diana",
        "Dolores",
        "Dominica",
        "Elena",
        "Eliana",
        "Elisa",
        "Elsa",
        "Emilia",
        "Esperanza",
        "Estela",
        "Estrella",
        "Eugenia",
        "Eva",
        "Fabiana",
        "Fátima",
        "Fernanda",
        "Florencia",
        "Francisca",
        "Gabriela",
        "Gala",
        "Georgina",
        "Gisela",
        "Gloria",
        "Graciela",
        "Guadalupe",
        "Helena",
        "Inés",
        "Irene",
        "Isabella",
        "Isabel",
        "Jacqueline",
        "Jimena",
        "Josefina",
        "Juana",
        "Julia",
        "Julieta",
        "Laura",
        "Leticia",
        "Lidia",
        "Liliana",
        "Lorena",
        "Lucía",
        "Luisa",
        "Magdalena",
        "Manuela",
        "Marcela",
        "Margarita",
        "María",
        "Mariana",
        "Marina",
        "Marta",
        "Matilde",
        "Mónica",
        "Natalia",
        "Nayeli",
        "Noelia",
        "Norma",
        "Olga",
        "Pamela",
        "Patricia",
        "Paula",
        "Paz",
        "Raquel",
        "Regina",
        "Remedios",
        "Renata",
        "Rocio",
        "Romina",
        "Rosa",
        "Rosalía",
        "Rosario",
        "Salomé",
        "Sara",
        "Selena",
        "Silvia",
        "Sofía",
        "Soledad",
        "Sonia",
        "Susana",
        "Tatiana",
        "Teresa",
        "Valentina",
        "Valeria",
        "Vanesa",
        "Verónica",
        "Victoria",
        "Violeta",
        "Virginia",
        "Ximena",
        "Yamila",
        "Yolanda",
        "Zaida",
        "Zara",
        "Zulema",
        "Abigaíl",
        "Abril",
        "Ada",
        "Agatha",
        "Alana",
        "Alessandra",
        "Alexia",
        "Alina",
        "Alma",
        "Amada",
        "Amara",
        "Amira",
        "Ana",
        "Anahí",
        "Anastasia",
        "Anay",
        "Andra",
        "Angie",
        "Anita",
        "Aria",
        "Arlette",
        "Arya",
        "Astrid",
        "Aitana",
        "África",
        "Azucena",
        "Bárbara",
        "Basilia",
        "Belinda",
        "Belisa",
        "Betania",
        "Bibiana",
        "Brisa",
        "Candelaria",
        "Carlota",
        "Catalina",
        "Celia",
        "Cintia",
        "Clarisa",
        "Clotilde",
        "Coral",
        "Cruz",
        "Dafne",
        "Dalia",
        "Delfina",
        "Dulce",
        "Dulcinea",
        "Edith",
        "Elba",
        "Elvira",
        "Enriqueta",
        "Esmeralda",
        "Estefanía",
        "Ester",
        "Eulalia",
        "Fabiola",
        "Felicia",
        "Flor",
        "Francesca",
        "Frida",
        "Gema",
        "Geraldine",
        "Gina",
        "Giselle",
        "Gracia",
        "Gregoria",
        "Guillermina",
        "Hortensia",
        "Iliana",
        "Ingrid",
        "Iraida",
        "Iris",
        "Isidora",
        "Ivana",
        "Ivette",
        "Jacinta",
        "Janeth",
        "Jazmín",
        "Jennifer",
        "Jéssica",
        "Johanna",
        "Joselyn",
        "Joyce",
        "Junia",
        "Karen",
        "Karina",
        "Kassandra",
        "Kendra",
        "Kiara",
        "Laila",
        "Lía",
        "Lina",
        "Lisbeth",
        "Lissette",
        "Lizeth",
        "Loreley",
        "Lourdes",
        "Luciana",
        "Lucrecia",
        "Ludmila",
        "Luz",
        "Magali",
        "Malena",
        "Maira",
        "Malú",
        "Margot",
        "Maribel",
        "Marisa",
        "Marisol",
        "Martina",
        "Melina",
        "Mercedes",
        "Milagros",
        "Miranda",
        "Miriam",
        "Mireya",
        "Mirna",
        "Myriam",
        "Nadia",
        "Nancy",
        "Nara",
        "Nayla",
        "Neiva",
        "Nicole",
        "Nieves",
        "Norah",
        "Nubia",
        "Nuria",
        "Olivia",
        "Orquídea",
        "Paola",
        "Paulina",
        "Perla",
        "Pilar",
        "Priscila",
        "Rafaela",
        "Ramona",
        "Rebeca",
        "Reina",
        "Rina",
        "Rita",
        "Rocío",
        "Rosalba",
        "Rosalia",
        "Rosana",
        "Rosita",
        "Roxana",
        "Ruby",
        "Ruth",
        "Sabina",
        "Sabrina",
        "Salma",
        "Samanta",
        "Sandra",
        "Silvana",
        "Simona",
        "Soraya",
        "Tamara",
        "Teodora",
        "Tereza",
        "Trinidad",
        "Vanessa",
        "Viviana",
        "Yara",
        "Yuli",
        "Yvette",
        "Zahara",
        "Zaira",
        "Zenaida",
        "Zita",
        "Zoila",
        "Zoraida",
        "Abigail",
        "Adelaida",
        "Aída",
        "Aina",
        "Alena",
        "Alessia",
        "Alethea",
        "Alondra",
        "Amelia",
        "Angélica",
        "Annette",
        "Antonia",
        "Ariana",
        "Aura",
        "Bella",
        "Bianca",
        "Britney",
        "Candelas",
        "Clementina",
        "Cynthia",
        "Dana",
        "Deborah",
        "Delia",
        "Dorotea",
        "Eliza",
        "Elizabeth",
        "Emma",
        "Erika",
        "Federica",
        "Jade",
        "Jamila",
        "Judith",
        "Juliana",
        "Katia",
        "Luna",
        "Azul",
        "Elixir",
        "Isla",
        "Lua",
        "Nerea",
        "Oceana",
        "Serenidad",
        "Valquiria",
        "Almendra",
        "Amaranta",
        "Aranza",
        "Bruma",
        "Cielo",
        "Eirene",
        "Esencia",
        "Fiorella",
        "Galatea",
        "Idalia",
        "Índigo",
        "Liora",
        "Lluvia",
        "Mariposa",
        "Mía",
        "Naiara",
        "Noa",
        "Olimpia",
        "Oriana",
        "Paloma",
        "Sirena",
        "Solana",
        "Talía",
        "Venus",
        "Xiomara",
        "Zafira",
        "Adelina",
        "Amelie",
        "Anahi",
        "Azalea",
        "Camelia",
        "Celestina",
        "Eleana",
        "Esmerelda",
        "Evelina",
        "Gabriella",
        "Heliana",
        "Jovita",
        "Karolina",
        "Orietta",
        "Rosalina",
        "Samara",
        "Zinnia",
        "Adriela",
        "Amarilis",
        "Arlet",
        "Calista",
        "Coralina",
        "Eleonora",
        "Evangelina",
        "Felisa",
        "Inara",
        "Kalina",
        "Marcelina",
        "Milena",
        "Odalys",
        "Rosalinda",
        "Selene",
        "Yaretzi",
        "Bianka",
        "Gaelle",
        "Hada",
        "Ileana",
        "Jocelyn",
        "Odette",
        "Talia",
        "Ximara",
        "Yael",
        "Abella",
        "Aixa",
        "Ariela",
        "Elora",
        "Ivanna",
        "Anabel",
        "Calandra",
        "Galia",
        "Hilda",
        "Samira",
        "Yanira",
        "Ainhoa",
        "Karla",
        "Alira",
        "Avelina",
        "Casilda",
        "Eliora",
        "Estelita",
        "Fidelia",
        "Galena",
        "Heloise",
        "Izel",
        "Jessenia",
        "Kalinda",
        "Lavinia",
        "Liliosa",
        "Madelina",
        "Melinda",
        "Nalani",
        "Ondina",
        "Pilara",
        "Querida",
        "Raquelita",
        "Serafina",
        "Soleil",
        "Tamarinda",
        "Xanthe",
        "Yesenia",
        "Abriela",
        "Aradia",
        "Belina",
        "Cipriana",
        "Damiana",
        "Elea",
        "Esmara",
        "Fiamma",
        "Iria",
        "Karmina",
        "Anahid",
        "Azura",
        "Caliana",
        "Dalila",
        "Elvina",
        "Galateia",
        "Honorina",
        "Iridessa",
        "Jovanna",
        "Kalista",
        "Liorita",
        "Lucinda",
        "Magalina",
        "Maripaz",
        "Melodia",
        "Nevara",
        "Ophelia",
        "Querencia",
        "Rafaella",
        "Rosabella",
        "Salomina",
        "Seraphina",
        "Solara",
        "Talita",
        "Valora",
        "Xarifa",
        "Adelia",
        "Almira",
        "Anunciación",
        "Elara",
        "Fiametta",
        "Ginebra",
        "Iluminada",
        "Jazmina",
        "Katerina",
        "Luminara",
        "Amabel",
        "Anhelina",
        "Azucar",
        "Beliza",
        "Calma",
        "Cariña",
        "Damaris",
        "Elodia",
        "Erendira",
        "Fidelina",
        "Galinda",
        "Hesperia",
        "Ithaca",
        "Jacaranda",
        "Jocasta",
        "Leocadia",
        "Lilith",
        "Madrona",
        "Malvina",
        "Maristela",
        "Melusina",
        "Nalina",
        "Ophira",
        "Perlita",
        "Quetzal",
        "Ravenna",
        "Rosamunda",
        "Salvia",
        "Serenella",
        "Solita",
        "Talisa",
        "Valina",
        "Yalitza",
        "Zafiro",
        "Abriana",
        "Almudia",
        "Aracelia",
        "Celestia",
        "Damara",
        "Elixia",
        "Floriana",
        "Inessa",
        "Jovina",
    )
}