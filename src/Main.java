public class Main {

    public static void main(String[] args) {

        double raiz= Math.sqrt(5);
        System.out.println(raiz); //raiz cuadrada de cualquie numero


        double base= 151515, exponente=0, resultado; //metodo para determinar la base y la potencia de un numero
        resultado=Math.pow(base,exponente);
        System.out.println(resultado);

        double numero1= 5.56;
        long resultadoRedondeado1=Math.round(numero1); //metodo para redondear un numero usando double
        System.out.println(resultadoRedondeado1);

        float numero2=  2.49f;
        int resultadoRedondeado2=Math.round(numero2);  // metodo para redondear un numero usando float
        System.out.println(resultadoRedondeado2);


        double numeroX= Math.random(); //metodos para obtener numeros aleatorios 
        System.out.println(numeroX);

    }
}
