package people;

public class Person2Demo {

    public static void main(String[] args) {
        Person[] personData = new Person[5];
        Person bd = new Person("Bob Dylan", 5, 24, 1941);
        Person nr = new Person("Noomi Rapace", 12, 28, 1974);
        Person pr = new Person("Pharrell Williams", 3, 5, 1973);
        Person fs = new Person("Frank Sinatra", 12, 12, 1915);
        Person dk = new Person("Diana Krall",11, 16, 1964);
        personData[0] = bd;
        personData[1] = nr;
        personData[2] = pr;
        personData[3] = fs;
        personData[4] = dk;
        for (int i = 0; i < personData.length; i = i + 1){
            System.out.println(personData[i]);
        }
    }
}
