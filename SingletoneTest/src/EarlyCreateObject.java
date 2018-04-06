public class EarlyCreateObject {

    private static EarlyCreateObject earlyCreateObject = new EarlyCreateObject();

    private EarlyCreateObject() {
    }

    public static EarlyCreateObject getInstance() {
        return earlyCreateObject;
    }


    public static void reset() {
        earlyCreateObject = null;
    }
}
