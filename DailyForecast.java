public class DailyForecast extends ForeCast{
    public void MaxAandMin(int a,int b) {
        System.out.println("Minimum temperature ="+a+" Celsius");
        System.out.println("Maximum temperature ="+b+" Celsius\n");
    }
    public void MaxAandMin( int c){
        System.out.println("Today's Humidity is ="+c+" (grams/m3)\n");
    }
   public  void MaxAandMin(String s){
        System.out.println("Today weather is ="+s+"\n");
    }
}