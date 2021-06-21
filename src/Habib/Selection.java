package Habib;

public class Selection {
    public TeamMember getSelection(String selectionType){
        if(selectionType == null){
            return null;
        }
        if(selectionType.equalsIgnoreCase("Register")){
            return new Register();
        }else if(selectionType.equalsIgnoreCase("Unregister")){
            return new Unregister();
        }else if(selectionType.equalsIgnoreCase("Branch")){
            return new Branch();
        }else if(selectionType.equalsIgnoreCase("Event")){
            return new Event();
        }else if(selectionType.equalsIgnoreCase("Repos")){
            return new Repos();
        }
        return null;
    }
}
