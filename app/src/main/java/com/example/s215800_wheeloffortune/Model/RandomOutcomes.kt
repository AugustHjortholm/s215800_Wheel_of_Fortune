package com.example.s215800_wheeloffortune.Model

import android.content.res.Resources
import com.example.s215800_wheeloffortune.R
import java.util.*


val words = mapOf<String, Array<String>>(
    "Food" to arrayOf<String>(
        Resources.getSystem().getString(R.string.food_1),
        Resources.getSystem().getString(R.string.food_2),
        Resources.getSystem().getString(R.string.food_3),
        Resources.getSystem().getString(R.string.food_4),
        Resources.getSystem().getString(R.string.food_5),
        Resources.getSystem().getString(R.string.food_6),
        Resources.getSystem().getString(R.string.food_7),
        Resources.getSystem().getString(R.string.food_8),
        Resources.getSystem().getString(R.string.food_9),
        Resources.getSystem().getString(R.string.food_10)
    ),
    "Countries" to arrayOf(
        Resources.getSystem().getString(R.string.countries_1),
        Resources.getSystem().getString(R.string.countries_2),
        Resources.getSystem().getString(R.string.countries_3),
        Resources.getSystem().getString(R.string.countries_4),
        Resources.getSystem().getString(R.string.countries_5),
        Resources.getSystem().getString(R.string.countries_6),
        Resources.getSystem().getString(R.string.countries_7),
        Resources.getSystem().getString(R.string.countries_8),
        Resources.getSystem().getString(R.string.countries_9),
        Resources.getSystem().getString(R.string.countries_10)
    ),
    "Top 100 Movies" to arrayOf(
        Resources.getSystem().getString(R.string.top_100_movies_1),
        Resources.getSystem().getString(R.string.top_100_movies_2),
        Resources.getSystem().getString(R.string.top_100_movies_3),
        Resources.getSystem().getString(R.string.top_100_movies_4),
        Resources.getSystem().getString(R.string.top_100_movies_5),
        Resources.getSystem().getString(R.string.top_100_movies_6),
        Resources.getSystem().getString(R.string.top_100_movies_7),
        Resources.getSystem().getString(R.string.top_100_movies_8),
        Resources.getSystem().getString(R.string.top_100_movies_9),
        Resources.getSystem().getString(R.string.top_100_movies_10)
    ),
    "Top 100 Songs" to arrayOf(
        Resources.getSystem().getString(R.string.top_100_songs_1),
        Resources.getSystem().getString(R.string.top_100_songs_2),
        Resources.getSystem().getString(R.string.top_100_songs_3),
        Resources.getSystem().getString(R.string.top_100_songs_4),
        Resources.getSystem().getString(R.string.top_100_songs_5),
        Resources.getSystem().getString(R.string.top_100_songs_6),
        Resources.getSystem().getString(R.string.top_100_songs_7),
        Resources.getSystem().getString(R.string.top_100_songs_8),
        Resources.getSystem().getString(R.string.top_100_songs_9),
        Resources.getSystem().getString(R.string.top_100_songs_10)
    ),
    "Cities" to arrayOf(
        Resources.getSystem().getString(R.string.cities_1),
        Resources.getSystem().getString(R.string.cities_2),
        Resources.getSystem().getString(R.string.cities_3),
        Resources.getSystem().getString(R.string.cities_4),
        Resources.getSystem().getString(R.string.cities_5),
        Resources.getSystem().getString(R.string.cities_6),
        Resources.getSystem().getString(R.string.cities_7),
        Resources.getSystem().getString(R.string.cities_8),
        Resources.getSystem().getString(R.string.cities_9),
        Resources.getSystem().getString(R.string.cities_10)
    ),
    "Events" to arrayOf(
        Resources.getSystem().getString(R.string.events_1),
        Resources.getSystem().getString(R.string.events_2),
        Resources.getSystem().getString(R.string.events_3),
        Resources.getSystem().getString(R.string.events_4),
        Resources.getSystem().getString(R.string.events_5),
        Resources.getSystem().getString(R.string.events_6),
        Resources.getSystem().getString(R.string.events_7),
        Resources.getSystem().getString(R.string.events_8),
        Resources.getSystem().getString(R.string.events_9),
        Resources.getSystem().getString(R.string.events_10)
    ),
    "Megawords" to arrayOf(
        Resources.getSystem().getString(R.string.megaword_1),
        Resources.getSystem().getString(R.string.megaword_2),
        Resources.getSystem().getString(R.string.megaword_3),
        Resources.getSystem().getString(R.string.megaword_4),
        Resources.getSystem().getString(R.string.megaword_5),
        Resources.getSystem().getString(R.string.megaword_6),
        Resources.getSystem().getString(R.string.megaword_7),
        Resources.getSystem().getString(R.string.megaword_8),
        Resources.getSystem().getString(R.string.megaword_9),
        Resources.getSystem().getString(R.string.megaword_10)
    ),
    "Swedish Cousine" to arrayOf(
        Resources.getSystem().getString(R.string.swedish_cousine_1),
        Resources.getSystem().getString(R.string.swedish_cousine_2),
        Resources.getSystem().getString(R.string.swedish_cousine_3),
        Resources.getSystem().getString(R.string.swedish_cousine_4),
        Resources.getSystem().getString(R.string.swedish_cousine_5),
        Resources.getSystem().getString(R.string.swedish_cousine_6),
        Resources.getSystem().getString(R.string.swedish_cousine_7),
        Resources.getSystem().getString(R.string.swedish_cousine_8),
        Resources.getSystem().getString(R.string.swedish_cousine_9),
        Resources.getSystem().getString(R.string.swedish_cousine_10)
    ),
    "Anything" to arrayOf(
        Resources.getSystem().getString(R.string.anything_1),
        Resources.getSystem().getString(R.string.anything_2),
        Resources.getSystem().getString(R.string.anything_3),
        Resources.getSystem().getString(R.string.anything_4),
        Resources.getSystem().getString(R.string.anything_5),
        Resources.getSystem().getString(R.string.anything_6),
        Resources.getSystem().getString(R.string.anything_7),
        Resources.getSystem().getString(R.string.anything_8),
        Resources.getSystem().getString(R.string.anything_9),
        Resources.getSystem().getString(R.string.anything_10)
    ),
)

//Duplicate entries are there to increase the likelihood of them being picked (100 is in the list thrice so it's the most likely outcome)
val wheelOptions: Set<String> = setOf(
    Resources.getSystem().getString(R.string.wheel_outcome_1),
    Resources.getSystem().getString(R.string.wheel_outcome_2),
    Resources.getSystem().getString(R.string.wheel_outcome_3),
    Resources.getSystem().getString(R.string.wheel_outcome_4),
    Resources.getSystem().getString(R.string.wheel_outcome_5),
    Resources.getSystem().getString(R.string.wheel_outcome_6),
    Resources.getSystem().getString(R.string.wheel_outcome_7),
    Resources.getSystem().getString(R.string.wheel_outcome_8),
    Resources.getSystem().getString(R.string.wheel_outcome_9),
    Resources.getSystem().getString(R.string.wheel_outcome_10),
    Resources.getSystem().getString(R.string.wheel_outcome_11),
    Resources.getSystem().getString(R.string.wheel_outcome_12),
    Resources.getSystem().getString(R.string.wheel_outcome_13),
    Resources.getSystem().getString(R.string.wheel_outcome_14),
    Resources.getSystem().getString(R.string.wheel_outcome_15),
    Resources.getSystem().getString(R.string.wheel_outcome_16),
    Resources.getSystem().getString(R.string.wheel_outcome_17),
    Resources.getSystem().getString(R.string.wheel_outcome_18),
    Resources.getSystem().getString(R.string.wheel_outcome_19),
    Resources.getSystem().getString(R.string.wheel_outcome_20),
    Resources.getSystem().getString(R.string.wheel_outcome_21)
)

fun getWordFromCategory(category: String): String? {
    val randomNumber = Random(Date().time).nextInt()
    return words[category]?.get(randomNumber)
}

fun getWheelSpinOutcome(): String {
    return wheelOptions.random()
}