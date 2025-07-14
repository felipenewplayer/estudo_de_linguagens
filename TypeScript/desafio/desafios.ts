function parOuImpar(n: number): string {
    if (n % 2 === 0) {
        return "Par";
    } else {
        return "Ímpar";
    }
}
console.log(parOuImpar(5));



function tabuada(n: number): void {
    for (let i = 0; i <= 10; i++) {
        const resultado = `${n} X ${i} = ${n * i}`;
        console.log(resultado);
    }
}

tabuada(6);

function somaDosPares(): number {
    let soma = 0
    for (let i = 1; i <= 100; i++) {
        if (i % 2 === 0) {
            soma += i;
        }
    }
    return soma;
}
console.log(somaDosPares());

function calcularMedia(notas: number[]): string {
    const soma = notas.reduce((acc, nota) => acc + nota, 0);
    const media = soma / notas.length;
    if (media > 7) {
        return "Aprovado";
    } else if (media >= 5) {
        return "Está de DP";
    } else {
        return "Reprovado";
    }
}

console.log(calcularMedia(([6, 7, 8])));



function maiorEMenorNumero(valores: number[]): { maior: number, menor: number } {
    const maior = Math.max(...valores);
    const menor = Math.min(...valores);
    const array = { maior, menor };
    return array;
}
console.log(maiorEMenorNumero([3, 9, 2, 7, 1]));


function dobrarValores(valores: number[]): number[] {
    return valores.map(n => n * 2);
}
console.log(dobrarValores([2, 4, 6]));

interface Pessoa {
    nome: string,
    idade: number
}

const usuario: Pessoa[] = [
    { nome: "Felipe", idade: 28 },
    { nome: "Rafael", idade: 5 }
];
function maiorDeIdade(pessoa: Pessoa[]): Pessoa[] {
    return pessoa.filter(p => p.idade > 18);
}
console.log(maiorDeIdade(usuario));

interface Produto {
    nome: string,
    preco: number
}

const produtos: Produto[] = [
    { nome: "Arroz", preco: 26.99 },
    { nome: "Arroz", preco: 26.99 },
    { nome: "Feijão", preco: 11.99 },
    { nome: "Macarrão", preco: 2.99 },
    { nome: "Batata", preco: 1.99 }
]

function somaPreco(produtos: Produto[]): number {
    return produtos.reduce((acc, produto) => acc + produto.preco, 0);
}
console.log(somaPreco(produtos));

function procurarProduto(produtos: Produto[], nome: string): Produto | undefined {
    return produtos.find(p => p.nome === nome);
}
console.log(procurarProduto(produtos, "Feijão"));

function ordenarPorIdade(pessoa: Pessoa[]): Pessoa[] {
    return pessoa.sort((a, b) => a.idade - b.idade);
}
console.log(ordenarPorIdade(usuario));


function agruparPorInicial(produtos: Produto[]): Record<string, Produto[]> {
    return produtos.reduce((acc: Record<string, Produto[]>, produto) => {
        const inicial = produto.nome[0];
        if (!acc[inicial]) {
            acc[inicial] = [];
        }
        acc[inicial].push(produto);
        console.log(inicial);

        return acc;
    }, {});
}
console.log(agruparPorInicial(produtos));


function contaPorNome(produtos: Produto[]) {
    return produtos.reduce((acc: Record<string, number>, produto) => {
        const nome = produto.nome;
        if (!acc[nome]) {
            acc[nome] = 0;
        }
        acc[nome]++;
        return acc;
    }, {});
}
console.log(contaPorNome(produtos));

interface ProdutoPorCategoria extends Produto {
    categoria: string;
}


function somarPorCategoria(produtos: ProdutoPorCategoria[]): Record<string, number> {
    return produtos.reduce((acc, produto) => {
        const categoria = produto.categoria ?? "Sem categoria";
        acc[categoria] = (acc[categoria] || 0) + produto.preco;
        return acc;
    }, {} as Record<string, number>);
}


function filtrarOrdenar(produtos: Produto[]): Produto[] {
    return produtos.filter(p => p.preco > 10).sort((a, b) => b.preco - a.preco);
}

console.log(filtrarOrdenar(produtos));




interface Venda {
    produto: string,
    categoria: string,
    valor: number,
    data: string
}

const vendas: Venda[] = [
    { produto: "Notebook", categoria: "Eletrônicos", valor: 3000, data: "2025-07-01" },
    { produto: "Celular", categoria: "Eletrônicos", valor: 1800, data: "2025-07-02" },
    { produto: "Camisa", categoria: "Roupas", valor: 80, data: "2025-07-03" },
    { produto: "Calça", categoria: "Roupas", valor: 120, data: "2025-07-03" },
    { produto: "Geladeira", categoria: "Eletrodomésticos", valor: 2500, data: "2025-07-04" },
    { produto: "Celular", categoria: "Eletrônicos", valor: 1900, data: "2025-07-05" },
    { produto: "Calça", categoria: "Roupas", valor: 100, data: "2025-07-06" }
]


function somarValores(vendas: Venda[]): Venda[] {
    return vendas.filter(v => v.valor > 2000);
}

console.log(somarValores(vendas));

function removerDuplicados(vendas: Venda[]): Venda[] {
    const nomesUnicos = new Set<string>();
    return vendas.filter((produto) => {
        if (!nomesUnicos.has(produto.produto)) {
            nomesUnicos.add(produto.produto);
            return true;
        }
        return false;
    });
}

console.log(removerDuplicados(vendas));


function agruparPorCategoria(vendas: Venda[]): Record<string, Venda[]> {
    return vendas.reduce((acc: Record<string, Venda[]>, venda) => {
        const categoria = venda.categoria;
        if (!acc[categoria]) {
            acc[categoria] = [];
        }
        acc[categoria].push(venda);
        return acc;
    }, {})
}
console.log(agruparPorCategoria(vendas));

function contarVendas(vendas: Venda[]) {
    return vendas.reduce((acc: Record<string, number>, venda) => {
        const produto = venda.produto;
        if (!acc[produto]) {
            acc[produto] = 0;

        }
        acc[produto]++;

        return acc;
    }, {})
}
console.log(contarVendas(vendas));

function ordenarPorPrecoDesc(vendas: Venda[]): Venda[] {
    return vendas.sort((a, b) => b.valor - a.valor)
}

console.log(ordenarPorPrecoDesc(vendas));

function produtoMaisVendido(vendas: Venda[]) {
    const contagem = vendas.reduce((acc: Record<string, number>, venda) => {
        const produto = venda.produto;
        if (!acc[produto]) {
            acc[produto] = 0;
        }
        acc[produto]++;
        return acc;
    }, {});
    let nomeProduto = "";
    let qtd = 0;
    for (const produto in contagem) {
        if (contagem[produto] > qtd) {
            nomeProduto = produto;
            qtd = contagem[produto];
        }
    }
    return { produto: nomeProduto, quantidade: qtd };
}

console.log(produtoMaisVendido(vendas));

function filtrarAgruparOrdenar(vendas: Venda[]) {
    return vendas
        .filter(v => v.valor > 1500)
        .reduce((acc: Record<string, Venda[]>, venda) => {
            const categoria = venda.categoria;
            if (!acc[categoria]) {
                acc[categoria] = [];
            }
            acc[categoria].push(venda);
            acc[categoria].sort((a, b) => b.valor - a.valor);
            return acc;
        }, {});


}

console.log(filtrarAgruparOrdenar(vendas));