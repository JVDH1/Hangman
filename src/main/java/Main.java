public class Main {
    public static void main(String[] args){
        boolean x = false;

        for(String s : args){
            if(s.equals("a")){
                x = true;
                break;
            }
        }

        if(x){
            Play.play();
        } else {
            try {
                String file = Thread.currentThread().getContextClassLoader().getResource("Main.class").toString();
                String dir = file.substring(6, file.length()-11);
                Runtime.getRuntime().exec("cmd /k start cmd /k \"cd C:/Users/Johan/IdeaProjects/Hangman/target/classes && java Main a\"");
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
