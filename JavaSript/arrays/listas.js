const numeros = [1, 2, 3, 4, 5, 6];
const somaDosPares = numeros.filter(n => n % 2 === 0).reduce((acc, n) => acc + n, 0);
console.log("Soma dos pares: " + somaDosPares);
const linguagens = ["Java", "JS", "Java", "Python", "Java"];
let contador = 0;
for(let linguagem of linguagens){
    if(linguagem === "Java"){
        contador++;
    }
}
console.log(contador);

console.log(linguagens.reduce((acc, linguagem) => linguagem === "Java"? acc+1 : acc,0));


const produtos = [
  { nome: "Camisa", categoria: "Roupas" },
  { nome: "Notebook", categoria: "Eletrônicos" },
  { nome: "Calça", categoria: "Roupas" },
];

const agrupar = produtos.reduce((acc, produto) => {
    const categoria = produto?.categoria??"Sem categoria";
    if(!acc[categoria]) acc[categoria] = [];
    acc[categoria].push(produto.nome);
    return acc;
}, {})

console.log(agrupar);

const valores = [12, 14, 9, 18];
const maiorerQue10 = valores.every(n => n > 10);
console.log(maiorerQue10);


const carrinho = [
  { produto: "Livro", preco: 30 },
  { produto: "Caneta", preco: 5 },
  { produto: "Lápis", preco: 3 },
];

const totalPreco = carrinho.reduce((acc, produto)=> acc + produto.preco, 0);
console.log(`Total de preços do carrinho : R$ ${totalPreco.toLocaleString("pt-BR", {minimumFractionDigits:2})}`);



const numero = '2' ;
console.log(typeof(numero));
console.log(0 ==  "0");
console.log(0 === false);

let x = "5";
let y = 2;
let z = x + y; 
console.log(z);


