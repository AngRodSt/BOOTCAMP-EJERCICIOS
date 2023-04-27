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

