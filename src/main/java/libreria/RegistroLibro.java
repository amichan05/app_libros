
package libreria;
import java.util.ArrayList;

public class RegistroLibro {
    
    private ArrayList<libro> lista;

    public RegistroLibro (){
        this.lista = new ArrayList();
    }
    
    
    public boolean agregar (libro elec){         
        if( existe(elec.getTitulo()) == -1 ){
            lista.add(elec);
            return true;
        }
        return false;
    }
    
    
    public boolean eliminar (String titulo){

        int res = existe(titulo);
        
         if ( res != -1){
            lista.remove(res);
            System.out.println( "Se ha eliminado: "+titulo );
            return true;
        }
        return false;
    }
    
    public int existe (String titulo){
        for(int i = 0; i < lista.size(); i++){
            
            if (titulo == lista.get(i).getTitulo()){
                return i;
            }
        }
        
        return -1;
    }
    
    
    
    public void mostrar (){
        System.out.println("LISTA DE LIBROS");
        for (int i = 0;i< lista.size(); i++){            
            // obtiene libro
            libro li = lista.get(i); 
            System.out.println("Tipo: "+li.esClasificado()+" – Titulo: "+li.getTitulo()+ " – Autor:" +li.getNomAutor()+" – Autor:"+li.getAño() );
        }
    }
    
    public int cantilibro (){
        int totlibro = 0;
                
        for (int i = 0;i< lista.size(); i++){
            
            libro li = lista.get(i);

            // Si es libro impreso
            if(li.esClasificado() == "IMPRESO"){
                
                // Tiene más de 500 paginas               
                if ( !li.esReproducible() ){
                    totlibro++;
                }
                
            }
            
        }
        return totlibro;
    }
    
    public int cantlibrosviejos (){
        int totlibro = 0;
                
        for (int i = 0;i< lista.size(); i++){
            
            libro li = lista.get(i);
            
            int resultado = 2019 - li.getAño();
            
            if ( resultado > 3){
                totlibro++;
            }
            
        }
        return totlibro;
    }    
}


