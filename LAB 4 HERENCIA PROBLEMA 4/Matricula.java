package appescuela;
import java.util.ArrayList;
import java.util.Scanner;

public class Matricula {
    private static ArrayList<Aula> aulas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        inicioAulas(); // Cambiado de InicioCursos a InicioAulas
        int opcion;
        
        do {
            System.out.println("\n--- Menú de Gestión Estudiantil ---");
            System.out.println("1. Matricular alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Ver datos del aula");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch(opcion) {
                case 1:
                    matricularAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    verDatosAula(); // Cambiado a verDatosAula
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Ingrese una opción correctamente.");
            }
        } while(opcion != 4);
    }

    // Método para inicializar las aulas
    private static void inicioAulas() {
        aulas.add(new Aula("Aula A"));
        aulas.add(new Aula("Aula B"));
        aulas.add(new Aula("Aula C"));
    }

    // Método para matricular un alumno
    private static void matricularAlumno() {
        System.out.print("Ingrese el código del alumno: ");
        String codigo = scanner.nextLine();
        
        Alumno alumnoExistente = null;
        // Buscar si el alumno ya existe
        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                if (alumno.getCodigo().equals(codigo)) {
                    alumnoExistente = alumno;
                    break;
                }
            }
        }
        
        if (alumnoExistente != null) {
            // Verificar los datos del alumno existente
            while (true) {
                System.out.print("Ingrese el nombre del alumno: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la escuela: ");
                String escuela = scanner.nextLine();
                System.out.print("Ingrese la dirección: ");
                String direccion = scanner.nextLine();                
                // Comprobar si los datos coinciden
                if (nombre.equals(alumnoExistente.getNombre()) && escuela.equals(alumnoExistente.getEscuela()) && direccion.equals(alumnoExistente.getDireccion())) {
                    break;
                } else {
                    System.out.println("Los datos no coinciden con el código ingresado. Por favor, intente nuevamente.\n");
                }
            }
        } else {
            // Crear nuevo alumno si no existe
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la escuela: ");
            String escuela = scanner.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = scanner.nextLine();
            
            alumnoExistente = new Alumno(codigo, nombre, escuela, direccion);
        }
        
        // Selección del aula
        System.out.println("Seleccione el aula para matricular:");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println((i + 1) + ". " + aulas.get(i).getNombre());
        }
        int aulaSeleccionada = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar el buffer
        
        // Verificar si la selección del aula es válida
        if (aulaSeleccionada >= 0 && aulaSeleccionada < aulas.size()) {
            Aula aula = aulas.get(aulaSeleccionada);
            
            // Intentar matricular al alumno
            boolean matriculado = aula.matricularAlumno(alumnoExistente);
    
            if (matriculado) {
                System.out.println("Alumno matriculado con éxito en " + aula.getNombre());
            } 
            else{
                {
                    if(aula.getAlumnos().size()>=20){
                        System.out.println("El aula seleccionada se encuentra llena...");
                    }
                    else{
                        System.out.println("Este alumno ya se encuentra matriculado en esta aula.");
                    }

                }
            }
        } else {
            System.out.println("Aula no válida.");
        }
    }

    // Método para buscar un alumno por código
    private static void buscarAlumno() {
        System.out.print("Ingrese el código del alumno: ");
        String codigo = scanner.nextLine();
        
        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                if (alumno.getCodigo().equals(codigo)) {
                    System.out.println("Alumno encontrado: " + alumno);
                    return;
                }
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    // Método para ver los datos del aula
    private static void verDatosAula() {
        System.out.println("Seleccione el aula:");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println((i + 1) + ". " + aulas.get(i).getNombre());
        }
        int aulaSeleccionada = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar el buffer
        
        if (aulaSeleccionada >= 0 && aulaSeleccionada < aulas.size()) {
            Aula aula = aulas.get(aulaSeleccionada);
            ArrayList<Alumno> alumnos = aula.getAlumnos();
            System.out.println("Alumnos matriculados en " + aula.getNombre() + ":");
            if (alumnos.isEmpty()) {
                System.out.println("No hay alumnos matriculados.");
            } else {
                for (Alumno alumno : alumnos) {
                    System.out.println(alumno);
                }
            }
        } else {
            System.out.println("Aula no válida.");
        }
    }
}
