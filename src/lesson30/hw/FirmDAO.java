package lesson30.hw;

import java.util.Set;
import java.util.TreeSet;

public class FirmDAO {
    private Set<Firm>firms = new TreeSet<>();

    public FirmDAO(Set<Firm> firms) {
        this.firms = firms;
    }

    public Set<Firm> getFirms() {
        return firms;
    }

    public void setFirms(Set<Firm> firms) {
        this.firms = firms;
    }

    @Override
    public String toString() {
        return "FirmDAO{" +
                "firms=" + firms +
                '}';
    }
}
