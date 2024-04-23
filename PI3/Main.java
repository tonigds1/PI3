import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        boolean confirma;

        Trilha front = new Trilha(1, "Front", "Coisinhas bonitinhas que aparecem na tela");

        Trilha back = new Trilha(2, "Back", "Lógica e depressão" );
        
        System.out.println("---------- BIRDTECH ----------");
        System.out.println("Bem-Vindo ao BirdTech, um dos melhor site de informação, aulas e tecnologia que tem!");
        System.out.println("Escolha uma trilha de conhecimento:");
        System.out.println("1. FrontEnd");
        System.out.println("2. BackEnd");
        System.out.println("0. Sair");
        int op = dado.nextInt();

        switch (op) {
            case 1:
                System.out.println(front.getDesricao());
                System.out.println("Confirma?(YES/NO)");
                confirma = dado.nextBoolean();
                if(confirma == true){
                    System.out.println("Será adicionado uma trilha de conhecimento a função");
                }
                else{
                    System.out.println("Renorna ao menu");
                }
                break;
            
            case 2: 
            System.out.println(back.getDesricao());
            System.out.println("Confirma?(true/false)[tem que melhorar!]");
            confirma = dado.nextBoolean();
            if (confirma == true) {
                System.out.println("Começa o programa");
            }
             
            break;

            case 0:
                System.out.println("Sai do programa!");
            break;
        
            default:
            System.out.println("Dígito errado e tmj, responde aí namoral!");
                break;
        }


        
    }
}