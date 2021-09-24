

public class Amount {

    private double value =0;


    public double getValue() {
        return value;
    }

    public static double amountOf(double valor){
        return valor;
    }

    public double plus(double depositValue) {
        if (depositValue<0)
            throw new RuntimeException("No se puede depositar numeros menores que cero,");
        this.value = this.value + depositValue;
        return amountOf(value);
    }

    public double substract(double withdraw) {
        if (withdraw>this.value)
            throw new RuntimeException("No se puede retirar un valor mayor al de su cuenta.");
        this.value = this.value - withdraw;
        return amountOf(value);
    }




}
