package Builder;

import tariff.TariffBonus;

/**
 * Created by Pleshevich on 15.10.2016.
 */
public interface Builder {

    public TariffBonus getTariffBonus(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet, int costSms, int costMegabyte, int packageInternet, int packageMinute);
}
