import org.junit.Test
import kotlin.test.assertEquals

class StubTest {
    var x = 5

    @Test
    fun myFirstTest() {
        x = 6
        assertEquals(6, x)
    }

    @Test
    fun mySecondTest() {
        assertEquals(5, x)
    }
}