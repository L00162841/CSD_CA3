package Habib;

public class Main {
    public static void main(String[] args) {
        Selection selection = new Selection();

        //get an object of Register and call its selection method.
        TeamMember teamMember1 = selection.getSelection("Register");

        //call select method of Register
        teamMember1.select();

        //get an object of Unregister and call its selection method.
        TeamMember teamMember2 = selection.getSelection("Unregister");

        //call select method of Unregister
        teamMember2.select();

        //get an object of Branch and call its selection method.
        TeamMember teamMember3 = selection.getSelection("Branch");

        //call select method of Branch
        teamMember3.select();

        //get an object of Event and call its selection method.
        TeamMember teamMember4 = selection.getSelection("Event");

        //call select method of Event
        teamMember4.select();

        //get an object of Repos and call its selection method.
        TeamMember teamMember5 = selection.getSelection("Repos");

        //call select method of Repository
        teamMember5.select();

    }
}
