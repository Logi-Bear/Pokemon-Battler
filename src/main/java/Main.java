import java.util.Scanner;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        // Create an instance of the Pokedex
        boolean gameState = true;
        Scanner scanny = new Scanner(System.in);
        new MoveList();
        Pokedex pokedex = new Pokedex();
        
        
        //Move[] allMoves = moveList.getAllMoves();
        Pokemon[] allPokemon = pokedex.getAllPokemon();
        int[] pickedPokemon = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        
        Pokemon[] t1 = {allPokemon[1], allPokemon[1], allPokemon[1], allPokemon[1], allPokemon[1], allPokemon[1]}; //enter team of Pokemon
        Pokemon[] t2 = {allPokemon[1], allPokemon[1], allPokemon[1], allPokemon[1], allPokemon[1], allPokemon[1]}; //enter team 2 of Pokemon
        for (int i = 0; i < allPokemon.length; i++) {
            System.out.println((i + 1) + " " + allPokemon[i].getName());
        }
        //for (int i = 0; i < allMoves.length; i++) {                   //uncomment to see list of all moves
        //    System.out.println(i + " " + allMoves[i].getName());
        //}
        for(int i = 0; i < 6; i++){
            System.out.println("Player 1 enter your next Pokemon");
            int pokeIndex = scanny.nextInt();
            for(int o = 0; o < pickedPokemon.length; o++){
                if(pokeIndex == pickedPokemon[o]){
                    System.out.println(allPokemon[pokeIndex - 1].getName() + " has already been chosen. Choose a different Pokemon.");
                    pokeIndex = scanny.nextInt();
                    o--;
                }
            }
            while(pokeIndex <= 0 || pokeIndex > allPokemon.length){
                System.out.println("That isn't a Pokemon. Try again.");
                pokeIndex = scanny.nextInt();
                for(int o = 0; o < pickedPokemon.length; o++){
                    if(pokeIndex == pickedPokemon[o]){
                        System.out.println(allPokemon[pokeIndex - 1].getName() + " has already been chosen. Choose a different Pokemon.");
                        pokeIndex = scanny.nextInt();
                        o--;
                    }
                }
            }
            t1[i] = allPokemon[(pokeIndex - 1)];
            pickedPokemon[i] = pokeIndex;
            System.out.println("You chose " + t1[i].getName());
            System.out.println();
        }
        clearTerminal();
        System.out.println("Player 1's Team:");
        for(Pokemon pokemon : t1){
            System.out.println(pokemon.getName());
        }
        Thread.sleep(5000);
        clearTerminal();
        for (int i = 0; i < allPokemon.length; i++) {
            System.out.println(i + 1 + " " + allPokemon[i].getName());
        }
        for(int i = 0; i < 6; i++){
            System.out.println("Player 2 enter your next Pokemon");
            int pokeIndex = scanny.nextInt();
            for(int o = 0; o < pickedPokemon.length; o++){
                if(pokeIndex == pickedPokemon[o]){
                    System.out.println(allPokemon[pokeIndex - 1].getName() + " has already been chosen. Choose a different Pokemon.");
                    pokeIndex = scanny.nextInt();
                    o--;
                }
            }
            while(pokeIndex <= 0 || pokeIndex > allPokemon.length){
                System.out.println("That isn't a Pokemon. Try again.");
                pokeIndex = scanny.nextInt();
                for(int o = 0; o < pickedPokemon.length; o++){
                    if(pokeIndex == pickedPokemon[o]){
                        System.out.println(allPokemon[pokeIndex - 1].getName() + " has already been chosen. Choose a different Pokemon.");
                        pokeIndex = scanny.nextInt();
                        o--;
                    }
                }
                }
            t2[i] = allPokemon[(pokeIndex - 1)];
            System.out.println("You chose " + t2[i].getName());
            System.out.println();
        }
        clearTerminal();
        System.out.println("Player 1's Team:");
        for(Pokemon pokemon : t1){
            System.out.println(pokemon.getName());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Player 2's Team:");
        for(Pokemon pokemon : t2){
            System.out.println(pokemon.getName());
        }
        Thread.sleep(5000);

        Team team1 = new Team(t1, "Player One");
        Team team2 = new Team(t2, "Player Two");
        clearTerminal();
        System.out.println("Player 1 throws in " + team1.getCurrentPokemon().getName());
        System.out.println("Player 2 throws in " + team2.getCurrentPokemon().getName());
        System.out.println();
        while (gameState) {
            int p1ChosenPokemon = 0;
            int p1ChosenMove = 0;
            int p2ChosenPokemon = 0;
            int p2ChosenMove = 0;
            boolean p1IsFaster = team1.getCurrentPokemon().getSpeed() > team2.getCurrentPokemon().getSpeed();
            printHP(team1, team2);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Player 1, what do you want to do?");
            System.out.println("1: Attack  |   2: Switch Pokemon");
            int p1Choice = scanny.nextInt();
            if(p1Choice == 1){
                clearTerminal();
                System.out.println("Choose a move:");
                printMoves(team1.getCurrentPokemon());
                p1ChosenMove = scanny.nextInt() - 1;
            }
            if(p1Choice == 2){
                clearTerminal();
                System.out.println("Choose a Pokemon");
                printTeam(team1);
                p1ChosenPokemon = scanny.nextInt() - 1;
                while(team1.getPokemon(p1ChosenPokemon) == team1.getCurrentPokemon()){
                clearTerminal();
                System.out.println(team1.getCurrentPokemon().getName() + " is already in. Choose a different one.");
                printTeam(team1);
                p1ChosenPokemon = scanny.nextInt() - 1;
                }
            }
            clearTerminal();
            System.out.println("Player 2, what do you want to do?");
            System.out.println("1: Attack  |   2: Switch Pokemon");
            int p2Choice = scanny.nextInt();
            if(p2Choice == 1){
                clearTerminal();
                System.out.println("Choose a move:");
                printMoves(team2.getCurrentPokemon());
                p2ChosenMove = scanny.nextInt() - 1;
            }
            if(p2Choice == 2){
                clearTerminal();
                System.out.println("Choose a Pokemon");
                printTeam(team2);
                p2ChosenPokemon = scanny.nextInt() - 1;
                while(team2.getPokemon(p2ChosenPokemon) == team2.getCurrentPokemon()){
                    clearTerminal();
                    System.out.println(team2.getCurrentPokemon().getName() + " is already in. Choose a different one.");
                    printTeam(team2);
                    p2ChosenPokemon = scanny.nextInt() - 1;
                    }
            }
            clearTerminal();
            if(p1IsFaster){
                if(p1Choice == 2){
                    team1.switchPokemon(p1ChosenPokemon);
                }
                if(p2Choice == 2){
                    team2.switchPokemon(p2ChosenPokemon);
                }
                if(p1Choice == 1){
                    performMove(team1.getCurrentPokemon(), team2.getCurrentPokemon(), p1ChosenMove);
                    if(team2.getCurrentPokemon().getCurHP() <= 0){
                        System.out.println(team2.getCurrentPokemon().getName() + " has died");
                        System.out.println("Player 2, choose a new Pokemon");
                        printTeam(team2);
                        int nextPokemon = scanny.nextInt() - 1;
                        clearTerminal();
                        team2.switchPokemon(nextPokemon);
                    }
                    else if(p2Choice == 1){
                        performMove(team2.getCurrentPokemon(), team1.getCurrentPokemon(), p2ChosenMove);
                        if(team1.getCurrentPokemon().getCurHP() <= 0){
                            System.out.println(team1.getCurrentPokemon().getName() + " has died");
                            System.out.println("Player 1, choose a new Pokemon");
                            printTeam(team1);
                            int nextPokemon = scanny.nextInt() - 1;
                            clearTerminal();
                            team1.switchPokemon(nextPokemon);
                        }
                    }
                    printHP(team1, team2);
                }
            }
            if(!p1IsFaster){
                if(p2Choice == 2){
                    team2.switchPokemon(p2ChosenPokemon);
                }
                if(p1Choice == 2){
                    team1.switchPokemon(p1ChosenPokemon);
                }
                if(p2Choice == 1){
                    performMove(team2.getCurrentPokemon(), team1.getCurrentPokemon(), p2ChosenMove);
                    if(team1.getCurrentPokemon().getCurHP() <= 0){
                        System.out.println(team1.getCurrentPokemon().getName() + " has died");
                        System.out.println("Player 1, choose a new Pokemon");
                        printTeam(team1);
                        int nextPokemon = scanny.nextInt() - 1;
                        clearTerminal();
                        team1.switchPokemon(nextPokemon);
                    }
                    else if(p1Choice == 1){
                        performMove(team1.getCurrentPokemon(), team2.getCurrentPokemon(), p1ChosenMove);
                        if(team2.getCurrentPokemon().getCurHP() <= 0){
                            System.out.println(team2.getCurrentPokemon().getName() + " has died");
                            System.out.println("Player 2, choose a new Pokemon");
                            printTeam(team2);
                            int nextPokemon = scanny.nextInt() - 1;
                            clearTerminal();
                            team2.switchPokemon(nextPokemon);
                        }
                    }
                    printHP(team1, team2);
                }
                
            }
            Thread.sleep(8000);
            clearTerminal();
        }
        scanny.close();
    }
    public static void printHP(Team team1, Team team2){
        System.out.println(team1.getCurrentPokemon().getName() + "'s HP: " + team1.getCurrentPokemon().getCurHP() + " / " + team1.getCurrentPokemon().getHP());    
        System.out.println(team2.getCurrentPokemon().getName() + "'s HP: " + team2.getCurrentPokemon().getCurHP() + " / " + team2.getCurrentPokemon().getHP());
    }
    public static void printMoves(Pokemon pokemon){
        for(int i = 0; i < pokemon.getMoves().length; i++){
            System.out.println((i + 1) + " " + pokemon.getMoveName(i));
        }
    }
    public static void printTeam(Team t1){
            for(int i = 0; i < t1.getAllPokemon().length; i++){
                System.out.println(i + 1 + " " + t1.getPokemon(i).getName() + "  (" + t1.getPokemon(i).getCurHP() + "/" + t1.getPokemon(i).getHP() + ")");
            }
    }
    public static void performMove(Pokemon user, Pokemon target, int move){
        if(user.getMove(move).checkHit()){
            System.out.println(user.getName() + " uses " + user.getMoveName(move));
            int damage = user.getMove(move).calculateDamage(user, target);
            target.takeDamage(damage);
            System.out.println(target.getName() + " takes " + damage + " damage");
            if(target.getCurHP() < 0){
                target.setCurHP(0);
            }
        }
        else{
            System.out.println(user.getName() + " uses " + user.getMoveName(move));
            System.out.println(user.getMoveName(move) + " misses");
        }
        System.out.println();
    }
    public static void clearTerminal(){
        for(int i = 0; i < 100; i++){
            System.out.println();
        }
    }
}
