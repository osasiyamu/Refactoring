public class ResidentialSite extends Site{
    ResidentialSite(double _unit, double _rate){
        super(_unit, _rate);
    }

    public double getBillableAmount(){
        double base = _unit * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }

}
