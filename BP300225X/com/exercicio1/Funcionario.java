package com.exercicio1;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private int data_admissao;
    private int data_demissao;

    private int numero_dependentes=0;
    private Dependente[] dependentes = new Dependente[numero_dependentes];

    public Funcionario(String nome_completo, int data_nascimento){
        set_nome_completo(nome_completo);
        set_data_nascimento(data_nascimento);
    }

    public String get_cargo(){
        return this.cargo;
    }
    public double get_salario(){
        return this.salario;
    }
    public int get_data_admissao(){
        return this.data_admissao;
    }
    public int get_date_demissao(){
        return this.data_demissao;
    }

    public void set_cargo(String cargo){
        this.cargo = cargo;
    }
    public void set_salario(double salario){
        this.salario = salario;
    }
    public void set_data_admissao(int data_admissao){
        this.data_admissao = data_admissao;
    }
    public void set_data_demissao(int data_demissao){
        this.data_demissao = data_demissao;
    }

    public void adicionar_dependente(String nome_completo, int data_nascimento, boolean estudante){
        Dependente[] dependentes_ = new Dependente[this.numero_dependentes+1];

        for (int x=0; x<this.numero_dependentes;x++){
            dependentes_[x] = this.dependentes[x];
        }

        dependentes_[this.numero_dependentes] = new Dependente(nome_completo, data_nascimento, estudante);

        this.dependentes = dependentes_;
        this.numero_dependentes+=1;
    }

    public boolean get_estudante_dependente(int numero){
        return this.dependentes[numero].get_estudante();
    }
    public String get_nome_completo_dependente(int numero){
        return this.dependentes[numero].get_nome_completo();
    }
    public int get_data_nascimento_dependente(int numero){
        return this.dependentes[numero].get_data_nascimento();
    }
}

class   Dependente extends Pessoa {
    private boolean estudante;

    public Dependente (String nome_completo, int data_nascimento, boolean estudante){
        set_nome_completo(nome_completo);
        set_data_nascimento(data_nascimento);
        this.estudante = estudante;
    }

    public boolean get_estudante(){
        return this.estudante;
    }
    public void set_estudante(boolean estudante){
        this.estudante = estudante;
    }
}

class Pessoa {
    private String nome_completo;
    private int data_nascimento;

    public String get_nome_completo(){
        return this.nome_completo;
    }
    public int get_data_nascimento(){
        return this.data_nascimento;
    }
    public void set_nome_completo(String nome_completo){
        this.nome_completo = nome_completo;
    }
    public void set_data_nascimento(int data_nascimento){
        this.data_nascimento = data_nascimento;
    }
}