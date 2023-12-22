package belajar.kotlin.unit.test

import belajar.kotlin.unit.test.resolver.RandomParameterResolver
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
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
}