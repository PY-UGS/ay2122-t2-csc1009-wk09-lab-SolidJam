import java.util.*;

public class testingMain {
    public static final int setChar = 15;

    public static void main(String[] args) {
        System.out.println("Get 15 random lower case character between ‘a’ and ‘z’.");
        RandomCharacter currChar1 = new RandomCharacter(setChar);
        ArrayList<String> charArr1 = currChar1.getRandomCharacter1(setChar);
        for (int k=0; k < setChar; k++) {
            System.out.print(charArr1.get(k) + " ");
        }
        System.out.println(" ");

        System.out.println("Get 15 random upper case character between ‘A’ and ‘Z’.");
        RandomCharacter currChar2 = new RandomCharacter(setChar);
        ArrayList<String> charArr2 = currChar2.getRandomCharacter2(setChar);
        for (int k=0; k < setChar; k++) {
            System.out.print(charArr2.get(k) + " ");
        }
        System.out.println(" ");

        System.out.println("Get 15 random digit number between ‘0’ and ‘9’");
        RandomCharacter currChar3 = new RandomCharacter(setChar);
        ArrayList<String> charArr3 = currChar3.getRandomCharacter3(setChar);
        for (int k=0; k < setChar; k++) {
            System.out.print(charArr3.get(k) + " ");
        }
        System.out.println(" ");

        System.out.println("Get 1 random character / number");
        RandomCharacter currCharOne = new RandomCharacter(setChar);
        ArrayList<String> charArrOne = currCharOne.getRandomCharacterAll(setChar);
        for (int k=0; k < 1; k++) {
            System.out.print(charArrOne.get(k) + " ");
        }
        System.out.println(" ");

        System.out.println("Get 15 random digit number between ‘0’ and ‘9’");
        RandomCharacter currChar = new RandomCharacter(setChar);
        ArrayList<String> charArr = currChar.getRandomCharacterAll(setChar);
        for (int k=0; k < setChar; k++) {
            System.out.print(charArr.get(k) + " ");
        }
    }
}
