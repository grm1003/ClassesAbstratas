import java.util.ArrayList;
import java.util.List;

public class VeiculosMain {
    public static void main(String[] args) {
        int maior = 0,menor = 0;
        double maiorpotencia = 0, menorpotencia = 500;
        Veiculo[] carros = new Veiculo[5];
        int ct = 0;
        carros[ct] = new Carro("honda","vermelho","Civic",120);
        ct++;
        carros[ct] = new Carro("chevrolet","vermelho","Camaru",150);
        ct++;
        carros[ct] = new Carro("mercedes","azul","T315",300);
        ct++;
        carros[ct] = new Carro("ferrari","vermelho","F15",400);
        ct++;
        carros[ct] = new Carro("mercedes","cinza","A200",280);
        
        for(int i = 0; i<5;i++){
            if(carros[i].cor() == "vermelho"){
                if(carros[i].potencia()>maiorpotencia){
                    maiorpotencia = carros[i].potencia();
                    maior = i;
                }
                if(carros[i].potencia()<menorpotencia){
                    menorpotencia = carros[i].potencia();
                    menor = i;
                }
            }
        }

        System.out.println(carros[maior].modelo());
        System.out.println(carros[menor].modelo());
    }
}
