var salarioActual, Aumento, salarioFinal;
Aumento = parseFloat(Aumento);
salarioActual = parseFloat(prompt("Ingrese su salario actual: "));
Aumento = parseFloat(prompt("Ingrese el porcentajea aumentar el salario: "));
if(salarioActual<1300606){
    salarioFinal = salarioActual + (salarioActual*Aumento);
} else {
    salarioFinal = salarioActual
}

alert("Su salario con ajuste es: " + salarioFinal)