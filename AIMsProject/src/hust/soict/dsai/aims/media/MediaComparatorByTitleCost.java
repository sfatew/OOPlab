package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{

    @Override
    public int compare(Media o1, Media o2) {
        int costComparison = Double.compare(o2.getCost(), o1.getCost()); // Higher cost first
        if (costComparison == 0) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return costComparison;
    }

}
