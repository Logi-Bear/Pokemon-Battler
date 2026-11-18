import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoveTest {

    // Base case used below: power 40, attack 100, defense 50
    //   (42 * 40 * 100/50) / 50 + 2 = 69.2, then multiplied by STAB and effectiveness.

    private static Pokemon pokemon(String type, int attack, int defense) {
        Move filler = new Move("Filler", "Normal", 1, 100);
        return new Pokemon("Test", type, filler, filler, filler, filler, 100, attack, defense, 50);
    }

    @Test
    void gettersReturnConstructorValues() {
        Move move = new Move("Tackle", "Normal", 40, 100);

        assertEquals("Tackle", move.getName());
        assertEquals("Normal", move.getType());
        assertEquals(40.0, move.getPower());
        assertEquals(100, move.getAccuracy());
    }

    @Test
    void sameTypeAttackGetsStabBonus() {
        Move move = new Move("Tackle", "Normal", 40, 100);
        Pokemon attacker = pokemon("Normal", 100, 50);
        Pokemon defender = pokemon("Normal", 50, 50);

        // 69.2 * 1.5 (STAB) * 1 = 103.8 -> 103
        assertEquals(103, move.calculateDamage(attacker, defender));
    }

    @Test
    void differentTypeAttackHasNoStab() {
        Move move = new Move("Tackle", "Normal", 40, 100);
        Pokemon attacker = pokemon("Fire", 100, 50);
        Pokemon defender = pokemon("Normal", 50, 50);

        // 69.2 * 1 * 1 = 69.2 -> 69
        assertEquals(69, move.calculateDamage(attacker, defender));
    }

    @Test
    void superEffectiveMoveDoublesDamage() {
        Move move = new Move("Water Gun", "Water", 40, 100);
        Pokemon attacker = pokemon("Water", 100, 50);
        Pokemon defender = pokemon("Fire", 50, 50);

        // 69.2 * 1.5 (STAB) * 2 (Water vs Fire) = 207.6 -> 207
        assertEquals(207, move.calculateDamage(attacker, defender));
    }

    @Test
    void notVeryEffectiveMoveHalvesDamage() {
        Move move = new Move("Water Gun", "Water", 40, 100);
        Pokemon attacker = pokemon("Fire", 100, 50);
        Pokemon defender = pokemon("Grass", 50, 50);

        // 69.2 * 1 * 0.5 (Water vs Grass) = 34.6 -> 34
        assertEquals(34, move.calculateDamage(attacker, defender));
    }

    @Test
    void hundredPercentAccuracyAlwaysHits() {
        Move move = new Move("Tackle", "Normal", 40, 100);

        for (int i = 0; i < 1000; i++) {
            assertTrue(move.checkHit());
        }
    }
}
