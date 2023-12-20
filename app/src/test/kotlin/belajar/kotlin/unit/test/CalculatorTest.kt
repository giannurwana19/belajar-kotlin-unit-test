package belajar.kotlin.unit.test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun testAddSuccess() {
        val result = calculator.add(10, 20)
        Assertions.assertEquals(30, result, "Hasil harusnya 20")
    }

    @Test
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
}