class Greeting {
    
    public String sayHello() {
        return "Hello World!";
    }
}

class Main {

    public static void main(String[] args) {
        Greeting g = new Greeting();
        System.out.println(g.sayHello());   
    }

}