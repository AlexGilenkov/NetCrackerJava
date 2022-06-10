package com.netcracker.serialization;

import com.netcracker.figures.Circle;

import java.io.*;
import java.util.Date;

public class SerializationDemo {
    public static void main(String[] args) {
        writeObjects();

        readObjects();

    }

    static void writeObjects(){

        try (ObjectOutputStream out = new ObjectOutputStream
                (new BufferedOutputStream
                (new FileOutputStream("object.ser"))))
        {
            out.writeObject("The current Date and Time is ");
            out.writeObject(new Date());
            out.writeObject(new Circle(25.5, "green"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readObjects() {
        try(ObjectInputStream in =
                    new ObjectInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("object.ser")))) {
            String str = (String) in.readObject();
            Date d = (Date) in.readObject();
            Circle circle = (Circle) in.readObject();

            System.out.println(str);
            System.out.println(d);
            System.out.println(circle);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
