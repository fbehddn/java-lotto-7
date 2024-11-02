package lotto.view;

import java.util.List;
import lotto.domain.Lotto;

public class OutputView {

    public void showTicket(int amount) {
        System.out.print(amount + "개를 구입했습니다.\n");
    }

    public void matchResult() {
        System.out.println("당첨 통계\n---");
    }

    public void showLottos(List<Lotto> lottos) {
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getNumbers());
        }
    }

    public void showProfitRate(double profitRate) {
        System.out.printf("총 수익률은 %.1f%%입니다.%n", profitRate);
    }
}
