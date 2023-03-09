import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun transactionWrong() {
        val type = "Mastercard"
        val sum = 1000.0
        val pay = 1000.0
        val result=transaction(type, sum, pay)
        assertEquals(2000.0,result,0.000001)
    }
}