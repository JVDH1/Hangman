public class Play {
    public static void play(){
        boolean running = true;
        boolean playerWins = false;
        String secretWord = RandomWord.getWord();
        String correctLetters = "";
        String wrongLetters = "";
        int level = 0;
        String input;

        // Main game loop
        while(running){
            // Print new lines to clear screen
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            // Check if players wins or looses
            if(playerWins){
                Draw.figure(level);
                Show.correctLetters(playerWins, secretWord, correctLetters);
                Show.wrongLetters(wrongLetters);
                System.out.println("===========YOU WIN!===========");
                running = false;
            } else if(level == 10){
                Draw.figure(level);
                System.out.println("==========YOU LOOSE!==========");
                System.out.println("The word was: " + secretWord.toUpperCase());
                running = false;

            // Main game logic
            }else{
                Draw.figure(level);
                Show.correctLetters(playerWins, secretWord, correctLetters);
                Show.wrongLetters(wrongLetters);
                input = Guess.guessLetter();

                // Check the input if player guessed whole word
                if (input.length() > 1) {
                    if (input.equals(secretWord)) {
                        correctLetters = secretWord;
                        playerWins = true;
                    } else {
                        level += 1;
                        WaitForKey.pressKey("That is wrong!");
                    }

                // Check the input if player guessed single letter
                }else{
                    String x;
                    boolean correct = false;
                    for (int i = 0; i < secretWord.length(); i++) {
                        x = "" + secretWord.charAt(i);
                        if (input.equals(x)) {
                            correct = true;
                            break;
                        }
                    }
                    if (correct) {
                        correctLetters += input;
                        // Check if player has guessed all letters
                        String y;
                        int numCorrect = 0;
                        for (int i = 0; i < secretWord.length(); i++) {
                            y = "" + secretWord.charAt(i);
                            if (correctLetters.contains(y)) {
                                numCorrect += 1;
                            }
                        }
                        if(secretWord.length() == numCorrect){
                            playerWins = true;
                        }
                        WaitForKey.pressKey("That is correct!");
                    } else {
                        if(!wrongLetters.contains(input)){
                            wrongLetters += input;
                        }
                        level += 1;
                        WaitForKey.pressKey("That is wrong!");
                    }
                }
            }
        }
    }
}