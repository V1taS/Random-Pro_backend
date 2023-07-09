package com.sosinvitalii.database.riddles

import com.sosinvitalii.feature.riddles.RiddleResponseRemote

/// Загадки на английском языке
object EnglishRiddles {
    fun fetch(difficult: Difficult): List<RiddleResponseRemote> {
        return if (difficult == Difficult.HARD) {
            hardRiddles
        } else {
            easyRiddles
        }
    }

    private val easyRiddles = listOf(
        RiddleResponseRemote(
            question = "What can I see with my eyes closed?", answer = "Dreams"
        ),
        RiddleResponseRemote(
            question = "What is always there but never gets saturated?", answer = "Hunger"
        ),
        RiddleResponseRemote(
            question = "Who always goes but never comes?", answer = "Sun"
        ),
        RiddleResponseRemote(
            question = "What grows when you feed, but dies if you drink?", answer = "Plant or flower"
        ),
        RiddleResponseRemote(
            question = "What can be broken without even touching?", answer = "Silence"
        ),
        RiddleResponseRemote(
            question = "Which room never has furniture?", answer = "Mushroom house (mushroom growing room)"
        ),
        RiddleResponseRemote(
            question = "What always goes, but never runs, and always runs, but never goes?", answer = "Clock"
        ),
        RiddleResponseRemote(
            question = "Which word becomes shorter if you add a letter to it?", answer = "The word 'short'"
        ),
        RiddleResponseRemote(
            question = "What becomes more and more when you add more and more?", answer = "Pit or pit."
        ),
        RiddleResponseRemote(
            question = "Who walks on four legs in the morning, on two legs in the afternoon and on three legs in the evening?",
            answer = "Man: walks on four legs (crawls) as a child, on two legs as an adult and uses a cane in old age."
        ),
        RiddleResponseRemote(
            question = "Always ready, never eaten. It's on the move all the time, but it never moves. What is it?",
            answer = "Water"
        ),
        RiddleResponseRemote(
            question = "It goes up, but it never goes down. What is it?", answer = "Age"
        ),
        RiddleResponseRemote(
            question = "What can be taken in the left hand, but cannot be taken in the right?", answer = "Right hand"
        ),
        RiddleResponseRemote(
            question = "What word can be written with one letter?", answer = "Word'o'"
        ),
        RiddleResponseRemote(
            question = "A little girl threw a ball. He returned to her without hitting any surface. How is this possible?",
            answer = "She threw the ball up"
        ),
        RiddleResponseRemote(
            question = "What can be broken if dropped, but cannot be repaired?", answer = "Egg"
        ),
        RiddleResponseRemote(
            question = "What can be shared, but not eaten?", answer = "Secret"
        ),
        RiddleResponseRemote(
            question = "What does every person have, and it always ends with the number 5?", answer = "His age"
        ),
        RiddleResponseRemote(
            question = "A pear is hanging, you can't eat. What is it?", answer = "Light bulb"
        ),
        RiddleResponseRemote(
            question = "That you can only hold on for one minute, despite the fact that it's neither hard nor hot?",
            answer = "Breathing"
        ),
        RiddleResponseRemote(
            question = "Which one grows up by the roots?", answer = "Lotus"
        ),
        RiddleResponseRemote(
            question = "What will hang in the air if it doesn't fall to the ground?", answer = "Shadow"
        ),
        RiddleResponseRemote(
            question = "What is always 13 points, but never 14?",
            answer = "In the numerical list of the alphabetic alphabet, where the letter 'M' is the 13th letter, but the letter 'N' is no longer there."
        ),
        RiddleResponseRemote(
            question = "What can I buy but not eat?", answer = "Dishes"
        ),
        RiddleResponseRemote(
            question = "What can he say but not listen to?", answer = "Phone"
        ),
        RiddleResponseRemote(
            question = "How many moons are there in the sky?", answer = "One"
        ),
        RiddleResponseRemote(
            question = "Is it possible to break glass with sound?",
            answer = "Yes, the glass can be broken by a strong sound, for example, a blow from a loudspeaker or an explosion"
        ),
        RiddleResponseRemote(
            question = "What can you hear but never see?", answer = "Echo"
        ),
        RiddleResponseRemote(
            question = "Which sea has no shores?", answer = "Dead Sea"
        ),
        RiddleResponseRemote(
            question = "Who can walk on water without jumping or swimming?", answer = "Shadow."
        ),
        RiddleResponseRemote(
            question = "Which key doesn't open any doors?", answer = "Fake key"
        ),
        RiddleResponseRemote(
            question = "When does the water boil?", answer = "When it reaches its boiling point.(100)"
        ),
        RiddleResponseRemote(
            question = "What does a person have only one, an animal has two, but a bird does not?", answer = "Nose"
        ),
        RiddleResponseRemote(
            question = "What flies without wings?", answer = "Time"
        ),
        RiddleResponseRemote(
            question = "What always goes down but never rises?", answer = "Rain"
        ),
        RiddleResponseRemote(
            question = "Which word becomes shorter if you remove the letters from it?", answer = "Briefly"
        ),
        RiddleResponseRemote(
            question = "What can be seen in the dark, but not in the light?", answer = "Dream"
        ),
        RiddleResponseRemote(
            question = "What goes around the whole world but stays in the corner?", answer = "Stamp on a postage stamp"
        ),
        RiddleResponseRemote(
            question = "Which animal can speak all languages?", answer = "Parrot"
        ),
        RiddleResponseRemote(
            question = "What smiles but doesn't have a mouth?", answer = "Photo"
        ),
        RiddleResponseRemote(
            question = "What can be broken with one touch?", answer = "Light"
        ),
        RiddleResponseRemote(
            question = "What grows up by the roots?", answer = "Teeth"
        ),
        RiddleResponseRemote(
            question = "What never stands still but never moves?", answer = "Conversation"
        ),
        RiddleResponseRemote(
            question = "At what point does everyone become older than their father?", answer = "On my birthday"
        ),
        RiddleResponseRemote(
            question = "What can be held in the left hand, but cannot be held in the right?", answer = "Right hand"
        ),
        RiddleResponseRemote(
            question = "Which is bigger: the number of stars in the sky or the number of grains of sand on the ground?\n",
            answer = "The number of grains of sand on the ground"
        ),
        RiddleResponseRemote(
            question = "What has no beginning, end, or middle?", answer = "Ring"
        ),
        RiddleResponseRemote(
            question = "What can be heard but not said?", answer = "Silence"
        ),
        RiddleResponseRemote(
            question = "What hangs in the air and does not fall?", answer = "Question"
        ),
        RiddleResponseRemote(
            question = "What is always walking next to you, but can never catch up with you?", answer = "Shadow"
        ),
        RiddleResponseRemote(
            question = "What begins and ends with the letter 'e' but has only one letter?", answer = "Letter 'e'"
        ),
        RiddleResponseRemote(
            question = "Which word can be read back and forth and it will remain the same?", answer = "It"
        ),
        RiddleResponseRemote(
            question = "What can you break if you say his name?", answer = "Mirror"
        ),
        RiddleResponseRemote(
            question = "What doesn't have a body, but can hit you?", answer = "Word"
        ),
        RiddleResponseRemote(
            question = "Which key can't be turned in the lock?", answer = "Treble clef"
        ),
        RiddleResponseRemote(
            question = "What makes steps backward when they go forward?", answer = "Escalator"
        ),
        RiddleResponseRemote(
            question = "What falls but never crashes?", answer = "Snow"
        ),
        RiddleResponseRemote(
            question = "What does everyone have, but everyone gives it to others?", answer = "Word"
        ),
        RiddleResponseRemote(
            question = "What can be done only once in a lifetime?", answer = "To be born"
        ),
        RiddleResponseRemote(
            question = "What does everyone have, and it always ends with the number 5?", answer = "Age"
        ),
        RiddleResponseRemote(
            question = "What can I take off but not put on?", answer = "Consequences"
        ),
        RiddleResponseRemote(
            question = "What flies without wings and falls without a parachute?", answer = "Snowflake"
        ),
        RiddleResponseRemote(
            question = "What goes up and never goes down?", answer = "Age"
        ),
        RiddleResponseRemote(
            question = "What grows when it is fed, but dies when it is watered?", answer = "Candle"
        ),
        RiddleResponseRemote(
            question = "What can be done on the table, but can't be eaten?", answer = "Deck of cards"
        ),
        RiddleResponseRemote(
            question = "What increases when you take from it?", answer = "Seam"
        ),
        RiddleResponseRemote(
            question = "What always goes forward, but never comes to light?", answer = "Past"
        ),
        RiddleResponseRemote(
            question = "What has eyes but doesn't see?", answer = "Needle"
        ),
        RiddleResponseRemote(
            question = "What can you wear on your head but never see?", answer = "Header"
        ),
        RiddleResponseRemote(
            question = "What can only be divided in half?", answer = "Cookie"
        ),
        RiddleResponseRemote(
            question = "What starts with the head and ends with the tail?", answer = "Boa constrictor"
        ),
        RiddleResponseRemote(
            question = "That he always lies, but never tells a lie?", answer = "Counter"
        ),
        RiddleResponseRemote(
            question = "Which moves faster—light or sound?", answer = "Sound"
        ),
        RiddleResponseRemote(
            question = "What gets smaller when you take more?", answer = "Step"
        ),
        RiddleResponseRemote(
            question = "What does everyone have, and every day is getting smaller and smaller?", answer = "Time"
        ),
        RiddleResponseRemote(
            question = "What can't be seen, but you can hear, and if you drop it, it will break?", answer = "Echo"
        ),
        RiddleResponseRemote(
            question = "What can be at the end and beginning of each path, and nowhere in the middle?",
            answer = "Letter 'E'"
        ),
        RiddleResponseRemote(
            question = "What is born in the moment, but lives for years?", answer = "Moment"
        ),
        RiddleResponseRemote(
            question = "What always comes but never comes home?", answer = "Tomorrow"
        ),
        RiddleResponseRemote(
            question = "What gets wet when you wipe it?", answer = "Towel"
        ),
        RiddleResponseRemote(
            question = "What can be taken but not given away?", answer = "Memory"
        ),
        RiddleResponseRemote(
            question = "What can't be seen until it disappears?", answer = "Shadow"
        ),
        RiddleResponseRemote(
            question = "What always flies without wings and dies without a sound?", answer = "Conscience"
        ),
        RiddleResponseRemote(
            question = "Call her by her name and she will disappear", answer = "Silence"
        ),
        RiddleResponseRemote(
            question = "What lifts you up and lowers you down, but is itself in place?", answer = "Escalator"
        ),
        RiddleResponseRemote(
            question = "What will be better if it is trampled?", answer = "Path"
        ),
        RiddleResponseRemote(
            question = "What doesn't chew, but devours everything?", answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "Where I go, she goes", answer = "Shadow"
        ),
        RiddleResponseRemote(
            question = "Inanimate, but walking, motionless, but leading", answer = "Road"
        ),
        RiddleResponseRemote(
            question = "It does not flap its wing, but it flies; it is not a bird, but it overtakes birds",
            answer = "Airplane"
        ),
        RiddleResponseRemote(
            question = "What is it: have four colors, change them every three months?", answer = "Seasons"
        ),
        RiddleResponseRemote(
            question = "I met her by chance. I tried to get her, but she was going further and further away. What is it?",
            answer = "Splinter"
        ),
        RiddleResponseRemote(
            question = "Who was born in the sky and buried in the earth?", answer = "Rain, hail"
        ),
        RiddleResponseRemote(
            question = "A barrel of water weighs 50 kilograms, what should I add to make it weigh 15 kilograms?",
            answer = "Hole"
        ),
        RiddleResponseRemote(
            question = "Which word always sounds wrong?", answer = "Incorrect"
        ),
        RiddleResponseRemote(
            question = "The electric train is going downwind. Where is the smoke going?",
            answer = "The electric train has no smoke"
        ),
        RiddleResponseRemote(
            question = "How many peas can go into one glass?", answer = "Not at all, peas don't go"
        ),
        RiddleResponseRemote(
            question = "What is thrown when it is needed, and picked up when it is not needed?", answer = "Sea anchor"
        ),
        RiddleResponseRemote(
            question = "What kind of dishes can't you eat anything from?", answer = "From empty"
        ),
        RiddleResponseRemote(
            question = "What can I share only once?", answer = "Secret"
        ),
        RiddleResponseRemote(
            question = "What will become bigger if you turn it upside down?", answer = "Number 9"
        ),
        RiddleResponseRemote(
            question = "How many years in a year?", answer = "One summer"
        ),
        RiddleResponseRemote(
            question = "Which teeth are the last to appear in a person?", answer = "Artificial"
        ),
        RiddleResponseRemote(
            question = "What happens if the drum is divided into drums", answer = "Drum roll"
        ),
        RiddleResponseRemote(
            question = "The boy says: 'It rained so terribly yesterday, and my father didn't take an umbrella or a hat. When he appeared at the door, water was pouring from him in streams, but not a single hair on his head was wet. There is nowhere to hide from the rain within a mile of our house - there is a bare steppe around.' Why is not a single hair on a man's head wet?",
            answer = "The boy's father was completely bald"
        ),
        RiddleResponseRemote(
            question = "How many months in a year have 28 days?", answer = "All months"
        ),
        RiddleResponseRemote(
            question = "At what speed should the dog move (within the limits possible for it) in order not to hear the ringing of the frying pan tied to its tail?",
            answer = "With zero. The dog needs to stand still"
        ),
        RiddleResponseRemote(
            question = "The dog was tied to a ten-meter rope, and walked two hundred meters in a straight line. How did she do it?",
            answer = "Her rope was not tied to anything"
        ),
        RiddleResponseRemote(
            question = "How to jump off a ten-meter ladder and not get hurt?",
            answer = "Need to jump from the bottom step"
        ),
        RiddleResponseRemote(
            question = "What does not burn in fire and does not sink in water?", answer = "Ice"
        ),
        RiddleResponseRemote(
            question = "Who do Australians call a sea wasp?", answer = "Jellyfish"
        ),
        RiddleResponseRemote(
            question = "What should I do when I see a green man?",
            answer = "Cross the street (this is a drawing on a green traffic light signal)"
        ),
        RiddleResponseRemote(
            question = "Moscow used to be called white stone. And which city was called black?", answer = "Chernihiv"
        ),
        RiddleResponseRemote(
            question = "The inhabitants of medieval Europe sometimes tied wooden chocks to their soles. For what purpose did they do it?",
            answer = "To protect from dirt, because there was no sewer and the slop was poured directly onto the street"
        ),
        RiddleResponseRemote(
            question = "In what process did water replace the sun, after 600 years it was replaced by sand, and after 1100 years all of them were replaced by a mechanism?",
            answer = "In the process of measuring time – hours"
        ),
        RiddleResponseRemote(
            question = "In the old days, barns were built on the outskirts, away from dwellings. For what purpose",
            answer = "So that the fire does not destroy food supplies"
        ),
        RiddleResponseRemote(
            question = "Is it possible to light an ordinary match underwater so that it burns out to the end?",
            answer = "Yes, in a submarine"
        ),
        RiddleResponseRemote(
            question = "How to say correctly: 'I don't see a white yolk' or 'I don't see a white yolk'?",
            answer = "The yolk is usually yellow"
        ),
        RiddleResponseRemote(
            question = "Name five days without naming numbers (1, 2, 3,..) and names of days (Monday, Tuesday, Wednesday ...)?",
            answer = "The day before yesterday, yesterday, today, tomorrow, the day after tomorrow"
        ),
        RiddleResponseRemote(
            question = "When is the best time for a black cat to get into the house?", answer = "When the door is open"
        ),
        RiddleResponseRemote(
            question = "Two fathers and two sons were walking, they found three oranges. They began to divide — everyone got one by one. How could it be?",
            answer = "It was grandfather, father and son"
        ),
        RiddleResponseRemote(
            question = "Small, gray looks like an elephant. Who is this?", answer = "Baby Elephant"
        ),
        RiddleResponseRemote(
            question = "Which hand is better to stir the tea with?", answer = "The one with the spoon in it"
        ),
        RiddleResponseRemote(
            question = "When is a person in a room without a head?",
            answer = "When he puts her out of the room (for example, out of the window)"
        ),
        RiddleResponseRemote(
            question = "Which question can't be answered “yes”?", answer = "Are you asleep?"
        ),
        RiddleResponseRemote(
            question = "Which question can't be answered “no”?", answer = "Are you alive?"
        ),
        RiddleResponseRemote(
            question = "How do day and night end?", answer = "Soft sign"
        ),
        RiddleResponseRemote(
            question = "The magpie is flying, and the dog is sitting on the tail. Could it be?",
            answer = "Yes, the dog is sitting on its own tail, forty flies next to it"
        ),
        RiddleResponseRemote(
            question = "What should I do to keep five guys in one boot?", answer = "Take off a boot for each of them"
        ),
        RiddleResponseRemote(
            question = "How much will it be 2+2*2 ?", answer = "Six"
        ),
        RiddleResponseRemote(
            question = "What should be done so that five guys stay in one boot?",
            answer = "Each of them take off a boot"
        ),
        RiddleResponseRemote(
            question = "In which month does the chatty Svetochka speak the least?",
            answer = "In February – the shortest month"
        ),
        RiddleResponseRemote(
            question = "How to find last year's snow?", answer = "Go outside right after the start of the new year"
        ),
        RiddleResponseRemote(
            question = "A man has one, a cow has two, a hawk has none. What is it?", answer = "Letter ‑O-"
        ),
        RiddleResponseRemote(
            question = "A person is sitting, but you can't sit in his place, even if he gets up and leaves. Where is he sitting?",
            answer = "On your knees"
        ),
        RiddleResponseRemote(
            question = "What stones are not in the sea?", answer = "Dry"
        ),
        RiddleResponseRemote(
            question = "What sign should be placed between the 4th and 5th so that the result is more than 4 and less than 5?",
            answer = "Comma"
        ),
        RiddleResponseRemote(
            question = "Can a rooster call himself a bird?", answer = "No, because he can't speak"
        ),
        RiddleResponseRemote(
            question = "What disease on earth has no one been sick with?", answer = "Marine"
        ),
        RiddleResponseRemote(
            question = "Is it possible to predict the score of any match before it starts?", answer = "Yes, 0 – 0"
        ),
        RiddleResponseRemote(
            question = "Which figure will decrease by a third if you flip it over?", answer = "Digit 9"
        ),
        RiddleResponseRemote(
            question = "A square table sawed off one corner in a straight line . How many corners does the table have now?",
            answer = "Five"
        ),
        RiddleResponseRemote(
            question = "Which knot can't be untied?", answer = "Railway"
        ),
        RiddleResponseRemote(
            question = "What's in front of the cow and behind the bull?", answer = "Letter ‑K-"
        ),
        RiddleResponseRemote(
            question = "Which river is the scariest?", answer = "Tiger"
        ),
        RiddleResponseRemote(
            question = "What has no length, depth, width, height, but can be measured?", answer = "Temperature, time"
        ),
        RiddleResponseRemote(
            question = "What are all the people on earth doing at the same time?", answer = "Getting older"
        ),
        RiddleResponseRemote(
            question = "Two people were playing checkers. Everyone played five games and won five times. Is it possible?",
            answer = "Both people played different games with other people"
        ),
        RiddleResponseRemote(
            question = "How can a thrown egg fly three meters and not break?",
            answer = "You need to throw an egg more than three meters, then the first three meters it will fly whole"
        ),
        RiddleResponseRemote(
            question = "The man was driving a big truck. The headlights on the car were not lit. There was no moon either. The woman began to cross the road in front of the car. How did the driver manage to see her?",
            answer = "It was a bright sunny day"
        ),
        RiddleResponseRemote(
            question = "Where is the edge of the world?", answer = "Where the shadow ends"
        ),
        RiddleResponseRemote(
            question = "Man learned from spiders to build suspension bridges, from cats he adopted the aperture in the camera and reflective road signs. And what invention appeared thanks to snakes?",
            answer = "Syringe"
        ),
        RiddleResponseRemote(
            question = "What can you easily lift from the ground, but not throw far?", answer = "Poplar fluff"
        ),
        RiddleResponseRemote(
            question = "Which comb won't you comb your head with?", answer = "Cockerel"
        ),
        RiddleResponseRemote(
            question = "You are sitting in an airplane, a horse is in front of you, a car is behind you. Where are you located?",
            answer = "On the carousel"
        ),
        RiddleResponseRemote(
            question = "What notes can measure the distance?", answer = "Mi-La-Mi"
        ),
        RiddleResponseRemote(
            question = "What won't go into the biggest pot?", answer = "Her cover"
        ),
        RiddleResponseRemote(
            question = "Russian riddle. A wooden river, a wooden boat, and a wooden smoke flows over the boat. What is it?",
            answer = "Plane"
        ),
        RiddleResponseRemote(
            question = "The satellite makes one revolution around the Earth in 1 hour 40 minutes, and the other in 100 minutes. How can this be?",
            answer = "One hour and forty minutes are equal to one hundred minutes"
        ),
        RiddleResponseRemote(
            question = "In one hand the boy carried one kilogram of iron, and in the other the same amount of fluff. What was harder to carry?",
            answer = "The same"
        ),
        RiddleResponseRemote(
            question = "Which animals always sleep with their eyes open?", answer = "Fish"
        ),
        RiddleResponseRemote(
            question = "What insects are domesticated by man?", answer = "Bees"
        ),
        RiddleResponseRemote(
            question = "Why can't a porcupine drown?", answer = "His needles are hollow"
        ),
        RiddleResponseRemote(
            question = "Name the plant that has the largest fruits?", answer = "Pumpkin"
        ),
        RiddleResponseRemote(
            question = "A hedgehog has 4 g, a dog has 100 g, a horse has 500 g, an elephant has 4-5 kg, a human has 1.4 kg. What?",
            answer = "Brain mass"
        ),
        RiddleResponseRemote(
            question = "As you know, all native Russian female (full) names are either A or Z: Anna, Maria, Olga, etc. However, there is one female name that does not end in either A or Z. Name it.",
            answer = "Love"
        ),
        RiddleResponseRemote(
            question = "A person has twelve pairs of ribs. And who has about three hundred ribs?", answer = "The snake"
        ),
        RiddleResponseRemote(
            question = "In what place did Russian men wear hats and mittens, regardless of the time of year?",
            answer = "In the bath"
        ),
        RiddleResponseRemote(
            question = "Three painters had a brother Ivan, but Ivan had no brothers. How could it be?",
            answer = "Ivan had three sisters"
        ),
        RiddleResponseRemote(
            question = "If it rains at 12 o'clock in the morning, can we expect sunny weather in 72 hours?",
            answer = "No, because it will be midnight again in 72 hours"
        ),
        RiddleResponseRemote(
            question = "There are 8 benches in the park. Three were painted. How many benches are there in the park?",
            answer = "Eight"
        ),
        RiddleResponseRemote(
            question = "The thermometer shows plus 15 degrees. How many degrees will two such thermometers show?",
            answer = "15 degrees"
        ),
        RiddleResponseRemote(
            question = "The loaf was cut into three parts. How many incisions were made?", answer = "Two cuts"
        ),
        RiddleResponseRemote(
            question = "Which is lighter than 1 kg of cotton wool or 1 kg of iron?", answer = "The same"
        ),
        RiddleResponseRemote(
            question = "The truck was going to the village. On the way he met 4 cars. How many cars were going to the village?",
            answer = "One"
        ),
        RiddleResponseRemote(
            question = "Born twice, dies once. Who is this?", answer = "Chicken"
        ),
        RiddleResponseRemote(
            question = "What can't you lift off the floor by the tail?", answer = "Tangle"
        ),
        RiddleResponseRemote(
            question = "Why are riddles dangerous to the head?", answer = "Because people are puzzling over it"
        ),
        RiddleResponseRemote(
            question = "What can snow and lilac bushes have in common?", answer = "Color. Lilac flowers are also white"
        ),
        RiddleResponseRemote(
            question = "What does a watchman do when a sparrow is sitting on his head?", answer = "Sleeping"
        ),
        RiddleResponseRemote(
            question = "Where are cities without houses, rivers without water and forests without trees",
            answer = "On the geographical map"
        ),
        RiddleResponseRemote(
            question = "Which side of the world has one hundred and one letters in its name?", answer = "East"
        ),
        RiddleResponseRemote(
            question = "They go with a load, they stop without a load", answer = "Clock with weights"
        ),
        RiddleResponseRemote(
            question = "Who has a mustache longer than legs?", answer = "Cancer, cockroach"
        ),
        RiddleResponseRemote(
            question = "What was 'tomorrow' and will be 'yesterday'", answer = "Today"
        ),
        RiddleResponseRemote(
            question = "Six legs, two heads, and one tail. What is it?", answer = "Rider on a horse"
        ),
        RiddleResponseRemote(
            question = "Which clock shows the correct time only twice a day?", answer = "Who stopped"
        ),
        RiddleResponseRemote(
            question = "Somehow the guys gathered at a picnic, only 6 people. They look, but instead of 6 apples, they took 5. How to divide apples equally between everyone so that no one is offended? You can't cut or break them",
            answer = "You need to cook compote from apples"
        ),
        RiddleResponseRemote(
            question = "If Erica lives in Washington and Tina lives in Buenos Aires, then where does Ty live?",
            answer = "In Beijing. The names of people are part of the names of the country in whose capital each of them lives."
        ),
        RiddleResponseRemote(
            question = "How can I put two liters of milk in a liter jar?", answer = "Cook condensed milk from it"
        ),
        RiddleResponseRemote(
            question = "How can the number 66 be increased by one and a half times without performing any arithmetic operations on it?",
            answer = "The number 66 just needs to be turned upside down.It will turn out 99, and this is 66, increased by one and a half times"
        ),
        RiddleResponseRemote(
            question = "8 + 7 = 13 or 7 + 8 = 13?", answer = "8 + 7 = 15, not 13"
        ),
        RiddleResponseRemote(
            question = "I was invited to a party. There I saw a man with a very rare watch. How do I know that this watch was stolen?",
            answer = "Because this watch was mine"
        ),
        RiddleResponseRemote(
            question = "A pencil was placed on the floor and several people were asked to jump over it. But no one could do it. Why?",
            answer = "He was placed close to the wall"
        ),
        RiddleResponseRemote(
            question = "You have an electronic watch in front of you. How many times a day will they show the time so that all the cells on the dial (hours, minutes, seconds) will be filled with the same digit?",
            answer = "Three times: 00.00.00; 11.11.11; 22.22.22"
        ),
        RiddleResponseRemote(
            question = "Make a question of five consecutive letters of the Russian alphabet. Hint: maybe it won't be one word.",
            answer = "Where's the hedgehog?"
        ),
        RiddleResponseRemote(
            question = "Half of the half of the number is equal to half. What is this number?",
            answer = "This number is 2. Half of this number is 1, and half of the half of this number (i.e. one) is 0.5, i.e. also half. "
        ),
        RiddleResponseRemote(
            question = "Name two numbers whose number of digits is equal to the number of letters that make up the name of each of these numbers.",
            answer = "One hundred (100) and one million (1000000)"
        ),
        RiddleResponseRemote(
            question = "How many great-grandfathers and great-grandmothers did you have in total?",
            answer = "Each person has 2 parents, 2 grandmothers, and 2 grandfathers, 4 great-grandmothers and 4 great-grandfathers, 8 great-great-grandmothers and 8 great-great-grandfathers."
        ),
        RiddleResponseRemote(
            question = "If three days ago was the day before Monday, what day will it be the day after tomorrow?",
            answer = "The day before Monday was Sunday. If three days ago was Sunday, then today is Wednesday. If today is Wednesday, then the day after tomorrow will be Friday."
        ),
        RiddleResponseRemote(
            question = "A girl dropped her ring into a cup of soluble coffee. Why did the ring remain dry?",
            answer = "Water had not been poured into the cup yet."
        ),
        RiddleResponseRemote(
            question = "Is it red? - No, it's black. So why is it white? Because it's green. What is it?",
            answer = "Black currant."
        ),
        RiddleResponseRemote(
            question = "Two people entered the entrance at the same time. One lives on the 3rd floor, the other on the 9th floor. How many times faster will the first person reach their destination compared to the second person?",
            answer = "Four times, because the first person needs to overcome 2 intervals between floors, while the second person needs to overcome 8."
        ),
        RiddleResponseRemote(
            question = "Airplane, steamboat, hot air balloon, helicopter. Which word doesn't belong here?",
            answer = "Steamboat (it doesn't fly)."
        ),
        RiddleResponseRemote(
            question = "A girl brought 2 white mushrooms, 3 boletes, 4 fly agarics, and 5 russulas from the forest for her grandma's mushroom soup. How many mushrooms will be suitable for the soup?",
            answer = "10 mushrooms, the fly agaric is an inedible mushroom."
        ),
        RiddleResponseRemote(
            question = "Vasya is 5 years old. Anna is 9 years old. What will be the difference in age between them in three years?",
            answer = "Four years (the age difference remains the same)."
        ),
        RiddleResponseRemote(
            question = "There were 9 buns on a tray. 9 girls took one bun each. But there was one bun left on the tray. How did it happen?",
            answer = "The last girl took the bun together with the tray."
        ),
        RiddleResponseRemote(
            question = "There were 20 light bulbs in the chandelier, 5 of them burned out. How many light bulbs are left?",
            answer = "Twenty light bulbs (15 working and 5 burned out)."
        ),
        RiddleResponseRemote(
            question = "From which fabric can't you sew a shirt?", answer = "From railway fabric."
        ),
        RiddleResponseRemote(
            question = "He is my father's son, but not my brother. Who is he?", answer = "He is me."
        ),
        RiddleResponseRemote(
            question = "How to spell 'mouse trap' in five letters?", answer = "Cat."
        ),
        RiddleResponseRemote(
            question = "Who do people take their hats off to?", answer = "To the hairdresser."
        ),
        RiddleResponseRemote(
            question = "When can a person move at the speed of a racing car?", answer = "When they are inside it."
        ),
        RiddleResponseRemote(
            question = "Which baby is born with a mustache?", answer = "For example, a kitten."
        ),
        RiddleResponseRemote(
            question = "The dombra has two, the harp has five, the guitar has six. How many does the piano have?",
            answer = "Seven (octaves)."
        ),
        RiddleResponseRemote(
            question = "There are three apples in a basket. How do you divide them among three children so that one apple remains in the basket?",
            answer = "Give one apple along with the basket."
        ),
        RiddleResponseRemote(
            question = "It is born twice and dies once.", answer = "A chicken."
        ),
        RiddleResponseRemote(
            question = "There is a pear hanging - you can't eat it. It's not a lightbulb.",
            answer = "It's someone else's pear."
        ),
        RiddleResponseRemote(
            question = "Which city contains a man's name and a cardinal direction?", answer = "Vladivostok."
        ),
        RiddleResponseRemote(
            question = "One French writer couldn't stand the Eiffel Tower, but he constantly had lunch on it. How did he explain it?",
            answer = "It's the only place in the city where he can't see it."
        ),
        RiddleResponseRemote(
            question = "What is the fear of Santa Claus called?", answer = "Claustrophobia."
        ),
        RiddleResponseRemote(
            question = "When does a person have as many eyes as there are days in a year?",
            answer = "On the second of January."
        ),
        RiddleResponseRemote(
            question = "One magician claimed that he could put a bottle in the center of a room and crawl into it. How is that possible?",
            answer = "He crawls into the room."
        ),
        RiddleResponseRemote(
            question = "What should you put on a pie before eating it?", answer = "Teeth."
        ),
        RiddleResponseRemote(
            question = "How do you catch a tiger in a cage?",
            answer = "Tigers can't be put in cages, they have stripes."
        ),
        RiddleResponseRemote(
            question = "Kolya's mom works as a cook at a school, and his dad works at a meat factory. What is Kolya's weight?",
            answer = "Excessive."
        ),
        RiddleResponseRemote(
            question = "What do milk and hedgehogs have in common?", answer = "The ability to curdle."
        ),
        RiddleResponseRemote(
            question = "What goes frequently but travels rarely?", answer = "A staircase."
        ),
        RiddleResponseRemote(
            question = "Where can you find a situation where a knight jumps over another knight?", answer = "In chess."
        ),
        RiddleResponseRemote(
            question = "What kind of plug can't be used to seal a bottle?", answer = "A traffic jam."
        ),
        RiddleResponseRemote(
            question = "They can be metallic or liquid. What are we talking about?", answer = "Nails."
        ),
        RiddleResponseRemote(
            question = "Who has a heel in front of their nose?", answer = "Shoes."
        ),
        RiddleResponseRemote(
            question = "What can you hold in your left hand but not in your right hand?",
            answer = "The elbow of your right hand."
        ),
        RiddleResponseRemote(
            question = "At the table, there is a cowboy, a gentleman, and a yogi. How many feet are on the floor?",
            answer = "One foot. The cowboy puts his feet on the table, the gentleman crosses his legs, and the yogi is meditating."
        ),
        RiddleResponseRemote(
            question = "Which bird should you place to get morning, day, evening, and night at once?",
            answer = "A duck, because it sounds like 'day' in Russian."
        ),
        RiddleResponseRemote(
            question = "In what case will six children, two dogs, and four adults who squeeze under one umbrella not get wet?",
            answer = "In clear weather."
        ),
        RiddleResponseRemote(
            question = "What can't you eat for breakfast?", answer = "Lunch and dinner."
        ),
        RiddleResponseRemote(
            question = "How many letters are in the alphabet?", answer = "Seven, if you count A-L-P-H-A-B-E-T."
        ),
        RiddleResponseRemote(
            question = "What is black when it's clean and white when it's dirty?", answer = "A chalkboard."
        ),
        RiddleResponseRemote(
            question = "What consists of one word but has thousands of letters?", answer = "Mail."
        ),
        RiddleResponseRemote(
            question = "Masha's mom has 5 daughters: Yulia, Anya, Olya, Katya. What is the name of the fifth daughter?",
            answer = "Masha."
        ),
        RiddleResponseRemote(
            question = "Who has a heel in front and a heel in back?", answer = "The letter 'C'."
        ),
        RiddleResponseRemote(
            question = "Two bellies - four ears.", answer = "A pillow."
        ),
        RiddleResponseRemote(
            question = "Which faucet can't you wash your hands with?", answer = "A tower faucet."
        ),
        RiddleResponseRemote(
            question = "Can it rain for two consecutive days?", answer = "No, there is a night between them."
        ),
        RiddleResponseRemote(
            question = "What does half an orange resemble the most?", answer = "The other half of the orange."
        ),
        RiddleResponseRemote(
            question = "A hunter was passing by a clock tower. He took out his gun and shot. Where did he hit?",
            answer = "He hit the police station."
        ),
        RiddleResponseRemote(
            question = "How many sheep does Abdul have left?", answer = "14."
        ),
        RiddleResponseRemote(
            question = "What was the tallest mountain on Earth before Mount Everest was discovered?",
            answer = "Mount Everest, even though it hadn't been discovered."
        ),
        RiddleResponseRemote(
            question = "Where does Tuesday come before Monday?", answer = "In the dictionary."
        ),
        RiddleResponseRemote(
            question = "Eskimos are good hunters, but they never hunt penguins. Why?",
            answer = "Eskimos live in the North, and penguins live in the South."
        ),
        RiddleResponseRemote(
            question = "Which letter should you hide behind a pronoun to get the name of an animal?",
            answer = "The letter 'C' behind 'I' - it becomes 'cat'."
        ),
        RiddleResponseRemote(
            question = "What can be found in December but not in any other month?", answer = "The letter 'D'."
        ),
        RiddleResponseRemote(
            question = "What invention allows you to see through walls?", answer = "A door."
        ),
        RiddleResponseRemote(
            question = "More than an hour, less than a minute.", answer = "A second, the hand of some clock models."
        ),
        RiddleResponseRemote(
            question = "Why is the stop valve in trains red, but in airplanes it's blue?",
            answer = "Airplanes don't have a stop valve."
        ),
        RiddleResponseRemote(
            question = "What table doesn't have legs?", answer = "A diet table."
        ),
        RiddleResponseRemote(
            question = "How can a person stay awake for 8 days?", answer = "By sleeping at night."
        ),
        RiddleResponseRemote(
            question = "Which animal do people walk on and cars drive on?", answer = "A zebra crossing."
        ),
        RiddleResponseRemote(
            question = "In which word is 'no' used 100 times?", answer = "Groans."
        ),
        RiddleResponseRemote(
            question = "What path has never been walked or driven on by anyone?", answer = "The Milky Way."
        ),
        RiddleResponseRemote(
            question = "Which drink and natural phenomenon are hidden in one word?", answer = "Grapes (grape + rain)."
        ),
        RiddleResponseRemote(
            question = "There are seven brothers for one sister. How many sisters are there in total?", answer = "One."
        ),
        RiddleResponseRemote(
            question = "One and a half pike cost one and a half rubles. How much do 13 pikes cost?",
            answer = "13 rubles."
        ),
        RiddleResponseRemote(
            question = "Small and distant, resembling an onion. Bitter and burns too.", answer = "Garlic."
        ),
        RiddleResponseRemote(
            question = "Anna closed her eyes. What can Anna see without opening them?", answer = "Dreams."
        ),
        RiddleResponseRemote(
            question = "Mom knitted three scarves and six socks for her children. How many children does she have?",
            answer = "Three."
        ),
        RiddleResponseRemote(
            question = "There are four pears on the table, and one of them was later cut in half. How many pears are left on the table?",
            answer = "4."
        ),
        RiddleResponseRemote(
            question = "A team of three horses ran five kilometers. How many kilometers did each of the horses run?",
            answer = "Each horse ran five kilometers."
        ),
        RiddleResponseRemote(
            question = "Who doesn't have enough money to even shave their beard?", answer = "A goat."
        ),
        RiddleResponseRemote(
            question = "Which bird consists of a letter and a river?",
            answer = "I + Volga = Ivolga (a bird species in Russia)."
        ),
        RiddleResponseRemote(
            question = "A horse is running and running, but what can't it run away from?", answer = "Its own tail."
        ),
        RiddleResponseRemote(
            question = "Which animal wears a stone shirt?", answer = "A turtle."
        ),
        RiddleResponseRemote(
            question = "How many cats can you put in an empty box?",
            answer = "One. After that, the box is no longer empty."
        ),
        RiddleResponseRemote(
            question = "A rich house and a poor house are on fire. Which house will the police put out?",
            answer = "The police don't put out fires, the firefighters do."
        ),
        RiddleResponseRemote(
            question = "You are standing in front of three switches. Behind an opaque wall, thereare three bulbs in the off state. You need to manipulate the switches, enter the room, and determine which switch corresponds to each bulb.",
            answer = "First, turn on two switches. After some time, turn off one of them. Enter the room. One bulb will be hot from the switch that was left on, one bulb will be warm from the switch that was turned off, and one bulb will be cold from the switch that was not touched."
        ),
        RiddleResponseRemote(
            question = "Two people are approaching a river. There is a boat near the shore that can only hold one person. Both people crossed to the opposite bank. How did they do it?",
            answer = "They were on different sides of the river."
        ),
        RiddleResponseRemote(
            question = "On the table, there are two coins that add up to 3 rubles. One of them is not 1 ruble. What are those coins?",
            answer = "1 ruble and 2 rubles."
        ),
        RiddleResponseRemote(
            question = "What doesn't have length, depth, width, or height, but can be measured?",
            answer = "Time, temperature."
        ),
        RiddleResponseRemote(
            question = "A yacht is sailing from Nice to San Remo, and another yacht is sailing from San Remo to Nice. They both left the harbors at the same time. In the first hour of the journey, both yachts were sailing at the same speed (60 km/h), but then the first yacht increased its speed to 80 km/h. Which yacht will be closer to Nice at the moment of their meeting?",
            answer = "At the moment of their meeting, they will be at the same distance from Nice."
        ),
        RiddleResponseRemote(
            question = "A woman was walking to Moscow, and three men were walking towards her. Each of them had a bag, and each bag had a cat. How many creatures were heading to Moscow?",
            answer = "Only the woman was walking to Moscow; the others were going in the opposite direction."
        ),
        RiddleResponseRemote(
            question = "There were 10 birds sitting on a tree. A hunter came and shot one bird. How many birds are left on the tree?",
            answer = "None; the other birds flew away."
        ),
        RiddleResponseRemote(
            question = "You are participating in a marathon and overtook the runner who was in second place. What position are you now in?",
            answer = "Second. If you answered that you are now in first place, that's incorrect. You overtook the second runner and took their place, so you are now in second position."
        ),
        RiddleResponseRemote(
            question = "A train is traveling from east to west, and the wind is blowing from north to south. Which direction is the smoke from the chimney going?",
            answer = "It's an electric train, not a steam train!"
        ),
        RiddleResponseRemote(
            question = "There were three cucumbers and four apples on the table. The child took one apple from the table. How many fruits are left on the table?",
            answer = "3 fruits; cucumbers are vegetables."
        ),
        RiddleResponseRemote(
            question = "A product first increased in price by 10%, and then decreased by 10%. What is its current price relative to the original price?",
            answer = "99%: After the price increase to 100%, a 10% increase equals 110%; 10% of 110% is 11%; then subtracting 11% from 110% gives 99%."
        ),
        RiddleResponseRemote(
            question = "How many times does the digit 4 appear in whole numbers from 1 to 50?",
            answer = "5 times: 4, 14, 24, 34, 40, 41, 42, 43, 44 (twice), 45, 46, 47, 48, 49."
        ),
        RiddleResponseRemote(
            question = "You drove a car two-thirds of the way. The gas tank was full at the start, and now it's one-quarter full. Will there be enough gas to reach the end of the journey (at the same rate of consumption)?",
            answer = "No, because 1/4 is less than 1/3."
        ),
        RiddleResponseRemote(
            question = "Father has 5 daughters: Chacha, Cheche, Chichi, Chocho. What is the name of the fifth daughter?",
            answer = "Mary."
        ),
        RiddleResponseRemote(
            question = "A rooster flew to the border between Russia and China. It landed exactly on the border, right in the middle. It laid an egg that fell exactly in the middle as well, split by the border. Which country does the egg belong to?",
            answer = "Roosters don't lay eggs!"
        ),
        RiddleResponseRemote(
            question = "A person has ten fingers on their hands. How many fingers are on ten hands?", answer = "50."
        ),
        RiddleResponseRemote(
            question = "An airplane carrying English tourists was flying from Holland to Spain. It crashed in France. Where should the remaining survivors (the wounded) be buried?",
            answer = "The remaining survivors don't need to be buried! :)"
        ),
        RiddleResponseRemote(
            question = "You are driving a bus with 42 passengers from Boston to Washington. At each of the six stops, three people get off the bus, and at every second stop, four people get off. What is the name of the driver when the driver arrives in Washington after 10 hours?",
            answer = "It's your name because it was mentioned at the beginning that you were driving the bus."
        ),
        RiddleResponseRemote(
            question = "What can you find in minutes, seconds, and days, but not in years, decades, and centuries?",
            answer = "The letter 'N'."
        ),
        RiddleResponseRemote(
            question = "How many times can you subtract 3 from 25?",
            answer = "Once, because after the first subtraction, the number changes to 22."
        ),
        RiddleResponseRemote(
            question = "Mrs. Taylor's bungalow is entirely decorated in pink: pink lights, pink walls, pink carpets, and a pink ceiling. What color are the stairs in this bungalow?",
            answer = "There are no stairs in the bungalow."
        ),
        RiddleResponseRemote(
            question = "In a 12-story building, there is an elevator. On the first floor, there are only 2 people. The number of residents doubles from floor to floor. Which button in the elevator of this building is pressed more often than others?",
            answer = "Regardless of the distribution of residents on the floors, the '1' button is pressed more often."
        ),
        RiddleResponseRemote(
            question = "What can stand and walk at the same time, hang and stand, walk and lie down?",
            answer = "A clock."
        ),
        RiddleResponseRemote(
            question = "What can increase in diameter by 7 times in a matter of seconds?",
            answer = "The pupil of the eye. When transitioning from bright light to darkness, the diameter can change from 1.1 to 8 mm; everything else either barely increases or increases in diameter by no more than 2-3 times."
        ),
        RiddleResponseRemote(
            question = "Water lilies are growing on a lake. Each day, their number doubles. It is known that the water lilies will completely cover the entire surface of the lake in 48 days. How many days will it take for the water lilies to cover half of the lake?",
            answer = "47 days."
        ),
        RiddleResponseRemote(
            question = "Five machines in a textile factory produce five items in five minutes. At each of the six stops, three people get off the bus, and at every second stop, four people get off. How many minutes will it take for 100 machines to produce 100 items?",
            answer = "5 minutes."
        ),
        RiddleResponseRemote(
            question = "Two men were traveling in the same train compartment. One was sitting in front of the other, but they were facing each other. How is this possible?",
            answer = "They were facing each other."
        ),
        RiddleResponseRemote(
            question = "What breaks but never falls down? What falls down but never breaks?",
            answer = "The heart and the atmospheric pressure."
        ),
        RiddleResponseRemote(
            question = "It can be light and heavy, but it weighs nothing. It can be fast and slow, but it doesn't walk, run, or fly. What is it?",
            answer = "Music."
        ),
        RiddleResponseRemote(
            question = "Which muscle in the human body is the strongest?",
            answer = "The jaw muscle and the calf muscle."
        ),
        RiddleResponseRemote(
            question = "The more of them you have, the less they weigh. What are they?", answer = "Holes."
        ),
        RiddleResponseRemote(
            question = "What is always spoken about in future tense?", answer = "Tomorrow."
        ),
        RiddleResponseRemote(
            question = "In one family, there were two sisters who each had one brother. How many children are there in total in the family?",
            answer = "There are 3 children in total: two sisters and one brother."
        ),
        RiddleResponseRemote(
            question = "A river that 'fits' in your mouth?",
            answer = "Gums."
        ),
        RiddleResponseRemote(
            question = "Ducks were flying: one in front and two behind, one behind and two in front, onebetween the two. How many ducks were there in total?",
            answer = "Three ducks."
        ),
        RiddleResponseRemote(
            question = "Moscow - 100, Yaroslavl - 1000, Arkhangelsk - 500. What are they talking about?",
            answer = "Rubles, the images on banknotes."
        ),
        RiddleResponseRemote(
            question =
            "The grandmother carried a hundred eggs to the bazaar, and the bottom fell, how many eggs were left in the basket.",
            answer = "Not one because the bottom fell"
        ),
        RiddleResponseRemote(
            question = "There is a chest at the bottom of the sea. It has everything except one. What's not in it?",
            answer = "Voids"
        ),
        RiddleResponseRemote(
            question = "Guests have come to you, and there is only a bottle of lemonade, a bag of pineapple juice and a bottle of mineral water in the refrigerator. What will you discover first?",
            answer = "Refrigerator"
        ),
        RiddleResponseRemote(
            question = "A man went into a dark room, touched something, the glass broke, and Lucy died. What happened?",
            answer = "Lucy was a fish"
        ),
        RiddleResponseRemote(
            question = "He's sitting on his ass and looking at his ass. What is a person's profession?",
            answer = "Coachman or coachman"
        ),
        RiddleResponseRemote(
            question = "All people want to have a lot of this vegetable, but you can't buy it anywhere. What kind of vegetable is this?",
            answer = "Cabbage is money"
        ),
        RiddleResponseRemote(
            question = "In an African-American family in Kenya, a child was born, all white, even the teeth were snow-white. What's wrong here?",
            answer = "Children are born without teeth"
        ),
        RiddleResponseRemote(
            question = "Jackdaws flew, sat on sticks. They will sit down one at a time — an extra jackdaw, they will sit down two at a time — an extra stick. How many sticks were there and how many jackdaws were there?",
            answer = "Three sticks and four jackdaws"
        ),
        RiddleResponseRemote(
            question = "It was winter. Ivanushka's brother lost his sister Alyonushka. He went to the forest, to look for her in the field, and sees a big river in front of him. How can he get across the river?",
            answer = "On the ice, it was winter"
        ),
        RiddleResponseRemote(
            question = "Lera and Katya decided to play. One girl was playing with a doll, and the other with a teddy bear. Lera did not play with the doll. What did each girl play with?",
            answer = "Lera played with a teddy bear, and Katya with a doll"
        ),
        RiddleResponseRemote(
            question = "You dropped a ring in your coffee. Can you get it without getting your hands wet if you don't have anything and coffee can't be poured out?",
            answer = "Yes, if coffee beans"
        ),
        RiddleResponseRemote(
            question = "A guy walked into a bar, approached the bartender and asked for a glass of water. Instead, the bartender pointed a gun at him. The man said 'thank you' and left. Why?",
            answer = "The guy had a severe hiccup, and the bartender decided to help him by scaring him"
        ),
        RiddleResponseRemote(
            question = "There was a stone on the seashore. A word of 8 letters was written on the stone. When the rich read this word, they cried, the poor rejoiced, and the lovers parted. What was that word?",
            answer = "Temporarily"
        ),
        RiddleResponseRemote(
            question = "How many flowers do I have if all but two of them are roses, all but two are tulips, and all but two are daisies?",
            answer = "Three flowers: a rose, a tulip and a daisy"
        ),
        RiddleResponseRemote(
            question = "Two friends counted passers-by. One sat in place and counted all the passers-by. And the second one walked back and forth and counted those who were coming towards him. Who counted more?",
            answer = "The same. The second one goes in one direction counts some, in the other — others"
        ),
        RiddleResponseRemote(
            question = "A man jumped out of an airplane without a parachute. He landed on solid ground, but remained unharmed. Why?",
            answer = "The plane was on the ground"
        ),
        RiddleResponseRemote(
            question = "The headmaster has a brother, Nikolai. But Nicholas has no brothers. Can it be?",
            answer = "Yes. The school principal can be a woman"
        ),
        RiddleResponseRemote(
            question = "At what time does the moon weigh more?",
            answer = "When it is full"
        ),
        RiddleResponseRemote(
            question = "It is no deeper than the height of a glass, no bigger than the reach of human hands, but no matter how much water is poured into it, it still won't fill up.",
            answer = "Sink"
        ),
        RiddleResponseRemote(
            question = "Whom a mere mortal sees every day, the king — very rarely, and God — never.",
            answer = "of their own kind"
        ),
        RiddleResponseRemote(
            question = "Intersection, traffic light. KAMAZ, a cart and a motorcyclist are standing and waiting for the green light. The yellow light came on, the KAMAZ went. The horse got scared and bit the motorcyclist's ear. Like an accident, but who broke the rules?",
            answer = "The motorcyclist, he was without a helmet"
        ),
        RiddleResponseRemote(
            question = "3 turtles are crawling. The 1st turtle says — two turtles are crawling behind me. The 2nd turtle says — one turtle is crawling behind me and one turtle is crawling in front of me. And the 3rd turtle — two turtles are crawling in front of me and one turtle is crawling behind me. How can this be?",
            answer = "Turtles are crawling around"
        ),
        RiddleResponseRemote(
            question = "How much land does a pit with a diameter of 3 meters and a depth of 3 meters contain?",
            answer = "Not at all, the pits are empty"
        ),
        RiddleResponseRemote(
            question = "A fabulous dwarf needs a new candle every night, which he shines on his way, walking around the city. He can make 1 new candle out of 5 candle stubs. If he has 25 stubs, how many nights will he have enough stock of new candles?",
            answer = "For 6 nights. He will be able to make 5 new candles from 25 stubs, and when they burn out, he can make the sixth of the 5 stubs that will remain from them"
        ),
        RiddleResponseRemote(
            question = "How to write 'duck' in 2 cells?",
            answer = "In the 1st — the letter 'y', in the 2nd — the dot"
        ),
        RiddleResponseRemote(
            question = "Nesla babka na bazar sto yaits, a dno upalo, skol'ko yaits ostalos' v korzine.",
            answer = "Ni odnogo ved' dno upalo"
        ),
        RiddleResponseRemote(
            question = "Na dne morya lezhit sunduk. V nem vse est', krome odnogo. Chego v nem net?",
            answer = "Pustoty"
        ),
        RiddleResponseRemote(
            question = "K tebe prishli gosti, a v kholodil'nike tol'ko butylka limonada, paket s ananasovym sokom i butylka mineral'noy vody. Chto ty otkroyesh' v pervuyu ochered'?",
            answer = "Kholodil'nik"
        ),
        RiddleResponseRemote(
            question = "Muzhchina zashel v temnuyu komnatu, chto-to zadel, steklo razbilos', i Lyusi umerla. Chto proizoshlo?",
            answer = "Lyusi byla rybkoy"
        ),
        RiddleResponseRemote(
            question = "Na pope sidit i v popu glyadit. Kakova zhe professiya cheloveka?",
            answer = "Kucher ili yamschik"
        ),
        RiddleResponseRemote(
            question = "Vse lyudi khotyat, chtoby u nikh bylo mnogo etogo ovoshcha, no ego nigde ne kupish'. Chto eto za ovoshch?",
            answer = "Kapusta-dengi"
        ),
        RiddleResponseRemote(
            question = "V sem'e afroamerikantsev v Kenii rodilsya rebenok, ves' belyy, dazhe zuby byli belosnezhnymi. Chto zdes' ne tak?",
            answer = "Deti rozhdayutsya bez zubov"
        ),
        RiddleResponseRemote(
            question = "Leteli galki, seli na palki. S'yadut po odnoy — gal'ka lishnyaya, s'yadut po dve — palka lishnyaya. Skol'ko bylo palkov i skol'ko bylo galkov?",
            answer = "Tri palki i chetyre galki"
        ),
        RiddleResponseRemote(
            question = "Delo bylo zimoy. Poteryal bratec Ivanushka svoyu sestritsu Alenushku. Poshel on lesom, polem ee iskat', i vidit pered nim bol'shaya reka. Kak emu cherez reku perebrat'sya?",
            answer = "Po l'du, delo zimoy bylo"
        ),
        RiddleResponseRemote(
            question = "Lera i Katya reshili poigrat'. Odna devochka igrala s kukloy, a drugaya s plyushevym medvedem. Lera ne igrala s kukloy. S chem igrala kazhdaya devochka?",
            answer = "Lera igrala s plyushevym medvedem, a Katya s kukloy"
        ),
        RiddleResponseRemote(
            question = "Vy uronili v kofe kol'tso. Mozhno ego dostat', ne namochiv ruki, yesli u vas nichego net i kofe nel'zya vyloit'?",
            answer = "Da, yesli kofe v zernakh"
        ),
        RiddleResponseRemote(
            question = "Zashel muzhik v bar, podoshel k barmenu i poprosil stakan vody. Vmesto etogo barmen nastavil na nego ruzh'ye. Muzhik skazal «spasibo» i ushel. Pochemu?",
            answer = "U muzhika byla sil'naya ikota, a barmen reshil emu pomoch', napugav ego"
        ),
        RiddleResponseRemote(
            question = "Na beregu morya byl kamen'. Na kamne bylo napisano slovo iz 8 bukv. Kogda bogatye chitali eto slovo, oni plakali, bednye radovalis', a vlyublennye rasstavalis'. Chto eto bylo za slovo?",
            answer = "Vremenno"
        ),
        RiddleResponseRemote(
            question = "Skol'ko u menya tsvetov, esli vse iz nikh krome dvukh — rozy, vse krome dvukh — tyul'pany, i vse krome dvukh — margaritki?",
            answer = "Tri tsvetka: roza, tyul'pan i margaritka"
        ),
        RiddleResponseRemote(
            question = "Dva druga schitali prokhozhikh. Odin sidel na meste i schital vsekh prokhozhikh. A vtoroy khodil vzad-vpered i schital tekh, kto idet emu navstrechu. Kto naschital bol'she?",
            answer = "Odinakovo. Vtoroy idet v odnu storonu schitaet odnikh, v druguyu — drugikh"
        ),
        RiddleResponseRemote(
            question = "Chelovek vyprygnul iz samoleta bez parashyuta. On prizemlilsya na tverdyy grunt, no ostalsya nevredimym. Pochemu?",
            answer = "Samolet stoyal na zemle"
        ),
        RiddleResponseRemote(
            question = "U direktora shkoly est' brat Nikolay. No u Nikolaya net brat'ev. Mozhet li takoe byt'?",
            answer = "Da. Direktor shkoly mozhet byt' zhenshchinoy"
        ),
        RiddleResponseRemote(
            question = "V kakoe vremya Luna vesit bol'she?",
            answer = "Kogda ona polnaya"
        ),
        RiddleResponseRemote(
            question = "Glubinoy ona ne bol'she vysoty stakana, razmerom ne bol'she okhvata chelovecheskikh ruk, no skol'ko by vody v nee ni vylivali, ona vse ravno ne zapolnitsya.",
            answer = "Rakovina"
        ),
        RiddleResponseRemote(
            question = "Kogo prostoy smertnyy vidit kazhdyy den', korol' — ochen' redko, a Bog — nikogda.",
            answer = "Sebe podobnykh"
        ),
        RiddleResponseRemote(
            question = "At the bottom of the sea, there is a chest. It contains everything except one thing. What is missing?",
            answer = "Emptiness"
        ),
        RiddleResponseRemote(
            question = "You have guests coming over, and in the fridge, you only have a bottle of lemonade, a package of pineapple juice, and a bottle of mineral water. What will you open first?",
            answer = "The refrigerator"
        ),
        RiddleResponseRemote(
            question = "A man entered a dark room, bumped into something, and the glass broke, causing Lucy to die. What happened?",
            answer = "Lucy was a goldfish"
        ),
        RiddleResponseRemote(
            question = "A person sits on their buttocks and looks into their behind. What is their profession?",
            answer = "A coachman or a gravedigger"
        ),
        RiddleResponseRemote(
            question = "Everyone wants to have a lot of this vegetable, but you can't buy it anywhere. What vegetable is it?",
            answer = "Cabbage-money"
        ),
        RiddleResponseRemote(
            question = "In a Kenyan family of African-Americans, a child was born who was completely white, even their teeth were snow-white. What's wrong with this situation?",
            answer = "Babies are born without teeth"
        ),
        RiddleResponseRemote(
            question = "Magpies were flying and landed on sticks. If one magpie sits alone, there is one extra stick. If they sit in pairs, one stick is missing. How many sticks and how many magpies were there?",
            answer = "Three sticks and four magpies"
        ),
        RiddleResponseRemote(
            question = "In winter, Brother Ivanushka lost his little sister Alyonushka. He went searching for her in the forest and the field when he saw a large river in front of him. How can he cross the river?",
            answer = "On the ice, because it was winter"
        ),
        RiddleResponseRemote(
            question = "Lera and Katya decided to play. One girl played with a doll, and the other played with a teddy bear. Lera didn't play with a doll. What did each girl play with?",
            answer = "Lera played with the teddy bear, and Katya played with the doll"
        ),
        RiddleResponseRemote(
            question = "You dropped a ring into a cup of coffee. Can you retrieve it without getting your hands wet, assuming you have nothing and pouring out the coffee is not an option?",
            answer = "Yes, if the coffee is in the form of beans"
        ),
        RiddleResponseRemote(
            question = "A man walked into a bar, approached the bartender, and asked for a glass of water. Instead, the bartender pointed a gun at him. The man said 'thank you' and left. Why?",
            answer = "The man had a severe case of hiccups, and the bartender scared him to help him get rid of them"
        ),
        RiddleResponseRemote(
            question = "On the seashore, there was a stone with an eight-letter word written on it. When the rich read this word, they cried, the poor rejoiced, and lovers broke up. What word was written?",
            answer = "Temporary"
        ),
        RiddleResponseRemote(
            question = "How many flowers do I have if all of them except two are roses, all of them except two are tulips, and all of them except two are daisies?",
            answer = "Three flowers: a rose, a tulip, and a daisy"
        ),
        RiddleResponseRemote(
            question = "Two friends were counting passersby. One friend sat in one place and counted everyone passing by. The other friend walked back and forth and counted those coming toward him. Who counted more?",
            answer = "They counted the same number. The second friend counted people walking in one direction and the other in the opposite direction."
        ),
        RiddleResponseRemote(
            question = "A person jumped out of an airplane without a parachute. They landed on solid ground but remained unharmed. Why?",
            answer = "The airplane was on the ground"
        ),
        RiddleResponseRemote(
            question = "The school principal has a brother named Nikolay. But Nikolay doesn't have any brothers. How is this possible?",
            answer = "Yes, the school principal can be a woman"
        ),
        RiddleResponseRemote(
            question = "At what time is the Moon heavier?",
            answer = "When it's full"
        ),
        RiddleResponseRemote(
            question = "It is no deeper than the height of a glass and no larger than the span of a person's hand, but no matter how much water you pour into it, it will never fill up.",
            answer = "A sink"
        ),
        RiddleResponseRemote(
            question = "Whom does an ordinary mortal see every day, a king sees very rarely, and God never sees?",
            answer = "People like themselves"
        ),
        RiddleResponseRemote(
            question = "At an intersection, there is a traffic light. A truck, a carriage, and a motorcyclist are waiting for the green light. The yellow light comes on, and the truck starts moving. The horse gets scared and bites the motorcyclist's ear. It seems like an accident, but who broke the rules?",
            answer = "The motorcyclist, because they weren't wearing a helmet"
        ),
        RiddleResponseRemote(
            question = "Three turtles are crawling. The first turtle says, 'Two turtles are crawling behind me.' The second turtle says, 'One turtle is crawling behind me, and one turtle is crawling in front of me.' And the third turtle says, 'Two turtles are crawling in front of me, and one turtle is crawling behind me.' How is this possible?",
            answer = "The turtles are crawling in a circle"
        ),
        RiddleResponseRemote(
            question = "How much land does a hole with a diameter of 3 meters and a depth of 3 meters contain?",
            answer = "None, holes are empty"
        ),
        RiddleResponseRemote(
            question = "A fairy gnome needs a new candle every night, which they use to light their way while walking through the city. They can make one new candle from five candle stubs. If they collect 25 stubs, how many nights will they have enough new candles?",
            answer = "For six nights. They can make five new candles from the 25 stubs, and when those burn out, they can make a sixth candle from the remaining five stubs."
        ),
        RiddleResponseRemote(
            question = "How can you write 'duck' in two boxes?",
            answer = "In the first box, write the letter 'u,' and in the second box, write the word 'dot'"
        ),
        RiddleResponseRemote(
            question = "Which word has 5 'e's and no other vowels?",
            answer = "Переселенец (translates to 'migrant' in English)"
        ),
        RiddleResponseRemote(
            question = "A boy paid 11 rubles for a bottle with a cork. The bottle costs 10 rubles more than the cork. How much does the cork cost?",
            answer = "50 kopecks"
        ),
        RiddleResponseRemote(
            question = "Where on Earth does the wind always blow from the south?",
            answer = "At the North Pole"
        ),
        RiddleResponseRemote(
            question = "A man bought fruits for 10 rubles each and sold them for 5 rubles each. After some time, he became a millionaire. How did he do it?",
            answer = "He was a billionaire"
        ),
        RiddleResponseRemote(
            question = "Which island refers to itself as an item of clothing?",
            answer = "Jamaica, I'm a coat (pronounced as 'ya, my coat')"
        ),
        RiddleResponseRemote(
            question = "What small horse should you put between two pronouns to get the name of a country?",
            answer = "Pony, Japan"
        ),
        RiddleResponseRemote(
            question = "There are 100 sheets of paper on the table. You can count 10 sheets in 10 seconds. How many seconds will it take to count 80 sheets?",
            answer = "80 seconds"
        ),
        RiddleResponseRemote(
            question = "Union, a number, then a preposition - that's the whole riddle. To find the answer, you need to remember rivers.",
            answer = "Source"
        ),
        RiddleResponseRemote(
            question = "A person is completely healthy, not dead, not disabled, but they are carried out of the hospital on someone's hands. Why?",
            answer = "They are a newborn baby"
        ),
        RiddleResponseRemote(
            question = "A can is standing on the table. It is positioned in such a way that one half of it is in the air, and the other half is on the table. What is inside the can, and why will it fall in half an hour?",
            answer = "Ice. It will melt, and the can will fall"
        ),
        RiddleResponseRemote(
            question = "Can you catch water with a net?",
            answer = "Yes, if the water is frozen"
        ),
        RiddleResponseRemote(
            question = "How many different digits do you need to use to write the number 100?",
            answer = "Two, zero and one"
        ),
        RiddleResponseRemote(
            question = "In a month, three Sundays fell on even dates. What day of the week was the 7th of this month?",
            answer = "Friday. The Sundays fall on the dates: 2nd, 9th, 16th, 23rd, and 30th"
        ),
        RiddleResponseRemote(
            question = "Unshod, but wearing boots. Walking on the ground, but upside down.",
            answer = "A nail in a boot"
        ),
        RiddleResponseRemote(
            question = "Can you light a match underwater?",
            answer = "Yes, if you pour water into a container, such as a glass, and hold the match below the glass"
        ),
        RiddleResponseRemote(
            question = "What has a neck but no head?",
            answer = "A bottle"
        ),
        RiddleResponseRemote(
            question = "On which tree does a crow land during a rainstorm?",
            answer = "On a wet tree"
        ),
        RiddleResponseRemote(
            question = "Who can get their hair wet even in a pouring rain without an umbrella?",
            answer = "A bald person"
        ),
        RiddleResponseRemote(
            question = "It flies without wings and cries without eyes.",
            answer = "A cloud"
        ),
        RiddleResponseRemote(
            question = "From which word of seven letters can you remove one letter to leave two letters?",
            answer = "Abecedarium (pronounced as 'abcderium' in English)"
        ),
        RiddleResponseRemote(
            question = "At a football match, the same person always came. Before the start of the game, he predicted the score. How did he do it?",
            answer = "Before the start of the game, the score is always 0:0"
        ),
        RiddleResponseRemote(
            question = "In which language can you speak silently?",
            answer = "Sign language"
        ),
        RiddleResponseRemote(
            question = "There were seven sisters at the dacha, each occupied with something. The first sister was reading a book, the second was cooking food, the third was playing chess, the fourth was solving a sudoku, the fifth was doing laundry, the sixth was taking care of plants. What was the seventh sister doing?",
            answer = "Playing chess"
        ),
        RiddleResponseRemote(
            question = "Mr. Mark was found dead in his office. The cause of death was a gunshot wound to the head. Detective Robin, while examining the crime scene, found a cassette recorder on the table. When he turned it on, he heard Mr. Mark's voice. He was saying, 'This is Mark speaking. Just now, Jones called me and said that in ten minutes, he would be here to shoot me. Running away is useless. I know this recording will help the police arrest Jones. I hear his footsteps on the stairs now. The door is opening...'. The detective's assistant suggested arresting Jones on suspicion of murder. But the detective did not follow his assistant's advice. As it turned out, he was right. Jones was not the killer, as stated on the tape. Question: Why did the detective become suspicious?",
            answer = "The cassette in the recorder was rewound to the beginning. Moreover, Jones would have taken the cassette."
        ),
        RiddleResponseRemote(
            question = "There were 20 people on the bus. At the first stop, 2 people got off, and 3 people got on. At the next stop, 1 person got off, and 4 people got on. At the next stop, 5 people got off, and 2 people got on. At the next stop, 2 people got off, and 1 person got on. At the next stop, 9 people got off, and no one got on. At the next stop, 2 more people got off. Question: How many stops were there?",
            answer = "The answer to the riddle is not as important. This riddle has an unexpected question. While you tell the riddle, the person solving it starts counting the number of people on the bus in their mind, and at the end of the riddle, when you ask about the number of stops, you put them in a dead end."
        ),
        RiddleResponseRemote(
            question = "What does a duck swim from?",
            answer = "From the bank"
        ),
        RiddleResponseRemote(
            question = "An antelope, a kangaroo, and a flea competed in a high jump. The kangaroo jumped 2 meters, the antelope jumped 3 meters, and the flea only jumped half a meter. Who won?",
            answer = "The flea (the antelope jumped only three times its own height, while the flea jumped hundreds of times its own height)"
        ),
        RiddleResponseRemote(
            question = "How many times do the clock hands overlap in a day?",
            answer = "The hands of a clock overlap 22 times in a day"
        ),
        RiddleResponseRemote(
            question = "Is a square a rectangle?",
            answer = "Yes, a square is a rectangle."
        ),
        RiddleResponseRemote(
            question = "Three swallows flew out of the nest. What is the probability that they will be in the same plane after 15 seconds?",
            answer = "100%, because three points always form one plane."
        ),
        RiddleResponseRemote(
            question = "On the table, there is a ruler, a pencil, a compass, and an eraser. You need to draw a circle on a sheet of paper. Where do you start?",
            answer = "You need to get a sheet of paper."
        ),
        RiddleResponseRemote(
            question = "Is it possible to create another element from two chemical elements?",
            answer = "Yes, if the element is galvanic."
        ),
        RiddleResponseRemote(
            question = "In France and Germany, it means zero; in Japan, it means money; in Tunisia, it means a death threat; in Syria, it means a rupture of relations. What does it mean in the United States?",
            answer = "OK (the sign that can be shown with fingers)."
        ),
        RiddleResponseRemote(
            question = "In what situation will 10 adults and 10 children, huddling under one umbrella, not get wet?",
            answer = "When there is no rain."
        ),
        RiddleResponseRemote(
            question = "What becomes more when you eat it?",
            answer = "A nut, the shell."
        ),
        RiddleResponseRemote(
            question = "It didn't exist and never will, but it had a name and will have it.",
            answer = "Bird's milk."
        ),
        RiddleResponseRemote(
            question = "Three drivers had a brother named Andrei, but Andrei had no brothers. Could this be?",
            answer = "Yes, if the drivers were women."
        ),
        RiddleResponseRemote(
            question = "Who can't do without what?",
            answer = "A person without a name."
        ),
        RiddleResponseRemote(
            question = "Which month is the shortest?",
            answer = "May (three letters)."
        ),
        RiddleResponseRemote(
            question = "Cow - 2, cat - 3, sheep - 2, cuckoo - 4, rooster - 8, dog - 3, donkey - ?",
            answer = "2 (IA)."
        ),
        RiddleResponseRemote(
            question = "If you throw a red stone into the Black Sea, what will it become?",
            answer = "Wet."
        ),
        RiddleResponseRemote(
            question = "It was raining. The bus was moving. Everyone on the bus was sleeping except the driver. What was the bus number, and what was the driver's name?",
            answer = "The bus number is wet, the driver's name is Tolka (only the driver)."
        ),
        RiddleResponseRemote(
            question = "In the name of which city is the name of one boy and the name of a hundred girls?",
            answer = "Sevastopol."
        ),
        RiddleResponseRemote(
            question = "When a man is called by a female name?",
            answer = "When he is asleep. Sonya."
        ),
        RiddleResponseRemote(
            question = "How many eggs can you eat on an empty stomach?",
            answer = "One, the rest are no longer on an empty stomach."
        ),
        RiddleResponseRemote(
            question = "What city is part of a horse's bridle?",
            answer = "Bridle (bit)."
        ),
        RiddleResponseRemote(
            question = "What ribbon cannot be braided into a braid?",
            answer = "A machine gun ribbon."
        ),
        RiddleResponseRemote(
            question = "What is in front of a cow and behind a bull?",
            answer = "The letter 'k'."
        ),
        RiddleResponseRemote(
            question = "What will a bay horse become if you bathe it?",
            answer = "Wet."
        ),
        RiddleResponseRemote(
            question = "What can you prepare but not eat?",
            answer = "Homework."
        ),
        RiddleResponseRemote(
            question = "What costs more: two or three?",
            answer = "Two pedals of an automatic gearbox cost more than three pedals of a manual gearbox."
        ),
        RiddleResponseRemote(
            question = "What happens after a goat turns seven years old?",
            answer = "It turns eight."
        ),
        RiddleResponseRemote(
            question = "In a room, there are 4 corners, with one cat in each corner, three cats opposite each cat, and one cat on the tail of each cat. How many cats are in the room?",
            answer = "4 cats (opposite each cat, there are three cats in three corners, and each cat is sitting on its tail)."
        ),
        RiddleResponseRemote(
            question = "What will happen to a red silk scarf if you drop it to the bottom of the Red Sea for five minutes?",
            answer = "It will become wet."
        ),
        RiddleResponseRemote(
            question = "One eye, one horn, but not a rhinoceros?",
            answer = "A cow peeking around the corner."
        ),
        RiddleResponseRemote(
            question = "What has a head but no brains?",
            answer = "A garlic bulb."
        ),
        RiddleResponseRemote(
            question = "Can you kill a mother-in-law with cotton wool?",
            answer = "Yes, if you wrap an iron in cotton wool."
        ),
        RiddleResponseRemote(
            question = "What word starts with three 'g's and ends with three 'y's?",
            answer = "Trigonometry."
        ),
        RiddleResponseRemote(
            question = "What word has 40 vowels in it?",
            answer = "Magpie (40 a's)."
        ),
        RiddleResponseRemote(
            question = "Why don't cows fly?",
            answer = "Because of the air."
        ),
        RiddleResponseRemote(
            question = "Which weighs more: a kilogram of iron or a kilogram of feathers?",
            answer = "They weigh the same."
        ),
        RiddleResponseRemote(
            question = "When a chicken stands on one leg, it weighs 2 kilograms. How much will it weigh if it stands on two legs?",
            answer = "2 kilograms."
        ),
        RiddleResponseRemote(
            question = "Can there be eggs on an apple tree?",
            answer = "Yes, if they are in a bird's nest."
        ),
        RiddleResponseRemote(
            question = "One egg boils for 3 minutes. How long will it take to boil 2 eggs?",
            answer = "3 minutes."
        ),
        RiddleResponseRemote(
            question = "If five cats catch five mice in five minutes, how much time does one cat need to catch one mouse?",
            answer = "5 minutes."
        ),
        RiddleResponseRemote(
            question = "When do we look at the number 2 but say 10?",
            answer = "When we look at the clock."
        ),
        RiddleResponseRemote(
            question = "A rope stretches by 0.5 cm from a load of 100 kg. How many centimeters will the rope stretch from a load of 10 tons?",
            answer = "The rope will break."
        ),
        RiddleResponseRemote(
            question = "Not a camel, but it spits. Not a calculator, but it counts. Not aradio, but it broadcasts.",
            answer = "A person."
        ),
        RiddleResponseRemote(
            question = "If you say 'don't come!' it still comes. If you say 'don't go!' it still goes. What is it?",
            answer = "Time."
        ),
        RiddleResponseRemote(
            question = "What do you need to do when you meet a tiger in a dream?",
            answer = "Wake up."
        ),
        RiddleResponseRemote(
            question = "Which tributary of the Dnieper is attractive to hunters?",
            answer = "The Teteriv River."
        ),
        RiddleResponseRemote(
            question = "The more it is stepped on, the better it is.",
            answer = "Grapes (grapes are stepped on to produce wine)."
        ),
        RiddleResponseRemote(
            question = "Which year lasts only one day?",
            answer = "New Year's Day."
        ),
        RiddleResponseRemote(
            question = "How many minutes does it take to boil a hard-boiled egg?",
            answer = "None, it is already boiled (boiled hard)."
        ),
        RiddleResponseRemote(
            question = "Why does a dog bark?",
            answer = "Because it can't speak."
        ),
        RiddleResponseRemote(
            question = "What, besides hotels, can be three-star and five-star?",
            answer = "Cognac."
        ),
        RiddleResponseRemote(
            question = "Moscow - 6, Yaroslavl - 9, Arkhangelsk - 11. What are we talking about?",
            answer = "The number of letters in the words."
        ),
        RiddleResponseRemote(
            question = "Three ostriches were flying. A hunter killed one of them. How many ostriches are left?",
            answer = "Ostriches don't fly."
        ),
        RiddleResponseRemote(
            question = "Which land never ages?",
            answer = "New Land."
        ),
        RiddleResponseRemote(
            question = "Which city is a favorite habitat for squirrels?",
            answer = "Bor."
        ),
        RiddleResponseRemote(
            question = "Where does water stand like a pillar?",
            answer = "In a glass."
        ),
        RiddleResponseRemote(
            question = "In which year do people eat more?",
            answer = "In a leap year."
        ),
        RiddleResponseRemote(
            question = "What is necessary for baking bread?",
            answer = "Without a crust."
        ),
        RiddleResponseRemote(
            question = "Which city is located on the moose's head?",
            answer = "Kryvyi Rih (Crooked Horn)."
        ),
        RiddleResponseRemote(
            question = "Which city can be embroidered?",
            answer = "Beads."
        ),
        RiddleResponseRemote(
            question = "Can you jump higher than a nine-story building?",
            answer = "Yes, because nine-story buildings can't jump."
        ),
        RiddleResponseRemote(
            question = "From which American city can you sew a suit?",
            answer = "Boston."
        ),
        RiddleResponseRemote(
            question = "Which river can bite?",
            answer = "She-bear."
        ),
        RiddleResponseRemote(
            question = "Which city can bite?",
            answer = "She-wolf."
        ),
        RiddleResponseRemote(
            question = "Which European capital city is situated on a soft bedding?",
            answer = "Paris on the Seine."
        ),
        RiddleResponseRemote(
            question = "Which French city is often reminded of us by curtains on the windows?",
            answer = "Tulle."
        ),
        RiddleResponseRemote(
            question = "What stands in the middle of the Volga River?",
            answer = "The letter 'l'."
        ),
        RiddleResponseRemote(
            question = "Which river can swim?",
            answer = "Goose."
        ),
        RiddleResponseRemote(
            question = "In which city are sheaves dried?",
            answer = "Riga."
        ),
        RiddleResponseRemote(
            question = "Which city wears a hat?",
            answer = "Panama."
        ),
        RiddleResponseRemote(
            question = "Which city names itself twice?",
            answer = "Yaya."
        ),
        RiddleResponseRemote(
            question = "Which city is made of dough?",
            answer = "Kalach."
        ),
        RiddleResponseRemote(
            question = "Which island flies?",
            answer = "Albatross."
        ),
        RiddleResponseRemote(
            question = "Which river can be 'eaten'?",
            answer = "Balyk (a type of fish)."
        ),
        RiddleResponseRemote(
            question = "Which city is the coldest?",
            answer = "Winter."
        ),
        RiddleResponseRemote(
            question = "Which city is the biggest?",
            answer = "Giant."
        ),
        RiddleResponseRemote(
            question = "Which two cities have names of hunting birds?",
            answer = "Eagle and Falcon."
        ),
        RiddleResponseRemote(
            question = "Which city is used for packaging goods?",
            answer = "Tara."
        ),
        RiddleResponseRemote(
            question = "Which city lives in a river?",
            answer = "Nelma."
        ),
        RiddleResponseRemote(
            question = "Which city can be cut with a knife?",
            answer = "Branch."
        ),
        RiddleResponseRemote(
            question = "In the surname of which writer and the name of which bird do the same letters occur?",
            answer = "Gogol."
        ),
        RiddleResponseRemote(
            question = "How can you turn a season into a game?",
            answer = "Summer lotto."
        ),
        RiddleResponseRemote(
            question = "Without which letter does a souffle exist?",
            answer = "Without 'e' (beze)."
        ),
        RiddleResponseRemote(
            question = "Which letter should you remove from the letter 'a' to get the name of a dwelling?",
            answer = "The letter 'b' (izba)"
        ),
        RiddleResponseRemote(
            question = "I don't live in Moscow, Minsk, or Tbilisi, but I love cities like Kostanay, Murom, and Buguruslan. Who am I?",
            answer = "The letter 'U'"
        ),
        RiddleResponseRemote(
            question = "How old will you be this year if you were born in '91?",
            answer = "1920 years old."
        ),
        RiddleResponseRemote(
            question = "Which peninsula speaks about its size?",
            answer = "Yamal."
        ),
        RiddleResponseRemote(
            question = "Which type of boat becomes a note when its name is read backwards?",
            answer = "Yawl."
        ),
        RiddleResponseRemote(
            question = "With which notes can you divide a whole?",
            answer = "Do-la-mi."
        ),
        RiddleResponseRemote(
            question = "In which five-letter word are all five letters 'o'?",
            answer = "Opять (again)."
        ),
        RiddleResponseRemote(
            question = "Which word consists of three identical letters?",
            answer = "Trio."
        ),
        RiddleResponseRemote(
            question = "Who is a jack of all trades?",
            answer = "A glover (a maker of gloves)."
        ),
        RiddleResponseRemote(
            question = "In which forests is there no game?",
            answer = "In construction forests."
        ),
        RiddleResponseRemote(
            question = "How can you call 'Filu' from 'Goodnight, Little Ones'?",
            answer = "Just Fila."
        ),
        RiddleResponseRemote(
            question = "Are the days shorter in winter or in summer?",
            answer = "They are the same length."
        ),
        RiddleResponseRemote(
            question = "How do you say 'dust' in French?",
            answer = "Poudre."
        ),
        RiddleResponseRemote(
            question = "Which two chocolate bars are always arguing with each other?",
            answer = "Snickers (don't brake) and Twix (take a break)."
        ),
        RiddleResponseRemote(
            question = "In order, it is the ninth, but its name translates from Latin as 'seventh'. What are we talking about?",
            answer = "September."
        ),
        RiddleResponseRemote(
            question = "In the name of which candy can you feel the cold?",
            answer = "Lollipop."
        ),
        RiddleResponseRemote(
            question = "If you rearrange the letters in the name of one of the planets of the Solar System, you get the name of the capital of one of the CIS countries. Which one?",
            answer = "Venus (Yerevan)."
        ),
        RiddleResponseRemote(
            question = "Which planet hides a musical note in its name?",
            answer = "Earth (LA)."
        ),
        RiddleResponseRemote(
            question = "Which star hides a musical note in its name?",
            answer = "Sirius (SI), Polaris (LA)."
        ),
        RiddleResponseRemote(
            question = "Which dairy product is the easiest to make based on its name?",
            answer = "Buttermilk."
        ),
        RiddleResponseRemote(
            question = "You can't encounter it in a journey, but you can find it on the road. You can see it in the ocean, in a lake, even in a swamp, but never in a river.",
            answer = "The letter 'O'."
        ),
        RiddleResponseRemote(
            question = "I threw one away and took a handful. What is it?",
            answer = "A seed."
        ),
        RiddleResponseRemote(
            question = "How can you remove a wheel in one second?",
            answer = "With a camera."
        ),
        RiddleResponseRemote(
            question = "How many giraffes swim in the Black Sea?",
            answer = "Giraffes don't swim."
        ),
        RiddleResponseRemote(
            question = "What doesn't exist but has a name?",
            answer = "Nothing."
        ),
        RiddleResponseRemote(
            question = "Which woman's name can be written as thirty 'Y's?",
            answer = "Zoya."
        ),


        )

    private val hardRiddles = listOf(
        RiddleResponseRemote(
            question = "You have a six-shot revolver. There are 2 bullets in it, both placed next to each other. Your opponent spins the cylinder, puts the barrel to their temple, and pulls the trigger. The shot doesn't fire. What will you do: immediately pull the trigger or spin the cylinder again first?",
            answer = "It is more advantageous not to spin the cylinder. If you spin the cylinder, the chance of the 'live' chamber coming up would be 2 out of 6 (33.3%), but if you don't spin it, the chance is 1 out of 4 (25%)."
        ),
        RiddleResponseRemote(
            question = "You have an unlimited supply of water and two buckets - one holds 5 liters and the other holds 3 liters. How do you measure exactly 4 liters of water?",
            answer = "You fill the 3-liter bucket and pour all the water into the 5-liter bucket. Then, you fill the 3-liter bucket again and pour water into the 5-liter bucket until it is full. There will be 1 liter of water remaining in the 3-liter bucket. Next, you empty the 5-liter bucket. Finally, you pour the 1 liter of water from the 3-liter bucket into the 5-liter bucket. Now, you have exactly 4 liters of water."
        ),
        RiddleResponseRemote(
            question = "A merchant bought 138 yards of black and blue cloth for 540 rubles. How many yards did he buy of each if the blue cloth cost 5 rubles per yard and the black cloth cost 3 rubles per yard?",
            answer = "If the merchant had bought only one type of cloth, let's say blue, he would have paid 138 * 5 = 690 rubles. This means there is a difference of 150 rubles because the black cloth is 2 rubles more expensive. Therefore, he bought 150/2 = 75 yards of black cloth and 138 - 75 = 63 yards of blue cloth."
        ),
        RiddleResponseRemote(
            question = "A combined group of veterans is preparing to march in a column during a special holiday. They formed pairs, but one person was left without a partner. They formed groups of three, but again one person was left alone. They tried forming groups of four and six, but each time one person was left out. Finally, when they formed groups of seven, everyone was evenly matched. How many people were in the column?",
            answer = "There were at least 301 people."
        ),
        RiddleResponseRemote(
            question = "If you multiply me by any other number, the answer will always remain the same. What number am I?",
            answer = "Zero (0)."
        ),
        RiddleResponseRemote(
            question = "What is correct: 18 plus 19 equals 36 or 18 plus 19 equals 36?",
            answer = "Both are incorrect because 18 + 19 = 37."
        ),
        RiddleResponseRemote(
            question = "You are given 3 positive numbers. Using addition and multiplication with these numbers will give you the same result. What are the numbers?",
            answer = "1, 2, and 3."
        ),
        RiddleResponseRemote(
            question = "When does 11 + 3 equal 2?", answer = "On a clock."
        ),
        RiddleResponseRemote(
            question = "I am a three-digit number. My second digit is four times larger than the third digit. My first digit is three less than the second digit. Who am I?",
            answer = "141."
        ),
        RiddleResponseRemote(
            question = "If you have three cups of sugar, and you take one away, how many do you have?",
            answer = "One cup."
        ),
        RiddleResponseRemote(
            question = "Two hens can lay two eggs in two minutes. If this is the maximum speed, how many hens are needed to lay 500 eggs in 500 minutes?",
            answer = "Two hens."
        ),
        RiddleResponseRemote(
            question = "Rama has five sons, and each son has one sister. How many children does Mr. Rama have?",
            answer = "Six; each son has the same sister."
        ),
        RiddleResponseRemote(
            question = "What does one math textbook say to another?", answer = "I have so many problems."
        ),
        RiddleResponseRemote(
            question = "By adding eight eights, you get 1,000. How is this possible using only addition?",
            answer = "888 + 88 + 8 + 8 + 8 = 1,000."
        ),
        RiddleResponseRemote(
            question = "What can you put between seven and eight to make it greater than seven but less than eight?",
            answer = "A decimal point."
        ),
        RiddleResponseRemote(
            question = "A group of four friends is in a race. Lisa finishes four hours before Tony, and Pete finishes eight hours ahead of Max. Max needed to finish six hours more than Lisa. In what order did they cross the finish line?",
            answer = "Pete, Lisa, Tony, and Max."
        ),
        RiddleResponseRemote(
            question = "In a basketball tournament, there are 16 players. How many games need to be played before a winner is determined?",
            answer = "Fifteen games."
        ),
        RiddleResponseRemote(
            question = "A baker carries a sack of flour weighing 15 pounds. They take out half of the flour but find that the sack weighs nine pounds. How much does the empty sack weigh?",
            answer = "Three pounds."
        ),
        RiddleResponseRemote(
            question = "I have two coins that total 15 cents. One of them is not a nickel. What are the two coins?",
            answer = "A dime and a nickel; one of them is not a nickel, but one of them is."
        ),
        RiddleResponseRemote(
            question = "The combined age of a father and son is 66 years. The father's age is the son's age with the digits reversed. How old are they?",
            answer = "There are three possible answers: 51 and 15, 42 and 24, or 60 and 06."
        ),
        RiddleResponseRemote(
            question = "What is special about the number 854,917,632?",
            answer = "The digits from one to nine are in alphabetical order."
        ),
        RiddleResponseRemote(
            question = "If you are eight feet away from a door and move towards it by half the distance with each step, how many steps will it take to reach the door?",
            answer = "It will never be reached because you will always be halfway there."
        ),
        RiddleResponseRemote(
            question = "Tom has been asked to draw the number of signs for 100 apartments, meaning he has to draw numbers from 1 to 100. Can you count how many times he needs to draw the digit eight?",
            answer = "Twenty times (8, 18, 28, 38, 48, 58, 68, 78, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 98)."
        ),
        RiddleResponseRemote(
            question = "If 9999 = 4, 8888 = 8, 1816 = 3, 1212 = 0, then 1919 =?",
            answer = "1919 = 2. This problem is related to closed areas of numbers. For example, 9999 has four closed areas (the tops of the nines); 8888 has eight closed areas (the tops of the eights and the tops of the eights). Therefore, the year 1919 has two closed areas (the tops of the nines)."
        ),
        RiddleResponseRemote(
            question = "My twin brother lives opposite the number of my house. The difference between our house numbers ends with two. What are the smallest possible numbers for our house?",
            answer = "19 and 91"
        ),
        RiddleResponseRemote(
            question = "I am a three-digit number. My tens digit is six more than my ones digit. My hundreds digit is eight less than my tens digit. What number am I?",
            answer = "193"
        ),
        RiddleResponseRemote(
            question = "When shipping something, Tom can fit ten small boxes or eight large boxes in a cardboard box. A total of 96 boxes were shipped in one batch, and the number of small boxes was less than the number of large boxes. How many boxes did he ship?",
            answer = "11 boxes"
        ),
        RiddleResponseRemote(
            question = "The zookeeper had 100 pairs of animals. Each of the original animals gives birth to two pairs of offspring, but unfortunately, 23 animals do not survive. How many are left?",
            answer = "977 animals (100 x 2 = 200; 200 x 4 = 800; 800 + 200 = 1000; 1000 - 23 = 977)"
        ),
        RiddleResponseRemote(
            question = "A certain number consists of three digits. The sum of the three digits is 36 times greater than the number itself. Seven times the leftmost digit plus nine equals five times the sum of the other two digits. Eight times the second digit minus nine equals the sum of the first and third digits. What number am I?",
            answer = "324"
        ),
        RiddleResponseRemote(
            question = "Can you arrange four nines to make 100?",
            answer = "99 + 9 / 9 = 100"
        ),
        RiddleResponseRemote(
            question = "If you see a train moving east at 70 miles per hour but a west wind is blowing at 80 miles per hour, which way will the smoke from the train be blowing?",
            answer = "It's an electric train, so there is no smoke"
        ),
        RiddleResponseRemote(
            question = "If days on Mars are equal to two weeks on Earth, how long is an hour?",
            answer = "14 Earth hours"
        ),
        RiddleResponseRemote(
            question = "Cara leaves New York at 8 a.m. traveling at a speed of 35 miles per hour. Nancy is traveling to New York at a speed of 50 miles per hour. When they meet, which one will be farther from New York?",
            answer = "When they meet, they will be equidistant from New York"
        ),
        RiddleResponseRemote(
            question = "The teacher says that there are fewer than 30 students in the class but more than 20. The children can be divided into groups of two, three, four, six, and eight without any leftovers. How many students are in the class?",
            answer = "24 students"
        ),
        RiddleResponseRemote(
            question = "Seven brothers were born two years apart. The youngest brother is seven years old. How old is the oldest brother?",
            answer = "19"
        ),
        RiddleResponseRemote(
            question = "What is x? 1 + 4 = 5; 2 + 5 = 12; 3 + 6 = 21; 8 + 11 = x",
            answer = "x = 96; from (a + b) to (a + ab)"
        ),
        RiddleResponseRemote(
            question = "There are eight balls with eight different numbers: 1, 3, 5, 7, 9, 11, 13, 15. Choose three balls that add up to 30.",
            answer = "Flip the 9 and turn it into a 6, then the three balls would be 6, 11, and 13"
        ),
        RiddleResponseRemote(
            question = "Can you make 24 from the numbers 3, 3, 8, and 8? You can only use the operations + - x / (). You must use all four numbers.",
            answer = "8 / (3 - 8/3) = 24"
        ),
        RiddleResponseRemote(
            question = "And how many actions does it take to put a giraffe in the refrigerator?",
            answer = "Four: open the refrigerator, take out the hippo, put in the giraffe, close the refrigerator"
        ),
        RiddleResponseRemote(
            question = "Flying ducks: one in front and two behind, one behind and two in front, one between two, and three in a row. How many ducks are flying in total?",
            answer = "3"
        ),
        RiddleResponseRemote(
            question = "What is always talked about in the future tense?",
            answer = "Tomorrow"
        ),
        RiddleResponseRemote(
            question = "A notebook cost 60 rubles, a book costs the same plus 1/3 of that amount. Question: How much does the book cost?",
            answer = "90 rubles"
        ),
        RiddleResponseRemote(
            question = "By how much will a fraction increase if its numerator is increased by its denominator?",
            answer = "It will increase by a factor of 1"
        ),
        RiddleResponseRemote(
            question = "10 workers dig a pit in 10 hours, digging 10 meters of the pit. How many workers will be needed to dig 100 meters in 100 hours?",
            answer = "10 workers"
        ),
        RiddleResponseRemote(
            question = "Three birds catch one fly each in 1 minute, but in three minutes, they manage to catch 3 flies. How many birds are needed to catch 60 flies in 1 hour?",
            answer = "3 birds"
        ),
        RiddleResponseRemote(
            question = "How can you use five 2s to write the number 11, using all mathematical operation signs available?",
            answer = "(22/2 + 2 - 2)"
        ),
        RiddleResponseRemote(
            question = "How many degrees do the angles of an isosceles triangle have?",
            answer = "90, 45, 45"
        ),
        RiddleResponseRemote(
            question = "How many degrees does a circle have?",
            answer = "The answer is missing"
        ),
        RiddleResponseRemote(
            question = "What can go through walls and doors but can never enter?",
            answer = "360"
        ),
        RiddleResponseRemote(
            question = "How many degrees do the angles of a square have?",
            answer = "90"
        ),
        RiddleResponseRemote(
            question = "Vanya has 4 brothers and 2 sisters - Katya and Svetlana. Question: How many brothers and sisters does Svetlana have?",
            answer = "5 brothers and 1 sister"
        ),
        RiddleResponseRemote(
            question = "Vadim went mushroom picking. While walking in the forest, he found one mushroom every 50 meters. In the end, he had 25 mushrooms in his basket. How far did Vadim walk?",
            answer = "1250 meters"
        ),
        RiddleResponseRemote(
            question = "The king invited 15 brave knights to participate in a tournament. Before the start of the tournament, they all exchanged greetings. How many greetings were exchanged in total?",
            answer = "105"
        ),
        RiddleResponseRemote(
            question = "Every birthday, the son received one book from his parents. He received the last one after finishing college, adding it to the five he already had. How old is the son, and on what date was he born?",
            answer = "24 years old, February 29th"
        ),
        RiddleResponseRemote(
            question = "Two people approach a river. There is a boat by the shore that can hold only one person. Both people cross to the opposite bank. How?",
            answer = "They were on different banks"
        ),
        RiddleResponseRemote(
            question = "Whose mustache is longer than their legs?",
            answer = "The cockroach's"
        ),
        RiddleResponseRemote(
            question = "A famous magician says that he can place a bottle in the center of a room and crawl into it. How?",
            answer = "Anyone can crawl into a room"
        ),
        RiddleResponseRemote(
            question = "What goes up the hill and down the hill but remains in the same place?",
            answer = "The road"
        ),
        RiddleResponseRemote(
            question = "Where can you find a situation where a knight jumps over another knight?",
            answer = "In chess"
        ),
        RiddleResponseRemote(
            question = "Tanya's father has 5 daughters: Chacha, Chichi, Cheche, and Chocho. What is the name of the 5th daughter?",
            answer = "Mary"
        ),
        RiddleResponseRemote(
            question = "There are two houses: a rich one and a poor one. They are both on fire. Which house will the police put out?",
            answer = "The police don't put out fires"
        ),
        RiddleResponseRemote(
            question = "What can be found in an empty pocket?",
            answer = "A hole"
        ),
        RiddleResponseRemote(
            question = "What does a security guard do when a sparrow sits on his beret?",
            answer = "He sleeps"
        ),
        RiddleResponseRemote(
            question = "The school director has a brother named Nikolai. But Nikolai has no brothers. Is this possible?",
            answer = "Yes, if the school director is a woman"
        ),
        RiddleResponseRemote(
            question = "Matvey had 9 candies. He gave one more candy to his brother than he kept for himself. How many candies did Matvey keep for himself?",
            answer = "Matvey kept 4 candies for himself"
        ),
        RiddleResponseRemote(
            question = "Masha collected 4 cucumbers, 5 tomatoes, and 1 beetroot in the garden. How many vegetables did Masha collect in the garden?",
            answer = "Masha collected 10 vegetables in the garden"
        ),
        RiddleResponseRemote(
            question = "Misha thought of a number. If you subtract 4 from the number, it remains the same. What number did Misha think of?",
            answer = "Misha thought of the number 8"
        ),
        RiddleResponseRemote(
            question = "There are an equal number of crows sitting on two branches. There are 2 crows on the first branch. How many crows are sitting on both branches?",
            answer = "There are 4 crows sitting on both branches"
        ),
        RiddleResponseRemote(
            question = "On a raspberry bush, there were 9 green berries. 3 berries ripened, and Pasha picked them. How many raspberry berries are left on the bush?",
            answer = "There are 6 raspberry berries left on the bush"
        ),
        RiddleResponseRemote(
            question = "Builders built 3 houses. According to their plans, they were supposed to build 9 houses in total. How many houses are left for the builders to build?",
            answer = "The builders have 6 houses left to build"
        ),
        RiddleResponseRemote(
            question = "Tanya had 6 plums. She gave one plum to Marina, and they had an equal number of plums. How many plums did Marina have initially?",
            answer = "Marina initially had 4 plums"
        ),
        RiddleResponseRemote(
            question = "On his birthday, Misha received gifts from his parents. His mother gave him 3 books, and his father gave him 5 toy soldiers. How many gifts does Misha have in total?",
            answer = "Misha has 8 gifts"
        ),
        RiddleResponseRemote(
            question = "Sasha is 3 years older than Vitya. Sasha is 2 years younger than Fyodor. How many years is Fyodor older than Vitya?",
            answer = "Fyodor is 5 years older than Vitya"
        ),
        RiddleResponseRemote(
            question = "Masha is 3 years older than her brother. How many years will Masha be older than her brother in 5 years?",
            answer = "In 5 years Masha will be older than her brother by 3 years"
        ),
        RiddleResponseRemote(
            question = "Anton helped his mother and transported bags on a bicycle. Anton could take away no more than three bags at a time. How many times does Anton have to come to transport 8 bags?",
            answer = "Anton needs to come 3 times"
        ),
        RiddleResponseRemote(
            question = "7 girls and 4 boys did the cleaning in the school classroom. Masha, Tanya and Anton went home. How many girls are left in the class?",
            answer = "There are 5 girls left in the class"
        ),
        RiddleResponseRemote(
            question = "There were 15 apples in the basket, Anya gave Sasha 2 apples. How many apples are left in the basket?",
            answer = "There are 13 apples left in the basket"
        ),
        RiddleResponseRemote(
            question = "Which fairy-tale heroine's name is similar to the unit of length measurement?",
            answer = "Which fairy-tale heroine's name is similar to the unit of length measurement?"
        ),
        RiddleResponseRemote(
            question = "What geometric figure moonlights as a gymnastic projectile in a circus?",
            answer = "Trapezoid, rhombus, circle, rectangle"
        ),
        RiddleResponseRemote(
            question = "Which digit always rides in the train?",
            answer = "Three — train"
        ),
        RiddleResponseRemote(
            question = "Name the musical unit of length measurement",
            answer = "Mi-la"
        ),
        RiddleResponseRemote(
            question = " What geometric shapes does everyone have in their mouth?",
            answer = "Corners (of the mouth)"
        ),
        RiddleResponseRemote(
            question = "What mathematical figure do men wear on their heads?",
            answer = "Top hat"
        ),
        RiddleResponseRemote(
            question = "What shape do honeycombs have?",
            answer = "The shape of a regular hexagon"
        ),
        RiddleResponseRemote(
            question = "Mapping which country was called the 'big trigonometric study'?",
            answer = "India (it resembles a triangle on the map"
        ),
        RiddleResponseRemote(
            question = "Which geometric shapes are friends with the sun?",
            answer = "Rays"
        ),
        RiddleResponseRemote(
            question = "Which two letters will make each edge of a geometric body precious?",
            answer = "C and E: Silver."
        ),
        RiddleResponseRemote(
            question = "What number can be found in a car gas tank?",
            answer = "Octane"
        ),
        RiddleResponseRemote(
            question = "What shape is each snowflake based on?",
            answer = "Any snowflake is a hexagon or hexagon"
        ),
        RiddleResponseRemote(
            question = "What numbers do pilots draw in the sky?",
            answer = "Eights"
        ),
        RiddleResponseRemote(
            question = "Which European city adorns the monument to zero?",
            answer = "Budapest"
        ),
        RiddleResponseRemote(
            question = "What 'mathematical plants' do you know?",
            answer = "Millennial, golden millennial, centennial."
        ),
        RiddleResponseRemote(
            question = "What is the name of the figure in the class magazine?",
            answer = "Mark, score"
        ),
        RiddleResponseRemote(
            question = "What 'numbers' can I put on myself?",
            answer = "Two-piece suit, three-piece suit, four-piece suit"
        ),
        RiddleResponseRemote(
            question = "What drummers, hunters and mathematicians can't do without?",
            answer = "Without fraction"
        ),
        RiddleResponseRemote(
            question = "What is the difference between one car and another from the point of view of a mathematician?",
            answer = "Number"
        ),
        RiddleResponseRemote(
            question = "Name male names of 'mathematical' origin",
            answer = "Constantine (from the Latin word 'constant' — constant) and Maxim (from the Latin 'maximus' — the biggest)."
        ),
        RiddleResponseRemote(
            question = "In which word does a whole meter of the letters 'o' fit? ",
            answer = "In the word 'metro'."
        ),
        RiddleResponseRemote(
            question = "Which country is hiding in the mathematical expression a?",
            answer = "Cube A — Cube."
        ),
        RiddleResponseRemote(
            question = "What is in every word, plant and equation?",
            answer = "Root"
        ),
        RiddleResponseRemote(
            question = "On the sign of which company can you read the number 'one hundred'?",
            answer = "Service station — ONE hundred"
        ),
        RiddleResponseRemote(
            question = "Which poultry knows well and constantly repeats the unit of measurement of the earth and is equal to 10,000 square meters?",
            answer = "Goose"
        ),
        RiddleResponseRemote(
            question = "So, can you establish on what principle this sequence is built : 8 2 9 0 1 5 7 3 4 6",
            answer = "All numbers follow each other according to the alphabetical order of their names (eight, two, nine, zero, etc.)."
        ),
        RiddleResponseRemote(
            question = "What do you think your friends and acquaintances use more often than you, but it is your property?",
            answer = "Your name. It is friends and acquaintances who use your name when contacting you, but you use it yourself much less often."
        ),
        RiddleResponseRemote(
            question = "If you have it, then you have the full part. If you share it with someone, will it disappear altogether?",
            answer = "It's a secret. If you share it with someone, it will no longer be a secret and it automatically disappears by itself."
        ),
        RiddleResponseRemote(
            question = "How to jump off a ten-meter ladder and not get hurt?",
            answer = "You need to jump from the bottom step"
        ),
        RiddleResponseRemote(
            question = "It looks like a wedge, but if you turn it around, it's a pancake",
            answer = "Umbrella"
        ),
        RiddleResponseRemote(
            question = "The farmer had a flock of eight sheep: three white, four black, one brown. How many sheep can answer that there is at least one sheep in the flock of the same color as hers?",
            answer = "None, sheep don't talk)"
        ),
        RiddleResponseRemote(
            question = "In which case is the number 1322 less than 622?",
            answer = "Years before our era"
        ),
        RiddleResponseRemote(
            question = "There is no language, but he will tell the truth",
            answer = "Mirror"
        ),
        RiddleResponseRemote(
            question = "When a person is at home without a head?",
            answer = "When he looks out of the window"
        ),
        RiddleResponseRemote(
            question = "Which is greater: the sum of all digits or their product?",
            answer = "The sum is greater, since the product is 0 (one of the multipliers is the digit 0)"
        ),
        RiddleResponseRemote(
            question = "What stands in the middle of the Earth?",
            answer = "Letter 'M'"
        ),
        RiddleResponseRemote(
            question = "What is it: blue, big, with a mustache and completely stuffed with hares?",
            answer = "Trolleybus"
        ),
        RiddleResponseRemote(
            question = "6636 — 3, 8118 — 4, 2242 — 0, 3316 — ?",
            answer = "The number 1 should be in place of the question mark. To get the correct answer, you need to count the number of circles in the numbers on the left and write the result on the right"
        ),
        RiddleResponseRemote(
            question = "36 players participate in the game, which lasts 15 minutes, of which 4 are spare. The substitutes alternately replace each player, so that all players spend the same time on the court. Which one?",
            answer = "~13.33 minutes: (15 × 32) / 36 = 13,33333"
        ),
        RiddleResponseRemote(
            question = "Write a ten-digit number so that: the first digit means the number of ones in it, the second digit means the number of twos, the third digit means the number of threes, and so on up to the tenth digit, which means the number of zeros.",
            answer = "The number 2100010006 is obtained"
        ),
        RiddleResponseRemote(
            question = "What number should go further in this row? 1, 8, 70, 627, 5639, …",
            answer = "50 746. Explanation: 1 × 9 − 1 = 8; 8 × 9 − 2 = 70; 70 × 9 − 3 = 627; 627 × 9 − 4 = 5 639; 5 639 × 9 − 5 = 50 746"
        ),
        RiddleResponseRemote(
            question = "What is the seventh term of the sequence that starts like this: 6, -4, 8/3, ..., ..., ..., ...?",
            answer = "Every time there is a multiplication by (-2/3), for example, 6 × (-2/3) = -4. We need the seventh term, i.e. 6 × (-2/3)6 ≈ 6 × 0,0878 ≈ 0,5268."
        ),
        RiddleResponseRemote(
            question = "What should be in place of the pass? 100, 97, 84, 67, 53, 41, 32, 21, …",
            answer = "9. Solution: the number of letters in it is subtracted from each number. Therefore , the series continues like this: 9, 3, 0, -4, -15, ..."
        ),
        RiddleResponseRemote(
            question = "Who can shave 25 times a day, but have a beard?",
            answer = "Hairdresser"
        ),
        RiddleResponseRemote(
            question = "The wife shoots her husband, then holds him underwater for five minutes. She's finally hanging it up. But five minutes later they are enjoying a great dinner together. How can it be?",
            answer = "Wife is a photographer"
        ),
        RiddleResponseRemote(
            question = "The woman came to the doctor for examination, she was the doctor's sister. But the doctor was not the woman's brother. Who was he to her?",
            answer = "Sister"
        ),
        RiddleResponseRemote(
            question = "Seven sisters are at the dacha, where each is busy with some business. The first reads a book, the second cooks food, the third plays chess, the fourth solves Sudoku, the fifth does laundry, the sixth takes care of plants. And what does the seventh sister do?",
            answer = "Playing chess with the third sister."
        ),
        RiddleResponseRemote(
            question = "A businessman bought a horse for $10, sold it for $20. Then he bought the same horse for $30 and sold it for $40. What is the total profit of a businessman from these two transactions?",
            answer = "$20"
        ),
        RiddleResponseRemote(
            question = "There is a dead man lying in the desert. A bag is slung over his shoulders, a flask of water is on his belt. There is not a single living soul for many kilometers around. What did the man die of and what's in his bag?",
            answer = "He died from hitting the ground, and there was an unopened parachute in the bag."
        ),
        RiddleResponseRemote(
            question = "David and Fabian are playing chess. They have five games, but both have won three. How is this possible?",
            answer = "They play with a lot of people, not just each other"
        ),
        RiddleResponseRemote(
            question = "You are standing in front of three switches. Behind an opaque wall, three light bulbs are turned off. You need to manipulate the switches, go into the room and determine which light bulb each switch belongs to.",
            answer = "First you need to turn on two switches. After some time, one of them is turned off. Go into the room. One light bulb will be hot from the on switch, the second – warm from the off, the third – cold from the untouched switch"
        ),
        RiddleResponseRemote(
            question = "How to fill the barrel exactly by one half without using measuring instruments?",
            answer = "Tilt the barrel and pour until it fills in a horizontal position so that the beginning of the bottom is visible and does not touch the edge"
        ),
        RiddleResponseRemote(
            question = "A fabulous dwarf needs a new candle every night, which he shines on his way, walking around the city. He can make 1 new candle out of 5 candle stubs. If he has 25 stubs, how many nights will he have enough stock of new candles?",
            answer = "For 6 nights. He will be able to make 5 new candles from 25 stubs, and when they burn out, he can make the sixth of the 5 stubs that will remain from them"
        ),
        RiddleResponseRemote(
            question = "One day a collector of antique money saw a coin in an antique store with the date 175 BC on it. This Roman coin was not very expensive. But the collector didn't buy it. Why?",
            answer = "The collector realized that he had a fake in his hands, since the master who made the coin did not know that he lived 'before our era'"
        ),
        RiddleResponseRemote(
            question = "The hostess needs to bake 6 pies. How can she cope in 15 minutes if only 4 pies are placed in the pan, and on each side the pie should bake for 5 minutes?",
            answer = "1) we put 4 pies; 2) we turn over 2 pies, 2 we remove, we put 2 new ones; 3) we remove 2 ready-made ones, 2 we turn over and turn over 2 previously removed ones"
        ),
        RiddleResponseRemote(
            question = "3 turtles are crawling.The 1st turtle says: two turtles are crawling behind me. The 2nd turtle says: one turtle is crawling behind me and one turtle is crawling in front of me. And the 3rd turtle: two turtles are crawling in front of me, and one turtle is crawling behind me. How can this be?",
            answer = "Turtles crawl in a circle"
        ),
        RiddleResponseRemote(
            question = "There were 2 horses, 1 rabbit, 1 puppy, 1 cat, a pig and a piglet, a cow and a calf, a turkey and a goose on the farm. The owner came with a dog. How many legs are there on the farm?",
            answer = "2"
        ),
        RiddleResponseRemote(
            question = "Where was the potato first discovered?",
            answer = "In the ground"
        ),
        RiddleResponseRemote(
            question = "Vasily, Peter, Semyon and their wives Natalia, Irina, Anna have been together for 151 years. Every husband is 5 years older than his wife. Vasily is 1 year older than Irina. Natalia and Vasily are 48 years old together, Semyon and Natalia are 52 years old together. Who is married to whom, and how old is who? (Age must be expressed in integers).",
            answer = "Vasily (26) — Anna (21); Peter (27) — Natalia (22); Semyon (30) — Irina (25)"
        ),
        RiddleResponseRemote(
            question = "Don't write anything and don't use a calculator. Take 1000. Add 40. Add another thousand. Add 30. Another 1000. Plus 20. Plus 1000. And plus 10. What happened?",
            answer = "4100"
        ),
        RiddleResponseRemote(
            question = "Two fifth graders Petya and Alyonka are walking from school and talking. 'When the day after tomorrow becomes yesterday,' one of them said, today will be as far from Sunday as the day that was today, when the day before yesterday was tomorrow. What day of the week did they talk?",
            answer = "Sunday"
        ),
        RiddleResponseRemote(
            question = "There were 20 people on the bus. At the first stop, 2 people got out and 3 people got in, at the next stop, 1 got out and 4 got in, at the next stop, 5 got out and 2 got in, at the next stop, 2 got out and 1 got in, at the next stop, 9 got out and no one got in, at the next stop, 2 more got out. Question: how many stops were there?",
            answer = "6"
        ),
        RiddleResponseRemote(
            question = "There were 90 apples growing on the birch tree. A strong wind blew, and 10 apples fell. How much is left?",
            answer = "Apples don't grow on birch"
        ),
        RiddleResponseRemote(
            question = "Pasha put a coin in the bottle and plugged the bottle with a cork. Then he took out a coin without removing the stoppers or breaking the bottles. Guess how he did it.",
            answer = "He pushed the cork inside the bottle"
        ),
        RiddleResponseRemote(
            question = "Vitya and Seryozha bought a box of chocolates each. There are 12 candies in each box. Vitya ate several pieces out of his box, and Seryozha ate as much out of his as was left in Vitya's box. Guess how many candies Vitya and Seryozha have left for two.",
            answer = "12 candies"
        ),
        RiddleResponseRemote(
            question = "One boy liked to brag that he holds his breath underwater for 3 minutes. His friend said that he could spend 10 minutes underwater without special devices. The first boy didn't believe him and offered him a bet. The second boy agreed and won the argument. Explain how he won.",
            answer = "The boy filled a glass with water, put it on his head and held it for 10 minutes"
        ),
        RiddleResponseRemote(
            question = "The day before yesterday Ilya was 17 years old. Next year he will be 20 years old. Guess how this is possible.",
            answer = "If today is January 1, and Ilya's birthday is December 31. In this case, the day before yesterday, that is, on December 30, he was still 17 years old, yesterday, that is, on December 31, he turned 18, this year he will turn 19, and next year he will turn 20"
        ),
        RiddleResponseRemote(
            question = "I am the abyss without water, the mountains without earth and the sky without air. What am I?",
            answer = "Map"
        ),
        RiddleResponseRemote(
            question = "I am always there, but I never say. No one sees me, but everyone knows I'm here. What am I",
            answer = "Imagination"
        ),
        RiddleResponseRemote(
            question = "I'm crawling on the ground in my clothes without buttons. Who am I?",
            answer = "Worm"
        ),
        RiddleResponseRemote(
            question = "Once upon a time there was an orphan girl in the thicket, she had only two kittens, two puppies, three parrots, a turtle and a hamster. She decided to go to the animals for food. She goes through the forest, the field, the forest, the field. She came to the store, but there are no feeds there. She went back home. And the girl fell into the pit. If she gets out, Dad will die. If she stays there, Mom will die. You can't dig a tunnel. What should she do?",
            answer = "Calmly get out, she's an orphan"
        ),
        RiddleResponseRemote(
            question = "On the same day, 2 boys were born in the same maternity hospital. Their parents moved into the same house. The boys lived on the same landing, went to the same school, to the same class. But they never saw each other. How can it be?",
            answer = "They were born blind"
        ),
        RiddleResponseRemote(
            question = "If it stands, it can be easily counted. And if you put it, you won't count it in your whole life.",
            answer = "The number 8 and the infinity sign"
        ),
        RiddleResponseRemote(
            question = "There are 4 people in one family and their total age is 68 years, but 4 years ago this age was 53. How old is the youngest of this family?",
            answer = "3 years old"
        ),
        RiddleResponseRemote(
            question = "In which case two legs of the same horse can walk 15 km, and the other two 15.5?",
            answer = "When the horse goes in a circle"
        ),
        RiddleResponseRemote(
            question = "Two boys were playing in a dark and dirty basement. When they came out into the light, one of them had a dirty face, and the other had a clean one. Suddenly, the boy with a clean face ran to wash, and the boy with a dirty face continued to play carelessly. Why?",
            answer = "They looked at each other and thought they had the same faces."
        ),
        RiddleResponseRemote(
            question = "There was a ruler, a compass, a rubber band and a pencil on the table. The student was asked to draw a circle on a piece of paper, then a straight line. Where should he start?",
            answer = "Get a piece of paper"
        ),
        RiddleResponseRemote(
            question = "3 birds flew out of the forest at the same speed. Determine the time when the birds will be in the same plane?",
            answer = "3 points are always in the same plane, so instantly"
        ),
        RiddleResponseRemote(
            question = "A frying pan was tied to the dog's tail. How fast should she run so that she doesn't hear the roar of the frying pan?",
            answer = "She needs to stand"
        ),
        RiddleResponseRemote(
            question = "3 turtles are crawling.The 1st turtle says: two turtles are crawling behind me. The 2nd turtle says: one turtle is crawling behind me and one turtle is crawling in front of me. And the 3rd turtle: two turtles are crawling in front of me, and one turtle is crawling behind me",
            answer = "Turtles are crawling in a circle!"
        ),
        RiddleResponseRemote(
            question = "There are wings, but it does not fly. There are no legs, but you won't catch up. Who is it?",
            answer = "Fish"
        ),
        RiddleResponseRemote(
            question = "Bows, bows. When he comes home, he will stretch out.",
            answer = "Axe"
        ),
        RiddleResponseRemote(
            question = "Knocks, rattles, turns, walks all his life, not a person.",
            answer = "Clock"
        ),
        RiddleResponseRemote(
            question = "Ringing, spitting, going back and forth. What he takes in his teeth, he will split into two parts",
            answer = "Saw"
        ),
        RiddleResponseRemote(
            question = "They don't eat me alone, but they don't eat enough without me.",
            answer = "Salt"
        ),
        RiddleResponseRemote(
            question = "What do you find in common between a tree and a book?",
            answer = "Leaves"
        ),
        RiddleResponseRemote(
            question = "Brother and sister live next to each other, but they run away from each other like enemies.",
            answer = "Day and night"
        ),
        RiddleResponseRemote(
            question = "I twist, I grumble. I don't want to know anyone?",
            answer = "Blizzard"
        ),
        RiddleResponseRemote(
            question = "Small bubble, like a star light",
            answer = "Light bulb"
        ),
        RiddleResponseRemote(
            question = "Juicy and golden between the greens flashes, and melts in the mouth",
            answer = "Pear"
        ),
        RiddleResponseRemote(
            question = "The gorlan shouts across the sea-ocean — gets an answer through the whole world",
            answer = "Radio"
        ),
        RiddleResponseRemote(
            question = "Two heads, six legs. And rides on four",
            answer = "Rider on a horse"
        ),
        RiddleResponseRemote(
            question = "What has no end or beginning?",
            answer = "Circle"
        ),
        RiddleResponseRemote(
            question = "There are always ships and, of course, people.",
            answer = "Nose"
        ),
        RiddleResponseRemote(
            question = "How to write 'dry grass' with four letters?",
            answer = "Hay"
        ),
        RiddleResponseRemote(
            question = "All wheezing, sneezing Lada: Ate a lot ...",
            answer = "Ice cream"
        ),
        RiddleResponseRemote(
            question = "What is between the valley and the mountain?",
            answer = "Letter And"
        ),
        RiddleResponseRemote(
            question = "Why is the tongue in the mouth?",
            answer = "Behind the teeth"
        ),
        RiddleResponseRemote(
            question = "I wanted to paint myself with blue varnish...",
            answer = "Nails"
        ),
        RiddleResponseRemote(
            question = "One egg cooks for three minutes. How many minutes will two eggs cook?",
            answer = "Also three minutes"
        ),
        RiddleResponseRemote(
            question = "Two boys and a girl were walking home under the same umbrella, but none of them got wet. Why?",
            answer = "Because it didn't rain"
        ),
        RiddleResponseRemote(
            question = "Purrs like a cat, but it's not a cat. And who is it?",
            answer = "Cat"
        ),
        RiddleResponseRemote(
            question = "What pronouns do pavement spoil?",
            answer = "I-we"
        ),
        RiddleResponseRemote(
            question = "Who is ready to give us an answer: with a head, but without brains?",
            answer = "Bow"
        ),
        RiddleResponseRemote(
            question = "Two boys were walking, they found a penny. How much money will they find if the girls go?",
            answer = "Not how much"
        ),
        RiddleResponseRemote(
            question = "They stand on the street all day, smiling at passers-by. Their service begins when it's already getting dark.",
            answer = "Street lights"
        ),
        RiddleResponseRemote(
            question = "One brother eats and starves, and the other goes and disappears",
            answer = "Fire and smoke"
        ),
        RiddleResponseRemote(
            question = "From which bird do you need to pluck feathers to get morning, afternoon, evening and night at once?",
            answer = "From a duck"
        ),
        RiddleResponseRemote(
            question = "What is black when it is clean and white when it is dirty?",
            answer = "Blackboard"
        ),
        RiddleResponseRemote(
            question = "Imagine that you are sailing on the sea in a boat. Suddenly the boat starts to sink, you find yourself in the water, sharks swim up to you. What can I do to escape from sharks?",
            answer = "Stop fantasizing about this topic"
        ),
        RiddleResponseRemote(
            question = "How is it right? Five plus seven will be 'eleven' or 'eleven'?",
            answer = "12"
        ),
        RiddleResponseRemote(
            question = "There were twelve chickens, three rabbits, five puppies, two cats, one rooster and two chickens in the room. The owner came here with a dog. How many legs are there in the room?",
            answer = "Only two, the other paws"
        ),
        RiddleResponseRemote(
            question = "Can there be eggs on an apple tree?",
            answer = "Yes, in a bird's nest"
        ),
        RiddleResponseRemote(
            question = "A woman was walking to Moscow, and three men were walking towards her. Everyone has a bag, each bag has a cat in it. How many creatures were heading to Moscow?",
            answer = "One woman"
        ),
        RiddleResponseRemote(
            question = "How to put 2 liters of milk in a liter jar?",
            answer = "Make cottage cheese"
        ),
        RiddleResponseRemote(
            question = "Without windows and doors, there is nothing in it, but it can shed light. What is it?",
            answer = "Box of matches"
        ),
        RiddleResponseRemote(
            question = "Who can walk on water, but does not swim?",
            answer = "Ice"
        ),
        RiddleResponseRemote(
            question = "He has a face, but he can't speak. He watches you every day. What is it?",
            answer = "Mirror"
        ),
        RiddleResponseRemote(
            question = "You enter an old abandoned haunted house. There is no electricity or running water in it. Once inside, you see three doors in front of you. There is a number on each door. There is one way to die behind every door. Behind door number one you will die, because there is a lion and he will eat you. Behind door number two you will die because there is a zombie and it will attack you. Behind door number three, you will die in the electric chair. You have no way to turn back, so you definitely need to go through some door. Which door will you go through?",
            answer = "Door number three — there is no electricity in the house, so the electric chair will not work"
        ),
        RiddleResponseRemote(
            question = "Two fathers and their two sons go fishing together. Everyone catches one fish and takes the catch home. When they return home, they have only three fish with them. How is this possible?",
            answer = "There were only three people on the fishing trip — grandfather, his son and grandson"
        ),
        RiddleResponseRemote(
            question = "Daria tells her friends a story and asks them to guess whether it's true or false: 'At night, a man was sitting in a house where the lights were not on at all. There was no lamp, no candle, no other light source. Nevertheless, he stayed at home and enjoyed reading his book.' Her friends say that this can't be and it's a lie. But the girl claims that she is telling the truth. Daria's story is true, but how is it possible?",
            answer = "In the girl's story, a man is blind and reads a book in Braille"
        ),
        RiddleResponseRemote(
            question = "What does a person love more than life and hate more than death; what do satisfied people want; the poor have, but the rich need; the miser spends, the spendthrift saves, and everything is taken to the grave?",
            answer = "Nothing"
        ),
        RiddleResponseRemote(
            question = "Tells the captain of the ship:'I have sailed the oceans far and wide. One day two of my sailors were standing on opposite sides of the ship. One looked to the west, the other to the east. And at the same time they could see each other clearly.' Could you tell me how it was possible?",
            answer = "The sailors stood with their backs to the sides of the ship so that they looked at each other."
        ),
        RiddleResponseRemote(
            question = "The doctor gives the patient three pills and tells him to take one every half hour. How long will it take by the time the patient takes all three pills?",
            answer = "One hour. He will drink one pill right away, the second one in half an hour and take the third one in another 30 minutes."
        ),
        RiddleResponseRemote(
            question = "A woman wants to enter a secret private club, but does not know the password. And then she sees one man coming to the door, and hears the guard say 12, and the man says 10, and they let him in. After a minute, another person comes to the entrance, and the security says 6, and the man says 5, and they let him in too. The girl thought that she understood the meaning of the cipher, and also goes to the door, where the guard calls the number 10, she says 5, and they don't let her in. What was she supposed to say?",
            answer = "Six — code is the number of letters in a number that security says."
        ),
        RiddleResponseRemote(
            question = "One night a woman gets a call from the police. She is told that her husband has been murdered and she must come to the crime scene as soon as possible. The woman hangs up in shock and drives 20 minutes to the crime scene. As soon as she gets to this place, the police arrest her, and she confesses that she shot her husband. How did the police know she had committed a crime?",
            answer = "The police didn't tell her where the crime scene was, but she knew where to go."
        ),
        RiddleResponseRemote(
            question = "One evening Maria and Alexandra went to a bar together to have a drink after work. They ordered the same alcoholic drink. Alexandra drank much more than Maria: she quickly drank five glasses of cognac with ice, and Maria drank only one, stretching it all evening. The drinks were poisoned, but only Maria died. Why?",
            answer = "The poison was in the ice. Since Maria's ice had already melted, she was poisoned"
        ),
        RiddleResponseRemote(
            question = "Once upon a time there were seven dwarfs, and they were all brothers. All of them were born two years apart. The youngest dwarf is seven years old. How old is their older brother?",
            answer = "19 years old. If you thought your older brother was 21, you were mistaken because you forgot to count your seven-year-old brother. After all, he is one of them."
        ),
        RiddleResponseRemote(
            question = "There was a competition where the participants had to hold something. At the end of the event, the winner was a man who had neither arms nor legs. What were the participants supposed to hold?",
            answer = "Breath"
        ),
        RiddleResponseRemote(
            question = "The owner of a popular fashion store comes up with his own unique pricing method. A suit costs $12, socks - $ 10, sneakers — $ 18, a scarf — $ 8. Based on the owner's method, how much will the gloves cost then?",
            answer = "$16. This method of setting price tags is based on the fact that $ 2 is charged for each letter in the product name. The word 'gloves' has eight letters, respectively, multiplying the number of letters by two, we get $16"
        ),
        RiddleResponseRemote(
            question = "The murderer has been sentenced to death. He will have to choose one of three rooms. In the first, a constant fire is raging, in the second — killers with loaded guns, and in the third — lions who have not eaten for 3 years. Which room is the safest for him?",
            answer = "The third room, because these lions have not eaten for three years, so they are dead."
        ),
        RiddleResponseRemote(
            question = "The man was at the carnival and came up to the kiosk with a strange sign: 'I will determine your exact weight without scales.' Here's what he heard from a man sitting in a tent: 'If I write your exact weight on this piece of paper, you will give me 10,000 rubles, but if I can't, I will pay you this money.' The man did not see the scales near the booth, so he agreed to the bet, thinking that in any case he would lie about his weight, no matter what figure a strange person wrote, ready to part with money so easily. However, in the end, the man lost the dispute by giving the money. How did the strange hawker win the bet?",
            answer = "He gave the man a piece of paper on which it was written: 'Your exact weight'"
        ),
        RiddleResponseRemote(
            question = "My name is Toby, I live on a farm with four other dogs, my brothers and sisters. Their names are Spot, Snowy, Brownie and Rex. What do you think is the name of the fifth dog?",
            answer = "Toby"
        ),
        RiddleResponseRemote(
            question = "In the one—story house that stands on the corner of the road, the bedrooms were yellow, the kitchen was orange, the living room was red, the garage was blue, the hallway was green, and the living room was purple. What color were the stairs?",
            answer = "There is no color, because there are no stairs — the house is one-story."
        ),
        RiddleResponseRemote(
            question = "You are standing in front of two doors. There is a guard at each door. You know the following things: one path leads to heaven, the other to hell. You don't know which door is light and which is hell. You only know that one of the two guards always tells the truth, and the other always lies. You have the right to ask only one guard one question to find out which door leads to paradise. Which one question would you ask to find out exactly which door is heaven?",
            answer = "You need to ask: 'Which door, according to another guard, leads to heaven?'"
        ),
        RiddleResponseRemote(
            question = "If you paint a brown house white, it will turn white. If the traffic light changes from red to green, then the light is green. So, if you throw a white shirt into the Red Sea, what color will it become?",
            answer = "A wet shirt will not change color, because the Red Sea is not really red"
        ),
        RiddleResponseRemote(
            question = "A tin can was placed on the edge of the table, tightly closed with a lid, so that 2/3 of the can hung from the table. After a while, the jar fell. What was in the bank?",
            answer = "Piece of Ice"
        ),
        RiddleResponseRemote(
            question = "There was a murder in a Downing Street apartment. There was a three-legged table in the middle of the room. Two men were sitting behind him, playing chess. There was a third person nearby who was just watching the party. The light suddenly went out for a few minutes, and when the room became light again, it turned out that the third man was lying on the floor with a knife in his throat. One of those present at the interrogation stated that when the lights were turned off, he just bent down to put a piece of cardboard under one of the legs of the table so that it would not swing. The other suspect replied that he had not heard anything at all, i.e. K. was intensely considering the next move. Who is the murderer?",
            answer = "The man who claimed that he bent down during the murder is lying, because the table on three legs cannot swing. obviously he is the killer"
        ),
        RiddleResponseRemote(
            question = "A and B were sitting on the pipe. A went abroad, B sneezed and went to the hospital. What's left on the pipe?",
            answer = "Letter B, and went to the hospital And"
        ),
        RiddleResponseRemote(
            question = "What is a diet egg?",
            answer = "This is an egg laid by a chicken on a diet"
        ),
        RiddleResponseRemote(
            question = "Olga Nikolaevna finally had a dream come true: she bought herself a new bright red car. The next day, after going to work, Olga Nikolaevna, moving on the left side of the road, turned left at a red light, ignoring the sign 'Turning is prohibited' and to top it all off, she did not fasten her seat belt. All this was seen by a policeman standing at the intersection, but he did not even stop Olga Nikolaevna to at least check her driver's license. Why?",
            answer = "Because she went to work on foot"
        ),
        RiddleResponseRemote(
            question = "A crow is sitting on a bitch. What should I do to saw off the branch without disturbing the crow?",
            answer = "Wait until she flies away"
        ),
        RiddleResponseRemote(
            question = "A child was born in a Negro family in the Congo: all white, even the teeth were snow-white. What's wrong here?",
            answer = "Children are born without teeth"
        ),
        RiddleResponseRemote(
            question = "A four-letter word is given, but it can also be written in three letters. Usually it can be written in six letters, and then in five letters. Born contained eight letters, and occasionally consists of seven letters",
            answer = "'Given', 'it', 'usually', 'then', 'born', 'occasionally'"
        ),
        RiddleResponseRemote(
            question = "The hunter walked past the clock tower. He took out his gun and fired. Where did he get to?",
            answer = "To the police"
        ),
        RiddleResponseRemote(
            question = "Which hand should I use to stir the tea?",
            answer = "Tea should be stirred with a spoon, not with your hand"
        ),
        RiddleResponseRemote(
            question = "What does a watchman do when a sparrow is sitting on his head?",
            answer = "Sleeping"
        ),
        RiddleResponseRemote(
            question = "The geese went to the watering place in single file (one after the other). One goose looked ahead – there were 17 heads in front of him. I looked back – there were 42 paws behind him. How many geese went to drink?",
            answer = "39: 17 in front, 21 behind plus the goose that turned his head"
        ),
        RiddleResponseRemote(
            question = "Experienced players Kolya and Seryozha played chess, but in the five games played, each of them lost exactly five times. How did it happen?",
            answer = "Kolya and Seryozha were playing with a third person. Another option is to draw 5 times"
        ),
        RiddleResponseRemote(
            question = "Not ice, but melting, not a boat, but floating away.",
            answer = "Salary"
        ),
        RiddleResponseRemote(
            question = "How many programmers do I need to turn on a light bulb?",
            answer = "One"
        ),
        RiddleResponseRemote(
            question = "These three TV stars have been on the screen for a long time. One is called Stepan, the other is Philip. What is the name of the third?",
            answer = "Piggy"
        ),
        RiddleResponseRemote(
            question = "What is the difference between pop and Volga?",
            answer = "Pop – father, and Volga – mother"
        ),
        RiddleResponseRemote(
            question = "Why did Lenin walk in boots and Stalin in boots?",
            answer = "On the ground"
        ),
        RiddleResponseRemote(
            question = "He may not have children, but he's still a dad. How is this possible?",
            answer = "This is the Pope"
        ),
        RiddleResponseRemote(
            question = "What is the difference between a female hostel and a male one?",
            answer = "In the women's dorm, the dishes are washed after meals, and in the men's dorm – before"
        ),
        RiddleResponseRemote(
            question = "What should I do if you got into the car and your feet don't reach the pedals?",
            answer = "Move to the driver's seat"
        ),
        RiddleResponseRemote(
            question = "Earrings for simpletons?",
            answer = "Noodles"
        ),
        RiddleResponseRemote(
            question = "What is the longest word in Russian",
            answer = "A word about Igor's regiment"
        ),
        RiddleResponseRemote(
            question = "Valery Obodzinsky has a very long one, Mikhail Krug has a short one, and Ani Lorak does not use it at all. What is it about?",
            answer = "About the surname"
        ),
        RiddleResponseRemote(
            question = "What does a hare usually lie under?",
            answer = "Under your ears"
        ),
        RiddleResponseRemote(
            question = "Where is the water standing like a pillar?",
            answer = "In a glass"
        ),
        RiddleResponseRemote(
            question = "Why is the tongue in the mouth?",
            answer = "Behind the teeth"
        ),
        RiddleResponseRemote(
            question = "Which key can neither unlock nor beat?",
            answer = "Musical"
        ),
        RiddleResponseRemote(
            question = "They are metallic and liquid. What is it about?",
            answer = "Nails"
        ),
        RiddleResponseRemote(
            question = "This is given to a person three times in a lifetime. The first two are free, and you will have to pay for the third. What is it?",
            answer = "Teeth"
        ),
        RiddleResponseRemote(
            question = "What is not in a woman's handbag?",
            answer = "Order"
        ),
        RiddleResponseRemote(
            question = "In which month does the chatty Svetochka speak the least?",
            answer = "February, the shortest month of the year"
        ),
        RiddleResponseRemote(
            question = "How does a horse differ from a needle?",
            answer = "First you sit on a needle, then you jump up to get on a horse — first you jump up, then you sit down."
        ),
        RiddleResponseRemote(
            question = "The most reliable part in a domestic car?",
            answer = "Imported radio."
        ),
        RiddleResponseRemote(
            question = "What is it — sitting on the ceiling, gnawing a light bulb?",
            answer = "Ceiling lamp gnawer"
        ),
        RiddleResponseRemote(
            question = "What do students and lizards have in common?",
            answer = "The ability to discard 'tails in time.'"
        ),
        RiddleResponseRemote(
            question = "How many peas can go into one glass?",
            answer = "Not at all, peas do not go."
        ),
        RiddleResponseRemote(
            question = "What does a wife do with lunch if her husband doesn't like it?",
            answer = "Leaves it for dinner"
        ),
        RiddleResponseRemote(
            question = "Why robots are never afraid?",
            answer = "Because they have nerves of steel"
        ),
        RiddleResponseRemote(
            question = "What can't be done in space even with more effort?",
            answer = "Hang yourself"
        ),
        RiddleResponseRemote(
            question = "Who wears the world's largest cap?",
            answer = "The one who has the world's largest head"
        ),
        RiddleResponseRemote(
            question = "A sparrow can eat a handful of grain, but a horse can't. Why?",
            answer = "The sparrow is too small to eat a horse"
        ),
        RiddleResponseRemote(
            question = "What is it: blue, big, with a mustache and completely stuffed with hares?",
            answer = "Trolleybus"
        ),
        RiddleResponseRemote(
            question = "Without a head, I seem taller. What am I?",
            answer = "Pillow"
        ),
        RiddleResponseRemote(
            question = "This amazing invention allows anyone to see through walls. What is it?",
            answer = "Window"
        ),
        RiddleResponseRemote(
            question = "What is heavier than 2 kilograms of cement or cotton wool?",
            answer = "The same, since we take 2 kg each"
        ),
        RiddleResponseRemote(
            question = "Striped balls that you can't play football with — they will break right away.",
            answer = "Watermelons"
        ),
        RiddleResponseRemote(
            question = "Hunchbacked, but not scary, kids like it. What kind of beast?",
            answer = "Camel"
        ),
        RiddleResponseRemote(
            question = "The whole back is pierced with needles, but not a hedgehog.",
            answer = "Thimble"
        ),
        RiddleResponseRemote(
            question = "Like a ladder, only it doesn't lift anyone up and lies in the field",
            answer = "Rails"
        ),
        RiddleResponseRemote(
            question = "Two brothers of the same on the nose sit down ",
            answer = "Glasses"
        ),
        RiddleResponseRemote(
            question = "I have sharp fangs, but I'm not a beast. I don't bite, but if I'm used incorrectly, I can hurt.",
            answer = "Stapler"
        ),
        RiddleResponseRemote(
            question = "Why did the vampire attend art classes?",
            answer = "He wanted to learn how to draw with blood"
        ),
        RiddleResponseRemote(
            question = "Two girls with one umbrella came to school. No one got wet. Why?",
            answer = "Because it wasn't raining"
        ),
        RiddleResponseRemote(
            question = "What big, yellow, with wheels are all mothers happy about in the morning?",
            answer = "School bus!"
        ),
        RiddleResponseRemote(
            question = "When does homework not need to be done at home?",
            answer = "When is it done at school"
        ),
        RiddleResponseRemote(
            question = "Most of me is hidden under water.",
            answer = "Iceberg"
        ),
        RiddleResponseRemote(
            question = "You raise it up to show other people that you are doing well.",
            answer = "Thumb"
        ),
        RiddleResponseRemote(
            question = "What is impossible to put in the pot?", answer = "The lid from it, it's always a little bigger"
        ),
        RiddleResponseRemote(
            question = "I have eyes, but I can't see anything with them. What am I?", answer = "Potato"
        ),
        RiddleResponseRemote(
            question = "She is your uncle's sister, but not your aunt. Who is she to you?", answer = "Mom"
        ),
        RiddleResponseRemote(
            question = "I can eat endlessly and will never be full. What am I?", answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "I have neither arms nor legs, but I can get into the house in winter.", answer = "Cold, frost"
        ),
        RiddleResponseRemote(
            question = "I follow you through the mountains and forests, I respond if you call, but I don't start the conversation first.",
            answer = "Echo"
        ),
        RiddleResponseRemote(
            question = "We do not know grief and sorrow, but we cry.", answer = "Clouds"
        ),
        RiddleResponseRemote(
            question = "Not a river or land, you can't cross me with your feet, you can't swim across on a boat.",
            answer = "Swamp"
        ),
        RiddleResponseRemote(
            question = "Today is tomorrow, and tomorrow will be yesterday.", answer = "Today"
        ),
        RiddleResponseRemote(
            question = "A beast that walks and rests all summer, and sleeps in winter.", answer = "Bear"
        ),
        RiddleResponseRemote(
            question = "The whole forest is on itself.", answer = "Hedgehog"
        ),
        RiddleResponseRemote(
            question = "A tree wears on its head.", answer = "Deer"
        ),
        RiddleResponseRemote(
            question = "Can go on a trip without leaving his own home.", answer = "Snail"
        ),
        RiddleResponseRemote(
            question = "Without axes and saws, is there a house in the forest near a pine tree?", answer = "Ants"
        ),
        RiddleResponseRemote(
            question = "Not a hammer, but a tree will step on.", answer = "Woodpecker"
        ),
        RiddleResponseRemote(
            question = "If you throw me into the ground alone, you can collect a whole handful later.", answer = "Seed"
        ),
        RiddleResponseRemote(
            question = "We are not the sea, but we are worried in the wind.", answer = "Ears"
        ),
        RiddleResponseRemote(
            question = "A golden sieve with black houses grows in the field, it always stretches to the sun.",
            answer = "Sunflower"
        ),
        RiddleResponseRemote(
            question = "We've been walking all our lives, but we can't go anywhere.", answer = "Clock hands"
        ),
        RiddleResponseRemote(
            question = "Two twin brothers who can never see each other", answer = "Eyes"
        ),
        RiddleResponseRemote(
            question = "It would be impossible to say anything without it.", answer = "Language"
        ),
        RiddleResponseRemote(
            question = "It's easy to wear them, even if they are long, but it's impossible to count.", answer = "Hair"
        ),
        RiddleResponseRemote(
            question = "They can never overtake each other, they walk side by side all their lives.", answer = "Legs"
        ),
        RiddleResponseRemote(
            question = "They always look at each other, but they can't get together.", answer = "Floor and ceiling"
        ),
        RiddleResponseRemote(
            question = "He walks and walks, but he never comes into the house.", answer = "The front door"
        ),
        RiddleResponseRemote(
            question = "The tail is in the yard, and the head is in the house. What is it?",
            answer = "The key is in the lock"
        ),
        RiddleResponseRemote(
            question = "There are no handles and legs, but it rises if you cover it with a sheet.",
            answer = "Yeast dough"
        ),
        RiddleResponseRemote(
            question = "There are wings, but not a bird. It flies, but it doesn't flap its wings.", answer = "Airplane"
        ),
        RiddleResponseRemote(
            question = "You can't get sick with this disease on earth.", answer = "Seasickness"
        ),
        RiddleResponseRemote(
            question = "How many sandwiches can a person eat on an empty stomach?",
            answer = "One. The second one will not be on an empty stomach"
        ),
        RiddleResponseRemote(
            question = "What question will no person ever answer 'Yes' to?", answer = "Are you asleep?"
        ),
        RiddleResponseRemote(
            question = "How can I saw off a branch on which a bird is sitting without scaring it off?",
            answer = "Wait until it flies away by itself"
        ),
        RiddleResponseRemote(
            question = "What is under our feet when we walk on the road?", answer = "Sole"
        ),
        RiddleResponseRemote(
            question = "What does half a pear look like the most?", answer = "To your other half"
        ),
        RiddleResponseRemote(
            question = "Shortest month?", answer = "May"
        ),
        RiddleResponseRemote(
            question = "How far can a person go into the forest?",
            answer = "Up to the middle. Then he will come out of it"
        ),
        RiddleResponseRemote(
            question = "Standing over the water, shaking his head.", answer = "Reed"
        ),
        RiddleResponseRemote(
            question = "No legs, no wings, but you won't catch up.", answer = "Fish"
        ),
        RiddleResponseRemote(
            question = "Growing upside down.", answer = "Icicle"
        ),
        RiddleResponseRemote(
            question = "It's winding around, but it's impossible to catch.", answer = "Wind"
        ),
        RiddleResponseRemote(
            question = "They walk all their lives, but they don't leave.", answer = "The hands of the clock"
        ),
        RiddleResponseRemote(
            question = "Always there, but it's impossible to catch up or overtake her.", answer = "Shadow"
        ),
        RiddleResponseRemote(
            question = "The edge is visible, but it is impossible to reach it.", answer = "Horizon"
        ),
        RiddleResponseRemote(
            question = "Sister and brother who never meet. One of them always hides when the other one comes.",
            answer = "Moon and sun"
        ),
        RiddleResponseRemote(
            question = "A hole into which you can lower the fishing rod.", answer = "Ice hole"
        ),
        RiddleResponseRemote(
            question = "A friend of mine can shave his beard clean a dozen times a day. And still he walks with a beard. How is this possible?",
            answer = "He is a barber."
        ),
        RiddleResponseRemote(
            question = "One day at breakfast, a girl dropped her ring into a cup full of coffee. Why did the ring stay dry?",
            answer = "Coffee beans, ground or instant"
        ),
        RiddleResponseRemote(
            question = "In which case, looking at the number 2, we say 'ten'",
            answer = "When we look at the clock that shows ten minutes of an hour"
        ),
        RiddleResponseRemote(
            question = "You are standing in front of two identical doors, one of which leads to death, the other to happiness. The doors are guarded by two identical guards, one of whom tells the truth all the time, and the other lies all the time. But you don't know who is who. You can only ask one question to any of the guards. What question should I ask in order not to make a mistake with the choice of the door?",
            answer = "One of the solutions is: 'If I ask you to show me the door to happiness, which door will the other guard show me?' And after that, you need to choose another door."
        ),
        RiddleResponseRemote(
            question = "There are three light bulbs in one room. In the other — three switches. It is necessary to determine which switch is from which light bulb. You can enter a room with light bulbs only once.",
            answer = "You need to turn on one light bulb first and wait, then turn on the second one for a very short time, and then turn off both. The first one will be the hottest, the second one will be warm, and the third one will be cold."
        ),
        RiddleResponseRemote(
            question = "A steel ladder was lowered from the side of the steamer. The lower 4 steps of the ladder are submerged in water. Each step is 5 cm thick; the distance between two adjacent steps is 30 cm. The tide began to rise, at which the water level began to rise at a speed of 40 cm per hour. How many steps do you think will be under water in 2 hours?",
            answer = "In two hours there will be the same 4 steps under the water, because at high tide the ladder rises together with the steamer."
        ),
        RiddleResponseRemote(
            question = "Three hens lay three eggs in three days. How many eggs will 12 of the same chickens lay in 12 days?",
            answer = "One hen lays one egg in three days. In 12 days, one hen will lay four eggs, therefore, 12 hens will lay 12×4= 48 eggs in 12 days."
        ),
        RiddleResponseRemote(
            question = "Petya and Misha were playing in the dirty and dark attic of the house. Then they went downstairs. Petya's whole face was dirty, and Misha's face miraculously remained clean. Despite this, only Misha went to wash his face. Why?",
            answer = "Misha saw that Petya had a dirty face and thought that he also had a dirty face, Petya, seeing Misha's clean face, thought that everything was fine with his face as well."
        ),
        RiddleResponseRemote(
            question = "How many pages could a bookworm gnaw through, if the first volume has 700 pages, the second – 640, and the third – 670?",
            answer = "It is necessary to have a clear idea of how the volumes of books are. The books stand so that the 1st page of volume I is adjacent to the 640th page of volume II, and the last page of Volume 3 is next to the first page of Volume 2. Thus, if the worm made a move from the 1st page of volume I to the last page of volume III, then it was able to gnaw through only 640 pages of the middle volume and 4 more covers of the binding, but no more."
        ),
        RiddleResponseRemote(
            question = "You took 100 rubles from a friend, went to the store and lost them. On the way I met a friend, took 50 rubles from her, bought 2 chocolates for 10 rubles. You have 30 rubles left, you gave them to a friend and owed 70 rubles, and 50 rubles to a friend. Total 120 rubles. Plus you have 2 more chocolates, a total of 140 rubles. Where else is 10 rubles?",
            answer = "you have already paid 30 rubles for the debt, therefore, you owe 70 rubles to a friend and 50 rubles to a friend, i.e. in the amount of 120. 120 rubles were spent (I lost 100 and 20 on chocolates), so nothing is lost anywhere, I borrowed 120 rubles and spent 120 rubles."
        ),
        RiddleResponseRemote(
            question = "Dasha dreamed of a chocolate bar, but she lacked 10 rubles to buy it. Alyosha also dreamed of a chocolate bar, but he lacked only 1 ruble. The guys decided to buy at least one chocolate bar for two, but they still lacked 1 ruble. What is the cost of a chocolate bar?",
            answer = "The cost is 10 rubles. Dasha has no money at all."
        ),
        RiddleResponseRemote(
            question = "There is a prison, there is a hospital nearby. There are rails around them, and a train is moving around at high speed on the rails. One boy needs to go to his grandfather in prison, and one girl needs to go to her grandmother in the hospital. How can they do it if the train doesn't stop?",
            answer = "The boy needs to throw the girl under the train, then he will go to prison, and the girl to the hospital."
        ),
        RiddleResponseRemote(
            question = "What Russian word can be written from right to left, turned upside down, mirrored, and it will still remain unchanged and will not lose its meaning?",
            answer = "It"
        ),
        RiddleResponseRemote(
            question = "He is a big naughty and comedian, he has a house on the roof. A braggart and a prig, and his name is ...",
            answer = "Carlson"
        ),
        RiddleResponseRemote(
            question = "I get up early in the morning, I'll give everyone milk to drink, I chew grass across the river, and what am I called?",
            answer = "Cow"
        ),
        RiddleResponseRemote(
            question = "He lived in a bottle for hundreds of years, finally saw the light, he grew a beard, this kind one..",
            answer = "Santa Claus"
        ),
        RiddleResponseRemote(
            question = "You'll sleep in class — you'll get an answer for it", answer = "not five, but two"
        ),
        RiddleResponseRemote(
            question = "Fruit, snacks, drinks, wine — The table is set for lunch in...",
            answer = "not in a movie, but in a restaurant"
        ),
        RiddleResponseRemote(
            question = "What has a head but no brains?", answer = "Cheese, onion, garlic"
        ),
        RiddleResponseRemote(
            question = "What is in Russia in the first place, and in France in the second?",
            answer = "The letter 'P' "
        ),
        RiddleResponseRemote(
            question = "Sitting in a dungeon, a red maiden, and a scythe on the street.", answer = "Carrot"
        ),
        RiddleResponseRemote(
            question = "Who goes cold in winter angry, hungry?", answer = "Wolf"
        ),
        RiddleResponseRemote(
            question = "Does not bark, does not bite, and does not let into the house", answer = "Lock"
        ),
        RiddleResponseRemote(
            question = "Grandfather is sitting, dressed in a fur coat, whoever undresses him sheds tears.",
            answer = "Onion"
        ),
        RiddleResponseRemote(
            question = "White piglets lay down on the bed.", answer = "Zucchini"
        ),
        RiddleResponseRemote(
            question = "It shines and glitters, it does not flatter anyone.", answer = "Mirror"
        ),
        RiddleResponseRemote(
            question = "The poor thing will hide in the board — his cap is barely visible", answer = "Nail"
        ),
        RiddleResponseRemote(
            question = "Winter and summer are the same color.", answer = "Christmas tree"
        ),
        RiddleResponseRemote(
            question = "Shine first, crackle after shine!", answer = "Thunderstorm"
        ),
        RiddleResponseRemote(
            question = "A red-haired cheat, cunning and clever, got into the barn, counted the chickens.",
            answer = "Fox"
        ),
        RiddleResponseRemote(
            question = "He walks around the meadow importantly, comes out of the water dry, wears red shoes, gives soft feather beds.",
            answer = "Goose"
        ),
        RiddleResponseRemote(
            question = "Striped balls came to us from the melon.", answer = "Watermelon"
        ),
        RiddleResponseRemote(
            question = "White peas on a green leg.", answer = "Lily of the Valley"
        ),
        RiddleResponseRemote(
            question = "Teeth in the mouth in three rows. This is a whole trouble. This predator is famous for being a sea bandit.",
            answer = "Shark"
        ),
        RiddleResponseRemote(
            question = "We are forest dwellers, wise builders. From needles, we build a house for ourselves under a spruce tree with the whole artel.",
            answer = "Ants"
        ),
        RiddleResponseRemote(
            question = "A log is floating on the river. Oh, and it's feisty!", answer = "Crocodile"
        ),
        RiddleResponseRemote(
            question = "The living lock grumbled, lay across the door. Two medals on the chest. It's better not to go into the house!",
            answer = "Dog"
        ),
        RiddleResponseRemote(
            question = "I wake everyone up on time, even if I don't start the clock.", answer = "Rooster"
        ),
        RiddleResponseRemote(
            question = "Knocking all the time, hammering trees. But it does not cripple them, but only heals them.",
            answer = "Woodpecker"
        ),
        RiddleResponseRemote(
            question = "He is empty, his voice is thick, the drum beats, it helps to walk and sing.", answer = "Drum"
        ),
        RiddleResponseRemote(
            question = "If he falls, he jumps, if he hits, he doesn't cry.", answer = "Ball"
        ),
        RiddleResponseRemote(
            question = "Oh, don't touch me: I'll burn without fire!", answer = "Nettle"
        ),
        RiddleResponseRemote(
            question = "This horse does not eat oats, instead of legs there are two wheels. Get on horseback and race on it, only drive better.",
            answer = "Bike"
        ),
        RiddleResponseRemote(
            question = "Then back, then forward, the steamer walks, wanders. If you stop it, woe! Holes the sea!",
            answer = "Iron"
        ),
        RiddleResponseRemote(
            question = "Look, look — the north pole is inside! Snow and ice sparkle there, winter itself lives there.",
            answer = "Refrigerator"
        ),
        RiddleResponseRemote(
            question = "There is a hot accordion under the window in our house: it does not sing and does not play — it heats the house.",
            answer = "Heating battery"
        ),
        RiddleResponseRemote(
            question = "I will take you underground at any time of the year and in any bad weather very quickly at any hour.",
            answer = "Metro"
        ),
        RiddleResponseRemote(
            question = "He starts digging, replaces a hundred shovels.", answer = "Excavator"
        ),
        RiddleResponseRemote(
            question = "Thunder broke out, merry thunder, everything sparkled around! Colorful fountains are constantly rushing into the sky.",
            answer = "Fireworks"
        ),
        RiddleResponseRemote(
            question = "Steel horse, linen tail", answer = "Needle and thread"
        ),
        RiddleResponseRemote(
            question = "Burns without fire, flies without wings, runs without legs.", answer = "Sun, clouds, river"
        ),
        RiddleResponseRemote(
            question = "A hut was built without hands, without a hatchet.", answer = "Nest"
        ),
        RiddleResponseRemote(
            question = "scarlet, sugar, green caftan, velvet.", answer = "Watermelon"
        ),
        RiddleResponseRemote(
            question = "In haymaking — bitter, and in frost — sweet. What kind of berry?", answer = "Viburnum"
        ),
        RiddleResponseRemote(
            question = "Blue uniform, white lining, sweet in the middle.", answer = "Plum"
        ),
        RiddleResponseRemote(
            question = "Feed — live, drink — die.", answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "The more you took, the bigger it became.", answer = "Pit"
        ),
        RiddleResponseRemote(
            question = "What can't be rolled up the hill, can't be carried away in a sieve and can't be held in your hands?",
            answer = "Water"
        ),
        RiddleResponseRemote(
            question = "One speaks, two look, two listen.", answer = "Tongue, eyes, ears"
        ),
        RiddleResponseRemote(
            question = "The red beads are hanging, they are looking at us from the bushes, these beads are very fond of — children, birds and bears.",
            answer = "Raspberry"
        ),
        RiddleResponseRemote(
            question = "Neither a beast nor a bird, a sock is like a knitting needle. Flies — squeaks, sits down — is silent.",
            answer = "Mosquito"
        ),
        RiddleResponseRemote(
            question = "Here are needles and pins crawling out from under the bench. They look at me, they want milk.",
            answer = "Hedgehog"
        ),
        RiddleResponseRemote(
            question = "Squint-eyed, small, in an old gray fur coat.", answer = "Hare"
        ),
        RiddleResponseRemote(
            question = "Red-haired, with a fluffy tail, lives in the forest under a bush.", answer = "Fox"
        ),
        RiddleResponseRemote(
            question = "Small stature, long tail, gray fur coat, sharp teeth.", answer = "Mouse"
        ),
        RiddleResponseRemote(
            question = "He doesn't sleep at night, he guards mice.", answer = "Cat"
        ),
        RiddleResponseRemote(
            question = "Not a lamb or a cat, wears a fur coat for a whole year. The fur coat is gray — for summer, for winter — a different color.",
            answer = "Hare"
        ),
        RiddleResponseRemote(
            question = "White, not sugar, no legs, but walking.", answer = "Snow"
        ),
        RiddleResponseRemote(
            question = "Not a baker, but bakes-blushes.", answer = "The Sun"
        ),
        RiddleResponseRemote(
            question = "A miracle giant floats across the sea-ocean, hides a mustache in his mouth, stretched out for a mile.",
            answer = "Whale"
        ),
        RiddleResponseRemote(
            question = "The whole day flies, everyone gets bored, the night comes, then it stops.", answer = "Fly"
        ),
        RiddleResponseRemote(
            question = "Blue airplane landed on a white dandelion.", answer = "Dragonfly"
        ),
        RiddleResponseRemote(
            question = "It's easy for us to get to know him, it's easy to get to know him: he is tall and sees far.",
            answer = "Giraffe"
        ),
        RiddleResponseRemote(
            question = "Believe it or not, a miracle animal lives in a zoo. His hand is in his forehead, it looks so much like a trumpet!",
            answer = "Elephant"
        ),
        RiddleResponseRemote(
            question = "I'm hunchbacked, but the guys like me.", answer = "Camel"
        ),
        RiddleResponseRemote(
            question = "Who was gnawing cones on a branch and throwing leftovers down?", answer = "Squirrel"
        ),
        RiddleResponseRemote(
            question = "Ser, but not a wolf, long-eared, but not a hare, with hooves, but not a horse.",
            answer = "Donkey"
        ),
        RiddleResponseRemote(
            question = "A little boy in a gray armyachishka sneaks around the yards, picks up crumbs.",
            answer = "Sparrow"
        ),
        RiddleResponseRemote(
            question = "Front — awl, back — fork, top — black cloth, bottom — white towel.", answer = "Swallow"
        ),
        RiddleResponseRemote(
            question = "I am a helpful potbelly. I'm willing to treat everyone. Then I'm silent like an idol, and then I sing songs.",
            answer = "Samovar"
        ),
        RiddleResponseRemote(
            question = "The pig is lying, the back is pierced with needles.", answer = "Thimble"
        ),
        RiddleResponseRemote(
            question = "Two twins, two brothers, riding on the nose.", answer = "Glasses"
        ),
        RiddleResponseRemote(
            question = "Two plaits, two sisters, made of fine sheep yarn, how to walk — so put on, so as not to freeze five and five.",
            answer = "Mittens"
        ),
        RiddleResponseRemote(
            question = "The whole universe lives in it, but the thing is ordinary.", answer = "TV"
        ),
        RiddleResponseRemote(
            question = "It has no legs and no wings, but it flies so that you can't catch up with it.", answer = "Time"
        ),
        RiddleResponseRemote(
            question = "Twelve brothers wander after each other, they do not bypass each other.", answer = "Months"
        ),
        RiddleResponseRemote(
            question = "Two ends, two rings, in the middle of the carnations.", answer = "Scissors"
        ),
        RiddleResponseRemote(
            question = "Flowing-flowing — won't flow out, running-running —won't run out.", answer = "River"
        ),
        RiddleResponseRemote(
            question = "Empty we rest, and full we walk.", answer = "Boots"
        ),
        RiddleResponseRemote(
            question = "Running, buzzing. He looks in two eyes, but only red will shine — he will become rooted to the spot.",
            answer = "Car"
        ),
        RiddleResponseRemote(
            question = "One brother eats and starves, and the second one goes and disappears.",
            answer = "Fire and smoke"
        ),
        RiddleResponseRemote(
            question = "Lying on his back – no one needs. Lean against the wall – it will come in handy.",
            answer = "Stairs"
        ),
        RiddleResponseRemote(
            question = "Meets everyone with one hand, sees them off with the other.", answer = "Door handle"
        ),
        RiddleResponseRemote(
            question = "A pear is hanging — you can't eat.", answer = "Light bulb"
        ),
        RiddleResponseRemote(
            question = "The river is flowing — we are lying. Ice on the river — we run.", answer = "Skates"
        ),
        RiddleResponseRemote(
            question = "He's walking, He's cutting a wave, grain is flowing out of the pipe.",
            answer = "Combine harvester"
        ),
        RiddleResponseRemote(
            question = "Five steps — a ladder, on the steps — a song.", answer = "Notes"
        ),
        RiddleResponseRemote(
            question = "In a blue shirt running along the bottom of the ravine.", answer = "Trickle"
        ),
        RiddleResponseRemote(
            question = "Fluttering, dancing, waving a patterned fan over a flower.", answer = "Butterfly"
        ),
        RiddleResponseRemote(
            question = "Eight legs, like eight hands, embroider a circle with silk", answer = "Spider"
        ),
        RiddleResponseRemote(
            question = "They beat me with sticks, crumple me with rolling pins, burn me with fire, cut me with a knife; and for that they ruin me so much that everyone loves me.",
            answer = "Bread"
        ),
        RiddleResponseRemote(
            question = "Transparent as glass, but you can't put it in the window.", answer = "Ice"
        ),
        RiddleResponseRemote(
            question = "Fluffy cotton floats somewhere. The lower the cotton wool, the closer the rain.",
            answer = "Clouds"
        ),
        RiddleResponseRemote(
            question = "It is known that among the nine coins there is one fake, which has less weight than the rest of the coins. How to determine a counterfeit coin with the help of a cup scale in two weighings?",
            answer = "1st weighing: 3 and 3 coins. A fake coin in the pile that weighs less. If they are equal, then the fake is in the third pile. 2nd weigh-in: Any 2 coins are compared from the pile with the lowest weight. If they are equal, then the fake is the remaining coin"
        ),
        RiddleResponseRemote(
            question = "The boat is rocking on the water. A ladder has been thrown out from it along the side. Before the tide, the water covered only the bottom step. After how long will the water cover the 3rd step from below, if at high tide the water arrives at 20 cm per hour, and the distance between the steps is 30 cm?",
            answer = "Never, since the boat rises with the water"
        ),
        RiddleResponseRemote(
            question = "How to divide five apples between five girls so that each gets an apple and at the same time one of the apples remains in the basket?",
            answer = "Give one girl an apple with a basket"
        ),
        RiddleResponseRemote(
            question = "A woman was walking to Moscow, and three men were walking towards her. Everyone has a bag, each bag has a cat in it. How many creatures were heading to Moscow?",
            answer = "Only the woman went to Moscow, the rest went the other way"
        ),
        RiddleResponseRemote(
            question = "There were 10 birds sitting on the tree. A hunter came and shot one bird. How many birds are left on the tree?",
            answer = "None – the rest of the birds have flown away"
        ),
        RiddleResponseRemote(
            question = "You are participating in a marathon and overtook the runner who ran second. What position do you take now?",
            answer = "The second one. If you answered that you are now the first, then this is wrong: you overtook the second runner and took his place, so you are now in second position"
        ),
        RiddleResponseRemote(
            question = "A deaf-mute man went into a stationery store to buy a pencil sharpener. He stuck his finger in his left ear and with the fist of his other hand made a rotational movement near his right ear. The seller immediately understood what was being asked of him. Then a blind man entered the same store. How did he explain to the seller that he wanted to buy scissors?",
            answer = "Just said, he's blind, but not dumb"
        ),
        RiddleResponseRemote(
            question = "A rooster flew to the border of Russia and China. I sat down exactly on the border, absolutely in the middle. Laid an egg. It fell exactly across: the border divides it in the middle. Which country does the egg belong to?",
            answer = "Roosters don't lay eggs!"
        ),
        RiddleResponseRemote(
            question = "You were driving a bus with 42 passengers from Boston to Washington. At each of the six stops, 3 people got out of it, and at each second — four. What was the driver's name when the driver arrived in Washington 10 hours later?",
            answer = "What about you, because in the beginning it was said that you were driving a bus"
        ),
        RiddleResponseRemote(
            question = "In the old castle where the prison was located, there were 4 round towers in which prisoners were imprisoned. One of the prisoners decided to escape. And one day he hid in a corner, and when a guard entered, he stunned him with a blow to the head, and he ran away, changing into other clothes. Could it be?",
            answer = "No, since the towers were round and there were no corners"
        ),
        RiddleResponseRemote(
            question = "There is an elevator in a 12-storey building. Only 2 people live on the ground floor, the number of residents doubles from floor to floor. Which button in the elevator of this building is pressed more often than others?",
            answer = "Regardless of the distribution of tenants by floor – button '1'"
        ),
        RiddleResponseRemote(
            question = "What can a person increase in diameter by 7 times in a few seconds?",
            answer = "Pupil. During the transition from bright light to dark, the diameter can change from 1.1 to 8 mm; everything else either almost does not increase, or increases in diameter by no more than 2-3 times"
        ),
        RiddleResponseRemote(
            question = "2 people entered the entrance at the same time. One has an apartment on the 3rd floor, the other - on the 9th. How many times will the first person get there faster than the second? Note: they simultaneously pressed the buttons in 2 elevators moving at the same speed.",
            answer = "3 times. Correct answer: 4 times. Elevators usually go from the 1st floor. The first one will pass 3-1 = 2 floors, and the second 9-1 = 8 floors, i.e. 4 times more"
        ),
        RiddleResponseRemote(
            question = "Two horsemen competed: whose horse will come to the finish line last. However, it did not go, both stood still. Then they turned to the sage for advice, and after that both rode at full speed. What was advised to them?",
            answer = "The Sage advised the horsemen to exchange horses"
        ),
        RiddleResponseRemote(
            question = "Without hands, without legs, but can draw.", answer = "Frost"
        ),
        RiddleResponseRemote(
            question = "Which three numbers, when added and multiplied, give one result?",
            answer = "( 1 + 2 + 3 = 6, 1 * 2 * 3 = 6)"
        ),
        RiddleResponseRemote(
            question = "There are 8 benches in the park. Three were painted. How many benches are there in the park?",
            answer = "8"
        ),
        RiddleResponseRemote(
            question = "What sign should I put between 6 and 7 so that the result is less than 7 and more than 6?",
            answer = "Comma"
        ),
        RiddleResponseRemote(
            question = "The pet that starts with", answer = " Only one cockroach"
        ),
        RiddleResponseRemote(
            question = "Three tractor drivers have a brother Sergey, but Sergey has no brothers. Can it be?",
            answer = "Yes, if the tractor drivers are women"
        ),
        RiddleResponseRemote(
            question = "If five cats catch five mice in five minutes, how long does it take one cat to catch one mouse?",
            answer = "Five"
        ),
        RiddleResponseRemote(
            question = "Who doesn't get their hair wet in the pouring rain?", answer = "Bald"
        ),
        RiddleResponseRemote(
            question = "Can a man marry his widow's sister?", answer = "No, since the man is dead"
        ),
        RiddleResponseRemote(
            question = "Usually there are 30 or 31 days in a month. What month has 28 days?", answer = "In all"
        ),
        RiddleResponseRemote(
            question = "Who swims faster: duckling or chicken?", answer = "Chicken can't swim"
        ),
        RiddleResponseRemote(
            question = "When 2 and 2 are more than four?", answer = "When 22"
        ),
        RiddleResponseRemote(
            question = "Housewife's combat weapon. A symbol of warmth and comfort.", answer = "Rolling pin"
        ),
        RiddleResponseRemote(
            question = "Why does a person look back?", answer = "Because he has no eyes on the back of his head"
        ),
        RiddleResponseRemote(
            question = "What does a hare usually lie under?", answer = "Under your ears"
        ),
        RiddleResponseRemote(
            question = "Gone old and gray. Came green and young.", answer = "Winter and spring"
        ),
        RiddleResponseRemote(
            question = "Night. It's raining. The bus is coming. Everyone is asleep, only the driver is awake. Which bus? What is the driver's name? Which wheel doesn't turn in the bus?",
            answer = "The bus is wet. The driver's name is Tolka. The spare wheel is not spinning"
        ),
        RiddleResponseRemote(
            question = "There was a woman behind the test, she fell in a soft place. What are you thinking?",
            answer = "Head"
        ),
        RiddleResponseRemote(
            question = "Why does the goat have a sad look?", answer = "Because her husband is a goat"
        ),
        RiddleResponseRemote(
            question = "The father has three daughters, and each daughter has one brother. How many children does this father have in total?",
            answer = "Four"
        ),
        RiddleResponseRemote(
            question = "What will become wet after drying?", answer = "Towel"
        ),
        RiddleResponseRemote(
            question = "People all over the earth are doing it all at the same time. What exactly?",
            answer = "Getting old"
        ),
        RiddleResponseRemote(
            question = "One person never bought chicken eggs, did not grow them and did not steal, but ate two eggs every morning. How did it happen?",
            answer = "He didn't use chicken eggs"
        ),
        RiddleResponseRemote(
            question = "What happened after March 8th, 2014?", answer = "March 9th has come"
        ),
        RiddleResponseRemote(
            question = "Tanya had 6 plums. Tanya gave 1 plum to Marina, and they had equal plums. How many plums did Marina have in the beginning?",
            answer = "Marina had 4 plums in the beginning."
        ),
        RiddleResponseRemote(
            question = "Which car is decorated with an emblem of four rings?", answer = "Audi"
        ),
        RiddleResponseRemote(
            question = "Divide 10 oranges equally between 12 students, provided that each orange can be cut into no more than 3 equal parts?",
            answer = "cut 6 oranges in half, and each of the others into 3 equal parts, after which we give each student half and one third of an orange."
        ),
        RiddleResponseRemote(
            question = "There were 6 sparrows sitting on the tree. The hunter, having fired, hit two of them. How many sparrows are left on the tree?",
            answer = "There are no sparrows left, - all the others have flown away."
        ),
        RiddleResponseRemote(
            question = "One and a half hens will lay one and a half eggs in a day and a half. How many eggs will 3 hens lay in 4 days?",
            answer = "8"
        ),
        RiddleResponseRemote(
            question = "A pike weighs as much as a kilogram and half a pike weighs. What is the weight of the pike?",
            answer = "2 kg"
        ),
        RiddleResponseRemote(
            question = "Two cars were driving on the highway and drove 120 km. How many kilometers did each car drive?",
            answer = " 120 km."
        ),
        RiddleResponseRemote(
            question = "The seamstress has a piece of cloth 18 m and cuts 3 m every day. On what day will she cut the last time?",
            answer = "On the fifth"
        ),
        RiddleResponseRemote(
            question = "A group of ducks was flying. One in front, two behind, one behind and two in front, one between two and three in a row. How many ducks flew?",
            answer = "Three ducks flew one after the other"
        ),
        RiddleResponseRemote(
            question = "A horse carries 10 kg of coal, and a pony carries 10 kg of cotton wool. Who has a heavier load?",
            answer = "The load is the same — 10 kg."
        ),
        RiddleResponseRemote(
            question = "Which wheel in the car does not turn when it is driving?", answer = "Spare"
        ),
        RiddleResponseRemote(
            question = "There is one in the sky, a woman has two, but a girl does not.",
            answer = "The letter 'b'"
        ),
        RiddleResponseRemote(
            question = "Why are the duck's legs red?", answer = "From the knees"
        ),
        RiddleResponseRemote(
            question = "Forty feet and forty feet is how much?", answer = "Eighty- five"
        ),
        RiddleResponseRemote(
            question = "What gets the back of your head with your teeth?", answer = "Comb"
        ),
        RiddleResponseRemote(
            question = "Which island says it's clothes?", answer = "Jamaica"
        ),
        RiddleResponseRemote(
            question = "What is warmer than one casing?", answer = "Two housings"
        ),
        RiddleResponseRemote(
            question = "When a fool is smart.", answer = "When silent"
        ),
        RiddleResponseRemote(
            question = "What should I do first when I go to bed?", answer = "Sit down"
        ),
        RiddleResponseRemote(
            question = "There were eight bags in the mill, two mice were sitting on each bag, the miller came with a cat, how many legs are there now?",
            answer = "Two legs of the miller"
        ),
        RiddleResponseRemote(
            question = "Who shows everyone his face because he doesn't have his own?", answer = "Mirror"
        ),
        RiddleResponseRemote(
            question = "The notebook cost 60 rubles, the book costs the same plus 1/3 to this amount. Question: how much does the book cost?",
            answer = "90 rubles"
        ),
        RiddleResponseRemote(
            question = "How much will the fraction increase if its numerator is increased by the denominator",
            answer = "Increase by 1 time"
        ),
        RiddleResponseRemote(
            question = "10 workers dig a hole in 10 hours, dig 10 meters of the pit. How many workers will it take to dig 100 meters in 100 hours.",
            answer = "10"
        ),
        RiddleResponseRemote(
            question = "3 birds catch one fly each in 1 minute, but in three minutes, they manage to catch 3 flies. How many birds do you need to catch 60 flies in 1 hour.",
            answer = "3 birds"
        ),
        RiddleResponseRemote(
            question = "How to write the number 11 with the help of five twos, using all the signs of mathematical actions available in mathematics?",
            answer = "22/2 + 2 - 2 "
        ),
        RiddleResponseRemote(
            question = "How many degrees do the angles of an isosceles triangle have?", answer = "90, 45, 45"
        ),
        RiddleResponseRemote(
            question = "Vadim went for mushrooms, walking through the forest, he found one mushroom every 50 meters, as a result, by the end of the walk he had 25 mushrooms in his basket. What distance did Vadim walk.",
            answer = "1250 meters"
        ),
        RiddleResponseRemote(
            question = "The king invited 15 brave knights to participate in the tournament, before the start of the tournament they all gave each other military honors. How many greetings were they given to each other in total?.",
            answer = "105"
        ),
        RiddleResponseRemote(
            question = "Every birthday the son received one book from his parents, the last one he received after graduation, adding it to the five already available to him. How old is the son, and on what date he was born.",
            answer = "24 years, February 29"
        ),
        RiddleResponseRemote(
            question = "Two people approach the river. There's a boat at the shore that can only hold one. Both men crossed to the opposite shore. How?",
            answer = "They were on different shores."
        ),
        RiddleResponseRemote(
            question = "Who has a mustache longer than legs?", answer = "cockroach"
        ),
        RiddleResponseRemote(
            question = "The famous magician says he can put a bottle in the center of the room and crawl into it. How is it?",
            answer = "Anyone can crawl into the room."
        ),
        RiddleResponseRemote(
            question = "What number will be obtained if you multiply all the digits on the numeric keypad of the phone?",
            answer = "Zero, because any number multiplied by 0 will always be zero."
        ),
        RiddleResponseRemote(
            question = "The duck got $9, the spider - $36, the bee — $27. Based on this information, how much money will the cat be given?",
            answer = "$18 ($4.50 per paw)."
        ),
        RiddleResponseRemote(
            question = "When Josh was 8 years old, his brother was half his age. Now that Josh is 14, how old is his brother?",
            answer = "His brother is 10 years old. Half of 8 is 4, so Josh's brother is 4 years younger. When Josh is 14, his brother is still 4 years younger, so he's 10."
        ),
        RiddleResponseRemote(
            question = "When my father was 31, I was 8. Now he is twice my age. How old am I?",
            answer = "The age difference is 23 years, so the son should be 23 years old if the father was twice as old."
        )
    )
}