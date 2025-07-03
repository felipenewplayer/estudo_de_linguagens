// Strategy Pattern — Flexibilidade de comportamento
// 🧠 Objetivo:
// Permitir trocar algoritmos de forma dinâmica, sem alterar o código principal.

// 💡 Quando usar:
// Quando você tem várias formas de fazer uma mesma tarefa

// Quando quer escolher o comportamento em tempo de execução

// Substitui vários if/else ou switch por algo mais limpo e escalável


const semDesconto = (preco) => preco;

const desconto10 = (preco) => preco * 0.90;

const desconto20 = (preco) => preco * 0.80;
function calcularPrecoFinal(preco, estrategiaDesconto) {
    return estrategiaDesconto(preco)
}

console.log("Sem desconto: " + calcularPrecoFinal(10, semDesconto));
console.log("Com desconto de 10: " + calcularPrecoFinal(10, desconto10));
console.log("Com desconto de 20: " + calcularPrecoFinal(10, desconto20));


const normal = (preco) => preco;
const vip = (preco) => preco * 0.9;
const funcionario = (preco) => preco * 0.7;

function calcularPreco(preco, estrategiaDesconto) {
    return estrategiaDesconto(preco);
}

console.log("Normal: R$", calcularPreco(100, normal));
console.log("VIP: R$", calcularPreco(100, vip));
console.log("Funcionário: R$", calcularPreco(100, funcionario));
