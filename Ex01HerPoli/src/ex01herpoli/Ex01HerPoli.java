package ex01herpoli;

public class Ex01HerPoli {

    public static void main(String[] args) {
       
        Tecnico info = new Tecnico();
        Administrativo adm = new Administrativo();
        
        info.setMatricula(1);
        info.setNome("Clóvis Claudio");
        info.setIdade(25);
        info.setSalario(3000);
        info.setBonus(500);
        info.adicional();
        info.informacoes();
        
        adm.setMatricula(2);
        adm.setNome("Robson Garena");
        adm.setIdade(28);
        adm.setSalario(1500);
        adm.setBonus(500);
        adm.setTurno("noite");
        adm.adicional();
        adm.informacoes();
        
    }
    
}
