public class Pokemon{
String name;
String type1;
Move[] moveList = new Move[4];
int hp;
int curHP;
int attack;
int defense;
int speed;
public Pokemon(String name, String type, Move move1, Move move2, Move move3, Move move4, int hp, int attack, int defense, int speed){
    setName(name);
    setType(type);
    setMoves(move1, move2, move3, move4);
    setStats(hp, attack, defense, speed);
    curHP = hp;
}
public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public void setType(String type){
    type1 = type;
}
public String getType(){
    return type1;
}
public void setMoves(Move move1, Move move2, Move move3, Move move4){
    moveList[0] = move1;
    moveList[1] = move2;
    moveList[2] = move3;
    moveList[3] = move4;
}
public Move getMove(int index){
    return moveList[index];
}
public String getMoveName(int index){
    return moveList[index].getName();
}
public Move[] getMoves(){
    return moveList;
}
public void setStats(int hp, int attack, int defense, int speed){
    this.hp = hp;
    this.attack = attack;
    this.defense = defense;
    this.speed = speed;
}
public int getHP(){
    return hp;
}
public int getCurHP(){
    return curHP;
}
public void setCurHP(int hp){
    this.curHP = hp;
}
public int getAttack(){
    return attack;
}
public int getDefense(){
    return defense;
}
public int getSpeed(){
    return speed;
}

public void takeDamage(int damage){
    curHP -= damage;
}
}