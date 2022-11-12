import java.util.*;

public class ArrayLogic  {

    private int mistake = 0;
    private int life = 0;
    private int goodAnswer = 0;

    private LinkedList<String> words = new LinkedList<>();
    private ArrayList<String> changeToEmpty = new ArrayList<>();
    private ArrayList<String> myArrayList = new ArrayList<>();
    private String arr[] = {};
    String myWords;
    private final String[] charecretWords = {"Kanapka","Ciasto", "Kebab", "Pizza","Sushi","Burger", "Schabowy"};
    String randomSecretWord;
//    private String randomWord;



//    public String test() {
//        randomWord = charecretWords[(int) (Math.random() * charecretWords.length)];
//        return randomWord;
//    }

    public String randomWords() {
        Random random = new Random();

        return randomSecretWord = charecretWords[random.nextInt(charecretWords.length)];




    }


public int getMistake() {
    return mistake;
}

    public ArrayLogic() {
        Board board = new Board(getMistake()){

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
   //     System.out.println(słowo); // - > wydruk słowa

        for (int i = 0; i < words.size(); i++) {
            changeToEmpty.add(" _ ");

        }
        System.out.println(
                "Sekretne słowo :\n "
        );
        for (String a : changeToEmpty
        ) {
            System.out.print(a);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = " _ ";
        }
        int valuee = 0;
        while ((getMistake()<11)&&(life < words.size())) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("Give me answear : ");
            myWords = scanner.nextLine().toUpperCase();

//            System.out.println("pusta tablica " + Arrays.toString(arr));
//            System.out.println("LinkedList z sekretnym słowem - oddzielne znaki " + słowo);
//            System.out.println("Pusta ArrayList my" + my);
//            System.out.println("Pusta ArrayList ssss" + ssss);
//
//            System.out.println("wybrana litera :" + myWords);
//            System.out.println("tablica słów" + Arrays.toString(charecretWords));
//            System.out.println("wybrane słowo z tablicy jakko string :" + randomSecretWord);

            //System.out.println("zgadłem : " + life);
            mistake++;



            for (int i = 0; i < words.size(); i++) {
                if (myWords.equalsIgnoreCase(words.get(i))) {
                   // getMistake();
                    int value = i;
                //    System.out.println("miejsce wybranego słowa " + value);
                    arr[i] = myWords;
                    //słowo.remove(value);
                    words.set(value, "_");
               //     System.out.println("zamiana _ z odgadnięty znak " + słowo);
                 //   System.out.println("dodany znak do tablicy " + Arrays.toString(arr));
                                        life++;
                       //System.out.println("dobre znaki " + life);
                        goodAnswer=1;

                    }


                }
            if (goodAnswer==1){


                --mistake;
                goodAnswer=0;
                }
//            System.out.println("ilość błędów :  " + mistake); //-> zamienić na szubienice
            Board board = new Board(getMistake()){

            };
            board.board(getMistake());
//            System.out.println("ilość błędów get :  " + getMistake()); //-> zamienić na szubienice


            System.out.print("You Find: " );
            for (String word :
                    arr) {
                System.out.print(word);
            }

            }

        if (life ==(words.size())){
     System.out.print("\n You Won, secret word is " );
            for (String word :
                    arr) {
                System.out.print(word);
            }
        }else
            System.out.println("\nYou Lost");}




}





