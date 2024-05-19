package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

    @Override
    public int compare(Media o1, Media o2) {
        int titleComparison = o1.getTitle().compareTo(o2.getTitle());
        if (titleComparison == 0) {
            return Double.compare(o2.getCost(), o1.getCost()); // Higher cost first
        }
        return titleComparison;

    }
}
