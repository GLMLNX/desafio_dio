import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1=new Curso("Curso java", "descricao curso java", 8);
        Mentoria mentoria1=new Mentoria("mentoria java", "descricao mentoria java", LocalDate.now());
        Set<Conteudo> conteudos= new LinkedHashSet<>();
        conteudos.add(mentoria1);
        conteudos.add(curso1);
        Dev dev1=new Dev("Jonas", "jonasp2000@email.com", conteudos, null);
        Set<Dev> devs = new HashSet<>();
        devs.add(dev1);
        Bootcamp bootcamp1=new Bootcamp("Java Bootcamp", "Bootcamp de java", devs, conteudos);
        dev1.matriculaBootcamp(bootcamp1);
        System.out.println(dev1.getConteudoMatriculado());
        System.out.println(bootcamp1.getConteudos());

    }
}
