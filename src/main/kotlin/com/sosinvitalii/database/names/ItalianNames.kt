package com.sosinvitalii.database.names

/// Имена на итальянском языке
object ItalianNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Adriano",
        "Agostino",
        "Alberto",
        "Alessandro",
        "Alessio",
        "Alfredo",
        "Alfonso",
        "Alvise",
        "Amato",
        "Andrea",
        "Angelo",
        "Antonio",
        "Armando",
        "Arrigo",
        "Arturo",
        "Augusto",
        "Aurelio",
        "Bartolomeo",
        "Basilio",
        "Benito",
        "Bernardo",
        "Biagio",
        "Bruno",
        "Carlo",
        "Carmelo",
        "Carmine",
        "Celio",
        "Cesare",
        "Christian",
        "Claudio",
        "Corrado",
        "Cosimo",
        "Cristiano",
        "Damiano",
        "Daniele",
        "Dante",
        "Davide",
        "Domenico",
        "Edoardo",
        "Elio",
        "Emiliano",
        "Emilio",
        "Enrico",
        "Enzo",
        "Ermanno",
        "Ernesto",
        "Fabio",
        "Fabrizio",
        "Fausto",
        "Federico",
        "Felice",
        "Filippo",
        "Flavio",
        "Francesco",
        "Franco",
        "Fulvio",
        "Gabriele",
        "Gaetano",
        "Gastone",
        "Gennaro",
        "Giancarlo",
        "Giandomenico",
        "Gianfranco",
        "Gianluca",
        "Gianmarco",
        "Gianni",
        "Giovanni",
        "Giuliano",
        "Giuseppe",
        "Gregorio",
        "Guido",
        "Ignazio",
        "Italo",
        "Ivan",
        "Jacopo",
        "Leonardo",
        "Lorenzo",
        "Luca",
        "Luciano",
        "Luigi",
        "Marco",
        "Mario",
        "Massimo",
        "Matteo",
        "Maurizio",
        "Mauro",
        "Michele",
        "Mirko",
        "Nicola",
        "Orlando",
        "Oscar",
        "Paolo",
        "Patrizio",
        "Pietro",
        "Raffaele",
        "Renato",
        "Riccardo",
        "Roberto",
        "Rocco",
        "Romano",
        "Romeo",
        "Ruggero",
        "Salvo",
        "Samuele",
        "Sandro",
        "Sergio",
        "Silvio",
        "Simone",
        "Stefano",
        "Tiziano",
        "Tommaso",
        "Ugo",
        "Umberto",
        "Valentino",
        "Vincenzo",
        "Virgilio",
        "Walter",
        "Aldo",
        "Beniamino",
        "Dario",
        "Diego",
        "Dino",
        "Giacomo",
        "Salvatore",
        "Emanuele",
        "Sebastiano",
        "Vittorio",
        "Giorgio",
        "Massimiliano",
        "Marcello",
        "Bernardino",
        "Donato",
        "Ettore",
        "Ferdinando",
        "Ilario",
        "Natale",
        "Orazio",
        "Osvaldo",
        "Pasquale",
        "Primo",
        "Quinto",
        "Rodolfo",
        "Santo",
        "Tito",
        "Valerio",
        "Zeno",
        "Adolfo",
        "Amadeo",
        "Ambrogio",
        "Anastasio",
        "Anselmo",
        "Apollonio",
        "Baldassarre",
        "Belisario",
        "Benedetto",
        "Bonifacio",
        "Bortolo",
        "Calogero",
        "Casimiro",
        "Ciro",
        "Demetrio",
        "Egidio",
        "Eliseo",
        "Elmo",
        "Erasmo",
        "Ercole",
        "Esidoro",
        "Eusebio",
        "Ezio",
        "Fabiano",
        "Galileo",
        "Gaspare",
        "Gerardo",
        "Gervasio",
        "Gino",
        "Giordano",
        "Giustino",
        "Guglielmo",
        "Gustavo",
        "Iacopo",
        "Ippolito",
        "Isidoro",
        "Ivano",
        "Lazzaro",
        "Leandro",
        "Leonzio",
        "Livio",
        "Marino",
        "Martino",
        "Melchiorre",
        "Nereo",
        "Nino",
        "Norberto",
        "Olmo",
        "Oreste",
        "Ovidio",
        "Pacifico",
        "Palmiro",
        "Pellegrino",
        "Placido",
        "Pompeo",
        "Prospero",
        "Quintilio",
        "Radames",
        "Raimondo",
        "Raniero",
        "Remo",
        "Rinaldo",
        "Romolo",
        "Rosario",
        "Saverio",
        "Silvano",
        "Simplicio",
        "Spartaco",
        "Tarcisio",
        "Teodoro",
        "Teofilo",
        "Terenzio",
        "Tiburzio",
        "Tullio",
        "Ubaldo",
        "Ulderico",
        "Ulisse",
        "Urbano",
        "Valdo",
        "Venanzio",
        "Vespasiano",
        "Vilfredo",
        "Vitale",
        "Vladimiro",
        "Zaccaria",
        "Adeodato",
        "Alberico",
        "Alfio",
        "Amedeo",
        "Anacleto",
        "Aniceto",
        "Annibale",
        "Arsenio",
        "Attilio",
        "Bonaventura",
        "Botulfo",
        "Callisto",
        "Candido",
        "Catullo",
        "Celso",
        "Cipriano",
        "Clemente",
        "Coriolano",
        "Cornelio",
        "Costantino",
        "Dalmazio",
        "Dionisio",
        "Domiziano",
        "Edmondo",
        "Egisto",
        "Eligio",
        "Epifanio",
        "Ermes",
        "Eustachio",
        "Fidenzio",
        "Fiorenzo",
        "Fortunato",
        "Fulberto",
        "Gaudenzio",
        "Germano",
        "Gherardo",
        "Giotto",
        "Giove",
        "Giustiniano",
        "Glauco",
        "Goffredo",
        "Grisostomo",
        "Idalgo",
        "Iginio",
        "Innocenzo",
        "Iseo",
        "Ivos",
        "Lamberto",
        "Lanfranco",
        "Laudomia",
        "Lauriano",
        "Lelio",
        "Leone",
        "Liborio",
        "Longino",
        "Lucio",
        "Macario",
        "Manfredo",
        "Manlio",
        "Maurelio",
        "Medardo",
        "Menelao",
        "Mercurio",
        "Metello",
        "Minosse",
        "Mirco",
        "Morfeo",
        "Narciso",
        "Nerio",
        "Niso",
        "Odorico",
        "Olimpio",
        "Onofrio",
        "Orfeo",
        "Orso",
        "Ottaviano",
        "Ottorino",
        "Pantaleo",
        "Pelagio",
        "Polifemo",
        "Prisco",
        "Quirino",
        "Remigio",
        "Renzo",
        "Rosolino",
        "Rufo",
        "Sabino",
        "Salomone",
        "Sante",
        "Savino",
        "Sesto",
        "Siro",
        "Tancredi",
        "Tarquinio",
        "Tertulliano",
        "Teseo",
        "Tolomeo",
        "Tristano",
        "Ulrico",
        "Ulpiano",
        "Uriele",
        "Valente",
        "Varo",
        "Venerio",
        "Zaccheo",
        "Zefiro",
        "Zefferino",
        "Zelindo",
        "Zenone",
        "Zosimo",
        "Adelchi",
        "Adone",
        "Alcide",
        "Alfiero",
        "Alighiero",
        "Alvaro",
        "Amilcare",
        "Amintore",
        "Apollinare",
        "Araldo",
        "Archimede",
        "Argante",
        "Aristide",
        "Aronne",
        "Astolfo",
        "Atanasio",
        "Audisio",
        "Aureliano",
        "Baldo",
        "Barnaba",
        "Barsaba",
        "Bartolo",
        "Basso",
        "Beltrano",
        "Benvenuto",
        "Berardo",
        "Bonfiglio",
        "Bono",
        "Caio",
        "Calcedonio",
        "Camillo",
        "Caprino",
        "Carlino",
        "Colombo",
        "Comasio",
        "Cosma",
        "Crescenzio",
        "Decimo",
        "Desiderio",
        "Dionigi",
        "Duilio",
        "Edgardo",
        "Efisio",
        "Elia",
        "Eliodoro",
        "Emidio",
        "Ennio",
        "Erico",
        "Eros",
        "Esuperanzio",
        "Euclide",
        "Eugenio",
        "Eustorgio",
        "Evasio",
        "Fedele",
        "Feliciano",
        "Filiberto",
        "Flaviano",
        "Floriano",
        "Fosco",
        "Galdino",
        "Giacinto",
        "Giacobbe",
        "Gildo",
        "Gioacchino",
        "Giobbe",
        "Giosuè",
        "Giulio",
        "Godfredo",
        "Icaro",
        "Igino",
        "Ildo",
        "Immanuel",
        "Incoronato",
        "Ippocrate",
        "Irene",
        "Isacco",
        "Ivo",
        "Ladislao",
        "Lino",
        "Ludovico",
        "Luigino",
        "Maddaleno",
        "Mariano",
        "Menotti",
        "Michelangelo",
        "Moris",
        "Nicodemo",
        "Nicolò",
        "Odone",
        "Orsino",
        "Ottavio",
        "Piero",
        "Plinio",
        "Ranieri",
        "Saturnino",
        "Taddeo",
        "Uberto",
        "Venceslao",
        "Vito",
        "Voltaire",
        "Zeus",
        "Zigfrido",
        "Anzio",
        "Ascanio",
        "Atena",
        "Audino",
        "Bacco",
        "Baldovino",
        "Belfiore",
        "Benigno",
        "Bertoldo",
        "Bucolico",
        "Achille",
        "Amerigo",
        "Artemio",
        "Bellino",
        "Canio",
        "Ferruccio",
        "Fiorello",
        "Gavino",
        "Gilberto",
        "Gualtiero",
        "Liberatore",
        "Nazzareno",
        "Nazario",
        "Nerino",
        "Othello",
        "Pancrazio",
        "Pericle",
        "Pierangelo",
        "Pio",
        "Quintino",
        "Secondo",
        "Serafino",
        "Tiberio",
        "Timoteo",
        "Ventura",
        "Vico",
        "Wilfredo",
        "Zeffiro",
        "Zenobio",
        "Gioele",
        "Prassede",
        "Persemprio",
        "Castore",
        "Polluce",
        "Aldebrando",
        "Canzio",
        "Erminio",
        "Rutilio",
        "Liberio",
        "Zefirino",
        "Diodoro",
        "Eriberto",
        "Olindo",
        "Zanobi",
        "Brizio",
        "Zotico",
        "Prudenzio",
        "Avellino",
        "Saffo",
        "Omero",
        "Ottone",
        "Arno",
        "Armino",
        "Zabato",
        "Ponzio",
        "Laerte",
        "Amos",
        "Mael",
        "Ferro",
        "Anzo",
        "Pino",
        "Neotto",
        "Tazio",
        "Nestore",
        "Lionello",
        "Leopoldo",
        "Gualberto",
        "Hektor",
        "Elgar",
        "Geminiano",
        "Oronzo",
        "Alviero",
        "Neri",
        "Odino",
        "Lapo",
        "Naldo",
        "Milo",
        "Arcangelo",
        "Severo",
        "Alarico",
        "Inigo",
        "Aristarco",
        "Enzio",
        "Fidelio",
        "Geronzio",
        "Muzio",
        "Pippo",
        "Robusto",
        "Valfredo",
        "Zeffirino",
        "Danilo",
        "Gaio",
        "Igor",
        "Kristian",
        "Nando",
        "Xavier",
        "Yago",
        "Abramo",
        "Bardo",
        "Kamillo",
        "Loris",
        "Onesto",
        "Quarto",
        "Raul",
        "Saturno",
        "Vasco",
        "Willer",
        "Adelmo",
        "Cino",
        "Dindo",
        "Imelda",
        "Jago",
        "Korado",
        "Miro",
        "Nido",
        "Poldo",
        "Raffaello",
        "Zefiroso",
    )

    private val femaleNames = listOf(
        "Ada",
        "Adele",
        "Adelina",
        "Adriana",
        "Agata",
        "Agnese",
        "Alberta",
        "Alessandra",
        "Alessia",
        "Alice",
        "Alma",
        "Amalia",
        "Amanda",
        "Amelia",
        "Angela",
        "Angelica",
        "Anna",
        "Annabella",
        "Annalisa",
        "Antonella",
        "Arianna",
        "Aurora",
        "Beatrice",
        "Benedetta",
        "Bianca",
        "Camilla",
        "Carlotta",
        "Carolina",
        "Caterina",
        "Cecilia",
        "Chiara",
        "Cinzia",
        "Clara",
        "Claudia",
        "Costanza",
        "Cristina",
        "Daniela",
        "Deborah",
        "Diana",
        "Donatella",
        "Dora",
        "Edda",
        "Elena",
        "Eliana",
        "Elisabetta",
        "Emilia",
        "Emma",
        "Enrica",
        "Erica",
        "Erika",
        "Ernesta",
        "Ester",
        "Fabiana",
        "Fabiola",
        "Federica",
        "Felicia",
        "Bernadetta",
        "Carla",
        "Carmine",
        "Clelia",
        "Giulia",
        "Elisa",
        "Evangelina",
        "Fiorella",
        "Fiorenza",
        "Florentina",
        "Florentine",
        "Florenza",
        "Francesca",
        "Frederica",
        "Gabriela",
        "Giorgia",
        "Isabella",
        "Isidora",
        "Giovanna",
        "Giustina",
        "Jacqueline",
        "Lara",
        "Laura",
        "Letizia",
        "Liliana",
        "Lorenza",
        "Luisa",
        "Luna",
        "Maddalena",
        "Marina",
        "Marta",
        "Margherita",
        "Martina",
        "Mafalda",
        "Maria",
        "Marisa",
        "Matilda",
        "Maura",
        "Miranda",
        "Monica",
        "Nadia",
        "Natalia",
        "Nicole",
        "Ninetta",
        "Olimpia",
        "Olivia",
        "Ornella",
        "Palmira",
        "Paola",
        "Patrizia",
        "Pia",
        "Pietrella",
        "Raffaella",
        "Renata",
        "Rita",
        "Roberta",
        "Rosalia",
        "Rosanna",
        "Rosetta",
        "Rosmarie",
        "Rubina",
        "Sabrina",
        "Samantha",
        "Sandra",
        "Sara",
        "Silvia",
        "Simona",
        "Sonia",
        "Stefania",
        "Teodora",
        "Teresa",
        "Umberta",
        "Valentina",
        "Valeria",
        "Vanessa",
        "Veronica",
        "Vittoria",
        "Yanetta",
        "Jasmine",
        "Giulietta",
        "Filomena",
        "Flavia",
        "Gabriella",
        "Gaia",
        "Gemma",
        "Ginevra",
        "Giuseppina",
        "Gloria",
        "Graziella",
        "Greta",
        "Ida",
        "Ilaria",
        "Imelda",
        "Ines",
        "Irene",
        "Liana",
        "Licia",
        "Lina",
        "Lisa",
        "Lucia",
        "Luciana",
        "Lucrezia",
        "Mara",
        "Marianna",
        "Marica",
        "Matilde",
        "Michela",
        "Milena",
        "Miriam",
        "Nancy",
        "Nicoletta",
        "Nora",
        "Norma",
        "Piera",
        "Rocio",
        "Romina",
        "Rosa",
        "Rosaria",
        "Rosella",
        "Rossana",
        "Sabina",
        "Serena",
        "Sofia",
        "Stella",
        "Susanna",
        "Tania",
        "Tina",
        "Vera",
        "Ylenia",
        "Yolanda",
        "Zara",
        "Zoe",
        "Viola",
        "Ludovica",
        "Noemi",
        "Eleonora",
        "Rebecca",
        "Linda",
        "Angelina",
        "Rossella",
        "Elvira",
        "Ambra",
        "Giuliana",
        "Livia",
        "Celeste",
        "Tiziana",
        "Isotta",
        "Mirabella",
        "Oriana",
        "Daria",
        "Viviana",
        "Marcella",
        "Morena",
        "Evelina",
        "Flaminia",
        "Selena",
        "Marzia",
        "Rachele",
        "Luigia",
        "Antonia",
        "Gilda",
        "Adelaide",
        "Celestina",
        "Elettra",
        "Delfina",
        "Zenobia",
        "Serafina",
        "Fedora",
        "Marcellina",
        "Zaira",
        "Ondina",
        "Allegra",
        "Graziana",
        "Lidia",
        "Nicolina",
        "Rosina",
        "Zita",
        "Jolanda",
        "Leandra",
        "Nerina",
        "Bella",
        "Ileana",
        "Jacinta",
        "Katia",
        "Loretta",
        "Pamela",
        "Uberta",
        "Wilma",
        "Xenia",
        "Beniamina",
        "Carmela",
        "Domenica",
        "Fiora",
        "Giuditta",
        "Kira",
        "Quintilia",
        "Sibilla",
        "Ursula",
        "Wanda",
        "Xiomara",
        "Bruna",
        "Debora",
        "Helena",
        "Julietta",
        "Karina",
        "Lavinia",
        "Mirella",
        "Norina",
        "Ottavia",
        "Quirina",
        "Kiara",
        "Nina",
        "Penelope",
        "Jennifer",
        "Jessica",
        "Ophelia",
        "Aria",
        "Dalia",
        "Chiarella",
        "Carmen",
        "Giu",
        "Anabella",
        "Artemisia",
        "Asia",
        "Aurelia",
        "Azzurra",
        "Celia",
        "Eletta",
        "Esmeralda",
        "Grazia",
        "Leonora",
        "Magdalena",
        "Nella",
        "Rosalba",
        "Rosalinda",
        "Soleil",
        "Zora",
        "Alba",
        "Amaranta",
        "Anastasia",
        "Annetta",
        "Armida",
        "Assunta",
        "Bellina",
        "Calandra",
        "Carina",
        "Cassandra",
        "Colombina",
        "Corinna",
        "Damiana",
        "Diamante",
        "Dorotea",
        "Edvige",
        "Eleanora",
        "Eloisa",
        "Emanuela",
        "Estella",
        "Felicita",
        "Gelsomina",
        "Genoveffa",
        "Gioconda",
        "Gisella",
        "Iolanda",
        "Loredana",
        "Loriana",
        "Massima",
        "Melina",
        "Petronilla",
        "Rosabella",
        "Rosalina",
        "Sabella",
        "Silvana",
        "Sveva",
        "Talia",
        "Teresina",
        "Tommasa",
        "Vincenza",
        "Zelinda",
        "Amira",
        "Anika",
        "Cosima",
        "Fabrizia",
        "Giada",
        "Gioia",
        "Iride",
        "Lucinda",
        "Orsola",
        "Selene",
        "Siena",
        "Talita",
        "Yara",
        "Alina",
        "Arabella",
        "Ariella",
        "Belladonna",
        "Melania",
        "Natalina",
        "Regina",
        "Seraphina",
        "Tatiana",
        "Amara",
        "Annamaria",
        "Armina",
        "Calista",
        "Gianna",
        "Ifigenia",
        "Lucilla",
        "Melinda",
        "Romilda",
        "Alessa",
        "Arancia",
        "Beatriz",
        "Biancamaria",
        "Callista",
        "Caprice",
        "Carmelina",
        "Celestia",
        "Chiaretta",
        "Cipriana",
        "Desideria",
        "Elodia",
        "Eugenia",
        "Fiammetta",
        "Fortuna",
        "Galatea",
        "Katerina",
        "Madelina",
        "Maia",
        "Odetta",
        "Olivetta",
        "Pasqualina",
        "Selvaggia",
        "Alessandrina",
        "Annunziata",
        "Attilia",
        "Battista",
        "Camelia",
        "Carlina",
        "Celina",
        "Cesarina",
        "Clementina",
        "Concetta",
        "Cordelia",
        "Dafne",
        "Desiderata",
        "Donata",
        "Elida",
        "Eufemia",
        "Eustachia",
        "Fausta",
        "Fiamma",
        "Filippa",
        "Fiordaliso",
        "Fortunata",
        "Gaetana",
        "Giordana",
        "Giuletta",
        "Giusy",
        "Graziosa",
        "Guglielma",
        "Ilma",
        "Ivana",
        "Ketty",
        "Laila",
        "Lelia",
        "Leona",
        "Lodovica",
        "Lorella",
        "Lorena",
        "Lucetta",
        "Madalena",
        "Mariabella",
        "Mariangela",
        "Marilena",
        "Marinella",
        "Pasqua",
        "Rosaluna",
        "Rosamaria",
        "Rosangela",
        "Salvatrice",
        "Solange",
        "Tommasina",
        "Vanda",
        "Venera",
        "Violetta",
        "Virginia",
        "Vita",
        "Vittoriana",
        "Adalia",
        "Alda",
        "Amadea",
        "Anselma",
        "Arsenia",
        "Augusta",
        "Aviana",
        "Benigna",
        "Brunella",
        "Candelaria",
        "Catrina",
        "Clotilde",
        "Doriana",
        "Eulalia",
        "Filippina",
        "Graciela",
        "Idalia",
        "Immacolata",
        "Jacintha",
        "Clarissa",
        "Alida",
        "Adelisa",
        "Aida",
        "Almira",
        "Amarissa",
        "Arletta",
        "Artemisa",
        "Belinda",
        "Calogera",
        "Candida",
        "Carissa",
        "Celinda",
        "Delizia",
        "Edelmira",
        "Emanuelea",
        "Eudora",
        "Feliciana",
        "Fiorentina",
        "Floriana",
        "Franchesca",
        "Genesia",
        "Giannetta",
        "Giordania",
        "Giselda",
        "Griselda",
        "Idabella",
        "Ippolita",
        "Ismeralda",
        "Ivetta",
        "Jovanna",
        "Maddalisa",
        "Maristella",
        "Maurizia",
        "Nerissa",
        "Orlanda",
        "Perla",
        "Renza",
        "Rinalda",
        "Sabinella",
        "Savina",
        "Sidonia",
        "Silvestra",
        "Siria",
        "Speranza",
        "Urbana",
        "Veneranda",
        "Vespera",
        "Vincenzina",
        "Vitalia",
        "Vivietta",
        "Zefira",
        "Zelina",
        "Zola",
        "Zoraida",
        "Zuleika",
        "Zulma",
    )
}