public class Code  {
    float salarioActual;
    float salarioFinal;
    float Aumento;
    public Code(float salarioActual, float Aumento, float salarioFinal){
        this.salarioFinal = salarioFinal;
        this.Aumento = Aumento;
        this.salarioActual = salarioActual;
    }
    public float calcularSalario(){
        if (salarioActual<1300606) {
            salarioFinal=salarioActual+(salarioActual*Aumento);
        } else{
            salarioFinal=salarioActual;
        }
        return salarioFinal;
    }
}