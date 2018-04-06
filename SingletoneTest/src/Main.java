public class Main {

    public static void main(String argsp[]) {

        long tmpTime;

        tmpTime = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            EarlyCreateObject.getInstance();
            EarlyCreateObject.reset();
        }
        System.out.println("미리 생성 " + (System.nanoTime() - tmpTime));



        tmpTime = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            SyncronizeObject.getInstance();
            SyncronizeObject.reset();
        }
        System.out.println("동기화   " + (System.nanoTime() - tmpTime));




        tmpTime = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            DoubleCheckObject.getInstance();
            DoubleCheckObject.reset();
        }
        System.out.println("더블체크  " + (System.nanoTime() - tmpTime));




    }
}
