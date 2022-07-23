package genelick;


//class StudentInfo {
//    public int grade;
//
//    StudentInfo(int grade) {
//        this.grade = grade;
//    }
//}
//
//
//class EmployeeInfo {
//    public int rank;
//
//    EmployeeInfo(int rank) {
//        this.rank = rank;
//    }
//}
//
//class Person<T , S> {
//    public T info;
//    public S id;
//
//    Person(T info, S id) {
//        this.info = info;
//        this.id = id;
//    }
//
//    public <U> void printInfo(U info){
//        System.out.println(info);
//    }
//
//
//
//}
//
//
//public class Generic {
//    public static void main(String[] args) {
//
//
//
//       EmployeeInfo e = new EmployeeInfo(3);
//       Integer i = new Integer(10);
//
//       Person p1 = new Person(e,i); //명시적으로 해주지않아도 자바는 알아들을 수 있다.
//
//        p1.<EmployeeInfo>printInfo(e);
//
//
//
//
//    }
//}

abstract class  Info{
    public abstract int getLevel();
}

class  EmployeeInfo extends Info{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank;}

    @Override
    public int getLevel() {
        System.out.println(this.rank);
        return this.rank;
    }
}

class Person<T extends  Info>{

    public T info;
    Person(T info){this.info = info;}

}

public class Generic {
    public static void main(String[] args) {
        Person p1 = new Person(new EmployeeInfo(1));
        //임플로이인포 객체는 추상을 상속받고 있고  퍼슨에서 객체를 매개변수로 넣었을대 Info추상을 참조하고 있으니 getLevel을 쓸수있다.
        p1.info.getLevel();

    }
}