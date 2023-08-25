package DayPeriod.DayPeriod;

//public class App {
//  public static void main(String[] args) {
//    System.out.println("Hello World!");
//  }
//}
public class Main {
	public static void main(String[] args) {

        DayPeriod getperiod= new DayPeriod();
        java.util.Date date=new java.util.Date();
        System.out.println("period: "+getperiod.get_period(date));
	}
}