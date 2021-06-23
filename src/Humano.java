public class Humano extends Heroes {

    private static int contadorInstancias;

    public Humano(String nombre){
        super(180,75,nombre);
        Humano.contadorInstancias++;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Humano y me llamo: " + this.nombre);
    }

    public static int getInstancias(){
        return contadorInstancias;
    }


}