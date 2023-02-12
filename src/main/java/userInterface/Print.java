package userInterface;

public class Print {
    public static void printLine(){
        String horizontalLine = "\t――――――――――――――――――――――――――――――――――――――――――";
        System.out.println(horizontalLine);
    }
    
    public static void printWelcome(){
        printLine();
        System.out.println("\tWell hello there!\n" +
                           "\tWhat can I do for you today?");
        printLine();
    }

    public static void printGoodbye(){
        printLine();
        System.out.println("\tThank you! See you again soon :)");
        printLine();
    }

    public static void printTaskDescription(String description){
        printLine();
        System.out.println("\tadded: " + description);
        printLine(); 
    }
}