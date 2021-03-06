package 行为型.statusPattern.state;

import 行为型.statusPattern.StateMachine;

public class NoQuarterState implements State {

    StateMachine stateMachine;

    public NoQuarterState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您投入了一个硬币！");
        stateMachine.setState(stateMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("您还没有投币，怎么能要求退款");
    }

    @Override
    public void turnCrank() {
        System.out.println("扳扳手也没有，您还没有投币");
    }

    @Override
    public void dispense() {
        System.out.println("您需要先投币,才会发放糖果");
    }
}
