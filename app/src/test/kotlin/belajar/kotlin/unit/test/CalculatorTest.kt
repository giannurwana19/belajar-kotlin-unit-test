package belajar.kotlin.unit.test

import belajar.kotlin.unit.test.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.DisplayNameGeneration
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


//@DisplayName("Test Calculator Test")
@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
class CalculatorTest {
    private val calculator = Calculator()

    @Test
//    @DisplayName("Test for function calculator.add(10,10)")
    fun testAddSuccess() {
        val result = calculator.add(10, 20)
        Assertions.assertEquals(30, result, "Hasil harusnya 20")
    }

    @Test
//    @DisplayName("Test for function calculator.add(20,20)")
    fun testAddSuccess2() {
        val result = calculator.add(20, 20)
        Assertions.assertEquals(40, result, "Hasil harusnya 40")
    }

    @Test
    fun testDivideSuccess() {
        val result = calculator.divide(100, 10)

        Assertions.assertEquals(10, result)
    }

    @Test
    fun testDividedFailed() {
        assertThrows<IllegalArgumentException> {
            calculator.divide(100, 0)
        }
    }

    @Test
    @Disabled("Coming soon")
    fun testComingSoon() {
    }
}