
public class Pessoa implements Comparable<Pessoa> {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa) {
            Pessoa p = (Pessoa) obj;
            // return nome.equals(p.nome);
            return this.compareTo(p) == 0;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",
                super.toString(),
                nome,
                hashCode());
    }

    @Override
    public int compareTo(Pessoa p) {
        return nome.compareTo(p.nome);
    }

}
