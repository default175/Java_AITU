
class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private int id = 0;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = idCounter++;
    }


    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }
    @Override
    public String toString(){
        return getId() + " . " + getName() + " " + getSurname();
    }
    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount(){
        return 0.0;
    }

    @Override
    public int compareTo(Person other){
        return Double.compare(this.getPaymentAmount(),other.getPaymentAmount());
    }

}
