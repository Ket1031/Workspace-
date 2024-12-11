public class Animal {

     String tipo;
     String som;

     Animal(){
     }
     Animal(String tipo, String som){
         this.tipo = tipo;
         this.som = som;
     }

      void fazSom(){
          System.out.println("O " + tipo + som);
      }
}
