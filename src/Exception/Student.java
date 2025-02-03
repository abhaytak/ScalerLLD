package Exception;

//RUNTIME EXCEPTION OR UNCHECKED: DISCLAIMER IS NOT GIVEN
//public class Student {
//    public  int doSomething()
//    {
//        return 1/0; //language know this kind of exception so it throws that
//    }
//}

//EXCEPTION OR CHECKED: YOU HAVE TO GIVE THE DISCLAIMER BY THROWS KEYWORD
public  class Student {
    //Here in the if condition code already warning i might throw this error due to some error like db connection lost.
    //that exception which is not in out control
    //So have to handle it by like below [throws ClassNotFoundException (took this eg for understanding the topic)]
    public int doSomething(int rollNo) throws ClassNotFoundException {
        if (rollNo < 30) {
            throw new ClassNotFoundException();
        }
        return 1 / 0;
    }
}
//RUNTIME EXCEPTION OR UNCHECKED: DISCLAIMER IS NOT GIVEN
//EXCEPTION OR CHECKED: YOU HAVE TO GIVE THE DISCLAIMER BY THROWS KEYWORD
//Difference between throw and throws?
//throw: it actually throw the exception
//throws: throw tell the caller (doSomething() method), hey I can throw this kind of exception