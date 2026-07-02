import java.util.*;

public class InnerArrayList {

    public static void main(String[] args) {

        Collection list = new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add("hello");
        list.add(new Employee());
        InnerArrayList innerArrayList = new InnerArrayList();
        box<String> box = innerArrayList.new box<>();
        box.add("Hello World");
        System.out.println(box.get());

        //System.out.println("Elements in the list: " + list);
        for(int i=0;i<list.size();i++){
            System.out.println(map.get(i));
        }
    }
    static class Employee {
        Integer employeeId;
        String employeeName;

        public Employee() {
            this.employeeId = 1;
            this.employeeName = "John Doe";
        }
        public String toString() {
            return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
        }
    }   
    class box<T> {
        T data;

        public void add(T t) {
            this.data = t;
        }

        public T get() {
            return data;
        }
    }}
