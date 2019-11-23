
package libreria;

public  class dijital extends libro implements IProcesos{
    
    private int tamaño;
     
    public dijital() {
        super();
    }

    public dijital(String titulo, int año, String autor, int tamaño) {
        super(titulo, año, autor);
        this.tamaño = tamaño;
    }      

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }     

    @Override
    public Boolean esRenovable() {
        int resultado = 2019 - this.getAño();
        if (resultado > 5){
            return true;
        }
        return false;     
    }

    @Override
    public Boolean esReproducible() {
        if ( this.tamaño < 1){
            return true;
        }
        return false;
    }

    @Override
    public String esClasificado() {
        return "DIGITAL";
    }
}