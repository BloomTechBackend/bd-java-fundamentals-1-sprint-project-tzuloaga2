package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;
import main.com.adventure.world.objects.doors.OmniDoor;

import java.util.Arrays;

public class OmniKey implements Tangible {

    private static final int pinLength = 5;
    public boolean[] pins = new boolean[pinLength];
    public boolean bound;

    /**
     * A key that can be used with the OmniDoor.
     */
    public OmniKey() {
        Arrays.fill(pins, false);
    }

    /**
     * The only item the OmniKey can be used with is an OmniDoor. When the OmniKey receives an OmniDoor, the OmniKey
     * will automatically configure itself to the OmniDoor, making the OmniKey become a valid key for the door.
     * Note that this does NOT open the door; it merely configures the key so it can open the door.
     * @param door - If it's an OmniDoor, this key will configure itself to it. Otherwise, inform the user
     *             that this key can only be used with OmniDoors and do nothing more.
     */
    @Override
    public void useItem(Tangible door) {
        if (door instanceof OmniDoor) {
            if (bound){
                ((OmniDoor) door).unlock(this);
            }
            else{
                ((OmniDoor) door).bindKey(this);
            }
        }
        else{
            System.out.println("Key can only be used on an OmniDoor");
        }
    }

    @Override
    public String getName() {
        return "OmniKey";
    }

    @Override
    public String getDescription() {
        return "A key with adjustable pins for teeth";
    }

    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return item instanceof OmniDoor;
    }

    @Override
    public void use() {

    }
}
