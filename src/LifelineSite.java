public class LifelineSite extends Site{
    LifelineSite(double _unit, double _rate){
        super(_unit, _rate);
    }

    @Override
    public double getBaseAmount(){
        return _unit * _rate * 0.5;
    }

    @Override
    public double getTaxAmount(){
        return getBaseAmount() * TAX_RATE * 0.2;
    }
}
