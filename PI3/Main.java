
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        

        
        
        while (true) {
            menuInicial();
            
        }
        
    }

    public static void exibeTrilhas(ArrayList<Trilha> trilhas){
        for(Trilha trilha : trilhas){
            System.out.println("Nome da Trila: "+ trilha.getNomeTrilha());
            System.out.println("ID: " + trilha.getIdTrilha());
            System.out.println("Descrição da trilha: "+ trilha.getDesricao());
        }
    }

    public static void menuInicial(){
        Scanner dado = new Scanner(System.in);
        System.out.println("---------- BIRDTECH ----------");
        System.out.println(" Plataforma gratuita com trilhas de conhecimento tecnológico organizadas, abrangendo programação, desenvolvimento web, inteligência artificial e ciência de dados. Oferece recursos adicionais como fóruns de discussão e mentoria.\n");
        System.out.println("1. Início");
        System.out.println("2. Trilhas(EM ANDAMENO)");
        System.out.println("3. Colabore(EM ANDAMENTO)");
        System.out.println("4. Entrar(EM ANDAMENTO)");
        System.out.println("5. Cadastr-se(NÃO INICIADO)");
        System.out.println("0. Sair");
        int op = dado.nextInt();

        switch (op) {
            case 1:
                menuInicial();
                break;
            
            case 2:
                menuTrilhas();
                break;

            case 3:
                menuColabore();
                break;

            case 4:
                menuEntrar();
                break;

            case 0:
                System.out.println("Obrigado por usar Birdtech");
                break;

            default:
                System.out.println("Opção inválida, tente novamente");
                
        }
        
    }

    public static void menuTrilhas(){
        Scanner dado = new Scanner(System.in);
        int op; 
        ArrayList<Trilha> trilhas = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();


        Trilha front = new Trilha(1, "Front-End", "Um curso de front end ensina como criar a parte visual e interativa de sites e aplicativos usando HTML, CSS e JavaScript.", cursos, usuarios);
        trilhas.add(front);
        Trilha back = new Trilha(2, "Back-End", "Um curso de front end ensina como criar a parte visual e interativa de sites e aplicativos usando HTML, CSS e JavaScript.", cursos, usuarios );
        trilhas.add(back);
        Trilha ferramentas = new Trilha(3, "Ferramentas ágeis", "Focam em metodologias ágeis (como Scrum, Kanban) e ferramentas (ex: Jira, Trello) para desenvolvimento de software colaborativo e adaptativo.", cursos, usuarios);
        trilhas.add(ferramentas);
        Trilha redes = new Trilha(4, "Redes", "Abordam conceitos básicos e tecnologias de redes de computadores, incluindo arquiteturas, protocolos, segurança e administração de dispositivos de rede.", cursos, usuarios);
        trilhas.add(redes);

        do {
            System.out.println("---------- TRILHAS DE CONHECIMENTO ----------");
            exibeTrilhas(trilhas);
            System.out.println("Escolha uma trilha de conhecimento pelo ID:");
            op = dado.nextInt();   
            switch (op) {
                case 1:
                    System.out.println("Será adicionado uma trilha de conhecimento a função");
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

    public static void menuColabore(){
        System.out.println("Juntos pelo Futuro: Colabore Conosco!\n\nCaro usuário,\nSua ajuda é fundamental para o crescimento do BirdTech. Contribua financeiramente através do QR Code ou link abaixo e fortaleça nossa missão de democratizar o conhecimento tecnológico. Juntos, podemos construir um futuro mais brilhante para todos.\n\nInsira aqui o QR Code ou link de pagamento\n\nObrigado pelo seu apoio,\n\nEquipe BirdTech\n");
    }

    public static Usuario menuEntrar(){
        Scanner dado = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();

        //Usuários fictícios
        Usuario u1 = new Usuario(1, "Andreza", "Luíze");
        usuarios.add(u1);
        Usuario u2 = new Usuario(2, "Antônio", "Guedes");
        usuarios.add(u2);
        Usuario u3 = new Usuario(3, "Danilo", "Fernandes");
        usuarios.add(u3);
        Usuario u4 = new Usuario(4, "Giovanna", "Araujo");
        usuarios.add(u4);

        System.out.println("Entre com seu ID: ");
        int id = dado.nextInt();

        for(Usuario usuario : usuarios){
            if(usuario.getId() == id){
                System.out.println("Bem-vindo, "+ usuario.getNome()+ " " + usuario.getSobrenome() + "!");
                return usuario;
            }
        }
        
        System.out.println("Id de usuário não encontrado");
        return null;
    }
}



/*
    ESSA PARTE É GPT PRA APRENDER COMO DEIXA O USUÁRIO LOGADO, SE ALGUÉM SOUBER FAZ E ME AJUDA POR FAVOR
  Dessa forma, ao chamar o método menuEntrar(), você pode atribuir o usuário retornado a uma variável e usá-la para manter o usuário selecionado no sistema. Por exemplo:

java
Copy code
Usuario usuarioLogado = menuEntrar(usuarios);
if (usuarioLogado != null) {
    // Usuário encontrado, continuar com o sistema
} else {
    // Usuário não encontrado, tratar de acordo (ex: oferecer opção de cadastro)
}
Certifique-se de tratar adequadamente o caso em que o usuário não é encontrado, como mostrado no exemplo acima.
 
 */