public abstract class Animal extends Object implements Talker {
    
    protected String name;

    public Animal(String name) {
        this.name = name;
    }    
    
    public abstract void talk();

}
