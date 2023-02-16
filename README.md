# Creational Patterns Benchmark Testing
* [Statement of Work](#statement)
   * [Graphics of App.java](#graphics)
* [Summary of Comparison Results](#summary)
* [Predictions About The Comparison Results](#prediction)
   * [Builder Design Pattern](#builder)
   * [Abstract Factory Design Pattern](#abstract)
   * [Simple Factory Design Pattern](#simple)
   * [Prototype Design Pattern](#prototype)
* [Requirements to Run This Project](#requirements)

<a name="statement"></a>
## Statement of Work:
&nbsp; <b>First of all, I would like to remind you that our main priority when using Design Patterns is to write a sustainable and clean code instead of gaining performance</b>.

&nbsp; Our aim in this project is to try to look at creational design patterns from a different perspective. It is to try to understand how our project can affect our performance, as well as disrupting the concepts such as sustainable, clean code, etc. in the wrong use of creational design patterns. </br>

&nbsp; Our main method in <b>App.java</b> measures the total cost of objects produced with each creational design pattern. <p>
&nbsp; Our main method in <b>App2.java</b> measures the instantaneous cost of each object produced with each creational design pattern. </br>

&nbsp; In order to make these observations, we wrote 2-3 concrete classes that can be produced in different ways. </br>
&nbsp; These classes are inside the Customer package.</br> </br>

<a name="graphics"></a>
In the images below, there are a few examples of the graphics we get when we run our <b>App.java</b> class.</br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a1.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a2.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a3.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a4.png) </br>

![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a5.png) </br>

<!-- ![UML](https://github.com/KeremTAN/CreationalPatternsBenchmarkTesting/blob/master/img/a6.png) </br> -->
</br>

<a name="summary"></a>
## Summary of Comparison Results
&nbsp; In the tests we conducted at this stage, although there were exceptional results, as a result of our observations, the creational design pattern with the highest production cost among the creational design patterns was the Builder Design Pattern. </br>
&nbsp; The creational design pattern with the second highest production cost is Abstract Factory Design Pattern, and the third highest creational design pattern is Simple Factory Design Pattern. </br>
&nbsp; According to our observations, the creational design pattern with the lowest being production cost was the Prototype Design Pattern. </br></br>


<a name="prediction"></a>
## Predictions About The Comparison Results </br>

<a name="builder"></a>
<b>Builder Design Pattern;</b> </br>
&nbsp; As it is known, it allows us to produce an object that is different and with the flexibility we want. </br>
&nbsp; The builder design pattern first creates its own object in order to provide us with the flexibility of production, and we can make any field adjustments we want with this created builder object. After setting the fields we want, we produce the object we want to produce by performing the build process and we set all fields of builder object to the relevant fields of the object we produced. </br>
&nbsp; In order to produce our object with the flexibility we want with the builder design pattern, we need to produce 2 objects at a time and adjust the all fields of these objects to each other. </br>
&nbsp; These may have increased more our production cost than othercreational design patterns. </br>

<a name="abstract"></a>
<b>Abstract Factory Design Pattern;</b> </br>
&nbsp; As it is known, it is used when we need to produce a large number of different or complex objects. </br>
&nbsp; For each object we want to produce in abstract factory design pattern, we write a class that is responsible for producing that object. </br>
&nbsp; Thus, we can add or remove a new class to our system very quickly and flexibly. In addition, we do not need to make any fixing on our system for these changes. </br>
&nbsp; However, every time we produce an object with abstract factory design pattern, we actually produce 2 objects. Therefore, the cost of producing objects with abstract factory design pattern may have been the second highest cost. </br>

<a name="simple"></a>
<b>Simple Factory Design Pattern;</b>  </br>
&nbsp; As it is known, it is used when we need to produce a large number of different objects. </br>
However, unlike the abstract factory design pattern, instead of producing a different object responsible for the production of that object, a single class responsible for production is defined for the production of each object. </br>
&nbsp; The object derived from this class responsible for production produces the necessary object through its own decision mechanism. </br>
&nbsp; The reason why the simple factory design pattern produces lower cost objects than previous creational design patterns may be that it produces and uses an object responsible for production only once, instead of producing another object each time to produce an object. However, the following detail should not be overlooked. If the number of decision mechanisms in the simple factory design pattern was increased, since each decision structure would be controlled. </br>
&nbsp; Therefore, there may increased the total production cost of objects for the simple factory design more than the previous patterns. </br>
&nbsp; In addition, each time a new class is added or a class is removed, the class responsible for generating the objects also needs to be corrected. </br>

<a name="prototype"></a>
<b>Prototype Design Pattern;</b> </br>
&nbsp; As it is known, if the objects we will produce are based on a certain template, allows us to clone an object which we have produced before and use it by changing only the necessary fields instead of producing the a new object. </br>
&nbsp; Unlike other creational design patterns, since it produces new objects by cloning an existing object instead of producing an object from scratch that may be reason of the lowest total cost of producing objects compare by other creational patterns.

<a name="requirements"></a>
## Requirements to Run This Project
&nbsp; This project was prepared with jdk 16. The relevant settings are written in the pom.xml file. You can compile this project with Maven.

&nbsp; Two python files works for the creation of graphics. You must have python3 installed on your computer. Your Python needs some libraries to create the graphics. The terminal / console commands required for the installation of the libraries you need are written below.
```bash
pip install pandas
```
```bash
pip install numpy
```
```bash
pip install seaborn
```
```bash
pip install matplotlib
```




