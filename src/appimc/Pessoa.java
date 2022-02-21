package appimc;

public class Pessoa {
    public float altura;
    public float peso;
    public String nome;

    public float calcularImc() {
        return peso / (altura * altura);
    }

    public String interpretacao() {
        double indice = calcularImc();
        if (indice < 18.5) {
            return "magreza";
        } else if (indice >= 18.5 && indice <= 24.9) {
            return "Normal";
        } else if (indice >= 25.0 && indice <= 29.9) {
            return "sobrepeso";
        } else if (indice >= 30 && indice <= 40) {
            return "obesidade";
        } else {
            return "obesidade grave";
        }
    }
}