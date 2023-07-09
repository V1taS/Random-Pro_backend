package com.sosinvitalii.database.names

/// Имена на немецком языке
object GermanNames {
    fun fetch(gender: Gender): List<String> {
        return if (gender == Gender.MALE) {
            maleNames
        } else {
            femaleNames
        }
    }

    private val maleNames = listOf(
        "Alexander",
        "Andreas",
        "Anton",
        "Benjamin",
        "Carl",
        "Christian",
        "Christoph",
        "Daniel",
        "David",
        "Dominik",
        "Edgar",
        "Emil",
        "Erik",
        "Fabian",
        "Felix",
        "Florian",
        "Frank",
        "Frederik",
        "Friedrich",
        "Georg",
        "Gerhard",
        "Gregor",
        "Gustav",
        "Hannes",
        "Hans",
        "Heinrich",
        "Henrik",
        "Herbert",
        "Hermann",
        "Holger",
        "Horst",
        "Hugo",
        "Jakob",
        "Jan",
        "Jens",
        "Jochen",
        "Johannes",
        "Jonas",
        "Josef",
        "Julian",
        "Jürgen",
        "Karl",
        "Kilian",
        "Klaus",
        "Konrad",
        "Kurt",
        "Lars",
        "Leo",
        "Lorenz",
        "Ludwig",
        "Lukas",
        "Manfred",
        "Manuel",
        "Marco",
        "Markus",
        "Martin",
        "Matthias",
        "Max",
        "Michael",
        "Moritz",
        "Nico",
        "Nikolaus",
        "Oliver",
        "Otto",
        "Patrick",
        "Paul",
        "Peter",
        "Philipp",
        "Reinhard",
        "Richard",
        "Robert",
        "Roland",
        "Rolf",
        "Rudolf",
        "Sebastian",
        "Simon",
        "Stefan",
        "Steffen",
        "Stephan",
        "Sven",
        "Thomas",
        "Tim",
        "Tobias",
        "Tom",
        "Uwe",
        "Viktor",
        "Volker",
        "Walter",
        "Werner",
        "Wilhelm",
        "Wolfgang",
        "Xaver",
        "Yannick",
        "Yannik",
        "Yannis",
        "York",
        "Yves",
        "Zacharias",
        "Zeno",
        "Adrian",
        "Albert",
        "Alfons",
        "Albrecht",
        "Alfred",
        "Alois",
        "Amadeus",
        "Anatol",
        "Andi",
        "Andre",
        "Andy",
        "Antonius",
        "Armin",
        "Arnold",
        "Artur",
        "August",
        "Bastian",
        "Ben",
        "Benedikt",
        "Bernhard",
        "Boris",
        "Bruno",
        "Caspar",
        "Cédric",
        "Christiano",
        "Christof",
        "Claudio",
        "Constantin",
        "Cord",
        "Dennis",
        "Detlef",
        "Dieter",
        "Dietmar",
        "Dirk",
        "Dominic",
        "Eduard",
        "Egon",
        "Elias",
        "Elmar",
        "Enrico",
        "Enzo",
        "Erich",
        "Ernst",
        "Erwin",
        "Ewald",
        "Fabio",
        "Fabrice",
        "Ferdinand",
        "Finn",
        "Francesco",
        "Franz",
        "Franziskus",
        "Fridolin",
        "Fritz",
        "Gabriel",
        "Gerd",
        "Gero",
        "Günther",
        "Gunnar",
        "Hanno",
        "Harald",
        "Hartmut",
        "Hartwig",
        "Heiko",
        "Heiner",
        "Helmut",
        "Hendrik",
        "Henry",
        "Heribert",
        "Hieronymus",
        "Hubert",
        "Ignaz",
        "Ilja",
        "Ingmar",
        "Ingolf",
        "Ingo",
        "Isaak",
        "Ismael",
        "Ivan",
        "Jannik",
        "Jörg",
        "Joris",
        "Julius",
        "Kai",
        "Karsten",
        "Kaspar",
        "Kevin",
        "Knut",
        "Konstantin",
        "Korbinian",
        "Laurenz",
        "Leander",
        "Leonard",
        "Lennart",
        "Lennert",
        "Leon",
        "Loris",
        "Louis",
        "Luca",
        "Lucas",
        "Ludger",
        "Magnus",
        "Malte",
        "Marc",
        "Marek",
        "Marian",
        "Mario",
        "Marvin",
        "Maximilian",
        "Mehmet",
        "Michel",
        "Mike",
        "Mirko",
        "Nils",
        "Norbert",
        "Oskar",
        "Pascal",
        "Patric",
        "Pit",
        "Rafael",
        "Rainer",
        "Ralph",
        "Raphael",
        "Reiner",
        "René",
        "Robin",
        "Rocco",
        "Roman",
        "Ronny",
        "Rudi",
        "Rupert",
        "Samuel",
        "Sascha",
        "Sergej",
        "Steve",
        "Theo",
        "Theodor",
        "Thorben",
        "Thorsten",
        "Toni",
        "Torben",
        "Udo",
        "Ulf",
        "Ulrich",
        "Valentin",
        "Victor",
        "Vincent",
        "Wenzel",
        "Willi",
        "Willy",
        "Abel",
        "Alan",
        "Alaric",
        "Arthur",
        "Axel",
        "Claus",
        "Denis",
        "Emmerich",
        "Enno",
        "Falk",
        "Gernot",
        "Gilbert",
        "Gisbert",
        "Hagen",
        "Hanns",
        "Heinz",
        "Hjalmar",
        "Johann",
        "Leonhard",
        "Marcel",
        "Abelard",
        "Alarich",
        "Alwin",
        "Damian",
        "Eberhard",
        "Eckard",
        "Eric",
        "Justus",
        "Leopold",
        "Lothar",
        "Melchior",
        "Niklas",
        "Noah",
        "Oswald",
        "Ralf",
        "Waldemar",
        "Wolfram",
        "Aaron",
        "Abraham",
        "Achim",
        "Adam",
        "Arno",
        "Baldur",
        "Balthasar",
        "Bertram",
        "Cedric",
        "Edmund",
        "Engelbert",
        "Eugen",
        "Jannis",
        "Jasper",
        "Kasimir",
        "Rüdiger",
        "Sören",
        "Quirin",
        "Till",
        "Yanick",
        "Helge",
        "Erdmann",
        "Helmfried",
        "Nickolaus",
        "Adelbert",
        "Erhard",
        "Niklaus",
        "Adolf",
        "Helmuth",
        "Alban",
        "Ortwin",
        "Henning",
        "Othmar",
        "Ottmar",
        "Evert",
        "Aloysius",
        "Hermenegild",
        "Ottokar",
        "Ferdi",
        "Hilbert",
        "Ottomar",
        "Amand",
        "Fester",
        "Hildebert",
        "Anselm",
        "Filibert",
        "Hildebrand",
        "Pankraz",
        "Ansgar",
        "Hinrich",
        "Parsifal",
        "Frej",
        "Arndt",
        "Friedemann",
        "Huppert",
        "Poldi",
        "Arne",
        "Friedhelm",
        "Friedhold",
        "Ignatz",
        "Raffael",
        "Immanuel",
        "Reimund",
        "Aurel",
        "Rambert",
        "Gabi",
        "Ivo",
        "Baptist",
        "Rein",
        "Bartholomäus",
        "Gebbert",
        "Jochem",
        "Gebhard",
        "Beat",
        "Geert",
        "Jochim",
        "Reinhold",
        "Reto",
        "Benno",
        "Gerald",
        "Bernd",
        "Gereon",
        "Berthold",
        "Gerfried",
        "Karlmann",
        "Sepp",
        "Bonifaz",
        "Seppel",
        "Gerhardt",
        "Siegbert",
        "Burkhard",
        "Gerhold",
        "Siegfried",
        "Kayetan",
        "Sieghard",
        "Kolman",
        "Siegmund",
        "Carsten",
        "Gerold",
        "Siegward",
        "Gert	Körbl",
        "Sigi",
        "Gerulf",
        "Kord",
        "Sigismund",
        "Clemens",
        "Gervas",
        "Kunibert",
        "Sigiswald",
        "Conrad",
        "Kuno",
        "Corbinian",
        "Gottfried",
        "Gotthard",
        "Theophil",
        "Gotthilf",
        "Lammert",
        "Gotthold",
        "Lamprecht",
        "Tillo",
        "Didi",
        "Gottlieb",
        "Lanzo",
        "Diederich",
        "Gottlob",
        "Leberecht",
        "Traugott",
        "Dierk",
        "Gottschalk",
        "Lenz",
        "Dietfried",
        "Günter",
        "Urs",
        "Diethelm",
        "Utz",
        "Guntram",
        "Dietrich",
        "Ludolf",
        "Dirk	Hagan",
        "Veit",
        "Hanke",
        "Luitger",
        "Vester",
        "Ebbe",
        "Hanne",
        "Luitpold",
        "Vinzent",
        "Vinzenz",
        "Eckart	Hans	Lutz	Volker",
        "Eckbert",
        "Eckehard",
        "Hartmann",
        "Manfried",
        "Walther",
        "Eckhard",
        "Marwin",
        "Eckhart",
        "Marzell",
        "Wenzeslaus",
        "Hartwin",
        "Matthäus",
        "Werther",
        "Heike",
        "Meinard",
        "Wilfried",
        "Meino",
        "Ekkehardt",
        "Meinrad",
        "Winfried",
        "Heino",
        "Merten",
        "Wulf",
        "Engel",
        "Mose",
        "Helfried",
        "Karl-Heinz",
        "Joachim",
        "Hans-Jürgen",
        "Hans-Joachim",
        "Torsten",
        "Olaf",
        "Hans-Peter",
        "Lutz",
        "Harry",
        "Karlheinz",
        "Klaus-Dieter",
        "Hans-Dieter",
        "Mathias",
        "Guido",
        "Marcus",
        "Rene",
        "Christophe",
        "Miche",

    )

    private val femaleNames = listOf(

        "Emma",
        "Mia",
        "Hanna",
        "Sofia",
        "Emilia",
        "Lena",
        "Anna",
        "Lea",
        "Clara",
        "Laura",
        "Marie",
        "Sarah",
        "Sophia",
        "Lina",
        "Leonie",
        "Johanna",
        "Amelie",
        "Pauline",
        "Charlotte",
        "Maja",
        "Emily",
        "Luisa",
        "Ella",
        "Mathilda",
        "Julia",
        "Frieda",
        "Olivia",
        "Emma-Louise",
        "Elisa",
        "Lotte",
        "Isabella",
        "Sophie",
        "Greta",
        "Hannah",
        "Merle",
        "Ida",
        "Mia-Sophie",
        "Lisa",
        "Mia-Marie",
        "Leni",
        "Mila",
        "Franziska",
        "Annika",
        "Johanne",
        "Jana",
        "Nele",
        "Victoria",
        "Amalia",
        "Emely",
        "Helena",
        "Pia",
        "Rosalie",
        "Carla",
        "Emelie",
        "Katharina",
        "Mira",
        "Josefine",
        "Paula",
        "Nina",
        "Stella",
        "Leonora",
        "Valerie",
        "Margarete",
        "Romy",
        "Kathrin",
        "Alina",
        "Liv",
        "Malin",
        "Sina",
        "Johanna-Marie",
        "Johanna-Sophie",
        "Fanny",
        "Karoline",
        "Mona",
        "Paula-Marie",
        "Carina",
        "Louisa",
        "Celine",
        "Luisa-Marie",
        "Miriam",
        "Viktoria",
        "Felicia",
        "Chiara",
        "Katja",
        "Mia-Madeleine",
        "Jule",
        "Ina",
        "Elisabeth",
        "Kim",
        "Kristina",
        "Lara",
        "Alexandra",
        "Mina",
        "Annelie",
        "Janina",
        "Anne",
        "Denise",
        "Svenja",
        "Maike",
        "Susanne",
        "Annabell",
        "Patricia",
        "Isabell",
        "Sabrina",
        "Dorothea",
        "Jaqueline",
        "Emilia-Sophie",
        "Clarissa",
        "Leonie-Marie",
        "Evelyn",
        "Mareike",
        "Svenia",
        "Tanja",
        "Vanessa",
        "Jacqueline",
        "Rebekka",
        "Mareen",
        "Stephanie",
        "Tina",
        "Gisela",
        "Evelyn-Maria",
        "Iris",
        "Leoni",
        "Annemarie",
        "Hannah-Marie",
        "Sophie-Marie",
        "Elina",
        "Linda",
        "Lara-Marie",
        "Jolina",
        "Elvira",
        "Juliane",
        "Christine",
        "Yvonne",
        "Ulrike",
        "Marianne",
        "Edith",
        "Veronika",
        "Petra",
        "Ramona",
        "Sina-Marie",
        "Lotta",
        "Renate",
        "Manuela",
        "Jenny",
        "Josephine",
        "Constanze",
        "Helene",
        "Cäcilia",
        "Rebecca",
        "Kim-Marie",
        "Isabelle",
        "Ines",
        "Marina",
        "Mareike-Marie",
        "Carola",
        "Laura-Marie",
        "Mandy",
        "Anja",
        "Editha",
        "Gertrud",
        "Jana-Marie",
        "Annett",
        "Annemone",
        "Sina-Sophie",
        "Katrin",
        "Silke",
        "Vanessa-Marie",
        "Thea",
        "Ricarda",
        "Ute",
        "Daniela",
        "Angelika",
        "Sandra",
        "Annabelle",
        "Annika-Marie",
        "Karina",
        "Heike",
        "Inga",
        "Christiane",
        "Caren",
        "Kim-Sophie",
        "Isabell-Marie",
        "Ruth",
        "Saskia",
        "Silvia",
        "Grit",
        "Anika",
        "Maike-Marie",
        "Charlotte-Marie",
        "Sigrid",
        "Jolina-Marie",
        "Valerie-Marie",
        "Marlies",
        "Beatrice",
        "Mandy-Marie",
        "Angela",
        "Franziska-Marie",
        "Celine-Marie",
        "Merle-Marie",
        "Svea",
        "Karin",
        "Carina-Marie",
        "Marianne-Marie",
        "Maria",
        "Anneliese",
        "Lea-Marie",
        "Tina-Marie",
        "Kirsten",
        "Kim-Marina",
        "Sina-Marina",
        "Isabell-Sophie",
        "Marlene",
        "Laura-Sophie",
        "Lene-Marie",
        "Amelie-Marie",
        "Jolina-Sophie",
        "Ella-Marie",
        "Annelie-Marie",
        "Lena-Marie",
        "Jasmin",
        "Karolin",
        "Rosalie-Marie",
        "Viola",
        "Greta-Marie",
        "Larissa",
        "Maria-Marie",
        "Nadine",
        "Magdalena",
        "Claudia",
        "Diana",
        "Jasmina",
        "Selina",
        "Ella-Sophie",
        "Annika-Sophie",
        "Maren",
        "Sandra-Marie",
        "Meike",
        "Christine-Marie",
        "Anne-Marie",
        "Lisa-Marie",
        "Janine",
        "Nina-Marie",
        "Silvia-Marie",
        "Leonie-Sophie",
        "Annelie-Sophie",
        "Sabine",
        "Rebecca-Marie",
        "Pia-Marie",
        "Ann-Kathrin",
        "Alexandra-Marie",
        "Lena-Sophie",
        "Birgit",
        "Dana",
        "Johanna-Sophia",
        "Jana-Sophie",
        "Elisa-Marie",
        "Sina-Marlene",
        "Jacqueline-Marie",
        "Lisa-Sophie",
        "Christina",
        "Jana-Marina",
        "Sina-Sophia",
        "Kim-Sophia",
        "Paulina",
        "Helga",
        "Annika-Sophia",
        "Charlotte-Sophie",
        "Lilly",
        "Svenja-Marie",
        "Sina-Marlies",
        "Karina-Marie",
        "Yvonne-Marie",
        "Marie-Sophie",
        "Kim-Marleen",
        "Isabella-Marie",
        "Marianne-Sophie",
        "Michelle",
        "Sina-Maria",
        "Gudrun",
        "Marianne-Marlene",
        "Andrea",
        "Silke-Marie",
        "Meike-Marie",
        "Jessica",
        "Magdalena-Marie",
        "Sabine-Marie",
        "Martina",
        "Stephanie-Marie",
        "Brigitte",
        "Hanna-Marie",
        "Elvira-Marie",
        "Ramona-Marie",
        "Rosalie-Sophie",
        "Lena-Marlene",
        "Ulrike-Marie",
        "Lisa-Marlene",
        "Laura-Marlene",
        "Jolina-Marlene",
        "Katharina-Marie",
        "Miriam-Marie",
        "Pia-Sophie",
        "Sina-Katharina",
        "Julia-Marie",
        "Margarete-Marie",
        "Isabell-Marlene",
        "Ines-Marie",
        "Kathrin-Marie",
        "Karolin-Marie",
        "Sandra-Marlene",
        "Nadine-Marie",
        "Tina-Marlene",
        "Alexandra-Sophie",
        "Verena",
        "Jana-Sophia",
        "Laura-Sophia",
        "Sophie-Sophie",
        "Greta-Sophie",
        "Maja-Marie",
        "Lea-Sophie",
        "Ann-Sophie",
        "Vivian",
        "Isabella-Sophie",
        "Ramona-Sophie",
        "Kristin",
        "Sina-Kristin",
        "Heike-Marie",
        "Jana-Marlene",
        "Marie-Marlene",
        "Annemarie-Sophie",
        "Sina-Christine",
        "Evelyn-Marie",
        "Julia-Sophie",
        "Isabelle-Marie",
        "Ramona-Marlene",
        "Anke",
        "Miriam-Sophie",
        "Martina-Marie",
        "Stephanie-Sophie",
        "Anna-Maria",
        "Christiane-Marie",
        "Pia-Marlene",
        "Silvia-Marlene",
        "Elvira-Sophie",
        "Claudia-Marie",
        "Ulrike-Sophie",
        "Helga-Marie",
        "Carina-Sophie",
        "Annelie-Marlene",
        "Birgit-Marie",
        "Paula-Sophie",
        "Marie-Marie",
        "Emily-Sophie",
        "Clara-Marie",
        "Emma-Marie",
        "Hannah-Sophie",
        "Lina-Marie",
        "Emily-Marie",
        "Anna-Marie",
        "Mathilda-Marie",
        "Emma-Sophie",
        "Emilia-Marie",
        "Hanna-Sophie",
        "Pauline-Marie",
        "Sofia-Marie",
        "Lina-Sophie",
        "Clara-Sophie",
        "Anna-Sophie",
        "Sarah-Marie",
        "Sophia-Marie",
        "Mia-Louise",
        "Lotte-Marie",
        "Ida-Marie",
        "Leni-Marie",
        "Mila-Marie",
        "Johanne-Marie",
        "Nele-Marie",
        "Victoria-Marie",
        "Amalia-Marie",
        "Emely-Marie",
        "Helena-Marie",
        "Carla-Marie",
        "Emelie-Marie",
        "Mira-Marie",
        "Josefine-Marie",
        "Stella-Marie",
        "Leonora-Marie",
        "Romy-Marie",
        "Alina-Marie",
        "Liv-Marie",
        "Malin-Marie",
        "Fanny-Marie",
        "Karoline-Marie",
        "Mona-Marie",
        "Louisa-Marie",
        "Viktoria-Marie",
        "Felicia-Marie",
        "Chiara-Marie",
        "Katja-Marie",
        "Jule-Marie",
        "Ina-Marie",
        "Elisabeth-Marie",
        "Kristina-Marie",
        "Mina-Marie",
        "Janina-Marie",
        "Denise-Marie",
        "Susanne-Marie",
        "Annabell-Marie",
        "Patricia-Marie",
        "Sabrina-Marie",
        "Dorothea-Marie",
        "Jaqueline-Marie",
        "Emilia-Sophie-Marie",
        "Clarissa-Marie",
        "Svenia-Marie",
        "Tanja-Marie",
        "Rebekka-Marie",
        "Mareen-Marie",
        "Gisela-Marie",
        "Evelyn-Maria-Marie",
        "Iris-Marie",
        "Leoni-Marie",
        "Annemarie-Marie",
        "Elina-Marie",
        "Linda-Marie",
        "Laura-Maria",
        "Viktoria-Sophie",
        "Lena-Marleen",
        "Ella-Marleen",
        "Leonie-Sophia",
        "Emilia-Sophia",
        "Clara-Sophia",
        "Anna-Sophia",
        "Laura-Marleen",
        "Sarah-Marleen",
        "Sophia-Marleen",
        "Mia-Louisa",
        "Lina-Marleen",
        "Emma-Louisa",
        "Hanna-Louisa",
        "Marie-Louisa",
        "Lena-Marina",
        "Ella-Marina",
        "Johanna-Marina",
        "Leonie-Marina",
        "Emilia-Marina",
        "Clara-Marina",
        "Anna-Marina",
        "Laura-Marina",
        "Sarah-Marina",
        "Sophia-Marina",
        "Mia-Luisa",
        "Lina-Marina",
        "Emma-Luisa",
        "Hanna-Luisa",
        "Marie-Luisa",
        "Lena-Marisa",
        "Ella-Marisa",
        "Johanna-Marisa",
        "Leonie-Marisa",
        "Emilia-Marisa",
        "Clara-Marisa",
        "Anna-Marisa",
        "Laura-Marisa",
        "Sarah-Marisa",
        "Sophia-Marisa",
        "Mia-Lotta",
        "Lina-Marisa",
        "Emma-Lotta",
        "Hanna-Lotta",
        "Marie-Lotta",
        "Lena-Mariah",
        "Ella-Mariah",
        "Johanna-Mariah",
        "Leonie-Mariah",
        "Emilia-Mariah",
        "Clara-Mariah",
        "Anna-Mariah",
        "Laura-Mariah",
        "Sarah-Mariah",
        "Sophia-Mariah",
        "Mia-Madita",
        "Lina-Mariah",
        "Emma-Madita",
        "Hanna-Madita",
        "Marie-Madita",
        "Lena-Mareike",
        "Ella-Mareike",
        "Johanna-Mareike",
        "Leonie-Mareike",
        "Emilia-Mareike",
        "Clara-Mareike",
        "Anna-Mareike",
        "Laura-Mareike",
        "Sarah-Mareike",
        "Sophia-Mareike",
        "Mia-Magdalena",
        "Lina-Mareike",
        "Emma-Magdalena",
        "Hanna-Magdalena",
        "Marie-Magdalena",
        "Lena-Maren",
        "Ella-Maren",
        "Johanna-Maren",
        "Leonie-Maren",
        "Emilia-Maren",
        "Clara-Maren",
        "Anna-Maren",
        "Laura-Maren",
        "Sarah-Maren",
        "Sophia-Maren",
        "Mia-Maria",
        "Lina-Maren",
        "Emma-Maria",
        "Hanna-Maria",
        "Marie-Maria",
        "Lena-Maria",
        "Ella-Maria",
        "Johanna-Maria",
        "Leonie-Maria",
        "Emilia-Maria",
    )
}