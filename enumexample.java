enum week{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;}

public class enumexample {
    public static void main(String[] args) {
        for(week w:week.values()){
            System.out.println(w+" "+w.ordinal());
        }
        System.out.println(week.valueOf("FRIDAY"));
        System.out.println(week.valueOf("MONDAY").ordinal());
    }

}
