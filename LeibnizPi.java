/*******************************************************************
 * Author: Thomas Kramer                                           *
 * Purpose: Finds the approximate value of pi using                *
 * Leibniz formula and a precision value from the user             *
 * Example : Higher number = closer to pis true value              *
 * Date: 16/04/2016 11:44pm                                        *
********************************************************************/
import java.util.*;

public class LeibnizPi
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        int piPrecision = getPrecisionValue();
        double pi = piCalculation(piPrecision);
        System.out.println(pi);
    }

    
 /******************************************************************
 * Author: Thomas Kramer                                           *
 * Purpose: This is Leibniz pi formula will find pi to accuracy    *
 * dependant on the piPrecision value                              *
 * Date: 17/04/2016 12:30am                                        *
 ******************************************************************/
    public static double piCalculation(int piPrecision)
    {

        double pi = 0;
        double temp;
        int powered = 0;
        for (int i = 0; i <= piPrecision; i++)
        {
 //IMO - quicker way to find top part of the equation
       //As if i is divisible by two it is always -1 and so on.
            if (i % 2 == 0)
            {
                powered = -1;
            }
            else if (i == 0)
            {
                powered = -1;
            }
            else
            {
                powered = 1;
            }

            temp = (double) ((-1 * powered) / ((2 * (double) i) + 1));
            pi = temp + pi;

        }
        pi = pi * 4;
        return pi;

    }

    
 /******************************************************************
 * Author: Thomas Kramer                                           *
 * Purpose: To get the precision value from the user.              *
 * Date: 17/04/2016 12:30am                                        *
 ******************************************************************/
    
    
    public static int getPrecisionValue()
    {
        Scanner sc = new Scanner(System.in);
        int piPrecision = 0;
        boolean validInputPrecision = false;
        do
        {
            System.out.println("Please enter a digit to calulate pi at that pecision value: ");
            try
            {
                piPrecision = sc.nextInt();
                validInputPrecision = true;
            }
            catch (Exception e)
            {
                System.out.println("Error you did not enter in a digit.");
                validInputPrecision = false;
                sc.next();
            }
        } while (validInputPrecision == false);
        return piPrecision;
    }
}
