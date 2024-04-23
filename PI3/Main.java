
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int op;
        ArrayList<Trilha> trilhas = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();

        //Usuários fictícios
        Usuario u1 = new Usuario(1, "Jeff", "Jooj", trilhas);
        usuarios.add(u1);

        Trilha front = new Trilha(1, "Front-End", "Um curso de front end ensina como criar a parte visual e interativa de sites e aplicativos usando HTML, CSS e JavaScript.", cursos, usuarios);
        trilhas.add(front);
        Trilha back = new Trilha(2, "Back-End", "Um curso de front end ensina como criar a parte visual e interativa de sites e aplicativos usando HTML, CSS e JavaScript.", cursos, usuarios );
        trilhas.add(back);
        Trilha ferramentas = new Trilha(3, "Ferramentas ágeis", "Focam em metodologias ágeis (como Scrum, Kanban) e ferramentas (ex: Jira, Trello) para desenvolvimento de software colaborativo e adaptativo.", cursos, usuarios);
        trilhas.add(ferramentas);
        Trilha redes = new Trilha(4, "Redes", "Abordam conceitos básicos e tecnologias de redes de computadores, incluindo arquiteturas, protocolos, segurança e administração de dispositivos de rede.", cursos, usuarios);
        trilhas.add(redes);
        
        System.out.println("---------- BIRDTECH ----------");
        System.out.println(" Plataforma gratuita com trilhas de conhecimento tecnológico organizadas, abrangendo programação, desenvolvimento web, inteligência artificial e ciência de dados. Oferece recursos adicionais como fóruns de discussão e mentoria.\n");
        System.out.println("Escolha uma trilha de conhecimento pelo ID:");
        exibeTrilhas(trilhas);
        

        do {   
            op = dado.nextInt();
            switch (op) {
            
                case 1:
                    
                    break;

                case 2:
                    System.out.println("Será adicionado uma trilha de conhecimento a função");
                    break;

                case 3:
                    System.out.println("Será adicionado uma trilha de conhecimento a função");
                    break;

                case 4:
                    System.out.println("Será adicionado uma trilha de conhecimento a função");
                    break;
                    case 0:
                        System.out.println("Obrigado por usar BirdTech");
                        break;
        
                default:
                    System.out.println("Opção inválida, por favor tente novamente.");
                    break;
                
            }
        }  while (op != 0);

        
    }

    public static void exibeTrilhas(ArrayList<Trilha> trilhas){
        for(Trilha trilha : trilhas){
            System.out.println("Nome da Trila: "+ trilha.getNomeTrilha());
            System.out.println("Descrição da trilha: "+ trilha.getDesricao());
            System.out.println("ID: " + trilha.getIdTrilha());
        }

    }
}