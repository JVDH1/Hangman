public class Draw {
    // Method to multiply strings
    public static String repeatStr(int x, String text){
        int i;
        String res = "";
        for (i = x; i > 0; i --){
            res += text;
        }
        return res;
    }

    // Draw row 1
    private static void row1(int level) {
        if (level < 3) {
            System.out.println("\n");
        } else {
            System.out.println(" " + repeatStr(24, "_") + "\n"
                    + "|" + repeatStr(24, "_") + "|");
        }
    }

    // Draw row 2
    private static void row2(int level){
        String x1 = "| |   / /";
        String x2 = "| |  / /";
        String x3 = "| | / /";

        if (level == 0) {
            System.out.println("\n\n");
        } else if (level == 1) {
            System.out.println(repeatStr(2, "| |\n") + "| |");
        } else if (level == 2 | level == 3) {
            System.out.println(x1 + "\n"
                    + x2 + "\n"
                    + x3);
        } else if (level == 4) {
            System.out.println(x1 + repeatStr(16," ") + "|\n"
                    + x2 + repeatStr(17," ")
                    + "|\n" + x3 + repeatStr(18, " ") + "|");
        } else {
            System.out.println(x1 + repeatStr(16, " ") + "|\n"
                    + x2 + repeatStr(17, " ") + "|\n"
                    + x3 + repeatStr(17, " ") + "_|_");
        }
    }

    // Draw row 3
    private static void row3(int level){
        String x1 = "| |/ /";
        String x2 = "| | /";

        if(level == 0) {
            System.out.println("\n");
        }else if(level == 1) {
            System.out.println("| |\n" +
                    "| |");
        }else if(level >= 2 && level <= 4) {
            System.out.println(x1 + "\n" +
                    x2);
        }else if(level >= 5 && level < 10) {
            System.out.println(x1 + repeatStr(17, " ") + "|0 0|\n" +
                    x2 + repeatStr(18, " ") + "|___|");
        }else {
            System.out.println(x1 + repeatStr(17, " ") + "|x x|\n" +
                    x2 + repeatStr(18, " ") + "|___|");
        }
    }

    // Draw row 4
    private static void row4(int level){
        String x1 = "| |/";
        String x2 = "| |";
        String x3 = "_|_\n";
        String x4 = "| |\n";
        String x5 = "|_|";

        if(level == 0) {
            System.out.println("\n\n\n");
        }else if(level == 1) {
            System.out.println(repeatStr(3, "| |\n")
                    + x2);
        }else if(level >= 2 && level < 6) {
            System.out.println(x1 + "\n"
                    + repeatStr(2, x4)
                    + x2);
        }else if (level == 6) {
            System.out.println(x1 + repeatStr(20, " ")
                    + x3
                    + x2 + repeatStr(21, " ") + x4
                    + x2 + repeatStr(21, " ") + x4
                    + x2 + repeatStr(21, " ") + x5);
        }else if(level == 7) {
            System.out.println(x1 + repeatStr(20, " ") + x3
                    + x2 + repeatStr(20, " ")
                    + "/" + x4
                    + x2 + repeatStr(19, " ")
                    + "/ " + x4
                    + x2 + repeatStr(21, " ") + x5);
        }else {
            System.out.println(x1 + repeatStr(20, " ") + x3 +
                    x2 + repeatStr(20, " ") + "/| |\\ \n"
                    + x2 + repeatStr(19, " ") + "/ | | \\ \n"
                    + x2 + repeatStr(21, " ") + x5);
        }
    }

    // Draw row 5
    private static void row5(int level){
        if(level == 0) {
            System.out.println("\n");
        }else if(level >= 1 && level < 9) {
            System.out.println("| |\n"
                    + "| |");
        }else if(level == 9) {
            System.out.println("| |" + repeatStr(20, " ") + "/\n" +
                    "| |" + repeatStr(19, " ") + "/");
        }else {
            System.out.println("| |" + repeatStr(20, " ") + "/   \\ \n" +
                    "| |" + repeatStr(19, " ") + "/     \\ ");
        }
    }

    // Draw row 6
    private static void row6(int level){
        String x1 = repeatStr(26, " ") + "|\n";
        String x2 = repeatStr(26, "_");

        if(level == 0) {
            System.out.println(repeatStr(4, "\n")
                    + "   " + x2 + "\n"
                    + "  |" + x1
                    + "  |" + x1
                    + "  |" + x2 + "|\n");
        }else {
            System.out.println(repeatStr(4, "| |\n")
                    + "| |" + x2 + "\n"
                    + "| |" + x1
                    + "| |" + x1
                    + "|_|" + x2 + "|\n");
        }
    }

    public static void figure(int level){
        row1(level);
        row2(level);
        row3(level);
        row4(level);
        row5(level);
        row6(level);
    }
}