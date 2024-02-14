public class Cwh_15_Ps3 {
    
    /** 
     * @param args
     */
    public static void main(String[] args)
    {
        //Problem 1:
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println("The LowerCase of the String: "+name);

        //Problem 2:
        String text = "To Lower Case";
        text = text.replace(" ","_");
        System.out.println("The replced new String is: "+text);

        //Problem 3:
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Sundram");
        System.out.println("Letter to You: "+letter);

        //Problem 4:
        String myString = "This String contains   double and triple spaces.";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("   "));

        //Problem 5:
        String myLetter = "Dear Harry, \n\tThis java course is Nice.\nThanks!";
        System.out.println(myLetter);

    }

}
