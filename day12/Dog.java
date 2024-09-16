public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println(name + " diz au-au!");
    }    

}
