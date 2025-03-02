package temperaturamedia;

import java.text.DecimalFormat;

public class TemperaturaMedia {
    public static void main(String[] args) {
        // Array de temperaturas médias registradas em uma semana
        double[] temperaturas = {20.5, 22.0, 19.8, 21.3, 18.5, 23.1, 20.0};

        // Variável para armazenar a soma das temperaturas
        double soma = 0.0;

        // Loop para somar todas as temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }

        // Cálculo da temperatura média
        double media = soma / temperaturas.length;

        // Formatar a média para duas casas decimais
        DecimalFormat df = new DecimalFormat("#.00");
        String mediaFormatada = df.format(media);

        // Exibir a temperatura média
        System.out.println("A temperatura média da semana é: " + mediaFormatada + " graus Celsius");
    }
}
