package Collection_Framework;

public class Chhatra implements Comparable<Chhatra>  {
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "Chhatra{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Chhatra(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    public int that;
    @Override
    public int compareTo(Chhatra that) {
        if (this.age== that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }

}
