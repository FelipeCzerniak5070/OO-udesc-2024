public class TestaOlaMundo {
    public static void main(String[] args) {
        // Instanciando um objeto e executando os métodos
        new OlaMundo().imprimirDados();
        new OlaMundo().imprimir("Fulano", 18);
        // Instanciando um objeto e atribuindo-o à uma variável
        OlaMundo ola = new OlaMundo();
        ola.imprimir("Fulano", 18);
        ola.nome = "Beltrano"; // Alterando atributo 'nome'
        ola.idade = 20; // Alterando atributo 'idade'
        ola.imprimirDados();
    }
}