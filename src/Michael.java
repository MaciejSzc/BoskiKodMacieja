import java.util.Objects;

public class Michael {
    private String name;
    private String surname;

    public Michael(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Michael)) return false;
        Michael michael = (Michael) o;
        return Objects.equals(getName(), michael.getName()) &&
                Objects.equals(getSurname(), michael.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname());
    }

    @Override
    public String toString() {
        return "Michael{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
