package orgexamplesandbox.inheritance.aggregation;

public class Driver {

    public static void main(String[] args) {
        Salad salad = new Salad("tons", "lots", "a few", "lots");
        System.out.println(salad);

        Salad anotherSalad = new Salad();
        System.out.println(anotherSalad);


    }
}
