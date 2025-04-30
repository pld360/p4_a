public class Student {

  private String FirstName;
  private String LastName;
  private int Age;
  private String Year;
  private String Month;
  private String Day;

  public Student(String firstname, String lastname, int age, String year, String month, String day) {
    FirstName = firstname;
    LastName = lastname;
    Age = age;
    Year = year;
    Month = month;
    Day = day;
  }

  public String GetFirstName() {return FirstName;}
  public String GetLastName() {return LastName;}
  public int GetAge() {return Age;}
  public String GetYear() {return Year;}
  public String GetMonth() {return Month;}
  public String GetDay() {return Day;}

  public String ToString() {
    return FirstName + " " + LastName + " " + Integer.toString(Age) + " " + Year + " " + Month + " " + Day;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 6) 
      return new Student("Parse Error", "Parse Error", -1, "Parse Error", "Parse Error", "Parse Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4], data[5]);
  }
}