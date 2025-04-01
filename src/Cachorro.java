class Cachorro extends Animal {
    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void falar() {
        System.out.println("O cachorro late: Au Au!");
    }
}