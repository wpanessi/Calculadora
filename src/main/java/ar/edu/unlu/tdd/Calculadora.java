package ar.edu.unlu.tdd;

public class Calculadora {
    public static int sumar(String valores){
        String separador = ",|\n";
        if (valores.startsWith("//")){
            separador = valores.substring(2,3);
            valores = valores.substring(4) ;
        }
        String[] numeros = valores.split(separador);
        if (valores == "")
            return 0;
//        if (numeros.length > 2)
//            throw new RuntimeException();
        if (!valores.matches("[0-9]+((" + separador + ")[0-9]+)*"))
            throw new RuntimeException();
        int suma = 0;
        for (String x: numeros) {
            suma += Integer.parseInt(x);
        }
        return suma;
    }
}
