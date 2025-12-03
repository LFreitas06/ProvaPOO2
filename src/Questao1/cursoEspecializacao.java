package Questao1;

import java.util.ArrayList;

public class cursoEspecializacao extends curso {
    private boolean latoSensu;
    private double adicionalDiploma;

    public cursoEspecializacao(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<aluno> alunos, boolean latoSensu){
        super( codigo, cargaHoraria, sala, nome, nomeProfessor, valorCurso,  alunos);
        this.latoSensu = latoSensu;
    }

    public void setAdicionalDiploma(){
        int qtdAlunos = this.getAlunos().size();
        double valorPorAluno;
        if (qtdAlunos <= 10){
            valorPorAluno = 25.00;
        } else if (qtdAlunos <= 30) {
            valorPorAluno = 20.00;
        } else{
            valorPorAluno = 18.00;
        }
        this.adicionalDiploma = qtdAlunos * valorPorAluno;
    }

    public double getAdicionalDiploma() {
        return this.adicionalDiploma;
    }
}
