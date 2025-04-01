class Animal {
    protected String nome;
    protected int idade;
    protected double peso;

    // Construtor
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void falar() {
        System.out.println("Este animal faz um som.");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + " anos, Peso: " + peso + " kg";
    }
}