public class Show {
    // Method to show correct letters
    public static void correctLetters(boolean playerWins, String secretWord, String correctLetters){
        String res = "CORRECT: " + " ";
        if(playerWins){
            res = "CORRECT: " + " " + secretWord;
        }else{
            for (int i = 0; i < secretWord.length(); i++) {
                String x = "" + secretWord.charAt(i);
                if (correctLetters.contains(x)) {
                    res += x + " ";
                } else {
                    res += "_ ";
                }
            }
        }
        System.out.println(res.toUpperCase() + "\n");
    }

    // Method to show wrong letters
    public static void wrongLetters(String wrongLetters){
        String res = "WRONG: " + " ";
        for(int i=0; i<wrongLetters.length(); i++){
            String x = "" + wrongLetters.charAt(i);
            res += x + ", ";
        }
        System.out.println(res.substring(0, res.length()-2) + "\n");
    }
}