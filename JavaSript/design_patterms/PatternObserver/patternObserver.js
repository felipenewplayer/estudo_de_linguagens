// Observer Pattern — Ouvinte de eventos
// 🧠 Objetivo:
// Permitir que múltiplos "observadores" (funções, objetos, componentes...) reajam automaticamente a mudanças de estado em um objeto.

// 💡 Onde é usado:
// Em sistemas de eventos (como addEventListener)

// No React, o useEffect depende desse conceito

// Em sistemas de pub/sub (publish/subscribe)

// Em apps com notificações, atualizações em tempo real, etc.

// 🧱 Estrutura básica:
// Um sujeito (Subject) que tem um estado e mantém uma lista de observadores.

// Toda vez que o estado muda, ele notifica todos os observadores.


function CanalTemperatura() {
    const observadores = [];

    function inscrever(obs){
        observadores.push(obs);
    }

    function notificar(mensagem){
        observadores.forEach(obs => obs(mensagem)); // Aqui é o ponto!
    }

    return {
        inscrever,
        notificar
    };
}

// Criar o canal de temperatura
const c1 = CanalTemperatura();

c1.inscrever((msg) => console.log("Sensor 1 recebeu:", msg));
c1.inscrever((msg) => console.log("Sensor 2 recebeu:", msg));

c1.notificar("Temperatura: 25°C");

function EstacaoMeteorologica() {
  let temperatura = 0;
  const observadores = [];

  function inscrever(observer) {
    observadores.push(observer);
  }

  function atualizarTemperatura(novaTemp) {
    temperatura = novaTemp;
    console.log("Temperatura atualizada para", temperatura, "°C");
    observadores.forEach(obs => obs(temperatura));
  }

  return {
    inscrever,
    atualizarTemperatura
  };
}

// 🔔 Observadores
const painelDigital = (temp) => console.log("[Painel] Temp:", temp);
const alerta = (temp) => temp > 30 && console.log("[Alerta] Calor extremo!");

// 🏭 Estação
const estacao = EstacaoMeteorologica();
estacao.inscrever(painelDigital);
estacao.inscrever(alerta);

estacao.atualizarTemperatura(28);
estacao.atualizarTemperatura(35);
