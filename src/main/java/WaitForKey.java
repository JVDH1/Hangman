public class WaitForKey {
    public static void pressKey(String message){
        System.out.println(message);
        System.out.println("Press enter to continue...");
        try{
            System.in.read();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
