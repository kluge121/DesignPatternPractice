public class SyncronizeObject {

    private static SyncronizeObject syncronizeObject;

    private SyncronizeObject() {
    }

    public static synchronized SyncronizeObject getInstance() {

        if (syncronizeObject == null) {
            syncronizeObject = new SyncronizeObject();
        }
        return syncronizeObject;
    }

    public static void reset(){
        syncronizeObject = null;
    }

}
