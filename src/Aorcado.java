import java.util.Scanner;

public class Aorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner que permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // decalaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intentos = 0;
        boolean plabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // estructura de control de tipo incterativa (biucle)
        for(int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_' ;

           // System.out.print(letrasAdivinadas[i]);
        }

        while(!plabraAdivinada && intentos < intentosMax){
            System.out.println("palabra adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + " letras");
            System.out.println("introduce una letra, por favor: ");

            char letra = Character.toLowerCase(scanner.nextLine().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < letrasAdivinadas.length; i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("!Incorrecto, te quedan " + (intentosMax - intentos) + " Intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                plabraAdivinada = true;
                System.out.println("Felicitaciones, haz adivinado la palabra secreta: " + palabraSecreta);
            }

        }

        if (!plabraAdivinada) {

            System.out.println("Lo siento, otro día será...GAME OVER");
            
        }

        scanner.close();
    }
}
