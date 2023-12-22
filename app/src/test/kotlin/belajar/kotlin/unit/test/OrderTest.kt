package belajar.kotlin.unit.test

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestMethodOrder

/**
 * by default diurutkan berdasarkan alfanumber atau methodName
 * kita bisa mengubah test instance nya menjadi per class
 *
 */
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class OrderTest {
    private var counter = 0

    @BeforeAll
    fun beforeAll() {
        println("before all")
    }

    @AfterAll
    fun afterAll() {
        println("after all")
    }

    @Test
    @Order(3)
    fun testA() {
        counter++
        println(counter)
        println(this.hashCode())
    }

    @Test
    @Order(1)
    fun testC() {
        counter++
        println(counter)
        println(this.hashCode())
    }

    @Order(2)
    @Test
    fun testB() {
        counter++
        println(counter)
        println(this.hashCode())
    }
}