//
// Make sure that you are on the correct folder:
//  $ cd day02/hello3
// Compile and run:
//  $ javac HelloApp.java
//  $ java HelloApp
//

class Greeting {

    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String sayHello() {
        return String.format("Hello, %s!", name);
    }
    
}

class HelloApp {

    public static void main(String[] args) {
        Greeting g = new Greeting("Alejandro");
        System.out.println(g.sayHello());
    }

}