package Questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class controleGeral {
    static ArrayList<aluno> alunos = new ArrayList<>();
    static ArrayList<cursoEspecializacao> especializacoes = new ArrayList<>();
    static ArrayList<cursoMestrado> mestrados = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargaInicialDeDados();

        int op;
        do {
            System.out.println("\n1-Listar Alunos | 2-Listar Cursos | 3-Busca | 0-Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> listarAlunos();
                case 2 -> listarCursos();
                case 3 -> buscarPorNome();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        } while (op != 0);
    }

    public static void cargaInicialDeDados() {
        Notas n1 = new Notas(8, 9, 7);
        Notas n2 = new Notas(5, 4, 6);

        aluno a1 = new aluno(1, 20, "Matheus", "12345678901", "Rua A", true, n1);
        aluno a2 = new aluno(2, 22, "Maria", "10987654321", "Rua B", false, n2);

        alunos.add(a1);
        alunos.add(a2);

        especializacoes.add(new cursoEspecializacao(100, 360, 10, "Banco de Dados", "Prof. Silva", 1200, alunos, true));
        especializacoes.add(new cursoEspecializacao(101, 400, 12, "Engenharia Web", "Prof. Souza", 1300, alunos, false));

        mestrados.add(new cursoMestrado(200, 1000, 20, "IA Aplicada", "Dr. Roberto", 0, alunos, true));
        mestrados.add(new cursoMestrado(201, 1200, 22, "Ciência de Dados", "Dra. Ana", 0, alunos, true));
    }

    public static void listarAlunos() {
        for (aluno a : alunos) {
            System.out.println(a.toString());
        }
    }

    public static void listarCursos() {
        System.out.println("Especializações");
        for (cursoEspecializacao c : especializacoes) {
            c.setAdicionalDiploma();
            System.out.println(c.toString());
        }
        System.out.println("Mestrados");
        for (cursoMestrado c : mestrados) {
            c.setAdicionalDiploma();
            System.out.println(c.toString());
        }
    }

    public static void buscarPorNome() {
        System.out.print("Digite o nome do curso: ");
        String busca = sc.nextLine();
        boolean achou = false;

        for (cursoEspecializacao c : especializacoes) {
            if (c.getNome().equalsIgnoreCase(busca)) {
                System.out.println("Encontrado: Curso de Especialização" + c.getNome());
                achou = true;
            }
        }
        for (cursoMestrado c : mestrados) {
            if (c.getNome().equalsIgnoreCase(busca)) {
                System.out.println("Encontrado: Curso de Mestrado" + c.getNome());
                achou = true;
            }
        }
        if (!achou) System.out.println("Curso não encontrado.");
    }
}