
public class App {
    public static void main(String[] args){
        //Conexion c = new Conexion(); //No funciona por que el constructor es privado
        Singleton c = Singleton.getInsatancia();
        c.conectar();
        c.desconectar();

        boolean rpta = c instanceof Singleton;
        System.out.println(rpta);
    }
}