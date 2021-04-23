
package calculadora;

public class Calculos {
    double num1;
    double num2;

//    public Calculos(double num1, double num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }
    public Calculos(){}

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    // Metodo para la suma
    public int sumar(double a, double b){
        int res = 0;
 
        res = (int)(a + b);
        
        return res;
    }
    
    // Metodo para la potencia
    public int potencia(double b, double p){
        int res = 0;
        
        res = (int)Math.pow(b, p);
        
        return res;
    }
    
    
    // Metodo para la raiz cuadrada
    public double raiz (double a){
        double res = 0.0;
        
        res = Math.sqrt(a);
        
        return res;
    }
    
    // Metodo para numero aleatorio
    // donde a es el numero mayor y b el numero menor
    public int aleatorio(double a,double b){
        int res = 0;
        
        res =  (int)((Math.random())*(a-b+1)+b);
        
        return res;
    }
    
    public int sumatoria(double a,double b){
        int res = 0;
        
        int n = (int) b;
        
        for (int i = (int) a; i<=n ; i++) {
            res +=i;
        }return res;
    }
    
    
    
    
    
    
    
    
    
    
    
}
