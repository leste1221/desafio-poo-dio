import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bruno: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Bruno: " + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Bruno: " + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());

        System.out.println("----------------------");

        Dev devWesley = new Dev();
        devWesley.setNome("Wesley");
        devWesley.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Wesley: " + devWesley.getConteudosInscritos());
        devWesley.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Wesley: " + devWesley.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Wesley:  " + devWesley.getConteudosConcluidos());
        System.out.println("XP: " + devWesley.calcularTotalXp());
    }
}
