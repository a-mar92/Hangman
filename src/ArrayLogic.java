import java.util.*;

public class ArrayLogic {

    private int mistake = 0;
    private int life = 0;
    private int goodAnswer = 0;
    private LinkedList<String> words = new LinkedList<>();
    private ArrayList<String> changeToEmpty = new ArrayList<>();
    private ArrayList<String> myArrayList = new ArrayList<>();
    private String arr[] = {};
    String myWords;
    private final String[] charecretWords = {"Kanapka", "Ciasto", "Kebab", "Pizza", "Sushi", "Burger", "Schabowy"};
    String randomSecretWord;

    public String randomWords() {
        Random random = new Random();

        return randomSecretWord = charecretWords[random.nextInt(charecretWords.length)];


    }

    public int getMistake() {
        return mistake;
    }

    public ArrayLogic() {
        Board board = new Board(getMistake()) {

        };
    }

    public void app() {
        randomWords();
        for (int i = 0; i < (randomSecretWord.length()); i++) {
            String a = String.valueOf(randomSecretWord.charAt(i));

            myArrayList.add("_ ");
            words.add(a);
        }
        arr = new String[(randomSecretWord.length())];
        for (int i = 0; i < words.size(); i++) {
            changeToEmpty.add(" _ ");
        }
        System.out.println(
                "Secret word :\n "
        );
        for (String a : changeToEmpty
        ) {
            System.out.print(a);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = " _ ";
        }
        int valuee = 0;
        while ((getMistake() < 11) && (life < words.size())) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("Give me answear : ");
            myWords = scanner.nextLine().toUpperCase();
            mistake++;

            for (int i = 0; i < words.size(); i++) {
                if (myWords.equalsIgnoreCase(words.get(i))) {
                    int value = i;
                    arr[i] = myWords;
                    words.set(value, "_");
                    life++;
                    goodAnswer = 1;
                }
            }
            if (goodAnswer == 1) {
                --mistake;
                goodAnswer = 0;
            }

            Board board = new Board(getMistake()) {
            };
            board.board(getMistake());
            System.out.print("You Find: ");
            for (String word :
                    arr) {
                System.out.print(word);
            }
        }

        if (life == (words.size())) {
            System.out.print("\nYou Won, secret word is ");
            for (String word :
                    arr) {
                System.out.print(word);
            }
        }
        else
            System.out.println("\nYou Lost");
    }
}





