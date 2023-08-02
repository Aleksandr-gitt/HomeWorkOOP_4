package HomeWorkOOP_4.task_1;

public class GenDemo {
    public static void main(String[] args) {

        Gen<Integer,Double,String> iGen = new Gen<Integer,Double,String>(25, 25.25, "25.25");
        iGen.printElement();
        int t = iGen.getOb();
        System.out.println("Значение " + t); 
        Double d = iGen.getOb2();
        System.out.println("Значение " + d);
        String str = iGen.getOb3();
        System.out.println("Значение " + str);
       
    }
    
}
