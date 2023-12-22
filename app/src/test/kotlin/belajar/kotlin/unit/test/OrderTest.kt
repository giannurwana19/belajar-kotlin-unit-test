package belajar.kotlin.unit.test

import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

// by default diurutkan berdasarkan alfanumber atau methodName
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class OrderTest {
    @Test
    @Order(3)
    fun testA() {
    }

    @Test
    @Order(1)
    fun testC() {
    }

    @Order(2)
    @Test
    fun testB() {
    }
}