// Classe Animal (classe base)
class Animal {
    public void fazSom() {
        System.out.println("O Animal emite um som");
    }
}

// Classe Gato (subclasse de Animal)
class Gato extends Animal {
    @Override
    public void fazSom() {
        System.out.println("O Gato mia");
    }
}