/*
 * Número primo. Diseñar un programa que tome como entrada un número entero positivo y diga si es primo
o no.
• Descripción de entrada: un número entero positivo mayor o igual a 2 y menor o igual a
2000000.
• Descripción de salida: prime o not prime, según el caso.
• Ejemplo de entrada:
7
• Ejemplo de salida:
prime
• Ejemplo de entrada 2:
2113
• Ejemplo de salida 2:
prime
• Ejemplo de entrada:
70
Ejemplo de salida:
not prime
• Ejemplo de entrada 2:
21135
• Ejemplo de salida 2:
not prime
 */
package proyect;

import java.util.Scanner;

public class Proyect {
    
        public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
     
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer between 2 and 2000000: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number >= 2 && number <= 2000000) {
                if (isPrime(number)) {
                    System.out.println("prime");
                } else {
                    System.out.println("not prime");
                }
            } else {
                System.out.println("The number should be between 2 and 2000000.");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }
        
        scanner.close();
        
    }
    
}
