package Exception;

public class Client {
    //RUNTIME EXCEPTION OR UNCHECKED: DISCLAIMER IS NOT GIVEN
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.doSomething();
//    }

    public static void main(String[] args) throws ClassNotFoundException, EvenNumberException {
        Student s = new Student();

        //giving error, unhandled exception
        //two options whether handle it of main also has to throw it further
        //s.doSomething(10);

        //main class throwing is further by throws ClassNotFoundException
        s.doSomething(10);

        try {
            s.doSomething(20);
        }
        //if I'll do this all the exception will come here
        //below specific catch block will not be executed, throwing errors
        //more specific errors come first and at the last this can come to handle all kind of exceptions
//        catch (Exception ex)
//        {
//
//        }

        catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());

            //might throw exception
            throw new ClassNotFoundException();
        } catch (EvenNumberException ex) {
            System.out.println(ex.getMessage());
        }
        //if any kind of Runtime exception comes it will be catch here
        catch (RuntimeException e) {
            System.out.println("This is a runtime exception");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
