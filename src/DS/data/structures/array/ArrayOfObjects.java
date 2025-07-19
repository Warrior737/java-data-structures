package DS.data.structures.array;

class Student{
    public int id;
    public String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

}



public class ArrayOfObjects {

    public static void main(String[] args) {

        Student[] arr = new Student[3];

        arr[0] = new Student(1, "Alonso");
        arr[1] = new Student(2, "Guerrero");
        arr[2] = new Student(3, "Linus");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student Name: " + arr[i].name);
        }
    }
}
