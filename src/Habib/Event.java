package Habib;

public class Event implements TeamMember{
    @Override
    public void select() {


        System.out.println("selected the event...");
    }

    private void codeCheckedIn() {
        System.out.println("code checked in");
    }

    private void codePushed(){
        System.out.println("code pushed");
    }

    private void buildCompleted(){
        System.out.println("build completed");
    }

    private void buildFail(){
        System.out.println("build failed");
    }

    private void testFailed(){
        System.out.println("Test Failed");
    }

    private void testPass(){
        System.out.println("Test Passed");
    }

    private void releaseDeployment(){
        System.out.println("Release Deployment Passed");
    }



}
