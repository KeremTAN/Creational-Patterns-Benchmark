# Creational Patterns Benchmark Testing

## Statement of Work:
<b>First of all, I would like to remind you that our main priority when using Design Patterns is to write a sustainable and clean code instead of gaining performance</b>.

Our aim in this project is to try to look at creational design patterns from a different perspective.
It is to try to understand how our project can affect our performance, as well as disrupting the concepts such as sustainable, clean code, etc. in the wrong use of creational design patterns.

Our main method in App.java measures the total cost of objects produced with each creational design pattern. </br>
Our main method in App2.java measures the instantaneous cost of each object produced with each creational design pattern. </br>

In order to make these observations, we wrote 2-3 concrete classes that can be produced in different ways. </br>
These classes are inside the Customer package.</br>

In the images below, there are a few examples of the graphics we get when we run our App.java class.</br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a1.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a2.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a3.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a4.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a5.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a6.png) </br>

## Summary of Comparison Results
In the tests we conducted at this stage, although there were exceptional results, as a result of our observations, </br>
the creational design pattern with the highest production cost among the creational design patterns was the Builder Design Pattern. </br>
The creational design pattern with the second highest production cost is Abstract Factory Design Pattern, </br>
and the third highest creational design pattern is Simple Factory Design Pattern. </br>
According to our observations, the creational design pattern with the lowest being production cost was the Prototype Design Pattern. </br>

## Predictions About The Comparison Results </br>

   <b>Builder Design Pattern;</b> </br>
   As it is known, it allows us to produce an object that is different and with the flexibility we want. </br>
 The builder design pattern first creates its own object in order to provide us with the flexibility of production, </br>
and we can make any field adjustments we want with this created builder object. </br>
After setting the fields we want, we produce the object we want to produce by performing the build process and </br>
we set all fields of builder object to the relevant fields of the object we produced. </br>
In order to produce our object with the flexibility we want with the builder design pattern, </br>
we need to produce 2 objects at a time and adjust the all fields of these objects to each other. </br>
These may have increased more our production cost than othercreational design patterns. </br>

   <b>Abstract Factory Design Pattern;</b> </br>
   As it is known, it is used when we need to produce a large number of different or complex objects. </br>
 For each object we want to produce in abstract factory design pattern, we write a class that is responsible for producing that object. </br>
Thus, we can add or remove a new class to our system very quickly and flexibly. </br>
In addition, we do not need to make any fixing on our system for these changes. </br>
However, every time we produce an object with abstract factory design pattern, we actually produce 2 objects. </br>
Therefore, the cost of producing objects with abstract factory design pattern may have been the second highest cost. </br>

   <b>Simple Factory Design Pattern;</b>  </br>
   As it is known, it is used when we need to produce a large number of different objects. </br>
   However, unlike the abstract factory design pattern, instead of producing a different object responsible for </br>
the production of that object, a single class responsible for production is defined for the production of each object. </br>
The object derived from this class responsible for production produces the necessary object through its own decision mechanism. </br>
The reason why the simple factory design pattern produces lower cost objects than previous creational design patterns may be that </br>
it produces and uses an object responsible for production only once, instead of producing another object each time to produce an object. </br>
However, the following detail should not be overlooked. </br>
If the number of decision mechanisms in the simple factory design pattern was increased, since each decision structure would be controlled. </br>
Therefore, there may increased the total production cost of objects for the simple factory design more than the previous patterns. </br>
In addition, each time a new class is added or a class is removed, the class responsible for generating the objects also needs to be corrected. </br>

   <b>Prototype Design Pattern;</b>
   As it is known, if the objects we will produce are based on a certain template, allows us to clone an object </br>
which we have produced before and use it by changing only the necessary fields instead of producing the a new object. </br>
Unlike other creational design patterns, since it produces new objects by cloning an existing object instead of producing an object from </br>
scratch that may be reason of the lowest total cost of producing objects compare by other creational patterns.




