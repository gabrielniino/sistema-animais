class Gato extends Animal {
    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void falar() {
        System.out.println("O gato mia: Miau!");
    }
}