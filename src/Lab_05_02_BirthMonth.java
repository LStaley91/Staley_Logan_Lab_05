public class Lab_05_02_BirthMonth
{
    public static void main(String[] args)
    {
        System.out.println("Incert your Birth Month (1–12)");
        int birthMonth = 1;
        if (birthMonth <= 12 && birthMonth >= 1)
        {
            System.out.println("Your birth month is:"+birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value:" +birthMonth);
        }


    }
}
