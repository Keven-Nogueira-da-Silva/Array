import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Mariana");
        nomes.add("João");
        nomes.add("Pedro");

        System.out.println("Digite um nome para verificar: ");
        String nameParaProcurar = sc.nextLine();

        if (nomes.contains(nameParaProcurar)){
            System.out.println("O nome " + nameParaProcurar + "está na lista");
        }else{
            System.out.println("O nome " + nameParaProcurar + "NÃO está na lista");
        }
        sc.close();
    }
}