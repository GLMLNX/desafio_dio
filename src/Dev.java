import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    
    private String nome;
    private String emaill;
    private Set<Conteudo> conteudoMatriculado= new LinkedHashSet<>();
    private Set<Conteudo> conteudoFinalizado= new LinkedHashSet<>();
    
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
