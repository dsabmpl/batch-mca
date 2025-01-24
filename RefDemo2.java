import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;

public class RefDemo2 {
    public static void main(String[] args) {
        // Wrapper Types
        int x = 10; // value type (Data)

        Integer y = 20; // Wrapper Type or Reference Type (Data + Methods)
        byte r = y.byteValue();
        String g = y.toString();
        Byte b = 100;
        Short r2 = 10000;
        Integer z = 5435435;
        Long bb = 88884444L;
        Character t = 'A';
        Boolean bb1 = true;
        LinkedList<Integer> l = new LinkedList<>();

        Date date = new Date();
        Locale locale = new Locale("hi", "IN");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        // System.out.println(date);
        System.out.println(df.format(date));

        BigInteger bi = new BigInteger("645654656345435435345345435435");
        BigInteger b2 = new BigInteger("675485684375678436578634785323332");
        BigInteger b3 = bi.add(b2);
        System.out.println(b3);

    }
}
