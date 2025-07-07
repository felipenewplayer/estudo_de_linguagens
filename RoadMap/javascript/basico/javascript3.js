//  3. Arrays e Objetos
// Desafio:
// Dado o seguinte array de produtos:
// Mostre todos os nomes no DOM com forEach.
// Calcule o total de preços.
// Crie uma função que filtre apenas os produtos com valor acima de 100.
const div = document.getElementById("div");
const h1 = document.createElement("h1");
const ul = document.createElement("ul");
const ulFiltrado = document.createElement("ul");
div.style.width = "500px";
div.style.backgroundColor = "#ffaaff";
div.style.padding = "20px";
h1.textContent = "Desafio 3";
div.appendChild(h1);


const produtos = [
    { nome: "Camisa", preco: 50 },
    { nome: "Calça", preco: 120 },
    { nome: "Tênis", preco: 200 },
    { nome: "Boné", preco: 30 }
];


const produtosTela = () => {
    const tituloProduto = document.createElement("h2");
    tituloProduto.textContent = "Produtos";
    produtos.forEach(produto => {
        const li = document.createElement("li");
        li.textContent = `Nome: ${produto.nome} --- Preço: ${produto.preco}`;
        ul.appendChild(li);
    })


    div.appendChild(tituloProduto);
    div.appendChild(ul);
}

const produtosSoma = () => {
    const p1 = document.createElement("h3");
    p1.textContent = "Total dos preços";
    const soma = produtos.reduce((acc, produto) => acc + produto.preco, 0);
    const totalDePrecos = document.createElement("p");
    totalDePrecos.textContent = `R$ ${soma} reais`;

    div.appendChild(p1);
    div.appendChild(totalDePrecos);
}


const produtoFiltradoRenderizado = () => {
    const produtoFiltrado = produtos.filter(p => p.preco > 100);
    produtoFiltrado.forEach(p => {

        const li = document.createElement("li");
        li.textContent = `Nome: ${p.nome} --- ${p.preco}`
        ulFiltrado.appendChild(li)
    })
    const textoProdutoFiltrado = document.createElement("h3");
    textoProdutoFiltrado.textContent = " Produtos filtrados com mais de 100 reais";
    div.appendChild(textoProdutoFiltrado);

    div.appendChild(ulFiltrado);
}

const renderizar = () => {
    produtosTela();
    produtosSoma();
    produtoFiltradoRenderizado();
};

renderizar();



