public class Driver {

    public static void main(String[] args) {

        LazySingleton inst1 =  LazySingleton.getInstance();
        inst1.printData();
        LazySingleton inst2 = LazySingleton.getInstance();
        System.out.println(inst2.hashCode());
        inst2.printData();
    }

}
