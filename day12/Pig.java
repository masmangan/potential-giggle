public class Pig extends Animal {

    public Pig(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println(name + " diz óinc!");
    }
    
}
