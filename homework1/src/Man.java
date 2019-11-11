import java.util.Objects;

public class Man {
    private String name;
    private int age;

    public Man() {}

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("Man is walking");
    }

    public void eat() {
        System.out.println("Man is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Man{name=");
        stringBuffer.append(name);
        stringBuffer.append(", age=");
        stringBuffer.append(age);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return age == man.age &&
                name.equals(man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
