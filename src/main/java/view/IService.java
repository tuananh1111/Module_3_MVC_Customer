package view;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    void save(T customer);
    T findById(int id);
    void update(int id, T customer);
    void remove(int id);
    boolean checkId(int id);
}
