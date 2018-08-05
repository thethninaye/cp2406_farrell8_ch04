public class FormLetterWriter
{
    public static void main(String[] args)
    {
        displaySalutation("Violet");
        businessLetter();
        displaySalutation("Jasmine", "Rose");
        businessLetter();
    }

    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
    }

    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }
    public static void businessLetter()
    {
        System.out.println("Thank you for your recent order.\n");
    }
}
