package Questao1;
import java.util.ArrayList;

public class controleGeral {
    public static void main(String[] args) {
        Notas notasJoao = new Notas(7.0, 8.0, 6.0);
        Notas notasMaria = new Notas(9.0, 9.5, 10.0);


        aluno aluno1 = new aluno(1, 19, "leo", "111.222.333-44", "Rua A", true, notasJoao);
        aluno aluno2 = new aluno(2, 18, "lavinia", "555.666.777-88", "Rua B", false, notasMaria);

        ArrayList<aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        cursoEspecializacao cursoEsp = new cursoEspecializacao(
                101, 360, 10, "POO", "Prof. Luiz Mario", 500.0, listaAlunos, true
        );

        cursoEsp.setAdicionalDiploma();
        System.out.println("Especialização");
        System.out.println("Curso: " + cursoEsp.getAlunos().size() + " alunos.");
        System.out.println("Adicional Diploma Calculado: R$ " + cursoEsp.getAdicionalDiploma());

        System.out.println("Situação do João: " + aluno1.getSituacao());

        cursoMestrado cursoMest = new cursoMestrado(
                202, 1200, 5, "Mestrado em IA", "Dr. Robert", 0.0, listaAlunos, true
        );

        cursoMest.setAdicionalDiploma();
        System.out.println("\nMestrado");
        System.out.println("Adicional Diploma Calculado: R$ " + cursoMest.getAdicionalDiploma());
    }
}
