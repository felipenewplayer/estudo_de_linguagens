// 💡 Conceito:
// Usa uma função IIFE (Immediately Invoked Function Expression).

// Retorna um objeto com os métodos públicos.

// Variáveis internas ficam "privadas" (fora do escopo global).



const CaixaMensagens = (() => {
    const mensagens = [];

    function adicionar(mensagem) {

        return mensagens.push(mensagem)
    }

    function listar() {
        mensagens.forEach(m => {
            console.log(m);
        })
    }
    function limpar() {
        return mensagens.length = 0;
    }
    return {
        adicionar,
        listar,
        limpar,
    }
})();


CaixaMensagens.adicionar("Boa noite, senhores!");
CaixaMensagens.adicionar("A lua está bela, senhores!");
CaixaMensagens.listar();
CaixaMensagens.limpar();




const CalculadoraSimples = (() => {
    const numberA = 0;
    const numberB = 0;
    function somar(numberA, numberB) {
        return console.log(numberA + numberB);
    }
    function subtrair(numberA, numberB) {
        return console.log(numberA - numberB);
    }
    function multiplicar(numberA, numberB) {
        return console.log(numberA * numberB);
    }
    function dividir(numberA, numberB) {
        return console.log(numberA / numberB);
    }

    return {
        somar,
        subtrair,
        multiplicar,
        dividir
    }
})();

CalculadoraSimples.somar(10, 20);
CalculadoraSimples.subtrair(10, 20);
CalculadoraSimples.multiplicar(10, 20);
CalculadoraSimples.dividir(10, 20);