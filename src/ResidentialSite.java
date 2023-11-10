public class ResidentialSite extends Site{
    ResidentialSite(double _unit, double _rate){
        super(_unit, _rate);
    }

    @Override
    public double getBaseAmount(){
        return _unit * _rate;
    }

    @Override
    public double getTaxAmount(){
        return getBaseAmount() * TAX_RATE;
    }

}
