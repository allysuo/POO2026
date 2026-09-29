package entities;
import java.util.Date;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;

    Scanner sc = new Scanner(System.in);
    public void nomear (String nome){
        do{
            if(nome.charAt(0) == 'a'){
                this.nome = nome;
                break;
            }
            System.out.println("Digite um nome válido.");
            nome = sc.nextLine();
        } while(true);
    }

    public String lerNome(){
        return this.nome;
    }
}
