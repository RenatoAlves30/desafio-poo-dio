import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila " + devCamila.getConteudosInscritos());
        devCamila.progedir();
        devCamila.progedir();
        System.out.println("________________________________");
        System.out.println("Conteúdos Inscritos Camila " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("________________________________");

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Renato " + devRenato.getConteudosInscritos());
        devRenato.progedir();
        devRenato.progedir();
        devRenato.progedir();

        System.out.println("________________________________");


        System.out.println("Conteúdos Inscritos Renato " + devRenato.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Renato " + devRenato.getConteudosConcluidos());
        System.out.println("XP: " + devRenato.calcularTotalXp());




    }
}
