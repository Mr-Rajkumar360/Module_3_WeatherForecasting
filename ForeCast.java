
public class ForeCast {
    private int MxTemp;
    private int MiTemp;
    private String Climate;
    private int Humidity;
   public  void setMxTemp(int a){
        this.MxTemp=a;
    }
    public void setMiTemp(int b){
        this.MiTemp=b;
    }
    public void setClimate(String s){
        this.Climate=s;
    }
    public void setHumidity(int c){
        this.Humidity=c;
    }
   public  int getMxTemp(){
        return MxTemp;
    }
   public  int getMiTemp(){
        return MiTemp;
    }
    public  int getHumidity(){
        return Humidity;
    }
   public String getClimate(){
        return Climate;
     }
}