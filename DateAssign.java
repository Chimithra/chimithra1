interface Date{
    void date(String d);
}
class Register{
    Date o = new Date() {
        @Override
        public void date(String d) {
            System.out.println("Date in Anonymous : "+d);
        }
    };
}
public class DateAssign {
    public static void main(String[] args) {
        Register r1 = new Register();
        Date1 r2 = new Date1();
        r2.showDate(r1.o);
    }
}
class Date1{
    void showDate(Date o){
        String d = "04/09/2000";
        o.date(d);
    }
}
