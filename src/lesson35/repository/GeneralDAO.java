package lesson35.repository;

import lesson35.exceptions.BadRequestException;
import lesson35.model.IdEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class GeneralDAO<T extends IdEntity> {

    private String path;

    public GeneralDAO(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public abstract T mapping(String object);

    public abstract String toFile(T object);

    private void generatorId(T t) {
        boolean isTrue = true;
        while (isTrue) {
            long id = (long) (Math.random() * 1000000);
            t.setId(id);

            if (findById(t.getId()) == null)
                isTrue = false;
        }
    }

    public ArrayList<T> getAll() {
        StringBuffer stringBuffer = new StringBuffer();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getPath()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null)
                stringBuffer.append(line).append("\r\n");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return mapAll(stringBuffer);
    }


    private ArrayList<T> mapAll(StringBuffer stringBuffer) {
        ArrayList<T> arrayList = new ArrayList<>();
        String[] objects = Pattern.compile("\r\n").split(stringBuffer);

        for (String str : objects) {

            arrayList.add(mapping(str));
        }
        return arrayList;
    }

    public T findById(long id) {
        ArrayList<T> arrayList = getAll();

        if (arrayList.size() == 0)
            return null;

        for (T t : arrayList) {
            if (t.getId() == id)
                return t;
        }
        return null;
    }

    public T find(T t) {
        for (T object : getAll()) {
            if (object != null && object.equals(t)) {
                return object;
            }
        }
        return null;
    }

    public void remove(T t) throws Exception {
        if (!isExistObject(t))
            throw new BadRequestException("Do not have the object");

        ArrayList<T> arrayList = getAll();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getPath(), false))) {
            int count = 1;
            for (T object : arrayList) {
                if (!object.equals(t)) {
                    bufferedWriter.append(toFile(object));

                    if (arrayList.size() != count)
                        bufferedWriter.newLine();
                }
                count++;
            }
        } catch (Exception e) {
            System.out.println("Object with ID " +  t.getId() + " wasn't deleted");
        }

    }

    public boolean isExistObject(T t) {
        if (getAll().size() == 0)
            return false;

        for (T object : getAll()) {
            if (object != null && object.equals(t))
                return true;
        }
        return false;
    }

    public T save(T t) throws Exception {

        generatorId(t);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getPath(), true))) {

            File file = new File(path);

            if (file.length() != 0)
                bufferedWriter.newLine();

            bufferedWriter.append(toFile(t));

        } catch (IOException e) {
            System.err.println("Object with ID " + " wasn't saved");
        }
        return t;
    }
}
