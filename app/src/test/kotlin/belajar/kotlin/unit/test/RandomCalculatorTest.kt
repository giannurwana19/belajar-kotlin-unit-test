package belajar.kotlin.unit.test

import belajar.kotlin.unit.test.resolver.RandomParameterResolver
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.RepetitionInfo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import java.util.Random

class RandomCalculatorTest : ParentCalculatorTest() {

    @Test
    fun testRandom(random: Random) {
        val first = random.nextInt(100)
        val second = random.nextInt(1000)

        println(first)
        println(second)

        val result = calculator.add(first, second)

        Assertions.assertEquals(first + second, result)
    }

    @DisplayName("Test calculator random")
    @RepeatedTest(value = 10, name = "{displayName} ke {currentRepetition} dari {totalRepetitions}")
    fun testRandomRepeated(random: Random, repetitionInfo: RepetitionInfo, testInfo: TestInfo) {
        println("${testInfo.displayName} ke ${repetitionInfo.currentRepetition} dari ${repetitionInfo.totalRepetitions}")
        val first = random.nextInt(100)
        val second = random.nextInt(1000)

        println(first)
        println(second)

        val result = calculator.add(first, second)

        Assertions.assertEquals(first + second, result)
    }
}