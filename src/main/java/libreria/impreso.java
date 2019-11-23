
package libreria;
import java.util.Date;


public class impreso extends libro implements IProcesos{
    
   private  int cantiPag;   

    public impreso() {
        super();
    }

    public impreso(String titulo, int año, String autor, int cantiPag) {
        super(titulo, año, autor);
        this.cantiPag = cantiPag;
    } 

    public int getCantiPag() {
        return cantiPag;
    }

    public void setCantiPag(int cantiPag) {
        this.cantiPag = cantiPag;
    }

    @Override
    public Boolean esRenovable() {               
        int resultado = 2019 - this.getAño();
        if (resultado > 3){
            return true;
        }
        return false;
    }

    @Override
    public Boolean esReproducible() {        
        if ( this.cantiPag < 500){
            return true;
        }
        return false;
    }

    @Override
    public String esClasificado() {
        return "IMPRESO";
    }
    
    
}
