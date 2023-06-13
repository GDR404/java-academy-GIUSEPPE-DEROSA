function stampa(risultato, x)
{
    console.log('Esercizio ' + x + ' , soluzione:');
    console.log(risultato);
}
//1
function add(x,y) {
    const sum = x + y;
    stampa(sum, 1);
    return sum;
  }
//2
  function sott(x,y) {
    const diff = x - y;
    stampa(diff, 2);
  }
//3
  function molt(x,y) {
    const prod = x * y;
    console.log('Esercizio 3, soluzione:');
    console.log('Il prodotto di '+ x + ' e ' + y + ' è: '+ prod);
  }
//4
  function divis(x,y) {
    const result = x / y;
    console.log('Esercizio 4, soluzione:');
    console.log('La divisione tra '+ x + ' e ' + y + ' è: '+ result);
  }
//5
  function module(x,y) {
    const mod = x % y;
    console.log('Esercizio 5, soluzione:');
    console.log('Il modulo tra '+ x + ' e ' + y + ' è: '+ mod);
  }
//6
  function media(array) {
    if(array == undefined)
    {
        array = [0,0,0,0];
    }
    var sum = 0;
    var media;
    for (var i = 0; i < array.length; i++) {
         sum = sum(sum, array[i]);
    }
    media = sum / array.length;
    console.log('Esercizio 6, soluzione:');
    console.log('La media del vettore è: '+ media);
  }
//7
  function pardisp(x) {
    console.log('Esercizio 7, soluzione:');
    if(x % 2 == 0)
    {
        console.log('Il numero '+ x + ' è pari');
    }
    else
    {
        console.log('Il numero '+ x + ' è dispari');
    }
  }
//8
function verifica(x,y) {
    console.log('Esercizio 8, soluzione:');
    if(x === y)
    {
        console.log('I numeri sono uguali');
    }
    else if(x > y)
    {
        console.log('Il numero '+ x + ' è maggiore di ' + y);
    }
    else
    {
        console.log('Il numero '+ x + ' è minore di ' + y);
    }
  }
//9
function isEmpty(strValue) {
    console.log('Esercizio 9, soluzione:');
    if(strValue === "")
    {
        console.log('La stringa è vuota');
    }
    else
    {
        console.log('La stringa non è vuota');
    }
  }
//10
function isIn(strValue, subStrValue) {
    console.log('Esercizio 10, soluzione:');
    if(strValue.includes(subStrValue))
    {
        console.log('La sottostringa è presente');
    }
    else
    {
        console.log('La sottostringa non è presente');
    }
  }
//11
function isIn(char) {
    console.log('Esercizio 11, soluzione:');
    if(char == "A" || x == "E" || x == "I" || x == "O" || x == "U")
    {
        console.log(char + 'è una vocale');
    }
    else
    {
        console.log(char + 'è una consonante');
    }
  }
//12
function isDivis(x) {
    console.log('Esercizio 12, soluzione:');
    var f = 0;
    if (x % 3 == 0 && x % 5 == 0) 
    {
        console.log('Il numero ' + x + ' è divisibile sia per 5 che per 3');
    }
    else if(x % 3 == 0)
    {
        console.log('Il numero ' + x + ' è divisibile sia per 3');
    }
    else if(x % 5 == 0)
    {
        fconsole.log('Il numero ' + x + ' è divisibile sia per 5');
    }
    else
    {
        console.log('Il numero ' + x + ' non è divisibile per 5 o per 3');
    }
  }
//13
function stampaArr(array) {
    console.log('Esercizio 13, soluzione:');
    console.log(array.toString());
  }
//14
function findElement(array, element){
    console.log('Esercizio 14, soluzione:');
    let f = false;
    for(let i = 0; i < array.length; i++)
    {
        if(array[i] == element)
        {
            f = true;
        }
    }
      if(f)
      {
        console.log('L elemento ' + element + ' è stato trovato');
      }
      else
      {
        console.log('L elemento ' + element + ' non è stato trovato');
      }
}
//15
function appendArray(array,array2){
    console.log('Esercizio 15, soluzione:');
    array = array.concat(array2);
    console.log(array.toString());
}
//16
function subArray(array){
    console.log('Esercizio 16, soluzione:');
    let array2 = [];
    let j = 0;
    for (let i = 0; i < array.lengt; i++)
    {
        if (array[i] % 2 == 0)
        {
            array2[j] = array[i];
            j++;
        }
    }
    console.log(array2.toString());
}
//17
function maggioriDi(array){

    console.log('Esercizio 17, soluzione:');
    const result = array.filter(function(array){
        return array > 5;
    });
    console.log(result);
}

function creaOgg()
{
    const persona = {
        Nome: "Giuseppe",
        Cognome: "De Rosa",
        DataDiNascita: new Date("2000-05-29")
    }
    return persona;
}
//18
function stampaOgg(obj){
    if(obj == undefined)
    {
        obj = creaOgg();
    }
    var out ="";
    console.log('Esercizio 18, soluzione:');
    obj.Eta = new Date().getFullYear() - obj.DataDiNascita.getFullYear();
console.log(obj);
}
//19
function stampaOggSpec(obj){
    console.log('Esercizio 19, soluzione:');
      console.log(obj.firstName);
}
//20
function modVal(obj){
    console.log('Esercizio 20, soluzione:');
    console.log(obj.firstName);
    obj.firstName = "Pippo";
    console.log(obj.firstName);
}
//21
function addP(x,y) {
    const sum = x + y;
    console.log('Esercizio 21, soluzione:');
    console.log('La somma di '+ x + ' e ' + y + ' è: '+ sum);
}
//22
function doppio(x) {
    console.log('Esercizio 22, soluzione:');
    console.log('Il valore raddoppiato di ' + x + ' è: '+ x*2);
}
//23
function lunghezza(string) {
    console.log('Esercizio 23, soluzione:');
    console.log('La lunghezza della stringa è: '+ string.lengt);
}