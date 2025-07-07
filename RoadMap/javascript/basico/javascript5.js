//  5. DOM e Eventos Básicos
// Desafio:
// Monte um mini formulário de tarefa:

// Um campo de texto para digitar uma tarefa.

// Um botão “Adicionar”.

// Ao clicar, adicione a tarefa abaixo em uma lista (ul).

// Clique em uma tarefa para marcar como concluída (riscar o texto com CSS).

const div = document.getElementById("container");
div.style.backgroundColor = "#ffeeff";
div.style.height = "600px";
const btn = document.getElementById("btn");
const input = document.getElementById("input");
const ul = document.getElementById("ul");
const section = document.getElementById("section")
section.style.width = "400px"
section.style.backgroundColor = "#ffaaee"
input.addEventListener("input", (e) => {
    e.preventDefault();

    
})


