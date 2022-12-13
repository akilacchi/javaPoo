package guia7_ej09;

public class Matematica {

    private double a;
    private double b;

    public Matematica() {
    }

    public Matematica(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double returnGreater() {
        double aux = Math.max(a, b);
        return aux;
    }

    public int returnPower() {
        int auxA=(int) Math.round(a), auxB=(int) Math.round(b);
        if (auxA > auxB) {
            return (int) Math.pow(auxA, auxB);
        } else {
            return (int) Math.pow(auxB, auxA);
        }
    }
    
    public double sRoot(){
        int auxA=(int) Math.round(a), auxB=(int) Math.round(b);
        if (auxA > auxB) {
            return Math.sqrt(Math.abs(auxB));
        }else{
            return Math.sqrt(Math.abs(auxB));
        }
    }
}
