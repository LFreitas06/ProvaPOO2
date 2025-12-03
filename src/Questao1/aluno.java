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
        double media = this.notas.getMedia();
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public Notas getNotas() {
        return notas;
    }
    public void setNotas(Notas notas) {
        this.notas = notas;
    }
    public String getNome() {
        return nome;
    }

}