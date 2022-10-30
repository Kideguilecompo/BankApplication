
package bankapplications;
import java.util.*;


public class SBA_MainDetails 
{
    public static Scanner input = new Scanner (System.in);
    public static double balance;
    public static double Deposit;
    public static double Withdraw;
    public static String customerName;
    public static int customerId,option;
    public static double amount3,amount4;
    
    public static int choose,choose1,choose2,age,bdate,byear,choose3,choose4,choose5,contact;
    public static String gender,address,email,bmonth,nationality,birthday;
    public static String fname,mname,lname,barangay,municipal,province;
    public static boolean stat = true;
    public static int attempts = 1;
    public static String username1,username;
    public static int password1,password;
    
    public static void CHOOSE()
    {
        stat = false;
        while(!stat)
        {
        try
            {
            int chooses;
            
            
            System.out.println("\t\t\t\t|**************************************************************|");
            System.out.println("\t\t\t\t|                                                              |");
            System.out.println("\t\t\t\t|                    WELCOME TO OUR BANK SYSTEM                |");
            System.out.println("\t\t\t\t|                                                              |");
            System.out.println("\t\t\t\t|**************************************************************|");
            System.out.println("\t\t\t\t|                                                              |");
            System.out.println("\t\t\t\t|                                                              |");
            System.out.println("\t\t\t\t|            [ 1 ]      CREATE ACCOUNT                         |");
            System.out.println("\t\t\t\t|                                                              |");
            System.out.println("\t\t\t\t|            [ 2 ]      LOG-IN ACCOUNT                         |");
            System.out.println("\t\t\t\t|                                                              |");
            System.out.println("\t\t\t\t|            [ 3 ]      EXIT                                   |");
            System.out.println("\t\t\t\t|                                                              |");
            System.out.println("\t\t\t\t|**************************************************************|");
            System.out.print("\t\t\t\t|TYPE THE # CHOICE: ");
            chooses = input.nextInt();
            
            if(chooses == 1)
            {
                System.out.println("\t\t\t\t****************************************************************\n\n\n");
                Register();
                stat = false;
            }
            else if(chooses == 2)
            {
                System.out.println("\t\t\t\t****************************************************************\n\n\n");
                SBA_Account.LogIn();
                stat = false;
                break;
            }
            else if(chooses == 3)
            {
                System.out.println("\t\t\t\t****************************************************************");
                System.out.println("\t\t\t\t|                THANK YOU FOR USING OUR SYSTEM                |");
                System.out.println("\t\t\t\t|                     YOU EXIT THE SYSTEM                      |");
                System.out.println("\t\t\t\t****************************************************************");
                System.exit(0);
                break;
            }
            else if(chooses !=1 && chooses != 2 && chooses != 3 && attempts == 3)
            {
                System.out.println("\t\t\t\t|          ⚠        MAXIMUM ATTEMPTS ATTEMPT # " + attempts + "       ⚠      |");
                System.out.println("\t\t\t\t****************************************************************");
                System.out.println("\t\t\t\t|                                                              |");
                System.out.println("\t\t\t\t|          ⚠  MAXIMUM ATTEMPTS THE PROGRAM WAS EXITED  ⚠      |");
                System.out.println("\t\t\t\t|                                                              |");
                System.out.println("\t\t\t\t****************************************************************\n\n");
                System.out.println("\t\t\t\t=================================================================\n\n");
                System.exit(0);
            }
            else
            {
                System.out.println("\t\t\t\t|           ⚠    INVALID! TRY AGAIN!ATTEMPT # " + attempts + "     ⚠         |" );
                System.out.println("\t\t\t\t****************************************************************\n\n\n");
                attempts++;
                
            }
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t|           ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠        |");
                System.out.println("\t\t\t\t****************************************************************\n\n\n");
            }
        }
        
    }
    //***************************************************************************************************************************//
    public static void Register()
    {
     
        System.out.println("\t\t\t\t****************************************************************");
        System.out.println("\t\t\t\t|                                                              |");
        System.out.println("\t\t\t\t|                    SIMPLE BANK APPLICATION                   |");
        System.out.println("\t\t\t\t|                       REGISTRATION FORM                      |");
        System.out.println("\t\t\t\t|                                                              |");
        System.out.println("\t\t\t\t****************************************************************");
        stat = false;
        while(!stat)
        {
        try
            {
                System.out.print("\t\t\t\t VALID ID #        : ");
                customerId = input.nextInt();
                stat = false;
                Firstname();
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
                
            }
        }
    }
    //***************************************************************************************************************************//
    public static void Firstname()
    {
        
        System.out.print("\t\t\t\t FIRST NAME        : ");
        fname = input.next();
        
     
        System.out.print("\t\t\t\t MIDDLE NAME       : ");
        mname = input.next();
    
        System.out.print("\t\t\t\t LAST NAME         : ");
        lname = input.next();
        Age();
    }
    //***************************************************************************************************************************//
    public static void Age()
    {
        stat = false;
        while(!stat)
        {
            try
            {
                System.out.print("\t\t\t\t AGE               : ");
                age = input.nextInt();
                
                    if (age <= 17 && age >= 0)
                    {
                        System.out.println("\t\t\t\t****************************************************************");
                        System.out.println();
                        System.out.println();
                        System.out.println("\t\t\t\t****************************************************************");
                        System.out.println("\t\t\t\t|                                                              |");
                        System.out.println("\t\t\t\t|     ⚠  CANNOT MAKE AN ACCOUNT! NEED A PARENT CONSENT  ⚠     |");
                        System.out.println("\t\t\t\t|                                                              |");
                        System.out.println("\t\t\t\t****************************************************************");
                        CHOOSE();
                    }
                    else if (age < 0 )
                    {
                        System.out.println("\t\t\t\t****************************************************************");
                        System.out.println();
                        System.out.println();
                        System.out.println("\t\t\t\t****************************************************************");
                        System.out.println("\t\t\t\t|                                                              |");
                        System.out.println("\t\t\t\t|   ⚠  CANNOT MAKE AN ACCOUNT! THAT PERSON DID NOT EXIST  ⚠   |");
                        System.out.println("\t\t\t\t|                                                              |");
                        System.out.println("\t\t\t\t****************************************************************");
                        CHOOSE();
                    }
                    else if (age >= 101)
                    {
                        System.out.println("\t\t\t\t****************************************************************");
                        System.out.println();
                        System.out.println();
                        System.out.println("\t\t\t\t****************************************************************");
                        System.out.println("\t\t\t\t|                                                              |");
                        System.out.println("\t\t\t\t|       ⚠  CANNOT MAKE AN ACCOUNT! THAT PERSON TOO OLD  ⚠     |");
                        System.out.println("\t\t\t\t|                                                              |");
                        System.out.println("\t\t\t\t****************************************************************");
                        CHOOSE();
                    }
                    Gender();
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
                
            }
        }
    }
    //***************************************************************************************************************************//
    public static void Gender()
    {
        stat = false;
        while(!stat)
        {
            try
            {
                System.out.println("\t\t\t\t                     __________________________________________");
                System.out.println("\t\t\t\t GENDER            :|                                          |");
                System.out.println("\t\t\t\t                    |                   GENDER                 |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                System.out.println("\t\t\t\t                    |                                          |");
                System.out.println("\t\t\t\t                    |        [ 1 ]     MALE                    |");
                System.out.println("\t\t\t\t                    |                                          |");
                System.out.println("\t\t\t\t                    |        [ 2 ]     FEMALE                  |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                System.out.print("\t\t\t\t CHOOSE GENDER #   : ");
                choose3 = input.nextInt();
        
                if (choose3 == 1)
                {
                    gender = "MALE";

                    System.out.println("\t\t\t\t GENDER            : " + gender);
                    ADDRESS();
                }
                else if (choose3 == 2)
                {
                    gender = "FEMALE";
                    System.out.println("\t\t\t\t GENDER            : " + gender);
                    ADDRESS();
                }
                else if (choose3 != 1 && choose3 != 2)
                {
                   System.out.println("\t\t\t\t            ⚠             INVALID GENDER !           ⚠         ");
                }

            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");

            }
         }
    }
    //***************************************************************************************************************************//
        //Address
        public static void ADDRESS()
    {
        stat = false;
        while(!stat)
        {
            try
            {
                System.out.println("\t\t\t\t                     __________________________________________");
                System.out.println("\t\t\t\t ADDRESS           :|                                          |");
                System.out.println("\t\t\t\t                    |                 PROVINCES                |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                System.out.println("\t\t\t\t                    |                                          |");
                System.out.println("\t\t\t\t                    |     [ 1 ]   MISAMIS ORIENTAL             |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                  System.out.print("\t\t\t\t PROVINCE #        : ");
                choose2 = input.nextInt();
                
                switch(choose2)
                {
                    case 1:
                        province = "MISAMIS ORIENTAL";

                        System.out.println("\t\t\t\t PROVINCE ADDRESS  : " + province);
                       SBA_AddressDets.AddressMain();

                    default:
                        System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");

                }
            
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
                
            }
        }
    }
        //***************************************************************************************************************************//
        public static void Email()
    {
        System.out.print("\t\t\t\t E-MAIL            : ");
        email = input.next();
        Birthmonth();
    }
        //***************************************************************************************************************************//
        public static void Birthmonth()
    {
        stat = false;
        while(!stat)
        {
            try
            {
        System.out.println("\t\t\t\t                     __________________________________________");
        System.out.println("\t\t\t\t BIRTH MONTH       :|                                          |");
        System.out.println("\t\t\t\t                    |                   MONTH                  |");
        System.out.println("\t\t\t\t                    |__________________________________________|");
        System.out.println("\t\t\t\t                    |                                          |");
        System.out.println("\t\t\t\t                    |        [ 1  ]    JANUARY                 |");
        System.out.println("\t\t\t\t                    |        [ 2  ]    FEBRUARY                |");
        System.out.println("\t\t\t\t                    |        [ 3  ]    MARCH                   |");
        System.out.println("\t\t\t\t                    |        [ 4  ]    APRIL                   |");
        System.out.println("\t\t\t\t                    |        [ 5  ]    MAY                     |");
        System.out.println("\t\t\t\t                    |        [ 6  ]    JUNE                    |");
        System.out.println("\t\t\t\t                    |        [ 7  ]    JULY                    |");
        System.out.println("\t\t\t\t                    |        [ 8  ]    AUGUST                  |");
        System.out.println("\t\t\t\t                    |        [ 9  ]    SEPTEMBER               |");
        System.out.println("\t\t\t\t                    |        [ 10 ]    OCTOBER                 |");
        System.out.println("\t\t\t\t                    |        [ 11 ]    NOVEMBER                |");
        System.out.println("\t\t\t\t                    |        [ 12 ]    DECEMBER                |");
        System.out.println("\t\t\t\t                    |__________________________________________|");
          System.out.print("\t\t\t\t MONTH # CHOOSE    : ");
        choose4 = input.nextInt();
         switch(choose4)
        {
            case 1:
                bmonth = "JANUARY";
                
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 2:
                bmonth = "FEBRUARY";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 3:
                bmonth = "MARCH";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 4:
                bmonth = "APRIL";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 5:
                bmonth = "MAY";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 6:
                bmonth = "JUNE";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 7:
                bmonth = "JULY";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 8:
                bmonth = "AUGUST";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 9:
                bmonth = "SEPTEMBER";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 10:
                bmonth = "OCTOBER";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 11:
                bmonth = "NOVEMBER";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            case 12:
                bmonth = "DECEMBER";
                System.out.println("\t\t\t\t BIRTH MONTH       : " + bmonth);
                Birthdate();
                break;
            default:
                System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");
         }
         
         }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
                
            }
        }
    }
        //***************************************************************************************************************************//
        public static void Birthdate()
    {
        stat = false;
        while(!stat)
        {
            try
            { 
                System.out.print("\t\t\t\t BIRTH DATE        : ");
                bdate = input.nextInt();
                
                if(bdate < 1 || bdate > 31)
                    {
                        System.out.println("\t\t\t\t        ⚠  THERE'S NO DATE LIKE THAT   ⚠ ");
                        stat = false;
                        
                    }
                    else
                    {
                        stat = true;
                        Birthyear();
                    }
                
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
                
            }
            
        }
    }
        //***************************************************************************************************************************//
        public static void Birthyear()
    {
        stat = false;
        while(!stat)
        {
        try
            {   
                System.out.print("\t\t\t\t BIRTH YEAR        : ");
                byear = input.nextInt();
                if (byear <= 1922)
                    {
                        System.out.println("\t\t\t\t        ⚠  CAN'T CREATE IT'S TOO OLD   ⚠ ");
                        stat = false;
                    }
                    else if(byear >= 2005)
                    {
                        System.out.println("\t\t\t\t        ⚠  CAN'T CREATE NEED PARENT CONSENT ⚠ ");
                        stat = false;
                    }
                    else
                    {
                        stat = true;
                        Contact();
                    }
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
                
            }
        }
    }
        //***************************************************************************************************************************//
    public static void Contact()
    {
        stat = false;
            while(!stat)
            {
                try
                {   
                    System.out.println("\t\t\t\t NOTICE ! EXAMPLE  : +639*********");
                    System.out.print("\t\t\t\t CONTACT NUMBER    : +639");
                    contact = input.nextInt();
                    if(contact < 111111111)
                    {
                        System.out.println("\t\t\t\t      ⚠  SHORT NUMBER FILL IT CORRECTLY ⚠  ");
                        stat = false;
                    }
                    
                    else if(contact > 1111111110)
                    {
                        System.out.println("\t\t\t\t      ⚠  MAX NUMBER FILL IT CORRECTLY ⚠  ");
                        stat = false;
                    }
                    else
                    {
                        stat = true;
                        Nationality();
                    }
                }
                catch(Exception ex )
                {
                    String str = input.next();
                    System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");

                }
            }
    }
         //***************************************************************************************************************************//
      public static void Nationality()
    {
        stat = false;
        while(!stat)
        {
        try
            { 
        System.out.println("\t\t\t\t                     __________________________________________");
        System.out.println("\t\t\t\t NATIONALITY       :|                                          |");
        System.out.println("\t\t\t\t                    |              NATIONALITY LIST            |");
        System.out.println("\t\t\t\t                    |__________________________________________|");
        System.out.println("\t\t\t\t                    |                                          |");
        System.out.println("\t\t\t\t                    |    [ 1 ]     FILIPINO                    |");
        System.out.println("\t\t\t\t                    |    [ 2 ]     AMERICAN                    |");
        System.out.println("\t\t\t\t                    |    [ 3 ]     CANADIAN                    |");
        System.out.println("\t\t\t\t                    |    [ 4 ]     RUSSIAN                     |");
        System.out.println("\t\t\t\t                    |    [ 5 ]     AUSTRALIAN                  |");
        System.out.println("\t\t\t\t                    |__________________________________________|");
          System.out.print("\t\t\t\t NATIONALITY       : ");
        choose5 = input.nextInt();
         switch(choose5)
        {
            case 1:
                nationality = "FILIPINO";
                System.out.println("\t\t\t\t NATIONALITY       : " + nationality);
                break;
            case 2:
                nationality = "AMERICAN";
                System.out.println("\t\t\t\t NATIONALITY      : " + nationality);
                break;
            case 3:
                nationality = "CANADIAN";
                System.out.println("\t\t\t\t NATIONALITY       : " + nationality);
                break;
            case 4:
                nationality = "RUSSIAN";
                System.out.println("\t\t\t\t NATIONALITY       : " + nationality);
                break;
            case 5:
                nationality = "AUSTRALIAN";
                System.out.println("\t\t\t\t NATIONALITY       : " + nationality);
                break;
            default:
                System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");
         }
         
        System.out.println("\t\t\t\t****************************************************\n\n");
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
                
            }
        
        customerName = fname + " " + mname + " " + lname;
        address = barangay + ", " + municipal + ",\n\t\t\t\t\t\t\t\t\t " + province;
        birthday = bmonth + " " + bdate + " " + byear;
        
       SBA_Account.CreateAccount();
        }
    }
}