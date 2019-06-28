import junit.framework.TestCase
import sort.margeSort

class Marge_sortKtTest : TestCase() {

    fun testMargeSort() {
        val input = listOf(12, 3,4,10, 2 , 65)
        val output = listOf(2, 3, 4,10, 12 , 65)

        assertEquals(output, margeSort(input))
    }

}