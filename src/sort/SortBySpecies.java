package sort;

import tariff.Tariff;
import tariff.TariffBonus;

import java.util.Comparator;

/**
 * Created by Pleshevich on 15.10.2016.
 */
public class SortBySpecies implements Comparator<Tariff> {
        @Override
        public int compare(Tariff o1, Tariff o2) {
            TariffBonus tariffBonus1 = null;
            TariffBonus tariffBonus2 = null;
            if (o2 instanceof TariffBonus) {
                tariffBonus2 = (TariffBonus) o2;
            }
            if (o1 instanceof TariffBonus) {
                tariffBonus1 = (TariffBonus) o1;
            }
            return tariffBonus1.getSpecies().compareTo(tariffBonus2.getSpecies());
        }

    }

