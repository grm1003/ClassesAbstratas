public class Vendedor extends Funcionario{
    private double vendas;

    public Vendedor(String nome, String matricula, double salario_base, double vendas) {
        super(nome, matricula, salario_base);
        this.vendas = vendas;
    }

    private double getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
    public double retornaVendas(){
        return this.getVendas();
    }

    @Override
    public double CalculaSalario(){
        return (this.getSalario_base()+(getVendas()*5/100));
    }
    @Override
    public String toString() {
        return "Vendedor:" + "\n" +
                "Nome:" + getNome() +  "\n" +
                "Matricula:" + getMatricula() + "\n" +
                "Vendas:" + retornaVendas() + "\n" +
                "Salario:" + CalculaSalario() + "\n"
                ;
    }
}
