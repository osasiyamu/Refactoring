public class LifelineSite extends Site{
    LifelineSite(double _unit, double _rate){
        super(_unit, _rate);
    }

    public double getBillableAmount(){
        double base = _unit * _rate * 0.5;
        double tax = base * TAX_RATE * 0.2;
        return base + tax;
    }
}
