import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveTest {

    @Test
    void gettersReturnConstructorValues() {
        Move move = new Move("Tackle", "Normal", 40, 100);

        assertEquals("Tackle", move.getName());
        assertEquals("Normal", move.getType());
        assertEquals(40.0, move.getPower());
        assertEquals(100, move.getAccuracy());
    }
}
