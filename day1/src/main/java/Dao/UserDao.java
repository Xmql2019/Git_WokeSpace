package Dao;

public interface UserDao  {
    public void save();
    public void update(Object O);
    public void delete(Integer integer);
    public void findAll(Object O);
    public void findById(Integer integer);
}
