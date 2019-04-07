public class CalculatorDemo {


   int count=0;

    public void add() {
        System.out.println("inside add");

    }

    public void sub() {
        add();
        System.out.println("inside sub");

    }

    public static void div() {
        new CalculatorDemo().add();
        System.out.println("inside div");

    }


    public static void main(String[] args) {
        CalculatorDemo calculatorDemo = new CalculatorDemo(); //object created
        calculatorDemo.add();
        calculatorDemo.sub();
        div();
    }


}
