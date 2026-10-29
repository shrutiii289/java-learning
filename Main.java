public class Main {
    public static void  main (String[] args ) {
        int passedTests = 10;
        int failedTest = 5 ;
        int totalTest = passedTests + failedTest ;
        
        System.out.println(totalTest);


        int expectedStatusCode = 200;
        int actualstatuscode = 200;


        System.out.println(expectedStatusCode == actualstatuscode);


        int p = 15;
        int q = 3;

        System.out.println(p%q);

        int marks = 75;
        if (marks >= 90) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }


        boolean usernamecorrect = true ;
        boolean passwordcorrect = true;

        if (usernamecorrect && passwordcorrect){
            System.out.println("login successful");
        } else {
            System.out.println("login failed");
        }


        int age = 19;
        if (age >=18){
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        
    }
}
