interface Pessoa {
    nome: string,
    idade: number,
    isWorking: boolean
}


const usuario: Pessoa = {
    nome: "Felipe",
    idade: 45,
    isWorking: false
}

const people: Pessoa[] = [{
    nome: "Felipe",
    idade: 45,
    isWorking: false
}, {
    nome: "Rafa",
    idade: 45,
    isWorking: false
}]

console.log(people);

const somarAge = people.reduce((acc, person) => acc + person.idade, 0);
console.log(somarAge);

// const agruparPorNome = people.reduce((acc, person) => {
//     const nome = person.nome;
//     if (!acc[nome]) {
//         acc[nome] = [];
//     }
//     acc[nome].push(person);
//     return acc;
// }, {} as Record<string, Pessoa[]>);
// console.log(agruparPorNome);

// interface Produto {
//     nome: string,
//     preco: number,
//     emEstoque: boolean
// }
// const produtos = [
//     { nome: "Camisa", preco: 80, emEstoque: true },
//     { nome: "Calça", preco: 120, emEstoque: false }
// ];

function listarProdutos(produtos: Produto[]): string[] {
    return produtos.map(p => p.nome);
}
// console.log(listarProdutos(produtos));

interface Pe {
    nome: string,
    idade: number
}

const pp: Pe[] = [
    { nome: "João", idade: 27 },
    { nome: "Rafa", idade: 30 },
    { nome: "Marcos", idade: 45 },
    { nome: "Marcos", idade: 60 },
]

function agruparPorNome() {
    return pp.reduce((acc: Record<string, Pe[]>, p) => {
        const nome = p.nome;
        if (!acc[nome]) {
            acc[nome] = [];
        }
        acc[nome].push(p);
        return acc;
    }, {})
}

console.log(agruparPorNome());


function agruparPorIdade() {
    return pp.reduce((acc: Record<number, Pe[]>, p) => {
        const decada = Math.floor(p.idade / 10) * 10;
        if (!acc[decada]) {
            acc[decada] = [];
        }
        acc[decada].push(p)
        return acc;
    }, {});
}
console.log(agruparPorIdade());


const quantosNomes = () => {
    return pp.reduce((acc: Record<string, number>, p) => {
        const nome = p.nome;
        if (!acc[nome]) {
            acc[nome] = 0;
        }
        acc[nome]++
        return acc;
    }, {});
}
console.log(quantosNomes());

const agruparPrimeirLetraNome = () => {
    return pp.reduce((acc: Record<string, Pe[]>, p) => {
        const inicial = p.nome[0].toUpperCase();
        if (!acc[inicial]) {
            acc[inicial] = [];
        }
        acc[inicial].push(p)
        return acc;
    }, {})
}

console.log(agruparPrimeirLetraNome());


interface Produto {
    nome: string;
    preco: number;
}

const produtos: Produto[] = [
    { nome: "Camisa", preco: 80 },
    { nome: "Calça", preco: 120 },
];

// Sua função aqui 👇
function resumirProdutos(produtos: Produto[]): string[] {
    return produtos.map((p) => `${p.nome} - R$${p.preco}`);
}

console.log(resumirProdutos(produtos));