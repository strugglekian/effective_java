package com.learning.effective_java.twelve;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 自定义序列化。
 * <p>详见87条</p>
 *
 * @author kian
 * @date 2019/6/24
 */
public class Name implements Serializable {


    private static final long serialVersionUID = 3389733964387106657L;
    private String firstName;
    private String middleName;
    private String lastName;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

}
