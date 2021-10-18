package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;

/**
 * A key opens a locked door. More specifically, keys work only on doors that share their level.
 * For example, if a key is level 1, it can only open doors that are also level 1.
 *
 * A key's level cannot change once the object is instantiated. You should create two constructors that allow
 * the Key to be created:
 * 1. without any inputs (i.e. default parameters)
 * 2. A level (int) and a name (string)
 *
 */

public class Key implements Tangible {

    //TODO variable for level and name needed here
    int level;
    String name;


    //TODO Add default (i.e. no params) constructor here

    public Key() {
        this.level= 1;
        this.name = "key";

    }



    //TODO add constructor that takes a level and name, and saves it

    public Key(int level) {
        this.level = level;
    }

    public Key(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        //TODO Fix this so it references the level property instead of 0
        return level;
    }

    //TODO Fix this so it references the name property instead of "key"


    @Override
    public String getName() {
        return name;
    }





    //******IGNORE THE CODE BELOW******//


    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return false;
    }

    @Override
    public void useItem(Tangible initiator) { /* intentionally left blank */ }

    @Override
    public void use() {
        System.out.println(getName() + " doesn't much be itself. Try using it on a door");
    }

    @Override
    public String getDescription() {
        return "A key that opens a door";
    }


}
