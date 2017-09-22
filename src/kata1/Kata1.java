package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Person yo=new Person("Luis",new Date(97,7,1));
        System.out.println(yo.getName()+" tiene "+yo.getAge());
    }
}
