
package bankapplications;


public class SBA_MainProj extends SBA_MainDetails
{
    public void deposit()
    {
        
            try
            {
        
                System.out.println();
                System.out.println("\t\t\t\t===============================================================\n\n");
                System.out.println("\t\t\t\t|*************************************************************|");
                System.out.println("\t\t\t\t|ACCOUNT NAME     :" + customerName);
                System.out.println("\t\t\t\t|ACOOUNT ID       :" + customerId);
                System.out.println("\t\t\t\t|*************************************************************|");
                System.out.println("\t\t\t\t|                             DEPOSIT                         |  ");
                System.out.println("\t\t\t\t|*************************************************************|");
                  System.out.print("\t\t\t\t|AMOUNT TO DEPOSIT :₱");
                amount3 = input.nextDouble();

                System.out.println("\t\t\t\t***************************************************************");

                balance = balance + amount3;
                Deposit = amount3;
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t|           ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠        |");
                System.out.println("\t\t\t\t****************************************************************\n\n\n");
            }
        
    }
    public void withdraw()
    {
        
            try
            {
                System.out.println();
                System.out.println("\t\t\t\t===============================================================\n\n");
                System.out.println("\t\t\t\t|*************************************************************|");
                System.out.println("\t\t\t\t\t\t|ACCOUNT NAME     :" + customerName);
                System.out.println("\t\t\t\t\t\t|ACOOUNT ID       :" + customerId);
                System.out.println("\t\t\t\t|*************************************************************|");
                System.out.println("\t\t\t\t|                           WITHDRAW                          |   ");
                System.out.println("\t\t\t\t|*************************************************************|");
                  System.out.print("\t\t\t\t|AMOUNT TO WITHDRAW :₱");
                amount4 = input.nextDouble();


                if (balance > amount4)
                {
                    System.out.println("\t\t\t\t***************************************************************");
                    balance = balance - amount4;
                }
                else if (balance < amount4)
                {

                    System.out.println("\t\t\t\t***************************************************************");
                    System.out.println("\t\t\t\t|                   NO SUFFECIENT BALANCE !!                  |");
                    System.out.println("\t\t\t\t|                                                             |");
                    System.out.println("\t\t\t\t|CURRENT BALANCE  :₱" + balance );
                    System.out.println("\t\t\t\t***************************************************************");
                }
                else
                {
                    System.out.println("\t\t\t\t|                         INVALID                             | ");
                    System.out.println("\t\t\t\t***************************************************************");
                    System.out.println();
                    System.out.println("\t\t\t\t===============================================================\n\n");
                }
                Withdraw = -amount4;
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t|           ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠        |");
                System.out.println("\t\t\t\t****************************************************************\n\n\n");
            }
        
    }
    public void PrevoiusTransaction()
    {
                System.out.println();
                System.out.println("\t\t\t\t===============================================================\n\n");
                System.out.println("\t\t\t\t|*************************************************************|");
                System.out.println("\t\t\t\t|                     PREVIOUS TRANSACTION                    | ");
                System.out.println("\t\t\t\t|*************************************************************|");

                
                    if(Withdraw > balance)
                    {
                        System.out.println("\t\t\t\t|DEPOSITED        :₱" + Deposit);
                        System.out.println("\t\t\t\t|WITHDRAWN        :₱" + Math.abs(Withdraw));
                        System.out.println("\t\t\t\t***************************************************************");
                    }
                    else if(Withdraw < 0 && Deposit > 0)
                    {
                        System.out.println("\t\t\t\t|DEPOSITED        :₱" + Deposit);
                        System.out.println("\t\t\t\t***************************************************************");
                    }
                
                else
                {
                    System.out.println("\t\t\t\t|                 NO TRANSACTION RECORD !!                    |");
                    System.out.println("\t\t\t\t***************************************************************");
                }
    }
    public void AccountDetails()
    {
        
        System.out.println();
        System.out.println("\t\t\t\t===============================================================\n\n");
        System.out.println("\t\t\t\t***************************************************************");
        System.out.println("\t\t\t\t|                       ACCOUNT DETAILS                      |");
        System.out.println("\t\t\t\t***************************************************************");
        System.out.println("\t\t\t\t|USERNAME         : " + username);
        System.out.println("\t\t\t\t|PIN #            : " + password);
        System.out.println("\t\t\t\t|ACCOUNT BAL.     : " + balance);
        System.out.println("\t\t\t\t|..............................................................");
        System.out.println("\t\t\t\t|ID               : " + customerId);
        System.out.println("\t\t\t\t|NAME             : " + customerName);
        System.out.println("\t\t\t\t|AGE              : " + age);
        System.out.println("\t\t\t\t|GENDER           : " + gender);
        System.out.println("\t\t\t\t|ADDRESS          : " + address);
        System.out.println("\t\t\t\t|E-MAIL           : " + email);
        System.out.println("\t\t\t\t|BIRTHDAY         : " + birthday);
        System.out.println("\t\t\t\t|CONTACT #        : " + contact);
        System.out.println("\t\t\t\t|NATIONALITY      : " + nationality);
        System.out.println("\t\t\t\t***************************************************************");
        
    }
    
    public static void Choices()
    {
        stat = false;
        while(!stat)
        {
            try
            {
                SBA_MainProj main = new SBA_MainProj();
                do
                {
                    System.out.println();
                    System.out.println("\t\t\t\t===============================================================\n\n");
                    System.out.println("\t\t\t\t***************************************************************");
                    System.out.println("\t\t\t\t|                    SIMPLE BANK APPLICATION                  |");
                    System.out.println("\t\t\t\t***************************************************************");
                    System.out.println("\t\t\t\t|ACCOUNT NAME     :" + customerName);
                    System.out.println("\t\t\t\t|ACOOUNT ID       :" + customerId);
                    System.out.println("\t\t\t\t***************************************************************");
                    System.out.println("\t\t\t\t|           [ 1 ]       CHECK BALANCE                         |");
                    System.out.println("\t\t\t\t|           [ 2 ]       DEPOSIT                               |");
                    System.out.println("\t\t\t\t|           [ 3 ]       WITHDRAW                              |");
                    System.out.println("\t\t\t\t|           [ 4 ]       PREVIOUS TRANSACTION                  |");
                    System.out.println("\t\t\t\t|           [ 5 ]       ACCOUNT DETAILS                       |");
                    System.out.println("\t\t\t\t|           [ 6 ]       EXIT                                  |");
                    System.out.println("\t\t\t\t|*************************************************************|");
                      System.out.print("\t\t\t\t|ENTER YOUR OPTION  : ");
                    option = input.nextInt();
                    System.out.println("\t\t\t\t***************************************************************");

                    switch (option)
                            {
                                case 1 :
                                    System.out.println();
                                    System.out.println("\t\t\t\t===============================================================\n\n");
                                    System.out.println("\t\t\t\t***************************************************************");
                                    System.out.println("\t\t\t\t|                        BALANCE                              |  ");
                                    System.out.println("\t\t\t\t***************************************************************");
                                    System.out.println("\t\t\t\t|BALANCE          :₱" + balance);
                                    System.out.println("\t\t\t\t***************************************************************");
                                    break;

                                case 2 :
                                    main.deposit();
                                    break;

                                case 3 :
                                    main.withdraw();
                                    break;

                                case 4 :
                                    main.PrevoiusTransaction();
                                    break;

                                case 5 :
                                    main.AccountDetails();
                                    break;
                                case 6 :
                                    System.out.println("\t\t\t\t===============================================================\n");
                                    System.out.println("\t\t\t\t***************************************************************");
                                    System.out.println("\t\t\t\t|              !! THANK YOU FOR USING OUR SYSTEM !!           |");
                                    System.out.println("\t\t\t\t***************************************************************");
                                    System.out.println("\t\t\t\t===============================================================\n");
                                    System.exit(0);
                                default:
                                    System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");
                            }

            }while(option != 6);
            }
                catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t|           ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠        |");
                System.out.println("\t\t\t\t****************************************************************\n\n\n");
            }
        }
    }
}

