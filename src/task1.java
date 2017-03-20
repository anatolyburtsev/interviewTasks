/**
 * Что выведется в консоль?
 */
public class task1 {
    public static void main(String[] args) {
        new ClassExample2.method();
    }

    class ClassExample1{
        private void method() {
            System.out.println("print1");
        }
    }
    class ClassExample2 extends ClassExample1 {
        @Override
        public void method() {
            System.out.println("print2");
        }
    }
}
