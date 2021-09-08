package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C, media;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        A = A * 2;
        B = B * 3;
        C = C * 5;
        media = (A + B + C) / 10;
        System.out.printf("MEDIA = %.1f\n" , media);

        entrada.close();
    }
}
