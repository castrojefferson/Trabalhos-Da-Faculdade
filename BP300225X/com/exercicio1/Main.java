package com.exercicio1;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Steve Jobs", 24021955);
        funcionario1.set_cargo("CEO");
        funcionario1.set_data_admissao(1041976);
        funcionario1.set_salario(70000.00);

        funcionario1.adicionar_dependente("Lisa Jobs", 3041999, false);
        funcionario1.adicionar_dependente("Erin Jobs", 5042007, true);


        System.out.println("FUNCIONARIO: "+funcionario1.get_nome_completo());
        System.out.println("NASCIMENTO: "+funcionario1.get_data_nascimento());
        System.out.println("CARGO: "+funcionario1.get_cargo());
        System.out.println("ADMISSAO: "+funcionario1.get_data_admissao());
        System.out.println("SALARIO: "+funcionario1.get_salario());

        System.out.println("\n");

        System.out.println("DEPENDENTE: "+funcionario1.get_nome_completo_dependente(0));
        System.out.println("NASCIMENTO: "+funcionario1.get_data_nascimento_dependente(0));
        System.out.println("ESTUDANTE: "+funcionario1.get_estudante_dependente(0));

        System.out.println("\n");

        System.out.println("DEPENDENTE: "+funcionario1.get_nome_completo_dependente(1));
        System.out.println("NASCIMENTO: "+funcionario1.get_data_nascimento_dependente(1));
        System.out.println("ESTUDANTE: "+funcionario1.get_estudante_dependente(1));
    }
}
