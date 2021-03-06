package ru.mipt.java2016.homework.g594.borodin.task3;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import ru.mipt.java2016.homework.g594.borodin.task3.SerializationStrategies.SerializationStrategy;
import ru.mipt.java2016.homework.tests.task2.StudentKey;

/**
 * Created by Maxim on 10/31/2016.
 */
public class StudentKeySerialization implements SerializationStrategy<StudentKey> {

    @Override
    public void serialize(StudentKey value, DataOutput dataOutputStream) throws IOException {
        dataOutputStream.writeInt(value.getGroupId());
        dataOutputStream.writeUTF(value.getName());
    }

    @Override
    public StudentKey deserialize(DataInput dataInputStream) throws IOException {
        int groupID = dataInputStream.readInt();
        String name = dataInputStream.readUTF();
        return new StudentKey(groupID, name);
    }
}
