public class Main {
    public static void main(String[] args) {
        bankBalance bankBalance=new bankBalance(50);

        try {
            bankBalance.withdrawal(100);
        }catch (Exception e){
            System.out.println(e);
        }
    }
//    public static void main(String[] args) {
//
//        System.out.println("Hello world!");
////        BufferedReader reader=null;
//        try {
//            System.out.println("Opening file...");
//            int result = 10 / 0; // exception
//           System.out.println("Result: " + result);}
//        catch (Exception e){
//
//            System.out.println(e );
//            System.out.println("here is wrong");
//        }
//        finally {// cleanup code (always runs)
//            System.out.println("Closing file (finally block always executes)");
//        }
//
//        System.out.println("This line will not execute if exception is not handled.");
//    }
//public static void main(String[] args) {
//
//    try {
//        FileReader fr = new FileReader("test.txt");
//        System.out.println("File opened successfully!");
//        fr.close();
//    } catch (IOException e) {
//        System.out.println("Handled Checked Exception: " + e.getMessage());
//    }
//        try {
//            FileReader fr = new FileReader("test.txt");
//            System.out.println("filed open succes");
//        } catch (IOException |RuntimeException e){
//            System.out.println(e.getMessage());
//        }
//
//
//    }

}


