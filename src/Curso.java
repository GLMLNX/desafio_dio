public class Curso extends Conteudo{

    private int cargaHora;

    @Override
    public double CalcXP() {
        return (XP*cargaHora)/2;
    }

    public int getCargaHora() {
        return cargaHora;
    }

    public void setCargaHora(int cargaHora) {
        this.cargaHora = cargaHora;
    }

    public Curso(String titulo, String descricao, int cargaHora) {
        super(titulo, descricao);
        this.cargaHora = cargaHora;
    }

    @Override
    public String toString() {
        return "Curso [cargaHora=" + cargaHora + ", Titulo=" + getTitulo() + ", Descricao=" + getDescricao() + "]";
    }

    

    

   
    
    
}
