/**
 * Что выведется в консоль?
 */
public class task11 {
    public static void main(String[] args) {
        new ClassExample6().method(null);
    }
}
class ClassExample5 {
    public final void method() {
        System.out.println("print5");
    }
}

class ClassExample6 extends ClassExample5 {
    public void method() {
        System.out.println("print6");
        super.method();
    }
}
