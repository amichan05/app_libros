/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author cneil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RegistroLibro re = new RegistroLibro();
        
        // libros impresos
        impreso imp1 = new impreso("Papelucho", 1995, "Marcela Paz", 100);
        impreso imp2 = new impreso("Harry Potter", 1998, "JK Rowling", 600);
        impreso imp3 = new impreso("Cancion de fuego y hielo", 1998, "George R. R. Martin", 900);
        impreso imp4 = new impreso("El hobbit", 1988, "JRR TOlkien", 1500);
        impreso imp5 = new impreso("Lo que el viento se llevó", 2018, "Desconocido", 800);                
        re.agregar(imp1);
        re.agregar(imp2);
        re.agregar(imp3);
        re.agregar(imp4);
        re.agregar(imp5);
        
        // libros dijitales
        dijital di1 = new dijital("Capitan Alameda", 1995, "Marcela Paz", 0);
        dijital di2 = new dijital("Perro matapacos", 1998, "JK Rowling", 800);
        dijital di3 = new dijital("Baila pikachu", 1998, "George R. R. Martin", 1855);
        dijital di4 = new dijital("Esto no prendió", 1988, "JRR TOlkien", 2500);
        dijital di5 = new dijital("Culpa de los narcotraficantes", 2018, "Desconocido", 600);                
        re.agregar(di1);
        re.agregar(di2);
        re.agregar(di3);
        re.agregar(di4);
        re.agregar(di5);        
        
        System.out.println( "Se han agregado los siguientes libros... " );
        re.mostrar();
        
        System.out.println( "cantidad de libros de más de 500 páginas: "+re.cantilibro() );
        
        System.out.println( "cantidad de libros de más de 3 años: "+re.cantlibrosviejos() );
        
        re.eliminar("Papelucho");        
        re.mostrar();
        
    }
    
}
