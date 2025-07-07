// Let and cost
const btn = document.getElementById("btn");
const txt = document.getElementById("txt");
const div = document.getElementById("div");
let pontos = 0;
btn.addEventListener("click", () => {
    txt.textContent = pontos++;
})

const btnDelete = document.createElement("button");
btnDelete.addEventListener("click", () => {
        txt.textContent = pontos  = 0;

})
btnDelete.textContent = "Resetar";
div.style.width = "400px";
div.style.height = "400px";
div.style.padding = "10px";
div.style.backgroundColor = "#ffaaff"
div.appendChild(btnDelete);






