import org.junit.jupiter.api.Test;

public class DagGraghTest {
    String[] node = { "A", "B", "C", "D", "E", "F", "G", "H"};
    int[] [] edge= {
        { 0, 1, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 1, 1, 0, 0, 0, 0},
        { 0, 0, 0, 0, 1, 0, 0, 0},
        { 0, 0, 0, 0, 1, 1, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 1, 0},
        { 0, 0, 0, 0, 0, 0, 0, 1},
        { 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, } };

    @Test
    void testGraht() {

    }
}

