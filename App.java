import AbstractFactoryPattern.*;
import BuilderPattern.*;
import CustomerPackage.GreatCustomer;
import CustomerPackage.StandartCustomer;
import Python.PyInterpreter;
import SimpleFactoryPattern.CustomerSimpleFactory;
import CustomerPackage.ACustomer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class App {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws CloneNotSupportedException {
        Random r = new Random();
        int x;

        //None Pattern
        Long startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++){
            x=r.nextInt(2);
            if (x==0) {
                ACustomer c = new StandartCustomer("" + i, "" + i, "" + i, "" + i, 'X');
            }
            else {
                ACustomer c = new GreatCustomer("" + i, "" + i, "" + i, "" + i, 'X');
            }
        }
        Long stopTime = System.currentTimeMillis();
        calculateTime(startTime,stopTime, "NonePattern");

        sb = new StringBuilder();

        //Builder
        Long startTime2 = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            x = r.nextInt(2);
            if (x==0) {
                ACustomer cus = CustomerBuilder.createCustomer("" + i, "" + i, "" + i, "" + i, 'X')
                        .buildCustomer();
            }
            else{
                ACustomer cus = CustomerBuilder.createGreatCustomer("" + i, "" + i, "" + i, "" + i, 'X')
                        .buildCustomer();
            }
        }
        Long stopTime2 = System.currentTimeMillis();
        calculateTime(startTime2,stopTime2, "Builder" );
        sb = new StringBuilder();

       // Prototype
        ACustomer c = new StandartCustomer("Kerem", "Tan","11","999-999-99-99",'X');
        Long startTime3 = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            x=r.nextInt(2);
            ACustomer c2 = c.clone(x);
        }
        Long stopTime3 = System.currentTimeMillis();
        calculateTime(startTime3,stopTime3, "Prototype");
        sb = new StringBuilder();

        // Abstract Factory
        Long startTime4 = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            x=r.nextInt(2);
            if(x==0) {
                ACustomer cusOC = new StandartCustomerFactory().creatCustomer("" + i, "" + i, "" + i, "" + i, 'X');
            }
            else {
                ACustomer cusGC = new GreatCustomerFactory().creatCustomer("" + i, "" + i, "" + i, "" + i, 'X');
            }
        }
        Long stopTime4 = System.currentTimeMillis();
        calculateTime(startTime4,stopTime4,"Abstract_Factory");
        sb = new StringBuilder();

        // Simple Factory
        Long startTime5 = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            x=r.nextInt(2);
            ACustomer cus = new CustomerSimpleFactory().createCustomer(x, "" + i, "" + i, "" + i, "" + i, 'X');
        }
        Long stopTime5 = System.currentTimeMillis();
        calculateTime(startTime5,stopTime5, "Simple_Factory");

        new PyInterpreter().execPy();
    }

    private static void calculateTime(Long startTime, Long stopTime, String pattern) {
        Long time = (stopTime)-(startTime);
        String s = pattern+".csv";
        try (PrintWriter writer = new PrintWriter(s)) {
            sb.append(pattern);
            sb.append(',');
            sb.append(time);
            sb.append('\n');
            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
