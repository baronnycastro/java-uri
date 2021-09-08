package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario, percentual, reajuste;
        
        salario = entrada.nextDouble();
        
        if(salario <= 400) {
            percentual = 15;
            reajuste = salario * (percentual/100);
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n" , novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 15%");
        }

        else if(salario <= 800) {
            percentual = 12;
            reajuste = salario * (percentual/100);
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n" , novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 12 %");

        }

        else if(salario <= 1200) {
            percentual = 10;
            reajuste = salario * (percentual/100);
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n" , novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 10 %");
        }

        else if(salario <= 2000) {
            percentual = 7;
            reajuste = salario * (percentual/100);
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n" , novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 7 %");
        }

        else if(salario > 2000) {
            percentual = 4;
            reajuste = salario * (percentual/100);
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n" , novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 4%");
        }




        entrada.close();
    }
}
