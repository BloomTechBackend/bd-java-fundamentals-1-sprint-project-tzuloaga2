package main.com.adventure;

import com.amazonaws.services.dynamodbv2.xspec.S;
import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandVerb;
import main.com.adventure.settings.EmptyCommandException;
import main.com.adventure.settings.InvalidCommandException;

import java.util.Scanner;



public class GameInputProcessor {


    /**
     * Starts the prompt process to the user.
     *
     * @return the response from the user.
     */

    public String prompt() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your next command: ");
        return scanner.nextLine();

    }

    /**
     * Inputs that come into this method represent single action with no object. When building the command, you'll want
     * to supply the first word as the verb and leave the objectName blank
     * @param input - the input from the user
     * @return - the Command object with the proper verb and blank object
     */
    private Command buildSimpleCommand(String input) throws InvalidCommandException, EmptyCommandException {
        String[] separate = input.split(" ");
        CommandVerb sept = CommandVerb.getVerb(separate[0]);
        return new Command(sept, "");

    }

    /**
     * Inputs that come into this method will have an object or objects that the action is acting on. You'll need to
     * include the object as part of the Command object.
     * @param input - the input from the user
     * @return - the Command object with the proper verb and object
     */
    private Command buildCommandWithObject(String input) throws EmptyCommandException, InvalidCommandException {
        String[] separate = input.split(" ");
        return new Command(CommandVerb.getVerb(separate[0]),separate[1] );
    }


    /** DO NOT CHANGE ANYTHING BELOW THIS LINE. **/

    /**
     * Gets the next command from the user.
     * @return a command object
     */
    public Command getNextCommand() {
        String input = prompt();
        try {
            return processCommand(input);
        }
        catch (InvalidCommandException problem){
            System.out.println("This is an invalid command....");
        }
        catch (EmptyCommandException problem){
            System.out.println("This is empty...");
        }

            return null;
        
    }

    private Command processCommand(String input) throws EmptyCommandException, InvalidCommandException{
        if (input.contains(Command.MOVE) ||
                input.contains(Command.USE) ||
                input.contains(Command.TAKE) ||
                input.contains(Command.EXAMINE)
        ) {
            return buildCommandWithObject(input);
        } else {
            return buildSimpleCommand(input);
        }
    }

}
