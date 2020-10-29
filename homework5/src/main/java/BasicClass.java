import static java.awt.Color.white;

/**
 * Task:
 * Create several classes that represent entities of the real world.
 * Each class has to contain fields (data described the state of an object), methods (actions needed to operate those data).
 * Another requirements are to provide at least 3 different constructors, one of them should be "default" one.
 * Also, create a runner class which will be a container with "main" method needed to run the program, instantiate objects an so on. 
 *
 * Создайте несколько классов, которые представляют сущности реального мира.
 * Каждый класс должен содержать поля (данные описывают состояние объекта), методы (действия, необходимые для работы с этими данными).
 * Еще одно требование - предоставить как минимум 3 разных конструктора, один из которых должен быть "по умолчанию".
 * Кроме того, создайте runner класс, который будет контейнером с "main" методом, необходимым для запуска программы, создания экземпляров объектов и так далее.
 */

public class BasicClass {
   
    String name = "Inna";
    int age;

    public void printInformation() {
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");


    }

    static class Cat  {

        String Name = "Eva";
        String breed = "Devon Rex";
        int age = 1;

        void ShowInfo() {
            System.out.println("My cat's name is " + Name + ". This is a very cute cat, breed " + breed + ".  She is " + age + " year old.");
        }

    }
    
     static class Dog {
        Dog ( String MyChoosecolor , String mychoosebreed){
         color= MyChoosecolor;
         breed = mychoosebreed; 
        }
      String breed;
      String color;   
    }
    

    static class Runner {
        public static void main(String[] args) {
            
            BasicClass Human = new BasicClass();
            Human.age = 26;
            Human.printInformation();

            Cat Eva = new Cat();
            Eva.ShowInfo();
            
            Dog Dream = new Dog( "white" , "husky");
            System.out.println( "My dream is a " + Dream.color + " " + Dream.breed);
            
        }
    }
}