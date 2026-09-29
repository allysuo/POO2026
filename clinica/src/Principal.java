import entities.Pessoa;

public class Principal {
    void main(){
        Pessoa p = new Pessoa();
        p.nomear("José");
        System.out.println(p.lerNome());
    }
}
