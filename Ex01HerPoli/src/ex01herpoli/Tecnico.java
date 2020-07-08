package ex01herpoli;

public class Tecnico extends Assistente{

    private double bonus;
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double adicional(){
        this.salario = this.salario + this.bonus;
        return this.salario;
    }
    
    @Override
    public void informacoes(){
        System.out.println("Informações do assistente Tecnico:\n"                  
                + "\nMatrícula: " + getMatricula()
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nSalário: R$" + getSalario());
    }
    
    
}
