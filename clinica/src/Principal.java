import entities.Paciente;
import entities.Pessoa;

public class Principal {
    void main(){
        Pessoa p = new Pessoa();
        p.nomear("José");
        System.out.println(p.lerNome());

        Paciente paciente = new Paciente();
        paciente.nomear("Allyson");
        System.out.println(paciente.lerNome());
    }
}
