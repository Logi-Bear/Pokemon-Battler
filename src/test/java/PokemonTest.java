import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class PokemonTest {

    private static Pokemon newPokemon() {
        Move tackle = new Move("Tackle", "Normal", 40, 100);
        Move scratch = new Move("Scratch", "Normal", 40, 100);
        return new Pokemon("Rattata", "Normal", tackle, scratch, tackle, scratch, 80, 56, 35, 72);
    }

    @Test
    void startsAtFullHealth() {
        Pokemon pokemon = newPokemon();

        assertEquals(80, pokemon.getHP());
        assertEquals(80, pokemon.getCurHP());
    }

    @Test
    void takeDamageLowersCurrentHpButNotMaxHp() {
        Pokemon pokemon = newPokemon();

        pokemon.takeDamage(30);

        assertEquals(50, pokemon.getCurHP());
        assertEquals(80, pokemon.getHP());
    }

    @Test
    void statsAndMovesMatchConstructorArguments() {
        Pokemon pokemon = newPokemon();

        assertEquals("Rattata", pokemon.getName());
        assertEquals("Normal", pokemon.getType());
        assertEquals(56, pokemon.getAttack());
        assertEquals(35, pokemon.getDefense());
        assertEquals(72, pokemon.getSpeed());
        assertEquals("Tackle", pokemon.getMoveName(0));
        assertSame(pokemon.getMoves()[1], pokemon.getMove(1));
    }
}
