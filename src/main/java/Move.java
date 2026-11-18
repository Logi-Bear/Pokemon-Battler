public class Move {
    private String name;
    private String type;
    private double power;
    private int accuracy;
    private double stab = 1;
    private double effectiveness = 1;

    public Move(String name, String type, int power, int accuracy) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
    }

    // Getter methods for attributes

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    // Method to check if move hits
    public boolean checkHit() {
        boolean hit = true;
        int toHit = (int)(Math.random()*101);
        if(toHit>accuracy){
            hit = false;
        }
        return hit;
    }

    public void checkStab(Pokemon user){
        if(user.getType().equals(getType())){
            stab = 1.5;
        }
        else{
            stab = 1;
        }
    }
    public void checkEffectiveness(Pokemon user){
        String poketype = user.getType();
        switch (type) {
            case "Normal":
            switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 1;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = 1;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 1;
                    break;
                case "Rock":
                    effectiveness = .5;
                    break;
                case "Ghost":
                    effectiveness = 0;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Fire":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = .5;
                    break;
                case "Water":
                    effectiveness = .5;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 2;
                    break;
                case "Ice":
                    effectiveness = 2;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = 1;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 2;
                    break;
                case "Rock":
                    effectiveness = .5;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = .5;
                    break;
            }
                break;
            case "Water":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 2;
                    break;
                case "Water":
                    effectiveness = .5;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = .5;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = 2;
                    break;
                case "Flying":
                    effectiveness = 1;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 1;
                    break;
                case "Rock":
                    effectiveness = 2;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = .5;
                    break;
            }
                break;
            case "Electric":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = 2;
                    break;
                case "Electric":
                    effectiveness = .5;
                    break;
                case "Grass":
                    effectiveness = .5;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = 0;
                    break;
                case "Flying":
                    effectiveness = 2;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 1;
                    break;
                case "Rock":
                    effectiveness = 1;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = .5;
                    break;
            }
                break;
            case "Grass":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = .5;
                    break;
                case "Water":
                    effectiveness = 2;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = .5;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = .5;
                    break;
                case "Ground":
                    effectiveness = 2;
                    break;
                case "Flying":
                    effectiveness = .5;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = .5;
                    break;
                case "Rock":
                    effectiveness = 2;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = .5;
                    break;
            }
                break;
            case "Ice":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = .5;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 2;
                    break;
                case "Ice":
                    effectiveness = .5;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = 2;
                    break;
                case "Flying":
                    effectiveness = 2;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 1;
                    break;
                case "Rock":
                    effectiveness = 1;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = 2;
                    break;
            }
                break;
            case "Fighting":
                switch (poketype) {
                case "Normal":
                    effectiveness = 2;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 1;
                    break;
                case "Ice":
                    effectiveness = 2;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = .5;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = .5;
                    break;
                case "Psychic":
                    effectiveness = .5;
                    break;
                case "Bug":
                    effectiveness = .5;
                    break;
                case "Rock":
                    effectiveness = 2;
                    break;
                case "Ghost":
                    effectiveness = 0;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Poison":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 2;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = .5;
                    break;
                case "Ground":
                    effectiveness = .5;
                    break;
                case "Flying":
                    effectiveness = 1;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 2;
                    break;
                case "Rock":
                    effectiveness = .5;
                    break;
                case "Ghost":
                    effectiveness = .5;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Ground":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 2;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 2;
                    break;
                case "Grass":
                    effectiveness = .5;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = 2;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = 0;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = .5;
                    break;
                case "Rock":
                    effectiveness = 2;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Flying":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = .5;
                    break;
                case "Grass":
                    effectiveness = 2;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 2;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = 1;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 2;
                    break;
                case "Rock":
                    effectiveness = .5;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Psychic":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 1;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 2;
                    break;
                case "Poison":
                    effectiveness = 2;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = 1;
                    break;
                case "Psychic":
                    effectiveness = .5;
                    break;
                case "Bug":
                    effectiveness = 1;
                    break;
                case "Rock":
                    effectiveness = 1;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Bug":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = .5;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 2;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = .5;
                    break;
                case "Poison":
                    effectiveness = 2;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = .5;
                    break;
                case "Psychic":
                    effectiveness = 2;
                    break;
                case "Bug":
                    effectiveness = 1;
                    break;
                case "Rock":
                    effectiveness = 1;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Rock":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 2;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 1;
                    break;
                case "Ice":
                    effectiveness = 2;
                    break;
                case "Fighting":
                    effectiveness = .5;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = .5;
                    break;
                case "Flying":
                    effectiveness = 2;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 2;
                    break;
                case "Rock":
                    effectiveness = 1;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Ghost":
                switch (poketype) {
                case "Normal":
                    effectiveness = 0;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 1;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = 1;
                    break;
                case "Psychic":
                    effectiveness = 0;
                    break;
                case "Bug":
                    effectiveness = 1;
                    break;
                case "Rock":
                    effectiveness = 1;
                    break;
                case "Ghost":
                    effectiveness = 2;
                    break;
                case "Dragon":
                    effectiveness = 1;
                    break;
            }
                break;
            case "Dragon":
                switch (poketype) {
                case "Normal":
                    effectiveness = 1;
                    break;
                case "Fire":
                    effectiveness = 1;
                    break;
                case "Water":
                    effectiveness = 1;
                    break;
                case "Electric":
                    effectiveness = 1;
                    break;
                case "Grass":
                    effectiveness = 1;
                    break;
                case "Ice":
                    effectiveness = 1;
                    break;
                case "Fighting":
                    effectiveness = 1;
                    break;
                case "Poison":
                    effectiveness = 1;
                    break;
                case "Ground":
                    effectiveness = 1;
                    break;
                case "Flying":
                    effectiveness = 1;
                    break;
                case "Psychic":
                    effectiveness = 1;
                    break;
                case "Bug":
                    effectiveness = 1;
                    break;
                case "Rock":
                    effectiveness = 1;
                    break;
                case "Ghost":
                    effectiveness = 1;
                    break;
                case "Dragon":
                    effectiveness = 2;
                    break;
            }
                break;
        }

    }

    // Method to calculate damage
    public int calculateDamage(Pokemon attacker, Pokemon defender) {
        // Implement logic to calculate damage
        checkStab(attacker);
        checkEffectiveness(defender);
        if(effectiveness == 2){
            System.out.println(name + " was super effective");
        }
        else if(effectiveness == .5){
            System.out.println(name + " was not very effective");
        }
        else if(effectiveness == 0){
            System.out.println(name + " had no effect");
        }
        int damage = (int) ((double)((double)((double)(42 * (double)power) * (double)((double)attacker.getAttack() / (double)defender.getDefense())) / 50 + 2) * (double)stab * (double)effectiveness);
        return damage;
    }
}
