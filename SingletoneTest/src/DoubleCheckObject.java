public class DoubleCheckObject {

    private static volatile DoubleCheckObject doubleCheckObject;

    private DoubleCheckObject() {
    }

    public static DoubleCheckObject getInstance() {

        if (doubleCheckObject == null) {
            synchronized (DoubleCheckObject.class) {
                if (doubleCheckObject == null) {
                    doubleCheckObject = new DoubleCheckObject();
                }
            }
        }
        return doubleCheckObject;
    }

    public static void reset(){
        doubleCheckObject = null;
    }

}
