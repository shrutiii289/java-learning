public class hello {
    public static void main ( String[] args) {

        int marks = 75 ;
        
        if (marks >= 90){
System.out.println("Excelelnt");
        } else if (marks >= 60){

System.out.println("good");
        } else if (marks >= 40) {

System.out.println("pass");
        } else {

System.out.println("fail") ;           
        }




        int statuscode = 404;
        
        if (statuscode==200) {
            System.out.println("request successful");
        } else if (statuscode == 404) {
            System.out.println("page not found");
        } else {
            System.out.println("unexpected response");
        }
        
        // loop 

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        for (int i=1; i<=3; i++) {
            System.out.println("Executing test case" + i
                
            );

        }

            
    }
}
