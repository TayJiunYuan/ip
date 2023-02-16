package tasks;

public class Deadline extends Task {

    protected String by;

    public Deadline(String description, String by){
        super(description);
        this.by = by;
    }

    @Override
    public String printTask(){
        return "[D] " + super.printTask() + " (by: "+ by + ")";
    }

    public String encode(){
        String encodedString = "deadline" + "/" + super.encode() + "/" + by;  
        return encodedString;
    }
}


