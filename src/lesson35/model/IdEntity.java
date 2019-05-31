package lesson35.model;

public abstract class IdEntity {
    public abstract long getId();
    public abstract void setId(long id);
    public abstract boolean equals(Object o);
    public abstract int hashCode();
}
