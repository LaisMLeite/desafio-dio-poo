import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(10);



        Mentoria mentoria1 = new Mentoria ();
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setTitulo("Descrição Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp("Bootcamp Java Develloper", "Descrição do Bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devLais = new Dev("Laís");
        devLais.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Laís: " + devLais.getConteudosInscritos());
        devLais.progredir();
        devLais.progredir();
        System.out.println("Conteúdos inscritos Laís: " + devLais.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Laís: " + devLais.getConteudosConcluidos());
        System.out.println("XP: " + devLais.calcularTotalXp());


        System.out.println();

        Dev devTom = new Dev ("Tom");
        devTom.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Tom: " + devTom.getConteudosInscritos());
        devTom.progredir();
        devTom.progredir();
        devTom.progredir();
        System.out.println("Conteúdos inscritos Tom: " + devTom.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Tom: " + devTom.getConteudosConcluidos());
        System.out.println("XP: " + devTom.calcularTotalXp());

    }
}
