import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PhysicsTest {
    @Test
    void Testcase1() {
        var Phy = new Physics();
        int x[] = {1, 3, -1};
        int y[] = {4, 7, -2};
        int z[] = {3, 2, -8};
        assertTrue(Phy.S(3, x, y, z));
    }

    @Test
    void Testcase2() {
        var phy = new Physics();
        int x[] = {7, 2};
        int y[] = {6, 10};
        int z[] = {-11, 9};
        assertFalse(phy.S(2, x, y, z));
    }

    @Test
    void Testcase3() {
        var phy = new Physics();
        int x[] = {0};
        int y[] = {0};
        int z[] = {0};
        assertThrows(IllegalArgumentException.class, () -> { phy.S(-7, x, y, z);});
    }

    @Test
    void Testcase4() {
        var phy = new Physics();
        int x[] = {3};
        int y[] = {3};
        int z[] = {3};
        assertThrows(IllegalArgumentException.class, () -> { phy.S(0, x, y, z);});
    }

}