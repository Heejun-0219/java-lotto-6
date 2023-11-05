package lotto.view;

public class OutputView {

    public static void buyLottoTicket() {
        System.out.println(OutputEnum.BUY_LOTTO_TICKET.get());
    }

    public static void getLottoTicket(int count) {
        System.out.println(count + OutputEnum.GET_LOTTO_TICKET.get());
    }

    public static void numbersLotto() {
        System.out.println(OutputEnum.NUMBERS_LOTTO.get());
    }

    public static void bonusLotto() {
        System.out.println(OutputEnum.BONUS_LOTTO.get());
    }

    public static void resultLotto() {
        System.out.println(OutputEnum.RESULT_LOTTO.get());
    }

    public static void resultLottoCount(int count) {
        System.out.println(count + OutputEnum.RESULT_LOTTO_COUNT.get());
    }

    public static void resultEarnings(double earnings) {
        System.out.println(OutputEnum.RESULT_EARNINGS.get() + earnings + OutputEnum.RESULT_EARNINGS_PERCENT.get());
    }

    public static void resultLottoCountAndEarnings(int count, double earnings) {
        resultLottoCount(count);
        resultEarnings(earnings);
    }
}
