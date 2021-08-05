import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição: Curso JavaScript");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Mentoria: Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Eduardo");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Eduardo" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Eduardo" + dev.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Eduardo" + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXP());

        System.out.println("-----");

        Dev dev1 = new Dev();
        dev.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Camila" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());
    }
}
