package co.jp.chapter09;

//Employee.java
public class Employee {
private String id;
public Employee(String id) {
this.id = id;
}
@Override
public boolean equals(Object another) {
if (another instanceof Employee) {
Employee an = (Employee) another;
return an.id.equals(id);
}
return false;
}
}

