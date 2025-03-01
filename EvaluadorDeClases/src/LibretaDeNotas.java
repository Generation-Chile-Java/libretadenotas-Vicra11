import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class LibretaDeNotas {


    public static int numNotas = 0;
    public static int numEstudiantes = 0;
    public static HashMap<String, ArrayList<Double>> libroNotas = new HashMap<>();

    public static void IngresoDatos (){

        Scanner sc = new Scanner(System.in);

        System.out.println("cuantos estudiantes son?: ");
        numEstudiantes = sc.nextInt();

        System.out.println("cuantas notas?: ");
        numNotas = sc.nextInt();

        for (int i = 1; i <= numEstudiantes;  i++) {

            System.out.println("Estudiante " + i + ": ");
            String nombre = sc.next();

            ArrayList<Double> notas = new ArrayList<>();

            for (int j = 1 ; j <= numNotas ; j++) {

                System.out.println("Nota " + j + ": ");
                notas.add(sc.nextDouble());
            }

            libroNotas.put(nombre, notas);

        }

        System.out.println(libroNotas);

    }

    public static void main(String[] args) {

        IngresoDatos();

    }


    /// asumimos que exsiste el alumno antes
    public static Double ObtenerMax (HashMap<String, ArrayList<Double>> libroNotas, String nombre) {

        double NotaMax = Double.MIN_VALUE;

        ArrayList<Double> notas = libroNotas.get(nombre);

        for (Double nota : notas) {
            if (nota > NotaMax) {
                NotaMax = nota;
            }

        }

        return NotaMax;

    }

    public static Double ObtenerMin (HashMap<String, ArrayList<Double>> libroNotas, String nombre) {


        double NotaMin = Double.MAX_VALUE;

        ArrayList<Double> notas = libroNotas.get(nombre);

        for (Double nota : notas) {
            if (nota > NotaMin) {
                NotaMin = nota;
            }

        }

        return NotaMin;

    }


    public static Double PromedioCurso (HashMap<String, ArrayList<Double>> libroNotas) {

        double SumNotasTotal = 0;
        double PromCurso = 0;
        for (HashMap.Entry<String, ArrayList<Double>> entry : libroNotas.entrySet()) {

            ArrayList<Double> notasEstudiante = entry.getValue();

            for (Double nota : notasEstudiante) {

                SumNotasTotal += nota;

            }


        }

        PromCurso = SumNotasTotal/(numNotas*numEstudiantes);

        return PromCurso;
    }

    public static Double PromedioEstudiante (HashMap<String, ArrayList<Double>> libroNotas, String nombre) {

        double SumNotasE = 0;
        double PromEstudiante = 0;

        ArrayList<Double> notasEstudiante = libroNotas.get(nombre);

        for (Double nota : notasEstudiante) {

            SumNotasE += nota;


        }

        PromEstudiante = SumNotasE/(numNotas);

        return PromEstudiante;

    }

    public static void Opcion1 () {
        boolean MenuActivo = true;

        while (MenuActivo) {


            String nomEstudiante = "";
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el nombre del estudiante: ");
            nomEstudiante = sc.nextLine();

            if (libroNotas.containsKey(nomEstudiante)) {


                MenuActivo = false;

            }else{

                System.out.println("Estudiante no encontrado");

            }

        }


    }


    public static void Opcion2 () {

    }


    public static void Opcion3 () {

    }

    public static void Opcion4 () {

        int opcion = -1;
        boolean MenuActivo = true;
        Scanner sc = new Scanner(System.in);


        while (MenuActivo) {

            System.out.println("Seleccione una opcion");
            System.out.println("1. Mostrar promedio estudiante");
            System.out.println("2. Mostrar notas aprobada y reprobada");
            System.out.println("3. comparar notas con promedio curso");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:



                    break;
                case 2:


                    break;
                case 3:


                    break;
                case 4:

                    MenuActivo = false;

                    break;
                default : System.out.println("Opcion no valida");


                break;
            }

        }

    }



}



/*

Instrucciones para el Ejercicio "EvaluadorDeClases":
Crear la clase:
Crea la clase LibretaDeNotas para que pueda evaluar y almacenar las calificaciones de una lista de estudiantes.
Utiliza un HashMap para almacenar las calificaciones de los estudiantes, donde la llave es el nombre del estudiante y el valor es un ArrayList de notas.
Solicita al usuario que ingrese la cantidad de alumnos y la cantidad de notas por alumno.
Solicita el nombre de cada alumno y las notas correspondientes, almacenándolas en el HashMap.
Recorrer el HashMap y Evaluar Calificaciones:
Utiliza un bucle (por ejemplo, for o foreach) para recorrer el HashMap de calificaciones.
Calcular Promedio, Nota Máxima y Mínima por Estudiante:
Después de evaluar las calificaciones, calcula y muestra para cada estudiante:
Promedio de Notas: Suma todas las calificaciones y divide por la cantidad total de notas.
Nota Máxima: Encuentra la calificación más alta en el ArrayList.
Nota Mínima: Encuentra la calificación más baja en el ArrayList.
Menú de Opciones:
Muestra un menú con las siguientes opciones:
1. Mostrar el Promedio de Notas por Estudiante.
2. Mostrar si la Nota es Aprobatoria o Reprobatoria por Estudiante.
3. Mostrar si la Nota está por Sobre o por Debajo del Promedio del Curso por Estudiante.
0. Salir del Menú.
Utiliza un bucle para permitir al usuario seleccionar opciones hasta que ingrese 0 para salir.
Operaciones del Menú:
Opción 1: Mostrar el Promedio de Notas por Estudiante.
Muestra el promedio de notas por cada estudiante calculado previamente.
Opción 2: Mostrar si la Nota es Aprobatoria o Reprobatoria por Estudiante.
Solicita al usuario ingresar el nombre de un estudiante y una nota, luego verifica si es aprobatoria o reprobatoria según una nota de aprobación definida.
Opción 3: Mostrar si la Nota está por Sobre o por Debajo del Promedio del Curso por Estudiante.
Solicita al usuario ingresar el nombre de un estudiante y una nota, luego verifica si está por sobre o por debajo del promedio general.
Validaciones:
Implementa validaciones para asegurar que las notas ingresadas estén en un rango válido y que la cantidad de alumnos sea un número positivo.

 */