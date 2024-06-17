public class RewardValue {
     double cash;
     double miles;
    RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * 0.0035;
    }

    public RewardValue(double cashValue) {
        this.cash = cash;
        this.miles = cash / 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
