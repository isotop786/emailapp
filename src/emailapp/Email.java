package emailapp;
import java.util.*;
import java.io.*;

public class Email {
    public Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String dept;
    private String email;
    private String password;
    private String alter_email;
    private int mailCapacity =500;

    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
