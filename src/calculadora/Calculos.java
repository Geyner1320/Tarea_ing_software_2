
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
    
    public String fibonacci(int n1, int n2){
        String res = "";
        
        int serie = n2, num1 = 0, num2 = 1, suma = 1;
          
        for (int i = 1; i < serie; i++) {
             
            if(suma>=n1 && suma <n2){
            res+=" "+suma;
            }    
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma; 
        } 
        return res;
    }
    
    
    
    public String serieN(int n){
        String res = "";
        int numBase=5; 
        for (int i = 1; i < n; i++) {
            double num = (double)i/numBase;
            double decimal = num % 1;
            
            if(decimal==0){
                if(num %2==0){
                    
                    res+=" N "+i+" ";
                }else{
                    
                    res+=" N ";
                }
            }else{
            res+=" "+i+" ";
            
            }
        } 
        return res;
    }
    
    
    
}
