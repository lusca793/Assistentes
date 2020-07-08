package ex01herpoli;

public class Assistente extends Funcionario {

        public void informacoes(){
            System.out.println("Informações do assistente:\n"                  
                    + "\nMatrícula: " + getMatricula()
                    + "\nNome: " + getNome()
                    + "\nIdade: " + getIdade()
                    + "\nSalário: R$" + getSalario());
        }
    
}
