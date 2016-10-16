package Builder;

import tariff.Species;
import tariff.TariffBonus;

/**
 * Created by Pleshevich on 14.10.2016.
 */
public class SmartMini implements Builder {

    @Override
    public TariffBonus getTariffBonus(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet, int costSms, int costMegabyte, int paskageInternet, int paskageMinute) {
        TariffBonus tariffBonus = new TariffBonus(costSubscriptionFee,costMinuteInNet,costMinuteInOtherNet,costSms,costMegabyte,Species.SMARTMINI,paskageInternet,paskageMinute);
        return tariffBonus;
    }

}
