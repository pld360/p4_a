public class Student {

  private String FirstName;
  private String LastName;
  private int Age;

  public Student(String firstname, String lastname, int age) {
    FirstName = firstname;
    LastName = lastname;
    Age = age;
  }

  public String GetFirstName() {return FirstName;}
  public String GetLastName() {return LastName;}
  public int GetAge() {return Age;}

  public String ToString() {
    return FirstName + " " + LastName + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", "Parse Error", -1);
    return new Student(data[0], data[1], Integer.parseInt(data[2]));
  }
}