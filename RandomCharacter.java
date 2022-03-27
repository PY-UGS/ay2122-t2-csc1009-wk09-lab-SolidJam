import java.util.*;

public class RandomCharacter{

    Random rand;
    ArrayList<String> RandomCharacter;
    //Set random Character
    public RandomCharacter(int setChar)
    {
        rand = new Random();
        RandomCharacter = new ArrayList<String>();
    }
    //Set random Character
    public void setRandChar(String randomCharacter)
    {
        this.RandomCharacter.add(randomCharacter);
    }
    //Getter for the lower case letter
    public String getRandLowerCaseLetter()
    {
        return Character.toString((char)(rand.nextInt(26) + 'a'));
    }
    //Getter for the upper case letter
    public String getRandUpperCaseLetter()
    {
        return Character.toString((char)(rand.nextInt(26) + 'A'));
    }
    //Getter for the random digit
    public String getRandDigitCharacter()
    {
        return Integer.toString(rand.nextInt(10));
    }
    //Output random characters and numbers based on input of 15


    //Output random characters and numbers based on input of 15

    public ArrayList<String> getRandomCharacter1(int numOfChar) {
        for(int k = 0; k < numOfChar; k++) {
            setRandChar(getRandLowerCaseLetter());
        }
        return RandomCharacter;
    }
    public ArrayList<String> getRandomCharacter2(int numOfChar) {
        for(int k = 0; k < numOfChar; k++) {
            setRandChar(getRandUpperCaseLetter());
        }
        return RandomCharacter;
    }
    public ArrayList<String> getRandomCharacter3(int numOfChar) {
        for(int k = 0; k < numOfChar; k++) {
            setRandChar(getRandDigitCharacter());
        }
        return RandomCharacter;
    }

    public ArrayList<String> getRandomCharacterAll(int numOfChar) {
        for(int i = 0; i < numOfChar; i++) {
            switch (rand.nextInt(3)) {
                case 0 -> setRandChar(getRandLowerCaseLetter());
                case 1 -> setRandChar(getRandUpperCaseLetter());
                case 2 -> setRandChar(getRandDigitCharacter());
            }
        }
        return RandomCharacter;
    }
}
