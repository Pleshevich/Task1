package Builder;

import tariff.Tariff;
import tariff.TariffBonus;

import java.util.List;

/**
 * Created by Pleshevich on 15.10.2016.
 */
public class Worker {

    public static Tariff searchTariffForCostMinuteInNet(
            List<Tariff> tariff, int costMinuteInNet) {
        TariffBonus tariffBonus = null;
        for (int i = 0; i < tariff.size(); i++) {
            if (tariff.get(i) instanceof TariffBonus) {
                tariffBonus = (TariffBonus) tariff.get(i);
                if (tariffBonus.getCostMinuteInNet() == costMinuteInNet) {
                    return (Tariff) tariffBonus;
                }
            }
        }
        return tariffBonus;
    }

}
