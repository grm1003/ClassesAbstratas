public class Carro implements Veiculo{

    private String marca,cor, modelo;
    private double potencia;

    public Carro(String marca, String cor, String modelo, double potencia) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Carro{" +"\n" +
                "marca='" + marca +"\n" +
                ", cor='" + cor + "\n" +
                ", modelo='" + modelo + "\n" +
                ", potencia=" + potencia + "\n" +
                '}';
    }

    @Override
    public String marca() {
        return getMarca();
    }

    @Override
    public String modelo() {
        return getModelo();
    }

    @Override
    public String cor() {
        return getCor();
    }

    @Override
    public String mostraDados() {
        return this.toString();
    }

    @Override
    public double potencia() {
        return getPotencia();
    }
}
