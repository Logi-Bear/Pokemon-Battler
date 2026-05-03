# Pokémon Battler

A turn-based, two-player Pokémon battle game built in Java (the first game I've ever made), created as my AP Computer Science final project in the spring of 2024.

## About

This is a command-line Pokémon battle simulator where two players go head-to-head. Each player drafts a team of 6 Pokémon from my Pokédex, then battles turn by turn until one team runs out of Pokémon. It was my first attempt at building a full game loop with real game logic, and I'm pretty proud of how it came out for a first project.

## How to Play

**Requirements:**
- Java (JDK 8 or higher)
- [VS Code](https://code.visualstudio.com/) with the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

**Running the game:**
1. Clone or download the repository
2. Open the project folder in VS Code
3. Open `Main.java` and click **Run** (or press `F5`)

## Gameplay

### Team Draft
- The full Pokédex is displayed in the terminal
- Player 1 picks 6 Pokémon by entering their number in the pokedex
- The screen clears and Player 2 does the same

### Battle
Each turn, both players secretly choose an action:
- **Attack** - pick one of your active Pokémon's 4 moves
- **Switch** - swap your active Pokémon for another on your team

Faster Pokémon always go first. When a Pokémon faints, its trainer must immediately send in a new one. The game ends when one player has no Pokémon left standing.

### Damage Formula
Damage is calculated using a formula inspired by the main series games, factoring in:
- Move power
- Attacker's Attack vs. Defender's Defense
- **STAB** (Same Type Attack Bonus) - a boost when a move matches the user's type
- **Type effectiveness** - super effective (2×), not very effective (0.5×), or no effect (0×)

## Project Structure

| Class | Description |
|---|---|
| `Main` | Game loop - handles team drafting, turn order, move execution, and win conditions |
| `Pokemon` | Stores stats (HP, Attack, Defense, Speed, Type) and a moveset of up to 4 moves |
| `Team` | Holds a player's roster of 6 Pokémon and tracks the active one |
| `Move` | Handles move data, hit/miss calculation, type effectiveness, and damage |
| `Pokedex` | Registry of all available Pokémon |
| `MoveList` | Registry of all available moves |

## Highlights & Honest Retrospective

- Type effectiveness is handled by a 740-line nested switch statement. It works. I don't recommend reading it.
- Speed ties aren't broken randomly. Player 1 always goes first at equal speed. A future fix would be a coin flip.
- This was the first time I built something that felt like a real, complete program. Looking back at it now, it's a little rough around the edges, but it does exactly what it's supposed to do.

## What I Learned

- Designing interconnected classes (Pokemon, Move, Team) and thinking about object relationships
- Building a stateful game loop in a terminal environment
- Game logic like turn order, type matchups, and damage calculations
- Input validation and handling edge cases (duplicate picks, fainted Pokémon, etc.)

---

*AP Computer Science Final Project - Spring 2024*
