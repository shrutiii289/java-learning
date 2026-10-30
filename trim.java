public class trim {
    public static void main (String[] args){

        String actual = " Pass" ;
        String expected = "  pass  " ;

        System.out.println(actual.trim().equals(expected.trim()));
    }
} // trim() remove space at end and start 


