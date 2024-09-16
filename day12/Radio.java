
public class Radio implements Talker {

    private String name;

    public Radio(String name) {
        this.name = name;
    }

    @Override
    public void talk() {
        System.out.println(name + " diz Atlâââân-ti-da!");
    }

}
