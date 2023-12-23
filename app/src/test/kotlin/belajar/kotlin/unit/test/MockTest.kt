package belajar.kotlin.unit.test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class MockTest {
    @Test
    fun testMock() {
        val list = Mockito.mock(List::class.java) as List<*>

        Mockito.`when`(list[0]).thenReturn("Gian")
        Mockito.`when`(list[1]).thenReturn("Nurwana")

        Assertions.assertEquals("Gian", list[0])
        Assertions.assertEquals("Gian", list[0])
        Assertions.assertEquals("Nurwana", list[1])

        // verifikasi kalo mock object pernah dipanggil
        Mockito.verify(list, Mockito.times(2))[0]
        Mockito.verify(list)[1]
    }
}