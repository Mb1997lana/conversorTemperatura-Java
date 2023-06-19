public class Main {
    public static void main(String[] args) {
        int temperaturaCelsius = 18;
        double conersao = (temperaturaCelsius * 1.8) + 32;
        int casting = (int) conersao;

        String mensagem = """
                Olá! Sou o Conversor de Temperatura!
                %d graus Celsius equivale a %.1f graus Farenheit.
                E arredondando fica: %d graus Farenheit.
                """ .formatted(temperaturaCelsius, conersao, casting);
        System.out.println(mensagem);
    }
}

        //Resolução dos instrutores da Alura.
       /* public class DesafioTemperatura {

            public static void main(String[] args) {
                double temperaturaEmCelsius = 30.4;
                double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

                String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

                System.out.println(mensagem);

                int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
                System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

            }

        }*/

