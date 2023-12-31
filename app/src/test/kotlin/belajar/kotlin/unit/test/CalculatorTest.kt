package belajar.kotlin.unit.test

import belajar.kotlin.unit.test.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.DisplayNameGeneration
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.opentest4j.TestAbortedException


//@DisplayName("Test Calculator Test")
@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
class CalculatorTest {
    private val calculator = Calculator()

    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("Sebelum semua unit test")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("Setelah semua unit test")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("Before Eech")
    }

    @AfterEach
    fun afterEach() {
        println("After Each")
    }

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

    /**
     * Kadang kita ingin membatalkan unit test ketika kondisi tertentu terjadi
     * Untuk membatalkan, kita bisa menggunakan exception TestAbortedException
     * Jika JUnit mendapatkan exception TestAbortedException, secara otomatis test tersebut akan dibatalkan
     */
    @Test
    fun testAborted() {
//        val profile = System.getenv()["PROFILE"]
        val profile = System.getenv("PROFILE")
        if ("DEV" != profile) {
            throw TestAbortedException()
        }

        println("Test not aborted")
    }

    @Test
    fun testAssumption() {
        assumeTrue("DEV" == System.getenv("PROFILE"))

        println("Test not aborted because dev profile")
    }
}