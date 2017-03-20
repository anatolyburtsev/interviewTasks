/**
 * Что выведется в консоль?
 */
public class task10 {
    public static void main(String[] args) {
        new ClassExample4().method(null);
    }

    class ClassExample4 {
        public void method(Object obj) {
            System.out.println("It's object!");
        }
        public void method(String str) {
            System.out.println("It's string!");
        }
        public void method(Integer in) {
            System.out.println("It's integer!");
        }
    }
}
