public class Cwh_14_Strings_Methods {

    

    public static void main(String[] args)
    {
        String name = "Sundram";
        System.out.println(name);

        int value = name.length();
        System.out.println("The Length of the String is : "+value);

        String animal = "dOG";
        String lstring = animal.toLowerCase();
        System.out.println("The LowerCase of the String is : "+lstring);

        String bird = "eagle";
        String ustring = bird.toUpperCase();
        System.out.println("The UpperCase of the String is : "+ustring);

        String nonTrimmedString = "     Eagle     ";
        System.out.println(nonTrimmedString);
        String tstring = nonTrimmedString.trim();
        System.out.println("String after trimming is : "+tstring);

        System.out.println(name.substring(2,5));

        System.out.println(name.replace('m','a'));

        System.out.println(name.replace("ram","arshan"));

        System.out.println(name.startsWith("Sun"));
        System.out.println(name.endsWith("ma"));

        System.out.println(name.charAt(5));

        System.out.println(name.indexOf("d"));

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry",4));

        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry",4));

        System.out.println(name.equals("sundram"));
        System.out.println(name.equalsIgnoreCase("sundram"));

        System.out.println("I am Escape Sequence \" double quote");
    }
}
