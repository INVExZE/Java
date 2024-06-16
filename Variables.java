public class Variables {

    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int myNum1;
        myNum1 = 15;
        System.out.println(myNum1);

        int myNum2 = 15;
        myNum2 = 20;  // myNum2 is now 20
        System.out.println(myNum2);

        //Other Types
        /*A demonstration of how to declare variables of other types:*/

        int myNum3 = 5;
        System.out.println(myNum3);

        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);

        char myLetter = 'D';
        System.out.println(myLetter);

        boolean myBool = true;
        System.out.println(myBool);

        String myText = "Hello";
        System.out.println(myText);


        /*Display Variables
        The println() method is often used to display variables.

        To combine both text and a variable, use the + character: */
        String name1 = "John";
        System.out.println("Hello " + name1);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        
        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);       
              
    }
    
}
