public class Employee {
   private   int id;
   private  String fullName;
   private   int department;
   private  int payday;
   private static int counter = 1;

   public Employee (String fullName, int department, int payday) {
      this.id = counter++;
      this.fullName = fullName;
      this.department = department;
      this.payday = payday;
   }

   public String getFullName() {
      return fullName;
   }

   public int getPayday() {
      return payday;
   }

   public int getDepartment() {
      return department;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "id=" + id +
              ", fullName='" + fullName + '\'' +
              ", department=" + department +
              ", payday=" + payday +
              '}';
   }

   public void setDepartment(int department) {
      this.department = department;
   }

   public void setPayday(int payday) {
      this.payday = payday;


   }
}

