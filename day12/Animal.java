public abstract class Animal extends Object {
    
    protected String name;

    public Animal(String name) {
        this.name = name;
    }    
    
    public abstract void talk();

}
