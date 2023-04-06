package pl.marcin.model;

import java.util.Comparator;

public class UJStudentComparator implements Comparator<UJStudent> {
    @Override
    public int compare(UJStudent o1, UJStudent o2) {
        return (int)(o1.getPercentComplete() - o2.getPercentComplete());
    }
}
