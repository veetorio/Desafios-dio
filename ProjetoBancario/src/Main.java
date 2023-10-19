import java.util.Scanner;

public class Main {
    @SuppressWarnings("All")
    static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("--------- Seja bem vindo --------");
        
        System.out.println("Qual seu nome ?");
        String nome = leia.next();
        System.out.println("Qual seu email ?");
        String email = leia.next();
        System.out.println("Qual seu agencia ?");
        Integer agencia = Integer.parseInt(leia.next());

        
        Val_Nome(nome);
        Val_email(email);
        Val_agencia(agencia);

        
    }
    private static Boolean Val_Nome(String nome){
        boolean isBlanck = !(nome.isBlank());
        boolean Maxlenght = nome.length() < 30;
        if(isBlanck){
            if(Maxlenght){
                System.out.println("Nome Salvo com sucesso !!" + nome);
                return true;
            }else{
                System.out.println("Seu nome excede o limite de caracteres permitido");
                return false;
            }
        }else{
            System.out.println("Preencha este espaço com o seu nome pfv");
            return false;
        }
    }
    private static boolean Val_email(String email){

        boolean isEmail = email.matches("[A-z0-9]+@gmail.com");
        Boolean isBlank = !email.isBlank();
        if(isBlank){
            if(isEmail){
                System.out.println("Sucesso seu email foi cadastrado " + email);
                return true;
            }else{
                System.out.println("digite corretamente seu email ");
                return false;
            }
        }else{
            System.out.println("preencha este espaço com seu email");
            return false;
        }
    }
    private static boolean Val_agencia(Integer agencia){
        String str_agencia = agencia.toString();
        Boolean isBlank = !(str_agencia.isBlank());
        Boolean Maxlenght = str_agencia.length() < 5;

        if(isBlank){
            if(Maxlenght){
                str_agencia = str_agencia.replace(' ','-');
                System.out.printf("%s",str_agencia);
                return true;
            }else{System.out.println("atingiu limite maximo");
        return false;}
        }else{
            System.out.println("Esta vazio");
            return false;
        }
    }

}
