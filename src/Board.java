public class Board   {
    int mistake;
    public Board(int mistake) {
        this.mistake = mistake;
    }
    public void board(int mistake) {
        switch (mistake) {
            case 0:
                System.out.println("            ");
                break;
            case 1:
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("/ \\        ");
                break;
            case 2:
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("            ");
                System.out.println("/ \\       ");

                break;
            case 3:
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");
                break;
            case 4:
                System.out.println(" |---------  ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");


                break;
            case 5:
                System.out.println(" |---------  ");
                System.out.println(" |        |  ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");

                break;
            case 6:
                System.out.println(" |---------  ");
                System.out.println(" |        |  ");
                System.out.println(" |        O  ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");
                break;
            case 7:
                System.out.println(" |---------  ");
                System.out.println(" |        |  ");
                System.out.println(" |        O  ");
                System.out.println(" |        |  ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");
                break;
            case 8:
                System.out.println(" |---------  ");
                System.out.println(" |        |  ");
                System.out.println(" |        O  ");
                System.out.println(" |       /|");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");
                break;
            case 9:
                System.out.println(" |---------  ");
                System.out.println(" |        |  ");
                System.out.println(" |        O  ");
                System.out.println(" |       /|\\");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");
                break;
            case 10:
                System.out.println(" |---------  ");
                System.out.println(" |        |  ");
                System.out.println(" |        O  ");
                System.out.println(" |       /|\\");
                System.out.println(" |       / ");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");
                break;
            case 11:
                System.out.println(" |---------  ");
                System.out.println(" |        |  ");
                System.out.println(" |        O  ");
                System.out.println(" |       /|\\");
                System.out.println(" |       / \\");
                System.out.println(" |           ");
                System.out.println(" |           ");
                System.out.println("/ \\       \n");
                break;
        }

    }
}








