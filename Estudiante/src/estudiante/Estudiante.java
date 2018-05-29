
package estudiante;
import java.util.Scanner;
import java.util.Date;

public class Estudiante {
   // private String nombre;
    //private String edad;
    //private String [] materias1;
    
    public Estudiante (String nombre, String materia){
        //this nombre=nombre;
       // this materias=materias;

}
    
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("###LISTA DE ESTUDIANTES###");
        Estudiante [] estudiantes =new Estudiante [5];
        //Materias [] materias =new Materias [2];
        
        for (int i=0; i<estudiantes.length;i++){
            System.out.println("Datos del estudiante"+(i+1));
            scan.nextLine();
            System.out.println("Ingrese el nombre del estudiante ");
            String nombre=scan.nextLine();
            System.out.println("Ingrese la edad del estudiante ");
            int edad=scan.nextInt();
            System.out.println("Ingrese cuantas materias esta tomando el estudiante ");
            String materias1=scan.nextLine();
        
//            estudiantes [i]=new Estudiante (nombre, edad, materias1); 
//            String[] Materias = new String[2];
//             
//             System.out.println();
//        for (int j=0; j<Materias.length;j++){
//            System.out.println("ingrese el nombre de la materia"+(j+1));
//            Materias [j]=scan.nextLine();
//  
//        }
//           estudiantes [i].setMaterias(materias1);
//        
//            System.out.println("####INFORMACION ESTUDIANTES#####");
//            for(int i = 0; i< estudiantes.length; i++){
//            System.out.println("Estudiante " + (i+1) + ":");
//            
//            System.out.println("Nombre completo: " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido()+""+ estudiantes[i].getEdad() );
//                      
//            System.out.println("--- MATERIAS");
//            
//            String[] me = estudiantes[i].getMaterias();
//            for(int j = 0; j<me.length; j++) {
//                System.out.println((j+1) + ". " + me[j]);
//            }
//            
       }
       
    }
    
}
