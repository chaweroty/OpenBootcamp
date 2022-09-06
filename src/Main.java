public class Main {
  
    public static void main(String[] args) throws Exception {
        int dato1 = 10;
        int dato2 = 20;
        int dato3 = 30;
        
        var valor = suma (dato1, dato2, dato3);
        System.out.println("Ejercicio #1");
        System.out.println(valor);

        class Coche
        {
          int Puertas = 6;
          public void incremetarnumeropuertas()
          {
           this.Puertas ++;
          }
        }
    Coche micoche = new Coche();
      micoche.incremetarnumeropuertas();
      System.out.println("Ejercicio #2");
      System.out.println(micoche.Puertas);

}
    public static int suma (int a, int b, int c)
    {
     return a + b + c;
    }
}

