import br.com.dio.desafio.Dominio.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao(" DESCRICAO CURSO JAVA");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Ide Intellij");
        curso2.setDescricao("Entendendo IDE JAVA");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        Set<Conteudo> conteudosBootcamp = new HashSet<>();
        conteudosBootcamp.add(curso1);
        conteudosBootcamp.add(curso2);
        conteudosBootcamp.add(mentoria);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito" + devCarlos.getConteudosInscritos());

        devCarlos.progredir();
        System.out.println("Conteudo Inscrito" + devCarlos.getConteudosInscritos());
        System.out.println("Conteudo Inscrito" + devCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());

        Dev devCecilia = new Dev();
        devCecilia.setNome("Cecilia");
        devCecilia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito" + devCecilia.getConteudosInscritos());
        devCecilia.progredir();
        System.out.println("Conteudo Inscrito" + devCecilia.getConteudosInscritos());
        System.out.println("Conteudo Inscrito" + devCecilia.getConteudosConcluidos());
        System.out.println("XP:" + devCecilia.calcularTotalXp());

    }
}
