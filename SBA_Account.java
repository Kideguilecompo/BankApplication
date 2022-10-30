
package bankapplications;

public class SBA_Account extends SBA_MainDetails
{
    public static void CreateAccount()
    {
        
        System.out.println();
        System.out.println("\t\t\t\t===================================================\n\n");
        System.out.println("\t\t\t\t***************************************************|");
        System.out.println("\t\t\t\t|          CREATE USERNAME & PIN PASSWORD          |");
        System.out.println("\t\t\t\t|**************************************************|");
        
        System.out.print("\t\t\t\t|CREATE USERNAME  : ");
        username = input.next();
        stat = false;
        while(!stat)
        {
        try
            {
        System.out.print("\t\t\t\t|CREATE PIN #     : ");
        password = input.nextInt();
        
        
        System.out.println("\t\t\t\t|..................................................|");
        System.out.println("\t\t\t\t|           ACCOUNT CREATED SUCCESSFULLY           |");
        System.out.println("\t\t\t\t****************************************************\n\n");
        System.out.println();
        System.out.println("\t\t\t\t===================================================\n\n");
            
        CHOOSE();
        }
        catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t|ONLY NUMBER ! PLEASE TRY AGAIN !"); 
            }
        }
    }
    
    public static void LogIn()
    {
        
        stat = false;
        while(!stat)
        {
            try
            {
                System.out.println();
                System.out.println("\t\t\t\t====================================================\n\n");
                System.out.println("\t\t\t\t|**************************************************|");
                System.out.println("\t\t\t\t|                     LOG IN                       |");
                System.out.println("\t\t\t\t|**************************************************|");

                System.out.print("\t\t\t\t|USERNAME         : ");
                username1 = input.next();

                System.out.print("\t\t\t\t|PIN #            : ");
                password1 = input.nextInt();


                if (username1.equals(username) && password1 == password )
                {
                    System.out.println("\t\t\t\t****************************************************");

                    stat = false;
                    SBA_MainProj.Choices();
                }

                else if(!username1.equals(username)&& password1 != password && attempts == 3)
                {
                    System.out.println("\t\t\t\t|MAXIMUM ATTEMPTS ATTEMPT # " + attempts);
                    System.out.println("\t\t\t\t****************************************************\n");
                    System.out.println("\t\t\t\t====================================================\n\n");
                    System.exit(0);
                }
                else if (username1.equals("EXIT") && password1 == 0000 )
                {
                    System.exit(0);
                }

                else
                {
                    System.out.println("\t\t\t\t|INVALID! TRY AGAIN!ATTEMPT # " + attempts);
                    System.out.println("\t\t\t\t****************************************************");
                    attempts++;
                }

            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t|ONLY NUMBER THE PIN #! PLEASE TRY AGAIN !"); 
            }
        }
      
    }
}

