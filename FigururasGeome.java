public class FigururasGeome {
    float ladoCuadrado;
    float baseTriangulo;
    float alturaTriangulo;
    float radioCirculo;
    int opcionFiguraGeometrica;

    public FigururasGeome(float ladoCuadrado, float baseTriangulo, float alturaTriangulo, float radioCirculo,
            int opcionFiguraGeometrica) {
        this.ladoCuadrado = ladoCuadrado;
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
        this.radioCirculo = radioCirculo;
        this.opcionFiguraGeometrica = opcionFiguraGeometrica;
    
            }    
    public void calcularArea(){

        switch (opcionFiguraGeometrica) {

          case 1:
                float areaCuadrado = ladoCuadrado*ladoCuadrado;
                System.out.println("El Area del cuadrado es: "+areaCuadrado );
               break;
    
          case 2:
                float areaTriangulo = baseTriangulo*alturaTriangulo/2;
                System.out.println("El Area del cuadrado es: "+areaTriangulo );     
               break;
            
          case 3:
                double areaCirculo = Math.PI*radioCirculo*radioCirculo;
                System.out.println("El Area del cuadrado es: "+areaCirculo ); 
               break;

        default:
            break;
        }            
    }    
    
}
