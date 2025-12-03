package Questao1;
import java.util.ArrayList;

public class curso {
    private int codigo;
    private int cargaHoraria;
    private int sala;
    private String nome;
    private String nomeProfessor;
    private double valorCurso;
    private ArrayList<aluno> alunos;

    public curso(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<aluno> alunos){
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.sala = sala;
        this.nome = nome;
        this.nomeProfessor = nomeProfessor;
        this.valorCurso = valorCurso;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }
    public ArrayList<aluno> getAlunos(){
        return alunos;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + " | Prof: " + nomeProfessor + " | Sala: " + sala + " | Valor: R$ " + valorCurso;
    }
}