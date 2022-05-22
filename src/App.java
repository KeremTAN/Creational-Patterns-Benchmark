import AbstractFactoryPattern.*;
import BuilderPattern.*;
import CustomerPackage.GreatCustomer;
import CustomerPackage.StandartCustomer;
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
        for (int i=0; i<10; i++){
            x=r.nextInt(2);
            if (x==0) {
                Long startTime = System.currentTimeMillis();
                ACustomer c = new StandartCustomer("" + i, "" + i, "" + i, "" + i, 'X');
                Long stopTime = System.currentTimeMillis();
                calculateTime(startTime,stopTime, "NonePattern");
            }
            else {
                Long startTime = System.currentTimeMillis();
                ACustomer c = new GreatCustomer("" + i, "" + i, "" + i, "" + i, 'X');
                Long stopTime = System.currentTimeMillis();
                calculateTime(startTime,stopTime, "NonePattern");
            }
        }
        sb = new StringBuilder();

        //Builder
        for (int i=0; i<10; i++) {
            x = r.nextInt(2);
            if (x==0) {
                Long startTime = System.currentTimeMillis();
                ACustomer cus = CustomerBuilder.createCustomer("A", "B", "14342859028", "5855748487", 'E')
                        .buildCustomer();
                Long stopTime = System.currentTimeMillis();
                calculateTime(startTime,stopTime, "Builder");
            }
            else{
                Long startTime = System.currentTimeMillis();
                ACustomer cus = CustomerBuilder.createGreatCustomer("A", "B", "14342859028", "5855748487", 'E')
                        .buildCustomer();
                Long stopTime = System.currentTimeMillis();
                calculateTime(startTime,stopTime, "Builder" );
            }
        }
        sb = new StringBuilder();

       // Prototype
        ACustomer c = new StandartCustomer("Kerem", "Tan","11","999-999-99-99",'X');
        for (int i=0; i<10; i++) {
            x=r.nextInt(2);
            Long startTime = System.currentTimeMillis();
            ACustomer c2 = c.clone(x);
            Long stopTime = System.currentTimeMillis();
            calculateTime(startTime,stopTime, "Prototype");
        }
        sb = new StringBuilder();

        // Abstract Factory
        for(int i=0; i<10; i++) {
            x=r.nextInt(2);
            if(x==0) {
                Long startTime = System.currentTimeMillis();
                ACustomer cusOC = new StandartCustomerFactory().creatCustomer("" + i, "" + i, "" + i, "" + i, 'X');
                Long stopTime = System.currentTimeMillis();
                calculateTime(startTime,stopTime, "Abstract_Factory");
            }
            else {
                Long startTime2 = System.currentTimeMillis();
                ACustomer cusGC = new GreatCustomerFactory().creatCustomer("" + i, "" + i, "" + i, "" + i, 'X');
                Long stopTime = System.currentTimeMillis();
                calculateTime(startTime2,stopTime,"Abstract_Factory");
            }
        }
        sb = new StringBuilder();

        // Simple Factory
        for(int i=0; i<10; i++) {
            x=r.nextInt(2);
            Long startTime = System.currentTimeMillis();
            ACustomer cus = new CustomerSimpleFactory().createCustomer(x, "" + i, "" + i, "" + i, "" + i, 'X');
            Long stopTime = System.currentTimeMillis();
            calculateTime(startTime,stopTime, "Simple_Factory");
        }
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
