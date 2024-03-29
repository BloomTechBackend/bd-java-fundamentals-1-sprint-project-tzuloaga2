package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {
        int playerHealth = player.getHealth();
        int monsterHealth = monster.getHealth();
        int playerPower = player.getPower();
        int monsterPower = monster.getPower();


        while (playerHealth > 0 && monsterHealth > 0) {
            monsterHealth = monsterHealth - playerPower;

            if (monsterHealth <= 0) {
                monster.setHealth(0);
                return;
            }

            playerHealth = playerHealth - monsterPower;
            if (playerHealth <= 0) {
                player.setHealth(0);
                return;
            }
        }
    }



    public boolean isPlayerDefeated() {
        int playerHealth= player.getHealth();
        if (playerHealth<=0){
        return true;
        }
        else{
            return false;
        }
    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
        player.setHealth(10);
        monster.setHealth(10);

    }
}
