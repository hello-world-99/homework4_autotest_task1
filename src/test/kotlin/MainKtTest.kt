import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun transactionWrong1() {
        val type = "Mastercard"
        val sum = 1000.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(2100.0,result,0.000001)
    }
    @Test
    fun transactionTrue1() {
        val type = "Mastercard"
        val sum = 1000.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(2000.0,result,0.000001)
    }
    @Test
    fun transactionWrongC1() {
        val type = "Maestro"
        val sum = 1000.0
        val pay = 100000.0
        val result=transaction(type, sum, pay)
        assertEquals(100000.0,result,0.000001)
    }
    @Test
    fun transactionTrueC1() {
        val type = "Maestro"
        val sum = 100000.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(101026.0,result,0.000001)
    }
    @Test
    fun transactionTrueC21() {
        val type = "Visa"
        val sum = 100.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(1107.5,result,0.000001)
    }
    @Test
    fun transactionWrongC21() {
        val type = "Visa"
        val sum = 20.0
        val pay = 5.0
        val result=transaction(type, sum, pay)
        assertEquals(25.0,result,0.000001)
    }
    @Test
    fun transactionTrueC22() {
        val type = "Мир"
        val sum = 100.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(1107.5,result,0.000001)
    }
    @Test
    fun transactionWrongC22() {
        val type = "Мир"
        val sum = 20.0
        val pay = 5.0
        val result=transaction(type, sum, pay)
        assertEquals(0.0,result,0.000001)
    }

}