public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Rex", 5, 12.3);
        Gato gato = new Gato("Mia", 3, 4.5);

        System.out.println(cachorro);
        cachorro.falar();

        System.out.println(gato);
        gato.falar();
    }
}
