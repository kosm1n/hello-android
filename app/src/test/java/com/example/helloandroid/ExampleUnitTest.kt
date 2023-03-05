package com.example.helloandroid

import com.example.helloandroid.model.Dice
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun givenADiceWithSixSides_whenRollTheDice_thenTheResultShouldBeBetweenOneAndSixInclusive() {

        // arrange
        val dice = Dice(6)
        val diceSidesList = listOf(1,2,3,4,5,6)

        // act
        val result = dice.roll()

        // assert
        assertTrue("The diceSidesList", diceSidesList.contains(result))
    }
}