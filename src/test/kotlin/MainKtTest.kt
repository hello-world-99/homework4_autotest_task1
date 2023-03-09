import org.junit.Test

import org.junit.Assert.*

class MainKtTest {


    @Test
    fun transaction1() {
        val type = "Mastercard"
        val sum = 1000.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(2000.0,result,0.000001)
    }

    @Test
    fun transaction2() {
        val type = "Maestro"
        val sum = 100000.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(101026.0,result,0.000001)
    }
    @Test
    fun transaction8() {
        val type = "Maestro"
        val sum = 1000.0
        val pay = 100000.0
        val result=transaction(type, sum, pay)
        assertEquals(101620.0,result,0.000001)
    }
    @Test
    fun transaction3() {
        val type = "Visa"
        val sum = 100.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(1107.5,result,0.000001)
    }

    @Test
    fun transaction4() {
        val type = "Мир"
        val sum = 100.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(1107.5,result,0.000001)
    }
    @Test
    fun transaction5() {
        val type = "Мир"
        val sum = 20.0
        val pay = 5.0
        val result=transaction(type, sum, pay)
        assertEquals(0.0,result,0.000001)
    }

    @Test
    fun transaction6() {
        val type = "VK Pay"
        val sum = 20.0
        val pay = 5.0
        val result=transaction(type, sum, pay)
        assertEquals(25.0,result,0.000001)
    }
    @Test
    fun transaction7() {
        val type = "231"
        val sum = -1.0
        val pay = 0.0
        val result=transaction(type, sum, pay)
        assertEquals(0.0,result,0.000001)
    }
    @Test
    fun transaction9() {
        val type = ""
        val sum = -1.0
        val pay = 0.0
        val result=transaction(type, sum, pay)
        assertEquals(0.0,result,0.000001)
    }

}