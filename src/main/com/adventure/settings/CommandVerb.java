package main.com.adventure.settings;

import org.mockito.internal.matchers.Null;

import java.util.EmptyStackException;
import java.util.Locale;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {

    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes a users input and determines which verb to include in the command.
     *
     * @param verbString - the users input.
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) throws EmptyCommandException, InvalidCommandException {
        if (verbString == null) {
            throw new EmptyCommandException();
        }
        if (verbString.equals("move")) {
            return MOVE;
        } else if (verbString.equals("take")) {
            return TAKE;
        } else if (verbString.equals("use")) {
            return USE;
        } else if (verbString.equals("dig")) {
            return DIG;
        } else if (verbString.equals("examine")) {
            return EXAMINE;
        } else if (verbString.equals("look")) {
            return LOOK;
        } else if (verbString.equals("help")) {
            return HELP;
        } else if (verbString.equals("inventory")) {
            return INVENTORY;
        } else
            throw new InvalidCommandException();
    }


}



