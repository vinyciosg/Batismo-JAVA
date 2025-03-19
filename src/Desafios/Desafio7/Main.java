package Desafios.Desafio7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Gustavo,", 2000, DiasDaSemana.QUINTA));
        funcionarios.add(new Gerente("Vinycios", 2500,DiasDaSemana.SEGUNDA ,"RH"));
        funcionarios.add(new Desenvolvedor("Alves", 4500,DiasDaSemana.SEXTA ,"TI"));

        for(Funcionario funcionario : funcionarios){
            funcionario.calcularBonus();
            funcionario.exiirInfo();
            System.out.println("------------------");
        }
    }
}
