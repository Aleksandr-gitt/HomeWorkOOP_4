package HomeWorkOOP_4.task_2;

public class GenMain {
    public static void main(String[] args) {

        Gen gen = new Gen();
        
        Integer [] gList = {5,12,234,34,567,2345};
        String [] sList = {"пять","семь","одиннадцать","девяносто девять"};
 
        gen.<Integer>printArray(gList);
        gen.<String>printArray(sList);

    }
    
}
