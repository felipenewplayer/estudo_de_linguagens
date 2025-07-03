// 🔹 2. Factory Pattern — Criador flexível de objetos
// 🧠 Objetivo:
// Criar objetos dinamicamente, encapsulando a lógica de criação e evitando o uso direto de new.

// 💡 Conceito:
// Em vez de criar objetos manualmente (new Object()), usamos uma função-fábrica (factory function).

// Pode retornar objetos diferentes com base em parâmetros.


function criarProduto(nome, valor, qnt, desconto = 0) {
    return {
        nome,
        valor,
        qnt,
        desconto,
        apresentar() {
            console.log(`${this.nome} com ótima qualidade no valor de R$ ${this.valor.toLocaleString("pt-BR", { minimumFractionDigits: 2 })}, temos ${this.qnt} no estoque`);
        },
        precoFinal() {
            return this.valor * (1 - this.desconto);
        }
    };
}

const p1 = criarProduto("PlayStation 2", 499.00, 2, 0.15);
p1.apresentar();
console.log("Preço com desconto: R$", p1.precoFinal().toLocaleString("pt-BR", { minimumFractionDigits: 2 }));



function criarFuncionario(nome, cargo, salario) {
    return {
        nome,
        cargo,
        salario,
        calcularBonus() {
            if (cargo === "gerente") {
                return salario * 0.20;  // 20%
            }
            if (cargo === "desenvolvedor") {
                return salario * 0.10;  // 10%
            }
            return salario * 0.05;      // 5% para outros cargos
        }
    }
}

const c1 = criarFuncionario("Felipe", "gerente", 25000);
console.log(c1.calcularBonus()); // 5000
console.log(c1);