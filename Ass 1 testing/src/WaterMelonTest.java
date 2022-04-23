import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class WaterMelonTest {
    @Test
    void Testcase1() {
        var watermelon = new WaterMelon();
        assertTrue(watermelon.weight(16));
    }
    @Test
    void Testcase2() {
        var watermelon = new WaterMelon();
        assertFalse(watermelon.weight(7));
    }
    @Test
    void Testcase3() {
        var watermelon = new WaterMelon();
        assertFalse(watermelon.weight(2));
    }
}