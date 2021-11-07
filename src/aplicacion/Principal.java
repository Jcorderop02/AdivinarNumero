/*Copyright [2021] [Juan Cordero]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

/**
 * Es la clase Principal del programa que procesará una petición
 *
 * @author Juan Cordero
 * @version 1.0 7/11/2021
 */
package aplicacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static String Texto_ayuda = "Hola";
    public static void main(String[] args) {
        if (args[0].equals("help")){
            System.out.println(Texto_ayuda);
        } else if (args[0].equals("exit")){
            System.exit(0);
        }
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca su nombre");
            String nombre = sc.next();
            System.out.println("Bienvenido " + nombre);
            try{
                System.out.println("Escoja un número inicial");
                int numeroMaximo = sc.nextInt();
                int numeroAleatorio = (int) (Math.random() * numeroMaximo + 1);
                int numeroEscrito = 0;
                int intentos = 0;

                while (numeroEscrito != numeroAleatorio) {
                    System.out.println("Escoja un numero entre el 1 y " + numeroMaximo);
                    numeroEscrito = sc.nextInt();
                    intentos++;

                    if (numeroEscrito == numeroAleatorio) {
                            System.out.println("Has ganado en  " + intentos + " intentsos");
                    } else if (numeroEscrito > numeroAleatorio) {
                            System.out.println("El numero acertar es mas pequeño");
                    } else {
                        System.out.println("El numero a acertar es mas grande");
                    }
                    sc.close();
                }
            }catch (InputMismatchException e) {
                System.out.println("No se ha introducido un número");
            }

    }
}