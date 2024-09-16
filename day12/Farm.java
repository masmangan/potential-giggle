public class Farm {
    public static void main(String[] args) {
        //Animal rodolfo = new Cat("rodolfo");
        //Animal rex = new Dog("rex");
        //rodolfo.talk();
        //rex.talk();

        //Animal[] herd = {new Cat("Rodolfo"), 
        //            new Dog("Rex"), new Duck("Patolino"), new Pig("Pepa")};

        //Radio radio = new Radio("Atlântida");
        
        //for (Animal animal : herd) {
        //    animal.talk();          
        //}

        //radio.talk();
        
        Talker[] talkers = {new Cat("Rodolfo"), 
                    new Dog("Rex"), new Duck("Patolino"), 
                    new Pig("Pepa"), new Radio("Atlântida")};
        
        for (Talker talker : talkers) {
            if (talker instanceof Radio)
                System.out.println("Lá vem um rádio!");
            if (talker instanceof Animal)
                System.out.println("Lá vem bicho!");
            talker.talk();          
        }




    }

}
