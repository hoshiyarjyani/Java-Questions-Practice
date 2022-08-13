fullname.charAt(i)



name1.compareTo(name2)
it compare three sitution
 1. name1>name2   return positive value 
 2. name1<name2   return negetive values 
 3. name1==name2  return 0


 Strings

 Declaration
 String name = "Tony";
 
 Taking Input
 Scanner sc = new Scanner(System.in);
        String name = sc.next();
 
 Concatenation (Joining 2 strings)
 String firstName = "Tony";
        String secondName = "Stark";
  
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);
 
 Print length of a String
 String firstName = "Tony";
        String secondName = "Stark";
  
        String fullName = firstName + " " + secondName;
        System.out.println(fullName.length());
 
 Access characters of a string
 String firstName = "Tony";
        String secondName = "Stark";
  
        String fullName = firstName + " " + secondName;
  
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
 
       
        public class Strings {
           public static void main(String args[]) {
               String name1 = "Tony";
               String name2 = "Tony";
         
               if(name1.equals(name2)) {
                   System.out.println("They are the same string");
               } else {
                   System.out.println("They are different strings");
               }
         
               //DO NOT USE == to check for string equality
               //Gives correct answer here
               if(name1 == name2) {
                   System.out.println("They are the same string");
               } else {
                   System.out.println("They are different strings");
               }
         
               //Gives incorrect answer here
               if(new String("Tony") == new String("Tony")) {
                   System.out.println("They are the same string");
               } else {
                   System.out.println("They are different strings");
               }
              
           }
        }
        
        
        Substring
        The substring of a string is a subpart of it.
        public class Strings {
           public static void main(String args[]) {
               String name = "TonyStark";
             
               System.out.println(name.substring(0, 4));
              
              
           }
        }
        
        ParseInt Method of Integer class
        public class Strings {
           public static void main(String args[]) {
               String str = "123";
               int number = Integer.parseInt(str);
               System.out.println(number);
              
              
           }
        }
        
        ToString Method of String class
        public class Strings {
           public static void main(String args[]) {
              int number = 123;
              String str = Integer.toString(number);
              System.out.println(str.length());
              
              
           }
        }
        
        
        
        ALWAYS REMEMBER : Java Strings are Immutable.
        
        
        
        
        
        
        
        
        
        Homework Problems
        Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        import java.util.*;
         
        public class Strings {
           public static void main(String args[]) {
             Scanner sc = new Scanner (System.in);
             int size = sc.nextInt();
             String array[] = new String[size];
             int totLength = 0;
         
             for(int i=0; i<size; i++) {
               array[i] = sc.next();
               totLength += array[i].length();
             }
         
             System.out.println(totLength);
           }
        }
        
        Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        Example : 
        original = “eabcdef’ ; result = “iabcdif”
        Original = “xyz” ; result = “xyz”
        
        import java.util.*;
         
        public class Strings {
           public static void main(String args[]) {
             Scanner sc = new Scanner (System.in);
             String str = sc.next();
             String result = "";
         
             for(int i=0; i<str.length(); i++) {
               if(str.charAt(i) == 'e') {
                 result += 'i';
               } else {
                 result += str.charAt(i);
               }
             }
         
             System.out.println(result);
           }
        }
        
        Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        Example : 
        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
        email = “helloWorld123@gmail.com”; username = “helloWorld123”
        import java.util.*;
         
        public class Strings {
           public static void main(String args[]) {
             Scanner sc = new Scanner (System.in);
             String email = sc.next();
             String userName = "";
         
             for(int i=0; i<email.length(); i++) {
               if(email.charAt(i) == '@') {
                break;
               } else {
                 userName += email.charAt(i);
               }
             }
         
             System.out.println(userName);
           }
        }
        
        
