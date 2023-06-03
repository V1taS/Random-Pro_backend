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
            question = "What has keys but can't open locks?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "What has hands but can't clap?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "What has a face and two hands but no arms or legs?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "What gets wetter and wetter the more it dries?",
            answer = "A towel"
        ),
        RiddleResponseRemote(
            question = "What can you catch but not throw?",
            answer = "A cold"
        ),
        RiddleResponseRemote(
            question = "I run, but I don’t get anywhere. What am I?",
            answer = "A treadmill"
        ),
        RiddleResponseRemote(
            question = "What's orange and sounds like a parrot?",
            answer = "A carrot"
        ),
        RiddleResponseRemote(
            question = "What has to be broken before you can use it?",
            answer = "An egg"
        ),
        RiddleResponseRemote(
            question = "What goes up and down but doesn’t move?",
            answer = "A staircase"
        ),
        RiddleResponseRemote(
            question = "Which letter of the alphabet has the most water?",
            answer = "The 'C'"
        ),
        RiddleResponseRemote(
            question = "What begins with T, ends with T and has T in it?",
            answer = "A teapot"
        ),
        RiddleResponseRemote(
            question = "What is full of holes but still holds water?",
            answer = "A sponge"
        ),
        RiddleResponseRemote(
            question = "What word is spelled wrong in every dictionary?",
            answer = "Wrong"
        ),
        RiddleResponseRemote(
            question = "What never asks questions but receives a lot of answers?",
            answer = "A telephone"
        ),
        RiddleResponseRemote(
            question = "I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
            answer = "An echo"
        ),
        RiddleResponseRemote(
            question = "What has a thumb and four fingers but is not alive?",
            answer = "A glove"
        ),
        RiddleResponseRemote(
            question = "What has a heart that doesn't beat?",
            answer = "A deck of cards"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "A pencil"
        ),
        RiddleResponseRemote(
            question = "I am full of holes but can still hold water. What am I?",
            answer = "A sponge"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks, and space but no room?",
            answer = "A keyboard"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I am always hungry, I must always be fed, the finger I touch will soon turn red. What am I?",
            answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "What has a face that doesn't smile, a back that doesn't work, and hands that don't clap?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "What has cities, but no houses; forests, but no trees; and rivers, but no water?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "What can you hold in your right hand, but never in your left hand?",
            answer = "Your left elbow"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I am full of holes but can still hold water. What am I?",
            answer = "A sponge"
        ),
        RiddleResponseRemote(
            question = "What has a heart that doesn't beat?",
            answer = "A deck of cards"
        ),
        RiddleResponseRemote(
            question = "I am an odd number. Take away a letter and I become even. What number am I?",
            answer = "Seven"
        ),
        RiddleResponseRemote(
            question = "I am alive without breath and cold as death. I am never thirsty but always drinking. What am I?",
            answer = "Fish"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks, space but no room, and you can enter but can't go inside?",
            answer = "A keyboard"
        ),
        RiddleResponseRemote(
            question = "What has a neck but no head?",
            answer = "A bottle"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "What gets wet while drying?",
            answer = "A towel"
        ),
        RiddleResponseRemote(
            question = "What has eyes but can't see?",
            answer = "Potatoes"
        ),
        RiddleResponseRemote(
            question = "What has a head and a tail but no body?",
            answer = "A coin"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks, and rooms but no walls?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "What comes once in a minute, twice in a moment, but never in a thousand years?",
            answer = "The letter 'M'"
        ),
        RiddleResponseRemote(
            question = "What can be heard and caught but never seen?",
            answer = "A cold"
        ),
        RiddleResponseRemote(
            question = "What has many keys but can't open any locks?",
            answer = "A piano keyboard"
        ),
        RiddleResponseRemote(
            question = "What has a bottom at the top?",
            answer = "Your legs"
        ),
        RiddleResponseRemote(
            question = "I am full of holes but can still hold water. What am I?",
            answer = "A sponge"
        ),
        RiddleResponseRemote(
            question = "What has a heart that doesn't beat?",
            answer = "A deck of cards"
        ),
        RiddleResponseRemote(
            question = "What goes up but never comes down?",
            answer = "Your age"
        ),
        RiddleResponseRemote(
            question = "What can you catch but not throw?",
            answer = "A cold"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "What has a thumb and four fingers but is not alive?",
            answer = "A glove"
        ),
        RiddleResponseRemote(
            question = "What gets wetter and wetter the more it dries?",
            answer = "A towel"
        ),
        RiddleResponseRemote(
            question = "I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
            answer = "An echo"
        ),
        RiddleResponseRemote(
            question = "What has a face that doesn't smile, a back that doesn't work, and hands that don't clap?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "What has cities, but no houses; forests, but no trees; and rivers, but no water?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "What can you hold in your right hand, but never in your left hand?",
            answer = "Your left elbow"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I am full of holes but can still hold water. What am I?",
            answer = "A sponge"
        ),
        RiddleResponseRemote(
            question = "What has a heart that doesn't beat?",
            answer = "A deck of cards"
        ),
        RiddleResponseRemote(
            question = "I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer = "A keyboard"
        ),
        RiddleResponseRemote(
            question = "What has a face that can't see, and hands that can't touch?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "What has a head and a tail but no body?",
            answer = "A coin"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I can fly without wings. I can cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer = "A cloud"
        ),
        RiddleResponseRemote(
            question = "What has a ring but no finger?",
            answer = "A phone"
        ),
        RiddleResponseRemote(
            question = "I am an odd number. Take away a letter and I become even. What number am I?",
            answer = "Seven"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "I am full of holes but can still hold water. What am I?",
            answer = "A sponge"
        ),
        RiddleResponseRemote(
            question = "What has a heart that doesn't beat?",
            answer = "A deck of cards"
        ),
        RiddleResponseRemote(
            question = "I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
            answer = "An echo"
        ),
        RiddleResponseRemote(
            question = "What has cities, but no houses; forests, but no trees; and rivers, but no water?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "What begins with T, ends with T, and has T in it?",
            answer = "A teapot"
        ),
        RiddleResponseRemote(
            question = "I have keys but can't open locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer = "A keyboard"
        ),
        RiddleResponseRemote(
            question = "What can you catch but not throw?",
            answer = "A cold"
        ),
        RiddleResponseRemote(
            question = "What has a face that can't smile, a back that can't scratch, and hands that can't clap?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "What has a neck but no head?",
            answer = "A bottle"
        ),
        RiddleResponseRemote(
            question = "What has cities but no houses, rivers but no water, and forests but no trees?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "What can you hold in your right hand, but never in your left hand?",
            answer = "Your left hand"
        ),
        RiddleResponseRemote(
            question = "I am full of holes, but I can still hold water. What am I?",
            answer = "A sponge"
        ),
        RiddleResponseRemote(
            question = "What has a bottom at the top?",
            answer = "Your legs"
        ),
        RiddleResponseRemote(
            question = "What has a thumb and four fingers but is not alive?",
            answer = "A glove"
        ),
        RiddleResponseRemote(
            question = "What gets wetter and wetter the more it dries?",
            answer = "A towel"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "What has a face that can't smile, and hands that can't clap?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "What has a heart that doesn't beat?",
            answer = "A deck of cards"
        ),
        RiddleResponseRemote(
            question = "I am full of holes but can still hold water. What am I?",
            answer = "A sponge"
        ),
        RiddleResponseRemote(
            question = "What has a neck but no head?",
            answer = "A bottle"
        ),
        RiddleResponseRemote(
            question = "What can you catch but not throw?",
            answer = "A cold"
        ),
        RiddleResponseRemote(
            question = "What has a face that can't smile, and hands that can't clap?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I can be cracked, made, told, and played. What am I?",
            answer = "A joke"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks, and rooms but no walls?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "What can travel around the world while staying in a corner?",
            answer = "A stamp"
        ),
        RiddleResponseRemote(
            question = "I have cities but no houses, forests but no trees, and rivers but no water. What am I?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "What is always in front of you but can't be seen?",
            answer = "The future"
        ),
        RiddleResponseRemote(
            question = "What has a head and a tail but no body?",
            answer = "A coin"
        ),
        RiddleResponseRemote(
            question = "What gets wet while drying?",
            answer = "A towel"
        ),
        RiddleResponseRemote(
            question = "What has a face that can't smile, and hands that can't clap?",
            answer = "A clock"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "What has a heart that doesn't beat?",
            answer = "A deck of cards"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
            answer = "An echo"
        ),
        RiddleResponseRemote(
            question = "What has cities, but no houses; forests, but no trees; and rivers, but no water?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "What begins with T, ends with T, and has T in it?",
            answer = "A teapot"
        )
    )

    private val hardRiddles = listOf(
        RiddleResponseRemote(
            question = "What has keys but can't open locks?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
            answer = "An echo"
        ),
        RiddleResponseRemote(
            question = "I have cities but no houses, forests but no trees, and rivers but no water. What am I?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I fly without wings, I cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer = "A cloud"
        ),
        RiddleResponseRemote(
            question = "I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer = "An oven"
        ),
        RiddleResponseRemote(
            question = "I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer = "A keyboard"
        ),
        RiddleResponseRemote(
            question = "I have a head and a tail, but no body. What am I?",
            answer = "A coin"
        ),
        RiddleResponseRemote(
            question = "I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I have cities but no houses, forests but no trees, and rivers but no water. What am I?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
            answer = "An echo"
        ),
        RiddleResponseRemote(
            question = "I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer = "A cloud"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer = "An oven"
        ),
        RiddleResponseRemote(
            question = "I have a head and a tail, but no body. What am I?",
            answer = "A coin"
        ),
        RiddleResponseRemote(
            question = "I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer = "A keyboard"
        ),
        RiddleResponseRemote(
            question = "I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "I have cities but no houses, rivers but no water, and forests but no trees. What am I?",
            answer = "A map"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "I am the beginning of the end, and the end of time and space. I am essential to creation, and I surround every place. What am I?",
            answer = "The letter 'e'"
        ),
        RiddleResponseRemote(
            question = "I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "I am a word of letters three, add two and fewer there will be. What am I?",
            answer = "Few"
        ),
        RiddleResponseRemote(
            question = "What has keys but can't open locks?",
            answer = "A piano"
        ),
        RiddleResponseRemote(
            question = "I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer = "A cloud"
        ),
        RiddleResponseRemote(
            question = "I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer = "An oven"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I have a head and a tail, but no body. What am I?",
            answer = "A coin"
        ),
        RiddleResponseRemote(
            question = "I can be cracked, made, told, and played. What am I?",
            answer = "A joke"
        ),
        RiddleResponseRemote(
            question = "I am not alive, but I can grow. I don't have lungs, but I need air to survive. What am I?",
            answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "I have keys, but no locks. I have space, but no room. You can enter, but can't go outside. What am I?",
            answer = "A keyboard"
        ),
        RiddleResponseRemote(
            question = "I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer = "An oven"
        ),
        RiddleResponseRemote(
            question = "I am a word of letters three, add two and fewer there will be. What am I?",
            answer = "Few"
        ),
        RiddleResponseRemote(
            question = "I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer = "A cloud"
        ),
        RiddleResponseRemote(
            question = "I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer = "An oven"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "I am the beginning of the end, and the end of time and space. I am essential to creation, and I surround every place. What am I?",
            answer = "The letter 'e'"
        ),
        RiddleResponseRemote(
            question = "I can be cracked, made, told, and played. What am I?",
            answer = "A joke"
        ),
        RiddleResponseRemote(
            question = "I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer = "A cloud"
        ),
        RiddleResponseRemote(
            question = "I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer = "An oven"
        ),
        RiddleResponseRemote(
            question = "I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer = "Fire"
        ),
        RiddleResponseRemote(
            question = "I have a head and a tail, but no body. What am I?",
            answer = "A coin"
        ),
        RiddleResponseRemote(
            question = "I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer = "A keyboard"
        ),
        RiddleResponseRemote(
            question = "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer = "Pencil lead"
        ),
        RiddleResponseRemote(
            question = "The more you take, the more you leave behind. What am I?",
            answer = "Footsteps"
        ),
        RiddleResponseRemote(
            question="I am always in front of you but can never be seen. What am I?",
            answer="The future"
        ),
        RiddleResponseRemote(
            question="I am full of holes but still holds water. What am I?",
            answer="A sponge"
        ),
        RiddleResponseRemote(
            question="The more you take, the more you leave behind. What am I?",
            answer="Footsteps"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I have cities, but no houses. I have forests, but no trees. I have rivers, but no water. What am I?",
            answer="A map"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have a head and a tail, but no body. What am I?",
            answer="A coin"
        ),
        RiddleResponseRemote(
            question="What has keys but can't open locks?",
            answer="A piano"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer="Pencil lead"
        ),
        RiddleResponseRemote(
            question="I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?",
            answer="An echo"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I have a head and a tail, but no body. What am I?",
            answer="A coin"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer="Pencil lead"
        ),
        RiddleResponseRemote(
            question="I have cities but no houses, forests but no trees, and rivers but no water. What am I?",
            answer="A map"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="What has keys but can't open locks?",
            answer="A piano"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer="Pencil lead"
        ),
        RiddleResponseRemote(
            question="I am the beginning of the end, and the end of time and space. I am essential to creation, and I surround every place. What am I?",
            answer="The letter 'e'"
        ),
        RiddleResponseRemote(
            question="I am full of holes but still holds water. What am I?",
            answer="A sponge"
        ),
        RiddleResponseRemote(
            question="The more you take, the more you leave behind. What am I?",
            answer="Footsteps"
        ),
        RiddleResponseRemote(
            question="I am always in front of you but can never be seen. What am I?",
            answer="The future"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I have a head and a tail, but no body. What am I?",
            answer="A coin"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I am not alive, but I can grow. I don't have lungs, but I need air to survive. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I am always in front of you but can never be seen. What am I?",
            answer="The future"
        ),
        RiddleResponseRemote(
            question="I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer="Pencil lead"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I have cities but no houses, forests but no trees, and rivers but no water. What am I?",
            answer="A map"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I am the beginning of the end, and the end of time and space. I am essential to creation, and I surround every place. What am I?",
            answer="The letter 'e'"
        ),
        RiddleResponseRemote(
            question="I am full of holes but still holds water. What am I?",
            answer="A sponge"
        ),
        RiddleResponseRemote(
            question="I am always in front of you but can never be seen. What am I?",
            answer="The future"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I have a head and a tail, but no body. What am I?",
            answer="A coin"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I am not alive, but I can grow. I don't have lungs, but I need air to survive. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I am always in front of you but can never be seen. What am I?",
            answer="The future"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I have cities but no houses, forests but no trees, and rivers but no water. What am I?",
            answer="A map"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="What has keys but can't open locks?",
            answer="A piano"
        ),
        RiddleResponseRemote(
            question="I am the beginning of the end, and the end of time and space. I am essential to creation, and I surround every place. What am I?",
            answer="The letter 'e'"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer="Pencil lead"
        ),
        RiddleResponseRemote(
            question="I am full of holes but still holds water. What am I?",
            answer="A sponge"
        ),
        RiddleResponseRemote(
            question="The more you take, the more you leave behind. What am I?",
            answer="Footsteps"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I have a head and a tail, but no body. What am I?",
            answer="A coin"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I am not alive, but I can grow. I don't have lungs, but I need air to survive. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I am always in front of you but can never be seen. What am I?",
            answer="The future"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            answer="Pencil lead"
        ),
        RiddleResponseRemote(
            question="I can be cracked, made, told, and played. What am I?",
            answer="A joke"
        ),
        RiddleResponseRemote(
            question="I have cities but no houses, forests but no trees, and rivers but no water. What am I?",
            answer="A map"
        ),
        RiddleResponseRemote(
            question="I am always hungry, I must always be fed. The finger I touch, will soon turn red. What am I?",
            answer="Fire"
        ),
        RiddleResponseRemote(
            question="I can fly without wings, cry without eyes. Wherever I go, darkness follows me. What am I?",
            answer="A cloud"
        ),
        RiddleResponseRemote(
            question="I have a heart that doesn't beat. I can't be alive, but I can still heat. What am I?",
            answer="An oven"
        ),
        RiddleResponseRemote(
            question="I have keys but no locks. I have space but no room. You can enter, but can't go outside. What am I?",
            answer="A keyboard"
        ),
        RiddleResponseRemote(
            question="I am the beginning of the end, and the end of time and space. I am essential to creation, and I surround every place. What am I?",
            answer="The letter 'e'"
        ),
        RiddleResponseRemote(
            question="I am full of holes but still holds water. What am I?",
            answer="A sponge"
        ),
        RiddleResponseRemote(
            question="I am always in front of you but can never be seen. What am I?",
            answer="The future"
        )
    )
}