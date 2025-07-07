// map, filter, reduce, some, every

const produtos = [
    { nome: "Camisa", preco: 50 },
    { nome: "Calça", preco: 120 },
    { nome: "Tênis", preco: 200 },
    { nome: "Boné", preco: 30 }
];



const soNomeMaiusculo = produtos.map(p => p.nome.toUpperCase());
const precoMais50 = produtos.filter(p => p.preco > 50);
const somaTotal = produtos.reduce((acc, produto) => acc + produto.preco, 0);
const temMenos40 = produtos.some(p => p.preco < 40);
const temNome = produtos.every(p => p.nome);
