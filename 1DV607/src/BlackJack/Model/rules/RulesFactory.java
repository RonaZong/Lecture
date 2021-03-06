package BlackJack.Model.rules;

public class RulesFactory {
    public IHitStrategy GetHitRule() {
        return new BasicHitStrategy();
    }

    public INewGameStrategy GetNewGameRule() {
        return new AmericanNewGameStrategy();
    }
}
