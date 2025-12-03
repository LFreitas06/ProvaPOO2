package Questao1;

public class aluno {
    private int codigo;
    private int idade;
    private String nome;
    private String cpf;
    private String endereco;
    private boolean sexo;
    private Notas notas;

    public aluno(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, Notas notas) {
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.notas = notas;
    }

    public String getSituacao() {
        if (this.notas.getMedia() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }
    public Notas getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | CPF: " + cpf + " | Situação: " + getSituacao() + "\n   " + notas.toString();
    }
}