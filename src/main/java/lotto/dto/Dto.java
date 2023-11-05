package lotto.dto;

import java.util.List;
import lotto.domain.LottoTickets;
import lotto.domain.LuckyNumbers;

public class Dto {
    private LuckyNumbers luckyNumbers;
    private LottoTickets lottoTickets;
    private List<Integer> numbers;
    private int bonus;

    public LuckyNumbers getLuckyNumbers() {
        return luckyNumbers;
    }

    public LottoTickets getLottoTickets() {
        return lottoTickets;
    }

    public void setMoney(int money) {
        lottoTickets = new LottoTickets(money);
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setLuckyNumbers() {
        luckyNumbers = new LuckyNumbers(bonus, numbers);
    }
}