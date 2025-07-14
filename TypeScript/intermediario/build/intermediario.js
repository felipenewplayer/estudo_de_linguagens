"use strict";
//Union Types e Literal Types
// Union Types: aceitar mais de um tipo
function mostrarId(id) {
    if (typeof id === "string") {
        console.log("Texto:", id.toUpperCase());
    }
    else {
        console.log("Número: ", id.toFixed(1));
    }
}
mostrarId(10);
mostrarId("Felipe");
