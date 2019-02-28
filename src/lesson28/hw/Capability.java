package lesson28.hw;

import java.util.Date;

public class Capability implements Comparable<Capability> {

    private long id;
    private String channelName;
    private String fingerprint;
    private boolean isActive;
    private Date dateCreated;

    @Override
    public int compareTo(Capability capability) {

        System.out.println("compareTo is used");

        return (int) (this.id - capability.getId());

        // before: 1001, 1005, 900
        // step1:  1001-1005 = -4
        // after:  1001, 1005, 900
        // ничего не меняется

        // before: 1001, 1005, 900
        // step1:  1005-900 = 105
        // after:  1001, 900, 1005
        // меняем местами

        // before: 1001, 900, 1005
        // step1:  1001-900 = 101
        // after:  900, 1001, 1005
        // меняем местами

    }

    public Capability(long id, String channelName, String fingerprint, boolean isActive, Date dateCreated) {
        this.id = id;
        this.channelName = channelName;
        this.fingerprint = fingerprint;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
    }

    public long getId() {
        return id;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public boolean isActive() {
        return isActive;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Capability{" +
                "id=" + id +
                ", channelName='" + channelName + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                ", isActive=" + isActive +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
