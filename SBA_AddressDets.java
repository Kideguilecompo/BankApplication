
package bankapplications;


public class SBA_AddressDets extends SBA_MainDetails 
{
    public static void AddressMain()
    {
        Municipality();
    }
    
    private static void Municipality()
    {
        stat = false;
        while(!stat)
        {
            try
            {
                
                System.out.println("\t\t\t\t                     __________________________________________");
                System.out.println("\t\t\t\t ADDRESS           :|                                          |");
                System.out.println("\t\t\t\t                    |        MIS.OR MUNICIPALITY/CITY LIST     |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                System.out.println("\t\t\t\t                    |                                          |");
                System.out.println("\t\t\t\t                    |      [ 1 ]     ALUBIJID                  |");
                System.out.println("\t\t\t\t                    |      [ 2 ]     BALINGASAG                |");
                System.out.println("\t\t\t\t                    |      [ 3 ]     BALINGOAN                 |");
                System.out.println("\t\t\t\t                    |      [ 4 ]     BINUANGAN                 |");
                System.out.println("\t\t\t\t                    |      [ 5 ]     CAGAYAN DE ORO CITY       |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                  System.out.print("\t\t\t\t MUNICIPALITY #    : ");
                choose1 = input.nextInt();
                
                 switch(choose1)
                {
                    case 1:
                        municipal = "ALUBIJID";

                        System.out.println("\t\t\t\t MUNICIPALITY      : " + municipal);
                        ALUBIJID();
                        break;
                    case 2:
                        municipal = "BALINGASAG";
                        System.out.println("\t\t\t\t MUNICIPALITY      : " + municipal);
                        BALINGASAG();
                        break;
                    case 3:
                        municipal = "BALINGOAN";
                        System.out.println("\t\t\t\t MUNICIPALITY      : " + municipal);
                        BALINGOAN();
                        break;
                    case 4:
                        municipal = "BINUANGAN";
                        System.out.println("\t\t\t\t MUNICIPALITY      : " + municipal);
                        BINUANGAN();
                        break;
                    case 5:
                        municipal = "CAGAYAN DE ORO CITY";
                        System.out.println("\t\t\t\t MUNICIPALITY      : " + municipal);
                        CDO();
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
    private static void ALUBIJID()
    {
        
        stat = false;
        while(!stat)
        {
            try
            {
                System.out.println("\t\t\t\t                     __________________________________________");
                System.out.println("\t\t\t\t ADDRESS           :|                                          |");
                System.out.println("\t\t\t\t                    |            ALUBIJID BARANGAY LIST        |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                System.out.println("\t\t\t\t                    |                                          |");
                System.out.println("\t\t\t\t                    |      [ 1  ]    BAYBAY                    |");
                System.out.println("\t\t\t\t                    |      [ 2  ]    BENIGWAYAN                |");
                System.out.println("\t\t\t\t                    |      [ 3  ]    CALATCAT                  |");
                System.out.println("\t\t\t\t                    |      [ 4  ]    LAGTANG                   |");
                System.out.println("\t\t\t\t                    |      [ 5  ]    LANAO                     |");
                System.out.println("\t\t\t\t                    |      [ 6  ]    LOGUILO                   |");
                System.out.println("\t\t\t\t                    |      [ 7  ]    LOURDES                   |");
                System.out.println("\t\t\t\t                    |      [ 8  ]    LUMBO                     |");
                System.out.println("\t\t\t\t                    |      [ 9  ]    MOLOCBOC                  |");
                System.out.println("\t\t\t\t                    |      [ 10 ]    POBLACION                 |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                  System.out.print("\t\t\t\t BARANGAY #        : ");
                choose1 = input.nextInt();
                
                switch(choose1)
                {
                    case 1:
                        barangay = "BAYBAY";
                        break;
                    case 2:
                        barangay = "BENIGWAYAN";
                        break;
                    case 3:
                        barangay = "CALATCAT";
                        break;
                    case 4:
                        barangay = "LANAO";
                        break;
                    case 5:
                        barangay = "LOGUILO";
                        break;
                    case 6:
                        barangay = "CLAVERIA";
                        break;
                    case 7:
                        barangay = "LOURDES";
                        break;
                    case 8:
                        barangay = "LUMBO";
                        break;
                    case 9:
                        barangay = "MOLOCBOC";
                        break;
                    case 10:
                        barangay = "POBLACION";
                        break;
                    default:
                        System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");
                }
                System.out.println("\t\t\t\t BARANGAY ADDRESS  : " + barangay);
                Email();
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         "); 
            }
        }
    }
    private static void BALINGASAG()
    {
        stat = false;
        while(!stat)
        {
            try
            {
                System.out.println("\t\t\t\t                     __________________________________________");
                System.out.println("\t\t\t\t ADDRESS           :|                                          |");
                System.out.println("\t\t\t\t                    |          BALINGASAG BARANGAY LIST        |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                System.out.println("\t\t\t\t                    |                                          |");
                System.out.println("\t\t\t\t                    |    [ 1  ]    BALAGNAN                    |");
                System.out.println("\t\t\t\t                    |    [ 2  ]    BALIWAGAN                   |");
                System.out.println("\t\t\t\t                    |    [ 3  ]    BARANGAY 1 (POBLACION)      |");
                System.out.println("\t\t\t\t                    |    [ 4  ]    BARANGAY 2 (POBLACION)      |");
                System.out.println("\t\t\t\t                    |    [ 5  ]    BARANGAY 3 (POBLACION)      |");
                System.out.println("\t\t\t\t                    |    [ 6  ]    BARANGAY 4 (POBLACION)      |");
                System.out.println("\t\t\t\t                    |    [ 7  ]    BARANGAY 5 (POBLACION)      |");
                System.out.println("\t\t\t\t                    |    [ 8  ]    BARANGAY 6 (POBLACION)      |");
                System.out.println("\t\t\t\t                    |    [ 9  ]    BINITINAN                   |");
                System.out.println("\t\t\t\t                    |    [ 10 ]    BLANCO                      |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                  System.out.print("\t\t\t\t BARANGAY #        : ");
                choose1 = input.nextInt();
                
                switch(choose1)
                {
                    case 1:
                        barangay = "BALAGNAN";
                        break;
                    case 2:
                        barangay = "BALIWAGAN";
                        break;
                    case 3:
                        barangay = "BARANGAY 1 (POBLACION)";
                        break;
                    case 4:
                        barangay = "BARANGAY 2 (POBLACION)";
                        break;
                    case 5:
                        barangay = "BARANGAY 3 (POBLACION)";
                        break;
                    case 6:
                        barangay = "BARANGAY 4 (POBLACION)";
                        break;
                    case 7:
                        barangay = "BARANGAY 5 (POBLACION)";
                        break;
                    case 8:
                        barangay = "BARANGAY 6 (POBLACION)";
                        break;
                    case 9:
                        barangay = "BINITINAN";
                        break;
                    case 10:
                        barangay = "BLANCO";
                        break;
                    default:
                        System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");
                }
                System.out.println("\t\t\t\t|BARANGAY ADDRESS  : " + barangay);
                Email();
        }
        catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         "); 
            }
        }
    }
    private static void BALINGOAN()
    {
        stat = false;
        while(!stat)
        {
        try
            {
        System.out.println("\t\t\t\t                     __________________________________________");
        System.out.println("\t\t\t\t ADDRESS           :|                                          |");
        System.out.println("\t\t\t\t                    |            BALINGOAN BARANGAY LIST       |");
        System.out.println("\t\t\t\t                    |__________________________________________|");
        System.out.println("\t\t\t\t                    |                                          |");
        System.out.println("\t\t\t\t                    |     [ 1 ]    BAUKBAUK (POBLACION)        |");
        System.out.println("\t\t\t\t                    |     [ 2 ]    DAHILIG                     |");
        System.out.println("\t\t\t\t                    |     [ 3 ]    KABANGASAN                  |");
        System.out.println("\t\t\t\t                    |     [ 4 ]    KABULAKAN                   |");
        System.out.println("\t\t\t\t                    |     [ 5 ]    KAUSWAGAN                   |");
        System.out.println("\t\t\t\t                    |     [ 6 ]    BLAPINIG (POBLACION)        |");
        System.out.println("\t\t\t\t                    |     [ 7 ]    MANTANGALE                  |");
        System.out.println("\t\t\t\t                    |     [ 8 ]    MAPUA                       |");
        System.out.println("\t\t\t\t                    |     [ 9 ]    SAN ALONZO                  |");
        System.out.println("\t\t\t\t                    |__________________________________________|");
          System.out.print("\t\t\t\t BARANGAY #        : ");
        choose1 = input.nextInt();
        
        switch(choose1)
        {
            case 1:
                barangay = "BAUKBAUK (POBLACION)";
                break;
            case 2:
                barangay = "DAHILIG";
                break;
            case 3:
                barangay = "KABANGASAN";
                break;
            case 4:
                barangay = "KABULAKAN";
                break;
            case 5:
                barangay = "KAUSWAGAN";
                break;
            case 6:
                barangay = "BLAPINIG (POBLACION)";
                break;
            case 7:
                barangay = "MANTANGALE";
                break;
            case 8:
                barangay = "MAPUA";
                break;
            case 9:
                barangay = "SAN ALONZO";
                break;
            default:
                System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");
        }
        System.out.println("\t\t\t\t BARANGAY ADDRESS  : " + barangay);
        Email();
        }
        catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         "); 
            }
        }
    }
    private static void BINUANGAN()
    {
        stat = false;
        while(!stat)
        {
            try
            {
                System.out.println("\t\t\t\t                     __________________________________________");
                System.out.println("\t\t\t\t ADDRESS           :|                                          |");
                System.out.println("\t\t\t\t                    |           BINUANGAN BARANGAY LIST        |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                System.out.println("\t\t\t\t                    |                                          |");
                System.out.println("\t\t\t\t                    |      [ 1 ]   DAMPIAS                     |");
                System.out.println("\t\t\t\t                    |      [ 2 ]   KITAMBAN                    |");
                System.out.println("\t\t\t\t                    |      [ 3 ]   KITAMBIS                    |");
                System.out.println("\t\t\t\t                    |      [ 4 ]   MABINI                      |");
                System.out.println("\t\t\t\t                    |      [ 5 ]   MOSANGOT                    |");
                System.out.println("\t\t\t\t                    |      [ 6 ]   NABATAAN                    |");
                System.out.println("\t\t\t\t                    |      [ 7 ]   POBLACION                   |");
                System.out.println("\t\t\t\t                    |      [ 8 ]   VILDECONCHA                 |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                  System.out.print("\t\t\t\t BARANGAY #        : ");
                choose1 = input.nextInt();
                
                switch(choose1)
                {
                    case 1:
                        barangay = "DAMPIAS";
                        break;
                    case 2:
                        barangay = "KITAMBAN";
                        break;
                    case 3:
                        barangay = "KITAMBIS";
                        break;
                    case 4:
                        barangay = "MABINI";
                        break;
                    case 5:
                        barangay = "MOSANGOT";
                        break;
                    case 6:
                        barangay = "NABATAAN";
                        break;
                    case 7:
                        barangay = "POBLACION";
                        break;
                    case 8:
                        barangay = "VILDECONCHA";
                        break;
                    default:
                        System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");
                }
                System.out.println("\t\t\t\t BARANGAY ADDRESS  : " + barangay);
                Email();
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t       1"
                        + "1"
                        + "1     ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
            }
        }
    }
    private static void CDO()
    {
        stat = false;
        while(!stat)
        {
            try
            {
                System.out.println("\t\t\t\t                     __________________________________________");
                System.out.println("\t\t\t\t ADDRESS           :s|                                          |");
                System.out.println("\t\t\t\t                    |        CAGAYAN DE ORO BARANGAY LIST      |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                System.out.println("\t\t\t\t                    |                                          |");
                System.out.println("\t\t\t\t                    |       [ 1  ]     BULUA                   |");
                System.out.println("\t\t\t\t                    |       [ 2  ]     CARMEN                  |");
                System.out.println("\t\t\t\t                    |       [ 3  ]     KAUSWAGAN               |");
                System.out.println("\t\t\t\t                    |       [ 4  ]     OPOL                    |");
                System.out.println("\t\t\t\t                    |       [ 5  ]     BULUA                   |");
                System.out.println("\t\t\t\t                    |       [ 6  ]     CUGMAN                  |");
                System.out.println("\t\t\t\t                    |       [ 7  ]     PUERTO                  |");
                System.out.println("\t\t\t\t                    |       [ 8  ]     NAZARETH                |");
                System.out.println("\t\t\t\t                    |       [ 9  ]     LUMBIA                  |");
                System.out.println("\t\t\t\t                    |       [ 10 ]     BUGO                    |");
                System.out.println("\t\t\t\t                    |__________________________________________|");
                  System.out.print("\t\t\t\t BARANGAY #        : ");
                choose1 = input.nextInt();
                
                switch(choose1)
                {
                    case 1:
                        barangay = "BULUA";
                        break;
                    case 2:
                        barangay = "CARMEN";
                        break;
                    case 3:
                        barangay = "KAUSWAGAN";
                        break;
                    case 4:
                        barangay = "OPOL";
                        break;
                    case 5:
                        barangay = "CUGMAN";
                        break;
                    case 6:
                        barangay = "CUGMAN";
                        break;
                    case 7:
                        barangay = "PUERTO";
                        break;
                    case 8:
                        barangay = "NAZARETH";
                        break;
                    case 9:
                        barangay = "LUMBIA";
                        break;
                    case 10:
                        barangay = "BUGO";
                        break;
                    default:
                        System.out.println("\t\t\t\t            ⚠    NOT IN CHOICES! INPUT CORRECTLY !   ⚠         ");
                }
                
                System.out.println("\t\t\t\t BARANGAY ADDRESS  : " + barangay);
                Email();
            }
            catch(Exception ex )
            {
                String str = input.next();
                System.out.println("\t\t\t\t            ⚠    ONLY NUMBER ! PLEASE TRY AGAIN !    ⚠         ");
            }
        }
    }
}

