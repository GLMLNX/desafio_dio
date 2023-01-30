import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double CalcXP() {
        return XP+100;
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", Titulo=" + getTitulo() + " ,Descricao=" + getDescricao() + "]";
    }
    
    
}
