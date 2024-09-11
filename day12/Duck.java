public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println(name + " diz quack!");
    }
    
}
