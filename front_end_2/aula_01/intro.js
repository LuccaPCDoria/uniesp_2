/* 
let lista = ["Uva","banana","Maça"];

for(i = 0; i < lista.length; i++){
    console.log(`Item ${i+1}° da lista: ${lista[i]}`);
}

let pessoa = { nome: "Ana", idade: 25 };

for (let chave in pessoa) {
    console.log(chave, ":", pessoa[chave]);
}

let numeros = [10, 20, 30];

for (let valor of numeros) {
    console.log(valor);
} 
*/

// Criando as funções e tipos de funções

function soma(){
    var total = 0;
    for(argumento of arguments){
        total += argumento;
    }
    return `O total é ${total} e argumentos foram ${arguments.length} numeros` ;
}
console.log(soma(1,2,23,4,54,54,54,5,45,4,54));

