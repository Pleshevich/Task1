package Builder;

import tariff.Species;
import tariff.TariffBonus;

/**
 * Created by Pleshevich on 14.10.2016.
 */
public class Absolute implements Builder {

    public TariffBonus getTariffBonus(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet, int costSms,int costMegabyte, int packageInternet, int packageMinute) {
        TariffBonus tariffBonus = new TariffBonus(costSubscriptionFee,costMinuteInNet,costMinuteInOtherNet,costSms,costMegabyte,Species.ABSOLUTE,packageInternet,packageMinute);
        return tariffBonus;
    }

}