import java.util.ArrayList;
import java.util.List;

public class FuncionarioMain {


    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];
        int ct = 0;
        funcionarios[ct] = new Vendedor("gabriel","12121bsi217",5000, 10000);
        ct++;
        funcionarios[ct] = new Gerente("juliano","1124242121",15000);
        ct++;
        funcionarios[ct] = new Vendedor("marcos","325326623",4500, 8000);
        ct++;
        funcionarios[ct] = new Assistente("felipe","125552141",3000);
        ct++;
        funcionarios[ct] = new Vendedor("gabriel","12121bsi217",5000, 10000);
        ArrayList<Funcionario> f = new ArrayList<Funcionario>(List.of(funcionarios));
        f.forEach(element -> System.out.println((element.toString())));

    }
}