package Questao1;

import java.util.ArrayList;

public class cursoMestrado extends curso{
    private boolean strictoSensu;
    private double adicionalDiploma;

    public cursoMestrado(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<aluno> alunos, boolean strictoSensu){
        super( codigo, cargaHoraria, sala, nome, nomeProfessor, valorCurso,  alunos);
        this.strictoSensu = strictoSensu;
    }

    public void setAdicionalDiploma(){
        int qtdAlunos = this.getAlunos().size();
        double valorPorAluno;
        if (qtdAlunos <= 5) {
            valorPorAluno = 45.00;
        } else if (qtdAlunos <= 15) {
            valorPorAluno = 43.00;
        } else if (qtdAlunos <= 30) {
            valorPorAluno = 40.00;
        } else {
            valorPorAluno = 36.00;
        }
    }

    public double getAdicionalDiploma() {
        return this.adicionalDiploma;
    }
}
