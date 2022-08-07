import java.util.ArrayList;
import java.util.List;

public class CodeTest {

    public void calc(int a, int limit_x) {
        int i;
        int x = 0;
        while (x <= (3 * limit_x)) {
            i = 1;
            if (x <= limit_x) {
                System.out.println("========= Multiples of A ========");

                while (x <= limit_x) {
                    x = a * i;
                    if (x <= limit_x)
                        System.out.println(x);
                    i++;
                }
            } else if ((x > limit_x) && (x <= (2 * limit_x))) {
                System.out.println("========= Multiples of A + 1 =========");
                while (x <= (2 * limit_x)) {
                    x = (a + 1) * i;
                    if (x <= (2 * limit_x))
                        System.out.println(x);
                    i++;
                }
            } else {
                System.out.println("========= Multiples of A + 2 =========");
                while (x < (3 * limit_x)) {
                    x = (a + 2) * i;
                    if (x <= (3 * limit_x))
                        System.out.println(x);
                    i++;
                }
            }
        }
    }

    public void calcMultiples(int a, int limit_x) {

        System.out.println("========= Multiples of A ========");

        int i = 1;
        int x = 0;
//        loop iterates in multiples A until X
        while (x <= limit_x) {
            x = a * i;
            if (x <= limit_x)
                System.out.println(x);
            i++;
        }
        System.out.println("========= Multiples of A + 1 =========");

        i = 1;
        x = 0;
//        loop iterates in multiples A + 1 until 2X
        while (x <= (2 * limit_x)) {
            x = (a + 1) * i;
            if (x <= (2 * limit_x))
                System.out.println(x);
            i++;
        }

        System.out.println("========= Multiples of A + 2 =========");

        i = 1;
        x = 0;
//        loop iterates in multiples A + 3 until 3X
        while (x <= (3 * limit_x)) {
            x = (a + 2) * i;
            if (x <= (3 * limit_x))
                System.out.println(x);
            i++;
        }
    }

    public static void main(String[] args) {
        CodeTest ct = new CodeTest();
//        Implementation 1
        ct.calc(5, 50);

//        Implementation 2
        ct.calcMultiples(5, 50);
    }
}
