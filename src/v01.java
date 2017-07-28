import com.sun.org.apache.xpath.internal.operations.And;
import com.tutorial.caveOfProgramming.Ocean.Fish;
import com.tutorial.caveOfProgramming.Ocean.Seaweed;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Eng - Mohamed Bakr on 7/26/2017.
 */
public class v01 {
    public static void main(String args[]) throws IOException, myFirstException {
        /* tutorials 0 to 7 taking input:
                // create a scanner object:
                Scanner input = new Scanner(System.in);
                // take input and put it in an int variable
                int myInt = input.nextInt();
                // print the input:
                System.out.println("This is: " + myInt);
         */
        /* tutorial 8 to 9: do while:
               Scanner input = new Scanner(System.in);
               int num;
               do{
                   System.out.println("Enter number:\n");
                   num = input.nextInt();
               }while(num != 0);
               System.out.println("The line is finished");
       */
        /* tutorial 10 to 11: arrays and allocation:
                int value = 7;
                int[] values = new int[3];
                for(int i = 0 ; i < 3 ; i++){
                    values[i] = i;
                }
                for(int i = 0 ; i< 3 ; i++){
                    System.out.println("values[" + i + "] = " + values[i]);
                }
         */
        /* tutorial 12: Arrays of Strings:
                String[] strArr ={"Mohamed","Hosny","Mohamed","Bakr"}; // the moral of the story is that when you allocate you can't assign the values all at once
                // but when you create it with the values the java compiler doesn't complain...weird...come back for it later!!!
                Scanner userInput = new Scanner(System.in);
                for(int i = 0 ; i<3 ; i++){
                    System.out.println(strArr[i]);
                }
                String[] strings = new String[3];
                for(int i = 0 ; i < 3 ; i++){
                    System.out.println("Enter 3 names:");
                    strings[i] = userInput.nextLine();
                }
                System.out.println("The names are:");
                for(int i = 0 ; i < 3 ; i++){
                    System.out.println(strings[i]);
                }

                // there is a better way to loop throw an array with a for loop:
                for(String str:strings){
                    System.out.println(str);
                }
                // String text; this allocates a reference to a string... a pointer to be exact
                // so by that notion that means that String[] messeges; for example is not a reference to strings but actual a reference of references to strings
                // they all in initialized with null;
         */
        /* tutorial 12: multi dimensional arrays:
                int[] values = {0};
                int[][] grid = new int[3][4];
                int element = 0;
                for(int i = 0; i<grid.length ; i++){
                    for(int j = 0 ; j<grid[0].length ; j++){
                        grid[i][j] = element;
                        element++;
                    }
                }for(int i = 0; i<grid.length ; i++){
                    for(int j = 0 ; j<grid[0].length ; j++){
                        System.out.print(grid[i][j]+ "\t");
                    }
                    System.out.println();
                }
                /// ok then: when we do this: String[][] strings = new String[3][4]; that means we create an array of references to references to references(initialize by null)

         */
        /* tutorial 13: classes and objects:
               Person person1 = new Person();
                person1.age = 10;
                person1.name = "Mohamed Bakr";
                System.out.println("person1:\n\tname: " + person1.name);
                System.out.println("\tage: " + person1.age);
                person1.speak();
                // Now for the heck of it will create an array of persons and make the user initialize them then print them formatted
                Person[] people = new Person[3];
                people[0].age = 2;
                people[0].name = "Hello";
                !!! there is a weird problem when assigning a string to a String object in an other Object need to check that out later...ASAB!
                !!! TODO: I think I know the problem in here.....I need to search about creating an array of Objects in java.....Try that tomorrow.
         */
        /* tutorial 14 to 18: typical stuff on setters and getters constructors and method parameters basically nothing new:
                Machine sony = new Machine();
                new Machine("Hello");
                new Machine("Hello",10);
                // but as a side note IntelliJ is awesome with the constructors
                // TODO: learn IntelliJ shortcuts
         */
        /* tutorial 19: on the static keyword: very important:
                very exciting:
                so the gist of it is that the any instance or a method declared with the static keyword it makes it belong to the class not and object that means
                if we call a static show() method in the class Hello to use it we type Hello.show() and the same goes for the variables.
                an example of this I've seen before it the Math class where pretty much every method or variable is static because when we use it we type
                Math.PI;
                things to remember:
                    1.they can use static variables in them and that is very obvious why
                    2.if you use a non-static variable in a static method the compiler will complain
                    3.but on the contrary we can use static variables inside non-static methods it somewhat enhances the experience
                    4.constant variables:
                        1. can not be assigned outside the class
                        2. when we 9use them the syntax is something like that: public final static MY_CONSTANT = 3;
                    5.we can count the number of objects we create from a class with it
                    6.this guy is way a head of me... another clever use of static variables in to assign an id for each object

                System.out.println("Testing the object counter: counter = " + Thing.countObjects);
                Thing thing1 = new Thing();
                System.out.println("test result: counter = " + Thing.countObjects);
                Thing.description = "Hello, people";
                thing1.name = "Stuff";
                Thing.info();
                thing1.fullInfo();

          */
        /*
         tutorial 20: string builders and string formatting: a string builder is most likely and arrayList because of the append method it has...for now it's
         just a guess.
                StringBuilder sb = new StringBuilder("");
                sb.append(" ");
                sb.append("Hello, Suckers");
                sb.append(" ");
                sb.append(",that is it I have nothing more!!");

                String resultantString = sb.toString();
                System.out.println(resultantString);
                // StringBuffer: that is a class that is a thread safe(???) version of StringBuilder

                /// Advance String Formatting:
                int i = 4;
                System.out.printf("%-10d",i);
         */
        /* tutorial 21:
            Frog frog1 = new Frog("Freddy",20);
            System.out.println(frog1); // the println function invoke the toString() method in the object if it doesn't find it i return the name of the class
            // with a hash code
         */
        /* tutorial 22:
            // final class like the String class can not be extended
         */
        /* tutorial 23: interfaces: oh boy... this is an important one:
            // interfaces are used as a contract
            // all I see is that it is used to write less code, and another option is to make an object of the class that implements it that only has access
            // to the functions of the interface... on a side note I remember that interfaces are also useful as we can make interfaces between various objects
            // and then group them in on data structure.... more on that later......
            // ok...another note is that is you can access instance variables with an interface
            // like what we have down there... Showable show =  new Machine();...you can't do this show.id = ..... you only have access to methods
            // TODO: to engage more with interfaces.... get some tutorials on the "Collections" framework.
            // TODO: watch more videos on -> interfaces
            // some people design whole programs by using interfaces.... see how that can be done.
            // The code:

            Showable show = new Machine();
            outputShow(show);
            Person mohamed = new Person();
            mohamed.id = 20;
            outputShow(mohamed);

         */
        /* tutorial 24: packages:
            // you can not have two classes with the same name inside the same package.
            // the convention of com.blahblah.bahlol.class is used to generate unique package names so that is can be used by other developer without conflicting
            // The code:
            Fish fish = new Fish();
            Seaweed seaweed = new Seaweed();
         */
        /* tutorial 25: public,private,protected:
            // public for instance variables is a bad practice
               public final static ID = 32; this is acceptable behavior public constants for the class
            // protected the variable is shown within the same class or package only and accessable from child classes
            // no access keyword that means in has package visibility

         */
        /* tutorial 26: Polymorphism
            // is goes over the same notion of the plant/tree problem not really that hard
            // just when you write something like that: Plant plant = new Tree(); as your self: "Every Tree 'is a' Plant" if the answer is yes then the expression
            // is legal
         */
        /* tutorial 27: Encapsulation and the API Docs:
                // TODO: see how to generate automatic getters and setters in IntelliJ IDE

         */
        /* tutorial 28: Numerical Casting:
            // Very simple.... already know that!
         */
        /* tutorial 29: Upcasting and Downcasting:
            // OK... as a concept it build on the concept of 'is a' and also the idea of that the when you create a new object the memory of that object is reserved
            // in the heap and what is put inside the object name is the reference to that block in memory it is essentially a pointer
            // NOTE: he said a very good sentence that clarifies the concept:
                   // the type of the variable determines what methods you could call but the type of the objects determines which implementation of these methods will
                   // be called....(good brief sentence for polymorphism)
            // Downcasting:
             Machine machine3 = new Camera(); // so in here the machine3 has a reference to a camera object
             // to call the snap() method in camera you can use this trick but a kind think it's kind of redundant and dump but here it is:
             Camera camera3 = (Camera)machine3;
             // know you can use the snap() method on camera3
             // NOTE: if you cast a reference to the parent object to a child object and try to use the methods of the child you get an exception:
             // called a java.lang.ClassCastException

         */
        /* tutorial 30: Using Generics: I'm kinda excited for this:
            // a generic class is a class that can work with other objects:
            // TODO: how to use an arrayList class in its generic form: www.caveofprogramming.com look for arrayLists
            ////////////// Before java 5 ////////////
            ArrayList list = new ArrayList();
            list.add("Apple");
            list.add("Orange");
            list.add("Bananas");

            String item = (String) list.get(1);

            for(int i = 0 ; i< 3 ; i++){
                System.out.println((String) list.get(i));
            }
            //////////// After java 5 ////////////////
            ArrayList<String> strings = new ArrayList<String>();
            strings.add("Cat");
            strings.add("pet");
            strings.add("bat");
            for(int i = 0 ; i< 3 ; i++){
                System.out.println(strings.get(i));
            }
            // TODO: there can be more than more than one type of argument.......Check caveofprogramming.com for collections framework to have experience with this sort of stuff.

            HashMap<Integer,String> map = new HashMap<>();

            ////////////// java 7 //////////////
            ArrayList<Person> newList = new ArrayList<>();

         */
        /* tutorial 31: Generics and Wildcards:
            // TODO: look for method overloading with ArrayList generics
            // TODO: see another video on generics and wild card in real life
            // NOTE: arrayLists of a certain parent class doesn't have any relation with an arrayList of child classes
            // wild cards are like this: when you pass ArrayList<?> the question mark is the wild card that means it can accept an arraylist of type
            // but to iterate over it you need to use the Object class.
            // The Code:
            ArrayList<String> list = new ArrayList<String>();
            list.add("Hello");
            list.add("I've been high");
            list.add("I've been low");
            list.add("moved around every single row 0;");

            ArrayList<Machine> machineList = new ArrayList<Machine>();
            machineList.add(new Machine());
            machineList.add(new Machine());
            showMachineList(machineList);
            ShowAnyList(machineList);


        */
        /*tutorial 32: Anonymous Classes:
            // NOTE: it is used with event listeners and stuff like that.......
            // what is it? So, when we define a class and when we create an object of it and upon its creation we want to extend its behavior or @Override
            // some of its method more like making a child class of it but just one time and that class doesn't have a name that's why its is called an anonymous class
            // The Code:
            Plant myPlant = new Plant(){
            @Override
            public void show(){
                System.out.println("What's up!!");
            }
            };
            myPlant.show();
            // Know here is the weird part: so we can override the interface methods more like implementing it on the spot
            Rose myRose = new Rose(){
                @Override
                public void beautiful(){
                    System.out.println("Hello, there...");
                }
            };
            myRose.beautiful();
         */
        /* tutorial 33: Reading text from files:
                String fileName =  "C:\\Users\\Eng - Mohamed Bakr\\Desktop\\names.txt";
                File myFile = new File(fileName);
                // TODO: know the traditional way to read and write to a file the Buffered Class,FileReader....
                // for now I'll use a Scanner object:
                Scanner fileReader = new Scanner(myFile);
                System.out.println(fileReader.nextInt());
                fileReader.nextLine(); // so this is for the '\n" new line symbol as it is read as a new line altogether.
                while(fileReader.hasNextLine()){
                    String buffer = fileReader.nextLine();
                    System.out.println(buffer);
                }

                fileReader.close();

         */
        /* tutorial 34 to 37: they're all about exception handling which I've dealt with way to much
            // I'm just gonna watch them and if something catches my eye I'll make note of it.....
            // NOTE: I've never seen that you can create your own exception... gonnna try that.
            // after implementing the gist of the idea is that you create a class of the exception you want to make pass the argument to the super constructor
            // use try/catch or declare the exception beside the main function...after that you can use it.
            // The Code:
            int myCode = ;
            if(myCode != 0){
                throw new myFirstException("just trying some shit!!!");
            }else{
                System.out.println("Running Smoothly");
            }
         */
        /* tutorial 38: abstract classes:
            // Now, we know that interfaces are used for the as a contract with a certain class or multiple classes to implement some functions that are
            // generalized between them.
            // for an ABSTRACT CLASS the story a little similar but here we initiate a class to be abstract when we know we'll never make objects from it
            // and yet we have some functions with implementations we want to inherit from that class and some functions are declared abstract for us so we must
            // @Override them these functions kinda do the same thing as an interface would as we don't define there body in the abstract class.
         */
        /* tutorial 39: Using FileReader class:
            File file = new File("text.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
         */
        /* tutorial 40: Java 7 Try with resources:
            // used to minimize the amount of try/catch statements in the code.
            // kind handy with files
            // the code:
            try( Temp temp = new Temp()){
           }catch(Exception e){
               e.printStackTrace();
           }// this is try with resources
            File file = new File("text.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder("");
            String line;
            while((line = br.readLine()) != null){
                sb.append(line);
            }
            System.out.println(sb);
            br.close();
         */
        /* tutorial 41: Writing text files:
            File file = new File("text.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder("");
            String line;
            while((line = br.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }
            System.out.println(sb);
            br.close();
         */
        /* tutorial 42: Equals:
            // NOTE: the == operator tells you if the two references point to the same object or note of it's used with instance variables it tells you if the difference
            //       between the variables equal zero of not
            // LOG: let's try to implement the equal method before hearing what it is.
            // TODO: Find out how the equals() method works
            // TODO: know how does the hashcode works
            // NOTE: always use the equals method when equating Objects
            // The code:
            Donkey d1 = new Donkey("dodo",18);
            Donkey d2 = new Donkey("fofo",19);
            System.out.println(d1.equal(d2));

         */
        /* tutorial 43: Inner Classes:
            // NOTE: not used as much but they're used for logical grouping
            // TODO: to better understand this there is a video on the collections framework for implementing the iterable interface
            // the code:
            Robot robot = new Robot(10);
            robot.start();
         */
        /* tutorial 44: Enum
            // TODO: I feel burnout right now this is enough and come back later.....
         */









    }


    public static void showList(ArrayList<String> list){
        for(String string:list){
            System.out.println(string);
        }
    }
    public static void ShowAnyList(ArrayList<? extends Machine> list){
        for(Object element: list){
            System.out.println(element);
        }
    }
    public static void ShowAnyList1(ArrayList<? super Camera> list){
        for(Object element: list){
            System.out.println(element);
        }
    }
    public static void showMachineList(ArrayList<Machine> list){
        for(Machine machine:list){
            System.out.println(machine.toString());
        }
    }
    private static void outputShow(Showable showable){
        showable.show();
    }
}

class Robot{
        private int id;
        private class Brain{
            public void think(){
                System.out.printf("robot %d is thinking",id);
            }
        }
        public Robot(int id){
            this.id = id;
        }
        public void start(){
            Brain brain = new Brain();
            System.out.println("This robot is starting man it's id: " + this.id);
            brain.think();
        }
}
class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing here");

    }
}
class Camera extends Machine{

}
class Plant{
    public void show(){
        System.out.println("Grow!!!...Grow,damn it!!");
    }

}
interface Rose{
    public void beautiful();
}
class Frog{
    public String name;
    private int id;

    public String toString(){
        /*StringBuilder sb = new StringBuilder("");
        sb.append("ID: ").append(this.id).append(" ").append("Name: ").append(this.name);
        return  sb.toString();
        */
        // another more efficient way to go about this is to use format
        return String.format("ID: %d, Name: %s",this.id,this.name);
    }
    public Frog(String name,int id){
        this.name = name;
        this.id = id;
    }
}
class Thing{
    public String name;
    public static int countObjects = 0;
    public final static int MY_CONSTANT = 3;
    private int id;
    public static String description;
    public static void info(){
        System.out.println(description);

    }
    public void fullInfo(){
        System.out.println("description: " + description + " name: " + this.name);
    }
    public Thing(){
        id = countObjects;
        countObjects++;
    }

}
class Machine implements Showable{
    private String name;
    private int age;
    public int id = 5;
    public Machine(){
        System.out.println("Constructor running");
    }
    public Machine(String text){
        this.name = text;
        System.out.println("Constructor 2 running");
    }
    public Machine(String text, int age){
        this(text);
        this.age = age;
        System.out.println("Constructor 3 running");
    }
    public void start(){
        System.out.println("machine started");
    }
    public void stop(){
        System.out.println("machine stopped");
    }
    public String toString(){
        //return String.format("id: %d name: %s",id,name);
        return "I'm a machine";
    }


    @Override
    public void show() {
        System.out.println("Id: " + this.id);
    }
}
class Car extends Machine{

}
class Person implements Showable{
    // contains states: data
    // we call data: instance variables
    public String name = "Ahmed";
    public int age;
    public static int counter = 0;
    public int id = 10;
    // behavior is defined by methods:
    public void speak(){
        System.out.println("Hello, dudes.");
        System.out.println("My name is "+this.name+" my age is " + this.age);
    }
    public void setName(String name){
        this.name = name;
    }
    public Person(){
        id = counter;
        counter++;
    }

    @Override
    public void show() {
        System.out.println("Id: " + this.id);
    }
}
interface Showable{
    public void show();
}
class Donkey{
    public String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public String getName() {
        return name;
    }

    public Donkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donkey donkey = (Donkey) o;
        if (age != donkey.age) return false;
        return name.equals(donkey.name);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}