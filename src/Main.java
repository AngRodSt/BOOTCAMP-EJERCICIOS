public class Main {
    //CONDICIONALES//
    public  static void main(String[] args) {
        String festividad ="Carnaval";

        if (festividad == "Navidad"){
            System.out.println ("Es Navidad");
        } else if (festividad == "Carnaval"){
            System.out.println("A bailar, es Carnaval");
        } else if (festividad == "San Valentín"){
            System.out.println("Feliz San Valentín");
        }
        else{
            System.out.println("No encontramos la  festividad deseada");
        }



        //BUCLE WHILE//
        int contador = 10;
        while (contador > 0){
            System.out.println(contador);
            contador = contador - 1;
        }

        //OPERACIONES
        suma(20,50,63);

        //CLASES Y OBJETOS
        coche micoche= new coche();
        micoche.numpuertas();
        System.out.println(micoche.puertas);



        //BUCLE FOR
        int valores[]= {10,20,30,40,50};
        for (int i=0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

        int temperatura=15;
        for (; temperatura <= 20; temperatura++){
            System.out.println(temperatura);
        }

        //SWITCH CASE
        var provincia="La Vega";
        switch (provincia){
            case "Santiago":
                System.out.println("Esta es la provincia de Santiago");
                break;
            case "La Vega":
                System.out.println("Esta es la provincia de La Vega");
                break;
            case "Moca":
                System.out.println("Esta es la provincia de Moca");
                break;
            default:
                System.out.println("La provincia no coincide con las registradas");
        }

      //EJERCICIOS TEMA 4 INICIO

        //IF

       int numeroIf= 5;
        if (numeroIf == 0){
            System.out.println("El valor es igual a 0");}
            else if(numeroIf>0){
                System.out.println("El valor es positivo");}
        else {
            System.out.println("El valor es negativo");
        }

        //WHILE

        int numeroWhile=0;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //DO WHILE
        int numeroDowhile=2;
        do {
            numeroDowhile++;
        System.out.println(numeroDowhile);}
        while(numeroDowhile<3);

        //BUCLE FOR

        for (int numeroFor=0; numeroFor<=3; numeroFor++){
        System.out.println(numeroFor);}

        //SWITCH CASE

        var estacion="VERANO";
        switch (estacion){
            case "OTOÑO":
                System.out.println("Estamos en Otoño");
                break;
            case "VERANO":
                System.out.println("Estamos en Verano");
                break;
            case "INVIERNO":
                System.out.println("Estamos en Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("La estación propuesta no es la indicada");
        }

    }
    //FUNCION DE OPERACIONES
    public static int suma(int a, int b, int c)
    {int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
        return resultado;
    }

    //FUNCION DEL OBJETO COCHE
    static class coche {
        public int puertas =0;
        public void numpuertas(){
            this.puertas++;

        }
    }
}

