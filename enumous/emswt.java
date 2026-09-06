package enumous;
enum day
{
    sunday,monday,friday,saturday;
}
public class emswt {
    public static void main(String[] args) {
        day ob = day.friday;
        switch (ob) {
            case sunday:
                System.out.println("holiday");
                break;
            case monday:
                System.out.println("no holiday");
                break;
            case friday:
                System.out.println("workingday");
                break;         
            default:
                System.out.println("may bee");
                break;
        }
    }
   
}
