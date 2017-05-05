import java.io.*;
import java.util.Random;

public class RandomWord {
    private static Random Random = new Random();
    private static String[] allWords = new String[4439];

    // Method to load words from file
    private static void loadFile(){
        // If allWords is empty fill it with words
        if(allWords[0] == null) {
            InputStream is;
            BufferedInputStream bis;
            DataInputStream dis;

            try {
                is = Thread.currentThread().getContextClassLoader().getResourceAsStream("\\words.txt");
                bis = new BufferedInputStream(is);
                dis = new DataInputStream(bis);

                int x = 0;
                while (dis.available() != 0) {
                    String line = dis.readLine();
                    if (!line.contains("'") && line.length() >= 4) {
                        allWords[x] = line;
                        x += 1;
                    }
                }

                // Dispose of all the resources after using them
                is.close();
                bis.close();
                dis.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Method to choose random word
    public static String getWord(){
        loadFile();
        return allWords[Random.nextInt(3798)];
    }
}