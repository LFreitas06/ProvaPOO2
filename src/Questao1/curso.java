package Questao1;
import java.util.ArrayList;

public class curso {
    private int codigo;
    private int cargaHoraria;
    private int sala;
    private double valorCurso;
    private String nome;
    private String nomeProfessor;
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

    public ArrayList<aluno> getAlunos(){
        return alunos;
    }

    public void setAluno(ArrayList<aluno> alunos){
        this.alunos = alunos;
    }
}
