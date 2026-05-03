import java.util.Scanner;

public class Team {

    private Pokemon[] team;
    private Pokemon currentPokemon;
    private String name;

    public Team(Pokemon[] pokemonTeam, String name) {
        this.team = pokemonTeam;
        this.currentPokemon = team[0];
        this.name = name;
    }

    public Pokemon getCurrentPokemon(){
        return currentPokemon;
    }

    public Pokemon[] getAllPokemon(){
        return team;
    }
    public Pokemon getPokemon(int index){
        return team[index];
    }

    public void switchPokemon(int index) {
        if (index >= 0 && index < team.length) {
            if(team[index].getCurHP()>0){
                currentPokemon = team[index];
                System.out.println(name + " throws in " + currentPokemon.getName());
            }
            else{
                System.out.println("That Pokemon is dead. Choose a different one");
                Scanner scanny = new Scanner(System.in);
                int newNum = scanny.nextInt();
                scanny.close();
                switchPokemon(newNum);
            }
        }
    }
}