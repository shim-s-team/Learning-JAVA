public class CastTest
{
    public static void main(String[] args)
    {
        int myInt;
        float myFloat = (float)3.0;
        double myDouble;

        myInt = (int)myFloat;
        myDouble = myInt;

        System.out.print("myInt = " + myInt + ", myFloat = " + myFloat + ", myDouble = " + myDouble);
    }
}