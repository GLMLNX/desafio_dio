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

   
    
    
}
