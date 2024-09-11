public class Farm {
    public static void main(String[] args) {
        //Animal rodolfo = new Cat("rodolfo");
        //Animal rex = new Dog("rex");
        //rodolfo.talk();
        //rex.talk();

        Animal[] herd = {new Cat("rodolfo"), 
                    new Dog("rex"), new Dog("rex")};
        for (Animal animal : herd) {
            animal.talk();            
        }
        
    }

}
