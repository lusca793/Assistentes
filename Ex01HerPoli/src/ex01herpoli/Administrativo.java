package ex01herpoli;

public class Administrativo extends Assistente{

    private String turno;
    private double bonus;

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }        
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }    
    public double adicional(){
        if ("noite".equals(turno)) {
            this.salario = this.salario + this.bonus;            
        }else{
            this.salario = this.salario;
        }   
            return this.salario;
    }
    
    @Override
    public void informacoes(){
        System.out.println("\n\nInformações do assistente Administrativo:\n"                  
                + "\nMatrícula: " + getMatricula()
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nTurno: " + getTurno()
                + "\nSalário: R$" + getSalario());
    }
    
    
}
