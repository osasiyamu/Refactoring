public class Site {
    double TAX_RATE;
    double _unit;
    double _rate;

    Site(double _unit, double _rate){
        this._unit = _unit;
        this._rate = _rate;
        this.TAX_RATE = 0.13;
    }

    public double getBillableAmount(){
        return 0.1;
    }

    public double getBaseAmount(){
        return 0.1;
    }

    public double getTaxAmount(){
        return 0.1;
    }

}
