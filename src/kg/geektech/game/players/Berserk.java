package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero{

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int returnDamage = RPG_Game.random.nextBoolean() ? 25 : 30;
        for (int i = 0; i < heroes.length; i++) {
            if ( >= 0 && heroes[i] = this) {
                    heroes[i].setHealth(heroes[i].getHealth() - (boss.getDamage() - returnDamage));
                    System.out.println("Берсерк поглотил половину урона Босса");
            }
        }
    }
}
