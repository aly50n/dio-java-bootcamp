import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o primeiro numero: ");
            double numero1 = input.nextDouble();
            System.out.print("Digite o segundo numero: ");
            double numero2= input.nextDouble();
            int auxiliar;
            do {
                System.out.println("=============================================");
                System.out.print("1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Módulo\n6-Sair\nSelecione uma operação: ");
                System.out.println("\n=============================================");
                auxiliar = input.nextInt();
                switch (auxiliar) {
                    case 1:
                        System.out.println("O resultado da soma dos numeros é: " + adicao(numero1, numero2));
                        break;
                    case 2:
                        System.out.println("O resultado da subtração dos numeros é: " + subtracao(numero1, numero2));
                    break; 
                    case 3:
                        System.out.println("O resultado da multiplicação dos numeros é: " + multiplicacao(numero1, numero2));
                    break;  
                    case 4:
                        System.out.println("O resultado da divisão dos numeros é: " + divisao(numero1, numero2));
                    break;   
                    case 5:
                        System.out.println("O resultado do módulo dos numeros é: " + modulo(numero1, numero2));
                    break; 
                    default:
                        System.out.println("Operação encerrada!");
                        break;
                }
            }while(auxiliar !=6);
            input.close();
        }
       

    public static double adicao(double numero1, double numero2){
        return numero1+numero2;
    }

    public static double subtracao(double numero1, double numero2){
        return numero1-numero2;
    }

    public static double multiplicacao(double numero1, double numero2){
        return numero1*numero2;
    }

    public static double divisao(double numero1, double numero2){
        return numero1/numero2;
    }

    public static double modulo(double numero1, double numero2){
        return numero1%numero2;
    } 
} 