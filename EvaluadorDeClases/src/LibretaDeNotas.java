import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibretaDeNotas {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Double>> libroNotas = new HashMap<>();

        int numNotas = 0;
        int numEstudiantes;

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

        for (Map.Entry<String, ArrayList<Double>> entry : libroNotas.entrySet()) {

            double NotaMax = Double.MIN_VALUE;
            double NotaMin = Double.MAX_VALUE;
            double NotaSum = 0;
            double NotaProm = 0;

            ArrayList<Double> notas = entry.getValue();
            for (Double nota : notas) {

                if (nota > NotaMax) {

                    NotaMax = nota;
                }

                if (nota < NotaMin) {

                    NotaMin = nota;

                }

                NotaSum += nota;

            }

            NotaProm = NotaSum/numNotas;

            System.out.println("El estudiante tiene:" + entry.getKey() +"\n Nota Maxima: " + NotaMax + "\n Nota Minima: " + NotaMin + "\n Promedio: " + NotaProm);
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