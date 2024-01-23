public class _015_PS03 {
    public static void main(String[] args) {

        // Problem 1
        String name = "Fardin Faruqi";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To Lower Case";
        text = text.replace("Lower", "Upper");
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter.replace("<|name|>", "Fardin");
        System.out.println(letter);
        letter = letter.replace("<|name|>", "Fardin");
        System.out.println(letter);

        // Problem 4
        String mySting = "This string contains double and triple spaces";
        System.out.println(mySting.indexOf(" "));
        System.out.println(mySting.indexOf(" "));
        System.out.println(mySting.indexOf(" "));

        // Problem 5
        String myLetter = "Leaning Java is SUPPPPPPER painful!";
        System.out.println(myLetter);
        myLetter = "\\*\tLeaning Java is \n\tSUPPPPPPER \n\tpainful!\t*\\";
        System.out.println(myLetter);

    }
}
