public class MoveList {
    private static Move[] moves;

    public MoveList(){
        moves = new Move[] {
        new Move("Body Slam", "Normal", 85, 100),
        new Move("Constrict", "Normal", 50, 100),
        new Move("Cut", "Normal", 50, 95),
        new Move("Guillotine", "Normal", 99999, 15),
        new Move("Headbutt", "Normal", 70, 100),
        new Move("Hyper Beam", "Normal", 150, 90),
        new Move("Hyper Fang", "Normal", 80, 90),
        new Move("Mega Kick", "Normal", 120, 75),
        new Move("Mega Punch", "Normal", 80, 85),
        new Move("Pound", "Normal", 40, 100),
        new Move("Scratch", "Normal", 40, 100),
        new Move("Slam", "Normal", 80, 75),
        new Move("Slash", "Normal", 70, 100),
        new Move("Stomp", "Normal", 65, 100),
        new Move("Swift", "Normal", 60, 999),
        new Move("Tackle", "Normal", 40, 100),

        new Move("Ember", "Fire", 40, 100),
        new Move("Fire Blast", "Fire", 110, 85),
        new Move("Fire Punch", "Fire", 75, 100),
        new Move("Flamethrower", "Fire", 90, 100),
        new Move("Inferno", "Fire", 100, 50),

        new Move("Bubble", "Water", 40, 100),
        new Move("Bubble Beam", "Water", 65, 100),
        new Move("Crab Hammer", "Water", 150, 90),
        new Move("Hydro Pump", "Water", 110, 80),
        new Move("Surf", "Water", 90, 100),
        new Move("Water Gun", "Water", 40, 100),
        new Move("Waterfall", "Water", 80, 100),

        new Move("Thunder", "Electric", 110, 70),
        new Move("Thunder Punch", "Electric", 75, 100),
        new Move("Thunder Shock", "Electric", 40, 100),
        new Move("Thunder Bolt", "Electric", 40, 100),

        new Move("Razor Leaf", "Grass", 85, 95),
        new Move("Vine Whip", "Grass", 45, 90),

        new Move("Aurora Beam", "Ice", 65, 100),
        new Move("Blizzard", "Ice", 110, 70),
        new Move("Ice Beam", "Ice", 90, 100),
        new Move("Ice Punch", "Ice", 75, 100),

        new Move("Karate Chop", "Fighting", 75, 100),
        new Move("Rolling Kick", "Fighting", 60, 85),

        new Move("Acid", "Poison", 40, 100),
        new Move("Poison Sting", "Poison", 60, 100),
        new Move("Sludge", "Poison", 65, 100),

        new Move("Bone Club", "Ground", 65, 85),
        new Move("Earthquake", "Ground", 100, 85),

        new Move("Drill Peck", "Flying", 80, 100),
        new Move("Gust", "Flying", 90, 95),
        new Move("Peck", "Flying", 35, 100),
        new Move("Wing Attack", "Flying", 60, 100),

        new Move("Psybeam", "Psychic", 65, 100),
        new Move("Psychic", "Psychic", 90, 100),

        new Move("Leech Life", "Bug", 80, 100),
        new Move("Pin Missile", "Bug", 75, 85),

        new Move("Rock Slide", "Rock", 75, 90),
        new Move("Rock Throw", "Rock", 50, 90),

        new Move("Lick", "Ghost", 30, 100),
        new Move("Night Shade", "Ghost", 100, 100),
        new Move("Shadow Punch", "Ghost", 60, 1000),
        new Move("Hex", "Ghost", 65, 100),

        new Move("Dragon Claw", "Dragon", 80, 100),
        new Move("Dragon Rage", "Dragon", 60, 100),


        new Move("Future Sight", "Psychic", 120, 100),//61
        new Move("Giga Impact", "Normal", 150, 90),//62
        new Move("Belch", "Poison", 120, 90),//63
        new Move("Fell Stinger", "Bug", 50, 100),//64
        new Move("Poison Jab", "Poison", 80, 100),//65
        new Move("Bug Bite", "Bug", 60, 100),//66
        new Move("Hurricane", "Flying", 110, 70),//67
        new Move("Gunk Shot", "Poison", 120, 80),//68
        new Move("Superpower", "Fighting", 120, 100),//69
        new Move("Sludge Wave", "Poison", 95, 100),//70
        new Move("Mega Horn", "Bug", 120, 85),//71
        new Move("Extrasensory", "Psychic", 80, 100),//72
        new Move("Hyper Voice", "Normal", 90, 100),//73
        new Move("Outrage", "Dragon", 120, 100),//74
        new Move("Cross Chop", "Fighting", 130, 80),//75
        new Move("Zap Cannon", "Electric", 120, 50),//76
        new Move("Stone Edge", "Rock", 100, 80),//77
        };
    }
    public Move[] getAllMoves() {
        return moves;
    }
    public static Move getMove(int i){
        return moves[i];
    }
}
