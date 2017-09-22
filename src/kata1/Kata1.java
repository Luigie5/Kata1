package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    
    public static void main(String[] args) {
        Calendar fecha=GregorianCalendar.getInstance();
        fecha.set(1997,7,1);
        Person yo=new Person("Luis",fecha);
        System.out.println(yo.getName()+" tiene "+yo.getAge());
    }
}
