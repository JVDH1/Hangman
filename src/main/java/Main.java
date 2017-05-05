public class Main {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args){
        boolean x = false;

        //If run in visible cli args will contain parameter "a"
        for(String s : args){
            if(s.equals("a")){
                x = true;
                break;
            }
        }
        //If running in visible cli run game; else start game in new cli
        if(x){
            Play.play();
        } else {
            try {
                String file = Thread.currentThread().getContextClassLoader().getResource("Main.class").toString();
                if(file.contains("Hangman.jar")){
                    int i = file.indexOf("file:/") + 6;
                    String dir = file.substring(i, file.length() - 23);
                    Runtime.getRuntime().exec("cmd /k start cmd /k \"cd " + dir + " && java -jar Hangman.jar a\"");
                } else {
                    Play.play();
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
