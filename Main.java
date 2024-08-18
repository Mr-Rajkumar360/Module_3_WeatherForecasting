import java.util.Scanner;
public class Main  {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        DailyForecast o = new DailyForecast();
        o.setClimate("Sunny");
        o.setMxTemp(41);
       o.setMiTemp(30);
       o.setHumidity(10);
        int a=o.getMiTemp();
         int b=o.getMxTemp();
         int c=o.getHumidity();
         String s=o.getClimate();
          int choice=0;
        System.out.println(" \n\n   **** Welcome to Weather Forcasting System ****    \n");     
        while(choice!=4){
          System.out.println("Choose your Options \n 1. Maximum-Temperature & Minimum-Temperature \n 2. Today's weather \n 3. humidity \n 4.Exit");
          choice=sc.nextInt();
          switch(choice){
            case 1: o.MaxAandMin(41,31);
                     break;
            case 2: o.MaxAandMin(s);
                      break;
            case 3: o.MaxAandMin(c);
                    break;
            case 4: System.out.println("Thankyou for visiting .....^_^\n");
                     break;
            default:System.out.println("You entered  the Wrong  Option  \n");
                    break;
          }
        }
    }
}
