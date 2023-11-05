package lotto.service;

import java.util.List;
import lotto.domain.LuckyNumbers;
import lotto.dto.Dto;
import lotto.utils.UserNumbersUtils;

public class LottoService {
    private Dto dto = new Dto();
    // 서비스와 관련된 기능 구현 (로또 티켓 구매, 로또 티켓 출력, 로또 번호 입력, 로또 번호 예외 처리, 로또 결과 출력)
    private int money;

    public void userInputMoney(String userInput) {
        int money = MoneyValidator.validate(userInput);

        dto.setMoney(money);
    }

    public void userInputNumbers(String userInput) {
        UserNumbersValidator.preValidate(userInput);
        List<Integer> numbers = UserNumbersUtils.convert(userInput);
        UserNumbersValidator.postValidate(numbers);
        List<Integer> sortedNumbers = UserNumbersUtils.sort(numbers);

        dto.setNumbers(sortedNumbers);
    }

    public void userInputBonus(String userInput) {
        int bonus = BonusValidator.validate(userInput);

        dto.setBonus(bonus);
    }

    public void makeLuckyNumbers() {
        dto.setLuckyNumbers();
    }

    public int getTicketCount() {
        return dto.getLottoTickets().getTicketCount();
    }

    public List<String> getLottoTickets() {
        return makeLottoTickets.make(dto.getLottoTickets().getTickets());
    }

    public void makeWinningStatistics() {
        dto.makeWinningStatistics();
    }
}
