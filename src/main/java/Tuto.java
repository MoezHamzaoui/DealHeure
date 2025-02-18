import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Tuto {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        Object o1 = new Object();
        Object o2 = o1;
        m.put(o1, 1);
        m.put(o2, 2);

        System.out.println("Map " + m);
        System.out.println("object O1 " + m.get(o1));
        System.out.println("object O2 " + m.get(o2));
    }

}
