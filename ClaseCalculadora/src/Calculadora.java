public class Calculadora {
    int num1;
    int num2;

    public Calculadora (int numA, int numB) {
        this.num1 = numA;
        this.num2 = numB;
    }

    public Calculadora (int numA) {
        this.num1 = numA;
    }

    
    //metodos
    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int multiplicacion() {
        return num1 * num2;
    }

    public int division() {
        return num1 / num2;
    }

    public int valorAbsoluto() {
        return Math.abs(num1);
    }

    public int exponente() {
        return (int) Math.pow(num1, num2);
    }

    public boolean esPositivo() {
        if (num1 >= 0) {
            return true;
        } else return false;

    }

    public int atributos() {
        return num1;
    }


    //getters y setters
    public int getNum1() {
        return num1;
    }



    public void setNum1(int num1) {
        this.num1 = num1;
    }



    public int getNum2() {
        return num2;
    }



    public void setNum2(int num2) {
        this.num2 = num2;
    }
}