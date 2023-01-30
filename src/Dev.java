import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String nome;
    private String emaill;
    private Set<Conteudo> conteudoMatriculado= new LinkedHashSet<>();
    private Set<Conteudo> conteudoFinalizado= new LinkedHashSet<>();
    
    public Dev(String nome, String emaill, Set<Conteudo> conteudoMatriculado, Set<Conteudo> conteudoFinalizado) {
        this.nome = nome;
        this.emaill = emaill;
        this.conteudoMatriculado = conteudoMatriculado;
        this.conteudoFinalizado = conteudoFinalizado;
    }

    public void matriculaBootcamp(Bootcamp bootcamp){
        this.conteudoMatriculado.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> cont= this.conteudoMatriculado.stream().findFirst();
        if(cont.isPresent()){
            this.conteudoMatriculado.add(cont.get());
            this.conteudoMatriculado.remove(cont.get());
        }else{
            System.err.println("Nao matriculado");
        }
    }

    public double calcTotalXp(){
        return this.conteudoFinalizado.stream().mapToDouble(Conteudo :: CalcXP).sum();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmaill() {
        return emaill;
    }
    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }
    public Set<Conteudo> getConteudoMatriculado() {
        return conteudoMatriculado;
    }
    public void setConteudoMatriculado(Set<Conteudo> conteudoMatriculado) {
        this.conteudoMatriculado = conteudoMatriculado;
    }
    public Set<Conteudo> getConteudoFinalizado() {
        return conteudoFinalizado;
    }
    public void setConteudoFinalizado(Set<Conteudo> conteudoFinalizado) {
        this.conteudoFinalizado = conteudoFinalizado;
    }

    
    
}
