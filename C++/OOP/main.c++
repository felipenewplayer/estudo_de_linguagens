#include <iostream>
using namespace std;

// Classe base
class Pessoa {
private:
    string nome;
    int idade;
    bool isWorking;

public:
    Pessoa(string n, int i, bool working) : nome(n), idade(i), isWorking(working) {}

    string getNome() { return nome; }
    int getIdade() { return idade; }
    bool getIsWorking() { return isWorking; }

    void setNome(string n) { nome = n; }
    void setIdade(int i) { idade = i; }
    void setIsWorking(bool working) { isWorking = working; }

    // Método virtual permite que classes filhas modifiquem esse comportamento
    virtual void mostrar() {
        cout << "Pessoa: " << nome << ", Idade: " << idade << ", Trabalhando? " << (isWorking ? "Sim" : "Nao") << endl;
    }

    // Virtual destructor para evitar problemas ao deletar objetos derivados via ponteiro base
    virtual ~Pessoa() {}
};

// Classe derivada
class Funcionario : public Pessoa {
private:
    string cargo;
    double salario;

public:
    Funcionario(string n, int i, bool working, string c, double s)
        : Pessoa(n, i, working), cargo(c), salario(s) {}

    string getCargo() { return cargo; }
    double getSalario() { return salario; }

    void setCargo(string c) { cargo = c; }
    void setSalario(double s) { salario = s; }

    // Sobrescreve o método mostrar da classe base (polimorfismo)
    void mostrar() override {
        cout << "Funcionario: " << getNome() << ", Idade: " << getIdade()
             << ", Trabalhando? " << (getIsWorking() ? "Sim" : "Nao")
             << ", Cargo: " << cargo << ", Salario: " << salario << endl;
    }
};

int main() {
    Pessoa p1("Felipe", 27, false);
    p1.mostrar();

    Funcionario f1("Rafael", 34, true, "Desenvolvedor", 8000.50);
    f1.mostrar();

    // Polimorfismo: ponteiro da classe base pode apontar para objeto derivado
    Pessoa* p2 = new Funcionario("Maria", 29, true, "Analista", 6500.75);
    p2->mostrar();  // Chama Funcionario::mostrar graças ao método virtual

    delete p2;  // Sempre que usar new, delete depois para evitar vazamento

    return 0;
}
