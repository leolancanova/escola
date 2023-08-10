package br.senai.sp.escola;

import javax.print.attribute.standard.Media;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {

        /** Declara Variaveis */
        String nomeAluno;
        String disciplina;
        String professor;
        int frequencia;
        int nota1;
        int nota2;
        float mediaAluno;
        String situacaoAluno;
        boolean continuar = true;


        /** Instanciar o teclado */
        Scanner teclado = new Scanner(System.in);


        while (continuar) {

            /** Coleta dados */
            System.out.println("--------------------------------");
            System.out.print("Olá prof°, Qual seu nome: ");
            professor = teclado.nextLine();
            System.out.print("Informe o nome do seu aluno: ");
            nomeAluno = teclado.nextLine();
            System.out.println("Informe sua disciplina: ");
            disciplina = teclado.nextLine();
            System.out.println("Informe a frequencia do Aluno: ");
            frequencia = teclado.nextInt();
            System.out.println("Informe a nota 1: ");
            nota1 = teclado.nextInt();
            System.out.println("Informe a nota 2: ");
            nota2 = teclado.nextInt();
            System.out.println("--------------------------------");


            /** Avaliação do Aluno */

            boolean validacao = (professor.equalsIgnoreCase("vitor"));
            mediaAluno = (nota1 + nota2) / 2;

            System.out.println(mediaAluno);
            if ((mediaAluno >= 7 && frequencia >= 75 && !validacao) || (mediaAluno >= 6 && frequencia >= 90 && !validacao)) {
                situacaoAluno = "aprovado";
            } else {
                situacaoAluno = "reprovado !! ";
            }

            System.out.println("ola prof " + professor + ".seja bem-vindo.sua disciplina  é " + disciplina + ".");
            System.out.println("o nome do seu aluno é " + nomeAluno);
            System.out.println("suas notas são " + nota1 + "é" + nota2 + "é.logo a média dele é " + mediaAluno);
            System.out.println(" A situação do aluno é: " + situacaoAluno);

            System.out.println("deseja cadastra outro aluno ? ");
            String respProf = teclado.next();

            if (respProf.equalsIgnoreCase("nao")) {
                continuar = false;
            }
        }
        System.out.println("Finalizado" );

    }
}