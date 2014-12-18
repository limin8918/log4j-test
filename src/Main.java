import test.TestA;
import test.TestB;
import test.TestC;
import org.apache.log4j.PropertyConfigurator;
import test.TestD;

public class Main {

    public static void main(String[] args) {
        PropertyConfigurator.configure("./config/log4j.properties");

        TestA a = new TestA();
        a.outputLog();

        TestB b = new TestB();
        b.outputLog();

        TestC c = new TestC();
        c.outputLog();

        TestD d = new TestD();
        d.outputLog();

        System.out.print("finish");
    }
}
