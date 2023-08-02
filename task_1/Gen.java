package HomeWorkOOP_4.task_1;

public class Gen <T,V,E>{

    private T ob;
    private V ob2;
    private E ob3;

    public Gen(T ob,V ob2, E ob3) {
        this.ob=ob;
        this.ob2=ob2;
        this.ob3=ob3;
    }

    public T getOb() {
        return ob;
    }

    public V getOb2() {
        return ob2;
    }

    public E getOb3() {
        return ob3;
    }

    public void printElement(){
        System.out.println("тип Т - " + ob.getClass().getName());
        System.out.println("тип V - " + ob2.getClass().getName());
        System.out.println("тип E - " + ob3.getClass().getName());
    }
    
}
