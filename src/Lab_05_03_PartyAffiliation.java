public class Lab_05_03_PartyAffiliation
{
    public static void main(String[] args)
    {
       System.out.println("Whats your political party affiliation (D, R, I)");
       String PP = "I";

       if (PP.equalsIgnoreCase("I"))
       {
           System.out.println("You get a Independent Person");
       }
       else if(PP.equalsIgnoreCase("R"))
       {
            System.out.println("You get a Republican Elephant");
       }
       else if(PP.equalsIgnoreCase("D"))
       {
            System.out.println("You get a Democratic Donkey");
       }
       else
       {
           System.out.println("You get a Other");
       }
    }
}
